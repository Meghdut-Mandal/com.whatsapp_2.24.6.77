package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.958  reason: invalid class name */
public class AnonymousClass958 implements AnonymousClass7hV {
    public Object A00;
    public final int A01;

    public AnonymousClass958(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bcq(int i, String str) {
        AudioPlayerMetadataView audioPlayerMetadataView;
        switch (this.A01) {
            case 0:
                ConversationRowAudioPreview conversationRowAudioPreview = ((C182508pC) this.A00).A00;
                conversationRowAudioPreview.setDuration(str);
                if (i != 0) {
                    conversationRowAudioPreview.A01();
                    return;
                } else {
                    C165597tg.A12(conversationRowAudioPreview.A01, conversationRowAudioPreview);
                    return;
                }
            case 1:
                AnonymousClass00C.A0D(str, 2);
                audioPlayerMetadataView = ((C182528pE) this.A00).A04;
                if (audioPlayerMetadataView == null) {
                    throw C36331k8.A0d("audioPlayerMetadataView");
                }
                break;
            default:
                audioPlayerMetadataView = ((C182518pD) this.A00).A04;
                break;
        }
        audioPlayerMetadataView.setDescription(str);
    }
}
