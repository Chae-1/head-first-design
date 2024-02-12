팩토리 패턴
==
```java
Duck duck = new MallardDuck();
```
- OCP 원칙에 의하면 코드는 변경에 닫혀있고, 확장에는 열려있어야한다는 원칙이다.
- 하지만, 다음 코드는 구상 클래스에 의존하는 결과를 가져온다.
- 사용과 생성을 분리해야 OCP 원칙을 지킬 수 있다.

```java
public class PizzaStore {
    
    public Pizza pizza(String type) {
        Pizza pizza = null;
        
        // 구상 클래스를 선택하는 부분이 변경
        if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

```
- 해당 코드는 type을 입력 받아 pizza를 생성하고, 사용하는 코드이다.
- 만약 피자의 타입이 변경되면 해당 코드의 변경이 일어난다.
- 이때, 바뀌는 생성 부분을 캡슐화 해서 OCP 원칙을 지킬 수 있다.

```java
import factory.v1.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza pizza(String type) {
        Pizza pizza = factory.makePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
```
- 이제 pizza를 생성하는 역할은 SimplePizzaFactory 에서 담당한다.
- 바뀌는 부분을 캡슐화해서 사용코드만 남아있다.
- 객체 생성을 담당하는 클래스를 팩토리라고 부른다.

만약, 변경 사항이 다음과 같다고 가정하자.
- 피자마다 조리, 포장, 자르는 방법이 다르다.

이렇게 되면 조리하는 PizzaStore에서 이미 어떤 스타일의 Pizza를 만들 것인지 결정해야한다.

```java
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = makePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    public abstract Pizza makePizza(String type);
}

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza makePizza(String type) {
        Pizza pizza = null;
        if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza makePizza(String type) {
        Pizza pizza = null;
        if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}

```
- 제품을 생산하는 PizzaStore는 Creator 클래스, 제품은 Product 클래스라고 한다.
- PizzaStore 에서 피자를 생성하는 부분을 추상 메서드로 만들면 하위 클래스에서 이를 결정하게 된다.
- 팩토리 객체 대신 PizzaStore의 구현체에서 생성을 결정한다.
- 이로써, 피자 스타일의 다형성을 구현할 수 있다.

이렇게 객체를 생성할 때 필요한 인터페이스를 만들고 서브클래스에서 이를 결정하는 패턴을 **팩토리 메서드 패턴**이라고 한다.

만약 팩토리 메서드 패턴을 사용하지 않았다면 클라이언트 코드는 다음과 같았을 것이다.
```java
public class PizzaStore {

    public Pizza orderPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("ny")) {
            if (type.equals("cheese")) {
                pizza = new NYCheesePizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYPepperoniPizza();
            }
        } else if (style.equals("chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoCheesePizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoPepperoniPizza();
            }
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
```
다음과 같이 수많은 클래스에 의존적이었을 것이다.
- Pizza 클래스의 구현이 변경되면 PizzaStore 까지 변경해야할 수 있다.
- 구체적인 피자 클래스 전체에 의존하게 된다.

그래서 DIP(Dependency Inversion Principle) 라는 디자인 원칙이 등장한다.
- 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.


팩토리 메서드 패턴외 다른 디자인 패턴으로 DIP를 지킬 수 있다.

지역마다 생산되는 재료들이 각각 다르다고 가정하고 피자에 들어가는 재료를 관리하는 예제를 만들어보자.

```java
public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
}


public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

    public abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    void cut() {
        System.out.println("사선으로 자르기");
    }

    void box() {
        System.out.println("피자를 상자에 담기");
    }

}

public class NYBasicPizza extends Pizza {
    PizzaIngredientFactory factory;

    public NYBasicPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
    }
}


public class ChicagoBasicPizza extends Pizza {

    private PizzaIngredientFactory factory;
    
    public ChicagoBasicPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
    }
}

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza makePizza(String type) {
        PizzaIngredientFactory factory = new ChicagoIngredientFactory();
        Pizza pizza = new BasicPizza(factory);
        return pizza;
    }
}


```
- 피자를 생산하는데 필요한 제품군을 생산하는 인터페이스를 생성했다.
- 피자는 도우, 치즈, 소스로 구성돼있고 하위 클래스에서 결정된다.
- 지역마다 제품 구현체가 다르기 때문에, 이를 캡슐화해야한다.
- BasicPizza는 치즈, 도우, 소스만 들어가고 제품 구현체만 다르다.
- 그렇기 때문에, NYBasicPizza, ChicagoBasicPizza를 나눌 필요 없이 BasicPizza로 통일시킬 수 있다.

```java
public class BasicPizza extends Pizza {
    PizzaIngredientFactory factory;

    public BasicPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
    }
}
```

구상 클래스에 의존하지 않고 일련 제품군을 생산하는 인터페이스를 제공하는 패턴을 **추상 팩토리 패턴**이라 한다.
