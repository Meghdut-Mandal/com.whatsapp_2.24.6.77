package X;

import android.content.Context;
import java.util.concurrent.Executors;

/* renamed from: X.9DB  reason: invalid class name */
public final class AnonymousClass9DB {
    public final C133076Wo A00;

    public static AnonymousClass9DB A00(Context context) {
        AnonymousClass9GV r1 = new AnonymousClass9GV(context);
        C133076Wo A01 = new C201189j2(r1.A01, Executors.newSingleThreadExecutor(), new BAS(r1, 0)).A01();
        AnonymousClass00C.A08(A01);
        return new AnonymousClass9DB(A01);
    }

    public AnonymousClass9DB(C133076Wo r1) {
        this.A00 = r1;
    }
}
