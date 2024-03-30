package com.google.android.material.internal;

import X.AnonymousClass07N;
import X.AnonymousClass0HM;
import X.C012005e;
import X.C18120se;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;

public class CheckableImageButton extends AnonymousClass07N implements Checkable {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public int[] onCreateDrawableState(int i) {
        if (!this.A02) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), A03);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0HM)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0HM r2 = (AnonymousClass0HM) parcelable;
        super.onRestoreInstanceState(r2.A00);
        setChecked(r2.A00);
    }

    public void setCheckable(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.A00 && this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setPressed(boolean z) {
        if (this.A01) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.A02);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0HM r1 = new AnonymousClass0HM(super.onSaveInstanceState());
        r1.A00 = this.A02;
        return r1;
    }

    public void setPressable(boolean z) {
        this.A01 = z;
    }

    public boolean isChecked() {
        return this.A02;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A01 = true;
        C012005e.A0V(this, new C18120se(this, 8));
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
