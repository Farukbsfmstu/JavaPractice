package LinklistHasmap;

import java.util.LinkedList;

/**
 *
 * @author Faruk Ahmad
 */
public class LinkList3Test {

    public static void main(String args[]) {

        LinkedList<LinkList3> FA = new LinkedList<LinkList3>();

        LinkList3 ob = new LinkList3(19111123, 21, "Faruk ahmad");
        LinkList3 ob1 = new LinkList3(19111111, 22, "Prem");
        LinkList3 ob3 = new LinkList3(124579325, 25, "M item");

        FA.add(ob);
        FA.add(ob1);
        FA.add(ob3);

        for (LinkList3 A : FA) {
            System.out.println("id" + A.id + "age" + A.age + "Name" + A.name);
        }

    }                                                                                                              
}
