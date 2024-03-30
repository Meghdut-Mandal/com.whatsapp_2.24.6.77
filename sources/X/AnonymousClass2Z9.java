package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.2Z9  reason: invalid class name */
public abstract class AnonymousClass2Z9 extends AnonymousClass22k implements TextWatcher {
    public Handler A00 = C36341k9.A0H();
    public boolean A01;
    public boolean A02;
    public float A03;
    public int A04;
    public int A05;
    public Runnable A06 = new C81123wV((Object) this, 41);
    public boolean A07 = false;
    public final Paint A08 = C36371kC.A0E();
    public final RectF A09 = C36441kJ.A0N();

    public abstract void afterTextChanged(Editable editable);

    public abstract void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    public abstract int getCursorColor();

    public abstract int getCursorVerticalPadding();

    public abstract int getCursorWidth();

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setCustomCursorEnabled(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            Handler handler = this.A00;
            Runnable runnable = this.A06;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            boolean z2 = !z;
            setFocusable(z2);
            setCursorVisible(z2);
            if (z) {
                addTextChangedListener(this);
            } else {
                removeTextChangedListener(this);
            }
        }
    }

    public void setHasFocus(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            Handler handler = this.A00;
            Runnable runnable = this.A06;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
            C160147kX r1 = paymentAmountInputField.A0B;
            if (r1 != null) {
                Editable text = paymentAmountInputField.getText();
                C18740tg.A06(text);
                r1.BYE(text.toString(), z);
            }
        }
    }

    public AnonymousClass2Z9(Context context) {
        super(context);
        A02();
    }

    private void A02() {
        this.A05 = getCursorWidth();
        this.A04 = getCursorVerticalPadding();
        Paint paint = this.A08;
        C36431kI.A1L(paint);
        paint.setColor(getCursorColor());
    }

    public boolean hasFocus() {
        return this.A01;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A07 && this.A02) {
            RectF rectF = this.A09;
            float f = this.A03;
            rectF.set(f, (float) this.A04, ((float) this.A05) + f, (float) (getHeight() - this.A04));
            canvas.drawRect(rectF, this.A08);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (getText() == null || TextUtils.isEmpty(C36361kB.A0n(this))) {
            this.A03 = 0.0f;
        } else {
            PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
            float A022 = PaymentAmountInputField.A02(paymentAmountInputField, C36361kB.A0n(this), paymentAmountInputField.getTextSize());
            this.A03 = A022;
            if (this.A07) {
                i3 = this.A05;
            } else {
                i3 = 0;
            }
            i = View.MeasureSpec.makeMeasureSpec((int) (A022 + ((float) i3) + ((float) getPaddingLeft()) + ((float) getPaddingRight())), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public AnonymousClass2Z9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public AnonymousClass2Z9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }
}
