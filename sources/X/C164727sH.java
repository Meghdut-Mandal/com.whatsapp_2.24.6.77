package X;

/* renamed from: X.7sH  reason: invalid class name and case insensitive filesystem */
public class C164727sH implements C158247gc {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.6Di} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BPu(X.C121585tN r13, java.lang.Short r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            r10 = r15
            int r0 = r12.A04
            if (r0 == 0) goto L_0x006d
            java.lang.Object r4 = r12.A01
            X.6Xv r4 = (X.C133316Xv) r4
            java.lang.Object r5 = r12.A02
            X.6E7 r5 = (X.AnonymousClass6E7) r5
            int r0 = r12.A00
            java.lang.Object r7 = r12.A03
            X.7ji r7 = (X.C159657ji) r7
            if (r16 == 0) goto L_0x0063
            X.1KT r1 = r4.A0H
            java.lang.String r0 = r5.A05
            int r0 = r0.hashCode()
            X.C90504aG.A1D(r1, r0)
            X.56y r1 = r4.A0I
            int r0 = r4.A00
            X.C90504aG.A1D(r1, r0)
        L_0x0027:
            r6 = 0
            if (r13 == 0) goto L_0x00e5
            java.util.List r0 = r13.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0030:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6Di r0 = (X.C128716Di) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r5.A05
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0030
            r6 = r2
        L_0x0048:
            X.6Di r6 = (X.C128716Di) r6
            if (r6 == 0) goto L_0x00e2
            java.lang.String r0 = r6.A02
            r5.A00 = r0
            boolean r0 = X.C133316Xv.A06(r4, r5, r6, r13, r7)
            if (r0 != 0) goto L_0x0062
            X.17Y r0 = r4.A03
            r8 = 35
            X.74x r3 = new X.74x
            r3.<init>((X.C133316Xv) r4, (X.AnonymousClass6E7) r5, (X.C128716Di) r6, (X.C159657ji) r7, (int) r8)
            r0.A0H(r3)
        L_0x0062:
            return
        L_0x0063:
            X.1Kf r1 = r4.A0J
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0D(r0, r14)
            goto L_0x0027
        L_0x006d:
            java.lang.Object r5 = r12.A01
            X.6Xv r5 = (X.C133316Xv) r5
            java.lang.Object r6 = r12.A02
            X.6E7 r6 = (X.AnonymousClass6E7) r6
            int r0 = r12.A00
            java.lang.Object r8 = r12.A03
            X.7ji r8 = (X.C159657ji) r8
            r11 = 0
            if (r16 == 0) goto L_0x00d8
            X.1KT r1 = r5.A0H
            java.lang.String r0 = r6.A05
            int r0 = r0.hashCode()
            X.C90504aG.A1D(r1, r0)
            X.56y r1 = r5.A0I
            int r0 = r5.A00
            X.C90504aG.A1D(r1, r0)
        L_0x0090:
            r7 = 0
            if (r13 == 0) goto L_0x00ef
            java.util.List r0 = r13.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0099:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6Di r0 = (X.C128716Di) r0
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r6.A05
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0099
            r7 = r2
        L_0x00b1:
            X.6Di r7 = (X.C128716Di) r7
            if (r7 == 0) goto L_0x00ef
            java.lang.String r0 = r7.A02
            r6.A00 = r0
            boolean r0 = X.C133316Xv.A06(r5, r6, r7, r13, r8)
            if (r0 != 0) goto L_0x0062
            X.17Y r0 = r5.A03
            r9 = 36
            X.74x r4 = new X.74x
            r4.<init>((X.C133316Xv) r5, (X.AnonymousClass6E7) r6, (X.C128716Di) r7, (X.C159657ji) r8, (int) r9)
            r0.A0H(r4)
            X.0wU r2 = r5.A0O
            r1 = 28
            X.3v9 r0 = new X.3v9
            r0.<init>(r5, r6, r1)
            r2.Boy(r0)
            return
        L_0x00d8:
            X.1Kf r1 = r5.A0J
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0D(r0, r14)
            goto L_0x0090
        L_0x00e2:
            java.lang.String r10 = "extensions-invalid-extensions-id"
            goto L_0x00e9
        L_0x00e5:
            if (r15 != 0) goto L_0x00e9
            java.lang.String r10 = "failure"
        L_0x00e9:
            java.lang.String r0 = r5.A05
            X.C133316Xv.A05(r4, r7, r10, r0)
            return
        L_0x00ef:
            if (r15 != 0) goto L_0x00f3
            java.lang.String r10 = "failure"
        L_0x00f3:
            if (r13 == 0) goto L_0x010c
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x010a
            X.1KW r4 = r5.A0C
            com.whatsapp.jid.UserJid r0 = r6.A02
            java.lang.String r3 = r0.user
            java.lang.String r2 = r6.A05
            X.0wo r0 = r5.A0A
            long r0 = X.C19970wo.A00(r0)
            r4.A02(r0, r3, r2)
        L_0x010a:
            java.lang.String r10 = "extensions-invalid-extensions-id"
        L_0x010c:
            java.lang.String r7 = r6.A05
            X.C133316Xv.A05(r5, r8, r10, r7)
            X.6OE r1 = r5.A08
            com.whatsapp.jid.UserJid r4 = r6.A02
            java.lang.String r8 = r6.A08
            java.lang.String r9 = r6.A09
            X.185 r2 = r5.A06
            X.6NP r3 = r5.A0E
            boolean r0 = r6.A0C
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r6 = "galaxy_message"
            r1.A02(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164727sH.BPu(X.5tN, java.lang.Short, java.lang.String, boolean):void");
    }

    public C164727sH(C133316Xv r1, AnonymousClass6E7 r2, C159657ji r3, int i, int i2) {
        this.A04 = i2;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }
}
