package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass2M9;
import X.AnonymousClass3UO;
import X.AnonymousClass4I9;
import X.C000800j;
import X.C001400p;
import X.C1898996a;
import X.C36331k8;
import X.C36361kB;
import X.C36401kF;
import X.C36791lJ;
import X.C63873Lt;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class EmojiImageView extends View {
    public int A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    public Paint A01;
    public Drawable A02;
    public boolean A03;
    public int[] A04;
    public final AnonymousClass00T A05 = C001400p.A00(C000800j.NONE, AnonymousClass4I9.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void A00(int[] iArr, Drawable drawable) {
        boolean z = false;
        if (iArr == null) {
            this.A04 = null;
            this.A02 = null;
            this.A03 = false;
            setContentDescription((CharSequence) null);
            return;
        }
        C1898996a.A00(new AnonymousClass2M9(iArr), false);
        this.A04 = iArr;
        if (AnonymousClass3UO.A03(iArr) || AnonymousClass3UO.A02(iArr)) {
            z = true;
        }
        this.A03 = z;
        this.A02 = drawable;
        setContentDescription(C63873Lt.A01(iArr));
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        super.onDraw(canvas);
        if (this.A03) {
            getOutlinePath().reset();
            C36401kF.A13(getOutlinePath(), this);
            C36401kF.A12(getOutlinePath(), this);
            C36361kB.A11(getOutlinePath(), this, (getWidth() * 3) / 4);
            C36361kB.A11(getOutlinePath(), this, (getWidth() * 9) / 10);
            getOutlinePath().setFillType(Path.FillType.WINDING);
            canvas.drawPath(getOutlinePath(), getPaint());
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            int i = this.A00;
            int width = (getWidth() - i) / 2;
            int height = (getHeight() - i) / 2;
            if (drawable instanceof C36791lJ) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(width, height, width + i, i + height);
            }
            drawable.draw(canvas);
        }
    }

    public final void setPaint(Paint paint) {
        AnonymousClass00C.A0D(paint, 0);
        this.A01 = paint;
    }

    private final Path getOutlinePath() {
        return (Path) this.A05.getValue();
    }

    public final Paint getPaint() {
        Paint paint = this.A01;
        if (paint != null) {
            return paint;
        }
        throw C36331k8.A0d("paint");
    }

    public final int[] getEmoji() {
        return this.A04;
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public final void setEmoji(int[] iArr) {
        this.A04 = iArr;
    }

    public final void setEmojiIconSize(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
    }
}
