package X;

/* renamed from: X.3jh  reason: invalid class name and case insensitive filesystem */
public class C73253jh implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("priority_inbox_chat_row_index", "CREATE INDEX IF NOT EXISTS priority_inbox_chat_row_index ON priority_inbox (chat_row_id)");
        r5.A07("priority_inbox_time_created_index", "CREATE INDEX IF NOT EXISTS priority_inbox_time_created_index ON priority_inbox (time_created)");
        r5.A07("priority_inbox_score_index", "CREATE INDEX IF NOT EXISTS priority_inbox_score_index ON priority_inbox (priority_score)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[8];
        C52502pX A01 = C52502pX.A01(A00);
        boolean A0g = C63573Ko.A0g(A00, A01, r3);
        A00.A02 = "priority_score";
        C63573Ko.A0W(A00, C52502pX.DOUBLE, r3, A0g);
        C63573Ko.A0S(A00, A01, "version", r3, A0g);
        A00.A02 = "chat_row_id";
        C63573Ko.A0Z(A00, A01, r3, A0g);
        A00.A02 = "is_priority";
        C52502pX r1 = C52502pX.BOOLEAN;
        A00.A00 = r1;
        C63573Ko.A0c(A00, r3);
        C63573Ko.A0B(A00, r1, "label_removed", r3);
        C63573Ko.A0C(A00, A01, "time_created", r3);
        C63573Ko.A0D(A00, r1, "deep_conversion_rate", r3);
        r7.A0B("priority_inbox", r3);
    }
}
