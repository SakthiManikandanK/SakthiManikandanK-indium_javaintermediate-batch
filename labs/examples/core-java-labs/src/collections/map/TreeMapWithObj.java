package collections.map;

import collections.Skill;

import java.util.*;

public class TreeMapWithObj {
    public static void main(String[] args) {
        Map skills = new TreeMap<>();

        Skill java = new Skill(1,"java",true);
        Skill spring = new Skill(2,"spring",true);
        Skill nodeJs = new Skill(3,"nodeJs",true);
        Skill reactJs = new Skill(4,"reactJs",false);

        skills.put(java.getSkills(),java.getId());
        skills.put(reactJs.getSkills(),reactJs.getId());
        skills.put(spring.getSkills(),spring.getId());
        skills.put(nodeJs.getSkills(),nodeJs.getId());

        Set entries =skills.entrySet();

        for (Object entry: entries)
              {
                  System.out.println(entry);
        }

        }

    }



