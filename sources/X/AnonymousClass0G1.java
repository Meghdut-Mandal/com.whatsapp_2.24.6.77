package X;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.0G1  reason: invalid class name */
public class AnonymousClass0G1 extends C09470cQ implements C17010qZ {
    public static Method A01;
    public C17010qZ A00;

    public AnonymousClass0G1(Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    public void A06() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A01;
            if (method != null) {
                try {
                    PopupWindow popupWindow = this.A0A;
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = false;
                    method.invoke(popupWindow, A0L);
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A0A.setTouchModal(false);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = AnonymousClass001.A0H(PopupWindow.class, Boolean.TYPE, "setTouchModal", new Class[1], 0);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public AnonymousClass0F6 A02(Context context, boolean z) {
        C03510Fs r0 = new C03510Fs(context, z);
        r0.A00 = this;
        return r0;
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0A.setEnterTransition((Transition) null);
        }
    }

    public void A05() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0A.setExitTransition((Transition) null);
        }
    }

    public void BZQ(MenuItem menuItem, C016307a r3) {
        C17010qZ r0 = this.A00;
        if (r0 != null) {
            r0.BZQ(menuItem, r3);
        }
    }

    public void BZR(MenuItem menuItem, C016307a r3) {
        C17010qZ r0 = this.A00;
        if (r0 != null) {
            r0.BZR(menuItem, r3);
        }
    }
}
