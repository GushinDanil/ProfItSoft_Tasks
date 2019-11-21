
import java.lang.reflect.Method;


public class Functions {
  private   String regex="[AEYUIOaeyuio]" ,regexAlf="[A-Z][a-z]";
  private int index=0;
  private  StringBuilder sb =new StringBuilder();



    public String Encoding(char a)
    {
/**
 * Сделал заготовку для результата и перевёл символ в двоичный код
 */
        String result="00 0";

        String s = Integer.toBinaryString(a);



/**
 * Прохожусь по двоичному коду если элемент равен 0
 * то сразу добавляю два нуля( 00 -с разграничениями )
 * и запускаю цикл если после нуля есть ещё нули если есть соответствующее кол-во добавляю уже без двух нулей
 *
 *Аналогично всё сделано в случае если я встречаю в строке 1 только шифрование другое( 0 )
 */
        for (int i = 0; i <s.length() ; i++) {
            int j=i;
            if (s.charAt(i)=='0')
            {
                result+=" 00 ";


                while (j!=s.length()-1 && s.charAt(++j)!='1'  )
                {


                ++i;
                result+="0";
                }


                result+="0";



            }
            else if(s.charAt(i)=='1')
            {
                result+=" 0 ";

                while (j!=s.length()-1 && s.charAt(++j)!='0' )
                {


                    ++i;
                    result+="0";
                }


                result+="0";
            }


        }

        return  result;
    }


    public String Star(String str) {
/**
 проверка на то что строка действительно состоит только из латиницы
 */
        if (str.matches("[a-z,A-Z]*")) {
/**
 * проверка на выход за пределы строки
 */
            if (index < str.length()) {

                /**
                 * проверка если символ гласный то дописываем звёзды если нет просто добавляем в строку результата
                 */
  if (String.valueOf(str.charAt(index)).matches(regex)) {
/**
 * проверка если первый элемент гласный или предыдущий элемент на текущей итерации равен *
 * то мы добавляем звезду только после гласной буквы а перед ней нет
 * иначе добавляем звёзды с двух сторон
 */
                    if ( sb.length()-1>0 && sb.charAt(sb.length()-1 ) == '*') {
                        sb .append( str.charAt(index) + "*");
                    } else {

                       sb.append( "*" + str.charAt(index) + "*");
                    }
                } else {
                    sb.append( str.charAt(index));
                }
/**
 * берём следующий элемент и делаем аналогичные проверки
 */
                index++;
                Star(str);
            }

/**
 * Затираю звёзды в начале и конце строки если необходимо
 */
            if (sb.charAt(0)=='*')

            {
                sb.deleteCharAt(0);
            }else if(sb.charAt(sb.length()-1)=='*')
            {

                sb.deleteCharAt(sb.length()-1);
            }
            String res= sb.toString();

            return res;
        }

        return  "It's not Latina alphabet";
    }




}

