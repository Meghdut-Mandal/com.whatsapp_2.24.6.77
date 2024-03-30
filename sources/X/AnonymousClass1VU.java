package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1VU  reason: invalid class name */
public final class AnonymousClass1VU implements C20420xX {
    public AtomicReference A00 = new AtomicReference();
    public final C20810yC A01;
    public final C19770wU A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicReference A04 = new AtomicReference();
    public final AnonymousClass00T A05 = new AnonymousClass00U(new AnonymousClass1VV(this));

    public AnonymousClass1VU(C20810yC r3, C19770wU r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        this.A01 = r3;
        this.A02 = r4;
    }

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYp() {
    }

    public final void A00(Runnable runnable) {
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            Log.i("PassiveModeManager/onConnectedPassiveMode");
            AtomicReference atomicReference = this.A00;
            Runnable runnable2 = (Runnable) atomicReference.getAndSet((Object) null);
            if (runnable2 != null) {
                this.A02.Bnx(runnable2);
            }
            if (!this.A03.get()) {
                Log.i("PassiveModeManager/onConnectedPassiveMode offline-resume is not running, sending active-iq");
                runnable.run();
                return;
            }
            this.A04.set(runnable);
            int A002 = C20800yB.A00(C21000yV.A02, this.A01, 7470);
            atomicReference.set(this.A02.BpM(new C35201iJ(this, A002, 6), "end-passive-mode-timer", ((long) A002) * 1000));
        }
    }

    public final boolean A01() {
        if (!this.A03.get() || !((Boolean) this.A05.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public void BYo() {
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            Runnable runnable = (Runnable) this.A00.getAndSet((Object) null);
            if (runnable != null) {
                this.A02.Bnx(runnable);
            }
            this.A03.set(false);
            Log.i("PassiveModeManager/onHandlerOfflineProcessComplete sending active-iq");
            AtomicReference atomicReference = this.A04;
            atomicReference.get();
            Runnable runnable2 = (Runnable) atomicReference.getAndSet((Object) null);
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }
}
