package com.whatsapp.calling.audio;

public interface VoipSystemAudioDeviceFactory {
    int read(short[] sArr, int i, int i2);

    boolean startCapture();

    boolean stopCapture();
}
