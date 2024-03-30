package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8s7  reason: invalid class name and case insensitive filesystem */
public class C184238s7 extends C118095nK {
    public Object A00;
    public final int A01;

    public C184238s7(C203399nx r5, int i) {
        Object A06;
        this.A01 = i;
        if (i != 0) {
            A06 = C203379ns.A05(r5, AnonymousClass148.class, C203399nx.A0N(r5, PublicKeyCredentialControllerUtility.JSON_KEY_USER), -9007199254740991L);
        } else {
            C203399nx.A0A(r5, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            C22993Azj[] azjArr = new C22993Azj[3];
            azjArr[0] = C21429ALd.A00;
            azjArr[1] = C21430ALe.A00;
            A06 = C203379ns.A06(r5, "IQErrorInternalServerError|IQErrorItemNotFound|IQErrorForbidden", C165567td.A0d(C21431ALf.A00, azjArr, 2), C165607th.A1a());
        }
        this.A00 = A06;
        this.A00 = r5;
    }
}
