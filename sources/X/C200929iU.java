package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: X.9iU  reason: invalid class name and case insensitive filesystem */
public final class C200929iU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C207099uY A07;
    public final C23092B4c[] A08;

    public static AudioAttributes A00(C199379fD r1) {
        C190999Be r0 = r1.A00;
        if (r0 == null) {
            r0 = new C190999Be(r1);
            r1.A00 = r0;
        }
        return r0.A00;
    }

    public static AudioTrack A01(C199379fD r4, C200929iU r5, int i) {
        int i2 = r5.A06;
        int i3 = r5.A02;
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(A00(r4)).setAudioFormat(new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(r5.A03).build());
        boolean z = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(r5.A00).setSessionId(i);
        if (r5.A04 != 1) {
            z = false;
        }
        return sessionId.setOffloadedPlayback(z).build();
    }

    public C200929iU(C207099uY r1, C23092B4c[] b4cArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A07 = r1;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A08 = b4cArr;
    }
}
