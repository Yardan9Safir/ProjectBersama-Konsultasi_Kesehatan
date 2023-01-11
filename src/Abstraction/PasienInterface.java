/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

import Entity.PasienEntity;

/**
 *
 * @author HP
 */
public interface PasienInterface {

    void hapus(int index);
    void tambah(PasienEntity pasienE);
    void ganti(int index, PasienEntity pasienE);
    
}
