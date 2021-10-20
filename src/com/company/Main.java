package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    /* САНСЫЗБАЕВ ЖАКСЫЛЫК СИБ-29
    21-НУСКА
    Вычислить сумму элементов матрицы, расположен- ных под главной диагональю. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n=7, m=7;

        int a[][] = new int[n][m];                  //создаем двумернный массив с рандомным элементами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        } int s = 0;

        for(int i=0; i<a.length; ++i){
            for(int j=0; j<a[i].length; ++j){
                if(i == j){                    //егер тен болганда биз басты диогональди таба аламыз
                    s += a[i][j];
                }
            }
        }

        System.out.println("Суммма главного диогоналя : "+s);
    }
}