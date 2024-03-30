package androidx.appcompat.widget;

import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass0EI;
import X.C015706u;
import X.C015806v;
import X.C09150bu;
import X.C09290c8;
import X.C17360rA;
import X.C18560tM;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.whatsapp.R;

public class AppCompatSpinner extends Spinner {
    public static final int[] A08 = {16843505};
    public int A00;
    public C17360rA A01;
    public SpinnerAdapter A02;
    public C09150bu A03;
    public final Rect A04;
    public final Context A05;
    public final C015706u A06;
    public final boolean A07;

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    public int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int A022 = AnonymousClass001.A02(max, 15 - (min - max), 0); A022 < min; A022++) {
            int itemViewType = spinnerAdapter.getItemViewType(A022);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(A022, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.A04;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public int getDropDownHorizontalOffset() {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            return r0.BCT();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            return r0.BJ0();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.A01 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public Drawable getPopupBackground() {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            return r0.B8j();
        }
        return super.getPopupBackground();
    }

    public CharSequence getPrompt() {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            return r0.BCQ();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C015806v r0;
        C015706u r02 = this.A06;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C015806v r0;
        C015706u r02 = this.A06;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass0EI r4 = (AnonymousClass0EI) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        if (r4.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C18560tM(this, 2));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C09150bu r0 = this.A03;
        if (r0 == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C17360rA r2 = this.A01;
        if (r2 == null) {
            return super.performClick();
        }
        if (r2.BNH()) {
            return true;
        }
        r2.Btd(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A02 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C17360rA r2 = this.A01;
        if (r2 != null) {
            Context context = this.A05;
            if (context == null) {
                context = getContext();
            }
            r2.Bq4(new C09290c8(context.getTheme(), spinnerAdapter));
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            r0.Br2(i);
            r0.Br1(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            r0.Bsg(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.A01 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            r0.BqH(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AnonymousClass02X.A03().A08(this.A05, i));
    }

    public void setPrompt(CharSequence charSequence) {
        C17360rA r0 = this.A01;
        if (r0 != null) {
            r0.Brq(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C015706u r0 = this.A06;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C015706u r0 = this.A06;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17360rA r1 = this.A01;
        if (r1 != null && r1.BNH()) {
            r1.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.0EI r2 = new X.0EI
            r2.<init>((android.os.Parcelable) r0)
            X.0rA r0 = r3.A01
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.BNH()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C015706u r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C015706u r0 = this.A06;
        if (r0 != null) {
            r0.A02(i);
        }
    }

    public final C17360rA getInternalPopup() {
        return this.A01;
    }

    public Context getPopupContext() {
        return this.A05;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r8 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13, android.content.res.Resources.Theme r14) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r9.A04 = r0
            X.C015606t.A04(r9)
            int[] r2 = X.AnonymousClass1MJ.A0K
            r1 = 0
            r5 = 0
            X.04j r4 = X.C010404j.A00(r10, r11, r2, r12, r1)
            X.06u r0 = new X.06u
            r0.<init>(r9)
            r9.A06 = r0
            if (r14 == 0) goto L_0x0029
            X.02b r3 = new X.02b
            r3.<init>((android.content.Context) r10, (android.content.res.Resources.Theme) r14)
        L_0x0022:
            r9.A05 = r3
        L_0x0024:
            r0 = -1
            r6 = 0
            if (r13 != r0) goto L_0x0066
            goto L_0x003b
        L_0x0029:
            r3 = 4
            android.content.res.TypedArray r0 = r4.A02
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0038
            X.02b r3 = new X.02b
            r3.<init>((android.content.Context) r10, (int) r0)
            goto L_0x0022
        L_0x0038:
            r9.A05 = r10
            goto L_0x0024
        L_0x003b:
            int[] r0 = A08     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r11, r0, r12, r1)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            boolean r0 = r8.hasValue(r1)     // Catch:{ Exception -> 0x004c }
            if (r0 == 0) goto L_0x0063
            int r13 = r8.getInt(r1, r1)     // Catch:{ Exception -> 0x004c }
            goto L_0x0063
        L_0x004c:
            r7 = move-exception
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            throw r0
        L_0x0050:
            r7 = move-exception
            r8 = r6
        L_0x0052:
            java.lang.String r3 = "AppCompatSpinner"
            java.lang.String r0 = "Could not read android:spinnerMode"
            android.util.Log.i(r3, r0, r7)     // Catch:{ all -> 0x005a }
            goto L_0x0061
        L_0x005a:
            r0 = move-exception
            if (r8 == 0) goto L_0x0060
            r8.recycle()
        L_0x0060:
            throw r0
        L_0x0061:
            if (r8 == 0) goto L_0x0066
        L_0x0063:
            r8.recycle()
        L_0x0066:
            r3 = 1
            if (r13 == 0) goto L_0x00cb
            if (r13 != r3) goto L_0x009e
            android.content.Context r0 = r9.A05
            X.0G0 r7 = new X.0G0
            r7.<init>(r0, r11, r9, r12)
            android.content.Context r0 = r9.A05
            X.04j r8 = X.C010404j.A00(r0, r11, r2, r12, r1)
            r1 = 3
            r0 = -2
            android.content.res.TypedArray r2 = r8.A02
            int r0 = r2.getLayoutDimension(r1, r0)
            r9.A00 = r0
            android.graphics.drawable.Drawable r0 = r8.A02(r3)
            r7.BqH(r0)
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r7.A02 = r0
            r2.recycle()
            r9.A01 = r7
            X.0sd r0 = new X.0sd
            r0.<init>(r9, r9, r7, r3)
            r9.A03 = r0
        L_0x009e:
            android.content.res.TypedArray r4 = r4.A02
            java.lang.CharSequence[] r2 = r4.getTextArray(r5)
            if (r2 == 0) goto L_0x00b7
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r10, r0, r2)
            r0 = 2131626333(0x7f0e095d, float:1.88799E38)
            r1.setDropDownViewResource(r0)
            r9.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00b7:
            r4.recycle()
            r9.A07 = r3
            android.widget.SpinnerAdapter r0 = r9.A02
            if (r0 == 0) goto L_0x00c5
            r9.setAdapter((android.widget.SpinnerAdapter) r0)
            r9.A02 = r6
        L_0x00c5:
            X.06u r0 = r9.A06
            r0.A05(r11, r12)
            return
        L_0x00cb:
            X.0cR r2 = new X.0cR
            r2.<init>(r9)
            r9.A01 = r2
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r2.A01 = r0
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, R.attr.f4nameremoved, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }
}
