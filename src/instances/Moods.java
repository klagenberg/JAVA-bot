/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instances;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Fairlyn
 */
public class Moods {

    @XmlElement(name = "responses")
    private List<ResponseHandler> resp = null;

    public List<ResponseHandler> getResponseHandler() {
        return resp;
    }

    public void setresponseHandler(List<ResponseHandler> resp) {
        this.resp = resp;
    }
}
