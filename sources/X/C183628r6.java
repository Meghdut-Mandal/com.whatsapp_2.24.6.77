package X;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8r6  reason: invalid class name and case insensitive filesystem */
public class C183628r6 extends C132446Tt {
    public final Activity A00;
    public final C202319lY A01;
    public final C22953Az5 A02;
    public final /* synthetic */ AE4 A03;

    public C183628r6(Activity activity, C202319lY r2, AE4 ae4, C22953Az5 az5) {
        this.A03 = ae4;
        this.A01 = r2;
        this.A02 = az5;
        this.A00 = activity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A08 = C207249un.A08(C202159l8.A0F, C165577te.A0o(this.A03.A08));
        if (A08.size() > 0) {
            return C36441kJ.A12(A08);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C50562l7 r8;
        C22953Az5 az5;
        C207249un r9 = (C207249un) obj;
        if (r9 == null && (az5 = this.A02) != null) {
            az5.BeS(C202059ky.A00());
        }
        AE4 ae4 = this.A03;
        Context context = ae4.A01.A00;
        C20810yC r7 = ae4.A03;
        AnonymousClass17Y r6 = ae4.A00;
        AnonymousClass19A r5 = ae4.A04;
        C29131Vl r4 = ae4.A09;
        AnonymousClass8gO r11 = new AnonymousClass8gO(context, r6, r7, r5, ae4.A05, ae4.A06, ae4.A07, r4);
        C23222BAe bAe = new C23222BAe(this, 0);
        C202319lY r0 = this.A01;
        C175928bI A002 = C202319lY.A00(r0);
        C175898bF r1 = r9.A08;
        C18740tg.A06(r1);
        C175818b6 r12 = (C175818b6) r1;
        String str = r0.A0K;
        AnonymousClass16X r3 = r0.A08;
        if (r3 == null) {
            r3 = null;
        }
        String str2 = A002.A0Q;
        String str3 = A002.A0R;
        String str4 = A002.A0O;
        C135086c7 r13 = r12.A05;
        Log.i("PAY: rejectCollect called");
        AnonymousClass19A r25 = r11.A02;
        String A09 = r25.A09();
        String A012 = r11.A04.A01();
        String str5 = (String) C165577te.A0g(r13);
        if (r3 != null) {
            r8 = new C50562l7(C185708uf.A02(r11.A01.A02(AnonymousClass16W.A05, r3)));
        } else {
            r8 = null;
        }
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        if (C203539oF.A0Q(A09, 0, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        }
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-reject-collect");
        if (C203539oF.A0U(str, 1, false)) {
            C36331k8.A1D(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        C203539oF.A0G(A0a, A012, false);
        if (C203539oF.A0P(str2, 1, 100, false)) {
            C36331k8.A1D(A0a, "sender-vpa", str2);
        }
        if (str3 != null && C203539oF.A0P(str3, 1, 100, true)) {
            C36331k8.A1D(A0a, "sender-vpa-id", str3);
        }
        if (str5 != null && C203539oF.A0Q(str5, 0, true)) {
            C36331k8.A1D(A0a, "upi-bank-info", str5);
        }
        if (C203539oF.A0S(str4, 1, false)) {
            C36331k8.A1D(A0a, "receiver-vpa", str4);
        }
        C165587tf.A1C(A0a, r8);
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        AnonymousClass9YX A04 = AnonymousClass9I1.A04(r11, "upi-reject-collect");
        r25.A0K(new B7M(r11.A00, r11.A01, (C22953Az5) bAe, r11.A03, A04, r11), A0I, A09, 204, 0);
    }
}
