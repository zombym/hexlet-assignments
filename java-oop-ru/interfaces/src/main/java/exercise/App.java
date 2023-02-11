package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App{
    public static List<String> buildApartmentsList(List<Home> homeList, int n){
        if(homeList.isEmpty()) {return new ArrayList<>();};
        Collections.sort(homeList, Comparator.comparing(Home::getArea));
        ArrayList<String> homes = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            homes.add(homeList.get(i).toString());
        }
        return homes;
    }
}
// END
