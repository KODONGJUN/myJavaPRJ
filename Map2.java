import java.util.*;


public class Map2 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name","이협건");
        map.put("email","hglee67@kopo.ac.kr");
        map.put("addr","서울");
        map.put("dept","데이터분석과");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name","홍길동");
        map.put("email","gdhong@kopo.ac.kr");
        map.put("addr","경기");
        map.put("dept","시각디자인과");

        list.add(map);

        map=null;

        int listSize = list.size();

        for ( int i = 0; i < listSize; i++){

            map rmap = list.get(1);
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("aeer"));
            System.out.println("dept : " + rmap.get("dept"));
        }

    }
}
