package ch02;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame jFrame;
    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        jFrame = new JFrame();

        JButton jButton = new JButton();
        jButton.addActionListener((event) -> System.out.println("하지마 후회 할걸?"));
        jButton.addActionListener((event) -> System.out.println("저질러 버려"));

    }
}
