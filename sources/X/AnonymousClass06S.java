package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.06S  reason: invalid class name */
public class AnonymousClass06S {
    public C015806v A00;
    public C015806v A01;
    public final ImageView A02;

    public void A01() {
        ImageView imageView = this.A02;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C010504k.A02(drawable);
            if (Build.VERSION.SDK_INT <= 21) {
                C015806v r2 = this.A01;
                if (r2 == null) {
                    r2 = new C015806v();
                    this.A01 = r2;
                }
                r2.A00 = null;
                r2.A02 = false;
                r2.A01 = null;
                r2.A03 = false;
                ColorStateList A002 = AnonymousClass06U.A00(imageView);
                if (A002 != null) {
                    r2.A02 = true;
                    r2.A00 = A002;
                }
                PorterDuff.Mode A003 = A00(imageView);
                if (A003 != null) {
                    r2.A03 = true;
                    r2.A01 = A003;
                }
                if (r2.A02 || r2.A03) {
                    AnonymousClass02X.A05(drawable, r2, imageView.getDrawableState());
                    return;
                }
            }
            C015806v r1 = this.A00;
            if (r1 != null) {
                AnonymousClass02X.A05(drawable, r1, imageView.getDrawableState());
            }
        }
    }

    public void A02(int i) {
        Drawable drawable;
        ImageView imageView = this.A02;
        if (i != 0) {
            drawable = AnonymousClass02X.A03().A08(imageView.getContext(), i);
            if (drawable != null) {
                C010504k.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046 A[Catch:{ all -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[Catch:{ all -> 0x0065 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.ImageView r8 = r11.A02
            android.content.Context r1 = r8.getContext()
            int[] r9 = X.AnonymousClass1MJ.A05
            r0 = 0
            r7 = r12
            r10 = r13
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r12, r9, r13, r0)
            X.04j r4 = new X.04j
            r4.<init>(r1, r0)
            android.content.Context r5 = r8.getContext()
            android.content.res.TypedArray r6 = r4.A02
            X.C012005e.A0E(r5, r6, r7, r8, r9, r10)
            android.graphics.drawable.Drawable r0 = r8.getDrawable()     // Catch:{ all -> 0x0065 }
            r3 = -1
            if (r0 != 0) goto L_0x003c
            r0 = 1
            int r2 = r6.getResourceId(r0, r3)     // Catch:{ all -> 0x0065 }
            if (r2 == r3) goto L_0x003f
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x0065 }
            X.02X r0 = X.AnonymousClass02X.A03()     // Catch:{ all -> 0x0065 }
            android.graphics.drawable.Drawable r0 = r0.A08(r1, r2)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x003f
            r8.setImageDrawable(r0)     // Catch:{ all -> 0x0065 }
        L_0x003c:
            X.C010504k.A02(r0)     // Catch:{ all -> 0x0065 }
        L_0x003f:
            r1 = 2
            boolean r0 = r6.hasValue(r1)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x004d
            android.content.res.ColorStateList r0 = r4.A01(r1)     // Catch:{ all -> 0x0065 }
            X.AnonymousClass06T.A00(r0, r8)     // Catch:{ all -> 0x0065 }
        L_0x004d:
            r0 = 3
            boolean r0 = r6.hasValue(r0)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0061
            r0 = 3
            int r1 = r6.getInt(r0, r3)     // Catch:{ all -> 0x0065 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C010504k.A00(r0, r1)     // Catch:{ all -> 0x0065 }
            X.AnonymousClass06T.A01(r0, r8)     // Catch:{ all -> 0x0065 }
        L_0x0061:
            r6.recycle()
            return
        L_0x0065:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06S.A03(android.util.AttributeSet, int):void");
    }

    public AnonymousClass06S(ImageView imageView) {
        this.A02 = imageView;
    }

    public static PorterDuff.Mode A00(ImageView imageView) {
        return imageView.getImageTintMode();
    }
}
