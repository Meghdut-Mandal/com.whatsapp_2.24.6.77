package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* renamed from: X.5vo  reason: invalid class name and case insensitive filesystem */
public final class C123025vo {
    public final Bitmap.Config A00;
    public final SparseArray A01 = new SparseArray();
    public final C1263563p A02;
    public final AnonymousClass6NZ A03;
    public final ExecutorService A04;

    public C123025vo(Bitmap.Config config, C1263563p r3, AnonymousClass6NZ r4, ExecutorService executorService) {
        AnonymousClass00C.A0D(r4, 1);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = config;
        this.A04 = executorService;
    }
}
