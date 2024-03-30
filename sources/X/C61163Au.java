package X;

import android.content.Context;
import android.os.Environment;

/* renamed from: X.3Au  reason: invalid class name and case insensitive filesystem */
public final class C61163Au {
    public long A00;
    public String A01;
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final C226515g A04 = new AnonymousClass3MK(this, 1);
    public final C24341Cb A05;
    public final C20060wx A06;
    public final AnonymousClass3A0 A07;
    public final C31211bS A08;
    public final C19770wU A09;

    public C61163Au(Context context, AnonymousClass17Y r4, C24341Cb r5, C20060wx r6, AnonymousClass3A0 r7, C31211bS r8, C19770wU r9) {
        C36321k7.A19(r8, r9, r4, r5);
        AnonymousClass00C.A0D(r6, 6);
        this.A02 = context;
        this.A08 = r8;
        this.A09 = r9;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        String externalStorageState = Environment.getExternalStorageState();
        AnonymousClass00C.A08(externalStorageState);
        this.A01 = externalStorageState;
    }
}
