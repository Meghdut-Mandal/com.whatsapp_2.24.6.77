package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.5Pj  reason: invalid class name and case insensitive filesystem */
public final class C107545Pj extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"0", "1"});

    public C107545Pj(String str) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, "xmlns", "urn:xmpp:whatsapp:push");
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("config");
        A0q.A08("1", "version", A00);
        C36361kB.A1H(A0q, A0T);
        this.A00 = A0T.A03();
    }
}
