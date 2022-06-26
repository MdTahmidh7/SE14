package DP_Presentaion.DuplicateCode;

import java.util.ArrayList;

public class Duplicate {
    ArrayList arrayList;
    public void addItem() {
        //Create a list
        arrayList = new ArrayList();
        // adding item to the list
        arrayList.add(1);
        arrayList.add(2);
        saveToDatabase();
    }
    public void updateItem() {
        //search a list
        // update item of that list
        arrayList.set(0, 2);
        arrayList.set(1, 3);
        saveToDatabase();
    }

    private void saveToDatabase() {
        /*
        create connection to database
        save to database
        release connection
        */
    }
}
