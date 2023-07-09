package org.codewithmosh.behavioural.template.main;

import org.codewithmosh.behavioural.template.TransferMoney;

public class TemplateMain {

    public static void main(String[] args) {
        var task = new TransferMoney();
        //if I create the TemplateMain inside the org.codewithmosh.behavioural.template
        // package then protected method doExecute is accessible. Thats why created a
        // new main package inside the org.codewithmosh.behavioural.template package
        task.execute();
    }
}
