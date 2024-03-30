package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qx  reason: invalid class name and case insensitive filesystem */
public class C183538qx extends C132446Tt {
    public final ArrayList A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public C183538qx(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, ArrayList arrayList) {
        ArrayList arrayList2;
        this.A01 = paymentGroupParticipantPickerActivity;
        if (arrayList != null) {
            arrayList2 = C36441kJ.A15(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A00 = arrayList2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        paymentGroupParticipantPickerActivity.A0C = null;
        C166317vX r0 = paymentGroupParticipantPickerActivity.A0D;
        r0.A00 = (List) obj;
        r0.notifyDataSetChanged();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        HashSet A16 = C36441kJ.A16();
        ArrayList arrayList = this.A00;
        if (arrayList == null || arrayList.isEmpty()) {
            A0I.addAll(this.A01.A0L);
            return A0I;
        }
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        Iterator it = paymentGroupParticipantPickerActivity.A0L.iterator();
        while (it.hasNext()) {
            AnonymousClass9IB r4 = (AnonymousClass9IB) it.next();
            AnonymousClass141 r3 = r4.A00;
            Jid A06 = r3.A06(UserJid.class);
            if (paymentGroupParticipantPickerActivity.A04.A0h(r3, arrayList, true) && !A16.contains(A06)) {
                A0I.add(r4);
                A16.add(A06);
            }
            if (this.A02.isCancelled()) {
                break;
            }
        }
        return A0I;
    }
}
