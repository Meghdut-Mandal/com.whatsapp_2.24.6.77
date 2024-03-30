package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Qx  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Qx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiSecureQrCodeViewModel A01;

    public /* synthetic */ AnonymousClass9Qx(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, int i) {
        this.A01 = indiaUpiSecureQrCodeViewModel;
        this.A00 = i;
    }

    public final void A00(C202059ky r9, String str) {
        C203479o6 A002;
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = this.A01;
        int i = this.A00;
        if (r9 != null) {
            C203479o6 A0S = indiaUpiSecureQrCodeViewModel.A0S();
            A0S.A04 = "01";
            indiaUpiSecureQrCodeViewModel.A00.A0D(A0S);
        } else if (!(TextUtils.isEmpty(str) || (A002 = C203479o6.A00(Uri.parse(str), "SCANNED_QR_CODE")) == null || A002.A0I == null)) {
            indiaUpiSecureQrCodeViewModel.A00.A0D(A002);
            if (A002.A0A == null) {
                AE0 ae0 = indiaUpiSecureQrCodeViewModel.A06;
                synchronized (ae0) {
                    try {
                        C24601Db r6 = ae0.A01;
                        JSONObject A0h = C165567td.A0h(r6);
                        A0h.put("signedQrCode", str);
                        A0h.put("signedQrCodeTs", C19970wo.A00(ae0.A00));
                        C165577te.A1B(r6, A0h);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeQrSignature threw: ", e);
                    }
                }
            }
        }
        indiaUpiSecureQrCodeViewModel.A01.A0D(new AnonymousClass9IM(0, i));
        return;
    }
}
