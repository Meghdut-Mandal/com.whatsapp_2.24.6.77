package X;

import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.0Tq  reason: invalid class name and case insensitive filesystem */
public class C06450Tq {
    public final Handler A00;
    public final AnonymousClass0WH A01;

    public void A00(AnonymousClass0WP r5) {
        Handler handler;
        Runnable r1;
        int i = r5.A00;
        if (i == 0) {
            Typeface typeface = r5.A01;
            AnonymousClass0WH r0 = this.A01;
            handler = this.A00;
            r1 = new C11770gy(typeface, r0, this);
        } else {
            AnonymousClass0WH r02 = this.A01;
            handler = this.A00;
            r1 = new C11780gz(r02, this, i);
        }
        handler.post(r1);
    }

    public C06450Tq(Handler handler, AnonymousClass0WH r2) {
        this.A01 = r2;
        this.A00 = handler;
    }
}
