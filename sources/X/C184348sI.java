package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8sI  reason: invalid class name and case insensitive filesystem */
public final class C184348sI extends C118095nK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C184348sI(C203399nx r9) {
        C203399nx r1 = r9;
        C203399nx.A0A(r9, "state");
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_NAME};
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        this.A01 = (String) C203379ns.A00.A0Z(r1, cls, A0P, A0Q, (Object) null, strArr, false);
        C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"input_path"}, false);
        this.A00 = (String) C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"input_selector"}, false);
        this.A02 = (String) C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"next"}, false);
        this.A04 = (String) C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"result_selector"}, false);
        this.A03 = (String) C203539oF.A07(r1, cls, A0P, A0Q, (Object) null, new String[]{"result_path"}, false);
        this.A00 = r9;
    }
}
