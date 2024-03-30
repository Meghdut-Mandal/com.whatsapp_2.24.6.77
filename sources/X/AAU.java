package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class AAU implements AnonymousClass15z {
    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[13];
        A01.A02 = "jid";
        C52502pX r2 = C52502pX.TEXT;
        A01.A00 = r2;
        A01.A04 = true;
        A01.A0t();
        C63573Ko.A0e(A01, r3, 0);
        A01.A02 = "tag";
        A01.A00 = C52502pX.INTEGER;
        A01.A0u(0);
        C63573Ko.A0e(A01, r3, 1);
        C63573Ko.A08(A01, r2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3);
        A01.A02 = "is_default";
        A01.A00 = C52502pX.BOOLEAN;
        r3[3] = A01.A0r();
        C63573Ko.A0A(A01, r2, "attributes", r3);
        C63573Ko.A0B(A01, r2, "description", r3);
        C63573Ko.A0C(A01, r2, "category", r3);
        C63573Ko.A0D(A01, r2, "prompts", r3);
        C63573Ko.A0E(A01, r2, "behavior_graph", r3);
        C63573Ko.A0F(A01, r2, "persona_id", r3);
        C63573Ko.A0G(A01, r2, "commands_description", r3);
        C63573Ko.A0H(A01, r2, "commands", r3);
        C63573Ko.A0I(A01, r2, "avatar_url", r3);
        r8.A0B("wa_bot_profiles", r3);
    }

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
