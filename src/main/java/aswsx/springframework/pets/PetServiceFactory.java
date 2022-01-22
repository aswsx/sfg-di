package aswsx.springframework.pets;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 22/01/2022 - 13:53
 */
public class PetServiceFactory {
    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
