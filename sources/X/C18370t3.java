package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.0t3  reason: invalid class name and case insensitive filesystem */
public class C18370t3 implements Callable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C18370t3(Context context, AnonymousClass0U3 r2, String str, int i, int i2) {
        this.A04 = i2;
        this.A03 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        if (this.A04 != 0) {
            try {
                return C07440Xr.A01((Context) this.A01, (AnonymousClass0U3) this.A02, this.A03, this.A00);
            } catch (Throwable unused) {
                return new AnonymousClass0WP(-3);
            }
        } else {
            return C07440Xr.A01((Context) this.A01, (AnonymousClass0U3) this.A02, this.A03, this.A00);
        }
    }
}
