package X;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.3n7  reason: invalid class name and case insensitive filesystem */
public final class C75373n7 implements AnonymousClass1RM {
    public String A00;
    public final HashMap A01;
    public final Handler A02;

    public C75373n7(Handler handler, HashMap hashMap) {
        AnonymousClass00C.A0D(hashMap, 2);
        this.A02 = handler;
        this.A01 = hashMap;
    }

    public void B6e(AnonymousClass1RT r4) {
        if (r4.A05 == null || this.A00 == null) {
            this.A02.post(new C80293vA(this, r4, 21));
        }
    }
}
