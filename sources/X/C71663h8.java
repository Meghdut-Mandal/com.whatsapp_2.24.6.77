package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.3h8  reason: invalid class name and case insensitive filesystem */
public final class C71663h8 implements AnonymousClass7gT {
    public final Context A00;
    public final AnonymousClass6HH A01;

    public void Bcw(AnonymousClass591 r2) {
        AnonymousClass00C.A0D(r2, 0);
        PackageManager packageManager = this.A00.getPackageManager();
        AnonymousClass00C.A08(packageManager);
        Integer A002 = AnonymousClass6HH.A00(packageManager);
        if (A002 != null) {
            r2.A0x = C36441kJ.A0y(A002.intValue());
        }
    }

    public C71663h8(Context context, AnonymousClass6HH r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
