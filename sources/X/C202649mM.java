package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9mM  reason: invalid class name and case insensitive filesystem */
public final class C202649mM {
    public static final C202649mM A03 = new C202649mM(true);
    public boolean A00;
    public boolean A01;
    public final C21889AcH A02 = new C173548Sc(16);

    public C202649mM(boolean z) {
        A02();
        A02();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r4.Bxe(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r2.A0H((X.C21674AUx) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r2.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r2.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        if (r0 >= 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        r0 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        r2.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        r2.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.google.protobuf.CodedOutputStream r2, X.C188558zm r3, java.lang.Object r4, int r5) {
        /*
            X.8zm[] r0 = X.C188558zm.A00
            int r1 = r3.wireType
            int r0 = r5 << 3
            r0 = r0 | r1
            r2.A08(r0)
            int[] r1 = X.AnonymousClass99R.A00
            int r0 = r3.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0016;
                case 2: goto L_0x001f;
                case 3: goto L_0x0028;
                case 4: goto L_0x0028;
                case 5: goto L_0x00a8;
                case 6: goto L_0x0086;
                case 7: goto L_0x007e;
                case 8: goto L_0x002d;
                case 9: goto L_0x0036;
                case 10: goto L_0x0039;
                case 11: goto L_0x004a;
                case 12: goto L_0x0054;
                case 13: goto L_0x0079;
                case 14: goto L_0x007e;
                case 15: goto L_0x0086;
                case 16: goto L_0x00ad;
                case 17: goto L_0x008e;
                case 18: goto L_0x0097;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            double r0 = X.C90504aG.A01(r4)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            goto L_0x008a
        L_0x001f:
            float r0 = X.C36441kJ.A03(r4)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x0082
        L_0x0028:
            long r0 = X.C36431kI.A09(r4)
            goto L_0x00a4
        L_0x002d:
            boolean r0 = X.AnonymousClass000.A1X(r4)
            byte r0 = (byte) r0
            r2.A06(r0)
            return
        L_0x0036:
            X.B63 r4 = (X.B63) r4
            goto L_0x0046
        L_0x0039:
            X.B63 r4 = (X.B63) r4
            r1 = r4
            X.A7h r1 = (X.C21070A7h) r1
            r0 = 0
            int r0 = r1.A0k(r0)
            r2.A08(r0)
        L_0x0046:
            r4.Bxe(r2)
            return
        L_0x004a:
            boolean r0 = r4 instanceof X.C21674AUx
            if (r0 != 0) goto L_0x0073
            java.lang.String r4 = (java.lang.String) r4
            r2.A0K(r4)
            return
        L_0x0054:
            boolean r0 = r4 instanceof X.C21674AUx
            if (r0 != 0) goto L_0x0073
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = r2 instanceof X.AnonymousClass8IB
            if (r0 == 0) goto L_0x0069
            X.8IB r2 = (X.AnonymousClass8IB) r2
            r0 = 0
            r2.A08(r1)
            r2.A0Q(r4, r0, r1)
            return
        L_0x0069:
            X.8IA r2 = (X.AnonymousClass8IA) r2
            r0 = 0
            r2.A08(r1)
            r2.A0M(r4, r0, r1)
            return
        L_0x0073:
            X.AUx r4 = (X.C21674AUx) r4
            r2.A0H(r4)
            return
        L_0x0079:
            int r0 = X.AnonymousClass000.A0I(r4)
            goto L_0x00b6
        L_0x007e:
            int r0 = X.AnonymousClass000.A0I(r4)
        L_0x0082:
            r2.A07(r0)
            return
        L_0x0086:
            long r0 = X.C36431kI.A09(r4)
        L_0x008a:
            r2.A0F(r0)
            return
        L_0x008e:
            long r0 = X.C36431kI.A09(r4)
            long r0 = X.C165567td.A05(r0)
            goto L_0x00a4
        L_0x0097:
            boolean r0 = r4 instanceof X.C22899AyB
            if (r0 == 0) goto L_0x00a8
            X.AyB r4 = (X.C22899AyB) r4
            int r0 = r4.BEY()
        L_0x00a1:
            if (r0 >= 0) goto L_0x00b6
            long r0 = (long) r0
        L_0x00a4:
            r2.A0G(r0)
            return
        L_0x00a8:
            int r0 = X.AnonymousClass000.A0I(r4)
            goto L_0x00a1
        L_0x00ad:
            int r0 = X.AnonymousClass000.A0I(r4)
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
        L_0x00b6:
            r2.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202649mM.A01(com.google.protobuf.CodedOutputStream, X.8zm, java.lang.Object, int):void");
    }

    public void A02() {
        if (!this.A01) {
            int i = 0;
            while (true) {
                C21889AcH acH = this.A02;
                if (i < acH.A00.size()) {
                    Map.Entry entry = (Map.Entry) acH.A00.get(i);
                    if (entry.getValue() instanceof C170918Hz) {
                        ((C170918Hz) entry.getValue()).A0s();
                    }
                    i++;
                } else {
                    acH.A05();
                    this.A01 = true;
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        C202649mM r3 = new C202649mM();
        C21889AcH acH = this.A02;
        if (0 < acH.A00.size()) {
            Map.Entry entry = (Map.Entry) acH.A00.get(0);
            entry.getKey();
            entry.getValue();
            throw AnonymousClass001.A0A("isRepeated");
        }
        if (acH.A01.isEmpty()) {
            entrySet = C190769Af.A00;
        } else {
            entrySet = acH.A01.entrySet();
        }
        Iterator it = entrySet.iterator();
        if (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            A11.getKey();
            A11.getValue();
            throw AnonymousClass001.A0A("isRepeated");
        }
        r3.A00 = this.A00;
        return r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C202649mM)) {
            return false;
        }
        return this.A02.equals(((C202649mM) obj).A02);
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r1 = ((X.C21674AUx) r4).A02();
        r0 = com.google.protobuf.CodedOutputStream.A01;
        r0 = X.C165567td.A00(r1) + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C188558zm r3, java.lang.Object r4, int r5) {
        /*
            int r2 = X.C1897895p.A05(r5)
            X.8zm[] r0 = X.C188558zm.A00
            int[] r1 = X.AnonymousClass99R.A00
            int r0 = r3.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x00a4;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0099;
                case 4: goto L_0x0099;
                case 5: goto L_0x003c;
                case 6: goto L_0x00a4;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0097;
                case 9: goto L_0x008d;
                case 10: goto L_0x0018;
                case 11: goto L_0x0074;
                case 12: goto L_0x0065;
                case 13: goto L_0x005a;
                case 14: goto L_0x00a2;
                case 15: goto L_0x00a4;
                case 16: goto L_0x0051;
                case 17: goto L_0x0044;
                case 18: goto L_0x0029;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0018:
            X.B63 r4 = (X.B63) r4
            X.A7h r4 = (X.C21070A7h) r4
            r0 = 0
            int r1 = r4.A0k(r0)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            goto L_0x00a6
        L_0x0029:
            boolean r0 = r4 instanceof X.C22899AyB
            if (r0 == 0) goto L_0x003c
            X.AyB r4 = (X.C22899AyB) r4
            int r1 = r4.BEY()
        L_0x0033:
            if (r1 < 0) goto L_0x0041
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x00a6
        L_0x003c:
            int r1 = X.AnonymousClass000.A0I(r4)
            goto L_0x0033
        L_0x0041:
            r0 = 10
            goto L_0x00a6
        L_0x0044:
            long r0 = X.C36431kI.A09(r4)
            long r0 = X.C165567td.A05(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x00a6
        L_0x0051:
            int r0 = X.AnonymousClass000.A0I(r4)
            int r0 = X.C1897895p.A06(r0)
            goto L_0x00a6
        L_0x005a:
            int r1 = X.AnonymousClass000.A0I(r4)
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            goto L_0x00a6
        L_0x0065:
            boolean r0 = r4 instanceof X.C21674AUx
            if (r0 != 0) goto L_0x007f
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            goto L_0x00a6
        L_0x0074:
            boolean r0 = r4 instanceof X.C21674AUx
            if (r0 != 0) goto L_0x007f
            java.lang.String r4 = (java.lang.String) r4
            int r0 = com.google.protobuf.CodedOutputStream.A02(r4)
            goto L_0x00a6
        L_0x007f:
            X.AUx r4 = (X.C21674AUx) r4
            int r1 = r4.A02()
            boolean r0 = com.google.protobuf.CodedOutputStream.A01
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            goto L_0x00a6
        L_0x008d:
            X.B63 r4 = (X.B63) r4
            X.A7h r4 = (X.C21070A7h) r4
            r0 = 0
            int r0 = r4.A0k(r0)
            goto L_0x00a6
        L_0x0097:
            r0 = 1
            goto L_0x00a6
        L_0x0099:
            long r0 = X.C36431kI.A09(r4)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x00a6
        L_0x00a2:
            r0 = 4
            goto L_0x00a6
        L_0x00a4:
            r0 = 8
        L_0x00a6:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202649mM.A00(X.8zm, java.lang.Object, int):int");
    }

    public C202649mM() {
    }
}
