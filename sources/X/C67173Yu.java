package X;

import android.text.Editable;
import android.view.View;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.3Yu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67173Yu implements View.OnFocusChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EncryptionKeyFragment A01;

    public /* synthetic */ C67173Yu(EncryptionKeyFragment encryptionKeyFragment, int i) {
        this.A01 = encryptionKeyFragment;
        this.A00 = i;
    }

    public final void onFocusChange(View view, boolean z) {
        EncryptionKeyFragment encryptionKeyFragment = this.A01;
        int i = this.A00;
        if (z) {
            encryptionKeyFragment.A00 = i;
            if (i > 0) {
                Editable text = encryptionKeyFragment.A04[i - 1].getText();
                C18740tg.A06(text);
                if (text.length() < 4) {
                    encryptionKeyFragment.A04[encryptionKeyFragment.A00 - 1].requestFocus();
                }
            }
        }
    }
}
