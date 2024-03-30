package X;

/* renamed from: X.B9i  reason: case insensitive filesystem */
public class C23200B9i implements C22970AzM {
    public Object A00;
    public final int A01;

    public C23200B9i(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass8NL B4N(C196159Xy r7, AnonymousClass3T1 r8) {
        if (this.A01 != 0) {
            C165567td.A1B(r8, "FMessageStickerProtobuf/getPaymentNoteMessageBuilder wrong message passed: ", AnonymousClass000.A0u(), r8 instanceof C46962bx);
            AnonymousClass8NL A0D = C170918Hz.A0D();
            AnonymousClass8N5 A002 = C21191ABz.A00(r7, (C46962bx) r8, (C21191ABz) this.A00);
            if (A002 != null) {
                A0D.A0f(A002);
            }
            return A0D;
        }
        AC0 ac0 = (AC0) this.A00;
        if (r8 instanceof AnonymousClass2bV) {
            AnonymousClass8NL A0D2 = C170918Hz.A0D();
            AnonymousClass8SD r0 = ((AnonymousClass8SX) A0D2.A00).extendedTextMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8SD.DEFAULT_INSTANCE;
            }
            C172138Mr r3 = (C172138Mr) r0.A0q();
            if (r8.A0b() != null) {
                String A0b = r8.A0b();
                AnonymousClass8SD A08 = AnonymousClass8NN.A08(r3);
                int i = AnonymousClass8SD.BACKGROUND_ARGB_FIELD_NUMBER;
                A0b.getClass();
                A08.bitField0_ |= 1;
                A08.text_ = A0b;
            }
            C196159Xy.A01(r7, ac0, r3, r8);
            A0D2.A0Y(r3);
            return A0D2;
        }
        throw AnonymousClass001.A08("FMessageTextSerializer/getPaymentNoteMessageBuilder wrong message passed");
    }
}
