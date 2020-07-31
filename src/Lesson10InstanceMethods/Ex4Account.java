package Lesson10InstanceMethods;

public class Ex4Account {

    private long balance;
    private String ownerNmae;
    private boolean locked;


    public long getBalance(){
        return balance;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public String getOwnerNmae(){
        return ownerNmae;
    }

    public void setOwnerNmae(String name){

    }

    public boolean isLocked(){
        return locked;
    }
    public void setLocked(boolean locked){
        this.locked = locked;
    }
}
