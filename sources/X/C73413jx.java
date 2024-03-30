package X;

/* renamed from: X.3jx  reason: invalid class name and case insensitive filesystem */
public final class C73413jx implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("scheduled_reminder_message_chat_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_reminder_message_chat_row_id_index ON scheduled_reminder_message (chat_row_id)");
        r5.A07("scheduled_reminder_message_timestamp_index", "CREATE INDEX IF NOT EXISTS scheduled_reminder_message_timestamp_index ON scheduled_reminder_message (scheduled_reminder_timestamp_ms)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "message", "scheduled_reminder_message", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0p = C63573Ko.A0p(A01);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0R(A01, r2, "scheduled_reminder_timestamp_ms", A0p, C63573Ko.A0h(A01, r2, A0p));
        C63573Ko.A08(A01, r2, "chat_row_id", A0p);
        r7.A0B("scheduled_reminder_message", A0p);
    }
}
