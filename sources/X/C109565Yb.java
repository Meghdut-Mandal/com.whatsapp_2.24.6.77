package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5Yb  reason: invalid class name and case insensitive filesystem */
public abstract class C109565Yb {
    public static void A00(C157887eq r3, AnonymousClass6MU r4, File file) {
        ArrayList A0g = C90494aF.A0g(r4.A01);
        if (!A0g.isEmpty()) {
            Iterator it = A0g.iterator();
            while (it.hasNext()) {
                C125255za r1 = (C125255za) it.next();
                C157877ep B3b = r3.B3b(r1);
                if (B3b != null) {
                    B3b.BcH(r4, r1, file);
                }
            }
        }
    }
}
