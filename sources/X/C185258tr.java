package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.8tr  reason: invalid class name and case insensitive filesystem */
public class C185258tr extends C118095nK implements C23008Azy {
    public String A00;
    public final int A01;

    public C185258tr(C203399nx r9, int i) {
        String str;
        this.A01 = i;
        C203399nx r1 = r9;
        String[] A0P = C203399nx.A0P(r9, "group");
        Class<String> cls = String.class;
        Long A0P2 = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        if (i != 0) {
            str = "404";
        } else {
            str = "403";
        }
        C203379ns.A03(r1, cls, A0P2, A0Q, str, A0P, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        this.A00 = (String) C203379ns.A00.A0Z(r1, cls, C165607th.A0k(), C165597tg.A0e(), (Object) null, strArr, false);
        this.A00 = r9;
    }

    public void Azv(AnonymousClass9KD r5) {
        String str;
        int i = this.A01;
        Map map = r5.A02;
        AnonymousClass147 A02 = AnonymousClass143.A02(this.A00);
        if (i != 0) {
            AnonymousClass00C.A08(A02);
            str = "404";
        } else {
            AnonymousClass00C.A08(A02);
            str = "403";
        }
        map.put(A02, str);
    }
}
