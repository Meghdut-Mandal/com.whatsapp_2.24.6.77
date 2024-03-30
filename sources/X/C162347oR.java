package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.7oR  reason: invalid class name and case insensitive filesystem */
public class C162347oR extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public C162347oR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        C33161ep r4;
        Context context2;
        int i;
        String str;
        switch (this.A01) {
            case 0:
                ((C27501Ol) this.A00).A06.Boy(AnonymousClass74N.A00(this, context, 48));
                return;
            case 1:
                Log.i("gdrive-notification-manager/user-decided-to-backup-over-data-connection");
                r4 = (C33161ep) this.A00;
                context2 = r4.A0F.A00;
                i = 2;
                str = "action_perform_backup_over_cellular";
                break;
            case 3:
                Log.i("gdrive-notification-manager/user-dismissed the notification");
                r4 = (C33161ep) this.A00;
                r4.A0F.A00.unregisterReceiver(this);
                try {
                    C21570zS r5 = r4.A0I;
                    Iterator A13 = C90514aH.A13(C90514aH.A0V(r5).A04("com.whatsapp.backup.google.google-backup-worker").get());
                    while (true) {
                        if (!A13.hasNext()) {
                            break;
                        } else {
                            AnonymousClass6DP r3 = (AnonymousClass6DP) A13.next();
                            if (r3.A00 == C023109s.A01) {
                                AnonymousClass6VR A0V = C90514aH.A0V(r5);
                                A0V.A06.B74(new C97454pi(A0V, r3.A01));
                                break;
                            }
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e("gdrive-notification-manager/couldn't cancel worker.", e);
                    break;
                }
            case 4:
                Log.i("gdrive-notification-manager/user-decided-to-restore-over-data-connection");
                r4 = (C33161ep) this.A00;
                context2 = r4.A0F.A00;
                i = 2;
                str = "action_perform_media_restore_over_cellular";
                break;
            case 6:
                AnonymousClass1LB r1 = (AnonymousClass1LB) this.A00;
                if (r1.A02()) {
                    Log.i("reload commerce translation metadata since locale changed");
                    r1.A01();
                    return;
                }
                return;
            default:
                Log.i("gdrive-notification-manager/user-decided-to-restore-over-low-battery");
                r4 = (C33161ep) this.A00;
                C33101ei r32 = r4.A0D;
                r32.A08 = true;
                r32.A09(((C227815t) r32.A0P.get()).A00);
                r32.A0O.Boy(new C35671j4(r32, 6));
                r4.A0F.A00.unregisterReceiver(this);
                break;
        }
        Intent A1E = AnonymousClass190.A1E(context2, str, (String) null, i);
        A1E.setFlags(335544320);
        context2.startActivity(A1E);
        context2.unregisterReceiver(this);
        r4.A04();
    }
}
