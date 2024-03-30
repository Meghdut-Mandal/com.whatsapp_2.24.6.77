package X;

import com.whatsapp.util.Log;

/* renamed from: X.3t4  reason: invalid class name and case insensitive filesystem */
public final class C79033t4 implements AnonymousClass4S8 {
    public final AnonymousClass12P A00;
    public final C29541Xa A01;
    public final C71893hV A02;
    public final C29581Xe A03;
    public final C20810yC A04;
    public final C19770wU A05;

    public void BSH() {
        Log.i("EventStartAlarmBootCompletedObserver/ onBootCompleted");
        if (!this.A04.A0E(7306)) {
            Log.i("EventStartAlarmBootCompletedObserver/ skipping, feature not enabled");
        } else {
            this.A05.Bp1(C80243v5.A00(this, 1));
        }
    }

    public C79033t4(AnonymousClass12P r2, C29541Xa r3, C71893hV r4, C29581Xe r5, C20810yC r6, C19770wU r7) {
        C36321k7.A1B(r6, r7, r5, r3, r2);
        AnonymousClass00C.A0D(r4, 6);
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
