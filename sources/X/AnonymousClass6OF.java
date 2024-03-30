package X;

import java.util.Random;

/* renamed from: X.6OF  reason: invalid class name */
public class AnonymousClass6OF {
    public Integer A00 = null;
    public String A01;
    public Random A02;
    public final C20810yC A03;
    public final C21010yW A04;

    public void A02(int i, long j, long j2) {
        Integer num;
        if (i == 1 || (num = this.A00) == null || num.intValue() != 4) {
            C1040758e r1 = new C1040758e();
            r1.A01 = 4;
            r1.A06 = Long.valueOf(j);
            r1.A08 = Long.valueOf(j2);
            r1.A04 = Integer.valueOf(i);
            A00(r1, this);
        }
    }

    public void A01(int i) {
        C1040758e r1 = new C1040758e();
        r1.A01 = Integer.valueOf(i);
        r1.A03 = C36381kD.A0m();
        A00(r1, this);
    }

    public AnonymousClass6OF(C20810yC r2, C21010yW r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    public static void A00(C1040758e r1, AnonymousClass6OF r2) {
        r1.A02 = C36381kD.A0m();
        r1.A0A = r2.A01;
        r2.A04.Bly(r1);
        r2.A00 = r1.A01;
    }
}
