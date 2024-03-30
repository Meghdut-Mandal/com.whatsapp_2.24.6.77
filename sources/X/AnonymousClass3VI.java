package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import java.util.ArrayList;

/* renamed from: X.3VI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VI implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ PromptSendGroupInviteDialogFragment A03;
    public final /* synthetic */ AnonymousClass147 A04;
    public final /* synthetic */ ArrayList A05;

    public /* synthetic */ AnonymousClass3VI(Intent intent, PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment, AnonymousClass147 r3, ArrayList arrayList, int i, int i2) {
        this.A03 = promptSendGroupInviteDialogFragment;
        this.A02 = intent;
        this.A00 = i;
        this.A04 = r3;
        this.A05 = arrayList;
        this.A01 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass01I A0h;
        AnonymousClass01I A0h2;
        PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = this.A03;
        Intent intent = this.A02;
        int i2 = this.A00;
        AnonymousClass147 r4 = this.A04;
        ArrayList arrayList = this.A05;
        int i3 = this.A01;
        if (i != -2) {
            if (i == -1 && (A0h2 = promptSendGroupInviteDialogFragment.A0h()) != null && !A0h2.isFinishing()) {
                promptSendGroupInviteDialogFragment.A0h().startActivityForResult(intent, i2);
            }
        } else if (r4 != null && arrayList != null && !arrayList.isEmpty() && (A0h = promptSendGroupInviteDialogFragment.A0h()) != null && !A0h.isFinishing() && C36441kJ.A1L(promptSendGroupInviteDialogFragment.A02)) {
            AnonymousClass01I A0h3 = promptSendGroupInviteDialogFragment.A0h();
            A0h3.startActivity(AnonymousClass190.A0g(A0h3, r4, arrayList, i3, false));
        }
    }
}
