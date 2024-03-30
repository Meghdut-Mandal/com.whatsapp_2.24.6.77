package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.63c  reason: invalid class name and case insensitive filesystem */
public class C1262363c {
    public AnonymousClass17Y A00;
    public C29221Vu A01;
    public C24601Db A02;
    public C29121Vk A03;

    public void A00(Context context) {
        String A09 = this.A03.A06.A09();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "w:pay");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36331k8.A1C(A0T, A09);
        AnonymousClass6QB A0q = C36441kJ.A0q("account");
        C36331k8.A1D(A0q, "action", "get-is-account-recoverable");
        C36361kB.A1H(A0q, A0T);
        C203399nx A032 = A0T.A03();
        this.A03.A0G(new C105565Fe(context, this.A01, this, this.A00), A032, A09, 0);
    }
}
