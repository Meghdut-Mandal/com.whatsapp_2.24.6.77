package X;

/* renamed from: X.6o2  reason: invalid class name and case insensitive filesystem */
public class C141916o2 implements AnonymousClass7fB {
    public final /* synthetic */ C132136Sh A00;
    public final /* synthetic */ C140456lc A01;

    public C141916o2(C132136Sh r1, C140456lc r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BxL(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 35
            if (r7 == r0) goto L_0x0186
            r1 = 36
            if (r7 == r1) goto L_0x0126
            r0 = 41
            if (r7 == r0) goto L_0x00dc
            r0 = 42
            if (r7 == r0) goto L_0x0076
            r0 = 44
            if (r7 != r0) goto L_0x003d
            X.6Sh r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -932331738: goto L_0x004a;
                case -814425728: goto L_0x0055;
                case 1682480591: goto L_0x0060;
                case 1744442261: goto L_0x006b;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.5TW r3 = X.AnonymousClass5TW.FLEX_START
        L_0x0021:
            X.5TW r0 = X.C132136Sh.A05
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.C132136Sh.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.mIntValue
        L_0x003a:
            float r0 = (float) r0
            r5[r4] = r0
        L_0x003d:
            r0 = 0
            return r0
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.5TW r3 = X.AnonymousClass5TW.CENTER
            goto L_0x0021
        L_0x004a:
            java.lang.String r0 = "space_around"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.5TW r3 = X.AnonymousClass5TW.SPACE_AROUND
            goto L_0x0021
        L_0x0055:
            java.lang.String r0 = "space_evenly"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.5TW r3 = X.AnonymousClass5TW.SPACE_EVENLY
            goto L_0x0021
        L_0x0060:
            java.lang.String r0 = "space_between"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.5TW r3 = X.AnonymousClass5TW.SPACE_BETWEEN
            goto L_0x0021
        L_0x006b:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.5TW r3 = X.AnonymousClass5TW.FLEX_END
            goto L_0x0021
        L_0x0076:
            X.6Sh r3 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            X.6lc r0 = r6.A01
            java.lang.Object r1 = X.C140456lc.A0I(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = "auto"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "space_between"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "space_around"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
        L_0x009c:
            r1 = 1
        L_0x009d:
            int r0 = r8.hashCode()
            switch(r0) {
                case 3657802: goto L_0x00c2;
                case 491642861: goto L_0x00cf;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            X.5TD r2 = X.AnonymousClass5TD.NO_WRAP
        L_0x00a6:
            X.5TD r0 = X.C132136Sh.A06
            if (r2 == r0) goto L_0x003d
            r0 = 2
            X.C132136Sh.A00(r3, r0)
            float[] r5 = r3.A01
            int r1 = r3.A00
            int r4 = r1 + 1
            r3.A00 = r4
            r0 = 5
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r3.A00 = r0
            int r0 = r2.mIntValue
            goto L_0x003a
        L_0x00c2:
            java.lang.String r0 = "wrap"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a4
            if (r1 != 0) goto L_0x00a4
            X.5TD r2 = X.AnonymousClass5TD.WRAP
            goto L_0x00a6
        L_0x00cf:
            java.lang.String r0 = "wrap_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a4
            X.5TD r2 = X.AnonymousClass5TD.WRAP_REVERSE
            goto L_0x00a6
        L_0x00da:
            r1 = 0
            goto L_0x009d
        L_0x00dc:
            X.6Sh r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1781065991: goto L_0x0105;
                case -1354837162: goto L_0x0110;
                case -207799939: goto L_0x011b;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            X.5TO r3 = X.AnonymousClass5TO.ROW
        L_0x00e9:
            X.5TO r0 = X.C132136Sh.A04
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.C132136Sh.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 1
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.mIntValue
            goto L_0x003a
        L_0x0105:
            java.lang.String r0 = "column_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e7
            X.5TO r3 = X.AnonymousClass5TO.COLUMN_REVERSE
            goto L_0x00e9
        L_0x0110:
            java.lang.String r0 = "column"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e7
            X.5TO r3 = X.AnonymousClass5TO.COLUMN
            goto L_0x00e9
        L_0x011b:
            java.lang.String r0 = "row_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e7
            X.5TO r3 = X.AnonymousClass5TO.ROW_REVERSE
            goto L_0x00e9
        L_0x0126:
            X.6Sh r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1720785339: goto L_0x0151;
                case -1364013995: goto L_0x015c;
                case -932331738: goto L_0x0167;
                case 3005871: goto L_0x016a;
                case 1384876188: goto L_0x016d;
                case 1682480591: goto L_0x0178;
                case 1744442261: goto L_0x017b;
                default: goto L_0x0131;
            }
        L_0x0131:
            X.5SZ r3 = X.AnonymousClass5SZ.STRETCH
        L_0x0133:
            X.5SZ r0 = X.C132136Sh.A03
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.C132136Sh.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 4
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.ordinal()
            goto L_0x003a
        L_0x0151:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0131
            X.5SZ r3 = X.AnonymousClass5SZ.BASELINE
            goto L_0x0133
        L_0x015c:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0131
            X.5SZ r3 = X.AnonymousClass5SZ.CENTER
            goto L_0x0133
        L_0x0167:
            java.lang.String r0 = "space_around"
            goto L_0x017d
        L_0x016a:
            java.lang.String r0 = "auto"
            goto L_0x017d
        L_0x016d:
            java.lang.String r0 = "flex_start"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0131
            X.5SZ r3 = X.AnonymousClass5SZ.FLEX_START
            goto L_0x0133
        L_0x0178:
            java.lang.String r0 = "space_between"
            goto L_0x017d
        L_0x017b:
            java.lang.String r0 = "flex_end"
        L_0x017d:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0131
            X.5SZ r3 = X.AnonymousClass5SZ.FLEX_END
            goto L_0x0133
        L_0x0186:
            X.6Sh r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1881872635: goto L_0x01b1;
                case -1720785339: goto L_0x01bc;
                case -1364013995: goto L_0x01c7;
                case -932331738: goto L_0x01d2;
                case 1682480591: goto L_0x01dd;
                case 1744442261: goto L_0x01e8;
                default: goto L_0x0191;
            }
        L_0x0191:
            X.5Ss r3 = X.C108235Ss.FLEX_START
        L_0x0193:
            X.5Ss r0 = X.C132136Sh.A02
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.C132136Sh.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 3
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.ordinal()
            goto L_0x003a
        L_0x01b1:
            java.lang.String r0 = "stretch"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.5Ss r3 = X.C108235Ss.STRETCH
            goto L_0x0193
        L_0x01bc:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.5Ss r3 = X.C108235Ss.BASELINE
            goto L_0x0193
        L_0x01c7:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.5Ss r3 = X.C108235Ss.CENTER
            goto L_0x0193
        L_0x01d2:
            java.lang.String r0 = "space_around"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.5Ss r3 = X.C108235Ss.SPACE_AROUND
            goto L_0x0193
        L_0x01dd:
            java.lang.String r0 = "space_between"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.5Ss r3 = X.C108235Ss.SPACE_BETWEEN
            goto L_0x0193
        L_0x01e8:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0191
            X.5Ss r3 = X.C108235Ss.FLEX_END
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141916o2.BxL(int, java.lang.Object):boolean");
    }
}
