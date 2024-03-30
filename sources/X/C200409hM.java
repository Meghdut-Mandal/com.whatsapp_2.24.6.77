package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.conversationrow.WaveformVisualizerView;

/* renamed from: X.9hM  reason: invalid class name and case insensitive filesystem */
public class C200409hM implements AnonymousClass7gO {
    public Object A00;
    public final int A01;

    public C200409hM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bkd(byte[] bArr) {
        ConversationRowAudioPreview conversationRowAudioPreview;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            conversationRowAudioPreview = ((C182508pC) obj).A00;
        } else {
            conversationRowAudioPreview = ((C175058Zm) obj).A02;
            if (conversationRowAudioPreview == null) {
                return;
            }
        }
        WaveformVisualizerView waveformVisualizerView = conversationRowAudioPreview.A01;
        waveformVisualizerView.A02 = bArr;
        waveformVisualizerView.invalidate();
    }
}
