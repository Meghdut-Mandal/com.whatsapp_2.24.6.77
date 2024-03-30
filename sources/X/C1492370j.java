package X;

import android.view.View;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.70j  reason: invalid class name and case insensitive filesystem */
public final class C1492370j implements C159727jp {
    public final /* synthetic */ C37151lt A00;

    public C1492370j(C37151lt r1) {
        this.A00 = r1;
    }

    public void B5b() {
        C148836zV r0 = (C148836zV) this.A00.A0E.get();
        if (r0 != null) {
            boolean z = r0.A0A;
            C160187kb r02 = r0.A0H;
            if (z) {
                r02.BJQ();
            } else {
                r02.BJP();
            }
        }
    }

    public void Bto() {
        C148836zV r0 = (C148836zV) this.A00.A0E.get();
        if (r0 != null) {
            VoiceRecordingView voiceRecordingView = (VoiceRecordingView) r0.A0H;
            voiceRecordingView.A03.setVisibility(0);
            voiceRecordingView.A0A.setVisibility(4);
            VoiceVisualizer voiceVisualizer = voiceRecordingView.A07;
            if (voiceVisualizer == null) {
                throw C36331k8.A0d("previewVoiceVisualizer");
            }
            voiceVisualizer.setVisibility(4);
            voiceRecordingView.A05.setVisibility(4);
            voiceRecordingView.A01.setVisibility(4);
            if (voiceRecordingView.A02 == null) {
                voiceRecordingView.A02 = new C92494e4((C05250Oz) null, 0.0f, 0.0f, 7, 0);
            }
            View view = voiceRecordingView.A00;
            view.setVisibility(0);
            view.startAnimation(voiceRecordingView.A02);
        }
    }
}
