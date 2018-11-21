public class Q1 {
  public int[] rot(int A[], int d){
    int[] out = new int[A.length];
    for(int i=0; i<A.length; i++){
      out[i] = A[(i+2)%A.length];
    }
    return out;
  }
}