package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.4bv  reason: invalid class name and case insensitive filesystem */
public final class C91384bv extends RippleDrawable {
    public static Method A04;
    public static boolean A05;
    public C133336Xx A00;
    public Integer A01;
    public boolean A02;
    public final boolean A03 = true;

    public C91384bv() {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, new ColorDrawable(-1));
    }

    public final void A00(float f, long j) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= (float) 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long A052 = AnonymousClass6QU.A00(C114185go.A0K[(int) (j & 63)], C133336Xx.A04(j), C133336Xx.A03(j), C133336Xx.A02(j), f);
        C133336Xx r0 = this.A00;
        if (r0 == null || r0.A00 != A052) {
            this.A00 = new C133336Xx(A052);
            setColor(ColorStateList.valueOf(C90514aH.A0D(C133336Xx.A06(C114185go.A0G, A052))));
        }
    }

    public final void A01(int i) {
        Integer num = this.A01;
        if (num == null || num.intValue() != i) {
            Integer valueOf = Integer.valueOf(i);
            this.A01 = valueOf;
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!A05) {
                        A05 = true;
                        A04 = RippleDrawable.class.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE});
                    }
                    Method method = A04;
                    if (method != null) {
                        method.invoke(this, new Object[]{valueOf});
                    }
                } catch (Exception unused) {
                }
            } else {
                AnonymousClass5W9.A00(this, i);
            }
        }
    }

    public Rect getDirtyBounds() {
        if (!this.A03) {
            this.A02 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        AnonymousClass00C.A08(dirtyBounds);
        this.A02 = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.A02;
    }
}
