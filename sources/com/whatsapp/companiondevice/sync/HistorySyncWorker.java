package com.whatsapp.companiondevice.sync;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3EN;
import X.AnonymousClass3SB;
import X.AnonymousClass411;
import X.AnonymousClass75A;
import X.C128076At;
import X.C128916Ec;
import X.C17880sD;
import X.C18800tq;
import X.C19550w8;
import X.C19600wD;
import X.C19770wU;
import X.C20810yC;
import X.C24581Cz;
import X.C25701Hi;
import X.C25711Hj;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C587530x;
import X.C80213v2;
import X.C80263v7;
import X.C81853xk;
import X.C99424tL;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class HistorySyncWorker extends C128916Ec {
    public AnonymousClass75A A00;
    public C25711Hj A01;
    public Map A02 = Collections.emptyMap();
    public boolean A03 = false;
    public final C99424tL A04 = new C99424tL();
    public final C25701Hi A05;
    public final C19770wU A06;
    public final AnonymousClass3EN A07;
    public final C19600wD A08;
    public final C20810yC A09;
    public final C24581Cz A0A;

    public static C128076At A00(HistorySyncWorker historySyncWorker) {
        String A012;
        AnonymousClass3EN r5 = historySyncWorker.A07;
        Iterator A0y = AnonymousClass000.A0y(historySyncWorker.A02);
        while (true) {
            if (!A0y.hasNext()) {
                A012 = r5.A00.A01(R.string.f12nameremoved);
                break;
            }
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (A11.getValue() == Boolean.TRUE) {
                AnonymousClass3SB A082 = r5.A01.A08(((Jid) A11.getKey()).getDevice());
                if (A082 != null) {
                    Context context = r5.A00.A00;
                    A012 = C36391kE.A0v(context, AnonymousClass3SB.A01(context, A082, r5.A02), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                    break;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("HistorySyncNotificationHelper/getNotificationText companionDeviceInfo missing for ");
                C36331k8.A1P(A11.getKey(), A0u);
            }
        }
        return new C128076At(240677025, r5.A00(A012).A05(), C19550w8.A06() ? 1 : 0);
    }

    public static void A01(HistorySyncWorker historySyncWorker) {
        if (Build.VERSION.SDK_INT < 31 && !historySyncWorker.A03) {
            synchronized (historySyncWorker) {
                if (historySyncWorker.A03) {
                    Log.w("HistorySyncWorker/publishNotification skip setForegroundAsync");
                } else {
                    try {
                        historySyncWorker.A04(A00(historySyncWorker));
                    } catch (IllegalStateException unused) {
                        Log.w("HistorySyncWorker/publishNotification cannot start foreground notification in background");
                    }
                }
            }
        }
    }

    public C17880sD A05() {
        Log.i("HistorySyncWorker/getForegroundInfoAsync");
        C99424tL r2 = new C99424tL();
        C80263v7.A00(this.A06, this, r2, 41);
        return r2;
    }

    public C17880sD A06() {
        Log.i("HistorySyncWorker/startWork");
        if (Build.VERSION.SDK_INT < 31 && this.A01 == null) {
            AnonymousClass411 r3 = new AnonymousClass411(this, 8);
            this.A01 = r3;
            C25701Hi r2 = this.A05;
            C19770wU r1 = this.A06;
            Objects.requireNonNull(r1);
            r2.A05(r3, new C81853xk(r1));
        }
        C20810yC r4 = this.A09;
        C24581Cz r5 = this.A0A;
        C25701Hi r32 = this.A05;
        this.A00 = new AnonymousClass75A(new C587530x(this), this.A08, r32, r4, r5);
        C80213v2.A01(this.A06, this, 6);
        return this.A04;
    }

    public void A07() {
        Log.i("HistorySyncWorker/onStopped");
        C25711Hj r1 = this.A01;
        if (r1 != null) {
            this.A05.A00.A02(r1);
        }
        AnonymousClass75A r0 = this.A00;
        if (r0 != null) {
            ((AtomicBoolean) r0.A03).set(true);
        }
    }

    public HistorySyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A09 = C36341k9.A0V(A0P);
        this.A06 = C36341k9.A0Z(A0P);
        this.A0A = (C24581Cz) A0P.A3z.get();
        this.A05 = (C25701Hi) A0P.A54.get();
        this.A08 = C36391kE.A0c(A0P);
        this.A07 = (AnonymousClass3EN) A0P.AfI.A00.A23.get();
    }
}
