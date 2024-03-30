package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3EM  reason: invalid class name */
public final class AnonymousClass3EM {
    public final C19630wG A00;
    public final AnonymousClass005 A01;
    public final C35061i5 A02;
    public final AnonymousClass005 A03;

    public AnonymousClass3EM(C19630wG r2, C35061i5 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        C36321k7.A0x(r2, r4);
        AnonymousClass00C.A0D(r5, 4);
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r3;
        this.A03 = r5;
    }

    public final boolean A00(int i, Collection collection) {
        C35061i5 r4;
        ArrayList arrayList;
        if (!collection.isEmpty() && AnonymousClass6Y4.A08(collection)) {
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!AnonymousClass6Y4.A07(C36391kE.A0l(it))) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    Context context = this.A00.A00;
                    AnonymousClass00C.A08(context);
                    if ((C55962vT.A00(context) || C36431kI.A10(this.A01).A06(AnonymousClass1US.CROSSPOST_ENTRY_POINT_MANAGER)) && !AnonymousClass6Y4.A09(collection)) {
                        r4 = this.A02;
                        arrayList = C36351kA.A0z(collection);
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            C36391kE.A1W(arrayList, C36391kE.A0l(it2).A1N);
                        }
                    }
                } else {
                    Context context2 = this.A00.A00;
                    AnonymousClass00C.A08(context2);
                    if (C55962vT.A00(context2) && !C36431kI.A10(this.A01).A06(AnonymousClass1US.CROSSPOST_ENTRY_POINT_MANAGER) && !AnonymousClass6Y4.A09(collection) && ((C51062nA) this.A03.get()).A04()) {
                        r4 = this.A02;
                        arrayList = C36351kA.A0z(collection);
                        Iterator it3 = collection.iterator();
                        while (it3.hasNext()) {
                            C36391kE.A1W(arrayList, C36391kE.A0l(it3).A1N);
                        }
                    }
                }
                if (r4.A00(arrayList)) {
                    return true;
                }
            } else {
                Context context3 = this.A00.A00;
                AnonymousClass00C.A08(context3);
                if (C55962vT.A00(context3) || C36431kI.A10(this.A01).A06(AnonymousClass1US.CROSSPOST_ENTRY_POINT_MANAGER)) {
                    C35061i5 r6 = this.A02;
                    ArrayList A0z = C36351kA.A0z(collection);
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        C36391kE.A1W(A0z, C36391kE.A0l(it4).A1N);
                    }
                    Iterator it5 = A0z.iterator();
                    while (it5.hasNext()) {
                        long A0D = C36391kE.A0D(it5);
                        C35071i6 r2 = r6.A00;
                        if (!r2.A03(A0D)) {
                            return true;
                        }
                        Integer A012 = r2.A01(A0D);
                        if (A012 != null && 4 == A012.intValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
