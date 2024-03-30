package com.whatsapp.reactions;

import X.AnonymousClass4UC;
import X.C36381kD;
import X.C36441kJ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.newsletter.ui.reactions.NewsletterReactionEmojiTextView;

public class ReactionEmojiTextView extends TextEmojiLabel implements AnonymousClass4UC {
    public float A00;
    public float A01 = 1.0f;
    public Paint A02;
    public int A03;
    public float A04 = 1.0f;

    public void setBackgroundAlpha(float f) {
        this.A02.setAlpha((int) (f * ((float) this.A03)));
        invalidate();
    }

    public void setBackgroundScale(float f) {
        this.A01 = f;
        invalidate();
    }

    public void setForegroundScale(float f) {
        this.A04 = f;
        invalidate();
    }

    public ReactionEmojiTextView(Context context) {
        super(context);
        A06();
    }

    private void A06() {
        Paint A0K = C36441kJ.A0K();
        this.A02 = A0K;
        C36381kD.A16(getContext(), A0K, R.color.f6nameremoved);
        this.A03 = this.A02.getAlpha();
        boolean z = this instanceof NewsletterReactionEmojiTextView;
        Resources resources = getResources();
        if (z) {
            this.A00 = C36441kJ.A00(resources, R.dimen.f7nameremoved) / 2.0f;
        } else {
            this.A00 = C36441kJ.A00(resources, R.dimen.f7nameremoved) / 2.0f;
        }
    }

    public void onDraw(Canvas canvas) {
        if (isSelected()) {
            canvas.save();
            float pivotX = getPivotX();
            float pivotY = getPivotY();
            float f = this.A01;
            canvas.scale(f, f, pivotX, pivotY);
            canvas.drawCircle(pivotX, pivotY, this.A00, this.A02);
            canvas.restore();
        }
        canvas.save();
        float f2 = this.A04;
        canvas.scale(f2, f2, getPivotX(), getPivotY());
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setForegroundAlpha(float f) {
        getPaint().setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public ReactionEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06();
    }

    public ReactionEmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
    }
}
