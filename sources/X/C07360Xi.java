package X;

/* renamed from: X.0Xi  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C07360Xi {
    public static final C13010j1 A01(Object obj, AnonymousClass040 r8, AnonymousClass05H r9, C17380rC r10) {
        Integer num;
        AnonymousClass0TE A02 = A02(r9, 1);
        Object obj2 = obj;
        AnonymousClass05N A00 = AnonymousClass05E.A00(obj);
        C005102h r1 = A02.A02;
        AnonymousClass05H r5 = A02.A03;
        C17380rC r7 = r10;
        if (AnonymousClass00C.A0J(r10, AnonymousClass0W6.A00)) {
            num = C023109s.A00;
        } else {
            num = C023109s.A0G;
        }
        return new C13010j1(AnonymousClass0A2.A02(num, r1, new C14210lG(obj2, (C023509x) null, r5, A00, r7), r8), A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r2 == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r8 == 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r4 = (X.C13130jD) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0TE A02(X.AnonymousClass05H r7, int r8) {
        /*
            r6 = 1
            X.0W2 r0 = X.C18010sR.A00
            int r0 = X.AnonymousClass0W2.A00
            r5 = r8
            if (r8 >= r0) goto L_0x0009
            r5 = r0
        L_0x0009:
            int r5 = r5 - r8
            boolean r0 = r7 instanceof X.C13130jD
            if (r0 == 0) goto L_0x003a
            r4 = r7
            X.0jD r4 = (X.C13130jD) r4
            X.05H r3 = r4.A03()
            if (r3 == 0) goto L_0x003a
            int r2 = r4.A00
            r0 = -3
            if (r2 == r0) goto L_0x002c
            r0 = -2
            if (r2 == r0) goto L_0x002c
            if (r2 == 0) goto L_0x002c
            r6 = r2
        L_0x0022:
            java.lang.Integer r1 = r4.A01
            X.02h r0 = r4.A02
            X.0TE r2 = new X.0TE
            r2.<init>(r1, r0, r3, r6)
            return r2
        L_0x002c:
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x0037
            r6 = r5
            if (r2 != 0) goto L_0x0022
        L_0x0035:
            r6 = 0
            goto L_0x0022
        L_0x0037:
            if (r8 != 0) goto L_0x0035
            goto L_0x0022
        L_0x003a:
            java.lang.Integer r1 = X.C023109s.A00
            X.03u r0 = X.C008903u.A00
            X.0TE r2 = new X.0TE
            r2.<init>(r1, r0, r7, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07360Xi.A02(X.05H, int):X.0TE");
    }

    public static final C13000j0 A00(AnonymousClass040 r8, AnonymousClass05H r9, C17380rC r10, int i) {
        Integer num;
        AnonymousClass0TE A02 = A02(r9, i);
        int i2 = A02.A00;
        Integer num2 = A02.A01;
        if (i2 < 0) {
            throw AnonymousClass000.A0d("extraBufferCapacity cannot be negative, but was ", AnonymousClass000.A0u(), i2);
        } else if (i > 0 || i2 > 0 || num2 == C023109s.A00) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            C15350nC r6 = new C15350nC(num2, i, i3);
            C005102h r1 = A02.A02;
            AnonymousClass05H r5 = A02.A03;
            AnonymousClass035 r3 = AnonymousClass0RX.A00;
            C17380rC r7 = r10;
            if (AnonymousClass00C.A0J(r10, AnonymousClass0W6.A00)) {
                num = C023109s.A00;
            } else {
                num = C023109s.A0G;
            }
            return new C13000j0(AnonymousClass0A2.A02(num, r1, new C14210lG(r3, (C023509x) null, r5, r6, r7), r8), r6);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            throw AnonymousClass000.A0c(C05740Qw.A00(num2), A0u);
        }
    }
}
