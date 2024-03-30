package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.Comparator;

public final /* synthetic */ class AXT implements Comparator {
    public final /* synthetic */ C81783xZ A00;
    public final /* synthetic */ C183438qn A01;

    public /* synthetic */ AXT(C81783xZ r1, C183438qn r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        C183438qn r0 = this.A01;
        C81783xZ r6 = this.A00;
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = r0.A00;
        AnonymousClass1EV r1 = paymentGroupParticipantPickerActivity.A0A;
        AnonymousClass141 r5 = ((AnonymousClass9IB) obj).A00;
        Class<UserJid> cls = UserJid.class;
        int A06 = r1.A06((UserJid) r5.A06(cls));
        AnonymousClass1EV r12 = paymentGroupParticipantPickerActivity.A0A;
        AnonymousClass141 r2 = ((AnonymousClass9IB) obj2).A00;
        int A062 = r12.A06((UserJid) r2.A06(cls));
        if (A06 == 2) {
            if (A062 != 2) {
                return -1;
            }
        } else if (A062 == 2) {
            return 1;
        }
        return r6.compare(r5, r2);
    }
}
