package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.6du  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136186du implements TextView.OnEditorActionListener {
    public final /* synthetic */ WaEditText A00;
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet A01;

    public /* synthetic */ C136186du(WaEditText waEditText, ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        this.A01 = expressionsKeyboardSearchBottomSheet;
        this.A00 = waEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = this.A01;
        WaEditText waEditText = this.A00;
        if (i != 3) {
            return false;
        }
        C90514aH.A0b(expressionsKeyboardSearchBottomSheet).A0T(String.valueOf(waEditText.getText()), true);
        waEditText.A0B();
        return false;
    }
}
