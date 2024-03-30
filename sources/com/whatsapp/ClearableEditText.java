package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0BT;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C95224kG;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;

public class ClearableEditText extends TextInputEditText implements View.OnTouchListener, TextWatcher, C18700tb {
    public Drawable A00;
    public View.OnClickListener A01;
    public C18820ts A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private void A02(Editable editable) {
        if (this.A04 || (!TextUtils.isEmpty(editable) && isFocusable() && isEnabled())) {
            if (this.A00 != null) {
                boolean A1X = C36401kF.A1X(this.A02);
                Drawable drawable = this.A00;
                if (A1X) {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else if (getClearIconDrawable() != null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void A04() {
        if (!this.A06) {
            this.A06 = true;
            this.A02 = C36341k9.A0U(generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public Drawable getClearIconDrawable() {
        boolean A1X = C36401kF.A1X(this.A02);
        Drawable[] compoundDrawables = getCompoundDrawables();
        char c = 2;
        if (A1X) {
            c = 0;
        }
        return compoundDrawables[c];
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.A05 && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setAlwaysShowClearIcon(boolean z) {
        if (z != this.A04) {
            this.A04 = z;
            invalidate();
        }
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A07 = true;
        this.A08 = AnonymousClass001.A06();
        A01(context, attributeSet);
    }

    private void A01(Context context, AttributeSet attributeSet) {
        int i = R.drawable.ic_backup_cancel;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A05);
            this.A05 = obtainStyledAttributes.getBoolean(1, false);
            this.A07 = obtainStyledAttributes.getBoolean(3, true);
            this.A04 = obtainStyledAttributes.getBoolean(0, false);
            i = obtainStyledAttributes.getResourceId(2, R.drawable.ic_backup_cancel);
            obtainStyledAttributes.recycle();
        }
        this.A00 = AnonymousClass0BT.A00((Resources.Theme) null, getResources(), i);
        setOnTouchListener(this);
        addTextChangedListener(this);
        C012005e.A0V(this, new C95224kG(this, this));
    }

    public static boolean A03(ClearableEditText clearableEditText, int i, int i2) {
        Rect clearBounds = clearableEditText.getClearBounds();
        if (i < clearBounds.left || i > clearBounds.right || i2 < clearBounds.top || i2 > clearBounds.bottom) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public Rect getClearBounds() {
        int A0B;
        int width;
        Drawable clearIconDrawable = getClearIconDrawable();
        if (clearIconDrawable == null) {
            return AnonymousClass001.A06();
        }
        if (C36401kF.A1X(this.A02)) {
            A0B = 0;
        } else {
            A0B = AnonymousClass000.A0B(this) - clearIconDrawable.getIntrinsicWidth();
        }
        if (C36401kF.A1X(this.A02)) {
            width = getPaddingLeft() + clearIconDrawable.getIntrinsicWidth();
        } else {
            width = getWidth();
        }
        int bottom = ((getBottom() - getTop()) / 2) - (clearIconDrawable.getIntrinsicHeight() / 2);
        int bottom2 = ((getBottom() - getTop()) / 2) + (clearIconDrawable.getIntrinsicHeight() / 2);
        Rect rect = this.A08;
        rect.left = A0B;
        rect.right = width;
        rect.top = bottom;
        rect.bottom = bottom2;
        return rect;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getClearIconDrawable() == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() != 1 || !A03(this, x, y)) {
            return false;
        }
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        C36391kE.A1K(this);
        requestFocus();
        return this.A07;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        A02(getText());
    }

    public void afterTextChanged(Editable editable) {
        A02(editable);
    }

    public void setOnClearIconClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A07 = true;
        this.A08 = AnonymousClass001.A06();
        A01(context, attributeSet);
    }

    public ClearableEditText(Context context) {
        super(context, (AttributeSet) null);
        A04();
        this.A07 = true;
        this.A08 = AnonymousClass001.A06();
        A01(context, (AttributeSet) null);
    }
}
