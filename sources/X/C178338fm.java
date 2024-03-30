package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.8fm  reason: invalid class name and case insensitive filesystem */
public class C178338fm extends C147106wg {
    public void BdS(EditText editText) {
        EditText editText2 = editText;
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 0, 159, 0));
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 1, 159, 0));
    }

    public C178338fm() {
        super(R.drawable.ic_key_comma);
    }

    public String A00(Context context) {
        return context.getString(R.string.f12nameremoved);
    }
}
