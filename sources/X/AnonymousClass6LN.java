package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6LN  reason: invalid class name */
public final class AnonymousClass6LN {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1DU A01;
    public final C34931hs A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;

    public AnonymousClass6LN(AnonymousClass17Y r2, AnonymousClass1DU r3, C34931hs r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7) {
        C36321k7.A1B(r2, r3, r4, r5, r6);
        AnonymousClass00C.A0D(r7, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
    }

    public static final void A00(C108475Tq r7, AnonymousClass6LN r8, List list, Map map, int i) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = map.get(Long.valueOf(C36391kE.A0D(it)));
            if (obj == null) {
                C18740tg.A0D(false, "CrosspostRequestManager/Cannot find corresponding messageRowId for given uniqueId");
            } else {
                A0I.add(obj);
            }
        }
        AnonymousClass17Y r5 = r8.A00;
        C34931hs r4 = r8.A02;
        AnonymousClass005 r1 = r8.A04;
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass6VF r3 = (AnonymousClass6VF) r1.get();
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("state", Integer.valueOf(i));
        r3.A03().A03(r7, A0I, i);
        AnonymousClass6VF.A01(A0E, r7, r3, A0I);
        C1498172w.A01(r5, r4, A0I, 44);
    }
}
