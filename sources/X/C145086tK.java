package X;

import java.io.File;
import java.util.Collections;

/* renamed from: X.6tK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145086tK implements AnonymousClass7gU {
    public final /* synthetic */ AnonymousClass1Q9 A00;
    public final /* synthetic */ C158587hk A01;
    public final /* synthetic */ File A02;

    public /* synthetic */ C145086tK(AnonymousClass1Q9 r1, C158587hk r2, File file) {
        this.A00 = r1;
        this.A02 = file;
        this.A01 = r2;
    }

    public final C131006Ni Boj() {
        AnonymousClass1Q9 r3 = this.A00;
        File file = this.A02;
        C158587hk r2 = this.A01;
        r3.A0L.A00();
        r3.A0J.A02();
        return AnonymousClass1Q9.A01(r3, r2, Collections.singletonList(file), 100);
    }
}
