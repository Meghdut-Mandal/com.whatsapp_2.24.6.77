package X;

import java.util.ArrayList;

/* renamed from: X.8uu  reason: invalid class name and case insensitive filesystem */
public abstract class C185858uu extends C192069Fo implements C236119d {
    public static void A00(C203399nx r4, C186018vH r5, C23059B2f b2f) {
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            b2f.BJS(new C186198vZ(r4, r5));
        } catch (C235919b e) {
            C165567td.A1R("QueryResponseSuccess: ", AnonymousClass000.A0u(), e, A0I);
            try {
                b2f.BJT(new C186278vh(r4, r5, 14));
            } catch (C235919b e2) {
                C165567td.A1R("QueryResponseRequestError: ", AnonymousClass000.A0u(), e2, A0I);
                try {
                    b2f.BJU(new C186118vR(r4, r5));
                } catch (C235919b e3) {
                    throw C165567td.A0H("QueryResponseServerError: ", AnonymousClass000.A0u(), e3, A0I);
                }
            }
        }
    }
}
