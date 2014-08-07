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

    public String process() {
        return "result";
    }
}
