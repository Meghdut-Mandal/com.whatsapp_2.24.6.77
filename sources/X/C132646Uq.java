package X;

/* renamed from: X.6Uq  reason: invalid class name and case insensitive filesystem */
public class C132646Uq {
    public static final C132646Uq A04;
    public static final C132646Uq A05;
    public static final C132646Uq A06;
    public final AnonymousClass6FX A00;
    public final AnonymousClass6FX A01;
    public final AnonymousClass6FX A02;
    public final AnonymousClass6FX A03;

    static {
        C94564iQ r2 = C114185go.A0G;
        A05 = new C94574iR(r2);
        AnonymousClass6FX r1 = C114185go.A02;
        A06 = new C132646Uq(r2, r1);
        A04 = new C132646Uq(r1, r2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C132646Uq(X.AnonymousClass6FX r7, X.AnonymousClass6FX r8) {
        /*
            r6 = this;
            long r1 = r7.A01
            long r4 = X.AnonymousClass6J1.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            X.6EN r1 = X.C114055gZ.A01
            X.9bl r0 = X.C197469bl.A01
            X.6FX r3 = A00(r0, r7, r1)
        L_0x0010:
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            X.6EN r1 = X.C114055gZ.A01
            X.9bl r0 = X.C197469bl.A01
            X.6FX r0 = A00(r0, r8, r1)
        L_0x001e:
            r6.<init>(r7, r8, r3, r0)
            return
        L_0x0022:
            r0 = r8
            goto L_0x001e
        L_0x0024:
            r3 = r7
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132646Uq.<init>(X.6FX, X.6FX):void");
    }

    public static final AnonymousClass6FX A00(C197469bl r11, AnonymousClass6FX r12, AnonymousClass6EN r13) {
        if (r12.A01 == AnonymousClass6J1.A01) {
            C94564iQ r3 = (C94564iQ) r12;
            AnonymousClass6EN r4 = r3.A07;
            AnonymousClass6EN r7 = r13;
            if (!AnonymousClass6VY.A02(r4, r13)) {
                float[] A042 = AnonymousClass6VY.A04(AnonymousClass6VY.A05(r11.A00, r4.A00(), r13.A00()), r3.A0D);
                String str = r3.A02;
                float[] fArr = r3.A0C;
                return new C94564iQ(r3.A05, r3.A03, r3.A06, r7, str, fArr, A042, r3.A01, r3.A00, -1);
            }
        }
        return r12;
    }

    public C132646Uq(AnonymousClass6FX r1, AnonymousClass6FX r2, AnonymousClass6FX r3, AnonymousClass6FX r4) {
        this.A03 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }
}
