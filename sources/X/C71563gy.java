package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3gy  reason: invalid class name and case insensitive filesystem */
public final class C71563gy implements C159417jK {
    public final C596334r A00;
    public final AnonymousClass3DF A01;
    public final AnonymousClass2aK A02;
    public final AnonymousClass2aL A03;
    public final AnonymousClass3DE A04;

    public void BV1() {
        if (this.A04.A01.A0E(3981)) {
            AnonymousClass2aK r7 = this.A02;
            ArrayList A042 = r7.A04();
            ArrayList<C63493Kg> A0I = AnonymousClass001.A0I();
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C63493Kg r12 = (C63493Kg) next;
                C596334r r2 = this.A00;
                AnonymousClass00C.A0B(r12);
                AnonymousClass00C.A0D(r12, 0);
                if (r12.A01.ordinal() == 0) {
                    AnonymousClass3DE r22 = r2.A00;
                    int A002 = r22.A00("dc_days_delay", 7);
                    int A003 = r22.A00("dc_days_length", 2);
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    long millis = timeUnit.toMillis((long) A002);
                    if (System.currentTimeMillis() > r12.A00 + millis + timeUnit.toMillis((long) A003)) {
                        A0I.add(next);
                    }
                } else {
                    throw C36441kJ.A18();
                }
            }
            for (C63493Kg r0 : A0I) {
                r7.A05(r0.A02);
            }
            AnonymousClass2aL r5 = this.A03;
            ArrayList A043 = r5.A04();
            ArrayList<C63363Jt> A0I2 = AnonymousClass001.A0I();
            Iterator it2 = A043.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                C63363Jt r3 = (C63363Jt) next2;
                AnonymousClass3DF r02 = this.A01;
                C36361kB.A1I(r3);
                if (System.currentTimeMillis() > r3.A00 + TimeUnit.DAYS.toMillis((long) r02.A00.A00("survey_expiry_days", 30))) {
                    A0I2.add(next2);
                }
            }
            for (C63363Jt r03 : A0I2) {
                r5.A05(r03.A02);
            }
        }
    }

    public C71563gy(AnonymousClass3DE r1, C596334r r2, AnonymousClass3DF r3, AnonymousClass2aK r4, AnonymousClass2aL r5) {
        C36321k7.A19(r5, r3, r4, r2);
        this.A04 = r1;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
