package X;

import android.os.Handler;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.1YW  reason: invalid class name */
public class AnonymousClass1YW {
    public boolean A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass19J A02;
    public final C21060yb A03;
    public final C27361Nx A04;
    public final AnonymousClass005 A05;

    public void A00() {
        this.A00 = true;
        if (this.A02.A06 || !this.A00) {
            C20720y3 r3 = (C20720y3) this.A05.get();
            Log.i("MessageHandler/sendAvailableForChat");
            C31901cZ r1 = r3.A07;
            C18740tg.A06(r1);
            ((Handler) r1).obtainMessage(7).sendToTarget();
            Handler handler = r3.A0d.A02;
            handler.sendMessage(handler.obtainMessage(4, "com.whatsapp.MessageHandler.LOGOUT_ACTION"));
            r3.A0b.A02();
            C20720y3.A06(r3, true, false, false);
            r3.A0U.A08();
        }
    }

    public void A01() {
        this.A00 = false;
        if (this.A02.A06 && !this.A00) {
            PowerManager A0G = this.A03.A0G();
            if (A0G == null) {
                Log.w("PresenceSendMethods/sendUnavailableForChat pm=null");
            } else {
                PowerManager.WakeLock A002 = C111765co.A00(A0G, "sendinactive", 1);
                if (A002 != null) {
                    A002.acquire(3000);
                    Log.i("PresenceSendMethods/sendUnavailableForChat/wl");
                }
            }
            Log.i("MessageHandler/sendUnavailableForChat");
            C31901cZ r1 = ((C20720y3) this.A05.get()).A07;
            C18740tg.A06(r1);
            ((Handler) r1).obtainMessage(6).sendToTarget();
        }
        if (!this.A00) {
            AnonymousClass17Y r3 = this.A01;
            C27361Nx r2 = this.A04;
            Objects.requireNonNull(r2);
            r3.A0H(new C35731jA((Object) r2, 8));
        }
    }

    public AnonymousClass1YW(AnonymousClass17Y r1, AnonymousClass19J r2, C21060yb r3, C27361Nx r4, AnonymousClass005 r5) {
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
