package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.4ZW  reason: invalid class name */
public class AnonymousClass4ZW implements View.OnKeyListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        switch (this.A01) {
            case 0:
                EncryptionKeyFragment encryptionKeyFragment = (EncryptionKeyFragment) this.A00;
                if (keyEvent.getAction() != 0 || i != 67 || (i2 = encryptionKeyFragment.A00) <= 0 || encryptionKeyFragment.A04[i2].getText() == null || C36381kD.A06(encryptionKeyFragment.A04[encryptionKeyFragment.A00]) != 0) {
                    return false;
                }
                CodeInputField codeInputField = encryptionKeyFragment.A04[encryptionKeyFragment.A00 - 1];
                Editable text = codeInputField.getText();
                C18740tg.A06(text);
                text.delete(codeInputField.length() - 1, codeInputField.length());
                codeInputField.requestFocus();
                return true;
            case 1:
                AnonymousClass2HC r2 = (AnonymousClass2HC) this.A00;
                if (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0) {
                    return false;
                }
                if (!C36441kJ.A1J(r2.A00) || !C36441kJ.A1I(C36341k9.A0E(r2.A02), "input_enter_send")) {
                    if (C36441kJ.A1J(r2.A00)) {
                        return false;
                    }
                    if ((keyEvent.getFlags() & 2) == 2 && AnonymousClass1N2.A00(r2)) {
                        return false;
                    }
                }
                if (keyEvent.isCtrlPressed()) {
                    C36371kC.A1H(r2);
                    return true;
                }
                Runnable runnable = r2.A04;
                if (runnable == null) {
                    return true;
                }
                runnable.run();
                return true;
            case 2:
                AnonymousClass2IR r5 = (AnonymousClass2IR) this.A00;
                if (i != 23) {
                    return false;
                }
                if (keyEvent.isLongPress()) {
                    r5.A1W();
                    return true;
                }
                C89004Uw r0 = r5.A0c;
                if (r0 == null || !r0.BK6() || keyEvent.getAction() != 1 || keyEvent.getEventTime() - keyEvent.getDownTime() > 500) {
                    return false;
                }
                r5.A1y(r5.getFMessage());
                return true;
            default:
                TextView textView = (TextView) this.A00;
                AnonymousClass00C.A0D(keyEvent, 3);
                if (i != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                C36391kE.A1K(textView);
                return true;
        }
    }
}
