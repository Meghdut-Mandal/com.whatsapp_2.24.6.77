package X;

import com.whatsapp.util.Log;

/* renamed from: X.3t2  reason: invalid class name and case insensitive filesystem */
public final class C79013t2 implements AnonymousClass4S8 {
    public final C65003Qi A00;
    public final AnonymousClass12P A01;
    public final C20810yC A02;
    public final C19770wU A03;

    public void BSH() {
        Log.i("ScheduledReminderMessageBootObserver onBootCompleted");
        if (this.A02.A0E(5075)) {
            C80233v4.A01(this.A03, this, 41);
        } else {
            this.A00.A01();
        }
    }

    public C79013t2(C65003Qi r2, AnonymousClass12P r3, C20810yC r4, C19770wU r5) {
        C36321k7.A0x(r5, r3);
        AnonymousClass00C.A0D(r4, 4);
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
