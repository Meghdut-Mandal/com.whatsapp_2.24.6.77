package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.2Kx  reason: invalid class name and case insensitive filesystem */
public class C44042Kx implements NoCopySpan, TextWatcher {
    public Object A00;
    public Object A01;
    public final int A02;

    public C44042Kx(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A02 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int i = 5;
            if (AnonymousClass1JZ.A0C(editable)) {
                i = 3;
            }
            layoutParams.gravity = i;
            ((View) this.A01).setLayoutParams(layoutParams);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (this.A02 == 0) {
            String charSequence2 = charSequence.toString();
            EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A00;
            String lowerCase = charSequence2.toLowerCase(C36401kF.A0x(encryptionKeyFragment.A03));
            if (!charSequence.toString().equals(lowerCase)) {
                EditText editText = (EditText) this.A01;
                editText.setText(lowerCase);
                editText.setSelection(charSequence.length());
            }
            if (charSequence.length() == 4 && (i4 = encryptionKeyFragment.A00 + 1) < 16) {
                encryptionKeyFragment.A04[i4].requestFocus();
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            int i5 = 0;
            do {
                Editable text = encryptionKeyFragment.A04[i5].getText();
                if (text == null) {
                    break;
                }
                A0u.append(text);
                i5++;
            } while (i5 < 16);
            EncBackupViewModel encBackupViewModel = encryptionKeyFragment.A01;
            encBackupViewModel.A02.A0D(A0u.toString());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
