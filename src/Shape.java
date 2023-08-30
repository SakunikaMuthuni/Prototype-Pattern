public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void Draw();
    public String getType(){
        return type;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public Object clone(){
        Object cl=null;
        try{
            cl=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cl;
    }
}
