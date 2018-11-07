package SpringBeanTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        for (int i=0;i<2;i++){
            NewThread thread = new NewThread(i);
            thread.start();
        }



    }
}
