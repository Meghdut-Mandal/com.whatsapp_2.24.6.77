package X;

/* renamed from: X.3ic  reason: invalid class name and case insensitive filesystem */
public final class C72583ic implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_media_interactive_annotation_vertex_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_vertex_index ON message_media_interactive_annotation_vertex (message_media_interactive_annotation_row_id, sort_order)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A05(r6, "message_media_interactive_annotation", "message_media_interactive_annotation_vertex", "message_media_interactive_annotation_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0n = C63573Ko.A0n(A01);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A01, r2, "message_media_interactive_annotation_row_id", A0n, C63573Ko.A0f(A01, r2, A0n) ? 1 : 0);
        A01.A02 = "x";
        C52502pX r1 = C52502pX.REAL;
        C63573Ko.A0T(A01, r1, A0n);
        C63573Ko.A09(A01, r1, "y", A0n);
        C63573Ko.A0A(A01, r2, "sort_order", A0n);
        r7.A0B("message_media_interactive_annotation_vertex", A0n);
    }
}
