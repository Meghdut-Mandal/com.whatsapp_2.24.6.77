package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8rC  reason: invalid class name and case insensitive filesystem */
public class C183688rC extends C132446Tt {
    public final C19700wN A00;
    public final AnonymousClass8gH A01;
    public final B2W A02;
    public final AFC A03;
    public final C29131Vl A04;
    public final String A05 = "initial";
    public final boolean A06;
    public final C24651Dg A07;
    public final C24641Df A08;

    public C183688rC(C19700wN r2, AnonymousClass8gH r3, B2W b2w, C24651Dg r5, C24641Df r6, AFC afc, C29131Vl r8, boolean z) {
        this.A04 = r8;
        this.A03 = afc;
        this.A00 = r2;
        this.A06 = z;
        this.A02 = b2w;
        this.A01 = r3;
        this.A08 = r6;
        this.A07 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A03.B9W(this.A05, this.A04.A01(), this.A06);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            Log.i("PAY: IndiaUpiSetupCoordinator/challenge got");
            AnonymousClass8gH r9 = this.A01;
            String str2 = this.A05;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                Log.i("PAY: IndiaUpiSetupCoordinator/getToken called with invalid type/challenge");
            } else {
                Log.i("PAY: IndiaUpiSetupCoordinator/getToken called");
                if (!TextUtils.isEmpty(str)) {
                    r9.A06.Buu();
                    AnonymousClass19A r12 = r9.A02;
                    String A09 = r12.A09();
                    ArrayList arrayList = C107525Ph.A00;
                    String A012 = r9.A08.A01();
                    String A0B = r9.A03.A0B();
                    String A0y = C90514aH.A0y(str2);
                    AnonymousClass6QB A0T = C36421kH.A0T();
                    C165567td.A1D(A0T);
                    C36331k8.A1C(A0T, A09);
                    AnonymousClass6QB A0a = C165587tf.A0a();
                    C36331k8.A1D(A0a, "action", "upi-get-token");
                    if (C203539oF.A0P(str, 0, 1000, false)) {
                        C36331k8.A1D(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, str);
                    }
                    if (C203539oF.A0P(A012, 1, 1000, false)) {
                        C36331k8.A1D(A0a, "device-id", A012);
                    }
                    if (A0B != null && C203539oF.A0R(A0B, 1, true)) {
                        C36331k8.A1D(A0a, "provider-type", A0B);
                    }
                    A0a.A09(A0y, "token-type", C107525Ph.A00);
                    AnonymousClass00C.A0D(C107525Ph.A01, 2);
                    C203399nx A0I = C165567td.A0I(A0a, A0T);
                    AnonymousClass9YX r11 = r9.A00;
                    r11.A02("upi-get-token");
                    r12.A0E(new B7L(r9.A00, r9.A01, r9, r9.A05, r11), A0I, A09, 204, 0);
                }
            }
        } else {
            B2W b2w = this.A02;
            if (b2w != null) {
                b2w.BYW();
            }
            this.A00.A0E("payments/indiaupi", "Failed to get Challenge", true);
        }
        C195049Sg.A09 = null;
    }
}
