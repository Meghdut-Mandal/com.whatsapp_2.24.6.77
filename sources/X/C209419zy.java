package X;

import com.facebook.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* renamed from: X.9zy  reason: invalid class name and case insensitive filesystem */
public final class C209419zy implements C160837lf {
    public C202249lP A00;
    public final Object A01;
    public final /* synthetic */ C1690082w A02;

    public C209419zy(C1690082w r5, Object obj) {
        this.A02 = r5;
        this.A00 = new C202249lP((AnonymousClass9WT) null, r5.A03.A02, 0);
        this.A01 = obj;
    }

    private AnonymousClass9NR A00(AnonymousClass9NR r11) {
        long j = r11.A04;
        long j2 = r11.A03;
        if (j == j && j2 == j2) {
            return r11;
        }
        int i = r11.A00;
        int i2 = r11.A02;
        return new AnonymousClass9NR(r11.A05, r11.A06, i, i2, r11.A01, j, j2);
    }

    private boolean A01(AnonymousClass9WT r8, int i) {
        if (r8 != null) {
            C1690082w r0 = this.A02;
            Object obj = this.A01;
            if (r0 instanceof C1689982v) {
                C21662AUe aUe = (C21662AUe) obj;
                int i2 = 0;
                while (true) {
                    List list = aUe.A04;
                    if (i2 >= list.size()) {
                        return false;
                    }
                    if (((C209359zs) list.get(i2)).A04.A03 == r8.A03) {
                        r8 = r8.A00(r8.A02 + aUe.A01);
                        break;
                    }
                    i2++;
                }
            }
        } else {
            r8 = null;
        }
        C1690082w r2 = this.A02;
        Object obj2 = this.A01;
        if (r2 instanceof C1689982v) {
            i += ((C21662AUe) obj2).A02;
        }
        C202249lP r1 = this.A00;
        if (r1.A00 == i && Util.A0E(r1.A01, r8)) {
            return true;
        }
        this.A00 = new C202249lP(r8, r2.A03.A02, i);
        return true;
    }

    public void BWA(AnonymousClass9WT r3, AnonymousClass9NR r4, int i) {
        if (A01(r3, i)) {
            this.A00.A0A(A00(r4));
        }
    }

    public void BZq(AnonymousClass9WT r3, C191069Bl r4, AnonymousClass9NR r5, int i) {
        if (A01(r3, i)) {
            this.A00.A06(r4, A00(r5));
        }
    }

    public void BZs(AnonymousClass9WT r3, C191069Bl r4, AnonymousClass9NR r5, Object obj, Object obj2, int i) {
        if (A01(r3, i)) {
            this.A00.A09(r4, A00(r5), obj);
        }
    }

    public void BZv(AnonymousClass9WT r3, C191069Bl r4, AnonymousClass9NR r5, IOException iOException, int i, boolean z) {
        if (A01(r3, i)) {
            this.A00.A08(r4, A00(r5), iOException, z);
        }
    }

    public void Ba2(AnonymousClass9WT r3, C191069Bl r4, AnonymousClass9NR r5, int i) {
        if (A01(r3, i)) {
            this.A00.A07(r4, A00(r5));
        }
    }

    public void BaX(AnonymousClass9WT r2, int i) {
        if (A01(r2, i)) {
            this.A00.A02();
        }
    }

    public void BaY(AnonymousClass9WT r2, int i) {
        if (A01(r2, i)) {
            this.A00.A03();
        }
    }

    public void BeB(AnonymousClass9WT r2, int i) {
        if (A01(r2, i)) {
            this.A00.A04();
        }
    }
}
