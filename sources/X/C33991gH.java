package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.1gH  reason: invalid class name and case insensitive filesystem */
public abstract class C33991gH extends CharacterStyle implements C33981gG, UpdateAppearance {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public void updateDrawState(TextPaint textPaint) {
        if (this.A00) {
            textPaint.setColor(this.A03);
            textPaint.bgColor = this.A01;
            textPaint.setUnderlineText(true);
            return;
        }
        int i = this.A02;
        if (i == 0) {
            i = textPaint.linkColor;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }

    public C33991gH(int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
    }

    public void BjD(MotionEvent motionEvent, View view) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A04 > 1000) {
                this.A04 = elapsedRealtime;
                if (this.A00) {
                    onClick(view);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A00 = z;
        view.invalidate();
    }

    public C33991gH(Context context, int i) {
        this.A02 = AnonymousClass00F.A00(context, i);
        int A002 = AnonymousClass00F.A00(context, i);
        this.A03 = A002;
        this.A01 = C018107s.A06(A002, 72);
    }

    public C33991gH(Context context) {
        this(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
    }
}
