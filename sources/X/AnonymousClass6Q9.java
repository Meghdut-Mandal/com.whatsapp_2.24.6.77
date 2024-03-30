package X;

import android.media.AudioRecord;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.6Q9  reason: invalid class name */
public final class AnonymousClass6Q9 {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final AudioRecord A04;
    public final AnonymousClass17Y A05;
    public final C159727jp A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final C19700wN A0B;
    public final C19970wo A0C;
    public final Object A0D = C36441kJ.A11();
    public final boolean A0E;
    public final short[] A0F;
    public volatile FileOutputStream A0G;

    public AnonymousClass6Q9(C19700wN r5, C20690y0 r6, AnonymousClass17Y r7, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C19970wo r10, C20810yC r11, C159727jp r12) {
        int A042 = C36361kB.A04(r10, r11, 1);
        C36321k7.A1A(r7, audioRecordFactory, opusRecorderFactory, r6, 3);
        AnonymousClass00C.A0D(r5, 8);
        this.A0C = r10;
        this.A05 = r7;
        this.A06 = r12;
        this.A0B = r5;
        Boolean bool = C18750th.A01;
        this.A07 = C36431kI.A1I(new AnonymousClass7N0(r6));
        this.A08 = C36431kI.A1I(new AnonymousClass7N1(this));
        this.A0A = C36431kI.A1I(new AnonymousClass7N2(this));
        this.A09 = C36431kI.A1I(new C153377Oc(opusRecorderFactory, r11, this));
        this.A0E = r11.A0E(1139);
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, A042);
        this.A04 = audioRecordFactory.createAudioRecord(44100, minBufferSize);
        this.A0F = new short[(((minBufferSize == -2 || minBufferSize == -1) ? 88200 : minBufferSize) / A042)];
    }

    public final void A04() {
        this.A03 = true;
        ((OpusRecorder) this.A09.getValue()).prepare();
    }

    public static boolean A00(AnonymousClass6Q9 r0) {
        return ((OpusRecorder) r0.A09.getValue()).isRecording();
    }

    public static final boolean A01(AnonymousClass6Q9 r4) {
        if (r4.A0G == null) {
            synchronized (r4.A0D) {
                if (r4.A0G == null) {
                    try {
                        AnonymousClass00T r2 = r4.A0A;
                        if (((File) r2.getValue()).createNewFile()) {
                            r4.A0G = C90524aI.A0W((File) r2.getValue());
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("voicerecorder/unable to create visualization file; visualizationPath=");
                            C36341k9.A1O(A0u, ((File) r2.getValue()).getPath());
                        }
                    } catch (IOException e) {
                        Log.e("voicerecorder/error creating visualization file ", e);
                    }
                }
            }
        }
        if (r4.A0G == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[Catch:{ IOException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A02() {
        /*
            r8 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 0
            r0 = 23
            android.media.AudioRecord r2 = r8.A04
            short[] r6 = r8.A0F
            int r1 = r6.length
            if (r3 < r0) goto L_0x004f
            r0 = 1
            int r5 = r2.read(r6, r7, r1, r0)
        L_0x0011:
            r3 = 0
            if (r5 <= 0) goto L_0x002f
            r8.A00 = r3
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0024
            r8.A02 = r7
            X.17Y r1 = r8.A05
            r0 = 35
        L_0x0021:
            X.C1497472p.A00(r1, r8, r0)
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r7 >= r5) goto L_0x0054
            short r0 = r6[r7]
            if (r0 <= r1) goto L_0x002c
            r1 = r0
        L_0x002c:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x002f:
            long r1 = r8.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            long r3 = android.os.SystemClock.elapsedRealtime()
            if (r0 != 0) goto L_0x003c
            r8.A00 = r3
            goto L_0x0024
        L_0x003c:
            long r3 = r3 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0024
            r0 = 1
            r8.A02 = r0
            X.17Y r1 = r8.A05
            r0 = 36
            goto L_0x0021
        L_0x004f:
            int r5 = r2.read(r6, r7, r1)
            goto L_0x0011
        L_0x0054:
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x005d
            if (r5 != 0) goto L_0x005d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x005c:
            return r2
        L_0x005d:
            double r0 = (double) r1
            double r3 = java.lang.Math.log(r0)
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r3 = r3 * r0
            r0 = 1070224481(0x3fca5461, float:1.5807)
            double r0 = (double) r0
            double r3 = r3 - r0
            float r2 = (float) r3
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = X.C15040mb.A01(r2, r1, r0)
            boolean r0 = A01(r8)     // Catch:{ IOException -> 0x008a }
            if (r0 == 0) goto L_0x005c
            java.io.FileOutputStream r1 = r8.A0G     // Catch:{ IOException -> 0x008a }
            if (r1 == 0) goto L_0x0085
            r0 = 100
            float r0 = (float) r0     // Catch:{ IOException -> 0x008a }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ IOException -> 0x008a }
            r1.write(r0)     // Catch:{ IOException -> 0x008a }
            return r2
        L_0x0085:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ IOException -> 0x008a }
            throw r0     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            r1 = move-exception
            java.lang.String r0 = "voicerecorder/getandstorevisualizationvalue/ error writing visualization file data "
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Q9.A02():float");
    }

    public final File A03() {
        if (!this.A03) {
            this.A0B.A0E("VoiceRecorder/getPreparedFile called without preparing", "", true);
        }
        return (File) this.A08.getValue();
    }

    public final void A05() {
        ((OpusRecorder) this.A09.getValue()).start();
        AudioRecord audioRecord = this.A04;
        if (audioRecord.getState() == 1) {
            audioRecord.startRecording();
        }
    }

    public final void A06() {
        AnonymousClass00T r1 = this.A09;
        ((OpusRecorder) r1.getValue()).stop();
        this.A01 = ((OpusRecorder) r1.getValue()).getPageNumber();
    }

    public final void A07() {
        this.A04.stop();
        this.A00 = 0;
        this.A02 = false;
        C1497472p.A00(this.A05, this, 34);
    }
}
