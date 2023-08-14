package main.himash;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Methods {
    public void myPublic() {
    }

    private void myPrivate() {
    }

    class Nested {

        public void nestedPublic() {
            myPrivate();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Methods ob = new Methods();

        Method method = ob.getClass().getDeclaredMethod("myPrivate");
        method.invoke(ob);

    }

}


