package X;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Statistics$Data;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0ww  reason: invalid class name and case insensitive filesystem */
public class C20050ww {
    public AnonymousClass14K A00;
    public final C19600wD A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final C20840yF A04;
    public final C20860yH A05;

    public static void A00(C20050ww r4) {
        r4.A00.removeMessages(1);
        r4.A00.sendEmptyMessageDelayed(1, 1000);
    }

    public Statistics$Data A01() {
        Statistics$Data statistics$Data;
        AnonymousClass14K r1 = this.A00;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        C18740tg.A0C(z);
        try {
            r1.A03.await();
        } catch (InterruptedException e) {
            Log.e("statistics/waitForStatsInit exception waiting", e);
        }
        AnonymousClass14K r2 = this.A00;
        synchronized (r2) {
            try {
                statistics$Data = new Statistics$Data(new JSONObject(r2.A00.A00()));
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }
        return statistics$Data;
    }

    public void A02() {
        Log.i("statistics/init");
        boolean z = false;
        if (this.A00 == null) {
            z = true;
        }
        C18740tg.A0C(z);
        HandlerThread handlerThread = new HandlerThread("stat-save", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        AnonymousClass14K r1 = new AnonymousClass14K(looper, this, this.A01);
        this.A00 = r1;
        r1.sendEmptyMessage(0);
        C20860yH r3 = this.A05;
        r3.A00 = new AnonymousClass14L(looper, r3.A01, r3.A02);
    }

    public void A03(int i, long j, boolean z) {
        AnonymousClass14K r1 = this.A00;
        boolean z2 = false;
        if (r1 != null) {
            z2 = true;
        }
        C18740tg.A0C(z2);
        Message obtain = Message.obtain(r1, 7);
        Bundle data = obtain.getData();
        data.putInt("messageType", i);
        data.putLong("timestamp", j);
        data.putBoolean("isPayment", z);
        obtain.sendToTarget();
        A00(this);
    }

    public void A04(long j, int i) {
        AnonymousClass14K r4 = this.A00;
        boolean z = false;
        if (r4 != null) {
            z = true;
        }
        C18740tg.A0C(z);
        if (j >= 0) {
            Message obtain = Message.obtain(r4, 5, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A00(this);
        }
    }

    public void A05(long j, int i) {
        AnonymousClass14L r2;
        C20860yH r3 = this.A05;
        if (j >= 0 && (r2 = r3.A00) != null) {
            C18740tg.A0C(true);
            Message obtain = Message.obtain(r2, 5, i, -1);
            obtain.getData().putLong("long_value", j);
            obtain.sendToTarget();
            C20860yH.A00(r3);
        }
    }

    public void A06(long j, int i) {
        AnonymousClass14K r4 = this.A00;
        boolean z = false;
        if (r4 != null) {
            z = true;
        }
        C18740tg.A0C(z);
        if (j >= 0) {
            Message obtain = Message.obtain(r4, 4, i, 0);
            obtain.getData().putLong("bytes", j);
            obtain.sendToTarget();
            A00(this);
        }
    }

    public void A07(boolean z) {
        AnonymousClass14K r2 = this.A00;
        boolean z2 = false;
        if (r2 != null) {
            z2 = true;
        }
        C18740tg.A0C(z2);
        Message.obtain(r2, 8, z ? 1 : 0, 0).sendToTarget();
        A00(this);
    }

    public C20050ww(C19600wD r1, C19970wo r2, C19630wG r3, C20840yF r4, C20860yH r5) {
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = r1;
        this.A04 = r4;
    }
}
