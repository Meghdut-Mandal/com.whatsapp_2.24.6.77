package X;

import android.graphics.Typeface;

/* renamed from: X.0gy  reason: invalid class name and case insensitive filesystem */
public class C11770gy implements Runnable {
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ AnonymousClass0WH A01;
    public final /* synthetic */ C06450Tq A02;

    public C11770gy(Typeface typeface, AnonymousClass0WH r2, C06450Tq r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = typeface;
    }

    public void run() {
        AnonymousClass0WH r0 = this.A01;
        Typeface typeface = this.A00;
        AnonymousClass071 r02 = r0.A00;
        if (r02 != null) {
            r02.A02(typeface);
        }
    }
}
