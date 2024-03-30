package X;

/* renamed from: X.6MR  reason: invalid class name */
public final class AnonymousClass6MR {
    public static final AnonymousClass6MR A01 = new AnonymousClass6MR();
    public static final AnonymousClass6MR A02 = new AnonymousClass6MR();
    public final C1506776e A00 = C1506776e.A02(new C17490rV[16]);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0067 A[EDGE_INSN: B:63:0x0067->B:29:0x0067 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r12 = this;
            X.6MR r0 = A02
            r11 = 0
            r8 = 1
            boolean r0 = X.C36371kC.A1W(r12, r0)
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r0 == 0) goto L_0x00be
            X.6MR r0 = A01
            if (r12 == r0) goto L_0x00b9
            X.76e r0 = r12.A00
            int r7 = r0.A00
            if (r7 == 0) goto L_0x00b2
            if (r7 <= 0) goto L_0x006b
            java.lang.Object[] r6 = r0.A01
            r5 = 0
        L_0x001b:
            r1 = r6[r5]
            X.0rV r1 = (X.C17490rV) r1
            r10 = 1024(0x400, float:1.435E-42)
            r0 = r1
            X.6gq r0 = (X.C137856gq) r0
            X.6gq r0 = r0.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00ab
            X.76e r4 = X.C1506776e.A01()
            X.6gq r1 = (X.C137856gq) r1
            X.6gq r9 = r1.A03
            X.6gq r0 = r9.A02
            if (r0 == 0) goto L_0x0046
            r4.A0D(r0)
        L_0x0039:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0067
            X.6gq r9 = X.C1506776e.A03(r4, r0)
            int r0 = r9.A00
            r0 = r0 & r10
            if (r0 != 0) goto L_0x004c
        L_0x0046:
            X.AnonymousClass6VZ.A04(r4, r9)
            goto L_0x0039
        L_0x004a:
            if (r9 == 0) goto L_0x0039
        L_0x004c:
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00a8
            r3 = 0
        L_0x0052:
            boolean r0 = r9 instanceof X.C94214hq
            if (r0 == 0) goto L_0x0074
            X.4hq r9 = (X.C94214hq) r9
            X.6g0 r0 = r9.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x006c
            boolean r0 = X.AnonymousClass6XT.A03(r9)
        L_0x0064:
            if (r0 == 0) goto L_0x009e
            r11 = 1
        L_0x0067:
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x001b
        L_0x006b:
            return r11
        L_0x006c:
            r1 = 7
            X.7WQ r0 = X.AnonymousClass7WQ.A00
            boolean r0 = X.C133286Xr.A06(r9, r0, r1)
            goto L_0x0064
        L_0x0074:
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x009e
            boolean r0 = r9 instanceof X.C94114hf
            if (r0 == 0) goto L_0x009e
            r0 = r9
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x0083:
            if (r2 == 0) goto L_0x00a3
            int r0 = r2.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x008f
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x0092
            r9 = r2
        L_0x008f:
            X.6gq r2 = r2.A02
            goto L_0x0083
        L_0x0092:
            X.76e r3 = X.C90464aC.A0G(r3)
            X.6gq r9 = X.C90524aI.A0D(r3, r9)
            r3.A0D(r2)
            goto L_0x008f
        L_0x009e:
            X.6gq r9 = X.AnonymousClass6VZ.A00(r3)
            goto L_0x00a5
        L_0x00a3:
            if (r1 != r8) goto L_0x009e
        L_0x00a5:
            if (r9 == 0) goto L_0x0039
            goto L_0x0052
        L_0x00a8:
            X.6gq r9 = r9.A02
            goto L_0x004a
        L_0x00ab:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00b2:
            java.lang.String r0 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r1)
            throw r0
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MR.A00():boolean");
    }
}
