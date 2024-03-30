package X;

/* renamed from: X.3kd  reason: invalid class name and case insensitive filesystem */
public class C73833kd implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("quick_promotion_payload_index", " CREATE UNIQUE INDEX IF NOT EXISTS quick_promotion_payload_index ON quick_promotion_payload (surface_id, trigger_id);");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[5];
        A00.A02 = "surface_id";
        A00.A00 = C52502pX.INTEGER;
        C63573Ko.A0b(A00, r3);
        A00.A02 = "trigger_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r1, r3, true);
        C63573Ko.A08(A00, r1, "trigger_context", r3);
        A00.A02 = "qp_details";
        C63573Ko.A0Z(A00, C52502pX.BLOB, r3, true);
        A00.A02 = "insertion_time";
        A00.A00 = C52502pX.DATETIME;
        A00.A04 = true;
        C63573Ko.A0c(A00, r3);
        r7.A0B("quick_promotion_payload", r3);
    }
}
