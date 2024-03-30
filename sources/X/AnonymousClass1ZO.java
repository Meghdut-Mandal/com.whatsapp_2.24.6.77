package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ZO  reason: invalid class name */
public final class AnonymousClass1ZO {
    public long A00;
    public final C220412q A01;
    public final C20810yC A02;
    public final AnonymousClass1ZS A03;
    public final AnonymousClass1ZQ A04;
    public final List A05 = new ArrayList();
    public final C19970wo A06;
    public final AnonymousClass1ZR A07;

    public AnonymousClass1ZO(C19970wo r2, C220412q r3, C20810yC r4, AnonymousClass1ZR r5, AnonymousClass1ZS r6, AnonymousClass1ZQ r7) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r6, 6);
        this.A06 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r7;
        this.A07 = r5;
        this.A03 = r6;
    }

    public final List A00(List list) {
        AnonymousClass00C.A0D(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65073Qp A09 = this.A01.A09(((C65073Qp) it.next()).A06(), false);
            if ((A09 instanceof C44072La) && A09 != null) {
                arrayList.add(A09);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (((C44072La) next).A0N()) {
                arrayList2.add(next);
            }
        }
        arrayList2.size();
        return arrayList2;
    }
}
