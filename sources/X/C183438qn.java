package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.8qn  reason: invalid class name and case insensitive filesystem */
public class C183438qn extends C132446Tt {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    public C183438qn(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        paymentGroupParticipantPickerActivity.Bnv();
        C166317vX r0 = paymentGroupParticipantPickerActivity.A0D;
        ArrayList arrayList = paymentGroupParticipantPickerActivity.A0L;
        r0.A00 = arrayList;
        r0.notifyDataSetChanged();
        AnonymousClass07B supportActionBar = paymentGroupParticipantPickerActivity.getSupportActionBar();
        if (supportActionBar != null) {
            C18820ts r6 = paymentGroupParticipantPickerActivity.A00;
            long size = (long) arrayList.size();
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, arrayList.size(), 0);
            supportActionBar.A0P(r6.A0L(A0L, R.plurals.f10nameremoved, size));
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        HashSet A16 = C36441kJ.A16();
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        AnonymousClass17X r0 = paymentGroupParticipantPickerActivity.A08;
        C225614x it = r0.A07.A0C(paymentGroupParticipantPickerActivity.A09).A07().iterator();
        while (true) {
            C175728ax r4 = null;
            if (it.hasNext()) {
                AnonymousClass141 A0D = paymentGroupParticipantPickerActivity.A02.A0D(((AnonymousClass6PM) it.next()).A03);
                if (!A16.contains(A0D) && !C36361kB.A1X(paymentGroupParticipantPickerActivity.A02, A0D)) {
                    UserJid A0l = C36351kA.A0l(A0D);
                    if (A0l != null) {
                        r4 = C165617ti.A0O(paymentGroupParticipantPickerActivity.A0B).A05(A0l);
                    }
                    paymentGroupParticipantPickerActivity.A0L.add(new AnonymousClass9IB(A0D, r4));
                    A16.add(A0D);
                }
            } else {
                Collections.sort(paymentGroupParticipantPickerActivity.A0L, new AXT(new C81783xZ(paymentGroupParticipantPickerActivity.A02, paymentGroupParticipantPickerActivity.A04, 1), this));
                return null;
            }
        }
    }
}
