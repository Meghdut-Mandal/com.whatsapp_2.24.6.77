package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.A9z  reason: case insensitive filesystem */
public abstract class C21139A9z implements C160817ld {
    public int A00 = -1;
    public final ConversationRowAudioPreview A01;
    public final C22932Ayi A02;
    public final C22933Ayj A03;
    public final AudioPlayerView A04;

    public void BcI(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(BBi().A0B * 1000);
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
        this.A02.BWJ(BBi().A0B);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    public void Bdg(int i) {
        int i2 = i / 1000;
        if (this.A00 != i2) {
            this.A00 = i2;
            this.A02.BWJ(i2);
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
    }

    public void BfR() {
        this.A04.setPlayButtonState(1);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            C165597tg.A12(conversationRowAudioPreview.A01, conversationRowAudioPreview);
        }
    }

    public void Bh8(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(1);
        audioPlayerView.setSeekbarMax(i);
        this.A00 = -1;
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            C165597tg.A12(conversationRowAudioPreview.A01, conversationRowAudioPreview);
        }
    }

    public void Bhp(int i, boolean z) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        if (z) {
            audioPlayerView.setSeekbarProgress(0);
        }
        this.A02.BWJ(i / 1000);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
        this.A03.BgZ(false);
    }

    public C21139A9z(ConversationRowAudioPreview conversationRowAudioPreview, C22932Ayi ayi, C22933Ayj ayj, AudioPlayerView audioPlayerView) {
        this.A04 = audioPlayerView;
        this.A02 = ayi;
        this.A03 = ayj;
        this.A01 = conversationRowAudioPreview;
    }
}
