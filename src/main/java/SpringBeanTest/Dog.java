package SpringBeanTest;

public class Dog implements CanGreet, IsAnimal {

    private String name = "Pies" ;
    private int age =0;

    public void sayHello (IsAnimal name){
        System.out.println("Hello "+name.getName()+" I'm dog  ");

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    /**
     * jakas tam zmiana testowa
     */
}



