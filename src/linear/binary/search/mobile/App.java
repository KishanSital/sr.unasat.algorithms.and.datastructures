package linear.binary.search.mobile;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        int[] dataSet = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        MobilePhone[] mobileDataSet = new MobilePhone[5];
        mobileDataSet[0] = new MobilePhone("Samsung", "000");
        mobileDataSet[1] = new MobilePhone("Apple", "111");
        mobileDataSet[2] = new MobilePhone("Huawei", "222");
        mobileDataSet[3] = new MobilePhone("Samsung", "333");
        mobileDataSet[4] = new MobilePhone("Xiaomi", "444");

        // String[] data = {"10","20","30","40","50","60","70","80","90","100"};

     /*   int termFoundAtIndex = SearchService.linearSearch(-2, dataSet);

        if (termFoundAtIndex >= 0) {
            System.out.println("De index waar de zoekterm voorkomt is " + termFoundAtIndex);
        } else {
            System.out.println("De zoekterm komt niet voor in de dataset");
        }*/


        //System.out.println(SearchService.binarySearchIterative(dataSet, 20));

        //int linearSearchedPhone = SearchService.linearSearchMobile(mobileDataSet, "Samsung", "000");
        //System.out.println((linearSearchedPhone == -1) ? "not found": "Mobile phone found at " + linearSearchedPhone);

        //System.out.println(SearchService.linearSearchObject( new MobilePhone("Samsung", "333"), mobileDataSet));

        // SearchService.BinarySearchStringMain(mobileDataSet,new MobilePhone("Samsung", "000") );

        List<MobilePhone> mobilePhonesList = new ArrayList<>();

        mobilePhonesList.add(new MobilePhone("Samsung", "S7 Edge"));
        mobilePhonesList.add(new MobilePhone("Samsung", "S8"));
        mobilePhonesList.add(new MobilePhone("Samsung", "S8 Edge"));
        mobilePhonesList.add(new MobilePhone("Samsung", "S9"));
        mobilePhonesList.add(new MobilePhone("Samsung", "S9 Edge"));
        mobilePhonesList.add(new MobilePhone("Samsung", "S10"));
        mobilePhonesList.add(new MobilePhone("Samsung", "S10 Edge"));

        MobilePhone[] mobilePhones = mobilePhonesList.toArray(new MobilePhone[0]);

        MobilePhone mobilePhoneSearch = new MobilePhone("Samsung", "S10 Edge");
        System.out.println(SearchService.linearSearchObject(mobilePhoneSearch, mobilePhones));
        System.out.println(SearchService.binarySearchIterativeObject(mobilePhoneSearch, mobilePhones));


        //meneer moet nog met code komen
       // System.out.println(SearchService.binaryMobilePhoneSearch(mobilePhones,mobilePhoneSearch, 0, mobilePhones.length -1));

    }

}
