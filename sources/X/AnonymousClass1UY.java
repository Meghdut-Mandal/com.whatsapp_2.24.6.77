package X;

import android.hardware.SensorManager;

/* renamed from: X.1UY  reason: invalid class name */
public class AnonymousClass1UY implements AnonymousClass0z8 {
    public C204239pg A00;
    public final C21060yb A01;

    public void BRC() {
        synchronized (this) {
            SensorManager A0A = this.A01.A0A();
            if (A0A != null) {
                C204239pg r2 = this.A00;
                if (r2 == null) {
                    r2 = new C204239pg(this);
                    this.A00 = r2;
                }
                A0A.registerListener(r2, A0A.getDefaultSensor(1), 2);
            }
        }
    }

    public void onAppBackgrounded() {
        synchronized (this) {
            SensorManager A0A = this.A01.A0A();
            if (A0A != null) {
                C204239pg r0 = this.A00;
                if (r0 == null) {
                    r0 = new C204239pg(this);
                    this.A00 = r0;
                }
                A0A.unregisterListener(r0);
            }
        }
    }

    public AnonymousClass1UY(C21060yb r1) {
        this.A01 = r1;
    }
}
