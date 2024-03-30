package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8v8  reason: invalid class name and case insensitive filesystem */
public final class C185928v8 extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0e("pay_on_delivery", "pix_key");

    public C185928v8(C185718ug r8, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "create-custom-payment-method");
        C36331k8.A1D(A0a, "country", "BR");
        if (C203539oF.A0T(str2, 1, false)) {
            C36331k8.A1D(A0a, "device_id", str2);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("custom_payment_method");
        A0q.A09("pix_key", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        A0q.A06(r8.A00);
        C36361kB.A1H(A0q, A0a);
        C165567td.A1F(A0a, A0T, this);
    }
}
