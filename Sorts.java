public class Sorts{
  public static void main(String[] args) {
    int [] sample = {7, 55, 41, -8, 121};
    System.out.println("Original:");
    for (int i = 0; i < sample.length; i++) {
      System.out.println(sample[i]);
    }

    selectionsort(sample);
    System.out.println("Modified:");
    for (int i = 0; i < sample.length; i++) {
      System.out.println(sample[i]);
    }
  }
  public static void selectionsort(int [] ary) {
    /*
    int [] temp = new int [ary.length];
    for(int i = 0; i < ary.length; i++){
      temp[i] = ary[i];
    }
    int x = 0;*/
    for (int i = 0; i < ary.length; i++) {
      ary[i] = smallestFinder(i, ary);
    }
  }
  public static int smallestFinder(int x, int [] ary) {
    int smallest = ary[x];
    for (int i = x; i < ary.length; i++) {
      if (smallest > ary[i]) {
        smallest = ary[i];
      }
    }
    for (int i = x; i < ary.length; i++) {
      if(ary[i] == smallest){
        ary[i] = ary[x];
      }
    }
    return smallest;
  }
}
