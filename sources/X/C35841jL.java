package X;

/* renamed from: X.1jL  reason: invalid class name and case insensitive filesystem */
public class C35841jL extends C118095nK {
    public Object A00;
    public Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x014b, code lost:
        r12.A01 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35841jL(X.C203399nx r13, int r14) {
        /*
            r12 = this;
            r5 = r13
            switch(r14) {
                case 0: goto L_0x004f;
                case 1: goto L_0x008d;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0111;
                case 4: goto L_0x014f;
                default: goto L_0x0004;
            }
        L_0x0004:
            r12.<init>()
            java.lang.String r0 = "item"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "t"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r11 = 0
            r9 = 0
            java.lang.Object r0 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r0
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            r2[r11] = r0
            r1 = 1
            java.lang.Class<X.148> r0 = X.AnonymousClass148.class
            r2[r1] = r0
            r1 = 2
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            r2[r1] = r0
            java.util.List r1 = java.util.Arrays.asList(r2)
            java.lang.String r0 = "from"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.whatsapp.jid.Jid r0 = X.C203379ns.A00(r13, r1, r0)
        L_0x004a:
            r12.A00 = r0
        L_0x004c:
            r12.A00 = r13
            return
        L_0x004f:
            r12.<init>()
            java.lang.String r0 = "reporter"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "jid"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            r0 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r11 = 0
            r9 = 0
            java.lang.Object r0 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r0
            java.lang.String r0 = "timestamp"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x014b
        L_0x008d:
            r12.<init>()
            java.lang.String r0 = "sub_group_suggestion"
            X.C203399nx.A0A(r13, r0)
            X.AOO r1 = X.AOO.A00
            r4 = 0
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object r0 = X.C203539oF.A06(r13, r1, r0)
            r12.A01 = r0
            r0 = 4
            X.Azj[] r2 = new X.C22993Azj[r0]
            X.AOP r0 = X.AOP.A00
            r2[r4] = r0
            X.AOQ r1 = X.AOQ.A00
            r0 = 1
            r2[r0] = r1
            X.AOR r1 = X.AOR.A00
            r0 = 2
            r2[r0] = r1
            X.AOS r1 = X.AOS.A00
            r0 = 3
            r2[r0] = r1
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r1 = "SubGroupSuggestionNotFound|SubGroupSuggestionConflict|SubGroupResourceConstraint|SubGroupCreationInternalServerError"
            X.9oF r0 = X.C203379ns.A00
            X.AnonymousClass00C.A0D(r13, r4)
            java.lang.Object r0 = r0.A0a(r13, r1, r3, r2)     // Catch:{ 19b -> 0x00ce }
            goto L_0x004a
        L_0x00ce:
            r0 = 0
            goto L_0x004a
        L_0x00d1:
            r12.<init>()
            java.lang.String r0 = "notification"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "type"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r0 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r11 = 0
            java.lang.String r9 = "newsletter"
            X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "from"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<X.1Uw> r6 = X.C28981Uw.class
            r9 = 0
            java.lang.Object r0 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r0
            X.AP7 r1 = X.AP7.A00
            java.lang.String[] r0 = new java.lang.String[r11]
            java.lang.Object r0 = X.C203539oF.A06(r13, r1, r0)
            goto L_0x014b
        L_0x0111:
            r12.<init>()
            java.lang.String r0 = "vote"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "count"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r0 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r0 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r11 = 0
            r9 = 0
            java.lang.Object r0 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r0
            java.lang.String r0 = "#elementValue"
            java.lang.String[] r10 = new java.lang.String[]{r0}
            java.lang.Class<byte[]> r6 = byte[].class
            r0 = 32
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r8 = r7
            java.lang.Object r0 = X.C203379ns.A03(r5, r6, r7, r8, r9, r10, r11)
        L_0x014b:
            r12.A01 = r0
            goto L_0x004c
        L_0x014f:
            r12.<init>()
            java.lang.String r0 = "thread_metadata"
            X.C203399nx.A0A(r13, r0)
            java.lang.String r0 = "status_msgs"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AQE r0 = X.AQE.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            r12.A01 = r0
            java.lang.String r0 = "notifications"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            X.AQF r0 = X.AQF.A00
            java.lang.Object r0 = X.C203379ns.A02(r13, r0, r1)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35841jL.<init>(X.9nx, int):void");
    }
}
