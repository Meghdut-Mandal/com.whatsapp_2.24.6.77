package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.60q  reason: invalid class name and case insensitive filesystem */
public class C1256260q {
    public final AnonymousClass19A A00;

    public void A00(String str) {
        AnonymousClass19A r4 = this.A00;
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[3];
        r3[0] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
        r3[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "result");
        C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r3);
        r4.A0G(new C203399nx("iq", r3), 305);
    }

    public C1256260q(AnonymousClass19A r1) {
        this.A00 = r1;
    }
}
