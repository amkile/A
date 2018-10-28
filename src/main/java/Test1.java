/**
 * 测试
 *
 * @author yangguolong
 * @version 1.0
 * @create 2018-10-17 11:11
 **/
public class Test1 {


    /**  
    *
    * @author yangguolong
    * @date 2018/10/17
    * @param [a] 
    * @return int 
    */
    public static int chack(int a){
        System.out.println(a);
        return  a;
    }


    public static void main(final String[] args) {
        chack(10);
        Thread t = new Thread( ()-> System.out.println(1));
        t.start();


    }
}
