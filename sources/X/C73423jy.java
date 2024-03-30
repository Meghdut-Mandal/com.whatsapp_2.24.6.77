package X;

/* renamed from: X.3jy  reason: invalid class name and case insensitive filesystem */
public class C73423jy implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_streaming_sidecar");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r3 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r3, A0q);
        A00.A02 = "sidecar";
        C52502pX r1 = C52502pX.BLOB;
        C63573Ko.A0V(A00, r1, A0q, A0i ? 1 : 0);
        C63573Ko.A08(A00, r1, "chunk_lengths", A0q);
        C63573Ko.A09(A00, r3, "timestamp", A0q);
        r8.A0B("message_streaming_sidecar", A0q);
    }
}
