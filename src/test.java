import java.lang.reflect.MalformedParameterizedTypeException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author sun_time
 * @version 1.0
 * @date 2022/6/9 18:05
 */
public class test {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("9");
        list.add("6");
        list.add("7");
        list.add("5");
        list.add("4");
        list.add("9");
        list.add("6");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list);
        String mo_succ_rate = "7";
        double mo_succ_rate_math = Double.valueOf(mo_succ_rate);  //字符转数字
        System.out.println(mo_succ_rate_math);
        double mo_variance = 0;
        for (int i = 0; i < list.size(); i++) {      //求差值平方和
            String p2p_submitmosuccrate = list.get(i);
            double p2p_submitmosuccrate_math = Double.valueOf(p2p_submitmosuccrate);
            mo_variance += pow((p2p_submitmosuccrate_math - mo_succ_rate_math), 2);
        }
        System.out.println(mo_variance);
        double mo_standard = sqrt(mo_variance / list.size());    //求出标准差
        BigDecimal bg = new BigDecimal(mo_standard);
        double mo_standard1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();//取小数后两位
        System.out.println(mo_standard1);
        Map<String,Object> map =new HashMap<String,Object>() ;
        map.put("mo_average",mo_succ_rate);
        map.put("mo_pone_standard","25");
        map.put("mo_ptwo_standard",56);
        map.put("mo_none_standard",24);
        map.put("mo_ntwo_standard",22);
        map.put("mt_average",10);
        map.put("mt_pone_standard",23);
        map.put("mt_ptwo_standard",22);
        map.put("mt_nonestandard",21);
        map.put("mt_ntwo_standard",20);
        System.out.println(map);


    }
}
