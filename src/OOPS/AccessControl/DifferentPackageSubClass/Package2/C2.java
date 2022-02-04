package OOPS.AccessControl.DifferentPackageSubClass.Package2;

import OOPS.AccessControl.DifferentPackageSubClass.Package1.C1;

public class C2 extends C1 {
    void display() {
        System.out.println(publicB);
        System.out.println(protectedC);
        /*
        System.out.println(defaultA);
        System.out.println(privateD);

        'private' and 'default' access modifier restricts the
        visibility of any member in the sub-class (when they are in
        different packages)
         */
    }
}
