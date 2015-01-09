/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package instances;

import Generator.generateGirl;
import java.util.ArrayList;

/**
 *
 * @author Fairlyn
 */
public final class Girl {

    ArrayList<Responses> upBeat = new ArrayList<>();
    String mood;
    String name;
    int age;
    String species;
    String faoriteActivities;
    String Wearing;
    String query, response;

    public Girl(String mood, String Name, int Age, String Species, String faoriteActivities, String Wearing) {
        this.mood = mood;
        this.name = Name;
        this.age = Age;
        this.species = Species;
        this.faoriteActivities = faoriteActivities;
        this.Wearing = Wearing;

        GenerateGirl();
    }

    public String getResponse(String query) {
        int i = 0;
        while (upBeat.size() > i) {
            Responses resp = upBeat.get(i);
            if (resp.getQuery() == null ? query == null : resp.getQuery().equals(query)) {
                System.out.println("query is: " +resp.getQuery());
                System.out.println("result: " + resp.getResponses());
                String result = findAndReplace(resp.getResponses());
                return result;
            }
            System.out.println("I:" + i);
            i++;
        }
        return "I can't understand you";
    }

    public ArrayList GenerateGirl() {
        generateGirl girl = new generateGirl();
        upBeat = girl.getUpBeat();
        return upBeat;
    }

    private String findAndReplace(String query) {
        String[] replace = query.split(" ");
        String result = "";
        int i = 0;
        while (replace.length > i) {
            switch (replace[i]) {
                case "$name":
                    result = result + name + " ";
                    break;
                case "$age":
                    result = result + age + " ";
                    break;
                case "$species":
                    result = result + species + " ";
                    break;
                default:
                    result = result + replace[i] + " ";
                    break;
            }

            i++;
        }
        return result;
    }
}
