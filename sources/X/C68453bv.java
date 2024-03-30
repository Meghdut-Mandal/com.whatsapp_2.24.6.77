package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.3bv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68453bv implements AnonymousClass7fA {
    public static final /* synthetic */ C68453bv A00 = new C68453bv();

    public final Object apply(Object obj) {
        RectF rectF = (RectF) obj;
        float min = Math.min(rectF.width(), rectF.height());
        float width = (rectF.width() - min) * 0.5f;
        float height = (rectF.height() - min) * 0.5f;
        rectF.set(rectF.left + width, rectF.top + height, rectF.right - width, rectF.bottom - height);
        Path A0M = C36441kJ.A0M();
        A0M.addOval(rectF, Path.Direction.CW);
        A0M.close();
        return A0M;
    }
}
