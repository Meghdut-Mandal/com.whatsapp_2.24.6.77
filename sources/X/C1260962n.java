package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.62n  reason: invalid class name and case insensitive filesystem */
public final class C1260962n {
    public SensorEventListener A00;
    public final Sensor A01;
    public final SensorManager A02;

    public void A00(AnonymousClass7gH r5) {
        SensorEventListener sensorEventListener = this.A00;
        if (sensorEventListener != null) {
            this.A02.unregisterListener(sensorEventListener, this.A01);
            this.A00 = null;
        }
        if (r5 != null) {
            AnonymousClass6ZZ r3 = new AnonymousClass6ZZ(r5, this);
            this.A00 = r3;
            this.A02.registerListener(r3, this.A01, 2);
        }
    }

    public C1260962n(C21060yb r3) {
        SensorManager A0A = r3.A0A();
        this.A02 = A0A;
        this.A01 = A0A.getDefaultSensor(8);
    }
}
