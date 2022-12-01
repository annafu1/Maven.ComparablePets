package io.zipcoder;
import java.util.Scanner;

public class Application {
    public void main (String[] args) {
        String petName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = scanner.nextInt();
        scanner.nextLine();
        Pet[] ownerPet = new Pet[numOfPets];
        for (int i = 0; i < numOfPets; i++) {
            System.out.println("What is the pet" + (i + 1) + "type?");
            String petType = scanner.nextLine().toLowerCase();

            switch(petType) {
                case "dog":
                    System.out.println("What is your dog's name?");
                    petName = scanner.nextLine();
                    ownerPet[i] = new Dog(petName);
                    break;
                case "cat":
                    System.out.println("What is your cat's name?");
                    petName = scanner.nextLine();
                    ownerPet[i] = new Cat(petName);
                    break;
                case "rat":
                    System.out.println("What is your rat's name?");
                    petName = scanner.nextLine();
                    ownerPet[i] = new Rat(petName);
                    break;
                default:
                    i--;
                    break;
            }
            for (Pet pet : ownerPet) {
                System.out.println(pet);
            }

        }
    }
}
