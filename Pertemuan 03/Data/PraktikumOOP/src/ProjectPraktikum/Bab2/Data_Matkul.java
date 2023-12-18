/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab2;

/**
 *
 * @author march
 */
public class Data_Matkul {
    String kode_mk, nama_mk, dosen_pengampu;
    int jml_sks;
    
    void dataKode_mk(String Kode_mk){ this.kode_mk = kode_mk;
    }
    void dataNama_mk(String Nama_mk){ this.nama_mk = nama_mk;
    }
    void dataDosen_pengampu(String Dosen_pengampu){ this.dosen_pengampu = dosen_pengampu;
    }
    void dataJml_sks(int Jml_sks){ this.jml_sks = jml_sks;
    }
    
    String cetakKode_mk(){
        return kode_mk;
    }
    String cetakNama_mk(){
        return nama_mk;
    }
    String cetakDosen_pengampu(){
        return dosen_pengampu;
    }
    int cetakJml_sks(){
        return jml_sks;
    }
}
