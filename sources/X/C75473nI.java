package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.instrumentation.notification.DelayedNotificationReceiver;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3nI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75473nI implements C87914Qr {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DelayedNotificationReceiver A01;

    public /* synthetic */ C75473nI(Context context, DelayedNotificationReceiver delayedNotificationReceiver) {
        this.A01 = delayedNotificationReceiver;
        this.A00 = context;
    }

    public final void B72(Set set) {
        int i;
        DelayedNotificationReceiver delayedNotificationReceiver = this.A01;
        Context context = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            AnonymousClass1VE r0 = delayedNotificationReceiver.A03;
            if (!C36371kC.A1U(AnonymousClass1VE.A00(r0), AnonymousClass1VE.A01(A0C, "metadata/delayed_notification_shown"))) {
                AnonymousClass1VE r2 = delayedNotificationReceiver.A03;
                long A0B = C36341k9.A0B(AnonymousClass1VE.A00(r2), AnonymousClass1VE.A01(A0C, "auth/token_ts"));
                Number number = (Number) delayedNotificationReceiver.A02.A01.get(A0C);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = R.string.f12nameremoved;
                }
                String string = context.getString(R.string.f12nameremoved);
                String A002 = AnonymousClass3UM.A00(delayedNotificationReceiver.A01, A0B);
                Object[] A0M = AnonymousClass001.A0M();
                C36331k8.A1N(context.getString(i), A002, A0M);
                String string2 = context.getString(R.string.f12nameremoved, A0M);
                C07700Yy A0F = C36421kH.A0F(context);
                A0F.A0G(string);
                A0F.A0F(string);
                A0F.A0E(string2);
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(context.getPackageName(), "com.whatsapp.companiondevice.LinkedDevicesActivity");
                A0F.A0D = C65743Th.A00(context, 0, A0D, 0);
                C36341k9.A14(A0F, string2);
                A0F.A0I(true);
                C36361kB.A1A(A0F);
                delayedNotificationReceiver.A00.A02(41, A0F.A05());
                AnonymousClass1VE r02 = delayedNotificationReceiver.A03;
                C36331k8.A0w(AnonymousClass1VE.A00(r02).edit(), AnonymousClass1VE.A01(A0C, "metadata/delayed_notification_shown"), true);
            }
        }
    }
}
