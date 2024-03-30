package X;

public class AAX implements AnonymousClass15z {
    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko r5 = new C63573Ko();
        C64563Om[] r4 = new C64563Om[19];
        C52502pX A0C = C165567td.A0C(r5, "message_row_id", r4);
        r5.A02 = "wa_invoice_id";
        C52502pX r3 = C52502pX.TEXT;
        r5.A00 = r3;
        r5.A04 = true;
        C63573Ko.A0e(r5, r4, 1);
        r5.A02 = "amount";
        C63573Ko.A0Y(r5, r3, r4, true);
        r5.A02 = "note";
        C63573Ko.A0Z(r5, r3, r4, true);
        C63573Ko.A0A(r5, r3, "token", r4);
        C63573Ko.A0B(r5, A0C, "sender_jid_row_id", r4);
        C63573Ko.A0C(r5, A0C, "receiver_jid_row_id", r4);
        C63573Ko.A0D(r5, A0C, "status", r4);
        C63573Ko.A0E(r5, A0C, "status_ts", r4);
        C63573Ko.A0F(r5, A0C, "creation_ts", r4);
        C63573Ko.A0G(r5, A0C, "attachment_type", r4);
        C63573Ko.A0H(r5, r3, "attachment_mimetype", r4);
        r5.A02 = "attachment_media_key";
        C52502pX r2 = C52502pX.BLOB;
        r5.A00 = r2;
        r4[12] = r5.A0r();
        C63573Ko.A0J(r5, A0C, "attachment_media_key_ts", r4);
        C63573Ko.A0K(r5, r2, "attachment_file_sha256", r4);
        C63573Ko.A0L(r5, r2, "attachment_file_enc_sha256", r4);
        C63573Ko.A0M(r5, r3, "attachment_direct_path", r4);
        r4[17] = C63573Ko.A02(r5, r2, "attachment_jpeg_thumbnail");
        C63573Ko.A0O(r5, r3, "metadata", r4);
        r9.A0B("message_invoice", r4);
    }

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
