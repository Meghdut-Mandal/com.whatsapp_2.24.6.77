package X;

import android.app.Notification;
import com.whatsapp.voipcalling.CallInfo;
import java.util.concurrent.Callable;

/* renamed from: X.76r  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1507676r implements Callable {
    public final /* synthetic */ Notification A00;
    public final /* synthetic */ AnonymousClass6YM A01;
    public final /* synthetic */ CallInfo A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C1507676r(Notification notification, AnonymousClass6YM r2, CallInfo callInfo, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = notification;
        this.A03 = z;
        this.A02 = callInfo;
        this.A04 = z2;
    }

    public final Object call() {
        AnonymousClass6YM r4 = this.A01;
        Notification notification = this.A00;
        boolean z = this.A03;
        CallInfo callInfo = this.A02;
        return Boolean.valueOf(AnonymousClass6YM.A0E(notification, r4, z, callInfo.videoEnabled, this.A04));
    }
}
