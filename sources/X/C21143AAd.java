package X;

/* renamed from: X.AAd  reason: case insensitive filesystem */
public class C21143AAd implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("crossposting_session_id_index", "CREATE INDEX IF NOT EXISTS crossposting_session_id_index ON status_crossposting(crossposting_session_id)");
        r5.A07("crossposting_state_index", "CREATE INDEX IF NOT EXISTS crossposting_state_index ON status_crossposting(state)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko r4 = new C63573Ko();
        C64563Om[] r3 = new C64563Om[5];
        C52502pX A0C = C165567td.A0C(r4, "status_message_row_id", r3);
        C52502pX A0T = C165607th.A0T(r4, "crossposting_session_id", r3);
        C63573Ko.A08(r4, A0T, "crossposting_status_unique_id", r3);
        C63573Ko.A09(r4, A0C, "state", r3);
        C63573Ko.A0A(r4, A0T, "media_path", r3);
        r7.A0B("status_crossposting", r3);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "status_crossposting", "status_message_row_id=old._id");
    }
}
