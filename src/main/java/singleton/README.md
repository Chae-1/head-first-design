싱글턴 패턴
==
싱글턴 패턴은 어플리케이션 전역에 단 하나의 객체만 존재하는 것을 보장해주는 패턴이다.

```java
public class Singleton {
    private static Singleton singleton;
    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton != null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

```
- private 생성자를 통해 외부에서 객체를 생성할 수 없게 만든다.
- getter를 통해 인스턴스에 접근할 수 있도록 해준다.

하지만 위 코드는 멀티쓰레드 환경에서 두 개이상의 인스턴스가 생성 될 수있다.

```java
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton != null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}

```
- 위와 같이 클래스 변수 선언과 동시에 초기화를 해주거나
- DCL을 사용한다.

