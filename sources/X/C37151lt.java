package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.1lt  reason: invalid class name and case insensitive filesystem */
public final class C37151lt extends HandlerThread {
    public float A00;
    public int A01;
    public long A02;
    public Handler A03;
    public AnonymousClass6Q9 A04;
    public final long A05;
    public final Handler A06 = C36341k9.A0H();
    public final C19700wN A07;
    public final C20690y0 A08;
    public final AnonymousClass17Y A09;
    public final AudioRecordFactory A0A;
    public final OpusRecorderFactory A0B;
    public final C19970wo A0C;
    public final C20810yC A0D;
    public final WeakReference A0E;

    public static final void A00(C37151lt r2, boolean z) {
        File file;
        File A032;
        AnonymousClass6Q9 r1 = r2.A04;
        if (r1 != null) {
            try {
                r1.A06();
                r1.A07();
                if (AnonymousClass6Q9.A01(r1)) {
                    FileOutputStream fileOutputStream = r1.A0G;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    } else {
                        throw C36381kD.A0l();
                    }
                }
                if (z) {
                    AnonymousClass6Q9 r0 = r2.A04;
                    if (!(r0 == null || (A032 = r0.A03()) == null)) {
                        A032.delete();
                    }
                    AnonymousClass6Q9 r02 = r2.A04;
                    if (!(r02 == null || (file = (File) r02.A0A.getValue()) == null)) {
                        file.delete();
                    }
                }
                ((OpusRecorder) r1.A09.getValue()).close();
                r1.A04.release();
            } catch (Throwable th) {
                new AnonymousClass03N(th);
            }
            r2.A04 = null;
            r2.quit();
            r2.interrupt();
        }
    }

    public final void A01() {
        if (this.A03 == null) {
            start();
            Handler handler = new Handler(getLooper());
            this.A03 = handler;
            handler.post(C81183wb.A00(this, 28));
            handler.postDelayed(C81183wb.A00(this, 27), 16);
            handler.post(C81183wb.A00(this, 26));
            handler.postDelayed(C81183wb.A00(this, 31), this.A05);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37151lt(C19700wN r2, C20690y0 r3, AnonymousClass17Y r4, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C19970wo r7, C20810yC r8, C148836zV r9, long j) {
        super("VoiceStatusRecorderThread");
        C36321k7.A1B(r7, r8, r4, r2, r3);
        C36321k7.A10(audioRecordFactory, opusRecorderFactory);
        this.A0C = r7;
        this.A0D = r8;
        this.A09 = r4;
        this.A07 = r2;
        this.A08 = r3;
        this.A0A = audioRecordFactory;
        this.A0B = opusRecorderFactory;
        this.A05 = j;
        this.A0E = AnonymousClass001.A0F(r9);
    }
}
