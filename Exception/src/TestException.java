import java.lang.Exception;
public class TestException {
    public static float devive(int a, int b) throws Exception{
        float c = a/b;
        return c;
    }
    public static void main(String[] args) throws Exception{
        System.out.println("Starting ... ");
        try{
            System.out.println("mo ket noi");
            System.out.println("test ket noi");
            System.out.println("them ket noi");
            System.out.println("thong bao ket noi");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
//       finally {
//            System.out.println("dong ket noi");
//        }
//        float t = devive(14,10);
//        try{
//                int a = 1221;
//                int b = 213;
//                try{
//                    System.out.println("Thuong la "+a/b);
//                }catch (Exception ex) {
//                    System.out.println("Phai nhap so khac 0");
//                    ex.printStackTrace();
//                }
//        }catch (Exception ex){
//            System.out.println("loi la "+ex.getMessage());
//            ex.printStackTrace();
//        }
    }
}
