import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Pass
{
   private String name;
   private int age;
   private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Pass(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}
public class Object {

    public static void main(String[] args) {

        Map<Pass,Integer> map=new HashMap<>();
        Pass p1 =new Pass("Muskan",21,"SE");
        Pass p2 =new Pass("SOFI",23,"jvm");

        map.put(p1,50000);
        map.put(p2,6000);


        Iterator<Map.Entry<Pass,Integer>> itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Pass, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
