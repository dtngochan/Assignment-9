
package arraylistExample;

import java.util.ArrayList;

public class TraverseTheArrayList {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("Tam Ky");
        cities.add("Ho Chi Minh");
        cities.add("Hue");
        cities.add("Quy Nhon");
        for(String city:cities){
            System.out.println(city);
        }
    }
}
