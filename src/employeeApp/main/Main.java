package employeeApp.main;

import employeeApp.model.Employee;
import employeeApp.model.Healtplan;
import employeeApp.model.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healtplan plan1= new Healtplan(1,"X Sigorta", Plan.BASIC);
        Healtplan plan2= new Healtplan(1,"Y Sigorta", Plan.ADVANCE);
        Healtplan plan3= new Healtplan(1,"Z Sigorta", Plan.NORMAL);

        String[] healtplans=new String[3];
        healtplans[0]=plan3.getName();
        healtplans[1]=plan2.getName();


        Employee dev=new Employee(1,"Dogan Yangöz", "dgnyngz@gmail.com","3213",healtplans);
       // dev.addHealthplan(0,"J sigorta");
        dev.addHealthplan(2,"J sigorta");
        System.out.println((dev));
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
