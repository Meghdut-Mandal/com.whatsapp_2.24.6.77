package com.whatsapp.status.widget;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass3UN;
import X.C36331k8;
import X.C36361kB;
import X.C80353vG;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.whatsapp.mentions.MentionableEntry;

public final class StatusEditText extends MentionableEntry {
    public boolean A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A0A();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass00C.A0D(charSequence, 0);
        super.onTextChanged(charSequence, i, i2, i3);
        A0J();
    }

    public final void A0J() {
        int A002 = C36331k8.A00(this, getMeasuredWidth());
        int A0D = AnonymousClass000.A0D(this, getMeasuredHeight());
        if (A002 > 0 && A0D > 0) {
            if (getText() == null) {
                super.setTextSize(2, 32.0f);
                return;
            }
            Editable text = getText();
            if (text != null) {
                DisplayMetrics A0B = C36361kB.A0B(this);
                float f = ((float) A0B.heightPixels) / A0B.density;
                int A03 = AnonymousClass3UN.A03(text, 0, text.length());
                super.setTextSize(2, (float) AnonymousClass3UN.A01(A03, (int) f, this.A01));
                if (A03 < 150) {
                    setGravity(17);
                    setTextAlignment(4);
                    return;
                }
                setGravity(16);
                setTextAlignment(5);
                setTextDirection(5);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0J();
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart >= 0 && selectionEnd >= 0) {
                post(new C80353vG(this, selectionStart, selectionEnd, 5));
            }
        }
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        A0J();
    }

    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        A0J();
    }

    public final void setCursorPosition(int i) {
        super.setCursorPosition_internal(i, i);
    }

    public final void setLinkPreviewPresent(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A0A();
    }

    public StatusEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A0A();
    }
}
