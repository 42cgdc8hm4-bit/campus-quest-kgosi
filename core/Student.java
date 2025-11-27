package core;

public class Student {
    private String name;
    private int energy = 100;
    private int knowledge = 0;

    public Student(String name) {
        this.name = name;
    }

    // TODO: add method decreaseEnergy(int amount)
    // TODO: add method increaseEnergy(int amount)
    // TODO: add method increaseKnowledge(int amount)
    // TODO: add method getKnowledge(int amount)

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void decreaseEnergy(int amount){
        energy = energy - amount ;
        if(energy <= 0){
            energy = 0;
            System.out.println("dead");
        }
        else{
            energy = energy - amount;
        }
    }
    
    public void increaseEnergy(int amount){
        energy = energy + amount ;
        if(energy > 100){
            energy = 100;
            System.out.println("it cant be more than 100");
        }
        else{
            energy = energy + amount;
        }
    }

    public void increaseKnowledge(int amount){
        knowledge = knowledge + amount;
        
    }

    public int getKnowledge(){
        return knowledge;
    }
}
