package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.6Ki  reason: invalid class name and case insensitive filesystem */
public final class C130256Ki {
    public final C19970wo A00;
    public final C20810yC A01;
    public final AnonymousClass19A A02;
    public final C21690ze A03;

    public static final C203399nx A00(String str) {
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[4];
        r3[0] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        r3[1] = new AnonymousClass1AL("xmlns", "status");
        C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r3);
        r3[3] = new AnonymousClass1AL((Jid) C177588e2.A00, "to");
        return C36391kE.A0m(new C203399nx("privacy", (AnonymousClass1AL[]) null), r3);
    }

    public C130256Ki(C19970wo r1, C20810yC r2, AnonymousClass19A r3, C21690ze r4) {
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
