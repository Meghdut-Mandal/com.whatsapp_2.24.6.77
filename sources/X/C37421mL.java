package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1mL  reason: invalid class name and case insensitive filesystem */
public class C37421mL extends URLSpan implements C33981gG {
    public int A00;
    public int A01;
    public boolean A02;

    public C37421mL(Context context, String str) {
        super(str);
        int A002 = AnonymousClass00F.A00(context, C36341k9.A05(context));
        this.A01 = A002;
        this.A00 = C018107s.A06(A002, 72);
    }

    public void BjD(MotionEvent motionEvent, View view) {
        boolean z = true;
        if (motionEvent.getAction() == 1 && this.A02) {
            onClick(view);
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A02 = z;
        view.invalidate();
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A01);
        if (this.A02) {
            i = this.A00;
        } else {
            i = 0;
        }
        textPaint.bgColor = i;
        textPaint.setUnderlineText(false);
    }
}
