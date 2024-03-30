package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.4g3  reason: invalid class name and case insensitive filesystem */
public class C93174g3 extends C03320Ec {
    public int A00;
    public ColorStateList A01;
    public final float A02;
    public final int A03;
    public final Rect A04 = AnonymousClass001.A06();
    public final AccessibilityManager A05;
    public final C09470cQ A06;

    public void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.A05;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.A06.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout A002 = A00();
            int i4 = 0;
            if (adapter == null || A002 == null) {
                i3 = 0;
            } else {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C09470cQ r1 = this.A06;
                PopupWindow popupWindow = r1.A0A;
                if (!popupWindow.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = r1.A0B.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, A002);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = popupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.A04;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i3 = i5 + A002.A15.A0G.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.A05;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.A00 = i;
        if (getAdapter() instanceof C92664eL) {
            ((C92664eL) getAdapter()).A00();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getAdapter() instanceof C92664eL) {
            ((C92664eL) getAdapter()).A00();
        }
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.A05;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.A06.Btc();
        }
    }

    public C93174g3(Context context, AttributeSet attributeSet) {
        super(C27891Qg.A00(context, attributeSet, R.attr.f4nameremoved, 0), attributeSet, R.attr.f4nameremoved);
        Context context2 = getContext();
        TypedArray A002 = C013205s.A00(context2, attributeSet, C27931Qk.A0H, new int[0], R.attr.f4nameremoved, R.style.f13nameremoved);
        if (A002.hasValue(0) && A002.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.A03 = A002.getResourceId(2, R.layout.f9nameremoved);
        this.A02 = (float) A002.getDimensionPixelOffset(1, R.dimen.f7nameremoved);
        this.A00 = A002.getColor(3, 0);
        this.A01 = AnonymousClass061.A00(context2, A002, 4);
        this.A05 = (AccessibilityManager) context2.getSystemService("accessibility");
        C09470cQ r3 = new C09470cQ(context2, (AttributeSet) null, R.attr.f4nameremoved, 0);
        this.A06 = r3;
        r3.A0F = true;
        PopupWindow popupWindow = r3.A0A;
        popupWindow.setFocusable(true);
        r3.A06 = this;
        popupWindow.setInputMethodMode(2);
        r3.Bq4(getAdapter());
        r3.A07 = new C136026de(this);
        if (A002.hasValue(5)) {
            setSimpleItems(A002.getResourceId(5, 0));
        }
        A002.recycle();
    }

    private TextInputLayout A00() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public static void A01(C93174g3 r2, Object obj) {
        r2.setText(r2.convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        TextInputLayout A002 = A00();
        if (A002 == null || !A002.A0Q) {
            return super.getHint();
        }
        return A002.getHint();
    }

    public float getPopupElevation() {
        return this.A02;
    }

    public int getSimpleItemSelectedColor() {
        return this.A00;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.A01;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout A002 = A00();
        if (A002 != null && A002.A0Q && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A06.dismiss();
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.A06.Bq4(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C09470cQ r0 = this.A06;
        if (r0 != null) {
            r0.BqH(drawable);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.A06.A08 = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout A002 = A00();
        if (A002 != null) {
            A002.A0F();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C92664eL(getContext(), this, strArr, this.A03));
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
