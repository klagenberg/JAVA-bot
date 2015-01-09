/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;

import instances.Girl;
import instances.User;

/**
 *
 * @author Fairlyn
 */
public class Controller {
    
    String mood = "happy", name = "WildFire", species  = "ninetailed fox", favoriteActivities  = "eating and showing off", Wearing  = "bra and panties";
    int age = 42;
    Girl girl = new Girl(mood, name, age, species, favoriteActivities, Wearing);
    User user = new User();
    
    public String getResponse(String query){
        return girl.getResponse(query);
    }
}
