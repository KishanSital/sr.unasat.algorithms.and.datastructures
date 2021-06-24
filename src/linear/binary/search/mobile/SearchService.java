package linear.binary.search.mobile;

public class SearchService {
    //Huiswerk
    //linearySearch(String term, String array) --> return een nette text(String) met de uitkomst
    //binearySearch(term, array)


    //Time Complexity: O(n)
    static int linearSearch(int term, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (term == data[i]) {
                return i; //term found return index
            }
        }
        return -1; //term not found
    }

    static String linearSearchString(String term, String[] data) {
        for (int i = 0; i < data.length; i++) {
            if (term.equals(data[i])) {
                return "De zoekterm " + term + "is gevonden bij index: " + i; //term found return index
            }
        }
        return "De zoekterm komt niet voor in deze dataset"; //term not found
    }


    // iterative
    //Time Complexity: O(log n)
    static int binarySearchIterative(int[] sortedArray, int term) {
        int left = 0; // min index
        int right = sortedArray.length - 1; // max index
        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (sortedArray[mid] == term) { // search term found
                return mid; // return sortedArray index of search term
            } else if (term < sortedArray[mid]) { // search term is smaller than mid point value
                right = mid - 1; // set right bound
            } else {
                left = mid + 1; // set left bound
            }
        }
        return -1;
    }

    // recursive
    //Time Complexity: O(log n)
    static int binarySearchRecursive(int[] array, int term, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + ((right - left) / 2);
        if (array[mid] == term) { // search term found
            return mid; // return array index of search term
        } else if (term < array[mid]) { // search term is smaller than mid point value
            // right bound = mid - 1;
            return binarySearchRecursive(array, term, left, mid - 1); // set right bound
        } else {
            // left bound = mid + 1;
            return binarySearchRecursive(array, term, mid + 1, right); // set left bound
        }
    }

    static int linearSearchMobile(MobilePhone[] mobileDataSet, String brand, String modelNumber) {
        int j;
        for (j = 0; j < mobileDataSet.length; j++) {
            if (mobileDataSet[j].getBrand().equals(brand) &&
                    mobileDataSet[j].getModelNumber().equals(modelNumber))
                break;
        }
        if (j == mobileDataSet.length) {
            return -1;
        } else {
            return j;
        }
    }
//Doe een linear en binary search op basis van de brand and model. de searchterm dient een MobilePhone object te zijn
//uit het object kijken of de brand and modelnumber matchen
    static String linearSearchObject(MobilePhone mobilePhone, MobilePhone[] data) {
        for (int i = 0; i < data.length; i++) {
            if(mobilePhone == null ||
                    mobilePhone.getBrand().trim() == null ||
                    mobilePhone.getModelNumber().trim() == null ||
                    mobilePhone.getBrand().trim().isEmpty()||
                    mobilePhone.getModelNumber().trim().isEmpty()){
                break;
            }
            if (mobilePhone.getBrand().equals(data[i].getBrand()) && mobilePhone.getModelNumber().equals(data[i].getModelNumber())) {
                return "De mobile telefoon " + mobilePhone + "is gevonden bij index: " + i; //term found return index
            }
        }
        return "De zoekterm komt niet voor in deze dataset"; //term not found
    }

    //Doe een linear en binary search op basis van de brand and model. de searchterm dient een MobilePhone object te zijn
//uit het object kijken of de brand and modelnumber matchen
    static String linearSearchObjectHashCode(MobilePhone mobilePhone, MobilePhone[] data) {
        for (int i = 0; i < data.length; i++) {
            if(mobilePhone == null ||
                    mobilePhone.getBrand().trim() == null ||
                    mobilePhone.getModelNumber().trim() == null ||
                    mobilePhone.getBrand().trim().isEmpty()||
                    mobilePhone.getModelNumber().trim().isEmpty()){
                break;
            }
            if (mobilePhone.hashCode() == data[i].hashCode()) {
                return "De mobile telefoon " + mobilePhone + "is gevonden bij index: " + i; //term found return index
            }
        }
        return "De zoekterm komt niet voor in deze dataset"; //term not found
    }



    // iterative
    //Time Complexity: O(log n)
    //for simplicity sake alleen zoeken op modelnumber
    static int binarySearchIterativeObject( MobilePhone mobilePhone, MobilePhone[] sortedArray) {
        int left = 0; // min index
        int right = sortedArray.length - 1; // max index
        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if(mobilePhone == null ||
                    mobilePhone.getBrand().trim() == null ||
                    mobilePhone.getModelNumber().trim() == null ||
                    mobilePhone.getBrand().trim().isEmpty()||
                    mobilePhone.getModelNumber().trim().isEmpty()){
                break;
            }
            if (mobilePhone.getModelNumber().equals(sortedArray[mid].getModelNumber())) {
                return  mid; //term found return index
            } else if (mobilePhone.getModelNumber().compareToIgnoreCase(sortedArray[mid].getModelNumber()) < 0) { // search term is smaller than mid point value
                right = mid - 1; // set right bound
            } else {
                left = mid + 1; // set left bound
            }
        }
        return -1;
    }

    static int binarySearchMobile(MobilePhone[] mobileDataSet, MobilePhone mobilePhone) {
        int startingIndex = 0;
        int endingIndex = mobileDataSet.length - 1;

        while (startingIndex <= endingIndex) {
            int middle = startingIndex + (endingIndex - startingIndex) / 2;

            int res = mobilePhone.compareTo(mobileDataSet[middle]);

            // Check if mobilePhone is present at mid
            if (res == 0) {
                return middle;
            }
            // If mobilePhone greater, ignore left half
            else if (res > 0) {
                startingIndex = middle + 1;
            }
            // If mobilePhone is smaller, ignore right half
            else {
                endingIndex = middle - 1;
            }
        }
        return -1;
    }

    public static void binarySearchMobilePhone( MobilePhone[] mobilePhones, MobilePhone mobilePhone) {
        int result = binarySearchMobile(mobilePhones, mobilePhone);
        if (result == -1)
            System.out.println("phone is not present");
        else
            System.out.println(" phone " + mobilePhone + " is found at "  + " index " + result);
    }

    // code moet nog van meneer komen
/*    public static int binaryMobilePhoneSearch(MobilePhone[] mobilePhones,MobilePhone phoneName, int startingIndex, int phoneArraySize) {
        int endingIndex = phoneArraySize - 1;
        int middle = startingIndex + (endingIndex - startingIndex) / 2;
        if(startingIndex > endingIndex) {
            System.out.println("Can’t find phone ");
            return -1;
        }
        else if(mobilePhones[middle].equals(phoneName)) {
            System.out.println("Found phone " + phoneName.getBrand() + " " + phoneName.getModelNumber() + " at index " + middle);
            System.out.println(mobilePhones[middle].toString());
            return middle;
        }
        else {
            if(mobilePhones[middle].getModelNumber().compareTo(phoneName.getModelNumber()) < 0) {
                ++middle;
                return binaryMobilePhoneSearch(mobilePhones ,phoneName, middle, endingIndex);
            }
            else {
                --middle;
                return binaryMobilePhoneSearch(mobilePhones ,phoneName, middle, endingIndex );
            }
        }
    }*/
    
}
