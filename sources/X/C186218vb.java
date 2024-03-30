package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8vb  reason: invalid class name and case insensitive filesystem */
public final class C186218vb extends AnonymousClass5PS {
    public static final ArrayList A02 = C165567td.A0e("AI available", "In waitlist");
    public final String A00;
    public final C184828t4 A01;

    public C186218vb(C203399nx r5, C35911jS r6) {
        C203399nx A0e = C90514aH.A0e(r5, r6);
        this.A00 = C203379ns.A07(r5, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "state", A02);
        this.A01 = (C184828t4) C203539oF.A00(r5, new C23212B9u(A0e, 15));
        this.A00 = r5;
    }
}
