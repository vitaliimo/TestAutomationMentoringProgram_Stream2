package homework5.Kateryna;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static Map<String, String> main(String[] args) {
        Map<String, String> getSubtotals;
        {
            Map<String, String> valuesMap = new HashMap<String, String>();
            getEmailContent().select(SUBTOTAL_PRICE_ROW_CSS).stream().forEach(e -> valuesMap.put(element.select(FIRST_COLUMN).text(), element.select(SECOND_COLUMN).text()));
            return valuesMap;
        }
    }
}
// new HashMap було оголошено без типів даних K, V
// у forEach методі e у лямбда виразі можна записати без дужок
