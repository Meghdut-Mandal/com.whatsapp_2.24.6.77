package X;

/* renamed from: X.3ks  reason: invalid class name and case insensitive filesystem */
public class C73983ks implements AnonymousClass15z {
    public static final String[] A00 = {"_id", "jid", "serial", "issuer", "expires", "verified_name", "industry", "city", "country", "verified_level", "cert_blob", "identity_unconfirmed_since", "host_storage", "actual_actors", "privacy_mode_ts"};

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("vname_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A002 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[15];
        C52502pX A01 = C52502pX.A01(A002);
        A002.A00 = A01;
        boolean A0k = C63573Ko.A0k(A002, r2);
        A002.A02 = "jid";
        C52502pX r6 = C52502pX.TEXT;
        C63573Ko.A0W(A002, r6, r2, true);
        C63573Ko.A0S(A002, A01, "serial", r2, true);
        A002.A02 = "issuer";
        C63573Ko.A0Z(A002, r6, r2, true);
        C63573Ko.A0A(A002, A01, "expires", r2);
        r2[5] = C63573Ko.A05(A002, r6, "verified_name", true);
        C63573Ko.A0C(A002, r6, "industry", r2);
        C63573Ko.A0D(A002, r6, "city", r2);
        C63573Ko.A0E(A002, r6, "country", r2);
        C63573Ko.A0F(A002, A01, "verified_level", r2);
        C63573Ko.A0G(A002, A01, "identity_unconfirmed_since", r2);
        r2[11] = C52502pX.A00(A002, "cert_blob");
        r2[12] = C63573Ko.A03(A002, A01, "host_storage", A0k ? 1 : 0);
        r2[13] = C63573Ko.A03(A002, A01, "actual_actors", A0k);
        r2[14] = C63573Ko.A03(A002, A01, "privacy_mode_ts", A0k);
        r9.A0B("wa_vnames", r2);
    }
}
