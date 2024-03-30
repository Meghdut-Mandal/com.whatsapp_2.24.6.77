package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1E1  reason: invalid class name */
public final class AnonymousClass1E1 {
    public final C19600wD A00;
    public final C21010yW A01;
    public final C18950u5 A02;
    public final C20810yC A03;

    public AnonymousClass1E1(C19600wD r4, C20810yC r5, C21010yW r6) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A03 = r5;
        this.A01 = r6;
        this.A00 = r4;
        int A002 = C20800yB.A00(C21000yV.A02, r5, 5506);
        this.A02 = new C18950u5(A002, A002, A002, true);
    }

    public final List A00(List list) {
        if (list != null && !list.isEmpty()) {
            if (C20800yB.A01(C21000yV.A02, this.A03, 5367)) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    String str = (String) next;
                    if (!AnonymousClass14B.A0F(str)) {
                        C18950u5 r0 = this.A02;
                        if (str == null) {
                            if (!r0.A00()) {
                            }
                        } else if (str.hashCode() % r0.A00 != 0) {
                        }
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        }
        return C023409w.A00;
    }

    public final void A01(AnonymousClass6AN r4) {
        AnonymousClass590 r0 = r4.A00;
        C21010yW r2 = this.A01;
        r2.Bly(r0);
        for (C20890yK Bly : r4.A01) {
            r2.Bly(Bly);
        }
    }
}
