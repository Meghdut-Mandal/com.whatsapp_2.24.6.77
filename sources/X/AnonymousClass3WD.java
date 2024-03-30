package X;

import android.content.DialogInterface;
import com.whatsapp.settings.MultiSelectionDialogFragment;

/* renamed from: X.3WD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WD implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectionDialogFragment A00;

    public /* synthetic */ AnonymousClass3WD(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        this.A00 = multiSelectionDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00.A02[i] = z;
    }
}
