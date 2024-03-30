package com.whatsapp.media;

import X.AnonymousClass000;
import X.C90474aD;

public class OggAnalyzer {
    public static native OggFileReport examineOggStream(String str);

    public class OggAnalyzerException extends Exception {
        public final int errorCode;

        public OggAnalyzerException(int i) {
            this.errorCode = i;
        }

        public String toString() {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("OggAnalyzerException(errorCode=");
            A0u.append(this.errorCode);
            return C90474aD.A0f(A0u);
        }
    }

    public class OggFileReport {
        public final int channels;
        public final float fileDurationSeconds;
        public final boolean isAudioStreamOpus;
        public final int numberOfStreams;
        public final int samplingRate;

        public OggFileReport(float f, int i, int i2, int i3, boolean z) {
            this.fileDurationSeconds = f;
            this.numberOfStreams = i;
            this.samplingRate = i2;
            this.channels = i3;
            this.isAudioStreamOpus = z;
        }

        public String toString() {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("OggFileReport(fileDurationSeconds=");
            A0u.append(this.fileDurationSeconds);
            A0u.append(", numberOfStreams=");
            A0u.append(this.numberOfStreams);
            A0u.append(", samplingRate=");
            A0u.append(this.samplingRate);
            A0u.append(", channels=");
            A0u.append(this.channels);
            A0u.append(", isAudioStreamOpus=");
            A0u.append(this.isAudioStreamOpus);
            return C90474aD.A0f(A0u);
        }
    }
}
