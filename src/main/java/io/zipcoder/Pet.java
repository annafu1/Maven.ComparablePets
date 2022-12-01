package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Pet implements Comparable<Pet> {
    String name;

    public Pet (String name) {
        this.name = name;
    }

    public static Pet[] sortPetByTypeName(Pet[] myPetList) {
        Comparator<Pet> bySub = (o1, o2) -> {
            int compare = o1.getClass().getName().compareTo(o2.getClass().getName());
            if (compare == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return compare;
        };
        List<Pet> petList = new ArrayList<>(Arrays.asList(myPetList));
        petList.sort(bySub);
        return petList.toArray(new Pet[0]);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String speak() {
        return "speak";
    }

    public int compareTo(Pet o) {
        int compare = this.getName().compareTo(o.getName());
        if (compare == 0) {
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
        return compare;
    }
}
