public class Ex10_02_01 {
    public static void main(String[] args) {
        int [] aa = new int[3];
        try {
            aa[2] = 100 / 0; //여기서 에러가 이미 나버려서 밑에 구문 실행 x바로 catch문 실행
            aa[3] = 100;
        }catch (Exception e) {
            System.out.println("모든 에러 다 잡음");
            System.out.println("오류 메세지 : " +e);
        }finally {
            System.out.println("오류 여부와 관계없이 실행");
        }
    }
}
