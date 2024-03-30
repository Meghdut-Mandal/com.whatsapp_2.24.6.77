package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.6Yu  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6Yu implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;

    public /* synthetic */ AnonymousClass6Yu(Activity activity, int i, int i2) {
        this.A00 = i;
        this.A02 = activity;
        this.A01 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PendingIntent activity;
        int i2 = this.A00;
        Activity activity2 = this.A02;
        int i3 = this.A01;
        Executor executor = AnonymousClass6Y6.A00;
        try {
            boolean z = C02620Be.A00;
            Intent A03 = C02600Bc.A00.A03(activity2, (String) null, i2);
            if (A03 == null || (activity = PendingIntent.getActivity(activity2, i3, A03, AnonymousClass0RQ.A00 | 134217728)) == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("gdrive-util/get-error-dialog pending intent is null for error code: ");
                C36321k7.A1Z(A0u, C34191gb.A01(i2));
                return;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("gdrive-util/get-error-dialog starting resolution for ");
            C36321k7.A1Z(A0u2, C34191gb.A01(i2));
            AnonymousClass0L0 r1 = new AnonymousClass0L0(i2, activity);
            if (r1.A00()) {
                PendingIntent pendingIntent = r1.A02;
                AnonymousClass006.A01(pendingIntent);
                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), i3, (Intent) null, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e) {
            Log.e("gdrive-util/get-error-dialog", e);
        }
    }
}
