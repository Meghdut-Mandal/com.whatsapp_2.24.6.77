package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3Eq  reason: invalid class name */
public class AnonymousClass3Eq {
    public final Context A00;
    public final AnonymousClass1Pp A01;
    public final AnonymousClass16D A02;
    public final C27731Pn A03;
    public final C25271Fq A04;
    public final C18820ts A05;
    public final AnonymousClass1CR A06;

    public void A00(AnonymousClass3KV r9, boolean z) {
        String string;
        String A0E;
        AnonymousClass147 A012 = C65533Sl.A01(r9.A04);
        if (A012 == null) {
            Log.w("ScheduledCallStartNotificationImpl group jid is null");
            return;
        }
        AnonymousClass141 A0D = this.A02.A0D(A012);
        Context context = this.A00;
        long j = r9.A02;
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        A0D2.setAction(C114145gi.A04);
        A0D2.putExtra("scheduled_call_row_id", j);
        A0D2.putExtra("group_jid", A012.getRawString());
        PendingIntent A032 = C65743Th.A03(context, A0D2, 7);
        C07700Yy r5 = new C07700Yy(context, "critical_app_alerts@1");
        r5.A09 = 1;
        C36361kB.A1A(r5);
        r5.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        r5.A0D = A032;
        r5.A0I(true);
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass3LI A0d = C36361kB.A0d(A012, this.A06);
            C47192dt r1 = (C47192dt) A0d;
            if (A0d.A0A()) {
                A0E = r1.A0F();
            } else {
                A0E = r1.A0E();
            }
            if (!TextUtils.isEmpty(A0E)) {
                r5.A0M = A0E;
            }
        }
        Bitmap A013 = AnonymousClass3UD.A01(context, this.A01, this.A03, A0D);
        AnonymousClass0TO r12 = new AnonymousClass0TO();
        r12.A01 = r9.A00();
        r12.A00 = IconCompat.A03(A013);
        AnonymousClass0UW r6 = new AnonymousClass0UW(r12);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r6);
        boolean A1S = AnonymousClass000.A1S(r9.A00, 2);
        if (z) {
            string = context.getResources().getString(R.string.f12nameremoved);
        } else {
            int i = R.string.f12nameremoved;
            if (A1S) {
                i = R.string.f12nameremoved;
            }
            string = context.getString(i);
        }
        notificationCompat$MessagingStyle.A0C(new C07210Wt(r6, string, r9.A03));
        notificationCompat$MessagingStyle.A00 = C36381kD.A0j();
        r5.A0C(notificationCompat$MessagingStyle);
        this.A04.A02(55, r5.A05());
    }

    public AnonymousClass3Eq(AnonymousClass1Pp r2, AnonymousClass16D r3, C27731Pn r4, C19630wG r5, C25271Fq r6, C18820ts r7, AnonymousClass1CR r8) {
        this.A00 = r5.A00;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
    }
}
