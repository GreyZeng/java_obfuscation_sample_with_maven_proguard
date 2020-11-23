package com.git.common;

import com.git.callback.XiaoMing;
import com.git.enu.Color;
import com.git.inner.School;
import com.git.reflection.ReflectTest;
import com.git.spi.Animal;

import java.util.ServiceLoader;

public class Application {

    private static final Object private_static = "private_static";

    static final Object _static = "_static";

    protected static final Object protected_static = "protected_static";

    public static final Object public_static = "public_static";

    private static void private_static() {
        System.out.println("private_static: " + private_static);
    }

    static void _static() {
        System.out.println("_static: " + _static);
    }

    protected static void protected_static() {
        System.out.println("protected_static: " + protected_static);
    }

    public static void public_static() {
        System.out.println("public_static: " + public_static);
    }

    public static void main(final String[] args) throws Throwable {
        private_static();
        _static();
        protected_static();
        public_static();
        final Application application = new Application();
        application.public_instance();
        application._instance();
        application.protected_instance();
        application.public_instance();
        //generateOpt(2);
        Terminal.terminal(generateOpt(Integer.valueOf(args[0])));
        Terminal.terminal(generateOpt(Integer.valueOf(args[0])));
        Terminal.terminal(generateOpt(Integer.valueOf(args[0])));
        try {
            ReflectTest.initByDefaultConst();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        // 内部类
        School school = new School();
        school.echo();
        // 枚举
        if (Math.random() < 0.5) {
            Color color = Color.BLUE;
            printColor(color);
            Color.getNameByValue(1);
        } else {
            Color color = Color.RED;
            printColor(color);
            Color.getValueByName("red");
        }


        XiaoMing xm = new XiaoMing();
        xm.eatFood();


        System.out.println("Hello World!");
        ServiceLoader<Animal> serviceLoader = ServiceLoader.load(Animal.class);
        for (Animal animal : serviceLoader) {
            animal.eat();
        }

    }

    private static void printColor(Color color) {
        System.out.println(color.getName());
    }

    public static int generateOpt(int size) {
        return ((int) (Math.random() * size) + 1);
    }

    public void public_instance() {
        System.out.println(public_instance);
    }

    protected void protected_instance() {
        System.out.println(protected_instance);
    }

    void _instance() {
        System.out.println(_instance);
    }

    private void private_instance() {
        System.out.println(private_instance);
    }

    private Object private_instance = null;

    Object _instance = null;

    protected Object protected_instance = null;

    public Object public_instance = null;
}
