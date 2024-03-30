package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.os.SystemClock;

/* renamed from: X.4by  reason: invalid class name and case insensitive filesystem */
public class C91414by extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass6NU A00;

    public static String A00(int i) {
        switch (i) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            default:
                return "unknown";
        }
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            AnonymousClass6YR.A02(A00(audioDeviceInfo.getType()), "AudioPipelineController", "onAudioDevicesAdded %s");
            AnonymousClass6KX r2 = this.A00.A03;
            r2.A01 = Integer.valueOf(audioDeviceInfo.getType());
            r2.A02 = true;
            r2.A00 = SystemClock.elapsedRealtime();
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            AnonymousClass6YR.A02(A00(audioDeviceInfo.getType()), "AudioPipelineController", "onAudioDevicesRemoved %s");
            AnonymousClass6KX r2 = this.A00.A03;
            r2.A01 = Integer.valueOf(audioDeviceInfo.getType());
            r2.A02 = false;
            r2.A00 = SystemClock.elapsedRealtime();
        }
    }

    public C91414by(AnonymousClass6NU r1) {
        this.A00 = r1;
    }
}
