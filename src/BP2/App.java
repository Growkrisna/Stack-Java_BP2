package BP2;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Data data;
        Stack stack =new Stack();
        int pilih=0;
        do{
            System.out.println("\nStack");
            System.out.println("1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.print("Pilih = ");
            pilih =sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Produk = ");
                    String j=sc.next();
                    data=new Data();
                    data.setProduk(j);
                    stack.push(data);
                    break;
                    case 2:
                        data=stack.pop();
                        if(data!=null)
                            System.out.println(data.getProduk()+" diambil");
                        else System.out.println("Stack kosong!");
                    break;
                    case 3:
                        stack.show();
                        break;
                default:
                    break;
            }

        }while(pilih!=4);
    }
}
