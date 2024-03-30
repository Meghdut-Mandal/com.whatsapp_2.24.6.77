package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.07E  reason: invalid class name */
public class AnonymousClass07E extends AnonymousClass07B {
    public AnonymousClass07I A00;
    public boolean A01;
    public Window.Callback A02;
    public ArrayList A03 = new ArrayList();
    public boolean A04;
    public boolean A05;
    public final AnonymousClass07G A06;
    public final Runnable A07 = new AnonymousClass07F(this);

    public void A0M(Drawable drawable) {
        AnonymousClass07J r0 = (AnonymousClass07J) this.A00;
        r0.A04 = null;
        AnonymousClass07J.A00(r0);
    }

    public void A0N(View view) {
        A0O(view, new C013405v(-2, -2));
    }

    public void A0T(boolean z) {
    }

    public void A0U(boolean z) {
        int i = 0;
        if (z) {
            i = 4;
        }
        A0b(i, 4);
    }

    public void A0W(boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        A0b(i, 2);
    }

    public void A0Y(boolean z) {
    }

    public static Menu A00(AnonymousClass07E r3) {
        if (!r3.A05) {
            AnonymousClass07I r0 = r3.A00;
            ((AnonymousClass07J) r0).A09.setMenuCallbacks(new C09410cK(r3), new C09340cD(r3));
            r3.A05 = true;
        }
        return ((AnonymousClass07J) r3.A00).A09.getMenu();
    }

    public void A03() {
        ((AnonymousClass07J) this.A00).A09.removeCallbacks(this.A07);
    }

    public boolean A04() {
        C09460cP r0;
        ActionMenuView actionMenuView = ((AnonymousClass07J) this.A00).A09.A09;
        if (actionMenuView == null || (r0 = actionMenuView.A04) == null || !r0.A01()) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        Toolbar toolbar = ((AnonymousClass07J) this.A00).A09;
        Runnable runnable = this.A07;
        toolbar.removeCallbacks(runnable);
        C011504z.A07(toolbar, runnable);
        return true;
    }

    public boolean A06() {
        C09460cP r0;
        ActionMenuView actionMenuView = ((AnonymousClass07J) this.A00).A09.A09;
        if (actionMenuView == null || (r0 = actionMenuView.A04) == null || !r0.A03()) {
            return false;
        }
        return true;
    }

    public float A08() {
        return C011004s.A00(((AnonymousClass07J) this.A00).A09);
    }

    public int A09() {
        return ((AnonymousClass07J) this.A00).A01;
    }

    public Context A0A() {
        return ((AnonymousClass07J) this.A00).A09.getContext();
    }

    public View A0B() {
        return ((AnonymousClass07J) this.A00).A06;
    }

    public void A0D() {
        ((AnonymousClass07J) this.A00).A09.setVisibility(8);
    }

    public void A0E() {
        ((AnonymousClass07J) this.A00).A09.setVisibility(0);
    }

    public void A0F(float f) {
        C011004s.A05(((AnonymousClass07J) this.A00).A09, f);
    }

    public void A0G(int i) {
        AnonymousClass07J r3 = (AnonymousClass07J) this.A00;
        r3.BrJ(AnonymousClass02X.A03().A08(r3.A09.getContext(), R.drawable.ic_pip_close));
    }

    public void A0H(int i) {
        AnonymousClass07I r1 = this.A00;
        r1.BsP(((AnonymousClass07J) r1).A09.getContext().getText(i));
    }

    public void A0I(int i) {
        CharSequence charSequence;
        AnonymousClass07I r1 = this.A00;
        if (i != 0) {
            charSequence = ((AnonymousClass07J) r1).A09.getContext().getText(i);
        } else {
            charSequence = null;
        }
        r1.BsU(charSequence);
    }

    public void A0K(Drawable drawable) {
        C011504z.A04(drawable, ((AnonymousClass07J) this.A00).A09);
    }

    public void A0L(Drawable drawable) {
        this.A00.BrJ(drawable);
    }

    public void A0O(View view, C013405v r3) {
        if (view != null) {
            view.setLayoutParams(r3);
        }
        this.A00.Bqi(view);
    }

    public void A0P(CharSequence charSequence) {
        this.A00.BsP(charSequence);
    }

    public void A0Q(CharSequence charSequence) {
        this.A00.BsU(charSequence);
    }

    public void A0R(CharSequence charSequence) {
        this.A00.setWindowTitle(charSequence);
    }

    public void A0S(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            ArrayList arrayList = this.A03;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public void A0V(boolean z) {
        A0b(16, 16);
    }

    public void A0X(boolean z) {
        int i = 0;
        if (z) {
            i = 8;
        }
        A0b(i, 8);
    }

    public boolean A0Z() {
        C018707z r0;
        C09430cM r02 = ((AnonymousClass07J) this.A00).A09.A0B;
        if (r02 == null || (r0 = r02.A01) == null) {
            return false;
        }
        r0.collapseActionView();
        return true;
    }

    public void A0b(int i, int i2) {
        AnonymousClass07I r2 = this.A00;
        r2.Bqm((i & i2) | ((~i2) & ((AnonymousClass07J) r2).A01));
    }

    public AnonymousClass07E(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        AnonymousClass07H r2 = new AnonymousClass07H(this);
        this.A06 = r2;
        AnonymousClass07J r1 = new AnonymousClass07J(toolbar, false);
        this.A00 = r1;
        AnonymousClass07O r0 = new AnonymousClass07O(callback, this);
        this.A02 = r0;
        r1.A07 = r0;
        toolbar.A0C = r2;
        r1.setWindowTitle(charSequence);
    }

    public boolean A07(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            A06();
        }
        return true;
    }

    public boolean A0a(int i, KeyEvent keyEvent) {
        Menu A002 = A00(this);
        if (A002 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        A002.setQwertyMode(z);
        return A002.performShortcut(i, keyEvent, 0);
    }
}
