package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;

/* renamed from: X.9vF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207459vF implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public /* synthetic */ C207459vF(Intent intent, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A01 = paymentGroupParticipantPickerActivity;
        this.A00 = intent;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        Intent intent = this.A00;
        AnonymousClass9IB r0 = ((C193659Mi) view.getTag()).A04;
        if (r0 != null) {
            AnonymousClass141 r4 = r0.A00;
            UserJid A0l = C36351kA.A0l(r4);
            int A06 = paymentGroupParticipantPickerActivity.A0A.A06(A0l);
            if (!paymentGroupParticipantPickerActivity.A01.A0O(A0l) && A06 == 2) {
                C18740tg.A06(A0l);
                C199549fV r42 = new C199549fV(paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity.A05, paymentGroupParticipantPickerActivity.A0B, paymentGroupParticipantPickerActivity.A0E, new AnonymousClass736(paymentGroupParticipantPickerActivity, A0l, intent, 30), new AnonymousClass736(paymentGroupParticipantPickerActivity, A0l, r4, 31), false);
                if (r42.A02()) {
                    r42.A01(A0l, (C23036B1h) null, paymentGroupParticipantPickerActivity.A0F);
                } else {
                    PaymentGroupParticipantPickerActivity.A01(intent, A0l, paymentGroupParticipantPickerActivity);
                }
            }
        }
    }
}
