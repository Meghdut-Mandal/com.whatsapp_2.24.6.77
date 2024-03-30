package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1EM  reason: invalid class name */
public class AnonymousClass1EM {
    public final C220412q A00;
    public final AnonymousClass17X A01;
    public final C19730wQ A02;
    public final C20810yC A03;
    public final AnonymousClass1EL A04;

    public boolean A02(int i) {
        if (i == 6 && A01()) {
            if (!C20800yB.A01(C21000yV.A02, this.A03, 5021)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A01() {
        C20810yC r3 = this.A03;
        C21000yV r2 = C21000yV.A02;
        boolean A012 = C20800yB.A01(r2, r3, 982);
        if (!this.A02.A0L()) {
            return A012;
        }
        if (!A012 || !C20800yB.A01(r2, r3, 2695)) {
            return false;
        }
        return true;
    }

    public AnonymousClass1EM(C19730wQ r1, C220412q r2, AnonymousClass17X r3, C20810yC r4, AnonymousClass1EL r5) {
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A04 = r5;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r3.A00.A05(r4) != 2) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.AnonymousClass147 r4) {
        /*
            r3 = this;
            boolean r0 = r3.A06(r4)
            if (r0 == 0) goto L_0x0008
            r1 = 4
        L_0x0007:
            return r1
        L_0x0008:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x002d
            X.12q r0 = r3.A00
            int r2 = r0.A05(r4)
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = 2
            if (r0 != 0) goto L_0x0007
            if (r4 == 0) goto L_0x002d
            X.12q r0 = r3.A00
            int r0 = r0.A05(r4)
            boolean r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x002d
            return r1
        L_0x002d:
            boolean r0 = r3.A05(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EM.A00(X.147):int");
    }

    public boolean A03(int i) {
        if (!A01() || i != 1) {
            return false;
        }
        return true;
    }

    public boolean A04(AnonymousClass141 r5, AnonymousClass11F r6) {
        int i;
        if (r5.A0G() && AnonymousClass143.A0G(r6)) {
            AnonymousClass1EL r1 = this.A04;
            if (r1.A01(r5) || r1.A00(r5) || (i = r5.A03) == 1 || i == 2 || (r5.A0d && !this.A01.A0D((GroupJid) r6))) {
                return true;
            }
        }
        return false;
    }

    public boolean A05(AnonymousClass147 r4) {
        if (!A01() || r4 == null || this.A00.A05(r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A06(AnonymousClass147 r3) {
        if (!A01() || r3 == null || this.A00.A05(r3) != 1) {
            return false;
        }
        return true;
    }
}
