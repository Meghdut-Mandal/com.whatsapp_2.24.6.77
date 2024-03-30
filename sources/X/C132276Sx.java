package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Sx  reason: invalid class name and case insensitive filesystem */
public class C132276Sx {
    public static final List A0B;
    public int A00 = 0;
    public int A01 = 0;
    public List A02;
    public final AnonymousClass5FV A03;
    public final C160867li A04;
    public final AnonymousClass5FX A05;
    public final C117505mN A06;
    public final AnonymousClass7h2 A07;
    public final AnonymousClass5FW A08;
    public final List A09 = Collections.unmodifiableList(C36441kJ.A15(A0B));
    public final AtomicInteger A0A = new AtomicInteger(Integer.MIN_VALUE);

    public static synchronized void A00(C132276Sx r2, int i) {
        synchronized (r2) {
            C36321k7.A1T("GoogleMigrate/setCurrentScreen = ", AnonymousClass000.A0u(), i);
            r2.A01 = i;
        }
    }

    public void A01(int i, int i2, int i3) {
        double A012;
        double d = (((double) i2) * 1.0d) / ((double) i3);
        synchronized (this) {
            if (this.A02 == null) {
                List list = this.A09;
                ArrayList A0I = AnonymousClass001.A0I();
                double d2 = 0.0d;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    A0I.add(Double.valueOf(d2));
                    d2 += ((Double) list.get(i4)).doubleValue();
                }
                A0I.add(Double.valueOf(d2));
                this.A02 = Collections.unmodifiableList(A0I);
            }
        }
        List list2 = this.A09;
        if (i >= list2.size()) {
            A012 = 1.0d;
        } else {
            double min = Math.min(Math.max(0.0d, d), 1.0d);
            A012 = (C90504aG.A01(this.A02.get(i)) + (C90504aG.A01(list2.get(i)) * min)) / C90504aG.A01(this.A02.get(list2.size()));
        }
        int i5 = (int) (A012 * 100.0d);
        if (i5 != this.A0A.getAndSet(i5)) {
            Iterator A0s = C36361kB.A0s(this.A05);
            while (A0s.hasNext()) {
                ((C160867li) A0s.next()).Bdg(i5);
            }
        }
    }

    public C132276Sx(AnonymousClass5FV r3, AnonymousClass5FX r4, AnonymousClass5FW r5) {
        this.A05 = r4;
        this.A03 = r3;
        this.A08 = r5;
        this.A06 = new C117505mN(this);
        this.A07 = new C146866wI(this);
        this.A04 = new C146856wH(this);
    }

    static {
        ArrayList A0I = AnonymousClass001.A0I();
        Double valueOf = Double.valueOf(0.5d);
        A0I.add(valueOf);
        A0I.add(valueOf);
        A0B = Collections.unmodifiableList(A0I);
    }
}
