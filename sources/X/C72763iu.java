package X;

/* renamed from: X.3iu  reason: invalid class name and case insensitive filesystem */
public class C72763iu implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_status_psa_campaign", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[6];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r4);
        A00.A02 = "campaign_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r1, r4, A0i ? 1 : 0);
        C63573Ko.A08(A00, A02, "duration", r4);
        C63573Ko.A09(A00, A02, "first_seen_timestamp", r4);
        C63573Ko.A0A(A00, r1, "action_link_url", r4);
        C63573Ko.A0B(A00, r1, "action_link_button_title", r4);
        r8.A0B("message_status_psa_campaign", r4);
    }
}
