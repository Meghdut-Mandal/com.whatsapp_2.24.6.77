package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.WaEditText;

/* renamed from: X.7pv  reason: invalid class name and case insensitive filesystem */
public class C163267pv implements C88314Sf {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163267pv(WaEditText waEditText, AnonymousClass687 r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = waEditText;
    }

    public void BRp() {
        View view = (View) this.A01;
        C18740tg.A04(view);
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BWN(int[] iArr) {
        int i = this.A02;
        EditText editText = (EditText) this.A01;
        if (i == 0 || editText.getVisibility() == 0) {
            AnonymousClass3UG.A08(editText, iArr, 0);
        }
    }
}
