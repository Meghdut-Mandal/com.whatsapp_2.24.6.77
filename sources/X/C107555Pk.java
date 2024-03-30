package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5Pk  reason: invalid class name and case insensitive filesystem */
public final class C107555Pk extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"false", "true"});

    public C107555Pk(UserJid userJid, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "w:pay");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("account");
        C36331k8.A1D(A0q, "action", "upi-get-vpa");
        C36351kA.A1I(userJid, A0q, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A0q.A08(str2, "is_first_send", A00);
        C36361kB.A1H(A0q, A0T);
        this.A00 = A0T.A03();
    }
}
