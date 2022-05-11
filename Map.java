import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        System.out.println("--------------------------------------");

        System.out.println("name : "+ map.get("name"));
        System.out.println("email : "+ map.get("email"));
        System.out.println("email : "+ map.get("email"));

        System.out.println("---------------------------------------");
    }
}
