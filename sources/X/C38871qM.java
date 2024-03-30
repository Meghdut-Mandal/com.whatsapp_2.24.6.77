package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import java.util.Set;

/* renamed from: X.1qM  reason: invalid class name and case insensitive filesystem */
public abstract class C38871qM extends PopupWindow {
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02;
    public final Activity A03;
    public final C87484Oz A04;
    public final C21060yb A05;
    public final C19420v0 A06;
    public final Runnable A07;
    public final Set A08;
    public final C19700wN A09;
    public final AnonymousClass1N2 A0A;

    public static void A00(PopupWindow popupWindow) {
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(2);
        popupWindow.setAnimationStyle(0);
    }

    public void A0A() {
        this.A01 = A0D(-1);
    }

    public void A0B(WaEditText waEditText) {
        this.A02 = true;
        A09();
        dismiss();
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A04;
        if (keyboardPopupLayout.A02 != null) {
            keyboardPopupLayout.A02 = null;
            keyboardPopupLayout.requestLayout();
        }
        A01(new C90344a0(waEditText, 1), this, waEditText, new C1496972k(this, 3));
    }

    public void A0E() {
        this.A02 = false;
    }

    public static void A01(AnonymousClass4P0 r5, C38871qM r6, WaEditText waEditText, Runnable runnable) {
        boolean hideSoftInputFromWindow;
        InputMethodManager A0N = r6.A05.A0N();
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        Handler A0H = C36341k9.A0H();
        Set set = r6.A08;
        C37171lw r2 = new C37171lw(A0H, runnable, set);
        C90344a0 r52 = (C90344a0) r5;
        if (r52.A01 != 0) {
            hideSoftInputFromWindow = A0N.showSoftInput((View) r52.A00, 0, r2);
        } else {
            hideSoftInputFromWindow = A0N.hideSoftInputFromWindow(((View) r52.A00).getWindowToken(), 0, r2);
        }
        if (!hideSoftInputFromWindow) {
            C87484Oz r22 = r6.A04;
            ((KeyboardPopupLayout) r22).A04 = false;
            ((View) r22).requestLayout();
            set.remove(runnable);
        }
    }

    public void A09() {
        C87484Oz r2 = this.A04;
        ((View) r2).getHandler().removeCallbacks(this.A07);
        ((KeyboardPopupLayout) r2).A04 = true;
    }

    public boolean A0C() {
        if (Build.VERSION.SDK_INT < 24 || !this.A03.isInMultiWindowMode()) {
            return false;
        }
        return true;
    }

    public int A0D(int i) {
        SharedPreferences sharedPreferences;
        String str;
        int A012;
        int i2;
        SharedPreferences.Editor A002;
        String str2;
        SharedPreferences sharedPreferences2;
        String str3;
        int A013;
        int i3;
        SharedPreferences.Editor A003;
        String str4;
        if (this instanceof AnonymousClass22s) {
            return ((AnonymousClass22s) this).A00;
        }
        if (this instanceof AnonymousClass22t) {
            Point point = new Point();
            Activity activity = this.A03;
            C36321k7.A0K(activity, point);
            int i4 = point.y;
            int A042 = C36341k9.A04(activity);
            if (A042 == 1) {
                sharedPreferences2 = C36341k9.A0E(this.A06);
                str3 = "keyboard_height_portrait";
                A013 = C36371kC.A01(sharedPreferences2, str3);
            } else if (A042 != 2) {
                A013 = 0;
            } else {
                sharedPreferences2 = C36341k9.A0E(this.A06);
                str3 = "keyboard_height_landscape";
                A013 = C36371kC.A01(sharedPreferences2, str3);
            }
            if (this.A00 == 1 && i > 0 && !A0C()) {
                i3 = Math.min(i4 / 2, i);
            } else if (A013 > 0) {
                i3 = Math.min(i4 / 2, A013);
            } else {
                i3 = (i4 * 3) / 8;
            }
            int A043 = C36341k9.A04(activity);
            if (A043 != 1) {
                if (A043 == 2) {
                    A003 = C19420v0.A00(this.A06);
                    str4 = "keyboard_height_landscape";
                }
                return i3;
            }
            A003 = C19420v0.A00(this.A06);
            str4 = "keyboard_height_portrait";
            C36341k9.A0v(A003, str4, i3);
            return i3;
        }
        AnonymousClass22r r2 = (AnonymousClass22r) this;
        Point point2 = new Point();
        Activity activity2 = r2.A03;
        C36321k7.A0K(activity2, point2);
        int i5 = point2.y;
        int A044 = C36341k9.A04(activity2);
        if (A044 == 1) {
            sharedPreferences = C36341k9.A0E(r2.A06);
            str = "keyboard_height_portrait";
            A012 = C36371kC.A01(sharedPreferences, str);
        } else if (A044 != 2) {
            A012 = 0;
        } else {
            sharedPreferences = C36341k9.A0E(r2.A06);
            str = "keyboard_height_landscape";
            A012 = C36371kC.A01(sharedPreferences, str);
        }
        if (i > 0 && !r2.A0C()) {
            i2 = Math.min(i5 / 2, i);
        } else if (A012 > 0) {
            i2 = Math.min(i5 / 2, A012);
        } else {
            i2 = (i5 * 3) / 8;
        }
        int A045 = C36341k9.A04(activity2);
        if (A045 != 1) {
            if (A045 == 2) {
                A002 = C19420v0.A00(r2.A06);
                str2 = "keyboard_height_landscape";
            }
            return Math.max(i2, r2.A02.getPopupHeightV2());
        }
        A002 = C19420v0.A00(r2.A06);
        str2 = "keyboard_height_portrait";
        C36341k9.A0v(A002, str2, i2);
        return Math.max(i2, r2.A02.getPopupHeightV2());
    }

    public C38871qM(Activity activity, C19700wN r4, C87484Oz r5, C21060yb r6, C19420v0 r7, AnonymousClass1N2 r8) {
        super(activity);
        this.A03 = activity;
        this.A0A = r8;
        this.A09 = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = C36441kJ.A16();
        this.A07 = new C1496972k(r5, 1);
    }

    public static boolean A02(Point point, View view) {
        int i;
        int i2;
        int[] A1O = C36441kJ.A1O();
        view.getLocationOnScreen(A1O);
        int i3 = point.x;
        int i4 = A1O[0];
        if (i3 < i4 || i3 > i4 + view.getWidth() || (i = point.y) < (i2 = A1O[1]) || i > C36431kI.A04(view, i2)) {
            return false;
        }
        return true;
    }

    public void dismiss() {
        if (isShowing()) {
            A0A();
            super.dismiss();
            C87484Oz r2 = this.A04;
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r2;
            if (keyboardPopupLayout.A02 != null) {
                keyboardPopupLayout.A02 = null;
                keyboardPopupLayout.requestLayout();
            }
            ((View) r2).requestLayout();
        }
    }
}
