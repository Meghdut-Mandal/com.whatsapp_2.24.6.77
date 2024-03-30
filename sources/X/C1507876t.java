package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.76t  reason: invalid class name and case insensitive filesystem */
public final class C1507876t implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C130326Kq A03;
    public final /* synthetic */ C128096Aw A04;
    public final /* synthetic */ Object A05;

    public C1507876t(Context context, C130326Kq r2, C128096Aw r3, Object obj, int i, long j) {
        this.A02 = context;
        this.A04 = r3;
        this.A05 = obj;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return C130326Kq.A04.A02(this.A02, this.A03, this.A04, this.A05, this.A00, this.A01);
    }
}
