package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6rX  reason: invalid class name and case insensitive filesystem */
public final class C144046rX implements C159397jI {
    public final C123745x1 A00;
    public final C130896Mv A01;
    public final AnonymousClass16D A02;
    public final C24541Cv A03;
    public final Collection A04;
    public final AnonymousClass040 A05;

    public C144046rX(C123745x1 r1, C130896Mv r2, AnonymousClass16D r3, C24541Cv r4, Collection collection, AnonymousClass040 r6) {
        C36321k7.A11(r3, r4, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = collection;
    }

    private final ArrayList A00() {
        AnonymousClass3T1 A06;
        ArrayList A0I = AnonymousClass001.A0I();
        C130896Mv r5 = this.A01;
        Iterator A13 = C90514aH.A13(r5.A02.getValue());
        while (A13.hasNext()) {
            AnonymousClass6X6 r9 = (AnonymousClass6X6) A13.next();
            C123745x1 r4 = this.A00;
            AnonymousClass00C.A0B(r9);
            C24541Cv r2 = this.A03;
            AnonymousClass00C.A0D(r9, 1);
            if (r9.A08.size() <= 32 && (A06 = r2.A06(r9.A05, true)) != null && A06.A0I >= r4.A02) {
                AnonymousClass040 r8 = this.A05;
                C20760y7 A052 = r9.A05();
                AnonymousClass00C.A08(A052);
                AnonymousClass16D r0 = this.A02;
                Collection collection = this.A04;
                ArrayList A002 = AnonymousClass6Gx.A00(r0, collection, A052);
                if (r4.A04.contains(C108295Sy.GROUP_CHAT_MEMBERS) && A002.size() > 1) {
                    AnonymousClass03X.A08(A002, new AnonymousClass75Z(r4, r5, collection, r8));
                }
                A0I.addAll(A002);
            }
        }
        return A0I;
    }

    public C1278569x BOH() {
        return new C1278569x(this, C110315aT.A00(A00()));
    }

    public C1278569x BOI() {
        return new C1278569x(this, A00());
    }
}
