package animals;

/** @author sak5680 */

public class Animal implements Speakable {
    protected String kind;
    
    public Animal() {
    }
    
    public String speak() {
        return "";
    }
    
    public String toString() {
        return "I am a " + kind + " and I go " + speak();
    }
}
