package SpringBeanTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewThread extends Thread{

    private int threadNumber;
    public NewThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()

    {
        if (threadNumber == 1){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Watek numer: "+threadNumber);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        KeepAnimals shelter = (KeepAnimals)context.getBean(PetShelter.class);
        shelter.printNames();
        if(threadNumber==0){
            shelter.getNames().add(new Dog());
        }

        shelter.printNames();
        KeepAnimals shelter2 = (KeepAnimals)context.getBean("dogShelter");
        System.out.println("Shelter2");
        shelter2.printNames();

    }

}
