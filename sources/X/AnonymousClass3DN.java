package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.3DN  reason: invalid class name */
public class AnonymousClass3DN {
    public final C19970wo A00;
    public final AnonymousClass19A A01;

    public C99424tL A00(AnonymousClass4TV r13, C51622o7 r14) {
        AnonymousClass19A r5 = this.A01;
        String A09 = r5.A09();
        C36321k7.A1Q("GdprXmppMethods/sendRequestGdprReport; iq=", A09, AnonymousClass000.A0u());
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("action", "request", A0I);
        if (r14 == C51622o7.NEWSLETTER) {
            C36381kD.A1M("report_type", "newsletters", A0I);
        }
        C203399nx r4 = new C203399nx("gdpr", (AnonymousClass1AL[]) A0I.toArray(new AnonymousClass1AL[0]));
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[4];
        C36341k9.A1V(r3, 0);
        C36341k9.A1L("xmlns", "urn:xmpp:whatsapp:account", r3, 1);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r3, 2);
        C36331k8.A1R(A09, r3, 3);
        C203399nx A0m = C36391kE.A0m(r4, r3);
        C99424tL r0 = new C99424tL();
        r5.A0E(new C65833Tq(r0, this, r13, 2), A0m, A09, 167, 32000);
        return r0;
    }

    public AnonymousClass3DN(C19970wo r1, AnonymousClass19A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
