package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8t7  reason: invalid class name and case insensitive filesystem */
public final class C184858t7 extends C118095nK {
    public static final ArrayList A02 = C165567td.A0e("MASTERCARD", "VISA");
    public final String A00;
    public final List A01;

    public C184858t7(C203399nx r12) {
        C203399nx.A0A(r12, "installment_option");
        C203379ns.A03(r12, String.class, C165567td.A0P(), C165567td.A0Q(), "CREDIT_CARD", new String[]{"payment_method"}, false);
        this.A00 = C203379ns.A08(r12, "card_network", A02);
        this.A01 = C203539oF.A08(r12, AJO.A00, new String[]{"installments", "installment"}, 0);
        this.A00 = r12;
    }
}
