public class RepeatLetters {
    public static void main(String[] args) {

        int[] array = {1, 4, 2, 5, 3, 6, 4, 7, 5, 8, 6, 9};

        int[] repeatLetters = new int[array.length];
        int index = 0;
        int x;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                x = 0;

                //Durum Kontrol
                if ((i != j) && (array[i] == array[j])) {

                    //Sayı "tekrarEden dizisinin icinde" var mı?
                    for (int k = 0; k <= index; k++) {
                        if (array[i] == repeatLetters[k]) {
                            x++; //Var ise x bir artıyor;
                        }
                    }

                    {//eger tekrareden dizisinde yoksa dizinin içine atıyor
                        if (x < 1)
                        repeatLetters[index++] = array[i];
                    }
                }
            }
        }

        for (int a : repeatLetters) {
            if (a != 0)
                System.out.println(a);
        }
    }
}
