package hero;

public class Hero {
    private String Username;
    private int Level;

    public String getUsername(){
        return this.Username;
    }
    public int getLevel(){
        return this.Level;
    }
    public Hero(String username, int lvl){
        this.Username = username;
        this.Level = lvl;
    }
    public String toString(){
        String className = this.getClass().getName().substring(5);
        return String.format("Type: %s\nUsername: %s\nLevel: %s\n",className,this.getUsername(),this.getLevel());
    }
}
