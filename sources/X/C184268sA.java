package X;

/* renamed from: X.8sA  reason: invalid class name and case insensitive filesystem */
public class C184268sA extends C118095nK {
    public Object A00;
    public Object A01;
    public Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x014f, code lost:
        r12.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        r0 = X.C203379ns.A02(r13, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0034, code lost:
        r12.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        r12.A00 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C184268sA(X.C203399nx r13, int r14) {
        /*
            r12 = this;
            r5 = r13
            switch(r14) {
                case 0: goto L_0x0039;
                case 1: goto L_0x006a;
                case 2: goto L_0x00a0;
                case 3: goto L_0x00ce;
                case 4: goto L_0x011c;
                case 5: goto L_0x0153;
                default: goto L_0x0004;
            }
        L_0x0004:
            r12.<init>()
            java.lang.String r0 = "listing_details"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "description"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AR2 r0 = X.AR2.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            r12.A00 = r0
            java.lang.String r0 = "lowest_price"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AR3 r0 = X.AR3.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            r12.A01 = r0
            java.lang.String r0 = "multi_price"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AR4 r0 = X.AR4.A00
        L_0x0030:
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
        L_0x0034:
            r12.A02 = r0
        L_0x0036:
            r12.A00 = r13
            return
        L_0x0039:
            r12.<init>()
            java.lang.String r0 = "installment"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "count"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Long r1 = X.C90474aD.A0Y()
            java.lang.Long r0 = X.C165597tg.A0e()
            java.lang.Object r0 = X.C203379ns.A04(r13, r2, r1, r0, r3)
            r12.A00 = r0
            X.AJM r1 = X.AJM.A00
            java.lang.String r0 = "due_amount"
            java.lang.Object r0 = X.C203539oF.A03(r13, r1, r0)
            r12.A01 = r0
            X.AJN r1 = X.AJN.A00
            java.lang.String r0 = "interest"
            java.lang.Object r0 = X.C203539oF.A03(r13, r1, r0)
            goto L_0x0034
        L_0x006a:
            r12.<init>()
            java.lang.String r0 = "product"
            X.C203399nx.A0A(r13, r0)
            X.AK4 r0 = X.AK4.A00
            r3 = 0
            java.lang.Object r0 = X.C203379ns.A01(r13, r0)
            r12.A02 = r0
            r0 = 2
            X.Azj[] r1 = new X.C22993Azj[r0]
            X.AK5 r0 = X.AK5.A00
            r1[r3] = r0
            X.AK6 r0 = X.AK6.A00
            java.util.ArrayList r2 = X.C165567td.A0c(r0, r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "ItemDetails|ItemDetailsWithStatusInfo"
            java.lang.Object r0 = X.C203379ns.A06(r13, r0, r2, r1)
            r12.A01 = r0
            java.lang.String r0 = "max_available"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AK7 r0 = X.AK7.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            goto L_0x014f
        L_0x00a0:
            r12.<init>()
            java.lang.String r0 = "listing_details"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "description"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AKJ r0 = X.AKJ.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            r12.A00 = r0
            java.lang.String r0 = "lowest_price"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AKK r0 = X.AKK.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            r12.A01 = r0
            java.lang.String r0 = "multi_price"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AKL r0 = X.AKL.A00
            goto L_0x0030
        L_0x00ce:
            r12.<init>()
            java.lang.String r0 = "participant"
            java.lang.String[] r10 = X.C203399nx.A0N(r13, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            java.lang.Long r7 = X.C165567td.A0P()
            java.lang.Long r8 = X.C165567td.A0Q()
            r11 = 0
            r9 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r0 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r0
            X.AOE r0 = X.AOE.A00
            java.lang.Object r0 = X.C203379ns.A01(r13, r0)
            r12.A02 = r0
            r0 = 4
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.AOF r0 = X.AOF.A00
            r2[r11] = r0
            X.AOG r1 = X.AOG.A00
            r0 = 1
            r2[r0] = r1
            X.AOH r1 = X.AOH.A00
            r0 = 2
            r2[r0] = r1
            X.AOI r1 = X.AOI.A00
            r0 = 3
            java.util.ArrayList r2 = X.C165567td.A0d(r1, r2, r0)
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r0 = "ParticipantNotInGroup|ParticipantNotAllowed|ParticipantNotAcceptable|RemoveParticipantsLinkedGroupsServerError"
            X.AnonymousClass00C.A0D(r13, r11)
            java.lang.Object r0 = r4.A0a(r13, r0, r2, r1)     // Catch:{ 19b -> 0x0117 }
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            r12.A01 = r0
            goto L_0x0036
        L_0x011c:
            r12.<init>()
            X.C203399nx.A09(r13)
            java.lang.String r0 = "server_id"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r0 = 99
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r0 = 2147476647(0x7fffe4a7, double:1.0609944365E-314)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r11 = 0
            r9 = 0
            X.9oF r4 = X.C203379ns.A00
            java.lang.Object r0 = r4.A0Z(r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r0
            X.APk r0 = X.C21540APk.A00
            java.lang.Object r0 = X.C203379ns.A01(r13, r0)
            r12.A01 = r0
            X.APl r0 = X.C21541APl.A00
            java.lang.Object r0 = X.C203379ns.A01(r13, r0)
        L_0x014f:
            r12.A00 = r0
            goto L_0x0036
        L_0x0153:
            r12.<init>()
            X.C203399nx.A09(r13)
            java.lang.String r3 = "votes"
            java.lang.String r0 = "t"
            java.lang.String[] r4 = new java.lang.String[]{r3, r0}
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0 = 0
            java.lang.Object r0 = X.C203379ns.A05(r13, r2, r4, r0)
            r12.A01 = r0
            java.lang.String r0 = "vote"
            java.lang.String[] r7 = new java.lang.String[]{r3, r0}
            X.APm r6 = X.C21542APm.A00
            r8 = 0
            r10 = 1000(0x3e8, double:4.94E-321)
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            java.util.ArrayList r0 = X.C203539oF.A09(r5, r6, r7, r8, r10)
            r12.A02 = r0
            java.lang.String[] r1 = X.C165607th.A1b(r13, r12, r3)
            X.APn r0 = X.C21543APn.A00
            java.lang.Object r0 = X.C203539oF.A05(r13, r0, r1)
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184268sA.<init>(X.9nx, int):void");
    }
}
