package X;

import android.content.Context;
import android.os.Environment;

/* renamed from: X.3AY  reason: invalid class name */
public final class AnonymousClass3AY {
    public long A00;
    public String A01;
    public final Context A02;
    public final C226515g A03 = new AnonymousClass3MK(this, 2);
    public final C24341Cb A04;
    public final C20060wx A05;
    public final C33761ft A06;
    public final C31211bS A07;

    public AnonymousClass3AY(Context context, C24341Cb r4, C20060wx r5, C33761ft r6, C31211bS r7) {
        C36321k7.A19(r7, r4, r5, r6);
        this.A02 = context;
        this.A07 = r7;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        String externalStorageState = Environment.getExternalStorageState();
        AnonymousClass00C.A08(externalStorageState);
        this.A01 = externalStorageState;
    }
}
