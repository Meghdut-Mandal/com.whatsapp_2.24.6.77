package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.06u  reason: invalid class name and case insensitive filesystem */
public class C015706u {
    public C015806v A00;
    public C015806v A01;
    public C015806v A02;
    public int A03 = -1;
    public final View A04;
    public final AnonymousClass02W A05;

    public void A01() {
        this.A03 = -1;
        this.A01 = null;
        A00();
        A00();
    }

    public void A00() {
        View view = this.A04;
        Drawable background = view.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.A01 != null) {
                C015806v r2 = this.A02;
                if (r2 == null) {
                    r2 = new C015806v();
                    this.A02 = r2;
                }
                r2.A00 = null;
                r2.A02 = false;
                r2.A01 = null;
                r2.A03 = false;
                ColorStateList A012 = C011004s.A01(view);
                if (A012 != null) {
                    r2.A02 = true;
                    r2.A00 = A012;
                }
                PorterDuff.Mode A022 = C011004s.A02(view);
                if (A022 != null) {
                    r2.A03 = true;
                    r2.A01 = A022;
                }
                if (r2.A02 || r2.A03) {
                    AnonymousClass02X.A05(background, r2, view.getDrawableState());
                    return;
                }
            }
            C015806v r1 = this.A00;
            if (r1 != null || (r1 = this.A01) != null) {
                AnonymousClass02X.A05(background, r1, view.getDrawableState());
            }
        }
    }

    public void A02(int i) {
        ColorStateList A07;
        this.A03 = i;
        AnonymousClass02W r2 = this.A05;
        if (r2 != null) {
            Context context = this.A04.getContext();
            synchronized (r2) {
                A07 = r2.A00.A07(context, i);
            }
            if (A07 != null) {
                C015806v r1 = this.A01;
                if (r1 == null) {
                    r1 = new C015806v();
                    this.A01 = r1;
                }
                r1.A00 = A07;
                r1.A02 = true;
                A00();
                A00();
            }
        }
        this.A01 = null;
        A00();
        A00();
    }

    public void A03(ColorStateList colorStateList) {
        C015806v r1 = this.A00;
        if (r1 == null) {
            r1 = new C015806v();
            this.A00 = r1;
        }
        r1.A00 = colorStateList;
        r1.A02 = true;
        A00();
    }

    public void A04(PorterDuff.Mode mode) {
        C015806v r1 = this.A00;
        if (r1 == null) {
            r1 = new C015806v();
            this.A00 = r1;
        }
        r1.A01 = mode;
        r1.A03 = true;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.view.View r7 = r10.A04
            android.content.Context r2 = r7.getContext()
            int[] r8 = X.AnonymousClass1MJ.A0P
            r1 = 0
            r6 = r11
            r9 = r12
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r11, r8, r12, r1)
            X.04j r3 = new X.04j
            r3.<init>(r2, r0)
            android.content.Context r4 = r7.getContext()
            android.content.res.TypedArray r5 = r3.A02
            X.C012005e.A0E(r4, r5, r6, r7, r8, r9)
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0053
            r0 = -1
            int r0 = r5.getResourceId(r1, r0)     // Catch:{ all -> 0x007a }
            r10.A03 = r0     // Catch:{ all -> 0x007a }
            X.02W r4 = r10.A05     // Catch:{ all -> 0x007a }
            android.content.Context r2 = r7.getContext()     // Catch:{ all -> 0x007a }
            int r1 = r10.A03     // Catch:{ all -> 0x007a }
            monitor-enter(r4)     // Catch:{ all -> 0x007a }
            X.02X r0 = r4.A00     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r0 = r0.A07(r2, r1)     // Catch:{ all -> 0x003d }
            monitor-exit(r4)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0053
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007a }
        L_0x0040:
            X.06v r1 = r10.A01     // Catch:{ all -> 0x007a }
            if (r1 != 0) goto L_0x004b
            X.06v r1 = new X.06v     // Catch:{ all -> 0x007a }
            r1.<init>()     // Catch:{ all -> 0x007a }
            r10.A01 = r1     // Catch:{ all -> 0x007a }
        L_0x004b:
            r1.A00 = r0     // Catch:{ all -> 0x007a }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x007a }
            r10.A00()     // Catch:{ all -> 0x007a }
        L_0x0053:
            r1 = 1
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0061
            android.content.res.ColorStateList r0 = r3.A01(r1)     // Catch:{ all -> 0x007a }
            X.C012005e.A0F(r0, r7)     // Catch:{ all -> 0x007a }
        L_0x0061:
            r0 = 2
            boolean r0 = r5.hasValue(r0)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0076
            r1 = 2
            r0 = -1
            int r1 = r5.getInt(r1, r0)     // Catch:{ all -> 0x007a }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C010504k.A00(r0, r1)     // Catch:{ all -> 0x007a }
            X.C012005e.A0H(r0, r7)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.recycle()
            return
        L_0x007a:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015706u.A05(android.util.AttributeSet, int):void");
    }

    public C015706u(View view) {
        this.A04 = view;
        this.A05 = AnonymousClass02W.A01();
    }
}
