/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package instances;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fairlyn
 */
@XmlRootElement
public class ResponseHandler {

    private String query;
    private String response;
    private int id;
    private String location;

    public String getQuery() {
        return query;
    }

    @XmlElement
    public void setQuery(String query) {
        this.query = query;
    }

    public String getResponse() {
        return response;
    }

    @XmlElement
    public void setResponse(String response) {
        this.response = response;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    @XmlElement
    public void setLocation(String location) {
        this.location = location;
    }

}
