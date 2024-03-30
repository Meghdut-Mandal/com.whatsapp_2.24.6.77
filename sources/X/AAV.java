package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public class AAV implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("jid_key_new_index", "CREATE UNIQUE INDEX IF NOT EXISTS jid_key_new_index ON jid (user, server, agent, device, type)");
        r5.A07("jid_raw_string_index", "CREATE UNIQUE INDEX IF NOT EXISTS jid_raw_string_index ON jid (raw_string)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko r5 = new C63573Ko();
        C64563Om[] r4 = new C64563Om[7];
        C52502pX A0R = C165577te.A0R(r5, r4);
        r5.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        C52502pX r2 = C52502pX.TEXT;
        r5.A00 = r2;
        r5.A04 = true;
        C63573Ko.A0e(r5, r4, 1);
        r5.A02 = "server";
        C63573Ko.A0Y(r5, r2, r4, true);
        C63573Ko.A09(r5, A0R, "agent", r4);
        C63573Ko.A0A(r5, A0R, "device", r4);
        C63573Ko.A0B(r5, A0R, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4);
        C63573Ko.A0C(r5, r2, "raw_string", r4);
        r8.A0B("jid", r4);
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
