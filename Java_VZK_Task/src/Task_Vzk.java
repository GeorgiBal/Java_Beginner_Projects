public class Task_Vzk{
    static int v = 1; // вълкът е отляво - 1; вълкът е отдясно - 10
    static int k = 2; // козата е отляво - 2; козата е отдясно - 20
    static int z = 3; // зелето е отляво - 3; зелето е отдясно - 30
    static int l = 4; // лодката е отляво - 4; лодката е отдясно - 40

    static boolean error = false; // знак за грешен ход

    static int counter = 0; // брояч на верни ходове

    public static void main(String[] args) {

        System.out.println("=====================================================");
        System.out.println("=======================[СТАРТ]=======================");
        System.out.println("=====================================================");

        while (v == 1 || k == 2 || z == 3){
            for (int i = 1; i <= 3; i++) {

                error = false;


                // правя проверка за вълка
                if(i==1 && v==1 && l==4){
                    v=10;
                    l=40;
                    System.out.println("--> Пренасям Вълкът надясно -->");
                    if (k==2 && z==3 && l==40) {
                        l=4;
                        v=1;
                        error();
                    }else{
                        view();
                    }
                    if(v==1 && l==40) {
                        l = 7;
                        System.out.println("<-- Връщам Лодката празна наляво <--");
                        view();
                    }
                    if(v==10 && k==20 && l==40){
                        k=2;
                        l=7;
                        System.out.println("<-- Връщам Козата наляво <--");
                        view();
                    }

                }


                // правя проверка за козата
                if(i==2 && k==2 && l==4){
                    k=20;
                    l=40;
                    System.out.println("--> Пренасям Козата надясно -->");
                    view();
                }if(i==2 && k==2 && l==40){
                    l=4;
                    System.out.println("<-- Връщам Лодката празна наляво <--");
                    view();
                }


                // правя проверка за зелето
                if(i==3 && z==3 && l==40){
                    l=4;
                    System.out.println("<-- Връщам Лодката празна наляво <--");
                    view();
                    if(z==3 && l==4){
                        z=30;
                        l=40;
                        System.out.println("--> Пренасям Зелето надясно -->");
                        if (z==30 && k==30 && l==4) {
                            z=3;
                            error();
                        }else {
                            view();
                        }
                    }if(z==30 && k==20 && l==40 && v==1){
                        l=4;
                        k=2;
                        System.out.println("<-- Връщам Лодката с Козата наляво <--");
                        view();
                    }
                }

            }
        }

        System.out.println("=======================[КРАЙ]========================");
        System.out.println("=====================================================");
        System.out.printf("Верни ходове: [%d]", counter);
    }


    // правя проверка за състоянието
    public static void status() {
        System.out.println("Състояние: ");
        System.out.printf("Вълкът е: [%d] - ", v);
        if(v==1) System.out.println("Ляво");
        else System.out.println("Дясно");
        System.out.printf("Козата е: [%d] - ", k);
        if(k==2) System.out.println("Ляво");
        else System.out.println("Дясно");
        System.out.printf("Зелето е: [%d] - ", z);
        if(z==3) System.out.println("Ляво");
        else System.out.println("Дясно");
        System.out.printf("Лодката е: [%d] - ", l);
        if(l==4) System.out.println("Ляво");
        else System.out.println("Дясно");
    }


    // извеждам изгледа при правилен ход
    public static void view(){
        counter++;
        System.out.printf("Верен ход: [%d]\n", counter);
        status();
        System.out.println("=====================================================");
    }


    // извеждам изгледа при грешен ход
    public static void error(){
        error=true;
        System.out.println("Грешен ход!");
        status();
        System.out.println("=====================================================");
    }
}