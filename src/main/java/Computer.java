import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Computer {

    private String _name;

    public Computer(String name){
        this._name = name;
    }

    @PostConstruct
    public void turnOn(){
        System.out.println(this._name + ": Load operating system");
    }

    @PreDestroy
    public void turnOff(){
        System.out.println(this._name + ": Close all programs");
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }
}