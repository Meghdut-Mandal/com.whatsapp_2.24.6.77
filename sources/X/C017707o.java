package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: X.07o  reason: invalid class name and case insensitive filesystem */
public class C017707o extends Property {
    public Rect A00 = new Rect();

    public C017707o() {
        super(PointF.class, "boundsOrigin");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        Rect rect = this.A00;
        ((Drawable) obj).copyBounds(rect);
        return new PointF((float) rect.left, (float) rect.top);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.A00;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
