package X;

import android.content.DialogInterface;
import com.whatsapp.textstatuscomposer.DiscardWarningDialogFragment;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.3V9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3V9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DiscardWarningDialogFragment A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass3V9(DiscardWarningDialogFragment discardWarningDialogFragment, int i, boolean z) {
        this.A01 = discardWarningDialogFragment;
        this.A00 = i;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C148836zV r0;
        DiscardWarningDialogFragment discardWarningDialogFragment = this.A01;
        int i2 = this.A00;
        boolean z = this.A02;
        AnonymousClass01I A0i = discardWarningDialogFragment.A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.textstatuscomposer.TextStatusComposerActivity");
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) A0i;
        discardWarningDialogFragment.A1c();
        if (i2 != 2 || !z) {
            C148836zV r2 = textStatusComposerActivity.A0j;
            if (r2 != null) {
                C148836zV.A03(r2, true);
                C148836zV.A02(r2, r2.A08);
                r2.A08 = null;
                C148836zV.A02(r2, r2.A09);
                r2.A09 = null;
            }
            textStatusComposerActivity.finish();
        } else if (textStatusComposerActivity.A0i != null && (r0 = textStatusComposerActivity.A0j) != null) {
            r0.A04();
        }
    }
}
