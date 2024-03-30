package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.64B  reason: invalid class name */
public final class AnonymousClass64B {
    public int A00;
    public final int A01;
    public final HashMap A02;
    public final List A03;
    public final List A04;
    public final AnonymousClass00T A05;

    public final boolean A00(int i, int i2) {
        int i3;
        HashMap hashMap = this.A02;
        C120635rp r5 = (C120635rp) C90484aE.A0j(hashMap, i);
        if (r5 == null) {
            return false;
        }
        int i4 = r5.A01;
        int i5 = i2 - r5.A00;
        r5.A00 = i2;
        if (i5 == 0) {
            return true;
        }
        Iterator A10 = C36391kE.A10(hashMap);
        while (A10.hasNext()) {
            C120635rp r1 = (C120635rp) A10.next();
            if (r1.A01 >= i4 && !r1.equals(r5) && (i3 = r1.A01 + i5) >= 0) {
                r1.A01 = i3;
            }
        }
        return true;
    }

    public AnonymousClass64B(List list, int i) {
        this.A03 = list;
        this.A01 = i;
        if (i >= 0) {
            this.A04 = AnonymousClass001.A0I();
            HashMap A0J = AnonymousClass001.A0J();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C122025uB r1 = (C122025uB) this.A03.get(i3);
                Integer valueOf = Integer.valueOf(r1.A01);
                int i4 = r1.A02;
                A0J.put(valueOf, new C120635rp(i3, i2, i4));
                i2 += i4;
            }
            this.A02 = A0J;
            this.A05 = C36431kI.A1I(new C151987It(this));
            return;
        }
        throw AnonymousClass001.A08("Invalid start index");
    }
}
