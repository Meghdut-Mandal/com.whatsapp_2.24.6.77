package X;

import java.util.UUID;

/* renamed from: X.1hU  reason: invalid class name and case insensitive filesystem */
public final class C34691hU {
    public UUID A00;
    public boolean A01 = true;
    public final C21010yW A02;

    public C34691hU(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
    }

    public static final AnonymousClass2RE A00(C34691hU r2) {
        String str;
        AnonymousClass2RE r1 = new AnonymousClass2RE();
        UUID uuid = r2.A00;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        r1.A05 = str;
        return r1;
    }
}
