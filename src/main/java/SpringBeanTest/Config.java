package SpringBeanTest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {



    @Bean
    public IsAnimal animalName (){
        Dog dog = new Dog();
        dog.setName("Burek");
        return dog;
    }



    @Bean(name = "dogShelter")
    public KeepAnimals names (IsAnimal animalName){
        PetShelter shelter = new PetShelter();
        shelter.getNames().add(animalName);
        return shelter;
    }
}
