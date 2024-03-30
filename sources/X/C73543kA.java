package X;

/* renamed from: X.3kA  reason: invalid class name and case insensitive filesystem */
public class C73543kA implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("messages_thumbnail_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS messages_thumbnail_key_index ON message_thumbnails (key_remote_jid, key_from_me, key_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_thumbnail");
    }

    public void B7q(AnonymousClass38H r10, C65063Qo r11) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[2];
        C52502pX A02 = C52502pX.A02(A00);
        A00.A00 = A02;
        boolean A0j = C63573Ko.A0j(A00, r2);
        A00.A02 = "thumbnail";
        C52502pX r1 = C52502pX.BLOB;
        C63573Ko.A0V(A00, r1, r2, 1);
        r11.A0B("message_thumbnail", r2);
        C64563Om[] r22 = new C64563Om[5];
        C63573Ko.A0Q(A00, r1, "thumbnail", r22, A0j ? 1 : 0);
        A00.A02 = "timestamp";
        C63573Ko.A0V(A00, C52502pX.DATETIME, r22, 1);
        A00.A02 = "key_remote_jid";
        C52502pX r12 = C52502pX.TEXT;
        A00.A00 = r12;
        A00.A04 = true;
        C63573Ko.A0e(A00, r22, 2);
        C63573Ko.A09(A00, A02, "key_from_me", r22);
        C63573Ko.A06(A00, r12, "key_id", true);
        C63573Ko.A0c(A00, r22);
        r11.A0B("message_thumbnails", r22);
    }
}
