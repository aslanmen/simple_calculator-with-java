/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basit.hesap.makinası;

import java.util.Scanner;

/**
 *
 * @author aasla
 */
public class BasitHesapMakinası {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("******************************");
        String islemler="1.toplama\n"+"2.çıkarma\n"+"3.bölme\n"+"4.çarpma\n";
        System.out.println(islemler);
        System.out.println("******************************"); 
        System.out.println("işlemi seçiniz");
        int islem=input.nextInt();
        int a,b;
        switch(islem){
           case 1:
               System.out.println("birinci sayı");
               a=input.nextInt();
               System.out.println("ikinci sayı");
               b=input.nextInt();
               System.out.println("işlem sonucu:"+(a+b));
               break;
           case 2:
               System.out.println("birinci sayı");
               a=input.nextInt();
               System.out.println("ikinci sayı");
               b=input.nextInt();
               System.out.println("işlem sonucu:"+(a-b));
               break;
           case 3:
               System.out.println("birinci sayı");
               a=input.nextInt();
               System.out.println("ikinci sayı");
               b=input.nextInt();
               System.out.println("işlem sonucu:"+((double)a/b));
               break;
           case 4:
               System.out.println("birinci sayı");
               a=input.nextInt();
               System.out.println("ikinci sayı");
               b=input.nextInt();
               System.out.println("işlem sonucu:"+(a*b));
               break;
           default:
               System.out.println("geçerli işlem giriniz");
       }
    }
    
}
