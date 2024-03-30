package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.ArrayList;

/* renamed from: X.6HL  reason: invalid class name */
public abstract class AnonymousClass6HL {
    public static ArrayList A00(AudioManager audioManager) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (audioManager != null) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (A01(audioDeviceInfo)) {
                    A0I.add(audioDeviceInfo);
                }
                AnonymousClass000.A1F(A0I2, audioDeviceInfo.getType());
            }
            C36321k7.A1K(A0I2, "BluetoothHeadsetDetector/getConnectedBluetoothHeadsets output device types: ", AnonymousClass000.A0u());
        }
        return A0I;
    }

    public static boolean A01(AudioDeviceInfo audioDeviceInfo) {
        int type = audioDeviceInfo.getType();
        if (type == 7 || type == 26) {
            return true;
        }
        return false;
    }
}
