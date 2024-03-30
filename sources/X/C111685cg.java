package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: X.5cg  reason: invalid class name and case insensitive filesystem */
public abstract class C111685cg {
    public static /* synthetic */ boolean A00(AudioManager audioManager) {
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return false;
        }
        int type = communicationDevice.getType();
        if (type == 7 || type == 8 || type == 26) {
            return true;
        }
        return false;
    }
}
