package Phone;

public interface Ringable {
   public default String ring(){
       return "Bzzz";
   }
    public default String unlock(){
        return "Password";
    }
}
