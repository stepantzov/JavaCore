package training.collections.compare;

import java.util.Scanner;

/**
 * Created by Ivan_Stepantsov on 8/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements to add into collection:");
        Scanner elementsQuantityScanner = new Scanner(System.in);
        int elementsQuantity = elementsQuantityScanner.nextInt();
        int elementsArray[] = new int[elementsQuantity];
        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = (int) Math.round((Math.random() * 100));
        }
        System.out.println("Map structure: \n" + HashMapFill.doHashMapFill(elementsArray));
        System.out.println("Collection structure: \n" + BasicCollectionFill.doBasicCollectionCreation(elementsArray));
        MidElementFinding.getBasicCollectionsMidElement(BasicCollectionFill.doBasicCollectionCreation(elementsArray));
        MidElementFinding.getArrayListMidElement(ArrayListFill.doArrayListFill(elementsArray));
        MidElementFinding.getLinkedListMidElement(LinkedListFill.doLinkedListFill(elementsArray));
        MidElementFinding.getHashMapMidElement(HashMapFill.doHashMapFill(elementsArray));
    }
}