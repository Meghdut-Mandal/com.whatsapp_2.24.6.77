package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.63G  reason: invalid class name */
public final class AnonymousClass63G {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ C98134qw A03;

    public AnonymousClass63G(C98134qw r1) {
        this.A03 = r1;
    }

    public final void A00() {
        int i;
        Canvas canvas;
        if (this.A02 != null) {
            int i2 = this.A00;
            C98134qw r5 = this.A03;
            int length = r5.A04.length;
            while (true) {
                if (i2 >= length) {
                    i = this.A01;
                    break;
                }
                C123045vq r3 = r5.A04[i2];
                if (r3 != null) {
                    if (r3.A01.A06.A02 == C023109s.A01) {
                        i = i2 + 1;
                        break;
                    } else if (r3.A02 && (canvas = this.A02) != null) {
                        Object obj = r3.A04;
                        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                        ((Drawable) obj).draw(canvas);
                    }
                }
                i2++;
            }
            this.A00 = i;
        }
    }
}
