package com.whatsapp.calling.audio;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass968;
import X.AnonymousClass9MS;
import X.AnonymousClass9W5;
import X.C131176Oa;
import X.C18740tg;
import X.C21123A9j;
import X.C36321k7;
import android.media.AudioRecord;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScreenShareAudioCapturer implements VoipSystemAudioDeviceFactory {
    public static final AnonymousClass968 Companion = new AnonymousClass968();
    @Deprecated
    public static final int STATE_DISABLED = 0;
    @Deprecated
    public static final int STATE_ENABLED = 1;
    @Deprecated
    public static final int STATE_NOT_SET = -1;
    public AnonymousClass9MS audioRecorder;
    public final int audioSampleRate;
    public final C21123A9j mediaProjectionListener;
    public AtomicInteger mediaProjectionState = new AtomicInteger(-1);
    public final C131176Oa screenShareLoggingHelper;
    public final ScreenShareResourceManager screenShareResourceManager;

    public int read(short[] sArr, int i, int i2) {
        C131176Oa r2;
        int i3;
        AnonymousClass00C.A0D(sArr, 0);
        if (this.mediaProjectionState.get() != 1) {
            stopCapture();
            Log.e("ScreenShareAudioCapturer mediaprojection state not enabled");
            C131176Oa r22 = this.screenShareLoggingHelper;
            r22.A01 |= 1;
            r22.A03 = 1;
        } else {
            try {
                AnonymousClass9MS r4 = this.audioRecorder;
                if (r4 != null) {
                    AudioRecord audioRecord = r4.A00;
                    if (audioRecord == null) {
                        C18740tg.A0D(false, "captureAudio() audio record not initialized");
                        r2 = r4.A03;
                        i3 = 32;
                    } else {
                        int read = audioRecord.read(sArr, i, i2);
                        if (read >= 0) {
                            return new AnonymousClass9W5(sArr, r4.A01, read).A00;
                        }
                        C36321k7.A1S("captureAudio() No audio frame data available with read error:", AnonymousClass000.A0u(), read);
                        r2 = r4.A03;
                        i3 = 64;
                    }
                    r2.A01 |= i3;
                    r2.A03 = i3;
                    return -1;
                }
            } catch (IllegalStateException e) {
                Log.e("ScreenShareAudioCapturer read in invalid state exception", e);
                C131176Oa r23 = this.screenShareLoggingHelper;
                r23.A01 |= 8;
                r23.A03 = 8;
                return -1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startCapture() {
        /*
            r7 = this;
            int r0 = r7.audioSampleRate
            r4 = 0
            if (r0 != 0) goto L_0x001a
            r7.stopCapture()
            X.6Oa r2 = r7.screenShareLoggingHelper
            r1 = 32
            int r0 = r2.A01
            r0 = r0 | 32
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "audioSampleRate must be set to enable ScreenShareAudioCapturer"
            X.C18740tg.A0D(r4, r0)
            return r4
        L_0x001a:
            com.whatsapp.calling.screenshare.ScreenShareResourceManager r0 = r7.screenShareResourceManager     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            android.media.projection.MediaProjection r6 = r0.getMediaProjectionHandle()     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r6 == 0) goto L_0x0096
            java.util.concurrent.atomic.AtomicInteger r1 = r7.mediaProjectionState     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r0 = -1
            r3 = 1
            r1.compareAndSet(r0, r3)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            int r2 = r7.audioSampleRate     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            X.6Oa r1 = r7.screenShareLoggingHelper     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            X.9ZN r0 = new X.9ZN     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            X.9MS r5 = new X.9MS     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r5.<init>(r6, r0, r1, r2)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r7.audioRecorder = r5     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "initAudioRecord() audio record already initialized"
        L_0x003f:
            X.C18740tg.A0D(r4, r0)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
        L_0x0042:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r0 == 0) goto L_0x005c
            int r0 = r0.getState()     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "AudioRecorder Failed to create AudioRecord"
        L_0x004e:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            X.6Oa r1 = r5.A03     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            int r0 = r1.A01     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r0 = r0 | 1
            r1.A01 = r0     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r1.A03 = r3     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            goto L_0x0096
        L_0x005c:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r0 == 0) goto L_0x0063
            r0.startRecording()     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
        L_0x0063:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r0 == 0) goto L_0x0074
            int r1 = r0.getRecordingState()     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r0 = 3
            if (r1 != r0) goto L_0x0074
            java.lang.String r0 = "ScreenShareAudioCapturer startCapture started successfully"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            goto L_0x0095
        L_0x0074:
            java.lang.String r0 = "AudioRecorder Failed to start recording"
            goto L_0x004e
        L_0x0077:
            int r2 = r5.A01     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            if (r2 != 0) goto L_0x007e
            java.lang.String r0 = "initAudioRecord() audio sample rate is zero"
            goto L_0x003f
        L_0x007e:
            r1 = 16
            r0 = 2
            int r0 = android.media.AudioRecord.getMinBufferSize(r2, r1, r0)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            int r1 = r0 * 2
            if (r1 > 0) goto L_0x008c
            java.lang.String r0 = "initAudioRecord() minBufferSize invalid"
            goto L_0x003f
        L_0x008c:
            android.media.projection.MediaProjection r0 = r5.A02     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            android.media.AudioRecord r0 = X.AnonymousClass9ZN.A00(r0, r2, r1)     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            r5.A00 = r0     // Catch:{ IllegalStateException -> 0x00ab, IllegalArgumentException -> 0x009c }
            goto L_0x0042
        L_0x0095:
            return r3
        L_0x0096:
            java.lang.String r0 = "ScreenShareAudioCapturer Unable to startCapture"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00bd
        L_0x009c:
            r3 = move-exception
            X.6Oa r2 = r7.screenShareLoggingHelper
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r2.A01
            r0 = r0 | r1
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "ScreenShareAudioCapturer illegal argument for AudioRecord"
            goto L_0x00ba
        L_0x00ab:
            r3 = move-exception
            X.6Oa r2 = r7.screenShareLoggingHelper
            r1 = 8
            int r0 = r2.A01
            r0 = r0 | 8
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "ScreenShareAudioCapturer exception during startCapture"
        L_0x00ba:
            com.whatsapp.util.Log.e(r0, r3)
        L_0x00bd:
            r7.stopCapture()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.audio.ScreenShareAudioCapturer.startCapture():boolean");
    }

    public boolean stopCapture() {
        try {
            AnonymousClass9MS r1 = this.audioRecorder;
            if (r1 != null) {
                AudioRecord audioRecord = r1.A00;
                if (audioRecord != null) {
                    audioRecord.stop();
                }
                AudioRecord audioRecord2 = r1.A00;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                r1.A00 = null;
            }
        } catch (IllegalStateException e) {
            Log.e("ScreenShareAudioCapturer exception during stopCapture", e);
        }
        this.audioRecorder = null;
        this.screenShareResourceManager.unregisterListener(this.mediaProjectionListener);
        this.mediaProjectionState.set(-1);
        return true;
    }

    public ScreenShareAudioCapturer(int i, C131176Oa r4, ScreenShareResourceManager screenShareResourceManager2) {
        C36321k7.A0z(r4, screenShareResourceManager2);
        this.audioSampleRate = i;
        this.screenShareLoggingHelper = r4;
        this.screenShareResourceManager = screenShareResourceManager2;
        C21123A9j a9j = new C21123A9j(this);
        this.mediaProjectionListener = a9j;
        screenShareResourceManager2.registerListener(a9j);
    }
}
