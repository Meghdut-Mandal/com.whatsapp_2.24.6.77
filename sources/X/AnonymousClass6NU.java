package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;

/* renamed from: X.6NU  reason: invalid class name */
public class AnonymousClass6NU {
    public Object A00;
    public final Handler A01;
    public final Handler A02;
    public final AnonymousClass6KX A03;
    public final C23112B5r A04;
    public final Context A05;
    public final AudioManager A06;
    public final AudioAttributesCompat A07;
    public final C114685he A08;
    public final C114695hf A09 = new C114695hf(this);
    public final C114705hg A0A;
    public final C114745hl A0B;
    public final C23110B5p A0C;
    public final AnonymousClass5YO A0D;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(X.AnonymousClass6NU r21) {
        /*
            r7 = r21
            monitor-enter(r7)
            X.6KX r11 = r7.A03     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "dAS"
            X.AnonymousClass6KX.A00(r11, r0)     // Catch:{ all -> 0x0165 }
            X.B5r r0 = r7.A04     // Catch:{ all -> 0x0165 }
            r18 = r0
            java.lang.String r13 = "audio_pipeline_destroying"
            java.lang.String r6 = "AudioPipelineController"
            int r0 = r7.hashCode()     // Catch:{ all -> 0x0165 }
            long r0 = (long) r0     // Catch:{ all -> 0x0165 }
            r9 = 0
            r14 = r6
            r15 = r9
            r16 = r0
            r12 = r18
            r12.BOd(r13, r14, r15, r16)     // Catch:{ all -> 0x0165 }
            X.5hg r0 = r7.A0A     // Catch:{ all -> 0x0165 }
            r0.A00 = r9     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = "UNSET"
            java.lang.String r0 = "handleSetAudioMixing %s"
            X.AnonymousClass6YR.A02(r1, r6, r0)     // Catch:{ all -> 0x0165 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0165 }
            r0 = 23
            if (r1 < r0) goto L_0x003d
            java.lang.Object r1 = r7.A00     // Catch:{ all -> 0x0165 }
            if (r1 == 0) goto L_0x003d
            android.media.AudioManager r0 = r7.A06     // Catch:{ all -> 0x0165 }
            android.media.AudioDeviceCallback r1 = (android.media.AudioDeviceCallback) r1     // Catch:{ all -> 0x0165 }
            r0.unregisterAudioDeviceCallback(r1)     // Catch:{ all -> 0x0165 }
        L_0x003d:
            java.lang.String r0 = "dAE"
            X.AnonymousClass6KX.A00(r11, r0)     // Catch:{ all -> 0x0165 }
            android.os.Handler r5 = r7.A01     // Catch:{ all -> 0x0165 }
            X.6Jx r3 = X.C130146Jx.A02     // Catch:{ all -> 0x0165 }
            r13 = 1
            if (r5 == 0) goto L_0x005a
            java.util.Map r4 = r3.A00     // Catch:{ all -> 0x0165 }
            java.lang.Object r8 = r4.get(r5)     // Catch:{ all -> 0x0165 }
            android.os.HandlerThread r8 = (android.os.HandlerThread) r8     // Catch:{ all -> 0x0165 }
            if (r8 != 0) goto L_0x00ba
            java.lang.String r1 = "ThreadPool"
            java.lang.String r0 = "Trying to quit thread not managed by ThreadPool - abort"
            X.AnonymousClass6YR.A07(r1, r0)     // Catch:{ all -> 0x0165 }
        L_0x005a:
            java.lang.String r17 = "audio_pipeline_destroyed"
            int r0 = r7.hashCode()     // Catch:{ all -> 0x0165 }
            long r14 = (long) r0     // Catch:{ all -> 0x0165 }
            android.media.AudioManager r12 = r7.A06     // Catch:{ all -> 0x0165 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0165 }
            r0 = 6
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0165 }
            r8.<init>(r0)     // Catch:{ all -> 0x0165 }
            r10 = 0
            r5 = 2
            java.lang.Integer r1 = r11.A01     // Catch:{ all -> 0x0165 }
            if (r1 == 0) goto L_0x008f
            java.lang.Object[] r2 = X.C36441kJ.A1Q()     // Catch:{ all -> 0x0165 }
            boolean r0 = r11.A02     // Catch:{ all -> 0x0165 }
            X.AnonymousClass000.A1L(r2, r0, r10)     // Catch:{ all -> 0x0165 }
            r2[r13] = r1     // Catch:{ all -> 0x0165 }
            long r0 = r11.A00     // Catch:{ all -> 0x0165 }
            long r3 = r3 - r0
            X.AnonymousClass000.A1M(r2, r5, r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "%d_%d_%d_ms"
            java.lang.String r1 = java.lang.String.format(r9, r0, r2)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "AP_AudioDeviceChanged"
            r8.put(r0, r1)     // Catch:{ all -> 0x0165 }
        L_0x008f:
            java.lang.String r0 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r1 = r12.getProperty(r0)     // Catch:{ all -> 0x0165 }
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "AP_OutputFramesPerBuffer"
            r8.put(r0, r1)     // Catch:{ all -> 0x0165 }
        L_0x009c:
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r1 = r12.getProperty(r0)     // Catch:{ all -> 0x0165 }
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = "AP_OutputSampleRate"
            r8.put(r0, r1)     // Catch:{ all -> 0x0165 }
        L_0x00a9:
            int r0 = r12.getMode()     // Catch:{ all -> 0x0165 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = "AP_AMMode"
            r8.put(r0, r1)     // Catch:{ all -> 0x0165 }
            X.5oH r3 = r11.A03     // Catch:{ all -> 0x0165 }
            monitor-enter(r3)     // Catch:{ all -> 0x0165 }
            goto L_0x0118
        L_0x00ba:
            java.lang.String r2 = "ThreadPool"
            java.lang.String r1 = "Quitting thread %s"
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x0165 }
            X.AnonymousClass6YR.A03(r0, r2, r1)     // Catch:{ all -> 0x0165 }
            r4.remove(r5)     // Catch:{ all -> 0x0165 }
            monitor-enter(r3)     // Catch:{ all -> 0x0165 }
            java.util.Map r4 = r3.A01     // Catch:{ all -> 0x015f }
            java.lang.Object r5 = r4.get(r8)     // Catch:{ all -> 0x015f }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r5 = (com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus) r5     // Catch:{ all -> 0x015f }
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.TAKEN     // Catch:{ all -> 0x015f }
            if (r5 != r0) goto L_0x00ff
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r1 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.AVAILABLE     // Catch:{ all -> 0x015f }
            r4.put(r8, r1)     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r4.get(r8)     // Catch:{ all -> 0x015d }
            if (r0 != r1) goto L_0x00f9
            com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus r0 = com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus.QUITTING     // Catch:{ all -> 0x015d }
            r4.put(r8, r0)     // Catch:{ all -> 0x015d }
            r8.quit()     // Catch:{ all -> 0x015d }
            r4.remove(r8)     // Catch:{ InterruptedException -> 0x00f5 }
            java.lang.String r1 = "Thread %s killed."
            java.lang.String r0 = r8.getName()     // Catch:{ InterruptedException -> 0x00f5 }
            X.AnonymousClass6YR.A03(r0, r2, r1)     // Catch:{ InterruptedException -> 0x00f5 }
            goto L_0x0108
        L_0x00f5:
            X.C90484aE.A0z()     // Catch:{ all -> 0x015d }
            goto L_0x0108
        L_0x00f9:
            java.lang.String r0 = "Trying to kill thread that is not AVAILABLE"
            X.AnonymousClass6YR.A07(r2, r0)     // Catch:{ all -> 0x015d }
            goto L_0x0108
        L_0x00ff:
            java.lang.String r1 = "Trying to quit thread that is not TAKEN but in %s"
            java.lang.Object[] r0 = X.C36431kI.A1Z(r5, r13)     // Catch:{ all -> 0x015f }
            X.AnonymousClass6YR.A0G(r2, r1, r0)     // Catch:{ all -> 0x015f }
        L_0x0108:
            monitor-exit(r3)     // Catch:{ all -> 0x015f }
            java.lang.String r1 = "Number of threads in pool: %d"
            int r0 = r4.size()     // Catch:{ all -> 0x0165 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0165 }
            X.AnonymousClass6YR.A03(r0, r2, r1)     // Catch:{ all -> 0x0165 }
            goto L_0x005a
        L_0x0118:
            java.util.LinkedList r10 = r3.A01     // Catch:{ all -> 0x0162 }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x0148
            long r0 = r3.A00     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0162 }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x0162 }
        L_0x012a:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x013d
            java.lang.String r2 = X.AnonymousClass001.A0C(r4)     // Catch:{ all -> 0x0162 }
            r5.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = ","
            r5.append(r2)     // Catch:{ all -> 0x0162 }
            goto L_0x012a
        L_0x013d:
            java.lang.String r9 = X.C36411kG.A11(r5, r0)     // Catch:{ all -> 0x0162 }
            r10.clear()     // Catch:{ all -> 0x0162 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0162 }
        L_0x0148:
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
            if (r9 == 0) goto L_0x0150
            java.lang.String r0 = "AP_CallsSinceSnapshot"
            r8.put(r0, r9)     // Catch:{ all -> 0x0165 }
        L_0x0150:
            r16 = r18
            r18 = r6
            r19 = r8
            r20 = r14
            r16.BOd(r17, r18, r19, r20)     // Catch:{ all -> 0x0165 }
            monitor-exit(r7)
            return
        L_0x015d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x015f }
        L_0x015f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015f }
            goto L_0x0164
        L_0x0162:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0165 }
        L_0x0164:
            throw r0     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NU.A00(X.6NU):void");
    }

    public AnonymousClass6NU(Context context, Handler handler, C114685he r7, AnonymousClass6KX r8, C23112B5r b5r, C23110B5p b5p, AnonymousClass5YO r11) {
        C114705hg r2 = new C114705hg();
        this.A0A = r2;
        new C133596Zf();
        Context applicationContext = context.getApplicationContext();
        this.A05 = applicationContext;
        this.A0C = b5p;
        this.A04 = b5r;
        this.A0D = r11;
        this.A03 = r8;
        this.A08 = r7;
        this.A02 = C36341k9.A0H();
        if (Build.VERSION.SDK_INT >= 23) {
            this.A00 = new C91414by(this);
        }
        this.A01 = handler;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        if (audioManager != null) {
            this.A06 = audioManager;
            this.A0B = new C114745hl(audioManager);
            C158907iR r3 = new C114435hF().A00;
            AudioAttributes.Builder builder = ((C138546iH) r3).A00;
            builder.setLegacyStreamType(3);
            r3.Bse(1);
            builder.setContentType(2);
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            this.A07 = new AudioAttributesCompat(r3.B21());
            r2.A00 = b5r;
            AnonymousClass6KX.A00(r8, "c");
            AnonymousClass6YR.A04("AudioPipelineController", "AP ctor finished");
            return;
        }
        throw C90514aH.A0s("Cannot obtain AUDIO_SERVICE");
    }
}
