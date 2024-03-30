package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3i2  reason: invalid class name and case insensitive filesystem */
public final class C72223i2 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_event_name_index", "CREATE INDEX IF NOT EXISTS message_event_name_index ON message_event (name)");
        r5.A07("message_event_chat_row_id_and_start_time_index", "CREATE INDEX IF NOT EXISTS message_event_chat_row_id_and_start_time_index ON message_event (chat_row_id, start_time)");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [boolean] */
    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko A01 = C63573Ko.A01(r10);
        C64563Om[] r3 = new C64563Om[12];
        C52502pX A02 = C52502pX.A02(A01);
        ? A0h = C63573Ko.A0h(A01, A02, r3);
        r3[A0h] = C63573Ko.A03(A01, A02, "is_canceled", 0);
        A01.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C52502pX r7 = C52502pX.TEXT;
        C63573Ko.A0Y(A01, r7, r3, A0h);
        C63573Ko.A09(A01, r7, "description", r3);
        A01.A02 = "location_latitude";
        C52502pX r1 = C52502pX.REAL;
        A01.A00 = r1;
        C63573Ko.A0c(A01, r3);
        C63573Ko.A0B(A01, r1, "location_longitude", r3);
        C63573Ko.A0C(A01, r7, "location_name", r3);
        C63573Ko.A0D(A01, r7, "location_address", r3);
        C63573Ko.A0E(A01, r7, "join_link", r3);
        A01.A02 = "start_time";
        A01.A00 = C52502pX.DATETIME;
        A01.A04 = A0h;
        r3[9] = A01.A0r();
        C63573Ko.A0G(A01, A02, "chat_row_id", r3);
        r3[11] = C63573Ko.A04(A01, A02, "event_state", 0, A0h);
        r10.A0B("message_event", r3);
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        AnonymousClass00C.A0D(r4, 0);
        C63843Lq.A01(r4, "message_event");
    }
}
