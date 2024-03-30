package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: X.1n7  reason: invalid class name and case insensitive filesystem */
public final class C37731n7 extends InputConnectionWrapper {
    public final InputConnection A00;

    public C37731n7(InputConnection inputConnection, InputConnection inputConnection2) {
        super(inputConnection2, true);
        this.A00 = inputConnection;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (i == 1 && i2 == 0) {
            return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
        }
        return super.deleteSurroundingText(i, i2);
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        AnonymousClass00C.A0D(keyEvent, 0);
        if (keyEvent.getKeyCode() == 67) {
            return this.A00.sendKeyEvent(keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
