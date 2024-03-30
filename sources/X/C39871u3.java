package X;

/* renamed from: X.1u3  reason: invalid class name and case insensitive filesystem */
public class C39871u3 extends AnonymousClass04R {
    public int A00 = -1;
    public final AnonymousClass1X4 A01;
    public final AnonymousClass11F A02;
    public final C61923Ea A03;
    public final AnonymousClass1A1 A04;
    public final AnonymousClass1SV A05;
    public final C34831hi A06;
    public final C28201Rs A07 = C36441kJ.A0t();
    public final C28201Rs A08 = C36441kJ.A0t();
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f1, code lost:
        if (r2 != 3) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39871u3(X.AnonymousClass1X4 r11, X.C88944Uq r12, X.C220412q r13, X.AnonymousClass11F r14, X.AnonymousClass1A1 r15, X.AnonymousClass1SV r16, boolean r17) {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.A00 = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r10.A07 = r0
            X.1Rs r0 = X.C36441kJ.A0t()
            r10.A08 = r0
            r10.A04 = r15
            r0 = r16
            r10.A05 = r0
            r10.A01 = r11
            java.util.Iterator r9 = r12.B8O()
            java.lang.String[] r0 = X.C65753Ti.A03
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
        L_0x0028:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r7 = r9.next()
            X.3uy r7 = (X.C80173uy) r7
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.TreeSet r0 = r7.A04
            java.util.Iterator r8 = r0.descendingIterator()
        L_0x0042:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r8.next()
            X.3uv r0 = (X.C80143uv) r0
            X.3uv r2 = X.C65753Ti.A00(r0)
            boolean r0 = r7 instanceof X.AnonymousClass28g
            if (r0 == 0) goto L_0x0065
            r0 = r7
            X.28g r0 = (X.AnonymousClass28g) r0
            boolean r0 = r0.A01
        L_0x005b:
            if (r0 == 0) goto L_0x0061
            r6.add(r2)
            goto L_0x0042
        L_0x0061:
            r5.add(r2)
            goto L_0x0042
        L_0x0065:
            X.0wQ r1 = r2.A03
            X.11F r0 = r2.A04
            boolean r0 = r1.A0M(r0)
            goto L_0x005b
        L_0x006e:
            android.util.Pair r1 = X.C36441kJ.A0Q(r6, r5)
            java.lang.Object r0 = r1.first
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            java.lang.Object r0 = r1.second
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            goto L_0x0028
        L_0x0081:
            r3.addAll(r4)
            r1 = 0
            java.lang.String r5 = ""
            X.3Ea r0 = new X.3Ea
            r0.<init>(r10, r5, r3, r1)
            r10.A03 = r0
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = r12.B8O()
            r3 = 1
        L_0x0097:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r6.next()
            X.3uy r0 = (X.C80173uy) r0
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.TreeSet r0 = r0.A04
            java.util.Iterator r1 = r0.descendingIterator()
        L_0x00ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r1.next()
            X.3uv r0 = (X.C80143uv) r0
            X.3uv r0 = X.C65753Ti.A00(r0)
            r2.add(r0)
            goto L_0x00ad
        L_0x00c1:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00d1
            java.lang.Object r0 = X.C36441kJ.A12(r2)
            X.3uv r0 = (X.C80143uv) r0
            java.lang.String r1 = r0.A05
            if (r1 != 0) goto L_0x00d2
        L_0x00d1:
            r1 = r5
        L_0x00d2:
            X.3Ea r0 = new X.3Ea
            r0.<init>(r10, r1, r2, r3)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0097
        L_0x00dd:
            X.1hi r0 = X.C36441kJ.A0s(r4)
            r10.A06 = r0
            r10.A02 = r14
            X.147 r0 = X.C65533Sl.A01(r14)
            if (r0 == 0) goto L_0x00f3
            int r2 = r13.A06(r0)
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            r10.A09 = r0
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid
            r10.A0B = r0
            r0 = r17
            r10.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39871u3.<init>(X.1X4, X.4Uq, X.12q, X.11F, X.1A1, X.1SV, boolean):void");
    }
}
