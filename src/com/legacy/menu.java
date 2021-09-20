package com.legacy;

import java.util.Scanner;

public class menu {
    public void callMenu ()
    {
        int qst;
        float a, b;
        Scanner in = new Scanner(System.in);
        String[] methodsS = new String[] {"Сумма", "Вычитание", "Умножение", "Деление"};
        jout out = new jout();
        methods method = new methods();
        out.jout("Введите число А:");
        a = in.nextFloat();
        out.jout("Введите число В:");
        b = in.nextFloat();
        out.jout("Выбор действия:");
        for (int i=0; i < methodsS.length; i++)
        {
            out.jout((i+1) + " " + methodsS[i]);
        }
        qst = in.nextInt();
        switch (qst)
        {
            case 1:
                out.jout(method.sum(a,b));
                break;
            case 2:
                out.jout(method.sub(a,b));
                break;
            case 3:
                out.jout(method.mult(a,b));
                break;
            case 4:
                if (b != 0)
                out.jout(method.div(a,b));
                else
                {
                    out.jout("Делить на ноль нельзя!");
                    return;
                }
                break;
        }
        System.out.println("Если Вам надо сделать ещё рассчет напишите 1, если нет - 2");
        if (in.nextInt() == 1)
        {
            this.callMenu();
        }
        else
        {
            return;
        }
    }
}
