package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3iP  reason: invalid class name and case insensitive filesystem */
public final class C72453iP implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_add_on_event_response_index", "CREATE INDEX IF NOT EXISTS message_add_on_event_response_index ON message_add_on_event_response (response)");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean] */
    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[3];
        A01.A02 = "message_add_on_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        ? A0h = C63573Ko.A0h(A01, r2, r3);
        r3[A0h] = C63573Ko.A03(A01, r2, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0);
        C63573Ko.A0S(A01, r2, "sender_timestamp", r3, A0h);
        r8.A0B("message_add_on_event_response", r3);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A05(r6, "message_add_on", "message_add_on_event_response", "message_add_on_row_id=old._id");
    }
}
