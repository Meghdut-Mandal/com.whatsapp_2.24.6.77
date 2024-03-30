package X;

/* renamed from: X.3jD  reason: invalid class name and case insensitive filesystem */
public final class C72953jD implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "message_system", "message_system_reminder_setup", "message_row_id=old.message_row_id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0q = C63573Ko.A0q(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, A0q);
        C63573Ko.A06(A01, r2, "original_message_row_id", A0h);
        A01.A06 = A0h;
        C63573Ko.A0e(A01, A0q, A0h ? 1 : 0);
        C63573Ko.A0S(A01, r2, "reminder_timestamp_ms", A0q, A0h);
        A01.A02 = "reminder_content";
        C63573Ko.A0Z(A01, C52502pX.TEXT, A0q, A0h);
        r7.A0B("message_system_reminder_setup", A0q);
    }
}
