package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.6wG  reason: invalid class name and case insensitive filesystem */
public class C146846wG implements C26991Mh {
    public BroadcastReceiver A00;
    public Handler A01;
    public final C19600wD A02;
    public final AnonymousClass1M6 A03;
    public final AnonymousClass1MP A04;
    public final C19630wG A05;
    public final C20720y3 A06;

    public void BuX(Handler handler) {
        this.A01 = handler;
        Context context = this.A05.A00;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C162357oS r1 = new C162357oS(this, 5);
        this.A00 = r1;
        if (C26981Mg.A00(r1, context, intentFilter, handler, (String) null, true) == null) {
            C18740tg.A06(handler);
            if (!handler.post(new C1497272n(this, 11))) {
                Log.w("failed to post checkNetworkState isRetry: false");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (X.C19600wD.A01() == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C146846wG r7, boolean r8) {
        /*
            X.1M6 r0 = r7.A03
            android.net.NetworkInfo r2 = r0.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "xmpp/handler/network/active "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " isRetry="
            X.C36321k7.A1X(r0, r1, r8)
            r6 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0048
            boolean r4 = r2.isConnected()
            int r1 = r2.getType()
            boolean r0 = X.AnonymousClass000.A1S(r1, r6)
            if (r4 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x0032
            boolean r0 = X.C19600wD.A01()
            r3 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            X.1MP r0 = r7.A04
            r0.A00()
            X.0y3 r2 = r7.A06
            if (r4 == 0) goto L_0x0046
            if (r3 != 0) goto L_0x0046
        L_0x003e:
            long r0 = (long) r1
            r2.A0D(r0, r6, r5)
            r2.A0H(r3, r8)
            return
        L_0x0046:
            r6 = 0
            goto L_0x003e
        L_0x0048:
            r1 = -1
            r4 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146846wG.A00(X.6wG, boolean):void");
    }

    public long BAe() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 != null) {
            return (long) A012.getType();
        }
        return -1;
    }

    public void BoM() {
        Handler handler = this.A01;
        C18740tg.A06(handler);
        handler.post(new C1497272n(this, 10));
    }

    public void Bv7() {
        this.A05.A00.unregisterReceiver(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    public boolean isConnected() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 == null || !A012.isConnected()) {
            return false;
        }
        return true;
    }

    public C146846wG(C19600wD r1, AnonymousClass1M6 r2, AnonymousClass1MP r3, C19630wG r4, C20720y3 r5) {
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }
}
