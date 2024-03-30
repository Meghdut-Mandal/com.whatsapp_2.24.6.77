package X;

/* renamed from: X.3iK  reason: invalid class name and case insensitive filesystem */
public class C72403iK implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("labels_index", "CREATE UNIQUE INDEX IF NOT EXISTS labels_index ON labels (label_name)");
        r5.A07("sort_id", "CREATE INDEX IF NOT EXISTS labels_index ON labels (sort_id)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r3 = C52502pX.INTEGER;
        A00.A00 = r3;
        boolean A0k = C63573Ko.A0k(A00, A0n);
        A00.A02 = "label_name";
        C63573Ko.A0V(A00, C52502pX.TEXT, A0n, 1);
        C63573Ko.A08(A00, r3, "predefined_id", A0n);
        C63573Ko.A09(A00, r3, "color_id", A0n);
        A0n[4] = C63573Ko.A04(A00, r3, "sort_id", A0k ? 1 : 0, true);
        r8.A0B("labels", A0n);
    }
}
