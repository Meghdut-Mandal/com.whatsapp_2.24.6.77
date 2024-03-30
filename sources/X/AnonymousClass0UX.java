package X;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: X.0UX  reason: invalid class name */
public class AnonymousClass0UX {
    public AnonymousClass0YF A00;
    public WeakReference A01 = AnonymousClass001.A0F((Object) null);
    public boolean A02 = true;
    public float A03;
    public final TextPaint A04 = new TextPaint(1);
    public final AnonymousClass0UG A05 = new C18260ss(this, 1);

    public float A00(String str) {
        float measureText;
        if (!this.A02) {
            return this.A03;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.A04.measureText(str, 0, str.length());
        }
        this.A03 = measureText;
        this.A02 = false;
        return measureText;
    }

    public void A01(Context context, AnonymousClass0YF r5) {
        if (this.A00 != r5) {
            this.A00 = r5;
            if (r5 != null) {
                TextPaint textPaint = this.A04;
                AnonymousClass0UG r1 = this.A05;
                r5.A05(context, textPaint, r1);
                AnonymousClass08G r0 = (AnonymousClass08G) this.A01.get();
                if (r0 != null) {
                    textPaint.drawableState = r0.getState();
                }
                r5.A04(context, textPaint, r1);
                this.A02 = true;
            }
            AnonymousClass08G r12 = (AnonymousClass08G) this.A01.get();
            if (r12 != null) {
                r12.Bj0();
                r12.onStateChange(r12.getState());
            }
        }
    }

    public AnonymousClass0UX(AnonymousClass08G r3) {
        this.A01 = AnonymousClass001.A0F(r3);
    }
}
