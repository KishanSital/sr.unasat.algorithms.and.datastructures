package linear.binary.search.recursion;

import linear.binary.search.mobile.SearchService;

public class App {

    public static void main(String[] args) {

        Recursion recursion = new Recursion();

        recursion.tafelVan10(10);
        recursion.tafelVanX(0,10);

        recursion.tafelBerekeningRecursive(10,0,10);

    }
}
