package X;

/* renamed from: X.3jv  reason: invalid class name and case insensitive filesystem */
public final class C73393jv implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("reporting_token_timestamp_index", "CREATE INDEX IF NOT EXISTS reporting_token_timestamp_index ON reporting_token (timestamp)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "message", "reporting_token", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r4 = new C64563Om[5];
        C52502pX A02 = C52502pX.A02(A01);
        boolean A0h = C63573Ko.A0h(A01, A02, r4);
        A01.A02 = "reporting_tag";
        C52502pX r1 = C52502pX.BLOB;
        C63573Ko.A0W(A01, r1, r4, A0h);
        C63573Ko.A08(A01, r1, "reporting_token_content", r4);
        C63573Ko.A09(A01, A02, "version", r4);
        C63573Ko.A0A(A01, A02, "timestamp", r4);
        r8.A0B("reporting_token", r4);
    }
}
