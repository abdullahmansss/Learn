package abdullah.mansour.learn.Models;

public class NumberModel
{
    String number_e,number_a;
    int number_image,number_sound;

    public NumberModel() {
    }

    public NumberModel(String number_e, String number_a, int number_image, int number_sound) {
        this.number_e = number_e;
        this.number_a = number_a;
        this.number_image = number_image;
        this.number_sound = number_sound;
    }

    public String getNumber_e() {
        return number_e;
    }

    public void setNumber_e(String number_e) {
        this.number_e = number_e;
    }

    public String getNumber_a() {
        return number_a;
    }

    public void setNumber_a(String number_a) {
        this.number_a = number_a;
    }

    public int getNumber_image() {
        return number_image;
    }

    public void setNumber_image(int number_image) {
        this.number_image = number_image;
    }

    public int getNumber_sound() {
        return number_sound;
    }

    public void setNumber_sound(int number_sound) {
        this.number_sound = number_sound;
    }
}
