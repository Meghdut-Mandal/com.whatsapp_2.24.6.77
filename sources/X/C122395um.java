package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5um  reason: invalid class name and case insensitive filesystem */
public final class C122395um {
    public final C123745x1 A00;
    public final List A01 = AnonymousClass001.A0I();
    public final List A02 = AnonymousClass001.A0I();
    public final List A03 = AnonymousClass001.A0I();

    public C122395um(C123745x1 r8, List list) {
        List list2;
        AnonymousClass00C.A0D(r8, 1);
        this.A00 = r8;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C107265Nh r5 = (C107265Nh) it.next();
            if (!r5.A0R() && r5.A01 >= this.A00.A01 && r5.A0C().size() <= 32) {
                if (!r5.A0M()) {
                    list2 = this.A03;
                } else if (r5.A0D == null && r5.A0M()) {
                    list2 = this.A01;
                } else if (r5.A0D != null) {
                    list2 = this.A02;
                }
                list2.add(r5);
            }
        }
    }
}
