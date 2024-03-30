package com.whatsapp.reactions;

import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass0BT;
import X.AnonymousClass4UC;
import X.C18740tg;
import X.C33521fV;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ReactionPlusView extends View implements AnonymousClass4UC {
    public float A00;
    public float A01 = 0.625f;
    public float A02 = 1.0f;
    public int A03;
    public int A04;
    public Drawable A05;
    public final Paint A06 = C36371kC.A0E();

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float pivotX = getPivotX();
        float pivotY = getPivotY();
        float f = this.A01;
        canvas.scale(f, f, pivotX, pivotY);
        float A002 = C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
        float A003 = C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
        float f2 = this.A00;
        canvas.drawRoundRect(0.0f, 0.0f, A003, A002, f2, f2, this.A06);
        canvas.restore();
        canvas.save();
        float f3 = this.A02;
        canvas.scale(f3, f3, pivotX, pivotY);
        this.A05.draw(canvas);
        canvas.restore();
    }

    public void setBackgroundAlpha(float f) {
        this.A06.setAlpha((int) (((float) this.A03) * f));
        invalidate();
    }

    public void setBackgroundScale(float f) {
        this.A01 = f * 0.625f;
        invalidate();
    }

    public void setForegroundAlpha(float f) {
        this.A05.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public void setForegroundScale(float f) {
        this.A02 = f;
        invalidate();
    }

    public ReactionPlusView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        this.A04 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00 = C36441kJ.A00(getResources(), R.dimen.f7nameremoved) / 2.0f;
        Drawable A002 = AnonymousClass0BT.A00(C36361kB.A09(this), getResources(), R.drawable.ic_reactions_plus);
        C18740tg.A06(A002);
        this.A05 = A002;
        Drawable A012 = AnonymousClass08I.A01(A002);
        this.A05 = A012;
        AnonymousClass076.A06(A012, C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        Paint paint = this.A06;
        C36381kD.A16(getContext(), paint, R.color.f6nameremoved);
        this.A03 = paint.getAlpha();
        C33521fV.A02(this);
        C36331k8.A0q(getContext(), this, R.string.f12nameremoved);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        int i6 = i2 / 2;
        int i7 = this.A04 / 2;
        this.A05.setBounds(i5 - i7, i6 - i7, i5 + i7, i6 + i7);
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public ReactionPlusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
