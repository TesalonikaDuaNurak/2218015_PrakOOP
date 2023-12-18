/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SI;

/**
 *
 * @author TESA
 */
public class Biaya_Masuk{  
    int HargaTiket,Jumlah,Total;

    public Biaya_Masuk() {
        this.HargaTiket = HargaTiket;
        this.Jumlah = Jumlah;
        this.Total = Total;
    }
    int HargaTiket(){
        return HargaTiket;
    }
    int Jumlah(){
        return Jumlah;
    }
    int Total(){
        return Total;
    }

    public int List(){
        Total = (HargaTiket * Jumlah);
        return Total;
    }
    
}
