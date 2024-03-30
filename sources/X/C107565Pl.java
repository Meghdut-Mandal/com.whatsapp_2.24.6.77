package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.5Pl  reason: invalid class name and case insensitive filesystem */
public final class C107565Pl extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"false", "true"});

    public C107565Pl(C35891jQ r7, String str, byte[] bArr) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "vesta");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36331k8.A1C(A0T, str);
        A0T.A05(r7.A00);
        AnonymousClass6QB A0q = C36441kJ.A0q("l1");
        C203539oF.A0I(bArr, 1, 1024);
        A0q.A01 = bArr;
        AnonymousClass00C.A0D(A00, 2);
        C36361kB.A1H(A0q, A0T);
        this.A00 = A0T.A03();
    }
}
