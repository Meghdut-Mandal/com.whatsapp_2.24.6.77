package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.8t5  reason: invalid class name and case insensitive filesystem */
public class C184838t5 extends C118095nK {
    public Object A00;
    public String A01;

    public C184838t5(C203399nx r12, int i) {
        Object A02;
        C203399nx r4 = r12;
        if (i != 0) {
            this.A01 = (String) C203379ns.A05(r12, String.class, C203399nx.A0M(r12, "surface"), -9007199254740991L);
            ARR arr = ARR.A00;
            AnonymousClass00C.A0D(r12, 0);
            A02 = C203539oF.A09(r4, arr, new String[]{"promotion"}, 0, 100);
        } else {
            C203399nx.A0A(r12, "option");
            this.A01 = C203379ns.A0B(r12, new String[]{"value", "#elementValue"});
            A02 = C203379ns.A02(r12, AR8.A00, new String[]{"thumbnail_media"});
        }
        this.A00 = A02;
        this.A00 = r12;
    }

    public C184838t5(C203399nx r19, C203399nx r20, int i) {
        String str;
        C203399nx r11 = r19;
        String[] A0O = C203399nx.A0O(r11, "iq");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
                str = "result";
                break;
            default:
                str = "error";
                break;
        }
        C203379ns.A03(r11, cls, A0P, A0Q, str, A0O, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        C203539oF r2 = C203379ns.A00;
        C203399nx r3 = r20;
        C203539oF r10 = r2;
        Long l = A0P;
        Long l2 = A0Q;
        this.A01 = (String) r10.A0Z(r11, cls, l, l2, r2.A0Z(r3, cls, A0P, A0Q, (Object) null, strArr2, false), strArr, true);
        Class<Jid> cls2 = Jid.class;
        Class<Jid> cls3 = cls2;
        this.A00 = r10.A0Z(r11, cls3, l, l2, r2.A0Z(r3, cls2, A0P, A0Q, (Object) null, new String[]{"to"}, false), C165617ti.A0l(), true);
        this.A00 = r11;
    }
}
