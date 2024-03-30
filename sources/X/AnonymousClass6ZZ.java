package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;

/* renamed from: X.6ZZ  reason: invalid class name */
public class AnonymousClass6ZZ implements SensorEventListener {
    public boolean A00;
    public final /* synthetic */ AnonymousClass7gH A01;
    public final /* synthetic */ C1260962n A02;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass6ZZ(AnonymousClass7gH r1, C1260962n r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f < 5.0f && f != this.A02.A01.getMaximumRange()) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            C164857sU r1 = (C164857sU) this.A01;
            if (r1.A01 != 0) {
                AnonymousClass6YM r2 = (AnonymousClass6YM) r1.A00;
                C18740tg.A01();
                C36321k7.A1K(r2, "voip/service/proximitylistener.onchanged ", AnonymousClass000.A0u());
                if (z) {
                    AnonymousClass6YM.A05(r2);
                } else {
                    AnonymousClass6YM.A04(r2);
                }
            } else {
                AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) r1.A00;
                AnonymousClass00C.A0D(audioChatCallingViewModel, 0);
                AudioChatCallingViewModel.A09(audioChatCallingViewModel, z);
            }
        }
    }
}
