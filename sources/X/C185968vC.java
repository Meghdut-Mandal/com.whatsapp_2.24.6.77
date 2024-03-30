package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.8vC  reason: invalid class name and case insensitive filesystem */
public final class C185968vC extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0e("HPP_PAYMENT_LINK", "UPI");

    public C185968vC(UserJid userJid, C185708uf r16, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1C(new AnonymousClass1AL("xmlns", "w:pay"), A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-get-p2m-checkout-session");
        String str9 = str2;
        if (C203539oF.A0P(str9, 1, 100, false)) {
            C36331k8.A1D(A0a, "payment_config_id", str9);
        }
        C36351kA.A1I(userJid, A0a, "receiver");
        String str10 = str3;
        if (C203539oF.A0P(str10, 1, 100, false)) {
            C36331k8.A1D(A0a, "order_id", str10);
        }
        Long l2 = l;
        if (l != null && C203539oF.A0M(l2, true)) {
            C36411kG.A1K(A0a, "expiration_time_ms", l2.longValue());
        }
        String str11 = str4;
        if (C203539oF.A0P(str11, 1, 100, false)) {
            C36331k8.A1D(A0a, "order_message_id", str11);
        }
        String str12 = str5;
        if (C203539oF.A0P(str12, 1, 100, false)) {
            C36331k8.A1D(A0a, "request_id", str12);
        }
        String str13 = str6;
        if (str6 != null && C203539oF.A0Q(str13, 1, true)) {
            C36331k8.A1D(A0a, "payment_gateway_type", str13);
        }
        String str14 = str7;
        if (str7 != null && C203539oF.A0Q(str14, 1, true)) {
            C36331k8.A1D(A0a, "order_data", str14);
        }
        A0a.A09(str8, "payment_type", A00);
        C36361kB.A1H(C165577te.A0Y(r16, "amount"), A0a);
        C165567td.A1F(A0a, A0T, this);
    }
}
