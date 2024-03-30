package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.3Zt  reason: invalid class name and case insensitive filesystem */
public class C67423Zt implements TextView.OnEditorActionListener {
    public boolean A00;
    public final /* synthetic */ C70803fk A01;

    public C67423Zt(C70803fk r1) {
        this.A01 = r1;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null) {
            keyEvent.getKeyCode();
        }
        if (i == 4) {
            this.A01.A2Z(false);
            return true;
        } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        } else {
            if (this.A00) {
                this.A00 = false;
                return true;
            }
            C70803fk r3 = this.A01;
            if (C36341k9.A0E(r3.A2l.getWaSharedPreferences()).getBoolean("input_enter_send", true)) {
                r3.A2Z(false);
            } else {
                int selectionStart = r3.A4B.getSelectionStart();
                int selectionEnd = r3.A4B.getSelectionEnd();
                if (selectionStart != r3.A4B.length()) {
                    r3.A4B.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), "\n", 0, 1);
                } else {
                    r3.A4B.append("\n");
                }
            }
            this.A00 = true;
            return true;
        }
    }
}
