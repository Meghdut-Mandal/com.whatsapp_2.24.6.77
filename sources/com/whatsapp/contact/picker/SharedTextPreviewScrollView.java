package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36441kJ;
import X.C87594Pk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class SharedTextPreviewScrollView extends ScrollView implements C18700tb {
    public C87594Pk A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public SharedTextPreviewScrollView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void fling(int i) {
        super.fling(i);
        this.A03 = true;
    }

    public C87594Pk getOnEndScrollListener() {
        return this.A00;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.A03 && this.A04) {
            return;
        }
        if (((float) AnonymousClass000.A05(i2, i4)) < 1.0f || i2 >= getMeasuredHeight() || i2 == 0) {
            C87594Pk r0 = this.A00;
            if (r0 != null) {
                r0.BWV();
            }
            this.A03 = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.A04 = false;
            if (!this.A03) {
                this.A00.BWV();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            this.A04 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnEndScrollListener(C87594Pk r1) {
        this.A00 = r1;
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
