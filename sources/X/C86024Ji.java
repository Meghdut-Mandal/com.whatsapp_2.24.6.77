package X;

/* renamed from: X.4Ji  reason: invalid class name and case insensitive filesystem */
public final class C86024Ji extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass2I3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86024Ji(AnonymousClass2I3 r2) {
        super(1);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [X.2sm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            java.util.List r3 = (java.util.List) r3
            X.2I3 r0 = r15.this$0
            X.AnonymousClass00C.A0B(r3)
            boolean r1 = r0 instanceof X.C43392Hi
            if (r1 == 0) goto L_0x003a
            r7 = 0
            X.AnonymousClass00C.A0D(r3, r7)
            java.util.Iterator r6 = r3.iterator()
            r4 = 0
        L_0x0016:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x016a
            java.lang.Object r5 = r6.next()
            X.2sm r5 = (X.C54332sm) r5
            boolean r1 = r5 instanceof X.AnonymousClass2TR
            if (r1 == 0) goto L_0x0016
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131889671(0x7f120e07, float:1.9414012E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.2TR r5 = (X.AnonymousClass2TR) r5
            java.lang.String r1 = r5.A00
            java.lang.String r4 = X.C36411kG.A0w(r4, r1, r2, r7, r3)
            goto L_0x0016
        L_0x003a:
            r11 = 0
            X.AnonymousClass00C.A0D(r3, r11)
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131889672(0x7f120e08, float:1.9414014E38)
            java.lang.String r6 = X.C36381kD.A0s(r2, r1)
            java.util.Iterator r9 = r3.iterator()
            r5 = 0
            r4 = r5
        L_0x004f:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r7 = r9.next()
            X.2sm r7 = (X.C54332sm) r7
            boolean r1 = r7 instanceof X.AnonymousClass2TS
            if (r1 == 0) goto L_0x006d
            boolean r1 = r0.A09
            if (r1 != 0) goto L_0x004f
            com.whatsapp.WaTextView r2 = r0.A07
            X.2TS r7 = (X.AnonymousClass2TS) r7
            java.lang.String r1 = r7.A00
            r2.setText(r1)
            goto L_0x004f
        L_0x006d:
            boolean r1 = r7 instanceof X.AnonymousClass2TR
            r8 = 1
            if (r1 == 0) goto L_0x0084
            android.content.res.Resources r5 = r0.getResources()
            r3 = 2131889671(0x7f120e07, float:1.9414012E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            X.2TR r7 = (X.AnonymousClass2TR) r7
            java.lang.String r1 = r7.A00
            java.lang.String r5 = X.C36411kG.A0w(r5, r1, r2, r11, r3)
            goto L_0x004f
        L_0x0084:
            boolean r1 = r7 instanceof X.AnonymousClass2TQ
            if (r1 == 0) goto L_0x004f
            r4 = r7
            X.2TQ r4 = (X.AnonymousClass2TQ) r4
            X.3Q0 r7 = r4.A00
            X.3QN r1 = r7.A02
            java.lang.String r2 = r1.A03
            X.3Gy r1 = r0.A0D
            boolean r1 = r1.A05
            if (r1 == 0) goto L_0x00da
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x00da
            int r1 = r7.A00
            if (r1 != r8) goto L_0x00c3
            android.content.res.Resources r6 = r0.getResources()
            r3 = 2131894385(0x7f122071, float:1.9423573E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            X.3QN r1 = r7.A02
            java.lang.String r1 = r1.A03
            r2[r11] = r1
        L_0x00b0:
            java.lang.String r6 = r6.getString(r3, r2)
            X.AnonymousClass00C.A08(r6)
        L_0x00b7:
            r2 = 9
            int r1 = r7.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.AnonymousClass2I3.A0B(r0, r1, r2)
            goto L_0x004f
        L_0x00c3:
            if (r1 <= r8) goto L_0x00b7
            android.content.res.Resources r6 = r0.getResources()
            r3 = 2131891188(0x7f1213f4, float:1.941709E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            X.C36431kI.A1O(r2, r1, r11)
            X.3QN r1 = r7.A02
            java.lang.String r1 = r1.A03
            r2[r8] = r1
            goto L_0x00b0
        L_0x00da:
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755035(0x7f10001b, float:1.9140938E38)
            int r1 = r7.A00
            java.lang.String r6 = X.C36321k7.A0B(r3, r1, r11, r2)
            X.AnonymousClass00C.A08(r6)
            goto L_0x004f
        L_0x00ec:
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131889673(0x7f120e09, float:1.9414016E38)
            java.lang.String r3 = X.C36381kD.A0s(r2, r1)
            java.lang.String r2 = " • "
            if (r5 == 0) goto L_0x0106
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r5, r2, r3, r1)
            java.lang.String r3 = r1.toString()
        L_0x0106:
            r0.A06 = r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r3, r2, r6, r1)
            java.lang.String r2 = r1.toString()
            r0.A06 = r2
            r1 = 8
            com.whatsapp.TextEmojiLabel r9 = r0.A0B
            if (r4 == 0) goto L_0x0166
            X.1e1 r3 = r0.A1w
            android.content.Context r4 = r9.getContext()
            java.lang.String r6 = r0.A06
            android.content.Context r2 = r0.getContext()
            int r8 = X.C36381kD.A01(r2)
            r2 = 10
            X.3v4 r5 = X.C80233v4.A00(r0, r2)
            java.lang.String r7 = "common-group"
            android.text.SpannableStringBuilder r2 = r3.A03(r4, r5, r6, r7, r8)
            r9.setText(r2)
            X.0yb r2 = r0.A0D
            X.C36331k8.A16(r9, r2)
            X.0yC r2 = r0.A0G
            X.C36331k8.A10(r9, r2)
            X.3Gy r2 = r0.A0D
            boolean r2 = r2.A05
            if (r2 == 0) goto L_0x015a
            com.whatsapp.wds.components.button.WDSButton r2 = r0.A0H
            r2.setVisibility(r1)
            X.0ts r10 = r0.A0E
            int r14 = X.C36411kG.A05(r0)
            r12 = 0
            r13 = 0
            X.AnonymousClass1JZ.A07(r9, r10, r11, r12, r13, r14)
        L_0x015a:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A0A
            r0.A04()
            r0.setVisibility(r1)
            r9.setVisibility(r11)
            goto L_0x01be
        L_0x0166:
            r9.setText(r2)
            goto L_0x015a
        L_0x016a:
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131889673(0x7f120e09, float:1.9414016E38)
            java.lang.String r3 = X.C36381kD.A0s(r2, r1)
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131887259(0x7f12049b, float:1.940912E38)
            java.lang.String r2 = X.C36381kD.A0s(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)
            java.lang.String r3 = " • "
            java.lang.String r2 = X.AnonymousClass000.A0p(r3, r2, r1)
            if (r4 == 0) goto L_0x0197
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1D(r4, r3, r2, r1)
            java.lang.String r2 = r1.toString()
        L_0x0197:
            r0.setTrustSignals(r2)
            com.whatsapp.TextEmojiLabel r5 = r0.A0B
            java.lang.String r1 = r0.A06
            r5.setText(r1)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r0.A0A
            r1.A04()
            r2 = 8
            r1.setVisibility(r2)
            r5.setVisibility(r7)
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A0H
            r1.setVisibility(r2)
            X.0ts r6 = r0.A0E
            int r10 = X.C36411kG.A05(r0)
            r8 = 0
            r9 = 0
            X.AnonymousClass1JZ.A07(r5, r6, r7, r8, r9, r10)
        L_0x01be:
            X.2I3 r1 = r15.this$0
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x01fd
            r0 = 1
            r1.A08 = r0
            X.3T1 r0 = r1.A0K
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x01fd
            X.3Gy r8 = r1.A0D
            X.1su r7 = r1.A0E
            java.lang.String r6 = r0.toString()
            X.0v0 r5 = r8.A00
            java.lang.String r4 = "fmx_card_view_pending_chats"
            java.util.Set r3 = r5.A0p(r4)
            X.AnonymousClass00C.A08(r3)
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L_0x01fd
            r2 = 0
            r1 = 7
            r0 = 0
            r8.A01(r7, r2, r1, r0)
            java.util.Set r1 = X.C13640kC.A06(r6, r3)
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r5)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r4, r1)
            r0.apply()
        L_0x01fd:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86024Ji.invoke(java.lang.Object):java.lang.Object");
    }
}
