package X;

/* renamed from: X.3hg  reason: invalid class name and case insensitive filesystem */
public class C72003hg implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("chat_assignee_index", "CREATE INDEX IF NOT EXISTS chat_assignee_index ON agent_chat_assignment (agent_id)");
    }

    public void B7q(AnonymousClass38H r5, C65063Qo r6) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[3];
        A00.A02 = "jid_row_id";
        boolean A0i = C63573Ko.A0i(A00, C52502pX.INTEGER, r2);
        A00.A02 = "agent_id";
        C63573Ko.A0W(A00, C52502pX.TEXT, r2, A0i);
        A00.A02 = "is_opened";
        C63573Ko.A0T(A00, C52502pX.BOOLEAN, r2);
        r6.A0B("agent_chat_assignment", r2);
    }
}
