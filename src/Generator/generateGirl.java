/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Generator;

import instances.ResponseHandler;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Fairlyn
 */
public class generateGirl {

    Boolean generateFromXml = true;
    String query, response;

    public generateGirl() throws JAXBException{
        if (generateFromXml) {
            ReadFromXML load = new ReadFromXML();
            load.loadXML();
        } else {
            generateFromClass();
        }
    }

    private void generateFromClass() {
        /*System.out.println("generating from class");
         int i = 1;

         query = "hey";
         response = "hey";
         Responses respUpbeat = new Responses(query, response, i);
         i++;
         upBeat.add(respUpbeat);

         query = "hello";
         response = "\"hello there, you come here often?\"";
         respUpbeat = new Responses(query, response, i);
         i++;
         upBeat.add(respUpbeat);

         query = "how are you?";
         response = "\"I'm doing good, you? \" before smiling over at you softly.";
         respUpbeat = new Responses(query, response, i);
         i++;
         upBeat.add(respUpbeat);

         query = "who are you?";
         response = " She sits up and smiles over at you curiosuly, \"well, I am $name, and IO am glad you decided to join me.";
         respUpbeat = new Responses(query, response, i);
         i++;
         upBeat.add(respUpbeat);

         query = "you hungry?";
         response = "She smiles and shakes her head before her belly starts growling, and she smiles over at you shyly, \"uhh.. I think I coudl use a bit to eat.. You were volunteering?\"";
         respUpbeat = new Responses(query, response, i);
         i++;
         upBeat.add(respUpbeat);

         query = "eat me";
         response = "She nods and smiles at you before reaching out and pulling you in tighter and starts licking your head happily, her mouth open and giving you a very good look at her sharp teeth and healthy pink throat."
         + "And then she gets in closer and start sliding a hand up along your neck and gently guiding you in tighter, her mouth open and your head sliding over her tongue and into her baw as she starts pulling you into her mouth.";
         respUpbeat = new Responses(query, response, i);
         i++;
         upBeat.add(respUpbeat);*/
    }
}
