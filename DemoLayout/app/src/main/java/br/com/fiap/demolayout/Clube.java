package br.com.fiap.demolayout;

/**
 * Created by Felipe on 8/16/2015.
 */
public class Clube {

    Integer img;
    String name;

    public Clube(String name, Integer img) {
        this.img = img;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return img;
    }

    public void setImage(Integer image) {
        img = image;
    }


}
