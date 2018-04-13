/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author r-torres
 */
public class Item {

    private int chave;

    public Item(int chave) {
        this.chave = chave;
    }

    public int compara(Item it) {
        Item item = it;
        if (this.chave < item.chave) {
            return -1;
        } else if (this.chave > item.chave) {
            return 1;
        }
        return 0;
    }

    public int recuperaChave() {
        return chave;
    }
   public void alteraChave(int chave){
       this.chave=chave;
   }
}
