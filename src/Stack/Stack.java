package BP2;
public class Stack {
    Data top, bottom;
    int jumlah;

    Stack(){
        top = bottom = null;
        jumlah = 0;
    }

    void push(Data newData){
        if(top == null){
            top = bottom = newData;
        }else {
            newData.next = top;
            top = newData;
        }
        jumlah++;
    }

    Data pop(){
        Data temp = null;
        if(top == null){
            System.out.print("");
        }
        else if (top.next==null) {  
            temp=top;
            top=bottom=null;     
        }else{     
            temp = top;
            top=top.next;           

        }
        return temp;
    }
    void show(){
        System.out.print("isi stack");
        if (top==null)
            System.out.println("kosong!");
        else{
            for(Data t=top; t!=null; t=t.next){
                System.out.print("["+t.getProduk()+"]");
            }
            System.out.print("");
        }
    }

}
