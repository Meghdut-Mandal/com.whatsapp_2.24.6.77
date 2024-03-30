package X;

/* renamed from: X.3i4  reason: invalid class name and case insensitive filesystem */
public final class C72243i4 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("sort_order_index", "CREATE INDEX IF NOT EXISTS sort_order_index ON favorite (sort_order);");
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0m = C63573Ko.A0m(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0f = C63573Ko.A0f(A01, r2, A0m);
        A01.A02 = "jid_row_id";
        C63573Ko.A0X(A01, r2, A0m, A0f);
        C63573Ko.A08(A01, r2, "favorite_type", A0m);
        C63573Ko.A09(A01, r2, "sort_order", A0m);
        r7.A0B("favorite", A0m);
    }
}
