package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.whatsapp.R;

/* renamed from: X.8fn  reason: invalid class name and case insensitive filesystem */
public class C178348fn extends C147106wg {
    public void BdS(EditText editText) {
        EditText editText2 = editText;
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 0, 158, 0));
        editText2.dispatchKeyEvent(new KeyEvent(0, 0, 1, 158, 0));
    }

    public C178348fn() {
        super(R.drawable.ic_key_decimal);
    }

    public String A00(Context context) {
        return context.getString(R.string.f12nameremoved);
    }
}
