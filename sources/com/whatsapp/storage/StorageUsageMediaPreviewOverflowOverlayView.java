package com.whatsapp.storage;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36341k9;
import X.C36371kC;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class StorageUsageMediaPreviewOverflowOverlayView extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public Drawable A02;

    public StorageUsageMediaPreviewOverflowOverlayView(Context context) {
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

    public void setFrameDrawable(Drawable drawable) {
        this.A02 = drawable;
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A02;
        if (drawable != null) {
            C36371kC.A19(drawable, this);
            this.A02.draw(canvas);
        }
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        C36341k9.A0q(context, this, R.color.f6nameremoved);
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
