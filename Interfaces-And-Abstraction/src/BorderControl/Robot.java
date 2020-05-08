package BorderControl;

public class Robot implements Identifieable {
    private String Id;
    private String Model;

    @Override
    public String getId() {
        return this.Id;
    }

    public String getModel() {
        return this.Model;
    }
   public Robot(String id, String model){
        this.Id = id;
        this.Model = model;
   }
}
