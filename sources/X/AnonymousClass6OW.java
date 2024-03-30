package X;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.whatsapp.R;
import com.whatsapp.service.BackgroundMediaControlService;

/* renamed from: X.6OW  reason: invalid class name */
public class AnonymousClass6OW {
    public long A00;
    public C07700Yy A01;
    public AnonymousClass3T1 A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C19730wQ A07;
    public final AnonymousClass1Pp A08;
    public final AnonymousClass16D A09;
    public final AnonymousClass171 A0A;
    public final C27731Pn A0B;
    public final AnonymousClass1V6 A0C;
    public final C21060yb A0D;
    public final C19630wG A0E;
    public final C25271Fq A0F;

    public void A01() {
        this.A06 = true;
        this.A0F.A03(14, "OngoingMediaNotification2");
    }

    public static void A00(RemoteViews remoteViews, AnonymousClass6OW r5, boolean z) {
        int i;
        int i2;
        String str = r5.A03;
        if (str != null) {
            remoteViews.setTextViewText(R.id.ongoing_media_text, str);
        }
        Context context = r5.A0E.A00;
        Intent A0H = C36441kJ.A0H(context, BackgroundMediaControlService.class);
        if (z) {
            A0H.setAction("com.whatsapp.service.BackgroundMediaControlService.STOP");
            i = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_pause);
            i2 = R.string.f12nameremoved;
        } else {
            A0H.setAction("com.whatsapp.service.BackgroundMediaControlService.START");
            i = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_play);
            i2 = R.string.f12nameremoved;
        }
        remoteViews.setContentDescription(i, context.getString(i2));
        r5.A01.A0J(z);
        r5.A05 = z;
        remoteViews.setOnClickPendingIntent(i, C65743Th.A04(context, A0H, 134217728));
        C07700Yy r0 = r5.A01;
        r0.A0H = remoteViews;
        r5.A0F.A02(14, r0.A05());
    }

    public AnonymousClass6OW(C19730wQ r1, AnonymousClass1Pp r2, AnonymousClass16D r3, AnonymousClass171 r4, C27731Pn r5, AnonymousClass1V6 r6, C21060yb r7, C19630wG r8, C25271Fq r9) {
        this.A0E = r8;
        this.A07 = r1;
        this.A0B = r5;
        this.A08 = r2;
        this.A09 = r3;
        this.A0D = r7;
        this.A0A = r4;
        this.A0F = r9;
        this.A0C = r6;
    }

    public void A02(C148826zU r8) {
        boolean A0I = r8.A0I();
        if (!this.A04) {
            RemoteViews remoteViews = new RemoteViews(this.A0E.A00.getPackageName(), R.layout.f9nameremoved);
            int A0A2 = r8.A0A();
            remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, r8.A01, A0A2, false);
            remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (A0A2 / 1000)));
            A00(remoteViews, this, A0I);
            return;
        }
        boolean z = this.A05;
        if (!A0I ? !z : z) {
            if (!this.A06) {
                return;
            }
        }
        A00(new RemoteViews(this.A0E.A00.getPackageName(), R.layout.f9nameremoved), this, A0I);
        this.A06 = false;
    }
}
