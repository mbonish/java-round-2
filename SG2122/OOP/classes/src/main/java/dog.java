public class dog {

// Everytime we create a new class in java we are defining a new type
    //There are two types of data in java : native type and user defined types
        /*
        types(classes) in Java simply consist of fields or properties and behaviors or methods
        fields and behaviors are sometimes referred to as members
         */

    private String name;
    private double weight;

    public String getName() {
        return name;
    }
    public void setName(String name){
         this.name = name;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(Double weight){
        this.weight = weight;
    }
    public void bark(){
        System.out.println("WOOF");
    }
    public void sit(){
        System.out.println("Sitting...");
    }

    /* a class is a definition--like a blueprint of a house. D
    A blueprint shows you how to build a house---but you can't live
    in a blueprint

    You must instantiate an object, based on the definition
    contained in the class--before you can use it

    class is an idea and the object is the instantation of that idea
     */


    /* Properties, accessors and Mutators
    
     */
}



