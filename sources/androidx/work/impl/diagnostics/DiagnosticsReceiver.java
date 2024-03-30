package androidx.work.impl.diagnostics;

import X.AnonymousClass6VD;
import X.AnonymousClass6VR;
import X.C97384pE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = AnonymousClass6VD.A01("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str = A00;
            A002.A04(str, "Requesting diagnostics");
            try {
                AnonymousClass6VR.A00(context).A08(new C97384pE(DiagnosticsWorker.class).A00());
            } catch (IllegalStateException e) {
                AnonymousClass6VD.A00();
                Log.e(str, "WorkManager is not initialized", e);
            }
        }
    }
}
