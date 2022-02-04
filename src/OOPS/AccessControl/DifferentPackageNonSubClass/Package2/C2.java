package OOPS.AccessControl.DifferentPackageNonSubClass.Package2;

import OOPS.AccessControl.DifferentPackageNonSubClass.Package1.C1;

public class C2 {
    void display() {
        System.out.println(C1.publicB);
        /*
        System.out.println(C1.protectedC);
        System.out.println(C1.defaultA);
        System.out.println(C1.privateD);
        'private', 'protected', and 'default' access modifier
        restricts the visibility of any member in the non sub-class
        (when they are in different packages)
         */
    }
}
