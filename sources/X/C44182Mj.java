package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.2Mj  reason: invalid class name and case insensitive filesystem */
public final class C44182Mj extends AnonymousClass1DJ {
    public final C19630wG A00;
    public final C25271Fq A01;
    public final C32241dD A02;
    public final C19420v0 A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass1GQ A05;

    public void A01() {
        C19420v0 r2 = this.A03;
        if (C36371kC.A1U(C36341k9.A0E(r2), "newsletter_wait_list_subscription") && C36391kE.A1Z(this.A05)) {
            C36331k8.A18(r2, "newsletter_wait_list_subscription", false);
            Uri build = new Uri.Builder().scheme(SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME).authority("channel").appendPath("directory").build();
            Context context = this.A00.A00;
            AnonymousClass00C.A08(context);
            Intent A06 = AnonymousClass190.A06(context);
            AnonymousClass00C.A08(A06);
            A06.setAction("android.intent.action.VIEW");
            A06.setData(build);
            A06.addFlags(335544320);
            A06.putExtra("extra_from_notification", true);
            PendingIntent A032 = C65743Th.A03(context, A06, 0);
            String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
            C07700Yy A022 = C20600xp.A02(context);
            A022.A0N = "newsletter_key_messages";
            Notification notification = A022.A0B;
            notification.flags = 8 | notification.flags;
            A022.A0M = "critical_app_alerts@1";
            A022.A0F(context.getString(R.string.f12nameremoved));
            A022.A0E(A0m);
            A022.A0G(A0m);
            A022.A09 = 1;
            A022.A0I(true);
            A022.A0D = A032;
            notification.icon = R.drawable.notifybar;
            this.A01.A02(70, A022.A05());
            this.A02.A05(4);
        }
    }

    public C44182Mj(C19630wG r2, C25271Fq r3, C19420v0 r4, AnonymousClass190 r5, AnonymousClass1GQ r6, C32241dD r7) {
        C36321k7.A1B(r2, r3, r6, r4, r7);
        AnonymousClass00C.A0D(r5, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r7;
        this.A04 = r5;
    }
}
