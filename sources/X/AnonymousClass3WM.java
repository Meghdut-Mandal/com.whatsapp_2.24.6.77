package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.3WM  reason: invalid class name */
public class AnonymousClass3WM implements SensorEventListener {
    public final /* synthetic */ PopupNotification A00;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass3WM(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        PopupNotification popupNotification = this.A00;
        float f = sensorEvent.values[0];
        popupNotification.A00 = f;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("popupnotification/proximity:");
        A0u.append(f);
        C36411kG.A1P(A0u);
    }
}
