package X;

import java.util.ArrayList;

/* renamed from: X.0jD  reason: invalid class name and case insensitive filesystem */
public abstract class C13130jD implements AnonymousClass05M {
    public final int A00;
    public final Integer A01;
    public final C005102h A02;

    public abstract Object A00(C023509x r1, C18000sQ r2);

    public String A01() {
        return null;
    }

    public AnonymousClass05H A03() {
        return null;
    }

    public abstract C13130jD A04(Integer num, C005102h r2, int i);

    public Object B36(C023509x r3, AnonymousClass05G r4) {
        return AnonymousClass0AO.A00(C009403z.A00(r3, new C14150lA((C023509x) null, r4, this)));
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String A012 = A01();
        if (A012 != null) {
            arrayList.add(A012);
        }
        C005102h r2 = this.A02;
        if (r2 != C008903u.A00) {
            arrayList.add(AnonymousClass000.A0l(r2, "context=", AnonymousClass000.A0u()));
        }
        int i = this.A00;
        if (i != -3) {
            arrayList.add(AnonymousClass000.A0r("capacity=", AnonymousClass000.A0u(), i));
        }
        Integer num = this.A01;
        if (num != C023109s.A00) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("onBufferOverflow=");
            arrayList.add(AnonymousClass000.A0q(C05740Qw.A00(num), A0u));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u2);
        A0u2.append('[');
        A0u2.append(C007103b.A0Q(", ", "", "", arrayList, (C006302t) null));
        return AnonymousClass000.A0t(A0u2, ']');
    }

    public C17330r7 A02(AnonymousClass040 r7) {
        C005102h r5 = this.A02;
        int i = this.A00;
        if (i == -3) {
            i = -2;
        }
        Integer num = this.A01;
        Integer num2 = C023109s.A0C;
        AnonymousClass0l4 r3 = new AnonymousClass0l4((C023509x) null, this);
        C15150mm r0 = new C15150mm(AnonymousClass0A3.A01(r5, r7), C05750Qx.A00(num, i));
        r0.A0x(num2, r0, r3);
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r1 >= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass05H B7l(java.lang.Integer r6, X.C005102h r7, int r8) {
        /*
            r5 = this;
            X.02h r4 = r5.A02
            X.02h r3 = r7.plus(r4)
            int r1 = r5.A00
            r2 = r1
            r0 = -3
            if (r1 == r0) goto L_0x001a
            if (r8 == r0) goto L_0x0019
            r0 = -2
            if (r1 == r0) goto L_0x001a
            if (r8 == r0) goto L_0x0019
            int r1 = r1 + r8
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < 0) goto L_0x001a
        L_0x0019:
            r8 = r1
        L_0x001a:
            java.lang.Integer r1 = r5.A01
            boolean r0 = X.AnonymousClass00C.A0J(r3, r4)
            if (r0 == 0) goto L_0x0027
            if (r8 != r2) goto L_0x0027
            if (r1 != r1) goto L_0x0027
            return r5
        L_0x0027:
            X.0jD r0 = r5.A04(r1, r3, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13130jD.B7l(java.lang.Integer, X.02h, int):X.05H");
    }

    public C13130jD(Integer num, C005102h r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = num;
    }
}
