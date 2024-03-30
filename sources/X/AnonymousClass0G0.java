package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0G0  reason: invalid class name */
public class AnonymousClass0G0 extends C09470cQ implements C17360rA {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03 = AnonymousClass001.A06();
    public final /* synthetic */ AppCompatSpinner A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0G0(Context context, AttributeSet attributeSet, AppCompatSpinner appCompatSpinner, int i) {
        super(context, attributeSet, i, 0);
        this.A04 = appCompatSpinner;
        this.A06 = appCompatSpinner;
        this.A0F = true;
        this.A0A.setFocusable(true);
        this.A07 = new C18360t2(this, appCompatSpinner, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r9 = this;
            android.widget.PopupWindow r3 = r9.A0A
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            r2 = 0
            androidx.appcompat.widget.AppCompatSpinner r5 = r9.A04
            android.graphics.Rect r7 = r5.A04
            if (r0 == 0) goto L_0x007c
            r0.getPadding(r7)
            java.lang.reflect.Method r0 = X.AnonymousClass04u.A00
            int r1 = X.AnonymousClass04F.A01(r5)
            r0 = 1
            if (r1 != r0) goto L_0x0078
            int r2 = r7.right
        L_0x001b:
            int r8 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r6 = r5.getWidth()
            int r1 = r5.A00
            r0 = -2
            if (r1 != r0) goto L_0x006d
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            int r3 = r5.A00(r0, r1)
            android.content.Context r0 = r5.getContext()
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r0)
            int r1 = r0.widthPixels
            int r0 = r7.left
            int r1 = r1 - r0
            int r0 = r7.right
            int r1 = r1 - r0
            if (r3 <= r1) goto L_0x004b
            r3 = r1
        L_0x004b:
            int r0 = r6 - r8
            int r0 = X.AnonymousClass001.A02(r0, r4, r3)
        L_0x0051:
            r9.A03(r0)
        L_0x0054:
            java.lang.reflect.Method r0 = X.AnonymousClass04u.A00
            int r1 = X.AnonymousClass04F.A01(r5)
            r0 = 1
            if (r1 != r0) goto L_0x0068
            int r6 = r6 - r4
            int r0 = r9.A03
            int r6 = r6 - r0
            int r0 = r9.A00
            int r6 = r6 - r0
            int r2 = r2 + r6
        L_0x0065:
            r9.A01 = r2
            return
        L_0x0068:
            int r0 = r9.A00
            int r8 = r8 + r0
            int r2 = r2 + r8
            goto L_0x0065
        L_0x006d:
            r0 = -1
            if (r1 != r0) goto L_0x0074
            int r0 = r6 - r8
            int r0 = r0 - r4
            goto L_0x0051
        L_0x0074:
            r9.A03(r1)
            goto L_0x0054
        L_0x0078:
            int r0 = r7.left
            int r2 = -r0
            goto L_0x001b
        L_0x007c:
            r7.right = r2
            r7.left = r2
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0G0.A04():void");
    }

    public void Btd(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A0A;
        boolean isShowing = popupWindow.isShowing();
        A04();
        popupWindow.setInputMethodMode(2);
        super.Btc();
        AnonymousClass0F6 r1 = this.A0B;
        r1.setChoiceMode(1);
        r1.setTextDirection(i);
        r1.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.A04;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        AnonymousClass0F6 r12 = this.A0B;
        if (popupWindow.isShowing() && r12 != null) {
            r12.A08 = false;
            r12.setSelection(selectedItemPosition);
            if (r12.getChoiceMode() != 0) {
                r12.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
            C18560tM r13 = new C18560tM(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(r13);
            popupWindow.setOnDismissListener(new C09300c9(r13, this));
        }
    }

    public void Bq4(ListAdapter listAdapter) {
        super.Bq4(listAdapter);
        this.A01 = listAdapter;
    }

    public void Br2(int i) {
        this.A00 = i;
    }

    public void Brq(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    public CharSequence BCQ() {
        return this.A02;
    }
}
