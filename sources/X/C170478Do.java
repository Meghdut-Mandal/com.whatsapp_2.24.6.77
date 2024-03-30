package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.8Do  reason: invalid class name and case insensitive filesystem */
public final class C170478Do extends AnonymousClass8BO {
    public final B54 A00 = new C170448Dl(this);
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;

    public final /* bridge */ /* synthetic */ C16780q5 A03(Status status) {
        return new A49(status, (C169878Ba) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170478Do(AnonymousClass0XK r2, String str, byte[] bArr) {
        super(r2);
        this.A02 = bArr;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A0A(X.C15900oC r8) {
        /*
            r7 = this;
            X.8BU r8 = (X.AnonymousClass8BU) r8
            X.B54 r6 = r7.A00
            byte[] r5 = r7.A02
            java.lang.String r4 = r7.A01
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0033
            java.lang.String r3 = "com.google.android.safetynet.ATTEST_API_KEY"
            java.lang.String r4 = ""
            android.content.Context r0 = r8.A00     // Catch:{ NameNotFoundException -> 0x0033 }
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0033 }
            if (r2 == 0) goto L_0x0033
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0033 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r0.get(r3)     // Catch:{ NameNotFoundException -> 0x0033 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NameNotFoundException -> 0x0033 }
            if (r0 == 0) goto L_0x0033
            r4 = r0
        L_0x0033:
            android.os.IInterface r2 = r8.A04()
            X.9q0 r2 = (X.C204439q0) r2
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r1.writeInterfaceToken(r0)
            if (r6 != 0) goto L_0x0045
            r6 = 0
        L_0x0045:
            r1.writeStrongBinder(r6)
            r1.writeByteArray(r5)
            r1.writeString(r4)
            r0 = 7
            r2.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170478Do.A0A(X.0oC):void");
    }
}
