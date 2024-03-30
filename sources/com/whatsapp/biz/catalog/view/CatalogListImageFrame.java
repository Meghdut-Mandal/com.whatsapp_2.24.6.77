package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0BT;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C18700tb;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;

public final class CatalogListImageFrame extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final Drawable A02;
    public final Drawable A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogListImageFrame(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setBounds(0, getPaddingTop() - drawable.getIntrinsicHeight(), getWidth(), getPaddingTop());
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setBounds(0, AnonymousClass000.A0A(this), getWidth(), AnonymousClass000.A0A(this) + drawable2.getIntrinsicHeight());
            drawable2.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public /* synthetic */ CatalogListImageFrame(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogListImageFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass0BT.A00((Resources.Theme) null, context.getResources(), R.drawable.album_card_top);
        this.A02 = AnonymousClass0BT.A00((Resources.Theme) null, context.getResources(), R.drawable.album_card_bottom);
        setWillNotDraw(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CatalogListImageFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
