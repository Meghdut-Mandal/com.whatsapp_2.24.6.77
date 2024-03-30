package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;

/* renamed from: X.0Wh  reason: invalid class name and case insensitive filesystem */
public final class C07090Wh {
    public final ColorStateList A00;
    public final ColorStateList A01;
    public final ColorStateList A02;
    public final Rect A03;
    public final AnonymousClass06J A04;

    public static C07090Wh A00(Context context, int i) {
        AnonymousClass0YM.A03(AnonymousClass000.A1P(i), "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C27931Qk.A0L);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList A002 = AnonymousClass061.A00(context, obtainStyledAttributes, 4);
        ColorStateList A003 = AnonymousClass061.A00(context, obtainStyledAttributes, 9);
        ColorStateList A004 = AnonymousClass061.A00(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        AnonymousClass06J r9 = new AnonymousClass06J(AnonymousClass06J.A03(context, new AnonymousClass06P((float) 0), obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
        obtainStyledAttributes.recycle();
        return new C07090Wh(A002, A003, A004, rect, r9);
    }

    public C07090Wh(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, Rect rect, AnonymousClass06J r6) {
        AnonymousClass0YM.A00(rect.left);
        AnonymousClass0YM.A00(rect.top);
        AnonymousClass0YM.A00(rect.right);
        AnonymousClass0YM.A00(rect.bottom);
        this.A03 = rect;
        this.A02 = colorStateList2;
        this.A00 = colorStateList;
        this.A01 = colorStateList3;
        this.A04 = r6;
    }
}
