package X;

/* renamed from: X.0n8  reason: invalid class name */
public class AnonymousClass0n8 extends C12960iw {
    public final Integer A00;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        return new X.AnonymousClass0n9(A0I());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A05(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r16
            java.lang.Integer r1 = r10.A00
            java.lang.Integer r0 = X.C023109s.A0C
            r8 = r17
            if (r1 != r0) goto L_0x0019
            java.lang.Object r1 = super.BwE(r8)
            boolean r0 = r1 instanceof X.C06340Tf
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1 instanceof X.AnonymousClass0n9
            if (r0 == 0) goto L_0x009e
        L_0x0018:
            return r1
        L_0x0019:
            X.035 r9 = X.AnonymousClass0SC.A03
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C12960iw.A09
            X.0nX r11 = X.AnonymousClass001.A0K(r10, r0)
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C12960iw.A04
            long r0 = r0.getAndIncrement(r10)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r0 & r2
            r2 = 0
            boolean r15 = X.C12960iw.A0G(r10, r0, r2)
            int r6 = X.AnonymousClass0SC.A01
            long r0 = (long) r6
            long r2 = r13 / r0
            long r4 = r13 % r0
            int r12 = (int) r4
            long r4 = r11.A00
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0054
            X.0nX r2 = X.C12960iw.A07(r10, r11, r2)
            if (r2 != 0) goto L_0x0053
            if (r15 == 0) goto L_0x0021
        L_0x0049:
            java.lang.Throwable r0 = r10.A0I()
            X.0n9 r1 = new X.0n9
            r1.<init>(r0)
            return r1
        L_0x0053:
            r11 = r2
        L_0x0054:
            int r3 = X.C12960iw.A00(r8, r9, r10, r11, r12, r13, r15)
            if (r3 == 0) goto L_0x0085
            r2 = 1
            if (r3 == r2) goto L_0x009e
            r2 = 2
            if (r3 == r2) goto L_0x0078
            r0 = 3
            if (r3 == r0) goto L_0x007e
            r0 = 4
            if (r3 == r0) goto L_0x006a
            r11.A01()
            goto L_0x0021
        L_0x006a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C12960iw.A03
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            r11.A01()
            goto L_0x0049
        L_0x0078:
            if (r15 == 0) goto L_0x0089
            r11.A05()
            goto L_0x0049
        L_0x007e:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0085:
            r11.A01()
            goto L_0x009e
        L_0x0089:
            boolean r2 = r9 instanceof X.AnonymousClass0AQ
            if (r2 == 0) goto L_0x0096
            X.0AQ r9 = (X.AnonymousClass0AQ) r9
            if (r9 == 0) goto L_0x0096
            int r2 = r12 + r6
            r9.BL2(r11, r2)
        L_0x0096:
            long r2 = r11.A00
            long r2 = r2 * r0
            long r0 = (long) r12
            long r2 = r2 + r0
            r10.A0J(r2)
        L_0x009e:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0n8.A05(java.lang.Object):java.lang.Object");
    }

    public boolean A0L() {
        if (this.A00 == C023109s.A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass0n8(int i, Integer num) {
        super(i);
        this.A00 = num;
        if (num == C023109s.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("This implementation does not support suspension for senders, use ");
            A0u.append(new C019308f(C12960iw.class).BHa());
            throw AnonymousClass000.A0c(" instead", A0u);
        } else if (i < 1) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Buffered channel capacity must be at least 1, but ");
            A0u2.append(i);
            throw AnonymousClass000.A0c(" was specified", A0u2);
        }
    }

    public Object Bpf(Object obj, C023509x r3) {
        if (!(A05(obj) instanceof AnonymousClass0n9)) {
            return AnonymousClass0AJ.A00;
        }
        throw A0I();
    }

    public Object BwE(Object obj) {
        return A05(obj);
    }
}
