package com.whatsapp.payments.pix.ui;

import X.AnonymousClass00C;
import X.C18820ts;
import X.C21060yb;
import X.C23075B3f;
import X.C36411kG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class FoundPixQrCodeBottomSheet extends Hilt_FoundPixQrCodeBottomSheet {
    public C21060yb A00;
    public C18820ts A01;
    public C23075B3f A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r10, android.view.View r11) {
        /*
            r9 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r11, r6)
            super.A1S(r10, r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 0
            r0 = 33
            android.os.Bundle r2 = r9.A0A
            if (r1 < r0) goto L_0x005d
            if (r2 == 0) goto L_0x0066
            java.lang.String r1 = "bundle_key_pix_qrcode"
            java.lang.Class<X.9uH> r0 = X.C206939uH.class
            java.lang.Object r8 = r2.getParcelable(r1, r0)
        L_0x001a:
            X.9uH r8 = (X.C206939uH) r8
        L_0x001c:
            android.os.Bundle r1 = r9.A0A
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "referral_screen"
            java.lang.String r5 = r1.getString(r0)
        L_0x0026:
            if (r8 == 0) goto L_0x00cd
            r0 = 2131432737(0x7f0b1521, float:1.848724E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r11, r0)
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x00c6
            r1.setText(r0)
            r0 = 2131432735(0x7f0b151f, float:1.8487236E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r11, r0)
            java.lang.String r0 = r8.A00
            r1.setText(r0)
            r0 = 2131427722(0x7f0b018a, float:1.8477068E38)
            android.view.View r4 = X.C36361kB.A0G(r11, r0)
            java.lang.String r0 = r8.A09
            if (r0 == 0) goto L_0x008e
            boolean r0 = X.AnonymousClass098.A06(r0)
            if (r0 != 0) goto L_0x008e
            r0 = 2131427723(0x7f0b018b, float:1.847707E38)
            android.widget.TextView r3 = X.C36341k9.A0M(r11, r0)
            goto L_0x0068
        L_0x005b:
            r5 = r7
            goto L_0x0026
        L_0x005d:
            if (r2 == 0) goto L_0x0066
            java.lang.String r0 = "bundle_key_pix_qrcode"
            android.os.Parcelable r8 = r2.getParcelable(r0)
            goto L_0x001a
        L_0x0066:
            r8 = r7
            goto L_0x001c
        L_0x0068:
            java.lang.String r0 = r8.A09     // Catch:{ NumberFormatException -> 0x0094 }
            X.C18740tg.A06(r0)     // Catch:{ NumberFormatException -> 0x0094 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ NumberFormatException -> 0x0094 }
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0094 }
            r1.<init>(r0)     // Catch:{ NumberFormatException -> 0x0094 }
            r0 = 2
            X.16X r2 = new X.16X     // Catch:{ NumberFormatException -> 0x0094 }
            r2.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x0094 }
            X.16U r1 = X.AnonymousClass16W.A04     // Catch:{ NumberFormatException -> 0x0094 }
            X.0ts r0 = r9.A01     // Catch:{ NumberFormatException -> 0x0094 }
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = r1.B7d(r0, r2)     // Catch:{ NumberFormatException -> 0x0094 }
            r3.setText(r0)     // Catch:{ NumberFormatException -> 0x0094 }
            goto L_0x009e
        L_0x0089:
            java.lang.RuntimeException r0 = X.C36321k7.A09()     // Catch:{ NumberFormatException -> 0x0094 }
            throw r0     // Catch:{ NumberFormatException -> 0x0094 }
        L_0x008e:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00a1
        L_0x0094:
            java.lang.String r0 = "Unable to format the Amount data, showing raw value"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = r8.A09
            r3.setText(r0)
        L_0x009e:
            r4.setVisibility(r6)
        L_0x00a1:
            r0 = 2131428410(0x7f0b043a, float:1.8478464E38)
            android.view.View r2 = X.C012005e.A02(r11, r0)
            r1 = 2
            X.3Ys r0 = new X.3Ys
            r0.<init>(r9, r8, r5, r1)
            r2.setOnClickListener(r0)
            X.B3f r2 = r9.A02
            if (r2 == 0) goto L_0x00bf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "pix_qr_code_found_prompt"
            r2.BOm(r1, r7, r0, r5)
            return
        L_0x00bf:
            java.lang.String r0 = "paymentUIEventLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c6:
            java.lang.String r0 = "payeeName"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to read "
            r1.append(r0)
            java.lang.Class<X.9uH> r0 = X.C206939uH.class
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = " from bundle"
            X.C36321k7.A1Z(r1, r0)
            r9.A1b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }
}
