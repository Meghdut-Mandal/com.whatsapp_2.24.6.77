package com.whatsapp.emoji;

import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiPopupFooter extends FrameLayout implements C18700tb {
    public int A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiPopupFooter(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public int getTopOffset() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C012005e.A0Q(this, this.A00);
    }

    public void setTopOffset(int i) {
        C012005e.A0Q(this, Math.max(Math.min(getHeight(), i), 0) - getTop());
        this.A00 = getTop();
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
