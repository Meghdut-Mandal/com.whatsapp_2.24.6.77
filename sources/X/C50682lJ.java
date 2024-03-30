package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.2lJ  reason: invalid class name and case insensitive filesystem */
public final class C50682lJ extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"block", "unblock"});

    public C50682lJ(AnonymousClass148 r6, String str, String str2) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36331k8.A1D(A0T, "xmlns", "w:interop");
        C36341k9.A1C(A0T);
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("blocklist");
        AnonymousClass6QB A0q2 = C36441kJ.A0q("item");
        A0q2.A09(str2, "action", A00);
        if (C203539oF.A0N(r6, "blocklist->item->jid")) {
            C36351kA.A1I(r6, A0q2, "jid");
        }
        C36361kB.A1H(A0q2, A0q);
        C36361kB.A1H(A0q, A0T);
        C592133b.A00(A0T, this);
    }
}
