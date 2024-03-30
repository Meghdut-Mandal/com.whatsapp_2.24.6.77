package X;

/* renamed from: X.6Uz  reason: invalid class name and case insensitive filesystem */
public class C132726Uz {
    public final C21010yW A00;
    public final C29741Xu A01;
    public final C20810yC A02;
    public volatile Boolean A03;

    public static boolean A02(C132726Uz r2) {
        if (r2.A03 == null) {
            synchronized (r2) {
                r2.A03 = C36391kE.A0q(r2.A02, 2755);
            }
        }
        return Boolean.TRUE.equals(r2.A03);
    }

    public C132726Uz(C20810yC r1, C21010yW r2, C29741Xu r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935 || hashCode != 3005871 || !str.equals("auto")) {
                return 3;
            }
            return 1;
        } else if (str.equals("on")) {
            return 2;
        } else {
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r7 == 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C132726Uz r5, java.lang.String r6, int r7, int r8, long r9, boolean r11, boolean r12) {
        /*
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x006c
            X.58n r4 = new X.58n
            r4.<init>()
            r2 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A09 = r0
            X.1Xu r0 = r5.A01
            java.lang.Long r0 = r0.A00
            r4.A0G = r0
            int r0 = X.C36391kE.A00(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A07 = r0
            r0 = 100
            r1 = 0
            if (r7 == r0) goto L_0x002a
            r0 = 1
            if (r7 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A05 = r0
            int r0 = A00(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0A = r0
            if (r12 == 0) goto L_0x003e
            r2 = 1
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A0C = r0
            double r2 = (double) r9
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r4.A06 = r0
            java.lang.String r0 = ""
            r4.A0H = r0
            java.lang.Long r0 = X.C36411kG.A0t()
            r4.A0E = r0
            X.0yW r0 = r5.A00
            r0.Blv(r4)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132726Uz.A01(X.6Uz, java.lang.String, int, int, long, boolean, boolean):void");
    }

    public void A03(int i) {
        if (A02(this)) {
            C1041658n r3 = new C1041658n();
            r3.A09 = C36361kB.A0i();
            if (i == 1 || i == 2 || i == 3) {
                C29741Xu r2 = this.A01;
                r2.A00 = Long.valueOf(r2.A01.nextLong());
            }
            r3.A0G = this.A01.A00;
            r3.A08 = Integer.valueOf(i);
            this.A00.Blv(r3);
        }
    }

    public void A04(boolean z, int i) {
        if (A02(this)) {
            C1041658n r1 = new C1041658n();
            r1.A0G = this.A01.A00;
            r1.A02 = C36371kC.A0m();
            r1.A09 = C36371kC.A0o();
            r1.A0B = Integer.valueOf(C36371kC.A00(z ? 1 : 0));
            r1.A0F = C36441kJ.A0y(i);
            this.A00.Blv(r1);
        }
    }
}
