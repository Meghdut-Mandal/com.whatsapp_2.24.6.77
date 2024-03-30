package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.1p5  reason: invalid class name and case insensitive filesystem */
public abstract class C38511p5 extends LinearLayout {
    public boolean A00;

    public abstract View getPrimaryNameView();

    public abstract View getSecondaryNameView();

    public abstract void setShouldTruncateNameViewWhenNeeded(boolean z);

    public void A00(boolean z) {
        int A0B;
        int A0B2;
        View view = (View) getParent();
        if (view != null) {
            View secondaryNameView = getSecondaryNameView();
            layout(view.getPaddingLeft(), view.getPaddingTop(), AnonymousClass000.A0B(view), view.getPaddingTop() + getMeasuredHeight());
            int top = secondaryNameView.getTop();
            int bottom = secondaryNameView.getBottom();
            if (z) {
                A0B = getPaddingLeft();
                A0B2 = getPaddingLeft() + secondaryNameView.getWidth();
            } else {
                A0B = AnonymousClass000.A0B(this) - secondaryNameView.getWidth();
                A0B2 = AnonymousClass000.A0B(this);
            }
            secondaryNameView.layout(A0B, top, A0B2, bottom);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        View childAt = getChildAt(0);
        View secondaryNameView = getSecondaryNameView();
        if (childAt == null || secondaryNameView == null) {
            C18740tg.A0D(false, "ConversationRowParticipantHeaderBaseView should have both primary and secondary name views.");
        } else if (!this.A00) {
        } else {
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int A09 = AnonymousClass000.A09(this);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int i3 = 0;
                if (secondaryNameView.getVisibility() != 8) {
                    AnonymousClass000.A16(secondaryNameView, measuredHeight - paddingTop, Integer.MIN_VALUE, View.MeasureSpec.makeMeasureSpec(measuredWidth - A09, Integer.MIN_VALUE));
                    i3 = secondaryNameView.getMeasuredWidth();
                }
                AnonymousClass000.A16(childAt, measuredHeight - paddingTop, Integer.MIN_VALUE, View.MeasureSpec.makeMeasureSpec(Math.max((measuredWidth - i3) - A09, 0), Integer.MIN_VALUE));
            }
        }
    }

    public C38511p5(Context context) {
        super(context);
    }

    public C38511p5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C38511p5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
