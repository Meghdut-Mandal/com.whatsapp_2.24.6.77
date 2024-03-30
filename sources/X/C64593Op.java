package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.3Op  reason: invalid class name and case insensitive filesystem */
public class C64593Op {
    public int A00;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public C64593Op() {
    }

    public C64593Op(Context context) {
        this.A00 = 0;
        this.A03 = context.getApplicationContext();
    }
}
