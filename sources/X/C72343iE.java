package X;

/* renamed from: X.3iE  reason: invalid class name and case insensitive filesystem */
public final class C72343iE implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("jid_lid_map_jid_index", "CREATE INDEX IF NOT EXISTS jid_lid_map_jid_index\nON jid_map (jid_row_id)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[2];
        A01.A02 = "lid_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        A01.A00 = r2;
        A01.A05 = true;
        A01.A04 = true;
        C63573Ko.A0e(A01, r3, 0);
        C63573Ko.A0R(A01, r2, "jid_row_id", r3, true);
        r8.A0B("jid_map", r3);
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
