package X;

import java.util.List;

/* renamed from: X.6jk  reason: invalid class name and case insensitive filesystem */
public class C139386jk implements AnonymousClass7eW {
    public final AnonymousClass7eW A00;
    public final AnonymousClass7eW A01;
    public final List A02;
    public final /* synthetic */ C139556k5 A03;

    public C139386jk(C139556k5 r1, AnonymousClass7eW r2, AnonymousClass7eW r3, List list) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = list;
    }

    public boolean cancel() {
        boolean z;
        synchronized (this.A03.A08) {
            z = false;
            AnonymousClass7eW r0 = this.A01;
            if (r0 != null) {
                z = false | r0.cancel();
            }
            AnonymousClass7eW r02 = this.A00;
            if (r02 != null) {
                z |= r02.cancel();
            }
        }
        return z;
    }
}
