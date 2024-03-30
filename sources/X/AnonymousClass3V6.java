package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.3V6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3V6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeleteAccountFeedback.ChangeNumberMessageDialogFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass3V6(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment, String str, int i) {
        this.A01 = changeNumberMessageDialogFragment;
        this.A00 = i;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = this.A01;
        int i2 = this.A00;
        String str = this.A02;
        AnonymousClass01I A0h = changeNumberMessageDialogFragment.A0h();
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(A0h.getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
        A0D.putExtra("deleteReason", i2);
        A0D.putExtra("additionalComments", str);
        changeNumberMessageDialogFragment.A1C(A0D);
    }
}
