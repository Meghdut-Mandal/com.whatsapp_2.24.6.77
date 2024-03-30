package X;

import android.graphics.Path;
import android.graphics.RectF;
import com.whatsapp.R;

/* renamed from: X.3bt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68433bt implements AnonymousClass7fA {
    public final /* synthetic */ AnonymousClass2YX A00;

    public /* synthetic */ C68433bt(AnonymousClass2YX r1) {
        this.A00 = r1;
    }

    public final Object apply(Object obj) {
        AnonymousClass2YX r0 = this.A00;
        RectF rectF = (RectF) obj;
        C36321k7.A0w(r0, rectF);
        float A002 = C36441kJ.A00(r0.getResources(), R.dimen.f7nameremoved);
        Path A0M = C36441kJ.A0M();
        A0M.moveTo(rectF.left, rectF.bottom);
        A0M.lineTo(rectF.left, rectF.top + A002);
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = ((float) 2) * A002;
        A0M.arcTo(new RectF(f, f2, f + f3, f2 + f3), 180.0f, 90.0f);
        A0M.lineTo(rectF.right - A002, rectF.top);
        float f4 = rectF.right;
        float f5 = rectF.top;
        A0M.addArc(new RectF(f4 - f3, f5, f4, f5 + f3), 270.0f, 90.0f);
        A0M.lineTo(rectF.right, rectF.bottom);
        A0M.lineTo(rectF.left, rectF.bottom);
        A0M.close();
        return A0M;
    }
}
