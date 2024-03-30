package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.payments.ui.widget.CardInputText;

/* renamed from: X.3Yx  reason: invalid class name and case insensitive filesystem */
public final class C67203Yx implements View.OnKeyListener {
    public final EditText A00;
    public final EditText A01;

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        EditText editText;
        Editable text;
        AnonymousClass00C.A0D(keyEvent, 2);
        CardInputText cardInputText = (CardInputText) view;
        if (cardInputText != null && keyEvent.getAction() == 0 && cardInputText.isFocused()) {
            if (i == 67 && (editText = this.A01) != null && ((text = cardInputText.getText()) == null || text.length() == 0)) {
                cardInputText.clearFocus();
                editText.requestFocus();
                return true;
            }
            EditText editText2 = this.A00;
            if (!(editText2 == null || i == 67 || cardInputText.getText() == null || C36381kD.A06(cardInputText) != cardInputText.A04)) {
                cardInputText.clearFocus();
                editText2.requestFocus();
                return true;
            }
        }
        return false;
    }

    public C67203Yx(EditText editText, EditText editText2) {
        this.A01 = editText;
        this.A00 = editText2;
    }
}
