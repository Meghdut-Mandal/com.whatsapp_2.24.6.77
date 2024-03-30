package X;

import java.util.Map;

/* renamed from: X.3Pr  reason: invalid class name and case insensitive filesystem */
public class C64853Pr {
    public Map A00;
    public final C20810yC A01;

    public synchronized int A01(C47002cZ r11) {
        int i;
        long j;
        AnonymousClass00I r0;
        long j2;
        AnonymousClass00I r02;
        synchronized (this) {
            C20810yC r1 = this.A01;
            if (r1.A0E(2281)) {
                int A07 = r1.A07(3683);
                double A0B = (double) (C36441kJ.A0B(r1, 3684) * 1000);
                if (r11.A0B <= 1) {
                    j2 = 600;
                } else {
                    j2 = ((long) r11.A0B) * 1000;
                }
                i = Math.min(A07, (int) Math.ceil(A0B / ((double) j2)));
                Map map = this.A00;
                if (!(map == null || (r02 = (AnonymousClass00I) map.get(r11.A1J)) == null)) {
                    i -= ((Integer) r02.A01).intValue();
                }
            } else {
                if (r11.A0B <= 1) {
                    j = 600;
                } else {
                    j = C36371kC.A07(r11.A0B);
                }
                i = Math.max(3, (int) Math.ceil(6000.0d / ((double) j)));
                Map map2 = this.A00;
                if (!(map2 == null || (r0 = (AnonymousClass00I) map2.get(r11.A1J)) == null)) {
                    i -= ((Integer) r0.A01).intValue();
                }
            }
        }
        return i;
    }

    public synchronized void A02(C64933Qa r4) {
        Map map = this.A00;
        if (map == null) {
            map = AnonymousClass001.A0J();
            this.A00 = map;
        }
        map.put(r4, C36441kJ.A0W(C36411kG.A0t(), C36381kD.A0m()));
    }

    public synchronized void A03(C64933Qa r2) {
        Map map = this.A00;
        if (map != null) {
            map.remove(r2);
        }
    }

    public static boolean A00(C20810yC r4, int i, long j) {
        int i2;
        if (!r4.A0E(2281)) {
            if (j >= 6000) {
                i2 = 3;
            }
            return true;
        } else if (j >= C36371kC.A07(r4.A07(3684))) {
            return false;
        } else {
            i2 = r4.A07(3683);
        }
        if (i < i2) {
            return true;
        }
        return false;
    }

    public C64853Pr(C20810yC r1) {
        this.A01 = r1;
    }
}
