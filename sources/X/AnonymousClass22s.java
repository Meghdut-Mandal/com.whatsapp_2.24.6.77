package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.22s  reason: invalid class name */
public class AnonymousClass22s extends C38871qM {
    public int A00 = this.A01.getMeasuredHeight();
    public NumberEntryKeyboard A01;
    public List A02;
    public AnonymousClass2Z9 A03;

    public AnonymousClass22s(Activity activity, C19700wN r13, C87484Oz r14, C21060yb r15, C19420v0 r16, B1C b1c, AnonymousClass2Z9 r18, AnonymousClass1N2 r19, List list) {
        super(activity, r13, r14, r15, r16, r19);
        AnonymousClass2Z9 r1 = r18;
        this.A03 = r1;
        List list2 = list;
        this.A02 = list2;
        NumberEntryKeyboard numberEntryKeyboard = new NumberEntryKeyboard(activity);
        this.A01 = numberEntryKeyboard;
        numberEntryKeyboard.A04 = r1;
        numberEntryKeyboard.setCustomKey(b1c);
        this.A03.setCustomCursorEnabled(true);
        setContentView(this.A01);
        setTouchable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(-1));
        setTouchInterceptor(new C53782rs(list2, this, 6));
        this.A01.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void dismiss() {
        this.A03.setHasFocus(false);
        super.dismiss();
    }

    public static void A03(AnonymousClass22s r4) {
        if (!r4.isShowing()) {
            Activity activity = r4.A03;
            if (activity.getCurrentFocus() != null) {
                activity.getCurrentFocus().clearFocus();
            }
            r4.setHeight(r4.A00);
            r4.setWidth(-1);
            C87484Oz r3 = r4.A04;
            r3.setKeyboardPopup(r4);
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r3;
            if (keyboardPopupLayout.A04) {
                View view = (View) r3;
                C90104Zc.A00(view.getViewTreeObserver(), r4, 25);
                keyboardPopupLayout.A04 = false;
                view.requestLayout();
            } else if (!r4.isShowing()) {
                r4.showAtLocation((View) r3, 48, 0, 1000000);
            }
            r4.A03.setHasFocus(true);
        }
    }

    public void A0E() {
        if (!isShowing()) {
            this.A02 = false;
            Iterator it = this.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View A0K = C36431kI.A0K(it);
                if (AnonymousClass1N2.A00(A0K)) {
                    if (A0K != null) {
                        C87484Oz r7 = this.A04;
                        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r7;
                        keyboardPopupLayout.A04 = true;
                        InputMethodManager A0N = this.A05.A0N();
                        Objects.requireNonNull(A0N);
                        if (!A0N.hideSoftInputFromWindow(A0K.getWindowToken(), 0, new C37171lw(C36341k9.A0H(), new C81123wV((Object) this, 40), this.A08))) {
                            keyboardPopupLayout.A04 = false;
                            ((View) r7).requestLayout();
                            return;
                        }
                        return;
                    }
                }
            }
            A03(this);
        }
    }
}
