package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.9ik  reason: invalid class name and case insensitive filesystem */
public final class C201079ik {
    public static final List A01 = C36441kJ.A14(50);
    public final Handler A00;

    public static AnonymousClass9QI A00() {
        AnonymousClass9QI r0;
        List list = A01;
        synchronized (list) {
            if (list.isEmpty()) {
                r0 = new AnonymousClass9QI();
            } else {
                r0 = (AnonymousClass9QI) list.remove(C36431kI.A07(list));
            }
        }
        return r0;
    }

    public C201079ik(Handler handler) {
        this.A00 = handler;
    }
}
