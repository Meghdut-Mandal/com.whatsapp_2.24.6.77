package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6E4  reason: invalid class name */
public class AnonymousClass6E4 {
    public static int A0C;
    public double A00;
    public double A01;
    public double A02 = 0.0d;
    public C130156Jy A03;
    public CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A05;
    public boolean A06 = true;
    public final C118615oR A07 = new C118615oR();
    public final C118615oR A08 = new C118615oR();
    public final C118615oR A09 = new C118615oR();
    public final AnonymousClass6OB A0A;
    public final String A0B;

    public void A00(double d) {
        this.A01 = d;
        C118615oR r3 = this.A07;
        r3.A00 = d;
        this.A0A.A01(this.A0B);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C159067ik) it.next()).Bgx(this);
        }
        double d2 = r3.A00;
        this.A00 = d2;
        this.A09.A00 = d2;
        r3.A01 = 0.0d;
    }

    public void A01(double d) {
        if (this.A00 != d || !A02()) {
            this.A01 = this.A07.A00;
            this.A00 = d;
            this.A0A.A01(this.A0B);
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public boolean A02() {
        C118615oR r6 = this.A07;
        if (Math.abs(r6.A01) > 0.005d) {
            return false;
        }
        if (C90504aG.A00(this.A00, r6.A00) <= 0.005d || this.A03.A01 == 0.0d) {
            return true;
        }
        return false;
    }

    public AnonymousClass6E4(AnonymousClass6OB r4) {
        this.A0A = r4;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("spring:");
        int i = A0C;
        A0C = i + 1;
        this.A0B = C36381kD.A10(A0u, i);
        this.A03 = C130156Jy.A02;
    }
}
