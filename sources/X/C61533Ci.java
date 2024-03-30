package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3Ci  reason: invalid class name and case insensitive filesystem */
public class C61533Ci {
    public final C19630wG A00;

    public Notification A00() {
        Log.i("fpm/ChatTransferNotificationManager/buildDefaultNotification");
        Context context = this.A00.A00;
        PendingIntent A03 = C65743Th.A03(context, context.getPackageManager().getLaunchIntentForPackage("com.whatsapp"), 0);
        C07700Yy A0F = C36421kH.A0F(context);
        int i = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i = -1;
        }
        A0F.A09 = i;
        A0F.A0D = A03;
        C36361kB.A1A(A0F);
        A0F.A0A = 1;
        A0F.A0F(context.getResources().getString(R.string.f12nameremoved));
        return A0F.A05();
    }

    public C61533Ci(C19630wG r1) {
        this.A00 = r1;
    }
}
