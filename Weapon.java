public class Weapon {
    int payload;
    String name;

    public Weapon (String nameInput){
        name = nameInput;
        System.out.println("Weapon: " +name);
    }

    public void setPayload (int payloadInput){
        payload = payloadInput;
    }

    public int getPayload(){
        System.out.println(name +payload);
        return payload;
    }

    public static void main(String []args){
        Weapon gatlingGun = new Weapon("Gatling Gun");

        gatlingGun.setPayload(50);

        gatlingGun.getPayload();
    }

}