package X;

import android.text.TextUtils;

/* renamed from: X.8qX  reason: invalid class name and case insensitive filesystem */
public class C183278qX extends C21168ABc {
    public void B24(C196159Xy r7, AnonymousClass3T1 r8) {
        C165567td.A1B(r8, "FMessageTemplateHsmProtobuf: message type is not supported ", AnonymousClass000.A0u(), r8 instanceof AnonymousClass2cW);
        AnonymousClass2cW r82 = (AnonymousClass2cW) r8;
        AnonymousClass8NL r5 = r7.A00;
        AnonymousClass8N6 A0M = C170918Hz.A0M(r5);
        AnonymousClass3F4 r0 = r82.A00;
        if (r0 != null) {
            AnonymousClass8N7 A00 = AnonymousClass97R.A00(r5, r0);
            if (!TextUtils.isEmpty(r82.A0b())) {
                String A0b = r82.A0b();
                AnonymousClass8SO r1 = (AnonymousClass8SO) C90524aI.A0H(A00);
                int i = AnonymousClass8SO.DOCUMENT_MESSAGE_FIELD_NUMBER;
                A0b.getClass();
                r1.titleCase_ = 2;
                r1.title_ = A0b;
            }
            A0M.A0V(A00);
            A0M.A0U(A00);
            r5.A0g(A0M);
            return;
        }
        C165567td.A1A(r82, "MessageTemplateHsm: cannot send encrypted hsm title message, ", AnonymousClass000.A0u());
    }

    public C183278qX(C203099nI r1) {
        super(r1);
    }
}
