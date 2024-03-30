package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5wD  reason: invalid class name and case insensitive filesystem */
public final class C123265wD {
    public final Context A00;
    public final PopupWindow A01;
    public final WaTextView A02;
    public final C21060yb A03;
    public final C18820ts A04;

    public C123265wD(Context context, C21060yb r7, C18820ts r8) {
        this.A00 = context;
        this.A03 = r7;
        this.A04 = r8;
        WaTextView waTextView = new WaTextView(context);
        waTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        C36351kA.A15(C36341k9.A0F(waTextView), waTextView, R.color.f6nameremoved);
        this.A02 = waTextView;
        this.A01 = new PopupWindow(waTextView, -2, -2, true);
    }
}
