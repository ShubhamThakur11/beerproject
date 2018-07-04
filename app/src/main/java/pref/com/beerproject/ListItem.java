package pref.com.beerproject;

/**
 * Created by kumar on 7/31/2018.
 */

public class ListItem {

    String name;
    String style;
    String id;

    public ListItem(String name, String style, String id) {
        this.name = name;
        this.style = style;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getId() {
        return id;
    }
}
