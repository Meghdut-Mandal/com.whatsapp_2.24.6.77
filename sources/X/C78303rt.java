package X;

/* renamed from: X.3rt  reason: invalid class name and case insensitive filesystem */
public final class C78303rt implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void B7J(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        ((C78213rk) this.A00.get()).B7J(r4);
        AnonymousClass1F3.A08((AnonymousClass1F3) this.A01.get(), (AnonymousClass2cT) r4, "SELECT message_row_id, element_type, reply_values, reply_description FROM message_ui_elements_reply WHERE message_row_id=?", "GET_REPLY_MESSAGE_SQL");
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C78213rk.A00(r2, this.A00);
        ((AnonymousClass1F3) this.A01.get()).A0C((AnonymousClass2cT) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C78213rk) this.A00.get()).BwV(r2);
        ((AnonymousClass1F3) this.A01.get()).A0C((AnonymousClass2cT) r2);
    }

    public C78303rt(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
