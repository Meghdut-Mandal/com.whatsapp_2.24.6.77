package X;

/* renamed from: X.A7m  reason: case insensitive filesystem */
public final class C21075A7m implements AnonymousClass7fJ {
    public final AnonymousClass7fJ A00;
    public final C22817AwS A01;
    public final AnonymousClass9FF A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r4.equals("ui_rendered") != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r4.equals("shadow_bind") != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        return r6.A00.B6u(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if (r3.equals("wa.action.CheckCpfCnpj") == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        if (r3.equals("wa.action.CheckCardNumber") == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        switch(r0) {
            case 3: goto L_0x0103;
            case 4: goto L_0x00fa;
            case 5: goto L_0x0046;
            default: goto L_0x00f4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        r7.A00.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fa, code lost:
        r0 = X.C201879kb.A00(X.AnonymousClass6MO.A02(r7, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
        r0 = X.C201879kb.A01(X.AnonymousClass6MO.A02(r7, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010f, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6u(X.AnonymousClass6MO r7, X.C115215iW r8, X.C124125xd r9) {
        /*
            r6 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r8, r1)
            r2 = 1
            X.C36321k7.A0v(r7, r2, r9)
            java.lang.String r3 = r8.A00
            java.lang.String r0 = "wa.action.perf.TrackPerfBlock"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r7.A00
            java.lang.Object r4 = r0.get(r1)
            X.AnonymousClass00C.A08(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.get(r2)
            X.AnonymousClass00C.A08(r5)
            java.lang.String r5 = (java.lang.String) r5
            X.9FF r3 = r6.A02
            if (r4 == 0) goto L_0x0045
            int r2 = r4.hashCode()
            r0 = -1564272644(0xffffffffa2c317fc, float:-5.288025E-18)
            if (r2 == r0) goto L_0x0074
            r0 = 283926139(0x10ec5e7b, float:9.323116E-29)
            if (r2 == r0) goto L_0x0047
            r0 = 646679040(0x268b8a00, float:9.682468E-16)
            if (r2 != r0) goto L_0x0045
            java.lang.String r0 = "ui_rendered"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x007c
        L_0x0045:
            r2 = 0
        L_0x0046:
            return r2
        L_0x0047:
            java.lang.String r0 = "tracking_success"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.9c0 r4 = r3.A00
            X.AnonymousClass00C.A0D(r5, r1)
            java.lang.String r3 = "ending_surface_name"
            java.lang.String r2 = "no_surface"
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x0063
            X.0zf r0 = r4.A01
            r0.A0A(r3, r5, r1)
        L_0x0063:
            java.lang.String r0 = X.C197619c0.A00(r5)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0045
            r1 = 2
            X.0zf r0 = r4.A01
            r0.A0C(r1)
            goto L_0x0045
        L_0x0074:
            java.lang.String r0 = "shadow_bind"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
        L_0x007c:
            X.9c0 r2 = r3.A00
            X.AnonymousClass00C.A0D(r5, r1)
            java.lang.String r1 = X.C197619c0.A00(r5)
            java.lang.String r0 = "no_surface"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0045
            X.0zf r0 = r2.A01
            r0.A08(r1)
            goto L_0x0045
        L_0x0093:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: WaExtensions evaluate: action="
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r3, r2)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r2)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1560255199: goto L_0x00b0;
                case -1120004527: goto L_0x00e7;
                case -246975243: goto L_0x00dd;
                case 51260781: goto L_0x00d4;
                case 268909162: goto L_0x00cb;
                case 1206046387: goto L_0x00c1;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            X.7fJ r0 = r6.A00
            java.lang.Object r2 = r0.B6u(r7, r8, r9)
            return r2
        L_0x00b0:
            java.lang.String r0 = "wa.action.CheckPin"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = X.AnonymousClass6MO.A02(r7, r1)
            boolean r0 = X.C201879kb.A02(r0)
            goto L_0x010b
        L_0x00c1:
            java.lang.String r0 = "wa.action.novi.GetDataEnv"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a9
            r0 = 5
            goto L_0x00f0
        L_0x00cb:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00fa
            goto L_0x00a9
        L_0x00d4:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0103
            goto L_0x00a9
        L_0x00dd:
            java.lang.String r0 = "wa.action.novi.EncryptLogEvent"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a9
            r0 = 2
            goto L_0x00f0
        L_0x00e7:
            java.lang.String r0 = "wa.action.novi.EncryptLogEventV2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a9
            r0 = 1
        L_0x00f0:
            r2 = 0
            switch(r0) {
                case 3: goto L_0x0103;
                case 4: goto L_0x00fa;
                case 5: goto L_0x0046;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            java.util.List r0 = r7.A00
            r0.get(r1)
            return r2
        L_0x00fa:
            java.lang.String r0 = X.AnonymousClass6MO.A02(r7, r1)
            boolean r0 = X.C201879kb.A00(r0)
            goto L_0x010b
        L_0x0103:
            java.lang.String r0 = X.AnonymousClass6MO.A02(r7, r1)
            boolean r0 = X.C201879kb.A01(r0)
        L_0x010b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21075A7m.B6u(X.6MO, X.5iW, X.5xd):java.lang.Object");
    }

    public C21075A7m(AnonymousClass7fJ r1, C22817AwS awS, AnonymousClass9FF r3) {
        this.A00 = r1;
        this.A01 = awS;
        this.A02 = r3;
    }
}
