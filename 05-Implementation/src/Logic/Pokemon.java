package Logic;

import javax.xml.namespace.QName;

public class Pokemon {

    private String name;
    private String type;

    public Pokemon (){
    this.name = "";
    this.type = "";
    }

    public Pokemon (String name, String type){}

    public static void initializeDasherDex() {}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getType() {return type;}

    public void setType(String type) {
        
        this.type = type;
    }
}
