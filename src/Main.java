//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //задача1
        int message = 33;
        System.out.println("Значение переменной message c типом int равно " + message);
        byte dayOfMonth = 12;
        System.out.println("Значение переменной dayOfMonth c типом byte равно " + dayOfMonth);
        short dayTransaction = 4000;
        System.out.println("Значение переменной dayTransaction c типом short равно " + dayTransaction);
        long salaryYear = 6000000L;
        System.out.println("Значение переменной salaryYear c типом long равно " + salaryYear);
        float x = 3.5F;
        System.out.println("Значение переменной x c типом float равно " + x);
        double y = 5.9;
        System.out.println("Значение переменной y c типом double равно " + y);
//задача2
        double a = 27.12;
        long s = 987_678_965_549L;
        float d = 2.786F;
        short g = 569;
        short h = -159;
        char j = 27897;
        byte m = 67;
//задача3
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int paper = 480;
        int paperEach = paper / (class1 + class2 + class3);
        System.out.println(paperEach);
//задача4
        int boutle = 16;
        int timeCikl = 2;
        //производительность в минуту
        int efficiencyMin = boutle / timeCikl;
        System.out.println("За " + timeCikl + " минут машина произвела " + boutle + " штук бутылок");
        //произведено в сутки
        int efficiencyDay = efficiencyMin * (24 * 60);
        System.out.println("За сутки машина произвела " + efficiencyDay + " штук бутылок");
        //за три дня
        System.out.println("За три дня машина произвела " + efficiencyDay * 3 + " штук бутылок");
        //за месяц
        System.out.println("За месяц машина произвела " + efficiencyDay * 30 + " штук бутылок");

        int whitePerClass = 2;
        int brownPerClass = 4;
        int classes = 120 / (whitePerClass + brownPerClass);
        int whiteColor = whitePerClass * classes;
        int brownColor = brownPerClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски ");

//задача6
        int babanaWeight = 80;
        int milkWeight = 105;
        int icecreamWeight = 100;
        int eggsWeight = 70;
        int totalWeight = babanaWeight * 5 + milkWeight * 2 + icecreamWeight * 2 + eggsWeight * 4;
        Float totalWeightKg = (float)totalWeight / 1000;
        System.out.println( "Вес спортзавтрака " + totalWeight +
                " граммов или " + totalWeightKg +"кг");
    //задача7
    //надо похудеть на 7кг по 250 гр или 500 гр в сутки - сколько дней
    int day250 = 7000 / 250;
    int day500 = 7000 / 500;
    System.out.println("Спортсмену нужно "+ day250 + "дней, если будет худеть по 250 грамм в сутки и "+ day500 + " дней, если будет сбрасывать по 500 гр в сутки.");


    //задача8
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //«Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
        int salaryM = 67760;
                int salaryD = 83690;
int salaryK = 76230;
double salaryMAfter = salaryM * 1.1;
        double salaryDAfter = salaryD * 1.1;
        double salaryKAfter = salaryK * 1.1;
        double salaryYearMoreM = (salaryMAfter % salaryM) * 12;
        double salaryYearMoreD = (salaryDAfter % salaryD) * 12;
        double salaryYearMoreK = (salaryKAfter % salaryK) * 12;

        System.out.printf("Маша теперь получает %.2f рублей. " +
                "Годовой доход вырос на %.2f рублей.\n", salaryMAfter, salaryYearMoreM);
        System.out.println("Денис теперь получает  рублей. Годовой доход вырос на " + salaryYearMoreD + "рублей");
        System.out.println("Кристина теперь получает " + salaryKAfter
                + " рублей. Годовой доход вырос на " + salaryYearMoreK + "рублей");

    }
}