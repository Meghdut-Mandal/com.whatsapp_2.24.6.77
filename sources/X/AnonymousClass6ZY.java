package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.6ZY  reason: invalid class name */
public class AnonymousClass6ZY implements SensorEventListener {
    public final /* synthetic */ C148826zU A00;
    public final /* synthetic */ C148826zU A01;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass6ZY(C148826zU r1, C148826zU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        C148826zU r0 = this.A01;
        C148826zU r3 = this.A00;
        if (r0 != r3) {
            int i = C148826zU.A12;
            SensorManager sensorManager = r3.A0C;
            if (!(sensorManager == null || (sensorEventListener = r3.A0B) == null || (sensor = r3.A0A) == null)) {
                sensorManager.unregisterListener(sensorEventListener, sensor);
                r3.A0C = null;
            }
            C148826zU.A06(r3);
            return;
        }
        float f = sensorEvent.values[0];
        if (f < 5.0f) {
            int i2 = C148826zU.A12;
            if (f != r3.A0A.getMaximumRange()) {
                r3.A0G(true);
                return;
            }
        }
        r3.A0G(false);
    }
}
