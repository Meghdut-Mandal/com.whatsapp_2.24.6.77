package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import com.whatsapp.R;

/* renamed from: X.1jY  reason: invalid class name and case insensitive filesystem */
public class C35971jY extends C011705b {
    public Object A00;
    public final int A01;

    public C35971jY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A0e(View view, AccessibilityEvent accessibilityEvent) {
        if (this.A01 != 0) {
            super.A0e(view, accessibilityEvent);
        } else {
            view.setLongClickable(false);
        }
    }

    public void A0k(View view, C07650Ys r6) {
        if (1 - this.A01 != 0) {
            super.A0k(view, r6);
            return;
        }
        super.A0k(view, r6);
        String name = Button.class.getName();
        if (Build.VERSION.SDK_INT < 23) {
            r6.A0G(((View) this.A00).getContext().getString(R.string.f12nameremoved));
        }
        r6.A0C(name);
    }
}
