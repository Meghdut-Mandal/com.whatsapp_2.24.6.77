package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.3VB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VB implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ CallConfirmationFragment A01;
    public final /* synthetic */ AnonymousClass141 A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass3VB(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass141 r3, boolean z) {
        this.A01 = callConfirmationFragment;
        this.A00 = activity;
        this.A02 = r3;
        this.A03 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallConfirmationFragment callConfirmationFragment = this.A01;
        Activity activity = this.A00;
        AnonymousClass141 r4 = this.A02;
        boolean z = this.A03;
        C36321k7.A0q(callConfirmationFragment.A03, "call_confirmation_dialog_count", C36371kC.A01(C36341k9.A0E(callConfirmationFragment.A03), "call_confirmation_dialog_count") + 1);
        CallConfirmationFragment.A03(activity, callConfirmationFragment, r4, z);
    }
}
