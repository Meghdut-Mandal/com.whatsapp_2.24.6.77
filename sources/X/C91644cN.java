package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.messaging.xmpp.XmppProcessingAndLogoutWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4cN  reason: invalid class name and case insensitive filesystem */
public final class C91644cN extends Handler {
    public final /* synthetic */ XmppProcessingAndLogoutWorker A00;

    public void handleMessage(Message message) {
        Object A002;
        AnonymousClass00C.A0D(message, 0);
        int i = message.what;
        if (i == 1) {
            XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker = this.A00;
            AnonymousClass19O r3 = xmppProcessingAndLogoutWorker.A0B;
            if (!r3.A0A()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("XmppProcessingAndLogoutWorker/work is done; is processing: ");
                C36331k8.A1S(A0u, r3.A0A());
            } else {
                AnonymousClass00T r6 = xmppProcessingAndLogoutWorker.A0C;
                long A08 = C36351kA.A08(r6);
                boolean z = xmppProcessingAndLogoutWorker.A02;
                int i2 = xmppProcessingAndLogoutWorker.A00;
                if (r3.A0A()) {
                    if (!z && i2 == 1) {
                        A08 += 1000;
                    }
                    if (r3.A0B(A08) && xmppProcessingAndLogoutWorker.A07.A0E(5409)) {
                        Log.i("XmppProcessingAndLogoutWorker/doWork seems like stanzas stuck");
                        xmppProcessingAndLogoutWorker.A05.A0E("xmpp-lifecycle-worker-stuck-stanza", r3.A03(), false);
                        r3.A08(3);
                    }
                }
                if (C90514aH.A0J(xmppProcessingAndLogoutWorker.A01) >= 300000) {
                    if (!xmppProcessingAndLogoutWorker.A04.A00) {
                        xmppProcessingAndLogoutWorker.A05.A0E("xmpp-tracking-work", r3.A03(), false);
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("XmppProcessingAndLogoutWorker/300000 milliseconds time out reached; stop the job; is processing: ");
                    C36331k8.A1S(A0u2, r3.A0A());
                    r3.A08(0);
                } else {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("XmppProcessingAndLogoutWorker/cycle: ");
                    int i3 = xmppProcessingAndLogoutWorker.A00;
                    xmppProcessingAndLogoutWorker.A00 = i3 + 1;
                    A0u3.append(i3);
                    A0u3.append(" started: ");
                    C36321k7.A1a(A0u3, r3.A03());
                    C90524aI.A0C(xmppProcessingAndLogoutWorker.A0D).sendEmptyMessageDelayed(1, C36351kA.A08(r6));
                    return;
                }
            }
            XmppProcessingAndLogoutWorker.A01(xmppProcessingAndLogoutWorker, C36351kA.A08(xmppProcessingAndLogoutWorker.A0E));
        } else if (i == 2) {
            Log.i("XmppProcessingAndLogoutWorker/checkLogout");
            XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker2 = this.A00;
            if (xmppProcessingAndLogoutWorker2.A09.A00()) {
                Log.i("XmppProcessingAndLogoutWorker/performed logout");
                TimeUnit timeUnit = TimeUnit.SECONDS;
                CountDownLatch A0u4 = C90484aE.A0u();
                xmppProcessingAndLogoutWorker2.A06.A00(new AnonymousClass5WV(A0u4, 3));
                boolean z2 = !A0u4.await(1, timeUnit);
                if (z2) {
                    xmppProcessingAndLogoutWorker2.A05.A0E("xmpp-logout-worker-waited-logout-too-long", (String) null, false);
                }
                C36321k7.A1X("XmppProcessingAndLogoutWorker/logout complete did timeout: ", AnonymousClass000.A0u(), z2);
                A002 = C97344ox.A00();
            } else if (!C90524aI.A0C(xmppProcessingAndLogoutWorker2.A0D).hasMessages(1)) {
                A002 = C97334ow.A00();
            } else {
                return;
            }
            xmppProcessingAndLogoutWorker2.A08.A00 = null;
            xmppProcessingAndLogoutWorker2.A0B.A04();
            xmppProcessingAndLogoutWorker2.A03.A04(A002);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91644cN(Looper looper, XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        super(looper);
        this.A00 = xmppProcessingAndLogoutWorker;
    }
}
