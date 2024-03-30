package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.4bx  reason: invalid class name and case insensitive filesystem */
public class C91404bx extends AudioDeviceCallback {
    public final /* synthetic */ C90964bE A00;

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (AnonymousClass6HL.A01(A01)) {
                C90964bE.A03(this.A00, 2);
                return;
            }
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (AnonymousClass6HL.A01(A01)) {
                C90964bE.A03(this.A00, 0);
                return;
            }
        }
    }

    public C91404bx(C90964bE r1) {
        this.A00 = r1;
    }
}
