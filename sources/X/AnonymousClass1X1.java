package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.1X1  reason: invalid class name */
public final class AnonymousClass1X1 {
    public final C26151Jb A00;
    public final C19970wo A01;
    public final C21010yW A02;
    public final HashMap A03 = new HashMap();

    public AnonymousClass1X1(C19970wo r2, C26151Jb r3, C21010yW r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            this.A00.A00(C188648zz.A0F, (String) null);
        }
        hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void A01(String str, String str2) {
        AnonymousClass00C.A0D(str, 0);
        HashMap hashMap = this.A03;
        Number number = (Number) hashMap.get(str);
        if (number == null) {
            this.A00.A00(C188648zz.A0G, (String) null);
            return;
        }
        hashMap.remove(str);
        AnonymousClass135 r4 = new AnonymousClass135();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        r4.A02 = sb.toString();
        r4.A00 = Long.valueOf(SystemClock.elapsedRealtime() - number.longValue());
        this.A02.Bly(r4);
    }
}
