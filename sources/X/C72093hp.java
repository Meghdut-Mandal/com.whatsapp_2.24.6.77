package X;

/* renamed from: X.3hp  reason: invalid class name and case insensitive filesystem */
public class C72093hp implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("bot_message_info_target_id_index", " CREATE INDEX IF NOT EXISTS bot_message_info_target_id_index ON bot_message_info(target_id);");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "bot_message_info", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r3 = C52502pX.INTEGER;
        A00.A00 = r3;
        boolean A0j = C63573Ko.A0j(A00, A0q);
        A00.A02 = "target_id";
        C63573Ko.A0V(A00, C52502pX.TEXT, A0q, 1);
        A0q[2] = C63573Ko.A03(A00, r3, "message_state", A0j ? 1 : 0);
        C63573Ko.A09(A00, r3, "invoker_jid_row_id", A0q);
        r8.A0B("bot_message_info", A0q);
    }
}
