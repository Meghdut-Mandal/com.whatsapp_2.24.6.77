package X;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.whatsapp.businessdirectory.util.BaseGPSLocationManager;

/* renamed from: X.6nS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141566nS implements OnCompleteListener {
    public final /* synthetic */ C009904e A00;
    public final /* synthetic */ BaseGPSLocationManager A01;
    public final /* synthetic */ AnonymousClass00S A02;
    public final /* synthetic */ AnonymousClass00S A03;

    public /* synthetic */ C141566nS(C009904e r1, BaseGPSLocationManager baseGPSLocationManager, AnonymousClass00S r3, AnonymousClass00S r4) {
        this.A02 = r3;
        this.A01 = baseGPSLocationManager;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void onComplete(Task task) {
        AnonymousClass00S r1 = this.A02;
        C009904e r3 = this.A00;
        AnonymousClass00S r2 = this.A03;
        AnonymousClass00C.A0D(r1, 0);
        C36331k8.A1G(r2, 3, task);
        try {
            task.getResult(ApiException.class);
            r1.invoke();
        } catch (ApiException e) {
            Status status = e.mStatus;
            if (status.A01 == 6) {
                try {
                    if (e instanceof AnonymousClass0JE) {
                        r3.A01((AnonymousClass0YW) null, new C06520Tx(((AnonymousClass0JE) e).mStatus.A02.getIntentSender()).A00());
                        return;
                    }
                    PendingIntent pendingIntent = status.A02;
                    if (pendingIntent != null) {
                        C18740tg.A06(pendingIntent);
                        r3.A01((AnonymousClass0YW) null, new C06520Tx(pendingIntent.getIntentSender()).A00());
                    }
                } catch (Exception unused) {
                    r2.invoke();
                }
            } else {
                r2.invoke();
            }
        }
    }
}
