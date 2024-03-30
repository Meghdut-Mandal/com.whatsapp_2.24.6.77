package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.R;

/* renamed from: X.1N2  reason: invalid class name */
public class AnonymousClass1N2 {
    public final C21060yb A00;

    public static boolean A00(View view) {
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        WindowManager A01 = C21060yb.A01(view.getContext());
        C18740tg.A06(A01);
        if (A01.getDefaultDisplay().getHeight() - rect.bottom >= view.getRootView().getResources().getDimensionPixelSize(R.dimen.f7nameremoved)) {
            return true;
        }
        return false;
    }

    public void A01(View view) {
        InputMethodManager A0N = this.A00.A0N();
        C18740tg.A06(A0N);
        A0N.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void A02(View view) {
        InputMethodManager A0N = this.A00.A0N();
        C18740tg.A06(A0N);
        A0N.showSoftInput(view, 0);
    }

    public AnonymousClass1N2(C21060yb r1) {
        this.A00 = r1;
    }
}
