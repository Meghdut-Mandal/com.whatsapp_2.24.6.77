package X;

import android.os.SystemClock;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.whatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;

/* renamed from: X.72t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1497872t implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C37151lt A01;

    public /* synthetic */ C1497872t(C37151lt r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public final void run() {
        C37151lt r0 = this.A01;
        float f = this.A00;
        C148836zV r02 = (C148836zV) r0.A0E.get();
        if (r02 != null) {
            VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = ((VoiceRecordingView) r02.A0H).A0A;
            Boolean bool = C18750th.A01;
            voiceStatusRecordingVisualizer.getTime();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = voiceStatusRecordingVisualizer.A00;
            if (j != 0) {
                voiceStatusRecordingVisualizer.A01 = Math.max(elapsedRealtime - j, 0);
            }
            voiceStatusRecordingVisualizer.A00 = elapsedRealtime;
            voiceStatusRecordingVisualizer.A0B.add(Float.valueOf(f));
            if (!voiceStatusRecordingVisualizer.A05) {
                voiceStatusRecordingVisualizer.A05 = true;
                voiceStatusRecordingVisualizer.invalidate();
            }
        }
    }
}
