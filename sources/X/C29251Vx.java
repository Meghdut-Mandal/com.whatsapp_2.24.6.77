package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Vx  reason: invalid class name and case insensitive filesystem */
public class C29251Vx implements C20420xX {
    public final C29241Vw A00;
    public final C19420v0 A01;
    public final AtomicReference A02 = new AtomicReference();
    public final C19700wN A03;
    public final AnonymousClass19J A04;
    public final C20810yC A05;
    public final AnonymousClass19A A06;

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    public void A00() {
        String str = (String) this.A02.getAndSet((Object) null);
        if (str != null) {
            A01(str);
        }
    }

    public void A01(String str) {
        if (this.A04.A04 == 2) {
            AnonymousClass19A r2 = this.A06;
            String A09 = r2.A09();
            try {
                C35911jS r0 = new C35911jS(A09, str, 17);
                r2.A0E(new C21344AHw(this, r0, str), r0.A00, A09, 314, 32000);
            } catch (IllegalArgumentException unused) {
                Log.e("ClientAuthTokenManager/failed to create request for auth_token");
            }
        } else {
            this.A02.set(str);
        }
    }

    public C29251Vx(C19700wN r2, AnonymousClass19J r3, C29241Vw r4, C19420v0 r5, C20810yC r6, AnonymousClass19A r7) {
        this.A05 = r6;
        this.A03 = r2;
        this.A06 = r7;
        this.A04 = r3;
        this.A01 = r5;
        this.A00 = r4;
    }

    public void BYl() {
        A00();
    }
}
