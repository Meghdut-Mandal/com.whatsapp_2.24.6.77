package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.GlobalPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.GlobalPaymentOrderDetailsActivity;

/* renamed from: X.8gq  reason: invalid class name and case insensitive filesystem */
public final class C178628gq extends AF8 {
    public final AF4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178628gq(AnonymousClass16D r9, AnonymousClass171 r10, C21060yb r11, C19630wG r12, AnonymousClass1EU r13, AF4 af4, AnonymousClass1FR r15) {
        super(r9, r10, r11, r12, r13, r15, "GLOBAL_ORDER");
        C36321k7.A1B(r12, r15, r10, r9, r11);
        C36321k7.A10(r13, af4);
        this.A00 = af4;
    }

    public Class BFM() {
        return GlobalPaymentOrderDetailsActivity.class;
    }

    public Class BFn() {
        return GlobalPaymentTransactionDetailActivity.class;
    }

    public int BHO() {
        return 5;
    }

    public C193429Lk BIl(C175728ax r2, UserJid userJid, String str) {
        return null;
    }

    public C175708av BKY() {
        return new C175908bG();
    }

    public C23075B3f BBn() {
        return this.A00;
    }
}
