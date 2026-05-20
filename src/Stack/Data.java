package BP2;
public class Data {
    String produk;
    Data next;

    Data(){
        
    }

    void setProduk(String j){
        produk = j;
    }
    
    String getProduk(){
        return produk;
    }
}