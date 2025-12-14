package STUDENT_GROUP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Students_Methods {
    //<editor-fold desc="ReadAndSplitFromFile">

    // METHOD : READ AND SPLIT ===========================================================
    public static Students[] ReadAndSplitFromFile(String DATA) throws FileNotFoundException {

        int counter = 0; // БРОИМ РЕДОВЕТЕ ВЪВ ФАЙЛА

        //ЧЕТЕМ ОТ ФАЙЛА
        Scanner myReader = new Scanner(new File(DATA), "UTF-8");// Read from file

        // ПРЕБРОЯВАМЕ ЗАПИСИТЕ (РЕДОВЕТЕ) ВЪВ ФАЙЛА
        while (myReader.hasNext()) {
            myReader.nextLine();
            counter++; }

        // СЪЗДАВАМЕ МАСИВ ОТ ОБЕКТИ С РАЗМЕР БРОЯ НА РЕДОВЕТЕ - КЛАСА ЗА ТЯХ Е В Students.java
        Students[] StudentGroup = new Students[counter];

        //СЕТВАМЕ ПРОМЕНЛИВАТА ДА Е 0 ЗА ДА ПРЕМИНЕМ ПРЕЗ ВСЕКИ ЕДИН УЧЕНИК
        counter = 0;

        //ЧЕТЕМ ОТНОВО ОТ ФАЙЛА
        myReader = new Scanner(new File(DATA), "UTF-8");

        // While цикъл за попълване на масива с учениците
        while (counter != StudentGroup.length){

            System.out.println("NOW READING FROM FILE FOR EVERY STUDENT [" + counter + "] : ");

            // ЧЕТЕМ ЕДИН ПО ЕДИН РЕДОВЕТЕ
            String dataString = myReader.nextLine();

            // сплитваме по "," (запетая) и ги слагаме в масив
            String[] splitedData  = dataString.split(",");

            //СЪЗДАВАМЕ ОБЕКТ ОТ В МАСИВА И ЗАПИСВАМЕ ЗА НЕГО СТОЙНОСТИТЕ ОТ ФАЙЛА
            StudentGroup[counter] = new Students();
            StudentGroup[counter].setNumber(Integer.parseInt(splitedData[0]));    // get from col Number of DATA.TXT
            StudentGroup[counter].setName(splitedData[1]);      //get from col Name of DATA.TXT
            StudentGroup[counter].setFamily(splitedData[2]);    //get from col Family of DATA.TXT
            StudentGroup[counter].setAvgscore(Double.parseDouble(splitedData[3]));  //get from col Avgscore of DATA.TXT

            //УВЕЛИЧАВАМЕ ПРОМЕНЛИВАТА ЗА ДА ПРЕМИНЕМ НА СЛЕДВАЩИЯ УЧЕНИК
            counter++;
        }

        System.out.println("FINISHING READ FROM FILE !!!");

        //ВРЪЩАМЕ МАСИВА
        return StudentGroup;
    }// end of read and split ---------------------------------------

    //</editor-fold>

    //<editor-fold desc="MakeStatistic">

    // METHOD : MAKE STATISTIC ==========================================================

    public static void MakeStatistic(Students[] StudentGroup) {

        //СЪЗДАВАМЕ ПРОМЕНЛИВА ЗА СРЕДНИЯ УСПЕХ НА УЧЕНИЦИТЕ
        double GroupAvgScore = 0;

        // print group.................................................
        for (Students thisStudent : StudentGroup) // FOR-EACH ЗА ПРИНТИРАНЕ НА ИНФОРМАЦИЯТЯ ЗА ВСЕКИ ЕДИН УЧЕНИК
        {
            System.out.print("Номер : " + thisStudent.getNumber());
            System.out.print(" Име : " + thisStudent.getName());
            System.out.print(" Фамилия : " + thisStudent.getFamily());
            System.out.println(" Ср.Успех : " + thisStudent.getAvgscore());
        }

        // print average score...........................................
        for (Students thisStudent : StudentGroup) // FOR-EACH ЗА ДА СЕ ВЗЕМЕ СБОРА ОТ ВСИЦКИ ОЦЕНКИ
        {
            GroupAvgScore = GroupAvgScore + thisStudent.getAvgscore();

        }

        //ДЕЛИМ СРЕДНИЯ УСПЕХ НА УЧЕНИЦИТЕ И ГО ПРИНТИРАМЕ
        GroupAvgScore = GroupAvgScore / StudentGroup.length;
        System.out.println("AVG SCORE : " + GroupAvgScore);


        // MAX score ....................................................

        //СЪЗДАВАМЕ ПРОМЕНЛИВА ЗА ИНДЕКСА НА УЧЕНИКА
        int index = 0;

        //СЪЗДАВАМЕ ПРОМЕНЛИВА ЗА МАКСИМАЛНИЯ РЕЗУЛТАТ И ПРИЕМАМЕ, ЧЕ Е НА ПЪРВИЯ УЧЕНИК
        double MaxScore = StudentGroup[0].getAvgscore();

        for (Students thisStudent : StudentGroup) // FOR-EACH ЗА ПРОВЕРКА НА МАКСИМАЛНИЯ РЕЗУЛТАТ  УЧЕНИЦИТЕ
        {
            if (MaxScore < thisStudent.getAvgscore()) {
                MaxScore = thisStudent.getAvgscore();
                index++;
            }
        }

        //ПРИНТИРАМЕ УЧЕНИКА С НАЙ-ВИСОК РЕЗУЛТАТ
        System.out.println("MAX SCORE : " + MaxScore);
        System.out.print("Номер : " + StudentGroup[index].getNumber());
        System.out.print(" Име : " + StudentGroup[index].getName());
        System.out.print(" Фамилия : " + StudentGroup[index].getFamily());
        System.out.println(" Ср.Успех : " + StudentGroup[index].getAvgscore());


        // MIN score .......................................................

        //СЪЗДАВАМЕ ПРОМЕНЛИВА ЗА ИНДЕКСА НА УЧЕНИКА
        index = 0;

        //СЪЗДАВАМЕ ПРОМЕНЛИВА ЗА МИНИМАЛНИЯ РЕЗУЛТАТ И ПРИЕМАМЕ, ЧЕ Е НА ПЪРВИЯ УЧЕНИК
        double MinScore = StudentGroup[0].getAvgscore();

        for (Students thisStudent : StudentGroup) // FOR-EACH ЗА ПРОВЕРКА НА МИНИМАЛНИЯ РЕЗУЛТАТ  УЧЕНИЦИТЕ
        {
            if (MinScore > thisStudent.getAvgscore()) {
                MinScore = thisStudent.getAvgscore();
                index++;
            }
        }

        //ПРИНТИРАМЕ УЧЕНИКА С НАЙ-НИСЪК РЕЗУЛТАТ
        System.out.println("MIN SCORE : " + MinScore);
        System.out.print("Номер : " + StudentGroup[index].getNumber());
        System.out.print(" Име : " + StudentGroup[index].getName());
        System.out.print(" Фамилия : " + StudentGroup[index].getFamily());
        System.out.println(" Ср.Успех : " + StudentGroup[index].getAvgscore());


    } // end of Make Statistic --------------------------------------

    //</editor-fold>

}