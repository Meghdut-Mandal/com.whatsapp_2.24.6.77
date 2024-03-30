package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.6Lf  reason: invalid class name and case insensitive filesystem */
public final class C130476Lf {
    @Deprecated
    public static final C06190Sq A07;
    public static final AnonymousClass0JC A08;
    public static final AnonymousClass0QI A09;
    public AnonymousClass90D A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass7cM A03;
    public final AnonymousClass7cN A04;
    public final C15960oK A05;
    public final String A06;

    static {
        AnonymousClass0QI r3 = new AnonymousClass0QI();
        A09 = r3;
        AnonymousClass8B8 r2 = new AnonymousClass8B8();
        A08 = r2;
        A07 = new C06190Sq(r2, r3, "ClearcutLogger.API");
    }

    public C130476Lf(Context context) {
        C98764rz r7 = new C98764rz(context);
        C10470eI r6 = C10470eI.A00;
        A3A a3a = new A3A(context);
        AnonymousClass90D r4 = AnonymousClass90D.DEFAULT;
        this.A00 = r4;
        this.A02 = context;
        this.A06 = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.A01 = i;
        this.A04 = r7;
        this.A05 = r6;
        this.A00 = r4;
        this.A03 = a3a;
    }
}
