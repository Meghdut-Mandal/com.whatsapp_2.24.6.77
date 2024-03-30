package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.3VD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VD implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ CallConfirmationFragment A02;
    public final /* synthetic */ AnonymousClass141 A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass3VD(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass141 r3, int i, boolean z) {
        this.A02 = callConfirmationFragment;
        this.A00 = i;
        this.A01 = activity;
        this.A03 = r3;
        this.A04 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallConfirmationFragment callConfirmationFragment = this.A02;
        int i2 = this.A00;
        Activity activity = this.A01;
        AnonymousClass141 r4 = this.A03;
        boolean z = this.A04;
        if (i2 > 0) {
            C19420v0 r0 = callConfirmationFragment.A03;
            C36341k9.A0v(C19420v0.A00(r0), "call_log_education_dialog_shown_count", C36371kC.A01(C36341k9.A0E(r0), "call_log_education_dialog_shown_count") + 1);
        }
        CallConfirmationFragment.A03(activity, callConfirmationFragment, r4, z);
    }
}
