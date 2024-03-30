package X;

/* renamed from: X.3kC  reason: invalid class name and case insensitive filesystem */
public class C73563kC implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("user_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS user_device_index ON user_device (user_jid_row_id,device_jid_row_id)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r3 = C52502pX.INTEGER;
        A00.A00 = r3;
        boolean A0k = C63573Ko.A0k(A00, A0m);
        C63573Ko.A0Q(A00, r3, "user_jid_row_id", A0m, 1);
        C63573Ko.A08(A00, r3, "device_jid_row_id", A0m);
        A0m[3] = C63573Ko.A04(A00, r3, "key_index", A0k ? 1 : 0, true);
        r8.A0B("user_device", A0m);
    }
}
