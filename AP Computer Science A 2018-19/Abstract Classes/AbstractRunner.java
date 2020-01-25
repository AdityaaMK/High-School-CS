public class AbstractRunner{
    public static void main(String[]args){
    Animal a = new Dog();
    Dog b = new Poodle();
    Poodle c = new Poodle();
        
    a.speak();
    b.speak();
    c.speak();
    }
}