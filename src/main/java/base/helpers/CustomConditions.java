package base.helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebElementCondition;
import org.checkerframework.checker.units.qual.C;

public class CustomConditions {
    public static WebElementCondition inputCondition =
            Condition.and("input condition", Condition.visible, Condition.enabled);
        public static WebElementCondition hidden =
            Condition.and("buutons hidden condition ", Condition.hidden, Condition.enabled, Condition.not(Condition.visible));
    public static WebElementCondition buttonsCondition =
            Condition.and("buttons visible condition", Condition.visible, Condition.clickable);
    public static WebElementCondition fieldsCondition =
            Condition.and("input condition", Condition.visible, Condition.empty);



}
