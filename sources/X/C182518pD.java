package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.8pD  reason: invalid class name and case insensitive filesystem */
public class C182518pD extends C47142dX {
    public C19730wQ A00;
    public AnonymousClass16D A01;
    public C27731Pn A02;
    public AnonymousClass3HF A03;
    public AudioPlayerMetadataView A04 = ((AudioPlayerMetadataView) C012005e.A02(this, R.id.search_row_voice_note_metadata));
    public C18820ts A05;
    public C25121Fb A06;
    public AnonymousClass7hR A07;
    public AnonymousClass631 A08;
    public AudioPlayerView A09 = ((AudioPlayerView) C012005e.A02(this, R.id.search_row_voice_note_controls));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) C012005e.A02(this, R.id.search_row_voice_note_preview));
    public AnonymousClass005 A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass1RY A0E;

    public static void A00(C182518pD r12) {
        C23182B8q b8q = new C23182B8q(r12, 3);
        BA0 ba0 = new BA0(r12, 3);
        AudioPlayerView audioPlayerView = r12.A09;
        B7A b7a = new B7A(b8q, ba0, ba0, r12, audioPlayerView);
        C46812bi r10 = r12.A09;
        AnonymousClass958 r11 = new AnonymousClass958(r12, 2);
        B7A b7a2 = b7a;
        AnonymousClass6XC.A03(b7a2, r12.A03, r12.A05, r10, r11, audioPlayerView);
    }

    public void A01() {
        if (!this.A0D) {
            this.A0D = true;
            C27861Qc r3 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r2 = r3.A0M;
            this.A05 = C36341k9.A0V(r2);
            C18830tt A0B2 = C165567td.A0B(r2, this, r2.A4o);
            this.A00 = C36351kA.A0N(r2);
            this.A02 = C165577te.A0Q(r2);
            this.A01 = C36341k9.A0R(r2);
            this.A05 = C36341k9.A0T(r2);
            this.A06 = (C25121Fb) r2.A3K.get();
            this.A0B = C18840tu.A00(A0B2.A3S);
            this.A07 = (AnonymousClass7hR) r3.A0D.get();
            this.A03 = (AnonymousClass3HF) A0B2.A2h.get();
        }
    }

    public void A02() {
        C148826zU A002 = this.A03.A00(C36361kB.A06(this), this.A09, false);
        A002.A0D(this.A09);
        boolean z = this.A0C;
        A002.A0F(z);
        if (z && A002.A11) {
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
            int i = C148826zU.A12;
            C64933Qa r0 = this.A09.A1J;
            voiceNoteProfileAvatarView.A04(i, true, r0.A02, AnonymousClass143.A0G(r0.A00));
        }
        A00(this);
    }

    public void A03() {
        AnonymousClass1RY r1;
        AnonymousClass141 A0D2;
        C46812bi r6 = this.A09;
        AudioPlayerView audioPlayerView = this.A09;
        AnonymousClass6XC.A02(this.A0E, this.A0G, this.A0F, this.A0D, r6, new C1894293t(this, 2), audioPlayerView);
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
        voiceNoteProfileAvatarView.setupIconBackgroundColor(C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        AnonymousClass3R0.A02(this.A09, audioPlayerView, voiceNoteProfileAvatarView);
        boolean z = this.A0C;
        if (z) {
            C165607th.A1H(this, voiceNoteProfileAvatarView);
        }
        if (this.A09.A1k()) {
            voiceNoteProfileAvatarView.A06(true, 4);
        } else {
            voiceNoteProfileAvatarView.setIsForwardedByNonAuthorPttUi(false);
            ImageView imageView = voiceNoteProfileAvatarView.A04;
            C46812bi r5 = this.A09;
            C64933Qa r12 = r5.A1J;
            if (r12.A02) {
                r1 = this.A0E;
                A0D2 = C36381kD.A0T(this.A00);
            } else {
                ImageView imageView2 = voiceNoteProfileAvatarView.A02;
                AnonymousClass11F r2 = r12.A00;
                C18740tg.A06(r2);
                if (AnonymousClass143.A0G(r2)) {
                    AnonymousClass11F A0J = r5.A0J();
                    C18740tg.A06(A0J);
                    imageView2.setVisibility(0);
                    imageView.setVisibility(8);
                    this.A0E.A08(imageView2, this.A01.A0D(A0J));
                } else {
                    imageView2.setVisibility(8);
                    imageView.setVisibility(0);
                    r1 = this.A0E;
                    A0D2 = this.A01.A0D(r2);
                }
            }
            r1.A08(imageView, A0D2);
        }
        int BGL = ((C160497l6) this.A0B.get()).BGL(this.A09.A1N);
        if (BGL >= 0) {
            audioPlayerView.setSeekbarProgress(BGL);
        }
        if (z) {
            C46812bi r13 = this.A09;
            if (!r13.A1T(32768)) {
                audioPlayerView.setTag((Object) null);
                audioPlayerView.A01();
                return;
            }
            audioPlayerView.setTag(r13.A1J);
            this.A06.A03(this.A09, new C81163wZ((Object) this, 10));
        }
    }

    public C182518pD(Context context) {
        super(context);
        A01();
        this.A0E = this.A02.A04(context, "attachment-voice-note-audio-view");
        setOrientation(0);
        setGravity(16);
        View.inflate(context, R.layout.f9nameremoved, this);
        C165567td.A0k(context, this);
        B7T b7t = new B7T(this, 2);
        C23145B7f b7f = new C23145B7f(this, 3);
        AudioPlayerView audioPlayerView = this.A09;
        audioPlayerView.setPlaybackListener(new C136166ds(this.A03, audioPlayerView, b7f, b7t, this.A0B));
        boolean A0E2 = this.A05.A0E(1316);
        this.A0C = A0E2;
        if (A0E2) {
            this.A08 = this.A07.B3z(this.A0A);
            this.A0A.setOnFastPlaybackButtonClickListener(new C67133Yq((Object) this, 42));
        }
    }
}
