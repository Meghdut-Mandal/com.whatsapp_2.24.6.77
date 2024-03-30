package X;

import android.app.Activity;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3fn  reason: invalid class name and case insensitive filesystem */
public class C70833fn implements C160027kL {
    public final /* synthetic */ DeepLinkActivity A00;
    public final /* synthetic */ WeakReference A01;

    public void Be0() {
    }

    public /* synthetic */ void Bip() {
    }

    public C70833fn(DeepLinkActivity deepLinkActivity, WeakReference weakReference) {
        this.A00 = deepLinkActivity;
        this.A01 = weakReference;
    }

    public void Bio(C131626Pu r3) {
        String str;
        if (r3 != null) {
            int i = r3.A00;
            if (i == 0) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/NETWORK_UNAVAILABLE/";
            } else if (i == 4) {
                str = "Conversation/createSyncContactTaskCallback/onSyncCompleted/SYNC_REQUEST_FAILED/";
            }
            Log.w(str);
        }
        Activity A0D = C36441kJ.A0D(this.A01);
        if (A0D != null && !AnonymousClass3SJ.A04(A0D)) {
            A0D.finish();
        }
    }
}
