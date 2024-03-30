package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.9TN  reason: invalid class name */
public abstract class AnonymousClass9TN {
    public final /* synthetic */ AnonymousClass9p5 A00;

    public AnonymousClass9TN(AnonymousClass9p5 r1) {
        this.A00 = r1;
    }

    public void A00(String str) {
        float f;
        C198179d2 r0;
        AnonymousClass826 r3;
        String str2 = str;
        if (this instanceof AnonymousClass827) {
            AnonymousClass827 r2 = (AnonymousClass827) this;
            r2.A00 += r2.A01.A02.A00.measureText(str);
        } else if (this instanceof AnonymousClass82A) {
            AnonymousClass82A r4 = (AnonymousClass82A) this;
            AnonymousClass9p5 r5 = r4.A03;
            if (AnonymousClass9p5.A0p(r5)) {
                Rect rect = new Rect();
                r5.A02.A00.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(r4.A00, r4.A01);
                r4.A02.union(rectF);
            }
            r4.A00 += r5.A02.A00.measureText(str);
        } else if (this instanceof AnonymousClass829) {
            AnonymousClass829 r22 = (AnonymousClass829) this;
            AnonymousClass9p5 r32 = r22.A03;
            if (AnonymousClass9p5.A0p(r32)) {
                Path A0M = C36441kJ.A0M();
                r32.A02.A00.getTextPath(str2, 0, str.length(), r22.A00, r22.A01, A0M);
                r22.A02.addPath(A0M);
            }
            r22.A00 += r32.A02.A00.measureText(str);
        } else {
            AnonymousClass828 r33 = (AnonymousClass828) this;
            if (r33 instanceof AnonymousClass826) {
                AnonymousClass826 r34 = (AnonymousClass826) r33;
                AnonymousClass9p5 r23 = r34.A01;
                if (AnonymousClass9p5.A0p(r23)) {
                    C198179d2 r1 = r23.A02;
                    if (r1.A05) {
                        r23.A00.drawTextOnPath(str2, r34.A00, r34.A00, r34.A01, r1.A00);
                    }
                    C198179d2 r12 = r23.A02;
                    if (r12.A06) {
                        r23.A00.drawTextOnPath(str2, r34.A00, r34.A00, r34.A01, r12.A01);
                    }
                }
                f = r34.A00;
                r0 = r23.A02;
                r3 = r34;
            } else {
                AnonymousClass9p5 r6 = r33.A02;
                if (AnonymousClass9p5.A0p(r6)) {
                    C198179d2 r52 = r6.A02;
                    if (r52.A05) {
                        r6.A00.drawText(str, r33.A00, r33.A01, r52.A00);
                    }
                    C198179d2 r53 = r6.A02;
                    if (r53.A06) {
                        r6.A00.drawText(str, r33.A00, r33.A01, r53.A01);
                    }
                }
                f = r33.A00;
                r0 = r6.A02;
                r3 = r33;
            }
            r3.A00 = f + r0.A00.measureText(str);
        }
    }
}
