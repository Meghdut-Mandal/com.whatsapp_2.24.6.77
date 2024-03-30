package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.0g9  reason: invalid class name and case insensitive filesystem */
public class C11340g9 implements Runnable {
    public final /* synthetic */ View A00;

    public C11340g9(View view) {
        this.A00 = view;
    }

    public void run() {
        View view = this.A00;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
