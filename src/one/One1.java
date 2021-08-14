package one;


import model.Hero;

import java.util.ArrayList;
import java.util.List;

public class One1 {
    public static void main(String[] args) {

    }

    public List<Hero> setHeroValue(List<Hero> list, Hero heroValue) {
        list.add(heroValue);
        return list;
    }

    public void work() {
        List<Hero> heroList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Hero hero = new Hero();
            hero.setName("hero" + i);
            hero.setHp(643 + i);
            hero.setMp(421 + i);
            heroList = this.setHeroValue(heroList, hero);
        }
        int i=1;
        i=2;
        String s= "";
        for (Hero hero1 : heroList) {
             s+=hero1.getName();
        }
    }
}
