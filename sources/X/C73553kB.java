package X;

/* renamed from: X.3kB  reason: invalid class name and case insensitive filesystem */
public class C73553kB implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A07("user_device_info_index", "CREATE UNIQUE INDEX IF NOT EXISTS user_device_info_index ON user_device_info (user_jid_row_id)");
        if (r5.A02) {
            r6.A09("user_device_info", "user_device_info_account_type_index", "CREATE INDEX IF NOT EXISTS user_device_info_account_type_index ON user_device_info (account_encryption_type)");
        }
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[7];
        A00.A02 = "user_jid_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, r3);
        C63573Ko.A0R(A00, r2, "raw_id", r3, A0i);
        C63573Ko.A0S(A00, r2, "timestamp", r3, A0i);
        C63573Ko.A09(A00, r2, "expected_timestamp", r3);
        C63573Ko.A0A(A00, r2, "expected_ts_last_device_job_ts", r3);
        C63573Ko.A0B(A00, r2, "expected_timestamp_update_ts", r3);
        C63573Ko.A0C(A00, r2, "account_encryption_type", r3);
        r7.A0B("user_device_info", r3);
    }
}
