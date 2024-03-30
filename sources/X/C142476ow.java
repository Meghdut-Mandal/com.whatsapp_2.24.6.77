package X;

import com.whatsapp.bridge.wfal.WfalManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6ow  reason: invalid class name and case insensitive filesystem */
public final class C142476ow implements C20420xX, AnonymousClass4SW {
    public C107155Mt A00;
    public final WfalManager A01;
    public final C19970wo A02;
    public final AnonymousClass6VF A03;
    public final AnonymousClass66M A04;
    public final AnonymousClass1A1 A05;
    public final C19770wU A06;
    public final C34971hw A07;

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    static {
        TimeUnit.SECONDS.toMillis(3);
    }

    public void BYl() {
        AnonymousClass00C.A0D("[WAFFLE]CrosspostUnsentStatusManager/registerXmppListener network connected", 0);
    }

    public void BYn() {
        AnonymousClass00C.A0D("[WAFFLE]CrosspostUnsentStatusManager/registerXmppListener network disconnected", 0);
    }

    public void Bjr(List list) {
        this.A06.Boy(new C1501674f(this, 6));
    }

    public C142476ow(WfalManager wfalManager, C19970wo r2, AnonymousClass6VF r3, AnonymousClass66M r4, AnonymousClass1A1 r5, C19770wU r6, C34971hw r7) {
        C36321k7.A1B(r2, r6, r5, r3, r7);
        C36321k7.A10(r4, wfalManager);
        this.A02 = r2;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r3;
        this.A07 = r7;
        this.A04 = r4;
        this.A01 = wfalManager;
    }
}
