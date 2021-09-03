package day1;

public class Task6 {
    public static void main(String[] args) {

    int k = 3;


    for(int i = 1 , j = k; i<=10; i++, j = j+k){
        System.out.println(i+" x"+" "+k+" "+"="+" "+j);

    }
    }
}

/* Также можно было и не создавать еще одну переменную в цикле а сам рассчет сделать в методе
  int k = 3;

        for(int i = 1; i<=10; i++){
        System.out.println(i+" x"+" "+k+" "+"="+" "+ i*k);
 */