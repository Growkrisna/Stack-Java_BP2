package Queue;

import java.util.Scanner;

class Order {
    String barang;
    double harga;
    int jumlah;
    Order nextOrder;

    Order() {
    }

    String getBarang() {
        return barang;
    }

    double getHarga() {
        return harga;
    }

    int getJumlah() {
        return jumlah;
    }
}

class Queue {
    Order front, reas;
    double total;

    Queue() {
    }

    void enqueue(Order order) {
        if (front == null && reas == null) {
            front = reas = order;
        } else {
            reas.nextOrder = order;
            reas = order;
        }
    }

    void deQueue(){
        Order t=front;
        if(front == null){
            System.out.println("Queue kosong");
        }else if (front.nextOrder == null) {
            front = reas = null;
        }else{
            front = front.nextOrder;
            t.nextOrder = null;
        }
    }

    void view(){
        System.out.println("Antrian :");
        if(front == null){ 
            System.out.println("Kosong jir");
        }else{
            for(Order t = front;t != null; t = t.nextOrder){
                System.out.print("[" + t.barang + "," + t.jumlah + ']');
            }
            System.out.println("");
        }
    }
}

public class apppQueue {
    public static void main(String[] args) {

    }
}