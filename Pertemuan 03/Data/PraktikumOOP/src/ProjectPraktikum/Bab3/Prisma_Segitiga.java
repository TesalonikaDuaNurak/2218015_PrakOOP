/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author march
 */
public class Prisma_Segitiga extends Segitiga{
    double tinggiPrisma, vol;
    double volumePrisma()
    {
        vol = (Luas()* tinggiPrisma);
        return vol;
    }
}
