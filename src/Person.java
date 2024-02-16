 class Person {
    private String Smart;
    private String Flexible;
    private String Extrovert;



    public void setSmart(String Smart){
        this.Smart = Smart;

    }
    public String getSmart(){
        return Smart;
    }
    public void setFlexible(String Flexible){
        this.Flexible = Flexible;
    }
    public String getFlexible(){
        return Flexible;
    }
    public void setExtrovert(String Extrovert) {
        this.Extrovert = Extrovert;
    }
    public String getExtrovert(){
        return Extrovert;
    }
}
class Cow{
     String name;
     String color;
     int age;

     public Cow(String name,String color,int age){
         this.name = name;
         this.color = color;
         this.age = age;

     }

}
class Bear{
    String color;
    int height;
    int age;

    public Bear(String color, int height, int age){
        this.color =color;
        this.height = height;
        this.age = age;
    }
}
class Telephone{
    String modal;
    String color;
    int price;
    public Telephone(String modal,String color, int price){
        this.modal = modal;
        this.color = color;
        this.price = price;
    }
}
