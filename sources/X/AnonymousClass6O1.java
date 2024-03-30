package X;

import java.util.UUID;

/* renamed from: X.6O1  reason: invalid class name */
public final class AnonymousClass6O1 {
    public String A00;
    public final C20810yC A01;
    public final C21010yW A02;

    public static void A00(AnonymousClass6O1 r2, int i, int i2) {
        r2.A02(new Integer(i), 1, i2);
    }

    public final void A02(Integer num, int i, int i2) {
        if (this.A01.A0E(7503)) {
            AnonymousClass589 r1 = new AnonymousClass589();
            String str = this.A00;
            if (str != null) {
                r1.A05 = str;
            }
            r1.A03 = Integer.valueOf(i);
            r1.A02 = num;
            r1.A01 = Integer.valueOf(i2);
            this.A02.Blw(r1);
        }
    }

    public final void A03(Integer num, int i, int i2, int i3, boolean z) {
        String str;
        if (this.A01.A0E(7503)) {
            if (z) {
                str = "2";
            } else {
                str = "1";
            }
            this.A00 = AnonymousClass000.A0o(UUID.randomUUID(), AnonymousClass000.A0v(str));
            AnonymousClass589 r1 = new AnonymousClass589();
            r1.A05 = this.A00;
            r1.A01 = Integer.valueOf(i2);
            r1.A00 = Integer.valueOf(i3);
            r1.A02 = Integer.valueOf(i);
            r1.A04 = num;
            r1.A03 = C36371kC.A0p();
            this.A02.Blw(r1);
        }
    }

    public AnonymousClass6O1(C20810yC r1, C21010yW r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }

    public static void A01(AnonymousClass6O1 r1, int i, int i2, int i3) {
        r1.A02(Integer.valueOf(i), i2, i3);
    }
}
