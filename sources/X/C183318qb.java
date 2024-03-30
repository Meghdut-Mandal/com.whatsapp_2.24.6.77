package X;

/* renamed from: X.8qb  reason: invalid class name and case insensitive filesystem */
public class C183318qb extends C21168ABc {
    public final C198499df A00;

    public void B24(C196159Xy r12, AnonymousClass3T1 r13) {
        C170918Hz r0;
        AnonymousClass3F4 r02;
        C165567td.A1B(r13, "FMessageTemplateLocationProtobuf: message type is not supported ", AnonymousClass000.A0u(), r13 instanceof AnonymousClass2cA);
        AnonymousClass2cA r8 = (AnonymousClass2cA) r13;
        AnonymousClass8NL r4 = r12.A00;
        AnonymousClass8N6 A0M = C170918Hz.A0M(r4);
        AnonymousClass8SL r03 = ((AnonymousClass8SX) r4.A00).templateMessage_;
        if (r03 == null) {
            r03 = AnonymousClass8SL.DEFAULT_INSTANCE;
        }
        AnonymousClass8SO A0N = C170918Hz.A0N(r03);
        if (A0N.titleCase_ == 5) {
            r0 = (C170918Hz) A0N.title_;
        } else {
            r0 = C173508Ry.DEFAULT_INSTANCE;
        }
        AnonymousClass8K7 r6 = (AnonymousClass8K7) r0.A0q();
        this.A00.A01(r6, r12.A02, r8, r12.A0B, r12.A04);
        if (r6 == null || (r02 = r8.A00) == null) {
            C165567td.A1A(r8, "FMessageTemplateLocation/buildE2eMessage/Error: cannot send encrypted template location message, ", AnonymousClass000.A0u());
            return;
        }
        AnonymousClass8N7 A002 = AnonymousClass97R.A00(r4, r02);
        C21168ABc.A01(r4, A0M, A002, C21168ABc.A00(A002, r6), 5);
    }

    public C183318qb(C198499df r1, C203099nI r2) {
        super(r2);
        this.A00 = r1;
    }
}
