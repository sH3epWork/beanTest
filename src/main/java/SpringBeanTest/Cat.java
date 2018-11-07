package SpringBeanTest;

public class Cat implements IsAnimal,CanGreet{
    private String name ;
    private int age =0;

    public void sayHello (){
        System.out.println("Hello I'm dog");

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sayHello(IsAnimal name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }
}

