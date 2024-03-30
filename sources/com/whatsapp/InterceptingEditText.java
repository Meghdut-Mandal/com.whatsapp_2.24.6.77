package com.whatsapp;

import X.AnonymousClass281;
import X.C87474Oy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class InterceptingEditText extends AnonymousClass281 {
    public C87474Oy A00;

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C87474Oy r0;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (r0 = this.A00) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        r0.BRm();
        return true;
    }

    public InterceptingEditText(Context context) {
        super(context);
    }

    public void setOnBackButtonListener(C87474Oy r1) {
        this.A00 = r1;
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InterceptingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
