package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

public final class AEC implements C88844Ug {
    public final C20810yC A00;

    public AEC(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean BNe(String str, int i, int i2) {
        if (this.A00.A0E(3773)) {
            return AnonymousClass6Rc.A01(str);
        }
        return false;
    }

    public /* synthetic */ void Bu6(Activity activity, AnonymousClass11F r2, String str, String str2) {
    }

    public /* synthetic */ DialogFragment BGM(AnonymousClass11F r2, String str, String str2, int i) {
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BJh(X.AnonymousClass01I r9, java.lang.String r10, int r11, int r12) {
        /*
            r8 = this;
            boolean r0 = X.AnonymousClass6Rc.A01(r10)
            if (r0 == 0) goto L_0x0134
            X.9uH r6 = new X.9uH
            r6.<init>()
            r2 = 0
        L_0x000c:
            int r0 = r10.length()
            if (r2 >= r0) goto L_0x00e0
            X.9Lu r1 = X.AnonymousClass6Rc.A00(r10, r2)
            X.8zJ r0 = r1.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00c9;
                case 3: goto L_0x001f;
                case 4: goto L_0x001f;
                case 5: goto L_0x001f;
                case 6: goto L_0x001f;
                case 7: goto L_0x001f;
                case 8: goto L_0x001f;
                case 9: goto L_0x00dc;
                case 10: goto L_0x002e;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00bd;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00ab;
                case 16: goto L_0x00a5;
                case 17: goto L_0x00a0;
                case 18: goto L_0x0024;
                case 19: goto L_0x009b;
                case 20: goto L_0x0024;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "Not interested in Card Payment Account Information"
        L_0x0021:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0024:
            java.lang.String r0 = r1.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 4
            int r2 = r2 + r0
            goto L_0x000c
        L_0x002e:
            java.lang.String r5 = r1.A03
            r0 = 0
            X.9Lu r4 = X.AnonymousClass6Rc.A00(r5, r0)
            java.lang.String r3 = r4.A01
            java.lang.String r0 = "00"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0098
            java.lang.String r3 = r4.A03
            java.lang.String r0 = "br.gov.bcb.pix"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r4.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r4 = r0 + 4
        L_0x0051:
            int r0 = r5.length()
            if (r4 >= r0) goto L_0x0024
            X.9Lu r7 = X.AnonymousClass6Rc.A00(r5, r4)
            java.lang.String r3 = r7.A01
            java.lang.String r0 = "01"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r7.A03
            r6.A00 = r0
        L_0x0069:
            java.lang.String r0 = r7.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 4
            int r4 = r4 + r0
            goto L_0x0051
        L_0x0073:
            java.lang.String r0 = "25"
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r7.A03
            r6.A0B = r0
            java.lang.String r0 = "Its a Dynamic PIX QRCode"
        L_0x0081:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0069
        L_0x0085:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Found PIX_SCHEMA_ID_UNKNOWN: "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = ".id"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            goto L_0x0081
        L_0x0098:
            java.lang.String r0 = "Not interested parsing other account information"
            goto L_0x0021
        L_0x009b:
            java.lang.String r0 = r1.A03
            r6.A02 = r0
            goto L_0x0024
        L_0x00a0:
            java.lang.String r0 = r1.A03
            r6.A08 = r0
            goto L_0x0024
        L_0x00a5:
            java.lang.String r0 = r1.A03
            r6.A04 = r0
            goto L_0x0024
        L_0x00ab:
            java.lang.String r0 = r1.A03
            r6.A05 = r0
            goto L_0x0024
        L_0x00b1:
            java.lang.String r0 = r1.A03
            r6.A01 = r0
            goto L_0x0024
        L_0x00b7:
            java.lang.String r0 = r1.A03
            r6.A09 = r0
            goto L_0x0024
        L_0x00bd:
            java.lang.String r0 = r1.A03
            r6.A0A = r0
            goto L_0x0024
        L_0x00c3:
            java.lang.String r0 = r1.A03
            r6.A03 = r0
            goto L_0x0024
        L_0x00c9:
            java.lang.String r0 = r1.A03
            r6.A07 = r0
            goto L_0x0024
        L_0x00cf:
            java.lang.String r0 = r1.A03
            r6.A06 = r0
            goto L_0x0024
        L_0x00d5:
            java.lang.String r0 = "Found Unknown EMV"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0024
        L_0x00dc:
            java.lang.String r0 = "Not interested in EMV Co. Reserved Payment Account Information"
            goto L_0x0021
        L_0x00e0:
            java.lang.String r7 = X.AnonymousClass1FR.A04(r11, r12)
            java.lang.String r0 = "unknown"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)
            java.lang.String r0 = " CS:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", MPO:"
            java.lang.String r7 = X.AnonymousClass000.A0r(r0, r1, r12)
        L_0x00fe:
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x012e
            boolean r0 = X.AnonymousClass098.A06(r0)
            if (r0 != 0) goto L_0x012e
            X.01z r5 = r9.getSupportFragmentManager()
            r4 = 0
            r3 = 1
            X.AnonymousClass00C.A0D(r7, r3)
            com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet r2 = new com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet
            r2.<init>()
            r0 = 2
            X.011[] r1 = new X.AnonymousClass011[r0]
            java.lang.String r0 = "bundle_key_pix_qrcode"
            X.C36341k9.A1J(r0, r6, r1, r4)
            java.lang.String r0 = "referral_screen"
            X.C36341k9.A1J(r0, r7, r1, r3)
            android.os.Bundle r0 = X.C05430Pr.A00(r1)
            r2.A17(r0)
            X.C65443Sb.A02(r2, r5)
            return
        L_0x012e:
            java.lang.String r0 = "Pix key is not available to copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0134:
            java.lang.String r0 = "Cannot handle Qr code data. Unable to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEC.BJh(X.01I, java.lang.String, int, int):void");
    }

    public /* synthetic */ String BFT(String str) {
        return null;
    }

    public /* synthetic */ boolean BNd(String str) {
        return false;
    }
}
