package X;

import java.util.Map;

/* renamed from: X.6p6  reason: invalid class name and case insensitive filesystem */
public final class C142576p6 implements C159167iv {
    public final /* synthetic */ C594233w A00;
    public final /* synthetic */ AnonymousClass71C A01;

    public C142576p6(C594233w r1, AnonymousClass71C r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BXR(Map map) {
        AnonymousClass71C r2 = this.A01;
        r2.A00.A0H(new C1503574y(r2, this.A00, map, "error", 24));
    }

    public void onSuccess() {
        AnonymousClass71C r2 = this.A01;
        r2.A00.A0H(new C1503574y(r2, this.A00, C000400e.A0D(), "success", 24));
    }
}
