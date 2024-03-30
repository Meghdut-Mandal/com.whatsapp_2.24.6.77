package com.whatsapp.backup.encryptedbackup;

import X.C18820ts;
import X.C20810yC;

public final class EnableInfoFragment extends Hilt_EnableInfoFragment {
    public C18820ts A00;
    public C20810yC A01;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r4, android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            X.0yC r1 = r3.A01
            if (r1 == 0) goto L_0x002c
            r0 = 5113(0x13f9, float:7.165E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001f
            X.0yC r1 = r3.A01
            if (r1 == 0) goto L_0x0027
            r0 = 4870(0x1306, float:6.824E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 2131624901(0x7f0e03c5, float:1.8876995E38)
            if (r1 != 0) goto L_0x0022
        L_0x001f:
            r0 = 2131624900(0x7f0e03c4, float:1.8876993E38)
        L_0x0022:
            android.view.View r0 = r5.inflate(r0, r6, r2)
            return r0
        L_0x0027:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x002c:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EnableInfoFragment.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r16, android.view.View r17) {
        /*
            r15 = this;
            r7 = 0
            r8 = r17
            X.AnonymousClass00C.A0D(r8, r7)
            r0 = r16
            super.A1Q(r0)
            X.04R r9 = X.C36331k8.A0A(r15)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r9 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r9
            X.0yC r1 = r15.A01
            if (r1 == 0) goto L_0x01ee
            r0 = 5113(0x13f9, float:7.165E-42)
            boolean r14 = r1.A0E(r0)
            r1 = 4870(0x1306, float:6.824E-42)
            if (r14 == 0) goto L_0x0111
            X.0yC r0 = r15.A01
            if (r0 == 0) goto L_0x01df
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x0111
            r0 = 2131429736(0x7f0b0968, float:1.8481153E38)
            android.view.View r3 = X.C36361kB.A0G(r8, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r3 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r3
            r1 = 12
            X.2hx r0 = new X.2hx
            r0.<init>(r9, r1)
            r3.setPrimaryButtonClickListener(r0)
            boolean r0 = X.C222013h.A05
            if (r0 == 0) goto L_0x0103
            android.content.Context r1 = r15.A0a()
            X.298 r4 = X.AnonymousClass298.A00
            X.7u4 r2 = new X.7u4
            r2.<init>()
            r0 = 2132017220(0x7f140044, float:1.9672712E38)
            X.6TF r1 = X.C203529oE.A06(r1, r0)
            X.3bg r0 = new X.3bg
            r0.<init>(r2, r4)
            r1.A02(r0)
        L_0x005a:
            r3.setHeaderImage(r2)
            r0 = 2131889111(0x7f120bd7, float:1.9412876E38)
            java.lang.String r0 = r15.A0n(r0)
            r3.setHeadlineText(r0)
            r0 = 2131889148(0x7f120bfc, float:1.9412951E38)
            java.lang.String r0 = r15.A0n(r0)
            r3.setPrimaryButtonText(r0)
        L_0x0071:
            X.0yC r1 = r15.A01
            if (r1 == 0) goto L_0x01da
            r0 = 4869(0x1305, float:6.823E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0102
            X.0yC r1 = r15.A01
            if (r1 == 0) goto L_0x01d5
            r0 = 4870(0x1306, float:6.824E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0102
            r0 = 2131429913(0x7f0b0a19, float:1.8481512E38)
            android.widget.TextView r2 = X.C36341k9.A0M(r8, r0)
            r0 = 2131889111(0x7f120bd7, float:1.9412876E38)
            r2.setText(r0)
            android.content.res.Resources r1 = X.C36341k9.A0G(r15)
            r0 = 2131166443(0x7f0704eb, float:1.7947131E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setPadding(r7, r7, r7, r0)
            android.view.View r1 = r15.A0d()
            r0 = 2131429911(0x7f0b0a17, float:1.8481508E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r15.A0d()
            r1 = 2131429917(0x7f0b0a1d, float:1.848152E38)
            android.view.View r3 = X.C36361kB.A0G(r0, r1)
            r3.setVisibility(r7)
            r0 = 2131429937(0x7f0b0a31, float:1.848156E38)
            X.C36341k9.A10(r3, r0, r2)
            r0 = 2131429939(0x7f0b0a33, float:1.8481565E38)
            X.C36341k9.A10(r3, r0, r2)
            r0 = 2131429938(0x7f0b0a32, float:1.8481563E38)
            X.C36341k9.A10(r3, r0, r2)
            android.view.View r0 = r15.A0d()
            android.view.View r2 = X.C36361kB.A0G(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            X.0Yx r1 = new X.0Yx
            r1.<init>()
            r1.A0B(r2)
            r0 = 2131429940(0x7f0b0a34, float:1.8481567E38)
            r1.A06(r0)
            r0 = 2131429942(0x7f0b0a36, float:1.848157E38)
            r1.A06(r0)
            r0 = 2131429941(0x7f0b0a35, float:1.8481569E38)
            r1.A06(r0)
            r1.A09(r2)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r3.setLayoutParams(r0)
        L_0x0102:
            return
        L_0x0103:
            android.content.res.Resources r2 = X.C36341k9.A0G(r15)
            r1 = 0
            r0 = 2131233929(0x7f080c89, float:1.808401E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass0BT.A00(r1, r2, r0)
            goto L_0x005a
        L_0x0111:
            r0 = 2131429910(0x7f0b0a16, float:1.8481506E38)
            android.widget.TextView r10 = X.C36341k9.A0M(r8, r0)
            X.0v0 r5 = r9.A0D
            java.lang.String r0 = r5.A0c()
            if (r0 == 0) goto L_0x01d1
            long r3 = r5.A0U(r0)
        L_0x0124:
            java.lang.String r11 = r5.A0c()
            if (r11 == 0) goto L_0x01cd
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = -1
            if (r0 != 0) goto L_0x0144
            android.content.SharedPreferences r6 = X.C36341k9.A0E(r5)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive_last_successful_backup_media_size:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r11, r5)
            long r1 = r6.getLong(r0, r1)
        L_0x0144:
            r12 = 0
            int r11 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x0150
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x018d
        L_0x0150:
            r0 = 2131429911(0x7f0b0a17, float:1.8481508E38)
            android.widget.TextView r5 = X.C36391kE.A0O(r8, r0)
            r0 = 2131889145(0x7f120bf9, float:1.9412945E38)
            r5.setText(r0)
            if (r11 <= 0) goto L_0x018d
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x018d
            r10.setVisibility(r7)
            android.content.Context r11 = r15.A0a()
            r6 = 2131889144(0x7f120bf8, float:1.9412943E38)
            java.lang.Object[] r5 = X.AnonymousClass001.A0M()
            X.0ts r0 = r15.A00
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = X.AnonymousClass3TF.A03(r0, r3)
            r5[r7] = r0
            r3 = 1
            X.0ts r0 = r15.A00
            if (r0 == 0) goto L_0x01e4
            java.lang.String r0 = X.AnonymousClass3TF.A03(r0, r1)
            r5[r3] = r0
            android.text.Spanned r0 = X.AnonymousClass14B.A01(r11, r5, r6)
            r10.setText(r0)
        L_0x018d:
            r0 = 2131429914(0x7f0b0a1a, float:1.8481514E38)
            android.view.View r1 = X.C012005e.A02(r8, r0)
            r0 = 13
            X.C48732hx.A00(r1, r9, r0)
            boolean r0 = X.C222013h.A05
            android.content.Context r1 = r15.A0a()
            if (r0 == 0) goto L_0x01c5
            X.298 r3 = X.AnonymousClass298.A00
            X.7u4 r2 = new X.7u4
            r2.<init>()
            r0 = 2132017220(0x7f140044, float:1.9672712E38)
            X.6TF r1 = X.C203529oE.A06(r1, r0)
            X.3bg r0 = new X.3bg
            r0.<init>(r2, r3)
            r1.A02(r0)
        L_0x01b7:
            r0 = 2131429912(0x7f0b0a18, float:1.848151E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r8, r0)
            r0.setImageDrawable(r2)
            if (r14 == 0) goto L_0x0102
            goto L_0x0071
        L_0x01c5:
            r0 = 2131232993(0x7f0808e1, float:1.808211E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass00E.A00(r1, r0)
            goto L_0x01b7
        L_0x01cd:
            r1 = 0
            goto L_0x0144
        L_0x01d1:
            r3 = 0
            goto L_0x0124
        L_0x01d5:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x01da:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x01df:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x01e4:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x01e9:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x01ee:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EnableInfoFragment.A1S(android.os.Bundle, android.view.View):void");
    }
}
