package collections.map;

import collections.Skill;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithObj {
    public static void main(String[] args) {

        Map skills = new HashMap();

        Skill java = new Skill(1,"java",true);
        Skill nodeJs = new Skill(1,"nodeJs",true);
        Skill js = new Skill(1,"js",true);

        skills.put(java.getId(),java.getSkills());
        skills.put(nodeJs.getId(),nodeJs.getSkills());
        skills.put(js.getId(),js.getSkills());


    }

}
