package X;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.mediacomposer.dialog.DataWarningDialog;

/* renamed from: X.7oV  reason: invalid class name and case insensitive filesystem */
public class C162387oV extends ClickableSpan {
    public Object A00;
    public final int A01;

    public C162387oV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        if (this.A01 != 0) {
            DataWarningDialog dataWarningDialog = (DataWarningDialog) this.A00;
            dataWarningDialog.A1b();
            dataWarningDialog.A00.invoke();
            return;
        }
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
        AnonymousClass3L4 r1 = new AnonymousClass3L4(16);
        C90484aE.A12(restoreFromBackupActivity, r1, R.string.f12nameremoved);
        r1.A02(false);
        C90484aE.A11(restoreFromBackupActivity, r1, R.string.f12nameremoved);
        PromptDialogFragment A0S = C90474aD.A0S(restoreFromBackupActivity, r1, R.string.f12nameremoved);
        if (!RestoreFromBackupActivity.A0n(restoreFromBackupActivity)) {
            C90484aE.A19(C36341k9.A0O(restoreFromBackupActivity), A0S, "one-time-setup-taking-too-long");
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (1 - this.A01 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        AnonymousClass00C.A0D(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(C015006m.A00((Resources.Theme) null, C36341k9.A0G((AnonymousClass02E) this.A00), R.color.f6nameremoved));
    }
}
