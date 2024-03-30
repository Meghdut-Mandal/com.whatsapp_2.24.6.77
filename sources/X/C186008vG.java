package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8vG  reason: invalid class name and case insensitive filesystem */
public class C186008vG extends C50502l1 {
    public C186008vG(String str, int i) {
        String str2;
        C203399nx A03;
        AnonymousClass6QB A0T = C36421kH.A0T();
        switch (i) {
            case 6:
                C36341k9.A1C(A0T);
                C165567td.A1H(A0T, "urn:xmpp:whatsapp:username");
                C203539oF.A0E(A0T, str);
                str2 = "username";
                break;
            case 7:
                C36341k9.A1C(A0T);
                C165567td.A1G(A0T, "urn:xmpp:whatsapp:username");
                C203539oF.A0E(A0T, str);
                A03 = A0T.A03();
                break;
            default:
                C36341k9.A1C(A0T);
                C165567td.A1G(A0T, "call");
                C203539oF.A0E(A0T, str);
                str2 = "avatar_consent_result";
                break;
        }
        A03 = C165567td.A0I(C36441kJ.A0q(str2), A0T);
        this.A00 = A03;
    }

    public C186008vG(String str, String str2, int i) {
        boolean z;
        AnonymousClass6QB r5;
        String str3;
        long j;
        String str4;
        C203399nx A03;
        AnonymousClass6QB A0T = C36421kH.A0T();
        String str5 = str2;
        switch (i) {
            case 0:
                C165567td.A1D(A0T);
                z = false;
                j = 0;
                C36331k8.A1C(A0T, str);
                r5 = C165587tf.A0a();
                str3 = "action";
                str4 = "upi-block-vpa";
                break;
            case 5:
                C165567td.A1D(A0T);
                z = false;
                j = 0;
                C36331k8.A1C(A0T, str);
                r5 = C165587tf.A0a();
                str3 = "action";
                str4 = "upi-unblock-vpa";
                break;
            default:
                C36341k9.A1C(A0T);
                C165567td.A1H(A0T, "urn:xmpp:whatsapp:username");
                C203539oF.A0E(A0T, str);
                AnonymousClass6QB A0q = C36441kJ.A0q("username");
                if (C203539oF.A0P(str5, 3, 30, false)) {
                    A0q.A07(str2);
                }
                A03 = A0q.A03();
                break;
        }
        C36331k8.A1D(r5, str3, str4);
        if (C203539oF.A0S(str2, j, z)) {
            C36331k8.A1D(r5, "vpa", str2);
        }
        A03 = r5.A03();
        A0T.A05(A03);
        C592133b.A00(A0T, this);
    }

    public C186008vG(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-activate-international-payments");
        if (C203539oF.A0L(l, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0a, "start-ts", l.longValue());
        }
        if (C203539oF.A0L(l2, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0a, "end-ts", l2.longValue());
        }
        C36411kG.A1K(A0a, "version", 1);
        if (C203539oF.A0P(str2, 1, 1000, false)) {
            C36331k8.A1D(A0a, "vpa", str2);
        }
        String str9 = str3;
        if (C203539oF.A0P(str9, 1, 1000, false)) {
            C36331k8.A1D(A0a, "vpa-id", str9);
        }
        C203539oF.A0D(A0a, str4);
        String str10 = str5;
        if (C203539oF.A0P(str10, 1, 1000, false)) {
            C36331k8.A1D(A0a, "device-id", str10);
        }
        String str11 = str6;
        if (C203539oF.A0P(str11, 1, 1000, false)) {
            C36331k8.A1D(A0a, "mpin", str11);
        }
        String str12 = str7;
        if (C203539oF.A0P(str12, 0, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str12);
        }
        String str13 = str8;
        if (C203539oF.A0P(str13, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0a, "upi-bank-info", str13);
        }
        C165567td.A1F(A0a, A0T, this);
    }

    public C186008vG(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-deactivate-international-payments");
        C36411kG.A1K(A0a, "version", 1);
        if (C203539oF.A0P(str2, 1, 1000, false)) {
            C36331k8.A1D(A0a, "vpa", str2);
        }
        if (C203539oF.A0P(str3, 1, 1000, false)) {
            C36331k8.A1D(A0a, "vpa-id", str3);
        }
        C203539oF.A0D(A0a, str4);
        if (C203539oF.A0P(str5, 1, 1000, false)) {
            C36331k8.A1D(A0a, "device-id", str5);
        }
        String str9 = str6;
        if (C203539oF.A0P(str9, 1, 1000, false)) {
            C36331k8.A1D(A0a, "mpin", str9);
        }
        String str10 = str7;
        if (C203539oF.A0P(str10, 0, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str10);
        }
        String str11 = str8;
        if (C203539oF.A0P(str11, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0a, "upi-bank-info", str11);
        }
        C165567td.A1F(A0a, A0T, this);
    }

    public C186008vG(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-validate-international-qr");
        C36411kG.A1K(A0a, "version", 1);
        String str6 = str2;
        if (C203539oF.A0P(str6, 1, 1000, false)) {
            C36331k8.A1D(A0a, "device-id", str6);
        }
        String str7 = str3;
        if (C203539oF.A0P(str7, 0, 35, false)) {
            C36331k8.A1D(A0a, "seq-no", str7);
        }
        String str8 = str4;
        if (C203539oF.A0V(str8, 1, false)) {
            C36331k8.A1D(A0a, "qr-payload", str8);
        }
        String str9 = str5;
        if (C203539oF.A0P(str9, 1, 1000, false)) {
            C36331k8.A1D(A0a, "vpa", str9);
        }
        C165567td.A1F(A0a, A0T, this);
    }

    public C186008vG(String str, Long l) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C165567td.A1H(A0T, "call");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("avatar_consent_result");
        if (C203539oF.A0L(l, 0, 2, false)) {
            C36411kG.A1K(A0q, "value", l.longValue());
        }
        C165567td.A1F(A0q, A0T, this);
    }

    public C186008vG(String str, List list) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "get-contacts-payment-status");
        if (C203539oF.A0Y(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C592133b.A01(A0a, it);
            }
        }
        C165567td.A1F(A0a, A0T, this);
    }

    public C186008vG(String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "fb:thrift_iq");
        C165567td.A1C(new AnonymousClass1AL("smax_id", 108), A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("app_id");
        if (C203539oF.A0P("3402315746664947", 1, 30, false)) {
            A0q.A07("3402315746664947");
        }
        C165567td.A1F(A0q, A0T, this);
    }
}
