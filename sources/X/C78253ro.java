package X;

/* renamed from: X.3ro  reason: invalid class name and case insensitive filesystem */
public final class C78253ro implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78253ro(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass1F9.A00((AnonymousClass1F9) this.A00.get(), (AnonymousClass2bR) r4, "SELECT message_row_id, service, expiration_timestamp FROM message_payment_invite WHERE message_row_id = ?", "GET_PAYMENT_INVITE");
    }

    public void BKi(AnonymousClass3T1 r9) {
        AnonymousClass00C.A0D(r9, 0);
        AnonymousClass2bR r92 = (AnonymousClass2bR) r9;
        AnonymousClass1F9.A01((AnonymousClass1F9) this.A00.get(), "message_payment_invite", "INSERT_PAYMENT_INVITE", r92.A00, r92.A1N, r92.A01);
    }

    public void BwV(AnonymousClass3T1 r1) {
    }
}
