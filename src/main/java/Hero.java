import java.util.ArrayList;
import java.util.List;

public class Hero{
  private String mName;
  private int mAge;
  private String mWeakness;
  private String mPower;
  private int mId;
  private static List<Hero> instances = new ArrayList<Hero>();
  public Hero(String name, int age, String strength, String weakness){
      mName = name;
      mAge = age;
      mPower = strength;
      mWeakness =weakness ;
      instances.add(this);
      mId = instances.size();
    }
    public String getName(){
      return mName;
    }
    public int getAge(){
      return mAge;
    }
    public String getSpecialPower(){
      return mPower;
    }
    public String getWeakness(){
      return mWeakness;
    }
    public int getId(){
      return mId;
    }
    public static List<Hero> all(){
      return instances;
    }
    public static void clear(){
      instances.clear();
    }
  }
