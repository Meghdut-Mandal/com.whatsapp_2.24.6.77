package X;

import android.content.Context;

/* renamed from: X.63l  reason: invalid class name and case insensitive filesystem */
public class C1263163l {
    public C130666Ly A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;

    public C122975vj A00() {
        String str;
        C130666Ly r2 = this.A00;
        if (r2 != null) {
            boolean z = this.A03;
            if (!z || ((str = this.A01) != null && str.length() != 0)) {
                return new C122975vj(this.A04, r2, this.A01, z, this.A02);
            }
            throw AnonymousClass001.A08("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        throw AnonymousClass001.A08("Must set a callback to create the configuration.");
    }

    public C1263163l(Context context) {
        this.A04 = context;
    }
}
