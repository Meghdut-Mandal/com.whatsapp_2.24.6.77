package X;

/* renamed from: X.3ik  reason: invalid class name and case insensitive filesystem */
public class C72663ik implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_privacy_state", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[5];
        C52502pX r5 = C52502pX.INTEGER;
        r2[0] = new C64563Om(r5, "message_row_id", "NOT NULL PRIMARY KEY");
        r2[1] = C63573Ko.A02(A00, r5, "host_storage");
        C63573Ko.A08(A00, r5, "actual_actors", r2);
        A00.A02 = "privacy_mode_ts";
        A00.A00 = r5;
        A00.A04 = true;
        r2[3] = A00.A0r();
        A00.A02 = "business_name";
        A00.A00 = C52502pX.TEXT;
        C63573Ko.A0c(A00, r2);
        r8.A0B("message_privacy_state", r2);
    }
}
