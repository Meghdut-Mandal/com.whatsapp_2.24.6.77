package X;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: X.80k  reason: invalid class name and case insensitive filesystem */
public final class C1683880k extends C1683980l {
    public final ConnectivityManager A00;

    public C1683880k(Context context, AnonymousClass7eB r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }
}
