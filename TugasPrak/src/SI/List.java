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
    String Nama, Deskripsi;
    private String Kota;
    
    public String getkota()
    {
        return Kota;
    }
    public void setKota(String Kota){ 
        this.Kota = Kota;
    }
    
    void dataNama(String Nama){
    this.Nama = Nama;
    }
    void dataDeskripsi(String Deskripsi){ 
        this.Deskripsi = Deskripsi;
    }  
}
