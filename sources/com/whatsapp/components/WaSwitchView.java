package com.whatsapp.components;

import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.C012005e;
import X.C18700tb;
import X.C34081gQ;
import X.C36401kF;
import X.C36441kJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class WaSwitchView extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final SwitchCompat A02;
    public final WaTextView A03;
    public final WaTextView A04;

    public WaSwitchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z) {
        this.A02.setChecked(z);
    }

    public void setDescription(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A02.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setSwitchClickable(boolean z) {
        this.A02.setClickable(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.A04.setText(charSequence);
    }

    /* JADX INFO: finally extract failed */
    public WaSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        int i5 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0U, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                i3 = obtainStyledAttributes.getResourceId(0, 0);
                i2 = obtainStyledAttributes.getResourceId(3, R.style.f13nameremoved);
                i4 = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                i5 = resourceId;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        C34081gQ.A02(this);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        if (getPaddingLeft() == 0) {
            paddingLeft = dimensionPixelOffset;
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (getPaddingTop() == 0) {
            paddingTop = dimensionPixelOffset;
        } else {
            paddingTop = getPaddingTop();
        }
        if (getPaddingRight() == 0) {
            paddingRight = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        } else {
            paddingRight = getPaddingRight();
        }
        setPadding(paddingLeft, paddingTop, paddingRight, getPaddingBottom() != 0 ? getPaddingBottom() : dimensionPixelOffset);
        setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
        WaTextView A0Q = C36401kF.A0Q(this, R.id.switch_view_title);
        this.A04 = A0Q;
        if (i5 != 0) {
            A0Q.setText(i5);
        }
        if (i2 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0Q.setTextAppearance(i2);
            } else {
                A0Q.setTextAppearance(context, i2);
            }
        }
        WaTextView A0Q2 = C36401kF.A0Q(this, R.id.switch_view_description);
        this.A03 = A0Q2;
        if (i3 != 0) {
            A0Q2.setText(i3);
        }
        if (i4 != 0) {
            if (Build.VERSION.SDK_INT > 22) {
                A0Q2.setTextAppearance(i4);
            } else {
                A0Q2.setTextAppearance(getContext(), i4);
            }
        }
        this.A02 = (SwitchCompat) C012005e.A02(this, R.id.switch_view_toggle);
    }

    public WaSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
