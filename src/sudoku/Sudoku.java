/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sudoku;

/**
 *
 * @author Даулет
 */
public class Sudoku {

    public Sudoku(){
      
    }
    /**
     * @return 
     */
    public int[][] rasclad() {
        int[][] s=new int[9][9];
        int c;
        int d;
      do{
          c=0;
        for (int n=0;n<9;n++){
        d=0;
            for (int i=0;i<9;i++){
                int a;
                do{
                    d+=1;
                    if (d==100){
                        c=1;
                        break;
                    }
                    a=0;
                    s[n][i]=(int)(Math.random()*10);
                    if (s[n][i]==0) {
                        a=1;
                        continue;
                    }                     
                    //проверяем в строке
                    if (i>0){
                        for (int b=0;b<i;b++){
                        if (s[n][i]==s[n][b]) a=1;
                        }
                    }
                    if (a==1)continue;
                    //проверяем в столбце
                    if (n>0){
                        for (int b=0;b<n;b++){
                        if (s[n][i]==s[b][i])a=1;
                        }
                        //проверяем в квадратах
                        if(n<3&&i<3){//первый квадрат
                        if(i==0){
                            for(int b=0;b<n;b++){
                                for(int e=0;e<3;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=0;b<=n;b++){
                                for(int e=0;e<3;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n<3&&i>2&&i<6){//второй квадрат
                        if(i==3){
                            for(int b=0;b<n;b++){
                                for(int e=3;e<6;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=0;b<=n;b++){
                                for(int e=3;e<6;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n<3&&i>5){//третий квадрат
                        if(i==6){
                            for(int b=0;b<n;b++){
                                for(int e=6;e<9;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=0;b<=n;b++){
                                for(int e=6;e<9;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n>2&&n<6&&i<3){//четвертый квадрат
                        if(i==0){
                            for(int b=3;b<n;b++){
                                for(int e=0;e<3;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=3;b<=n;b++){
                                for(int e=0;e<3;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n>2&&n<6&&i>2&&i<6){//пятый квадрат
                        if(i==3){
                            for(int b=3;b<n;b++){
                                for(int e=3;e<6;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=3;b<=n;b++){
                                for(int e=3;e<6;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n>2&&n<6&&i>5){//шестой квадрат
                        if(i==6){
                            for(int b=3;b<n;b++){
                                for(int e=6;e<9;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=3;b<=n;b++){
                                for(int e=6;e<9;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n>5&&i<3){// 7 квадрат
                        if(i==0){
                            for(int b=6;b<n;b++){
                                for(int e=0;e<3;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=6;b<=n;b++){
                                for(int e=0;e<3;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n>5&&i>2&&i<6){// 8 квадрат
                        if(i==3){
                            for(int b=6;b<n;b++){
                                for(int e=3;e<6;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=6;b<=n;b++){
                                for(int e=3;e<6;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                        if(n>5&&i>5){// 9 квадрат
                        if(i==6){
                            for(int b=6;b<n;b++){
                                for(int e=6;e<9;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                }
                            }
                        } 
                        else {
                            for(int b=6;b<=n;b++){
                                for(int e=6;e<9;e++){
                                    if(s[n][i]==s[b][e])a=1;
                                    if(b==n&&e==i-1)break;
                                }
                            }
                        }   
                        }
                    }
                                               
                  if (c==1)break;  
                }while(a==1);
                if (c==1)break; 
            }
            if (c==1)break;
        }
      }while(c==1); 
      return s;
      
      
    }

}
