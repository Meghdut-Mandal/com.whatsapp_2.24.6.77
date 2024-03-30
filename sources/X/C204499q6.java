package X;

import android.credentials.CreateCredentialException;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: X.9q6  reason: invalid class name and case insensitive filesystem */
public final class C204499q6 implements OutcomeReceiver {
    public final /* synthetic */ C192779In A00;
    public final /* synthetic */ C207779wy A01;
    public final /* synthetic */ B0O A02;

    public C204499q6(C192779In r1, B0O b0o, C207779wy r3) {
        this.A02 = b0o;
        this.A00 = r1;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        CreateCredentialException createCredentialException = (CreateCredentialException) th;
        AnonymousClass00C.A0D(createCredentialException, 0);
        Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
        this.A02.BWn(C207779wy.A01(createCredentialException));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        r1 = new X.C166907x0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        ((X.C023509x) ((X.C23202B9k) r3).A00).resumeWith(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onResult(java.lang.Object r5) {
        /*
            r4 = this;
            android.credentials.CreateCredentialResponse r5 = (android.credentials.CreateCredentialResponse) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.String r1 = "CredManProvService"
            java.lang.String r0 = "Create Result returned from framework: "
            android.util.Log.i(r1, r0)
            X.B0O r3 = r4.A02
            android.os.Bundle r2 = r5.getData()
            X.AnonymousClass00C.A08(r2)
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0025 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ Exception -> 0x0025 }
            X.7x1 r1 = new X.7x1     // Catch:{ Exception -> 0x0025 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0030
        L_0x0025:
            X.91P r0 = new X.91P     // Catch:{ 91P -> 0x002b }
            r0.<init>()     // Catch:{ 91P -> 0x002b }
            throw r0     // Catch:{ 91P -> 0x002b }
        L_0x002b:
            X.7x0 r1 = new X.7x0
            r1.<init>(r2)
        L_0x0030:
            X.B9k r3 = (X.C23202B9k) r3
            java.lang.Object r0 = r3.A00
            X.09x r0 = (X.C023509x) r0
            r0.resumeWith(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204499q6.onResult(java.lang.Object):void");
    }
}
