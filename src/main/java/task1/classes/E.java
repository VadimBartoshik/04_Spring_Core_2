package task1.classes;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class E  implements MethodReplacer {

    public void say(){
        System.out.println("Method say()");
    }
    public void work(){
        System.out.println("Method work()");
    }

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Method Replacement say()");
        return o;
    }
}
