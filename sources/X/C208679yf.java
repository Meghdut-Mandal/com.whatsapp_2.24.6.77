package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.9yf  reason: invalid class name and case insensitive filesystem */
public class C208679yf implements C22855Ax5 {
    public static final C208679yf A00 = new C208679yf();
    public static final C197499bo A01 = C197499bo.A01("c", "v", "i", "o");

    public static PointF A00(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public /* bridge */ /* synthetic */ Object BlD(C21655ATw aTw, float f) {
        C21655ATw aTw2 = aTw;
        if (aTw2.A0H() == C023109s.A00) {
            aTw2.A0L();
        }
        aTw2.A0M();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (aTw2.A0S()) {
            int A0F = aTw2.A0F(A01);
            if (A0F != 0) {
                float f2 = f;
                if (A0F == 1) {
                    arrayList = C202379li.A03(aTw2, f2);
                } else if (A0F == 2) {
                    arrayList2 = C202379li.A03(aTw2, f2);
                } else if (A0F != 3) {
                    aTw2.A0P();
                    aTw2.A0Q();
                } else {
                    arrayList3 = C202379li.A03(aTw2, f2);
                }
            } else {
                z = aTw2.A0T();
            }
        }
        aTw2.A0O();
        if (aTw2.A0H() == C023109s.A01) {
            aTw2.A0N();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw AnonymousClass001.A08("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new C198769eA(new PointF(), Collections.emptyList(), false);
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList A14 = C36441kJ.A14(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                PointF pointF3 = C200579hd.A00;
                A14.add(new C198759e9(A00((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), A00(pointF2, (PointF) arrayList2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF4 = (PointF) arrayList.get(0);
                int i3 = size - 1;
                PointF pointF5 = C200579hd.A00;
                A14.add(new C198759e9(A00((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), A00(pointF4, (PointF) arrayList2.get(0)), pointF4));
            }
            return new C198769eA(pointF, A14, z);
        }
    }
}
