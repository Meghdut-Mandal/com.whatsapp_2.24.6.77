package X;

/* renamed from: X.5wR  reason: invalid class name and case insensitive filesystem */
public final class C123405wR {
    public String A00;
    public final C108015Rv A01;
    public final C108025Rw A02;
    public final AnonymousClass5SL A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (r1.equals("close") != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r16 == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r1 = X.AnonymousClass5SL.CLOSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r1.equals("back") == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C123405wR(X.AnonymousClass9XM r13, java.lang.String r14, java.util.Map r15, boolean r16) {
        /*
            r12 = this;
            r9 = 1
            r12.<init>()
            r5 = 0
            if (r15 == 0) goto L_0x0127
            java.lang.String r0 = "style"
            java.lang.Object r1 = r15.get(r0)
        L_0x000d:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0124
            java.util.Map r1 = (java.util.Map) r1
        L_0x0013:
            java.lang.String r6 = "on_back_params"
            java.lang.String r4 = "modal_type"
            java.lang.String r3 = "on_back"
            java.lang.String r2 = "button_style"
            java.lang.String r7 = "type"
            if (r1 == 0) goto L_0x0108
            java.util.LinkedHashMap r8 = X.C36431kI.A1G()
            X.C90484aE.A1I(r7, r8, r1)
            X.C90484aE.A1I(r4, r8, r1)
            java.lang.String r0 = "leading_button_config"
            java.lang.Object r11 = r1.get(r0)
            boolean r0 = r11 instanceof java.util.Map
            r10 = 0
            if (r0 == 0) goto L_0x0105
            r0 = r11
            java.util.Map r0 = (java.util.Map) r0
        L_0x0037:
            if (r11 == 0) goto L_0x0101
            if (r0 != 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FcsStateMachine/extractPresentationStyle/unexpected format for presentation.style.leading_button_config: "
            X.C36321k7.A1J(r11, r0, r1)
        L_0x0044:
            r0 = 2
            X.011[] r1 = new X.AnonymousClass011[r0]
            r0 = 0
            X.C36341k9.A1J(r2, r10, r1, r0)
            X.C36341k9.A1J(r3, r10, r1, r9)
            java.util.LinkedHashMap r0 = X.C000400e.A07(r1)
        L_0x0052:
            r8.putAll(r0)
        L_0x0055:
            if (r16 == 0) goto L_0x00ed
            X.5Rw r9 = X.C108025Rw.MODAL
        L_0x0059:
            r12.A02 = r9
            X.5Rw r7 = X.C108025Rw.MODAL
            if (r9 != r7) goto L_0x00ea
            if (r16 == 0) goto L_0x00d7
            if (r13 == 0) goto L_0x00d4
            X.9XN r0 = r13.A03
            X.5Rv r0 = r0.A00
        L_0x0067:
            r12.A01 = r0
            java.lang.String r1 = X.C90504aG.A0l(r2, r8)
            if (r1 == 0) goto L_0x008a
            int r2 = r1.hashCode()
            r0 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r2 == r0) goto L_0x00c8
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r2 == r0) goto L_0x00bd
            r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r2 != r0) goto L_0x008a
            java.lang.String r0 = "close"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008e
        L_0x008a:
            if (r9 != r7) goto L_0x00d1
            if (r16 != 0) goto L_0x00d1
        L_0x008e:
            X.5SL r1 = X.AnonymousClass5SL.CLOSE
        L_0x0090:
            r12.A03 = r1
            X.5SL r0 = X.AnonymousClass5SL.BACK
            if (r1 != r0) goto L_0x00a0
            java.lang.String r0 = X.C90504aG.A0l(r3, r8)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r5 = X.C90464aC.A0d(r14, r0)
        L_0x00a0:
            r12.A04 = r5
            java.lang.Object r1 = r8.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r1 instanceof X.AnonymousClass00W
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r1 instanceof X.C17930sJ
            if (r0 == 0) goto L_0x00bc
        L_0x00b2:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = X.C90504aG.A0n(r1)
            r12.A00 = r0
        L_0x00bc:
            return
        L_0x00bd:
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008a
            X.5SL r1 = X.AnonymousClass5SL.NONE
            goto L_0x0090
        L_0x00c8:
            java.lang.String r0 = "back"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d1
            goto L_0x008a
        L_0x00d1:
            X.5SL r1 = X.AnonymousClass5SL.BACK
            goto L_0x0090
        L_0x00d4:
            X.5Rv r0 = X.C108015Rv.FULL_SCREEN
            goto L_0x0067
        L_0x00d7:
            java.lang.Object r1 = r8.get(r4)
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00e6
            X.5Rv r0 = X.C108015Rv.BOTTOM_SHEET
            goto L_0x0067
        L_0x00e6:
            X.5Rv r0 = X.C108015Rv.FULL_SCREEN
            goto L_0x0067
        L_0x00ea:
            r0 = r5
            goto L_0x0067
        L_0x00ed:
            java.lang.Object r1 = r8.get(r7)
            java.lang.String r0 = "modal"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00fd
            X.5Rw r9 = X.C108025Rw.MODAL
            goto L_0x0059
        L_0x00fd:
            X.5Rw r9 = X.C108025Rw.PUSH
            goto L_0x0059
        L_0x0101:
            if (r0 != 0) goto L_0x0052
            goto L_0x0044
        L_0x0105:
            r0 = r10
            goto L_0x0037
        L_0x0108:
            r0 = 5
            X.011[] r1 = new X.AnonymousClass011[r0]
            r0 = 0
            X.C36341k9.A1J(r7, r5, r1, r0)
            X.C36341k9.A1J(r2, r5, r1, r9)
            r0 = 2
            X.C36341k9.A1J(r3, r5, r1, r0)
            r0 = 3
            X.C36341k9.A1J(r4, r5, r1, r0)
            r0 = 4
            X.C36341k9.A1J(r6, r5, r1, r0)
            java.util.LinkedHashMap r8 = X.C000400e.A07(r1)
            goto L_0x0055
        L_0x0124:
            r1 = r5
            goto L_0x0013
        L_0x0127:
            r1 = r5
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123405wR.<init>(X.9XM, java.lang.String, java.util.Map, boolean):void");
    }
}
