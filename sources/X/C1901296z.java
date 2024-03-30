package X;

/* renamed from: X.96z  reason: invalid class name and case insensitive filesystem */
public abstract class C1901296z {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r5, X.AnonymousClass11F r6, X.A8P r7, X.AnonymousClass1EV r8, X.C207199ui r9, X.C64933Qa r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16) {
        /*
            boolean r0 = r8.A02()
            if (r0 == 0) goto L_0x0027
            boolean r0 = r8.A0I(r11)
            if (r0 == 0) goto L_0x0027
            X.1EU r1 = r7.A08
            java.lang.String r0 = "P2M_LITE"
            X.AF8 r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0040
        L_0x0016:
            X.1EU r1 = r7.A08
            java.lang.String r0 = "GLOBAL_ORDER"
            X.AF8 r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.Class r0 = r0.BFM()
            if (r0 != 0) goto L_0x0084
        L_0x0026:
            return
        L_0x0027:
            r2 = 1
            r3 = r16
            if (r3 == r2) goto L_0x0059
            r4 = 0
            r2 = 2
            if (r3 == r2) goto L_0x0053
            r0 = 3
            r1 = 6
            if (r3 == r0) goto L_0x004e
            r0 = 4
            if (r3 == r0) goto L_0x0047
            r0 = 5
            if (r3 == r0) goto L_0x0070
            X.1EU r0 = r7.A08
            X.B66 r0 = r0.A05()
        L_0x0040:
            java.lang.Class r0 = r0.BFM()
            if (r0 != 0) goto L_0x0084
            goto L_0x0016
        L_0x0047:
            java.lang.String r0 = "canceled"
            android.content.Intent r2 = r7.A00(r5, r0, r1)
            goto L_0x0081
        L_0x004e:
            android.content.Intent r2 = r7.A00(r5, r4, r1)
            goto L_0x0081
        L_0x0053:
            r0 = -1
            android.content.Intent r2 = r7.A00(r5, r4, r0)
            goto L_0x0081
        L_0x0059:
            X.1EU r0 = r7.A08
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFk()
            if (r0 == 0) goto L_0x0016
            android.content.Intent r1 = X.C36441kJ.A0H(r5, r0)
            java.lang.String r0 = "extra_is_quick_buy"
            android.content.Intent r2 = r1.putExtra(r0, r2)
            goto L_0x0081
        L_0x0070:
            java.lang.String r1 = r9.A04
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            r2 = 6
        L_0x007b:
            java.lang.String r0 = "completed"
            android.content.Intent r2 = r7.A00(r5, r0, r2)
        L_0x0081:
            if (r2 != 0) goto L_0x0088
            goto L_0x0016
        L_0x0084:
            android.content.Intent r2 = X.C36441kJ.A0H(r5, r0)
        L_0x0088:
            X.AnonymousClass3UJ.A00(r2, r10)
            java.lang.String r0 = "extra_order_id"
            r2.putExtra(r0, r13)
            if (r9 == 0) goto L_0x00c3
            X.9uP r3 = r9.A09
            java.lang.String r1 = r3.A07
            java.lang.String r0 = "extra_order_discount_program_name"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r9.A0H
            java.lang.String r0 = "extra_order_type"
            r2.putExtra(r0, r1)
            java.util.List r4 = r9.A0L
            if (r4 == 0) goto L_0x00af
            java.util.ArrayList r1 = X.C36441kJ.A15(r4)
            java.lang.String r0 = "extra_payment_settings"
            r2.putParcelableArrayListExtra(r0, r1)
        L_0x00af:
            X.9uB r0 = r3.A02
            if (r0 == 0) goto L_0x00ba
            long r0 = r0.A00
            java.lang.String r3 = "extra_order_expiry_ts_in_sec"
            r2.putExtra(r3, r0)
        L_0x00ba:
            boolean r1 = r8.A0K(r4)
            java.lang.String r0 = "extra_checkout_lite_enabled"
            r2.putExtra(r0, r1)
        L_0x00c3:
            java.lang.String r1 = "extra_transaction_type"
            java.lang.String r0 = "p2m"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_config_id"
            r2.putExtra(r0, r12)
            X.C165597tg.A0z(r2, r14)
            if (r15 <= 0) goto L_0x00d9
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r2.putExtra(r0, r15)
        L_0x00d9:
            java.lang.String r0 = "extra_payment_type"
            r2.putExtra(r0, r11)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            java.lang.String r1 = r6.getRawString()
            java.lang.String r0 = "extra_jid"
            r2.putExtra(r0, r1)
            r5.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1901296z.A00(android.content.Context, X.11F, X.A8P, X.1EV, X.9ui, X.3Qa, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }
}
