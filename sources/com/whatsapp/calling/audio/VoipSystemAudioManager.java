package com.whatsapp.calling.audio;

import X.C131176Oa;
import X.C36321k7;
import android.os.Build;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;

public final class VoipSystemAudioManager {
    public final C131176Oa screenShareLoggingHelper;
    public final ScreenShareResourceManager screenShareResourceManager;

    public final synchronized VoipSystemAudioDeviceFactory createSystemAudioDevice(int i) {
        ScreenShareAudioCapturer screenShareAudioCapturer;
        if (Build.VERSION.SDK_INT < 29) {
            Log.w("createSystemAudioDevice: unsupported API level");
            screenShareAudioCapturer = null;
        } else {
            Log.i("createSystemAudioDevice: creating system audio device");
            screenShareAudioCapturer = new ScreenShareAudioCapturer(i, this.screenShareLoggingHelper, this.screenShareResourceManager);
        }
        return screenShareAudioCapturer;
    }

    public VoipSystemAudioManager(C131176Oa r1, ScreenShareResourceManager screenShareResourceManager2) {
        C36321k7.A0x(r1, screenShareResourceManager2);
        this.screenShareLoggingHelper = r1;
        this.screenShareResourceManager = screenShareResourceManager2;
    }
}
