package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;

public final class A1L implements C159027if {
    public final /* synthetic */ A1K A00;
    public final /* synthetic */ AnonymousClass00S A01;

    public void BiH(Map map) {
        A1K a1k = this.A00;
        SortedSet sortedSet = a1k.A08;
        sortedSet.clear();
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            int A08 = C165577te.A08(A11);
            int i = a1k.A05;
            if (i <= a1k.A04 && A08 % i == 1) {
                C36411kG.A1T(A1G, A11);
            }
        }
        ArrayList A14 = C36441kJ.A14(A1G.size());
        Iterator A0y2 = AnonymousClass000.A0y(A1G);
        while (A0y2.hasNext()) {
            AnonymousClass000.A1F(A14, C165577te.A08(AnonymousClass000.A11(A0y2)));
        }
        sortedSet.addAll(A14);
        LinkedHashMap A1G2 = C36431kI.A1G();
        Iterator A0y3 = AnonymousClass000.A0y(map);
        while (A0y3.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y3);
            if (!sortedSet.contains(A112.getKey())) {
                C36411kG.A1T(A1G2, A112);
            }
        }
        if (!a1k.A06.BR8(A1G2)) {
            a1k.A00 = SystemClock.uptimeMillis() + A1K.A0C;
        }
        a1k.A09.set(false);
    }

    public A1L(A1K a1k, AnonymousClass00S r2) {
        this.A00 = a1k;
        this.A01 = r2;
    }

    public void BXF() {
        A1K a1k = this.A00;
        a1k.A06.clear();
        a1k.A09.set(false);
    }
}
