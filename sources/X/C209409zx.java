package X;

import java.io.IOException;

/* renamed from: X.9zx  reason: invalid class name and case insensitive filesystem */
public class C209409zx implements C160837lf {
    public C195979Xa A00;
    public final C204369pt A01;
    public final AUR A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public void BWA(AnonymousClass9WT r1, AnonymousClass9NR r2, int i) {
    }

    public void BZq(AnonymousClass9WT r1, C191069Bl r2, AnonymousClass9NR r3, int i) {
    }

    public void Ba2(AnonymousClass9WT r1, C191069Bl r2, AnonymousClass9NR r3, int i) {
    }

    public void BaX(AnonymousClass9WT r1, int i) {
    }

    public void BaY(AnonymousClass9WT r1, int i) {
    }

    public void BeB(AnonymousClass9WT r1, int i) {
    }

    public void BZv(AnonymousClass9WT r7, C191069Bl r8, AnonymousClass9NR r9, IOException iOException, int i, boolean z) {
        int i2 = r9.A00;
        if (this.A04 && r9.A02 == 3 && i2 == 1 && (iOException instanceof AnonymousClass83K) && ((AnonymousClass83K) iOException).responseCode == 404) {
            this.A01.A0M();
        }
        if (this.A06 && r9.A02 == 3 && i2 == 1 && (iOException instanceof AnonymousClass83K) && ((AnonymousClass83K) iOException).responseCode >= 500) {
            this.A01.A0M();
        }
        if (this.A03 && r9.A02 == 3 && i2 == 2 && (iOException instanceof AnonymousClass83K) && ((AnonymousClass83K) iOException).responseCode == 404) {
            this.A01.A0M();
        }
        if (this.A05 && r9.A02 == 3 && i2 == 2 && (iOException instanceof AnonymousClass83K) && ((AnonymousClass83K) iOException).responseCode >= 500) {
            this.A01.A0M();
        }
    }

    public C209409zx(C204369pt r1, AUR aur, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r1;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z4;
        this.A06 = z3;
        this.A02 = aur;
    }

    public void BZs(AnonymousClass9WT r2, C191069Bl r3, AnonymousClass9NR r4, Object obj, Object obj2, int i) {
    }
}
