package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.02W  reason: invalid class name */
public final class AnonymousClass02W {
    public static AnonymousClass02W A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass02X A00;

    public synchronized Drawable A03(Context context, int i) {
        return this.A00.A08(context, i);
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter A002;
        synchronized (AnonymousClass02W.class) {
            A002 = AnonymousClass02X.A00(mode, i);
        }
        return A002;
    }

    public static synchronized AnonymousClass02W A01() {
        AnonymousClass02W r0;
        synchronized (AnonymousClass02W.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    public static synchronized void A02() {
        synchronized (AnonymousClass02W.class) {
            if (A01 == null) {
                AnonymousClass02W r1 = new AnonymousClass02W();
                A01 = r1;
                r1.A00 = AnonymousClass02X.A03();
                AnonymousClass02X r12 = A01.A00;
                C004502a r0 = new C004502a();
                synchronized (r12) {
                    r12.A01 = r0;
                }
            }
        }
    }
}
