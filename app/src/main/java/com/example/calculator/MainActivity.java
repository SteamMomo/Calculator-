package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String temp = "0", tempPro=" ", temp3=" ";
    String state = " ";
    String b1 = "0", c1 = "0";
    int d = 0, d2 = 1;
    boolean rd = true;


    public void display1(String message) {
        TextView hasDisplay = (TextView) findViewById(R.id.displayOne);
        if (message.charAt(message.length() - 1) == '+' || message.charAt(message.length() - 1) == '-' || message.charAt(message.length() - 1) == '/' || message.charAt(message.length() - 1) == '*' || message.charAt(message.length() - 1) == '^' || message.charAt(message.length() - 1) == '%')
            hasDisplay.setText(message + "0");
        else
            hasDisplay.setText(message);
    }

    public void display2(String message) {
        TextView hasDisplay = (TextView) findViewById(R.id.displayTwo);
        long duo = 0;
        double var = Double.parseDouble(message);
        duo = (long) var;
        if (duo == var) {
            String message2 = Long.toString(duo);
            temp = Long.toString(duo);
            hasDisplay.setText(message2);
        } else
            hasDisplay.setText(message);
    }
    public void display3(String message) {
        TextView hasDisplay = (TextView) findViewById(R.id.displayOne);
        long duo = 0;
        double var = Double.parseDouble(message);
        duo = (long) var;
        if (duo == var) {
            String message2 = Long.toString(duo);
            //   temp = Long.toString(duo);
            hasDisplay.setText(message2);
        } else
            hasDisplay.setText(message);
    }
    public void display4(String message) {
        TextView hasDisplay = (TextView) findViewById(R.id.displayTwo);
        long duo = 0;
        double var = Double.parseDouble(message);
        duo = (long) var;
        if (duo == var) {
            String message2 = Long.toString(duo);
            //   temp = Long.toString(duo);
            hasDisplay.setText(message2);
        } else
            hasDisplay.setText(message);
    }

    public void trigDisplay(String message) {
        TextView hasDisplay = (TextView) findViewById(R.id.displayOne);
        hasDisplay.setText(state + message + ")");
    }

    public void raddeg(Boolean pp)
    {
        TextView hasDisplay = (TextView) findViewById(R.id.raddeg);
        if ( pp==true)
            hasDisplay.setText("Deg");
        else
        {
            hasDisplay.setText("Rad");
        }
    }
    public void allclearf(View view) {
        temp = "0";
        tempPro=" ";
        state = " ";
        b1 = "0";
        c1 = "0";
        d = 0;
        d2 = 1;
        rd = true;
        display2(temp);
        clear();
    }

    public void onef(View view) {
        if (temp == "0")
            temp = "1";
        else
            temp = temp + "1";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1; // to make decimal impossible
    }

    public void twof(View view) {
        if (temp == "0")
            temp = "2";
        else
            temp = temp + "2";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void threef(View view) {
        if (temp == "0")
            temp = "3";
        else
            temp = temp + "3";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void fourf(View view) {
        if (temp == "0")
            temp = "4";
        else
            temp = temp + "4";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void fivef(View view) {
        if (temp == "0")
            temp = "5";
        else
            temp = temp + "5";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void sixf(View view) {
        if (temp == "0")
            temp = "6";
        else
            temp = temp + "6";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void sevenf(View view) {
        if (temp == "0")
            temp = "7";
        else
            temp = temp + "7";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void eightf(View view) {
        if (temp == "0")
            temp = "8";
        else
            temp = temp + "8";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void ninef(View view) {
        if (temp == "0")
            temp = "9";
        else
            temp = temp + "9";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1) d = 1;
    }

    public void zerof(View view) {
        if (temp == "0")
            temp = "0";
        else
            temp = temp + "0";
        if (state != " ")
            trigDisplay(temp);

        else
            display1(temp);
        if (d2 != 1)
            d = 1;
    }

    public void conjugatef(View view) {
        char[] arr = temp.toCharArray();
        int c = 1, c2 = 0;
        String test = temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '^' || arr[i] == '%' || arr[i] == '*' || arr[i] == '/')
                c2++;
        }
        if (c2 == 0) {
            temp = "-" + temp;
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == '+') {
                    arr[i] = '-';
                    c = 1;
                    break;
                }
                if (arr[i] == '-') {
                    arr[i] = '+';
                    c = 1;
                    break;
                }
                if (arr[i] == '*' || arr[i] == '/' || arr[i] == '^' || arr[i] == '%') {
                    test = test.substring(0, i + 1) + '-' + test.substring(i + 1, test.length());
                    c = 0;
                    break;
                }
            }
            if (c != 0)
                temp = String.valueOf(arr);
            else
                temp = test;
        }
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
    }

    public void plusf(View view) {

        if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^') {
            if (temp == "0")
                temp = "+";
            else
                temp = temp + "+";

        }
        else
            temp=temp.substring(0,temp.length()-1)+'+';
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
        d2 = 1;
        d = 0; // to make decimal possible again
    }

    public void minusf(View view) {
        if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^')
            if (temp == "0")
                temp = "-";
            else
                temp = temp + "-";
        else
            temp=temp.substring(0,temp.length()-1)+'-';
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
        d2 = 1;
        d = 0; // to make decimal possible again
    }

    public void multiplyf(View view) {
        if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^')
            temp = temp + "*";
        else
            temp=temp.substring(0,temp.length()-1)+'*';
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
        d2 = 1;
        d = 0;// to make decimal possible again
    }

    public void dividef(View view) {
        if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^')
            temp = temp + "/";
        else
            temp=temp.substring(0,temp.length()-1)+'/';
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
        d = 0;
        d2 = 1;// to make decimal possible again
    }

    public void percentf(View view) {
        if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^')
            temp = temp + "%";
        else
            temp=temp.substring(0,temp.length()-1)+'%';
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
        d = 0;
        d2 = 1;// to make decimal possible again
    }

    public void powerf(View view) {
        if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^')
            temp = temp + "^";
        else
            temp=temp.substring(0,temp.length()-1)+'^';
        if (state != " ")
            trigDisplay(temp);
        else
            display1(temp);
        d = 0;
        d2 = 1;// to make decimal possible again
    }

    public void decimalf(View view) {
        int k = 0;
        for (int i = temp.length()-1; i >= 0 ; i--) {
            if(temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '*' || temp.charAt(i) == '/' || temp.charAt(i) == '^' || temp.charAt(i) == '%') break;
            if (temp.charAt(i) == '.') k++;
        }
        if (k == 0) {
            if (d != 1) { // to kill the multi point bug
                if (temp.charAt(temp.length() - 1) != '+' && temp.charAt(temp.length() - 1) != '-' && temp.charAt(temp.length() - 1) != '*' && temp.charAt(temp.length() - 1) != '/' && temp.charAt(temp.length() - 1) != '%' && temp.charAt(temp.length() - 1) != '^')
                    temp = temp + ".";
                else
                    temp = temp + "0" + ".";
                if (state != " ")
                    trigDisplay(temp);
                else
                    display1(temp);
                d2 = 0;
                d = 1;
            } else Toast.makeText(this, "INVALID", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(this, "INVALID", Toast.LENGTH_SHORT).show();
    }

    public void RD(View view) {

        if (rd == true)
            rd = false;
        else rd = true;
        raddeg(rd);
    }

    public void clearf(View view) {
        clear();
    }

    public void clear() {
        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '%' || temp.charAt(i) == '^' || temp.charAt(i) == '*' || temp.charAt(i) == '/')
                break;
            if (i > 0)
                temp = temp.substring(0, i);
            else if (i == 0)
                temp = "0";
        }
        display1(temp);
    }
    public void deletef(View view)
    {
        int i= temp.length();
        if (i > 1)
            temp = temp.substring(0, i-1);
        else if ((i-1) == 0)
            temp = "0";
        display1(temp);
    }
    public void sinf(View view) {
        state = "sin(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = 0;
        if (rd == false)
            ans = Math.sin(sub);
        else {
            double deg = Math.toRadians(sub);
            ans = Math.sin(deg);
        }
        temp = Double.toString(ans);
        display2(temp);
        state = " ";

    }

    public void cosf(View view) {
        state = "cos(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = 0;
        if (rd == false)
            ans = Math.cos(sub);
        else {
            double deg = Math.toRadians(sub);
            ans = Math.cos(deg);
        }
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        state = " ";
    }

    public void tanf(View view) {
        state = "tan(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = 0;
        if (rd == false)
            ans = Math.tan(sub);
        else {
            double deg = Math.toRadians(sub);
            ans = Math.tan(deg);
        }
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        tempPro=temp;
        state = " ";
    }

    public void cscf(View view) {
        state = "csc(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = 0;
        if (rd == false)
            ans = 1 / Math.sin(sub);
        else {
            double deg = Math.toRadians(sub);
            ans = 1 / Math.sin(deg);
        }
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        state = " ";
    }

    public void secf(View view) {
        state = "sec(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = 0;
        if (rd == false)
            ans = 1 / Math.cos(sub);
        else {
            double deg = Math.toRadians(sub);
            ans = 1 / Math.cos(deg);
        }
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        state = " ";
    }

    public void cotf(View view) {
        state = "cot(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = 0;
        if (rd == false)
            ans = 1 / Math.tan(sub);
        else {
            double deg = Math.toRadians(sub);
            ans = 1 / Math.tan(deg);
        }
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        state = " ";
    }

    public void logf(View view) {
        state = "log(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = Math.log10(sub);
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        state = " ";
    }

    public void lnf(View view) {
        state = "ln(";
        equibeta();
        trigDisplay(temp);
        double sub = Double.valueOf(temp);
        double ans = Math.log(sub);
        temp = Double.toString(ans);
        display2(temp);
        tempPro=temp;
        state = " ";
    }

    public void equalsf(View view) {
        int count = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '+' || temp.charAt(i) == '-' || temp.charAt(i) == '*' || temp.charAt(i) == '^' || temp.charAt(i) == '%' || temp.charAt(i) == '/')
                count++;
        }
        if (count == 0) {
            display3(temp);
            display4("0");
        } else {
            String s = calculate(temp);

            temp = s;
            while (b1 != "0" || c1 != "0") {
                s = calculate(temp);
                temp = s;
            }

            display2(temp);
        }
    }

    public void equibeta() {
        String s = calculate(temp);
        temp = s;
        while (b1 != "0" || c1 != "0") {
            s = calculate(temp);
            temp = s;
        }
    }

    public String calculate(String s) {


        if (s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '+'|| s.charAt(s.length() - 1) == '*'|| s.charAt(s.length() - 1) == '/'|| s.charAt(s.length() - 1) == '%'|| s.charAt(s.length() - 1) == '^')
            s = s + "0";

        int con = 0;
        String ret = new String();
        String a = " ", b = "0", c = "0", s3 = "0";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '^' || s.charAt(i) == '%') {
                if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) continue;
                else con++;
            }
        }

        if (con > 0) {

            a = " ";
            b = "0";
            c = "0";

            double num1 = 0, num2 = 0, result = 0;
            String s2 = s;
            s = "0";
            for (int i = 0; i < s2.length(); i++) {
                if ((s2.charAt(i) == '^' || s2.charAt(i) == '/' || s2.charAt(i) == '*' || s2.charAt(i) == '%' || s2.charAt(i) == '+' || s2.charAt(i) == '-') && (s2.charAt(i + 1) == '+' || s2.charAt(i + 1) == '-')) {
                    if (s == "0")
                        s = Character.toString(s2.charAt(i));
                    else s += s2.charAt(i);
                    continue;
                }
                if (s2.charAt(i) == '+' || s2.charAt(i) == '-' || s2.charAt(i) == '*' || s2.charAt(i) == '/' || s2.charAt(i) == '^' || s2.charAt(i) == '%') {
                    if (s == "0")
                        s = s2.charAt(i) + "0";
                    else s += s2.charAt(i) + "0";
                } else {
                    if (s == "0")
                        s = Character.toString(s2.charAt(i));
                    else s += s2.charAt(i);
                }
            }
            //  s3 = s;

            int l1 = 0, l2 = 0;
            int temppri = 0;
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) == '-' && i == 0)) {
                    continue;
                }
                if ((s.charAt(i) == '+' || s.charAt(i) == '-') && (s.charAt(i - 1) == '^' || s.charAt(i - 1) == '/' || s.charAt(i - 1) == '*' || s.charAt(i - 1) == '%'))
                    continue;
                if (precedence(s.charAt(i)) > temppri) {
                    index = i;
                    temppri = precedence(s.charAt(i));
                }
            }


            for (int i = index - 1; i >= 0 && ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i - 1) == '*' || s.charAt(i - 1) == '/' || s.charAt(i - 1) == '^' || s.charAt(i - 1) == '%' || s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-') || s.charAt(i) == '.')); i--) {
                a += s.charAt(i);
                l1 = i;
            }
            for (int i = a.length() - 1; i >= 0; i--) {
                if (a.charAt(i) == '-' && b == "0")
                    b = "-";
                else
                    b += a.charAt(i);
            }


            for (int i = index + 1; i < s.length() && ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i - 1) == '*' || s.charAt(i - 1) == '/' || s.charAt(i - 1) == '^' || s.charAt(i - 1) == '%' || s.charAt(i - 1) == '+' || s.charAt(i - 1) == '-')) || s.charAt(i) == '.'); i++) {

                if (c == "0")
                    c = Character.toString(s.charAt(i));
                else
                    c += s.charAt(i);
                l2 = i;
            }

            num1 = Double.parseDouble(b);
            num2 = Double.parseDouble(c);

            switch (s.charAt(index)) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        Toast.makeText(this, "Cannot divide by 0", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    result = num1 / num2;
                    break;
                case '^':
                    if(num2<0) {
                        double num3 = (-1) * num2;
                        result= 1/Math.pow(num1, num3);
                    }else
                        result = Math.pow(num1, num2);
                    break;
                case '%':
                    result = num1 / 100 * num2;
                    break;
            }

            ret = Double.toString(result);
            b1 = "0";
            c1 = "0";
            for (int i = 0; i < l1; i++) {
                if (b1 == "0")
                    b1 = Character.toString(s.charAt(i));
                else
                    b1 += s.charAt(i);
            }
            for (int i = l2 + 1; i < s.length(); i++) {
                if (c1 == "0")
                    c1 = Character.toString(s.charAt(i));
                else
                    c1 += s.charAt(i);
            }
            //    return ret;
            if (b1 == "0" && c1 == "0")
                s = ret;
            else if (b1 == "0" && c1 != "0")
                s = ret + c1;
            else if (b1 != "0" && c1 == "0")
                s = b1 + ret;
            else
                s = b1 + ret + c1;
        }
        return s;
    }

    public static int precedence(char op) {

        if (op == '^') {
            return 5;
        } else if (op == '%') {
            return 4;
        } else if (op == '/' || op == '*') {
            return 3;
        } else if (op == '+' || op == '-') {
            return 2;
        } else
            return 0;
    }
}