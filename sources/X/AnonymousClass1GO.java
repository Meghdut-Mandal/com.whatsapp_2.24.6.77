package X;

import android.content.SharedPreferences;

/* renamed from: X.1GO  reason: invalid class name */
public final class AnonymousClass1GO {
    public final C20690y0 A00;
    public final C21100yf A01;
    public final C19600wD A02;
    public final C20060wx A03;
    public final C20810yC A04;
    public final AnonymousClass1D5 A05;
    public final AnonymousClass1GR A06;
    public final AnonymousClass1GP A07;
    public final AnonymousClass1GU A08;
    public final AnonymousClass1D1 A09;
    public final C19420v0 A0A;
    public final C220412q A0B;

    public AnonymousClass1GO(C20690y0 r2, C21100yf r3, C19600wD r4, C19420v0 r5, C20060wx r6, C220412q r7, C20810yC r8, AnonymousClass1D5 r9, AnonymousClass1GR r10, AnonymousClass1GP r11, AnonymousClass1GU r12, AnonymousClass1D1 r13) {
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r13, 6);
        AnonymousClass00C.A0D(r9, 7);
        AnonymousClass00C.A0D(r5, 8);
        AnonymousClass00C.A0D(r4, 10);
        this.A04 = r8;
        this.A0B = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r6;
        this.A09 = r13;
        this.A05 = r9;
        this.A0A = r5;
        this.A07 = r11;
        this.A02 = r4;
        this.A06 = r10;
        this.A08 = r12;
    }

    private final boolean A00(AnonymousClass11F r9) {
        if (r9 == null) {
            return false;
        }
        C220412q r4 = this.A0B;
        if (r4.A02(r9) < 5) {
            return false;
        }
        long j = ((SharedPreferences) this.A0A.A00.get()).getLong("last_read_conversation_time", 0);
        C65073Qp r0 = (C65073Qp) C220412q.A00(r4).get(r9);
        if (r0 == null) {
            return false;
        }
        long j2 = r0.A0Y;
        return j2 != 0 && j2 + 86400000 < j;
    }

    public final boolean A01(AnonymousClass11F r7, C25471Gl r8, int i, int i2, long j, boolean z) {
        AnonymousClass00C.A0D(r8, 1);
        if (!AnonymousClass6Y1.A07(r8)) {
            if (AnonymousClass02R.A0F(r8, new C25471Gl[]{C25471Gl.A0D, C25471Gl.A0J, C25471Gl.A0l})) {
                if (i2 <= 0 || j >= ((long) i2) || i2 > 35000 || i == 3 || A00(r7)) {
                    return false;
                }
                return true;
            } else if ((r8 == C25471Gl.A0i || r8 == C25471Gl.A0c || r8 == C25471Gl.A0X) && z && j < 262144 && (this.A08.A00() & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (i2 >= 0) {
            long j2 = (long) i2;
            if (j < j2 && !A00(r7)) {
                if (i == 3) {
                    if ((this.A08.A00() & 1) != 0) {
                        return true;
                    }
                    return false;
                } else if (j2 < 102400) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C25471Gl r12, int r13, long r14, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r11 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r12, r4)
            X.0wD r0 = r11.A02
            r1 = r16
            int r5 = r0.A03(r1)
            boolean r0 = X.AnonymousClass6Y1.A07(r12)
            r3 = 1
            if (r0 == 0) goto L_0x001b
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
        L_0x001a:
            return r4
        L_0x001b:
            X.0wx r0 = r11.A03
            long r9 = r0.A01()
            X.0yC r1 = r11.A04
            r0 = 1291(0x50b, float:1.809E-42)
            X.0yV r2 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r2, r1, r0)
            long r0 = (long) r0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r7
            long r0 = r0 + r14
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x001a
            X.0yf r1 = r11.A01
            if (r5 != r3) goto L_0x0195
            X.0yh r0 = X.C21100yf.A1e
        L_0x003b:
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            long r0 = r0 * r7
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x001a
            if (r18 == 0) goto L_0x0064
            if (r19 == 0) goto L_0x0064
            r6 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = X.AnonymousClass02R.A0F(r0, r1)
            if (r0 == 0) goto L_0x0064
        L_0x0062:
            r4 = 1
            return r4
        L_0x0064:
            X.1GU r5 = r11.A08
            int r1 = r12.A00
            if (r1 == 0) goto L_0x00ef
            if (r1 == r3) goto L_0x00ef
            r0 = 2
            if (r1 == r0) goto L_0x00ec
            r0 = 3
            if (r1 == r0) goto L_0x00e9
            r0 = 9
            if (r1 == r0) goto L_0x00e6
            r0 = 13
            if (r1 == r0) goto L_0x00e3
            r0 = 20
            if (r1 == r0) goto L_0x00e0
            r0 = 23
            if (r1 == r0) goto L_0x00ef
            r0 = 37
            if (r1 == r0) goto L_0x00ef
            r0 = 57
            if (r1 == r0) goto L_0x00ef
            r0 = 25
            if (r1 == r0) goto L_0x00ef
            r0 = 26
            if (r1 == r0) goto L_0x00dd
            r0 = 28
            if (r1 == r0) goto L_0x00e9
            r0 = 29
            if (r1 == r0) goto L_0x00e3
            r0 = 42
            if (r1 == r0) goto L_0x00ef
            r0 = 43
            if (r1 == r0) goto L_0x00e9
            r0 = 62
            if (r1 == r0) goto L_0x00e9
            r0 = 63
            if (r1 == r0) goto L_0x00dd
            r0 = 81
            if (r1 == r0) goto L_0x00e9
            r0 = 82
            if (r1 == r0) goto L_0x00ec
            X.8eH r1 = X.C177728eH.A00
        L_0x00b4:
            X.8eB r0 = X.C177668eB.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00f2
            int r0 = r5.A00()
            r0 = r0 & 2
            r4 = 1
            if (r0 != 0) goto L_0x001a
            if (r13 != r3) goto L_0x019f
            X.0yC r1 = r5.A02
            r0 = 6040(0x1798, float:8.464E-42)
            int r0 = X.C20800yB.A00(r2, r1, r0)
            long r0 = (long) r0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            X.0wD r0 = r5.A01
            int r0 = r0.A03(r3)
            if (r0 != r3) goto L_0x019f
            return r4
        L_0x00dd:
            X.8eG r1 = X.C177718eG.A00
            goto L_0x00b4
        L_0x00e0:
            X.8eF r1 = X.C177708eF.A00
            goto L_0x00b4
        L_0x00e3:
            X.8eD r1 = X.C177688eD.A00
            goto L_0x00b4
        L_0x00e6:
            X.8eC r1 = X.C177678eC.A00
            goto L_0x00b4
        L_0x00e9:
            X.8eI r1 = X.C177738eI.A00
            goto L_0x00b4
        L_0x00ec:
            X.8eB r1 = X.C177668eB.A00
            goto L_0x00b4
        L_0x00ef:
            X.8eE r1 = X.C177698eE.A00
            goto L_0x00b4
        L_0x00f2:
            X.8eC r0 = X.C177678eC.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x011f
            X.0yf r1 = r5.A00
            X.0yh r0 = X.C21100yf.A1f
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            r6 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r6
            r4 = 1
            r2 = 7
            if (r13 != r2) goto L_0x0118
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0118
            X.0wD r0 = r5.A01
            int r1 = r0.A03(r3)
            r0 = 3
            if (r1 == r0) goto L_0x0118
            return r4
        L_0x0118:
            int r0 = r5.A00()
            r0 = r0 & 8
            goto L_0x014d
        L_0x011f:
            X.8eD r0 = X.C177688eD.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x013e
            X.0yC r1 = r5.A02
            r0 = 6041(0x1799, float:8.465E-42)
            int r0 = X.C20800yB.A00(r2, r1, r0)
            long r2 = (long) r0
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            int r0 = r5.A00()
            if (r1 <= 0) goto L_0x0169
            r0 = r0 & 4
        L_0x013a:
            if (r0 == 0) goto L_0x001a
            goto L_0x0062
        L_0x013e:
            X.8eE r0 = X.C177698eE.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0150
            int r0 = r5.A00()
            r4 = 1
            r0 = r0 & 1
        L_0x014d:
            if (r0 == 0) goto L_0x019f
            return r4
        L_0x0150:
            X.8eF r0 = X.C177708eF.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x016c
            if (r17 == 0) goto L_0x015c
            if (r20 == 0) goto L_0x0165
        L_0x015c:
            X.0wD r0 = r5.A01
            int r1 = r0.A03(r3)
            r0 = 3
            if (r1 != r0) goto L_0x0062
        L_0x0165:
            int r0 = r5.A00()
        L_0x0169:
            r0 = r0 & 1
            goto L_0x013a
        L_0x016c:
            X.8eG r0 = X.C177718eG.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x017e
            int r0 = r5.A00()
            r0 = r0 & 8
        L_0x017a:
            if (r0 == 0) goto L_0x019f
            goto L_0x0062
        L_0x017e:
            X.8eH r0 = X.C177728eH.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x019f
            X.8eI r0 = X.C177738eI.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0199
            int r0 = r5.A00()
            r0 = r0 & 4
            goto L_0x017a
        L_0x0195:
            X.0yh r0 = X.C21100yf.A1d
            goto L_0x003b
        L_0x0199:
            X.0jS r0 = new X.0jS
            r0.<init>()
            throw r0
        L_0x019f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GO.A02(X.1Gl, int, long, boolean, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (((X.C46962bx) r11).A1l() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.AnonymousClass2bU r11) {
        /*
            r10 = this;
            r5 = 0
            boolean r1 = r11 instanceof X.C46962bx
            if (r1 == 0) goto L_0x000c
            r0 = r11
            X.2bx r0 = (X.C46962bx) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0014
        L_0x000c:
            X.3Qj r0 = r11.A01
            if (r0 == 0) goto L_0x003f
            int r0 = r0.A04
            if (r0 <= 0) goto L_0x003f
        L_0x0014:
            r6 = 1
        L_0x0015:
            if (r1 == 0) goto L_0x0021
            r0 = r11
            X.2bx r0 = (X.C46962bx) r0
            boolean r0 = r0.A1l()
            r9 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            X.1Gl r1 = X.AnonymousClass6Y1.A02(r11)
            X.AnonymousClass00C.A08(r1)
            long r3 = r11.A00
            int r2 = r11.A09
            X.3Qa r0 = r11.A1J
            X.11F r0 = r0.A00
            boolean r7 = r0 instanceof X.C177528dw
            X.11F r0 = r11.A0J()
            boolean r8 = r0 instanceof X.C177638e7
            r0 = r10
            boolean r0 = r0.A02(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L_0x003f:
            r6 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GO.A03(X.2bU):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (X.C65703Td.A01(r12.A04, r13) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r9 > 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.AnonymousClass2bU r13, int r14) {
        /*
            r12 = this;
            X.3Qj r3 = r13.A01
            r0 = 0
            if (r3 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r4 = r12
            X.1D5 r0 = r12.A05
            java.lang.String r2 = r3.A0L
            if (r2 == 0) goto L_0x002c
            X.1DE r1 = r0.A0H
            r0 = 1
            X.5z2 r0 = r1.A03(r2, r0)
            if (r0 == 0) goto L_0x002c
            r1 = 0
            long r9 = r0.A0A
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
        L_0x001e:
            boolean r0 = r13 instanceof X.C46882bp
            r1 = 1
            if (r0 == 0) goto L_0x0042
            X.1GP r0 = r12.A07
            boolean r0 = r0.A00(r13)
            if (r0 == 0) goto L_0x0042
            return r1
        L_0x002c:
            X.3Qa r0 = r13.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x003f
            X.0y0 r2 = r12.A00
            X.0yC r1 = r12.A04
            X.0wx r0 = r12.A03
            long r9 = X.AnonymousClass6YC.A02(r2, r0, r1, r13)
            goto L_0x001e
        L_0x003f:
            r9 = 0
            goto L_0x001e
        L_0x0042:
            X.3Qa r0 = r13.A1J
            X.11F r5 = r0.A00
            boolean r0 = r5 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0069
            r8 = 262144(0x40000, float:3.67342E-40)
        L_0x004c:
            X.1Gl r6 = X.AnonymousClass6Y1.A02(r13)
            X.AnonymousClass00C.A08(r6)
            boolean r0 = X.AnonymousClass3T2.A04(r13)
            if (r0 != 0) goto L_0x0062
            X.0yC r0 = r12.A04
            boolean r0 = X.C65703Td.A01(r0, r13)
            r11 = 0
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r11 = 1
        L_0x0063:
            r7 = r14
            boolean r1 = r4.A01(r5, r6, r7, r8, r9, r11)
            return r1
        L_0x0069:
            int r8 = r3.A04
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GO.A04(X.2bU, int):boolean");
    }
}
