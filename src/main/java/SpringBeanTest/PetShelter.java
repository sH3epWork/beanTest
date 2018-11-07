package SpringBeanTest;

import java.util.ArrayList;
import java.util.List;

public class PetShelter implements KeepAnimals {

    private List<IsAnimal> names = new ArrayList<>();


    @Override
    public List<IsAnimal> getNames() {
        return names;
    }

    @Override
    public void printNames() {
        for(IsAnimal item:names){
            System.out.println(item.getName());
        }
    }
}
