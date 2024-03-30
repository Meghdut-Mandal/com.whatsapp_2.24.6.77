package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.04j  reason: invalid class name and case insensitive filesystem */
public class C010404j {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public ColorStateList A01(int i) {
        int resourceId;
        ColorStateList A002;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A002 = C013105r.A00(this.A01, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A002;
    }

    public Drawable A02(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return AnonymousClass02X.A03().A08(this.A01, resourceId);
    }

    public Drawable A03(int i) {
        int resourceId;
        Drawable A09;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        AnonymousClass02W A012 = AnonymousClass02W.A01();
        Context context = this.A01;
        synchronized (A012) {
            A09 = A012.A00.A09(context, resourceId, true);
        }
        return A09;
    }

    public C010404j(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static C010404j A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C010404j(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
