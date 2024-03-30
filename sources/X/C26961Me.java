package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Me  reason: invalid class name and case insensitive filesystem */
public final class C26961Me extends Handler {
    public final boolean A00 = C21360z5.A00();
    public final /* synthetic */ C20720y3 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26961Me(Looper looper, C20720y3 r3) {
        super(looper);
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        if (this.A00) {
            Log.w("MessageHandler/unsupported");
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                boolean z = message.getData().getBoolean("should_unregister", false);
                int i2 = message.getData().getInt("logoutReason", -1);
                if (z) {
                    this.A01.A10 = false;
                }
                C20720y3 r4 = this.A01;
                AtomicBoolean atomicBoolean = C20720y3.A14;
                if (i2 == 12) {
                    r4.A11 = true;
                }
                Log.i("MessageHandler/stop");
                if (!r4.A12) {
                    AnonymousClass1WP r0 = r4.A08;
                    if (r0 != null) {
                        r0.A04();
                    }
                } else {
                    r4.A12 = false;
                    synchronized (r4.A0f) {
                        C26951Md r1 = r4.A0V;
                        if (!r1.A00) {
                            r4.A08.A02();
                        }
                        r1.A00(true);
                    }
                    if (r4.A07 != null) {
                        r4.A0Q.A00.unregisterReceiver(r4.A0E);
                        r4.A0Z.Bv7();
                        HandlerThread handlerThread = r4.A03;
                        C18740tg.A06(handlerThread);
                        handlerThread.quit();
                        try {
                            r4.A03.join(120000);
                        } catch (InterruptedException e) {
                            Log.w("MessageHandler/stop/interrupted while waiting on connectivity handler thread to exit", e);
                            Thread.currentThread().interrupt();
                        }
                        if (r4.A03.isAlive()) {
                            Log.e("MessageHandler/stop connectivity-handler-thread still alive");
                        }
                        r4.A03 = null;
                        C20720y3.A13 = new CountDownLatch(1);
                        C20720y3.A14.set(false);
                        ((Handler) r4.A07).obtainMessage(3, Integer.valueOf(i2)).sendToTarget();
                        r4.A07 = null;
                        AnonymousClass19A r02 = r4.A0X;
                        r02.A0D = null;
                        r02.A00 = null;
                    } else {
                        r4.A06.quit();
                    }
                }
                r4.A0A = true;
            } else if (i == 2) {
                Bundle data = message.getData();
                boolean z2 = data.getBoolean("reset", false);
                boolean z3 = data.getBoolean("force", false);
                boolean z4 = data.getBoolean("force_no_ongoing_backoff", false);
                boolean z5 = data.getBoolean("check_connection", false);
                boolean z6 = data.getBoolean("notify_on_failure", false);
                String string = data.getString("ip_address");
                String string2 = data.getString("cl_sess");
                boolean z7 = data.getBoolean("fgservice", false);
                int i3 = data.getInt("connect_reason", 0);
                C20720y3 r5 = this.A01;
                AtomicBoolean atomicBoolean2 = C20720y3.A14;
                if (!r5.A11) {
                    if (z3) {
                        r5.A02 = 0;
                    }
                    if (z2) {
                        r5.A0b.A02();
                    }
                    long j = r5.A02;
                    if (j <= 0 || SystemClock.elapsedRealtime() >= j) {
                        C20720y3.A02(r5);
                        C20720y3.A00(r5.A05, r5, string2, string, i3, z3, z4, z5, z6, z7);
                    }
                }
            } else if (i != 3) {
                C20720y3.A02(this.A01);
            } else {
                Bundle data2 = message.getData();
                C20720y3 r12 = this.A01;
                C20720y3.A02(r12);
                if (data2.getBoolean("long_connect", false)) {
                    C20720y3.A01(r12);
                }
            }
        } else if (hasMessages(1)) {
            Log.i("MessageHandler/not starting connection as will be imminently stopped");
        } else {
            C20720y3 r42 = this.A01;
            AtomicBoolean atomicBoolean3 = C20720y3.A14;
            r42.A0A = false;
            boolean z8 = message.getData().getBoolean("should_register", false);
            r42.A05 = (AnonymousClass1VM) message.obj;
            if (!r42.A11) {
                C20720y3.A02(r42);
                if (z8) {
                    C19730wQ r03 = r42.A0G;
                    r03.A0G();
                    PhoneUserJid phoneUserJid = r03.A03;
                    Object obj = r42.A0e.get();
                    C18740tg.A06(obj);
                    AnonymousClass1WP r13 = (AnonymousClass1WP) obj;
                    if (!r42.A10) {
                        Log.i("MessageHandler/handleRegistered registered");
                        r42.A04 = phoneUserJid;
                        r42.A08 = r13;
                        r42.A0W.A00 = r13;
                        C20720y3.A06(r42, true, false, false);
                        if (r42.A07 != null) {
                            r42.A08.A03();
                        }
                        r42.A10 = true;
                    } else if (r42.A0J.A02()) {
                        C20720y3.A06(r42, true, false, false);
                        if (r42.A07 != null) {
                            r42.A08.A03();
                        }
                    }
                }
            }
        }
    }
}
