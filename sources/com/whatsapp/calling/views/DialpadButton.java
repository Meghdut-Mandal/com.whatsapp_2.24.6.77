package com.whatsapp.calling.views;

import X.C36371kC;
import X.C36391kE;
import X.C56762wq;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class DialpadButton extends LinearLayout {
    public DialpadButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    public DialpadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.LayoutParams A0N = C36371kC.A0N();
        A0N.gravity = 17;
        setLayoutParams(A0N);
        setGravity(17);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C56762wq.A01, 0, i);
        try {
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            View.inflate(getContext(), R.layout.f9nameremoved, this);
            C36371kC.A1E(this, string, R.id.dialpad_button_number);
            TextView A0P = C36391kE.A0P(this, R.id.dialpad_button_letters);
            if (z || !TextUtils.isEmpty(string2)) {
                A0P.setText(string2);
            } else {
                A0P.setVisibility(8);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public DialpadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
