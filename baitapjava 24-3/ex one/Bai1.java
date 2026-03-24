import java.util.HashMap;

public class Bai1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Anna");
        map.put(102, "Peter");
        map.put(103, "Mary");

        System.out.println("nhan vien co id 102 la: " + map.get(102));


        if (!map.containsKey(105)) {
            map.put(105, "Unknown");
            System.out.println("Da them nhan vien co ID 105.");
        }

        System.out.println("Danh sach nhan vien: " + map);
    }
}