package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0Sr  reason: invalid class name and case insensitive filesystem */
public final class C06200Sr {
    public final Executor A00;
    public volatile AnonymousClass0UL A01;
    public volatile Object A02;

    public C06200Sr(Looper looper, Object obj, String str) {
        this.A00 = new C12520iD(looper);
        AnonymousClass006.A02(obj, "Listener must not be null");
        this.A02 = obj;
        AnonymousClass006.A03(str);
        this.A01 = new AnonymousClass0UL(obj, str);
    }
}
