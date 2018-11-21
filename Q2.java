public class Q2 {
  public int songPairs(int A[]){
    int out = 0;
    for(int i=0; i<A.length-1; i++){
      for(int j=i+1; j<A.length; j++){
        if((A[i]+A[j])%60 == 0){
          out++;
        }
      }
    }
    return out;
  }
}