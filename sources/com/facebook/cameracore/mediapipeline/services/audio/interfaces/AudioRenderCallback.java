package com.facebook.cameracore.mediapipeline.services.audio.interfaces;

public abstract class AudioRenderCallback {
    public abstract void onSamplesReady(byte[] bArr, int i, int i2, int i3, int i4);

    public AudioRenderCallback() {
        throw null;
    }
}
