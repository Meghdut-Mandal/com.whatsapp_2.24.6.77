package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8vE  reason: invalid class name and case insensitive filesystem */
public final class C185988vE extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0e("0", "1");
    public static final ArrayList A01 = C165567td.A0e("0", "1");
    public static final ArrayList A02 = C165567td.A0f("FBPAY", "NOVI", "UPI");
    public static final ArrayList A03 = C165567td.A0e("1", "2");

    public C185988vE(String str, Long l) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C165567td.A1H(A0T, "urn:xmpp:whatsapp:account");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("accept_pay");
        Long l2 = l;
        if (l != null && C203539oF.A0L(l2, 0, 9007199254740991L, true)) {
            C36411kG.A1K(A0q, "tos-version", l2.longValue());
        }
        A0q.A08("UPI", "service", A02);
        A0q.A09("2", "version", A03);
        A0q.A08("1", "consumer", A00);
        AnonymousClass00C.A0D(A01, 2);
        C165567td.A1F(A0q, A0T, this);
    }
}
