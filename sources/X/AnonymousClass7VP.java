package X;

/* renamed from: X.7VP  reason: invalid class name */
public final class AnonymousClass7VP extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C132406Tm $directoryQplLogger;
    public final /* synthetic */ boolean $isTypeahead;
    public final /* synthetic */ String $query;
    public final /* synthetic */ C128536Cq $searchQueryResult;
    public final /* synthetic */ AnonymousClass6SI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VP(AnonymousClass6SI r2, C128536Cq r3, C132406Tm r4, String str, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$searchQueryResult = r3;
        this.$isTypeahead = z;
        this.$directoryQplLogger = r4;
        this.$query = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0124, code lost:
        if (X.AnonymousClass000.A1Z(r4.A04, 1) != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019c, code lost:
        if (r0 != null) goto L_0x019e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r21
            X.5aD r6 = (X.C110155aD) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r1 = r20
            X.6SI r7 = r1.this$0
            X.6Cq r4 = r1.$searchQueryResult
            boolean r3 = r1.$isTypeahead
            X.6Tm r0 = r1.$directoryQplLogger
            java.lang.String r5 = r1.$query
            java.util.Set r2 = r4.A04
            java.lang.Integer r1 = X.C36361kB.A0j()
            r2.add(r1)
            boolean r1 = r6 instanceof X.AnonymousClass51A
            if (r1 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x0148
            X.51A r6 = (X.AnonymousClass51A) r6
            X.6Mu r1 = r7.A02
            X.5yw r9 = r6.A00
            r1.A01(r9)
            java.util.List r8 = r9.A0C
            X.AnonymousClass00C.A07(r8)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r8.iterator()
        L_0x0039:
            boolean r1 = r5.hasNext()
            r6 = 1
            if (r1 == 0) goto L_0x0057
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.6s9 r2 = (X.C144416s9) r2
            X.69k r1 = r4.A01
            X.AnonymousClass00C.A0B(r2)
            boolean r1 = X.C129416Gv.A01(r1, r2)
            r6 = r6 ^ r1
            if (r6 == 0) goto L_0x0039
            r10.add(r3)
            goto L_0x0039
        L_0x0057:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r10.iterator()
        L_0x005f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r2 = r5.next()
            X.5yw r1 = r4.A02
            java.util.List r1 = r1.A0C
            boolean r1 = r1.contains(r2)
            X.C36391kE.A1V(r2, r3, r1)
            goto L_0x005f
        L_0x0075:
            X.5yw r11 = r4.A02
            java.util.List r5 = r11.A0C
            int r2 = r3.size()
            int r1 = r5.size()
            int r1 = 3 - r1
            int r1 = java.lang.Math.min(r2, r1)
            r14 = 0
            java.util.List r1 = r3.subList(r14, r1)
            r5.addAll(r1)
            java.util.List r3 = r9.A09
            X.AnonymousClass00C.A07(r3)
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.Iterator r13 = r3.iterator()
        L_0x009c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r10 = r13.next()
            r2 = r10
            X.6s9 r2 = (X.C144416s9) r2
            X.69k r1 = r4.A01
            X.AnonymousClass00C.A0B(r2)
            boolean r1 = X.C129416Gv.A01(r1, r2)
            X.C36391kE.A1V(r10, r12, r1)
            goto L_0x009c
        L_0x00b6:
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = r12.iterator()
        L_0x00be:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r2 = r10.next()
            java.util.List r1 = r11.A09
            boolean r1 = r1.contains(r2)
            X.C36391kE.A1V(r2, r13, r1)
            goto L_0x00be
        L_0x00d2:
            int r1 = r5.size()
            int r1 = 3 - r1
            int r12 = java.lang.Math.max(r1, r6)
            java.util.List r2 = r11.A09
            int r10 = r13.size()
            int r1 = r2.size()
            int r12 = r12 - r1
            int r1 = java.lang.Math.min(r10, r12)
            java.util.List r1 = r13.subList(r14, r1)
            r2.addAll(r1)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r10 = r7.A00
            if (r10 == 0) goto L_0x011c
            java.lang.String r13 = r4.A03
            java.util.List r7 = r11.A0A
            X.6P1 r12 = r9.A01
            java.lang.String r14 = r9.A05
            java.lang.String r15 = r9.A08
            X.69k r11 = r4.A01
            java.util.Set r1 = r4.A04
            boolean r1 = X.AnonymousClass000.A1Z(r1, r6)
            r19 = r1 ^ 1
            r8.size()
            r3.size()
            r3.size()
            r18 = r2
            r17 = r5
            r16 = r7
            r10.A0U(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x011c:
            if (r0 == 0) goto L_0x01a1
            java.util.Set r1 = r4.A04
            boolean r1 = X.AnonymousClass000.A1Z(r1, r6)
            if (r1 == 0) goto L_0x01a1
            goto L_0x019e
        L_0x0127:
            boolean r1 = r6 instanceof X.AnonymousClass519
            if (r1 == 0) goto L_0x01a1
            X.519 r6 = (X.AnonymousClass519) r6
            int r6 = r6.A00
            r4.A00 = r6
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r5 = r7.A00
            if (r5 == 0) goto L_0x0142
            java.lang.String r4 = r4.A03
            X.17Y r3 = r5.A0J
            r2 = 2
            X.3vI r1 = new X.3vI
            r1.<init>(r5, r4, r6, r2)
            r3.A0H(r1)
        L_0x0142:
            if (r0 == 0) goto L_0x01a1
            r0.A03()
            goto L_0x01a1
        L_0x0148:
            X.5yw r3 = r4.A02
            java.util.List r15 = r3.A09
            X.51A r6 = (X.AnonymousClass51A) r6
            X.5yw r2 = r6.A00
            java.util.List r1 = r2.A09
            X.AnonymousClass00C.A07(r1)
            r15.addAll(r1)
            java.util.List r6 = r3.A0C
            java.util.List r1 = r2.A0C
            X.AnonymousClass00C.A07(r1)
            r6.addAll(r1)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r4 = r7.A00
            if (r4 == 0) goto L_0x019c
            X.09w r14 = X.C023409w.A00
            java.util.List r3 = r2.A0B
            X.AnonymousClass00C.A07(r3)
            java.lang.String r10 = r2.A04
            java.lang.String r11 = r2.A07
            java.lang.Double r9 = r2.A02
            java.lang.String r12 = r2.A06
            java.lang.String r13 = r2.A03
            r1 = 0
            X.6Oz r8 = new X.6Oz
            r8.<init>(r1, r14)
            X.6Du r7 = new X.6Du
            r16 = r6
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.6P1 r6 = r2.A01
            java.lang.String r3 = r2.A05
            java.lang.String r2 = r2.A08
            X.17Y r1 = r4.A0J
            X.73e r8 = new X.73e
            r9 = r7
            r12 = r5
            r13 = r3
            r14 = r2
            r10 = r4
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A0H(r8)
        L_0x019c:
            if (r0 == 0) goto L_0x01a1
        L_0x019e:
            r0.A04()
        L_0x01a1:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VP.invoke(java.lang.Object):java.lang.Object");
    }
}
