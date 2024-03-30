package X;

/* renamed from: X.3hm  reason: invalid class name and case insensitive filesystem */
public class C72063hm implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r3 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r3, A0n);
        A00.A02 = "session_id";
        C52502pX r1 = C52502pX.TEXT;
        A00.A00 = r1;
        A00.A06 = A0g;
        A00.A04 = A0g;
        C63573Ko.A0e(A00, A0n, A0g ? 1 : 0);
        C63573Ko.A0S(A00, r3, "media_type", A0n, A0g);
        C63573Ko.A09(A00, r1, "caption", A0n);
        A00.A02 = "master_key";
        A00.A00 = C52502pX.BLOB;
        A00.A04 = A0g;
        C63573Ko.A0c(A00, A0n);
        r8.A0B("bcall_session", A0n);
    }
}
