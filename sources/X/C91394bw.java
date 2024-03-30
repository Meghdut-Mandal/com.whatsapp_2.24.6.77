package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.4bw  reason: invalid class name and case insensitive filesystem */
public class C91394bw extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass523 A00;

    public C91394bw(AnonymousClass523 r1) {
        this.A00 = r1;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }
}
