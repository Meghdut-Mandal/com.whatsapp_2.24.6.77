package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8tY  reason: invalid class name */
public final class AnonymousClass8tY extends C118095nK implements C23000Azq {
    public final C183998rj A00;

    public void Azs(AnonymousClass9EJ r4) {
        C183998rj r2 = this.A00;
        if (r2 != null) {
            r4.A00.A01.A07 = r2.A00;
        }
    }

    public AnonymousClass8tY(C203399nx r5) {
        C203399nx.A0A(r5, "product");
        C203379ns.A0D(r5, String.class, C90474aD.A0Y(), C165577te.A0a(), new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "#elementValue"});
        this.A00 = (C183998rj) C203379ns.A02(r5, C21397AJx.A00, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME});
        this.A00 = r5;
    }
}
