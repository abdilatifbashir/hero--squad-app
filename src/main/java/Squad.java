import java.util.ArrayList;
import java.util.List;

public class Squad{
  private int mMaxSize;
  private String mName;
  private String mCause;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeros;


  public Squad(int Maxsize, String Name, String Cause){
     mMaxSize = Maxsize;
     mName = Name;
     mCause = Cause;
     instances.add(this);
     mId = instances.size();
     mHeros = new ArrayList<Hero>();
  }

  public int getMaxSize(){
    return mMaxSize;
  }
  public String getName(){
    return mName;
  }
  public String getCause(){
    return mCause;
  }
  public int getId(){
    return mId;
  }
  public static List<Squad> all(){
    return instances;
  }
  public static void clear(){
    instances.clear();
  }
  public void addHero(Hero hero){
    mHeros.add(hero);
  }
  public List<Hero> getHeros() {
   return mHeros;
 }
 public static Squad find(int id) {
   return instances.get(id - 1);
  }

}
