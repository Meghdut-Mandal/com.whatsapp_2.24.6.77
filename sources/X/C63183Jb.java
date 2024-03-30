package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Jb  reason: invalid class name and case insensitive filesystem */
public class C63183Jb {
    public final int A00;
    public final ArrayList A01 = AnonymousClass001.A0I();
    public final List A02;
    public final boolean A03;

    public String A01(AnonymousClass27v r2) {
        return C36361kB.A0m(r2, this.A00);
    }

    public C63183Jb(int i, List list, boolean z) {
        this.A02 = list;
        this.A00 = i;
        this.A03 = z;
    }

    public static void A00(C63183Jb r1, AnonymousClass141 r2, List list, Set set) {
        if (list.contains(r2) && !C007103b.A0j(set, r2.A0H)) {
            r1.A01.add(r2);
            AnonymousClass11F r0 = r2.A0H;
            if (r0 != null) {
                set.add(r0);
            }
        }
    }
}
