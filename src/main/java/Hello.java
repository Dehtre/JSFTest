import javax.faces.bean.ManagedBean;

/**
 * Created by Michał on 2014-08-07.
 *
 */

@ManagedBean
public class Hello {
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
