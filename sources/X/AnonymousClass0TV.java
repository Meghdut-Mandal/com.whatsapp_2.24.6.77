package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;

/* renamed from: X.0TV  reason: invalid class name */
public final class AnonymousClass0TV {
    public final Paint A00;
    public final C07090Wh A01;
    public final C07090Wh A02;
    public final C07090Wh A03;
    public final C07090Wh A04;
    public final C07090Wh A05;
    public final C07090Wh A06;
    public final C07090Wh A07;

    public AnonymousClass0TV(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C014506h.A02(context, MaterialCalendar.class.getCanonicalName(), R.attr.f4nameremoved).data, C27931Qk.A0K);
        this.A01 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(3, 0));
        this.A02 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(1, 0));
        this.A03 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(2, 0));
        this.A05 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList A002 = AnonymousClass061.A00(context, obtainStyledAttributes, 6);
        this.A07 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(8, 0));
        this.A04 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(7, 0));
        this.A06 = C07090Wh.A00(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(A002.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
