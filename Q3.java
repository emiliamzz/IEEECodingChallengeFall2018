import java.util.ArrayList;

public class Q3 {
  public boolean special(String A, String B){
    if(A.length() != B.length()){
      return false;
    }
    ArrayList<char[]> a = new ArrayList<char[]>();
    ArrayList<char[]> b = new ArrayList<char[]>();
    for(int i=0; i<A.length(); i++){
      boolean found = false;
      char letter = A.charAt(i);
      for(int j=0; j<a.size(); j++){
        if(letter == a.get(j)[0]){
          int num = (int)a.get(j)[1]++;
          char[] info = {a.get(j)[0], (char)num};
          a.set(j, info);
          found = true;
          break;
        }
      }
      if(!found){
        char[] info = {letter, (char)1};
        a.add(info);
      }
    }
    for(int i=0; i<B.length(); i++){
      boolean found = false;
      char letter = B.charAt(i);
      for(int j=0; j<b.size(); j++){
        if(letter == b.get(j)[0]){
          int num = (int)b.get(j)[1]++;
          char[] info = {b.get(j)[0], (char)num};
          b.set(j, info);
          found = true;
          break;
        }
      }
      if(!found){
        char[] info = {letter, (char)1};
        b.add(info);
      }
    }
    if(a.size() != b.size()){
      return false;
    }
    while(a.size() != 0){
      boolean found = false;
      for(int i=0; i<b.size(); i++){
        if(a.get(0)[1] == b.get(i)[1]){
          found = true;
          a.remove(0);
          b.remove(i);
        }
      }
      if(!found){
        return false;
      }
    }
    return true;
  }
}