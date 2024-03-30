package com.whatsapp.audioRecording;

import android.media.AudioRecord;

public class AudioRecordFactory {
    public AudioRecord createAudioRecord(int i, int i2) {
        return new AudioRecord(0, i, 16, 2, i2);
    }
}
