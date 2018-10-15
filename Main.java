import java.util.ArrayList;

public class Main {
    private static void sort(ArrayList<Integer> arr){
        if (arr.size() <= 1)
            return;

        int opora = arr.get(arr.size() / 2);

        ArrayList<Integer> less = new ArrayList<>();
        for(int n : arr)
            if(n < opora)
                less.add(n);
        sort(less);

        ArrayList<Integer> mid = new ArrayList<>();
        for(int n : arr)
            if(n == opora)
                mid.add(n);

        ArrayList<Integer> more = new ArrayList<>();
        for(int n : arr)
            if(n > opora)
                more.add(n);
        sort(more);

        arr.clear();
        arr.addAll(less);
        arr.addAll(mid);
        arr.addAll(more);
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 2, 18, -5, 7, 102, 6, 4, 6};
        ArrayList<Integer> arrayObj = new ArrayList<>();
        for(int x : array)
            arrayObj.add(x);
        sort(arrayObj);
        for(int x : arrayObj)
            System.out.print(x + ", ");
    }
}
