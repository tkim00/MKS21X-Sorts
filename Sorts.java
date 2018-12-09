public class Sorts{
  public static void main(String[] args) {
    int [] sample = {5, 1, 12, -5, 16, 2, 12, 14};
    // System.out.println("Original:");
    // for (int i = 0; i < sample.length; i++) {
    //   System.out.println(sample[i]);
    // }
    //
    // selectionSort(sample);
    // System.out.println("Modified:");
    // for (int i = 0; i < sample.length; i++) {
    //   System.out.println(sample[i]);
    // }
    bubbleSort(sample);
    for (int i = 0; i < sample.length; i++) {
      System.out.println(sample[i]);
    }
  }
  public static void selectionSort(int [] ary) {
    /*
    int [] temp = new int [ary.length];
    for(int i = 0; i < ary.length; i++){
      temp[i] = ary[i];
    }
    int x = 0;*/
    for (int i = 0; i < ary.length; i++) {
      ary[i] = smallestFinder(i, ary);
      //System.out.println();
    }
  }
  public static int smallestFinder(int x, int [] ary) {
    int smallest = ary[x];
    //int j = 0;
    for (int i = x; i < ary.length; i++) {
      if (smallest > ary[i]) {
        smallest = ary[i];
        //j = i;
      }
      //System.out.print(""+ary[i]+" ");
    }
    //ary[j] = ary[x];
    System.out.println();
    for (int i = x; i < ary.length; i++) {
      if(ary[i] == smallest){
        ary[i] = ary[x];
        break;
      }
      //System.out.print(""+ary[i]+" ");
    }
    return smallest;
  }
  public static void bubbleSort(int[] data) {
    int x = 0;
    for (int j = 0; j < data.length - 1; j++) {
      for (int i = 0; i < data.length - 1 - j; i++) {
        if (data[i] > data[i+1]) {
          x = data[i];
          data[i] = data[i+1];
          data[i+1] = x;
        }
      }
    }
  }
}
