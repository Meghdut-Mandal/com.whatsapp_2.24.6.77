package X;

import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.3lN  reason: invalid class name and case insensitive filesystem */
public class C74293lN implements AnonymousClass4T7 {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public C74293lN(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public void BYt() {
        this.A00.A0G.setPadding(0, 0, 0, 0);
    }

    public void Bga() {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        KeyboardPopupLayout keyboardPopupLayout = textStatusComposerActivity.A0G;
        AnonymousClass09H A08 = C012005e.A08(C36361kB.A0C(textStatusComposerActivity));
        int i = 0;
        if (A08 != null) {
            i = A08.A00.A0C(7).A03;
        }
        keyboardPopupLayout.setPadding(0, 0, 0, i);
    }
}
