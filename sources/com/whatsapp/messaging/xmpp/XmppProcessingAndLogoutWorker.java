package com.whatsapp.messaging.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00T;
import X.AnonymousClass19J;
import X.AnonymousClass19O;
import X.AnonymousClass19W;
import X.AnonymousClass64I;
import X.AnonymousClass7MV;
import X.AnonymousClass7MW;
import X.AnonymousClass7MX;
import X.C128916Ec;
import X.C17880sD;
import X.C18800tq;
import X.C19700wN;
import X.C19970wo;
import X.C20810yC;
import X.C21390zA;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C90514aH;
import X.C90524aI;
import X.C97344ox;
import X.C99424tL;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class XmppProcessingAndLogoutWorker extends C128916Ec {
    public int A00;
    public long A01;
    public boolean A02;
    public final C99424tL A03;
    public final C21390zA A04;
    public final C19700wN A05;
    public final AnonymousClass19J A06;
    public final C20810yC A07;
    public final XmppConnectionMetricsWorkManager A08;
    public final AnonymousClass64I A09;
    public final AnonymousClass19W A0A;
    public final AnonymousClass19O A0B;
    public final AnonymousClass00T A0C = C36431kI.A1I(new AnonymousClass7MV(this));
    public final AnonymousClass00T A0D = C36431kI.A1I(new AnonymousClass7MW(this));
    public final AnonymousClass00T A0E = C36431kI.A1I(new AnonymousClass7MX(this));
    public final boolean A0F;
    public final C19970wo A0G;

    public static final void A01(XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker, long j) {
        if (!xmppProcessingAndLogoutWorker.A04.A00) {
            Log.i("XmppProcessingAndLogoutWorker/schedule logout timer");
            C90524aI.A0C(xmppProcessingAndLogoutWorker.A0D).sendEmptyMessageDelayed(2, j);
            return;
        }
        C97344ox A002 = C97344ox.A00();
        xmppProcessingAndLogoutWorker.A08.A00 = null;
        xmppProcessingAndLogoutWorker.A0B.A04();
        xmppProcessingAndLogoutWorker.A03.A04(A002);
    }

    public C17880sD A05() {
        throw AnonymousClass001.A09("XmppProcessingAndLogoutWorker is not supposed to run in foreground");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppProcessingAndLogoutWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        boolean z;
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A0B = (AnonymousClass19O) A0P.A9f.get();
        this.A04 = (C21390zA) A0P.A0J.get();
        this.A05 = A0P.B3m();
        this.A0G = A0P.Bvc();
        this.A07 = A0P.Azp();
        this.A09 = (AnonymousClass64I) A0P.A9n.get();
        this.A08 = (XmppConnectionMetricsWorkManager) A0P.A9g.get();
        this.A0A = (AnonymousClass19W) A0P.A9F.get();
        this.A06 = C90514aH.A0Z(A0P);
        Object obj = workerParameters.A01.A00.get("SKIP_PROCESSING");
        if (obj instanceof Boolean) {
            z = AnonymousClass000.A1X(obj);
        } else {
            z = false;
        }
        this.A0F = z;
        this.A03 = new C99424tL();
    }

    public static final void A00(XmppProcessingAndLogoutWorker xmppProcessingAndLogoutWorker) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XmppProcessingAndLogoutWorker/work started; is processing: ");
        C36331k8.A1S(A0u, xmppProcessingAndLogoutWorker.A02);
        AnonymousClass19O r3 = xmppProcessingAndLogoutWorker.A0B;
        r3.A03 = null;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("XmppProcessingAndLogoutWorker/cycle: ");
        int i = xmppProcessingAndLogoutWorker.A00;
        xmppProcessingAndLogoutWorker.A00 = i + 1;
        A0u2.append(i);
        A0u2.append(" started: ");
        C36321k7.A1a(A0u2, r3.A03());
        C90524aI.A0C(xmppProcessingAndLogoutWorker.A0D).sendEmptyMessageDelayed(1, C36351kA.A08(xmppProcessingAndLogoutWorker.A0C));
    }
}
