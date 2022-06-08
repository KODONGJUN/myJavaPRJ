public class Ex10_02 {
    public static void main(String[] args) {
        int [] aa = new int[3];
        try {
            aa[2] = 100 / 0; //여기서 에러가 이미 나버려서 밑에 구문 실행 x바로 catch문 실행
            aa[3] = 100;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요");
            System.out.println("오류 메ArrayIndexOutOfBoundsException세지 : " +e);
        }catch (ArithmeticException e ){
            System.out.println("0으로 나누는 등의 오류");
            System.out.println("오류 메세지 : " +e);
        }finally {
            System.out.println("오류 여부와 관계없이 실행");
        }

    }
}
