package X;

import com.facebook.msys.mci.NotificationCenterInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.88L  reason: invalid class name */
public class AnonymousClass88L extends AnonymousClass72f {
    public final /* synthetic */ C22873AxS A00;
    public final /* synthetic */ NotificationCenterInternal A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ Map A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass88L(C22873AxS axS, NotificationCenterInternal notificationCenterInternal, String str, ArrayList arrayList, Map map) {
        super("dispatchNotificationToCallbacks");
        this.A01 = notificationCenterInternal;
        this.A03 = arrayList;
        this.A02 = str;
        this.A00 = axS;
        this.A04 = map;
    }

    public void run() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((NotificationCenterInternal.NotificationCallbackInternal) it.next()).onNewNotification(this.A02, this.A00, this.A04);
        }
    }
}
