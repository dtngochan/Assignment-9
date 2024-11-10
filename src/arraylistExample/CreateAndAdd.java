
package arraylistExample;

import java.util.ArrayList;

public class CreateAndAdd {
    public static void main(String[] args){
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Ngoc Han");
        friends.add("Jung Kook");
        friends.add("Dang Duong");
        friends.add("Minh Hieu");
        friends.add("Duc Duy");
        for(String friend:friends){
            System.out.println(friend);
        }
    }
}
