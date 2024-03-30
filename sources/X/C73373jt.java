package X;

/* renamed from: X.3jt  reason: invalid class name and case insensitive filesystem */
public class C73373jt implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("receipt_device_table_device_index", "CREATE INDEX IF NOT EXISTS receipt_device_table_device_index ON receipt_device (receipt_device_jid_row_id)");
        r5.A07("receipt_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_device_index ON receipt_device (message_row_id, receipt_device_jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "receipt_device");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0n);
        C63573Ko.A0R(A00, r2, "message_row_id", A0n, A0g);
        C63573Ko.A0S(A00, r2, "receipt_device_jid_row_id", A0n, A0g);
        C63573Ko.A09(A00, r2, "receipt_device_timestamp", A0n);
        C63573Ko.A0A(A00, r2, "primary_device_version", A0n);
        r7.A0B("receipt_device", A0n);
    }
}
