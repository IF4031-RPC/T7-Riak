/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if4031.t7.riak;

/**
 *
 * @author Imballinst
 */
import java.util.List;

public class StringUtil {
    public static String Join(String separator, List<String> values) {
        if(values == null || separator == null) throw new NullPointerException();

        if(values.size() == 0) return "";
        if(values.size() == 1) return values.get(0);

        StringBuilder sb = new StringBuilder();
        sb.append(values.get(0));

        for(int i=1; i<values.size(); i++) {
            sb.append(separator);
            sb.append(values.get(i));
        }

        return sb.toString();
    }

}