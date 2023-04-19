import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum BlackList {
   TERRORISTS(Arrays.asList("Saddam Husein","Ben Laden","Fidel Castro")),
   EXTREMISTS(Arrays.asList("Teodor Smith","Adam Walker","Sam Wilson")),
   MONEY_LAUNDERER(Arrays.asList("Tomas Shelby","John Wick","David Copperfield"));

   private List<String> List;
   BlackList(List<String> list) {
      this.List = list;
   }
   public List<String> getList() {
      return List;
   }
}
