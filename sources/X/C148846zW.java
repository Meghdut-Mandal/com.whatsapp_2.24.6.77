package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.6zW  reason: invalid class name and case insensitive filesystem */
public final class C148846zW implements C158557hh {
    public final /* synthetic */ VoiceRecordingView A00;

    public C148846zW(VoiceRecordingView voiceRecordingView) {
        this.A00 = voiceRecordingView;
    }

    public void Bg6(int i) {
        long j;
        AnonymousClass7d7 r5 = this.A00.A09;
        if (r5 != null) {
            C148836zV r52 = (C148836zV) r5;
            if (i != 0) {
                j = C148836zV.A00(r52) / ((long) i);
            } else {
                j = -1;
            }
            r52.A01 = j;
            if (r52.A0A && r52.A06 == null) {
                C37151lt A002 = r52.A0D.A00(r52, j);
                r52.A06 = A002;
                A002.A01();
                C55902vN.A00(C36361kB.A06((View) r52.A0H));
            }
        }
    }
}
