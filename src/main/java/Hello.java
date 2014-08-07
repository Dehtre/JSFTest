import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import java.io.Serializable;

/**
 * Created by Michał on 2014-08-07.
 *
 */

@Named("hello")
@SessionScoped
public class Hello implements Serializable{
    final String hw = "Hello world!";
    private String name, something;
    private Boolean postclick = false;

    public String getHw() {
        return hw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public Boolean getPostclick() {
        return postclick;
    }

    public void setPostclick(Boolean postclick) {
        this.postclick = postclick;
    }

    public String getResultString() {
        return name + " wrote " + something;
    }

    public String process() {
        return "result";
    }

    public void reset() {
        name = "";
        something = "";
        postclick = false;
    }
}
