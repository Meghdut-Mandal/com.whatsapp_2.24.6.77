package X;

import android.content.DialogInterface;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3V8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3V8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChangeNumberNotificationDialogFragment A00;
    public final /* synthetic */ AnonymousClass141 A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass3V8(ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment, AnonymousClass141 r2, boolean z) {
        this.A00 = changeNumberNotificationDialogFragment;
        this.A02 = z;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChangeNumberNotificationDialogFragment changeNumberNotificationDialogFragment = this.A00;
        boolean z = this.A02;
        AnonymousClass141 r2 = this.A01;
        if (z) {
            dialogInterface.dismiss();
            return;
        }
        AnonymousClass15E r1 = changeNumberNotificationDialogFragment.A01;
        if (r1 != null) {
            r1.B0n(r2, (AnonymousClass11F) C36381kD.A0e(r2, UserJid.class));
        }
    }
}
