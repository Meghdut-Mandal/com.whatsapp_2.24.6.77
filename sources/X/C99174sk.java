package X;

import android.app.AppOpsManager;
import android.os.Binder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: X.4sk  reason: invalid class name and case insensitive filesystem */
public final class C99174sk extends C91534cA implements IInterface {
    public volatile int A00;
    public final /* synthetic */ C90754ai A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C99174sk(C90754ai r2) {
        this();
        this.A01 = r2;
        this.A00 = -1;
    }

    public static final boolean A00(C99174sk r8, Object obj, Runnable runnable, String str) {
        if (Log.isLoggable("WearableLS", 3)) {
            Object[] objArr = new Object[3];
            objArr[0] = str;
            C36411kG.A1Q(r8.A01.A00.toString(), obj, objArr, 1);
            Log.d("WearableLS", String.format("%s: %s %s", objArr));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != r8.A00) {
            C90754ai r6 = r8.A01;
            if (C132606Ul.A00(r6).A02()) {
                try {
                    AppOpsManager appOpsManager = (AppOpsManager) C02640Bg.A00(r6).A00.getSystemService("appops");
                    if (appOpsManager != null) {
                        appOpsManager.checkPackage(callingUid, "com.google.android.wearable.app.cn");
                        r8.A00 = callingUid;
                    } else {
                        throw AnonymousClass001.A0A("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                    }
                } catch (SecurityException unused) {
                }
            }
            if (!AnonymousClass0QQ.A00(r6, callingUid)) {
                Log.e("WearableLS", AnonymousClass000.A0r("Caller is not GooglePlayServices; caller UID: ", C90524aI.A0h(57), callingUid));
                return false;
            }
            r8.A00 = callingUid;
        }
        C90754ai r2 = r8.A01;
        synchronized (r2.A07) {
            if (r2.A05) {
                return false;
            }
            r2.A04.post(runnable);
            return true;
        }
    }

    public C99174sk() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }
}
