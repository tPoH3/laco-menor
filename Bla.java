package com.mycompany.bla;

import java.util.Scanner;

public class Bla {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);   
       
        int i;
        int menor = 0;
        int pergunta;
        for(i = 0; i <= 9;i++){
      
            System.out.printf("digite %d° valor: \n",i + 1);
            pergunta = teclado.nextInt();
            
            if(pergunta < menor){
                menor = pergunta;
            }
           
            
        }
        System.out.printf("O numero menor e:%d \n",menor);
    }
}
