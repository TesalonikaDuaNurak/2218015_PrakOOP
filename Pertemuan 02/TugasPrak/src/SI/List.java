/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SI;

/**
 *
 * @author march
 */
public class List {
    String Nama, Kota, Deskripsi; 
    
    public List(){
        this.Kota = "Malang";
    }
    
    void dataNama(String Nama){
    this.Nama = Nama;
    }
    void dataKota(String Kota){ 
        this.Kota = Kota;
    }
    void dataDeskripsi(String Deskripsi){ 
        this.Deskripsi = Deskripsi;
    }

    String cetakNama(){ 
        return Nama;
    }
    String cetakKota(){ return Kota;
    }
    String cetakDeskripsi(){ return Deskripsi;
    }

}
