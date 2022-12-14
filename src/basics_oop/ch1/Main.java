package basics_oop.ch1;

import basics_oop.ch1.BoxingMatch;
import basics_oop.ch1.Fighter;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter1", 100, 20);
        Fighter f2 = new Fighter("Fighter2", 100, 20);
        BoxingMatch bm = new BoxingMatch(f1, f2);
        System.out.println(bm.fight());
    }
}