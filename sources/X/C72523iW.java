package X;

/* renamed from: X.3iW  reason: invalid class name and case insensitive filesystem */
public class C72523iW implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[3];
        A00.A02 = "chat_jid";
        A00.A00 = C52502pX.TEXT;
        A00.A05 = true;
        C63573Ko.A0b(A00, r3);
        A00.A02 = "last_sync_response_sent_timestamp";
        C52502pX r1 = C52502pX.INTEGER;
        C63573Ko.A0W(A00, r1, r3, true);
        C63573Ko.A07(A00, r1, "no_of_retries_sent_already", true);
        r3[2] = A00.A0r();
        r7.A0B("message_ephemeral_sync_response", r3);
    }
}
