package X;

/* renamed from: X.3jP  reason: invalid class name and case insensitive filesystem */
public class C73073jP implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A07("mms_thumbnail_metadata_transferred_index", " CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_transferred_index ON mms_thumbnail_metadata(transferred)");
        if (r5.A01) {
            r6.A09("mms_thumbnail_metadata", "mms_thumbnail_metadata_insert_timestamp_index", " CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_insert_timestamp_index ON mms_thumbnail_metadata(insert_timestamp)");
        }
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "mms_thumbnail_metadata", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[12];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r3);
        A00.A02 = "direct_path";
        C52502pX r2 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r2, r3, A0i ? 1 : 0);
        A00.A02 = "media_key";
        C52502pX r1 = C52502pX.BLOB;
        C63573Ko.A0T(A00, r1, r3);
        C63573Ko.A09(A00, A02, "media_key_timestamp", r3);
        C63573Ko.A0A(A00, r2, "enc_thumb_hash", r3);
        C63573Ko.A0B(A00, r2, "thumb_hash", r3);
        C63573Ko.A0C(A00, A02, "thumb_width", r3);
        C63573Ko.A0D(A00, A02, "thumb_height", r3);
        C63573Ko.A0E(A00, A02, "transferred", r3);
        C63573Ko.A0F(A00, r1, "micro_thumbnail", r3);
        C63573Ko.A0G(A00, A02, "insert_timestamp", r3);
        C63573Ko.A0H(A00, r2, "handle", r3);
        r8.A0B("mms_thumbnail_metadata", r3);
    }
}
