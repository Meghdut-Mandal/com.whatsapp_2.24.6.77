package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.8pC  reason: invalid class name and case insensitive filesystem */
public class C182508pC extends C47142dX {
    public ConversationRowAudioPreview A00 = ((ConversationRowAudioPreview) C012005e.A02(this, R.id.search_row_audio_preview));
    public AnonymousClass3HF A01;
    public C18820ts A02;
    public AudioPlayerView A03 = ((AudioPlayerView) C012005e.A02(this, R.id.search_row_audio_controls));
    public AnonymousClass005 A04;
    public boolean A05;

    public static void A00(C182508pC r11) {
        C46812bi r9 = r11.A09;
        C23182B8q b8q = new C23182B8q(r11, 1);
        BA0 ba0 = new BA0(r11, 1);
        AudioPlayerView audioPlayerView = r11.A03;
        B7A b7a = new B7A(r11.A00, b8q, ba0, audioPlayerView, r11, ba0, 1);
        AnonymousClass958 r10 = new AnonymousClass958(r11, 0);
        B7A b7a2 = b7a;
        AnonymousClass6XC.A03(b7a2, r11.A03, r11.A02, r9, r10, audioPlayerView);
    }

    public void A01() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq r2 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            this.A05 = C36341k9.A0V(r2);
            C18830tt A0B = C165567td.A0B(r2, this, r2.A4o);
            this.A02 = C36341k9.A0T(r2);
            this.A01 = (AnonymousClass3HF) A0B.A2h.get();
            this.A04 = C18840tu.A00(A0B.A3S);
        }
    }

    public void A02() {
        C148826zU A002 = this.A01.A00(C36361kB.A06(this), this.A09, false);
        A002.A0H = new C200409hM(this, 1);
        A002.A0D(this.A09);
        A002.A0F(false);
        A00(this);
    }

    public void A03() {
        C46812bi r5 = this.A09;
        AudioPlayerView audioPlayerView = this.A03;
        AnonymousClass6XC.A02(this.A0E, this.A0G, this.A0F, this.A0D, r5, new C1894293t(this, 0), audioPlayerView);
        int BGL = ((C160497l6) this.A04.get()).BGL(this.A09.A1N);
        if (BGL >= 0) {
            audioPlayerView.setSeekbarProgress(BGL);
        }
    }

    public C182508pC(Context context) {
        super(context);
        A01();
        setOrientation(0);
        setGravity(16);
        View.inflate(context, R.layout.f9nameremoved, this);
        C165567td.A0k(context, this);
        B7T b7t = new B7T(this, 0);
        C23145B7f b7f = new C23145B7f(this, 1);
        AudioPlayerView audioPlayerView = this.A03;
        audioPlayerView.setPlaybackListener(new C136166ds(this.A03, audioPlayerView, b7f, b7t, this.A04));
    }
}
