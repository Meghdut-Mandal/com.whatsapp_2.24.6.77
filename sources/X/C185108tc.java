package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.8tc  reason: invalid class name and case insensitive filesystem */
public final class C185108tc extends C118095nK implements C23002Azs {
    public final String A00;

    public void Azt(AnonymousClass9HP r10) {
        AnonymousClass9OJ r2 = r10.A01;
        r2.A06 = this.A00;
        r2.A07 = "";
        r2.A02 = new C206769tw((String) null, (String) null, (List) null, 3, false);
        r2.A01 = 99;
    }

    public C185108tc(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "product");
        Class<String> cls = String.class;
        C203379ns.A03(r2, cls, C165567td.A0P(), C165567td.A0Q(), "deleted", new String[]{"status", "#elementValue"}, false);
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"};
        this.A00 = (String) C203379ns.A00.A0Z(r2, cls, C90474aD.A0Y(), C165577te.A0a(), (Object) null, strArr, false);
        this.A00 = r10;
    }
}
