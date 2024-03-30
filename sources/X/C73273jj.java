package X;

/* renamed from: X.3jj  reason: invalid class name and case insensitive filesystem */
public class C73273jj implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("attachments_quick_reply_id_index", "CREATE INDEX IF NOT EXISTS attachments_quick_reply_id_index ON quick_reply_attachments (quick_reply_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "quick_replies", "quick_reply_attachments", "quick_reply_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r3 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r3, A0n);
        A00.A02 = "quick_reply_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r1, A0n, A0g);
        C63573Ko.A0S(A00, r1, "uri", A0n, A0g);
        C63573Ko.A09(A00, r1, "caption", A0n);
        C63573Ko.A0A(A00, r3, "media_type", A0n);
        r8.A0B("quick_reply_attachments", A0n);
    }
}
