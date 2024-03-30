package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3d3  reason: invalid class name and case insensitive filesystem */
public final class C69143d3 implements C19710wO, C159417jK {
    public final AnonymousClass16D A00;
    public final C19970wo A01;
    public final C20810yC A02;

    public String BIB() {
        return "CleanupExpiredTS";
    }

    public /* synthetic */ void BRL() {
    }

    private final void A00() {
        if (this.A02.A0E(4921)) {
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass16D r9 = this.A00;
            ArrayList A0H = r9.A0H();
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A0H.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass141 r1 = (AnonymousClass141) next;
                if (r1.A0Y != null && r1.A0D > 0) {
                    A0I2.add(next);
                }
            }
            Iterator it2 = A0I2.iterator();
            while (it2.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it2);
                if (C19970wo.A00(this.A01) > A0f.A0D) {
                    A0f.A0X = null;
                    A0f.A0Y = "";
                    A0f.A0D = 0;
                    A0I.add(A0f);
                }
            }
            r9.A0l(A0I);
        }
    }

    public C69143d3(AnonymousClass16D r1, C19970wo r2, C20810yC r3) {
        C36321k7.A11(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BRM() {
        A00();
    }

    public void BV1() {
        A00();
    }
}
