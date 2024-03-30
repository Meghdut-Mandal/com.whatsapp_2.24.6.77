package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.0h1  reason: invalid class name and case insensitive filesystem */
public class C11800h1 implements Runnable {
    public Handler A00;
    public AnonymousClass026 A01;
    public Callable A02;

    public void run() {
        Object obj;
        try {
            obj = this.A02.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.A00.post(new C11790h0(this, this.A01, obj));
    }

    public C11800h1(Handler handler, AnonymousClass026 r2, Callable callable) {
        this.A02 = callable;
        this.A01 = r2;
        this.A00 = handler;
    }
}
