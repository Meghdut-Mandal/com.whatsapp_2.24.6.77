package X;

import java.util.Map;

/* renamed from: X.3L6  reason: invalid class name */
public class AnonymousClass3L6 {
    public final AnonymousClass173 A00;
    public final C20810yC A01;
    public final Map A02 = AnonymousClass001.A0J();

    public void A00(int i, String str, String str2) {
        Map map = this.A02;
        C21700zf r2 = (C21700zf) map.get(str);
        if (r2 == null) {
            AnonymousClass173 r3 = this.A00;
            C21710zg r22 = new C21710zg(i);
            if (this.A01.A0E(1272)) {
                r22.A04 = true;
            }
            r2 = r3.A01(r22, str);
            map.put(str, r2);
        }
        r2.A0D(str2, -1);
    }

    public void A01(String str) {
        C21700zf r1 = (C21700zf) this.A02.get(str);
        if (r1 != null) {
            r1.A06("datasource");
        }
    }

    public void A02(String str) {
        C21700zf r1 = (C21700zf) this.A02.get(str);
        if (r1 != null) {
            r1.A07("datasource");
        }
    }

    public void A03(String str, String str2, String str3) {
        C21700zf r1 = (C21700zf) this.A02.get(str);
        if (r1 != null) {
            r1.A0A(str2, str3, true);
        }
    }

    public void A04(String str, String str2, boolean z) {
        C21700zf r1 = (C21700zf) this.A02.get(str);
        if (r1 != null) {
            r1.A0B(str2, z, true);
        }
    }

    public void A05(String str, boolean z) {
        Map map = this.A02;
        C21700zf r1 = (C21700zf) map.get(str);
        if (r1 != null) {
            short s = 3;
            if (z) {
                s = 2;
            }
            r1.A0C(s);
            map.remove(str);
        }
    }

    public AnonymousClass3L6(AnonymousClass173 r2, C20810yC r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
