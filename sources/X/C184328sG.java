package X;

/* renamed from: X.8sG  reason: invalid class name and case insensitive filesystem */
public class C184328sG extends C118095nK {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004a, code lost:
        r0.A02 = X.C203539oF.A04(r4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0139, code lost:
        r0.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x013b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C184328sG(X.C203399nx r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r4 = r20
            switch(r21) {
                case 0: goto L_0x0051;
                case 1: goto L_0x0095;
                case 2: goto L_0x00de;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0.<init>()
            java.lang.String r3 = "variant_info"
            java.lang.String r1 = "properties"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AQt r1 = X.C21575AQt.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A03 = r1
            java.lang.String r1 = "types"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AQu r1 = X.C21576AQu.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A04 = r1
            java.lang.String r1 = "listing_details"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AQv r1 = X.C21577AQv.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A01 = r1
            java.lang.String r1 = "availability"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AQw r1 = X.C21578AQw.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A00 = r1
            java.lang.String[] r2 = X.C165607th.A1b(r4, r0, r3)
            X.AQx r1 = X.C21579AQx.A00
        L_0x004a:
            java.lang.Object r1 = X.C203539oF.A04(r4, r1, r2)
            r0.A02 = r1
            return
        L_0x0051:
            r0.<init>()
            java.lang.String r3 = "variant_info"
            java.lang.String r1 = "properties"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AKA r1 = X.AKA.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A03 = r1
            java.lang.String r1 = "types"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AKB r1 = X.AKB.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A04 = r1
            java.lang.String r1 = "listing_details"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AKC r1 = X.AKC.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A01 = r1
            java.lang.String r1 = "availability"
            java.lang.String[] r2 = new java.lang.String[]{r3, r1}
            X.AKD r1 = X.AKD.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A00 = r1
            java.lang.String[] r2 = X.C165607th.A1b(r4, r0, r3)
            X.AKE r1 = X.AKE.A00
            goto L_0x004a
        L_0x0095:
            r0.<init>()
            java.lang.String r1 = "fds"
            X.C203399nx.A0A(r4, r1)
            X.AL4 r1 = X.AL4.A00
            java.lang.Object r1 = X.C203539oF.A00(r4, r1)
            r0.A00 = r1
            java.lang.String r1 = "states"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AL5 r1 = X.AL5.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A04 = r1
            java.lang.String r1 = "next_screens"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AL6 r1 = X.AL6.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A01 = r1
            java.lang.String r1 = "screen_data"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AL7 r1 = X.AL7.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A03 = r1
            java.lang.String r1 = "persist_data"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            X.AL8 r1 = X.AL8.A00
            java.lang.Object r1 = X.C203379ns.A02(r4, r1, r2)
            r0.A02 = r1
            goto L_0x0139
        L_0x00de:
            r0.<init>()
            java.lang.String r1 = "add_request"
            X.C203399nx.A0A(r4, r1)
            java.lang.String r1 = "expiration"
            java.lang.String[] r9 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            java.lang.Long r6 = X.C36411kG.A0t()
            java.lang.Long r7 = X.C165567td.A0Q()
            r10 = 0
            r8 = 0
            X.9oF r3 = X.C203379ns.A00
            java.lang.Object r1 = r3.A0Z(r4, r5, r6, r7, r8, r9, r10)
            r0.A02 = r1
            java.lang.String r1 = "group_jid"
            java.lang.String[] r17 = new java.lang.String[]{r1}
            java.lang.Class<X.147> r13 = X.AnonymousClass147.class
            java.lang.Long r14 = X.C165567td.A0P()
            r18 = 0
            r11 = r3
            r12 = r4
            r15 = r7
            r16 = r8
            java.lang.Object r1 = r11.A0Z(r12, r13, r14, r15, r16, r17, r18)
            r0.A03 = r1
            java.lang.String r1 = "priority_idx"
            java.lang.String[] r9 = new java.lang.String[]{r1}
            java.lang.Long r7 = X.C165607th.A0l()
            java.lang.Object r1 = r3.A0Z(r4, r5, r6, r7, r8, r9, r10)
            r0.A04 = r1
            X.AMe r1 = X.C21456AMe.A00
            java.lang.Object r1 = X.C203539oF.A02(r4, r1, r10)
            r0.A01 = r1
            X.AMf r1 = X.C21457AMf.A00
            java.lang.Object r1 = X.C203539oF.A02(r4, r1, r10)
            r0.A00 = r1
        L_0x0139:
            r0.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184328sG.<init>(X.9nx, int):void");
    }
}
