package X;

/* renamed from: X.8qa  reason: invalid class name and case insensitive filesystem */
public class C183308qa extends C21168ABc {
    public final C195739Vt A00;

    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        C170918Hz r0;
        AnonymousClass3F4 r02;
        C165567td.A1B(r8, "FMessageTemplateImageProtobuf: message type is not supported ", AnonymousClass000.A0u(), r8 instanceof C46862bn);
        C46862bn r82 = (C46862bn) r8;
        AnonymousClass8NL r4 = r7.A00;
        AnonymousClass8N6 A0M = C170918Hz.A0M(r4);
        C195739Vt r5 = this.A00;
        AnonymousClass8SL r03 = ((AnonymousClass8SX) r4.A00).templateMessage_;
        if (r03 == null) {
            r03 = AnonymousClass8SL.DEFAULT_INSTANCE;
        }
        AnonymousClass8SO A0N = C170918Hz.A0N(r03);
        if (A0N.titleCase_ == 3) {
            r0 = (C170918Hz) A0N.title_;
        } else {
            r0 = AnonymousClass8SF.DEFAULT_INSTANCE;
        }
        AnonymousClass8NJ A002 = r5.A00(r7, (AnonymousClass8NJ) r0.A0q(), r82);
        if (A002 == null || (r02 = r82.A00) == null) {
            C165567td.A1A(r82, "MessageTemplateImage/buildE2eMessage: cannot send encrypted media message, ", AnonymousClass000.A0u());
            return;
        }
        AnonymousClass8N7 A003 = AnonymousClass97R.A00(r4, r02);
        C21168ABc.A01(r4, A0M, A003, C21168ABc.A00(A003, A002), 3);
    }

    public C183308qa(C195739Vt r1, C203099nI r2) {
        super(r2);
        this.A00 = r1;
    }
}
