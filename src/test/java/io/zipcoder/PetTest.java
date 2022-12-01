package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test

    public void compareToTest() {
        //given
        Cat cat = new Cat("Cheesey");
        Dog dog = new Dog("Lucky");
        //then
        Assert.assertTrue(cat.compareTo(dog) < 0);
    }

    @Test
    public void sortPetByTypeNameTest() {
        //given
        Cat cat = new Cat ("Cheesey");
        Dog dog = new Dog ("Lucky");
        Rat rat = new Rat ("Jerry");
        Pet[] myPetList = new Pet[] {cat, dog, rat};
        Pet[] expectedList = new Pet[]{dog, rat, cat};
        //when
        Pet[] actualList = Pet.sortPetByTypeName(myPetList);
        //then
        Assert.assertEquals(expectedList,actualList);
    }

}
