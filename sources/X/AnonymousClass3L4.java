package X;

import android.os.Bundle;
import com.whatsapp.dialogs.PromptDialogFragment;

/* renamed from: X.3L4  reason: invalid class name */
public class AnonymousClass3L4 {
    public final Bundle A00;

    public void A01() {
        this.A00.putBoolean("is_message_clickable", true);
    }

    public PromptDialogFragment A00() {
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A17(this.A00);
        return promptDialogFragment;
    }

    public void A02(boolean z) {
        this.A00.putBoolean("cancelable", z);
    }

    public AnonymousClass3L4(int i) {
        Bundle A07 = AnonymousClass001.A07();
        this.A00 = A07;
        A07.putInt("dialog_id", i);
    }
}
