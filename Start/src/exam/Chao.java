package exam;

public class Chao {
    public static void main(String[] args) {
        int []array={3,4,67,89,23,55};
        int exam=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]>exam){
                exam=array[i];
            }
        }

        System.out.println(exam);
    }
}
