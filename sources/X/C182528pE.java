package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import java.util.List;

/* renamed from: X.8pE  reason: invalid class name and case insensitive filesystem */
public final class C182528pE extends C47142dX {
    public C19730wQ A00;
    public AnonymousClass16D A01;
    public C27731Pn A02;
    public AnonymousClass3HF A03;
    public AudioPlayerMetadataView A04 = ((AudioPlayerMetadataView) C36361kB.A0G(this, R.id.search_row_newsletter_audio_metadata));
    public C18820ts A05;
    public C25121Fb A06;
    public AnonymousClass7hR A07;
    public AnonymousClass631 A08;
    public AudioPlayerView A09 = ((AudioPlayerView) C36361kB.A0G(this, R.id.search_row_newsletter_audio_controls));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) C36361kB.A0G(this, R.id.search_row_newsletter_audio_preview));
    public AnonymousClass005 A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass1RY A0E;

    public static final void A00(C182528pE r9) {
        C23182B8q b8q = new C23182B8q(r9, 2);
        BA0 ba0 = new BA0(r9, 2);
        AudioPlayerView audioPlayerView = r9.A09;
        if (audioPlayerView == null) {
            throw C36331k8.A0d("audioPlayerView");
        }
        B7A b7a = new B7A(b8q, ba0, r9, audioPlayerView);
        C46812bi r6 = r9.A09;
        AnonymousClass958 r7 = new AnonymousClass958(r9, 1);
        AnonymousClass6XC.A03(b7a, r9.A03, r9.getWhatsAppLocale(), r6, r7, audioPlayerView);
    }

    public static final void setUpViewBasedOnMessageState$lambda$3(C182528pE r3) {
        List A0q;
        AnonymousClass00C.A0D(r3, 0);
        AudioPlayerView audioPlayerView = r3.A09;
        if (audioPlayerView == null) {
            throw C36331k8.A0d("audioPlayerView");
        } else if (audioPlayerView.getTag() != null && AnonymousClass00C.A0J(r3.A09.A1J, audioPlayerView.getTag())) {
            C46812bi r0 = r3.A09;
            AnonymousClass00C.A07(r0);
            AnonymousClass3QP r02 = (AnonymousClass3QP) r0.A00.A00;
            if (r02 != null && (A0q = C90524aI.A0q(r02.A04)) != null) {
                audioPlayerView.A03(A0q);
            }
        }
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setFMessageLazyDataManager(C25121Fb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setMessageAudioPlayerFactory(AnonymousClass3HF r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setPttFastPlaybackControllerFactory(AnonymousClass7hR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setPttSavedPlaybackPositionControllerLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
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

    public void A03() {
        C46812bi r8 = this.A09;
        AudioPlayerView audioPlayerView = this.A09;
        if (audioPlayerView == null) {
            throw C36331k8.A0d("audioPlayerView");
        }
        AnonymousClass6XC.A02(this.A0E, this.A0G, this.A0F, this.A0D, r8, new C1894293t(this, 1), audioPlayerView);
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
        if (voiceNoteProfileAvatarView == null) {
            throw C36331k8.A0d("newsletterAudioProfileAvatarView");
        }
        voiceNoteProfileAvatarView.setupIconBackgroundColor(C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        AnonymousClass3R0.A02(this.A09, audioPlayerView, voiceNoteProfileAvatarView);
        boolean z = this.A0C;
        if (z) {
            C165607th.A1H(this, voiceNoteProfileAvatarView);
        }
        voiceNoteProfileAvatarView.setIsNewsletterAudioOrPttUi(this.A09);
        int i = 0;
        voiceNoteProfileAvatarView.setIsForwardedByNonAuthorPttUi(false);
        ImageView imageView = voiceNoteProfileAvatarView.A04;
        AnonymousClass00C.A08(imageView);
        ImageView imageView2 = voiceNoteProfileAvatarView.A02;
        AnonymousClass00C.A08(imageView2);
        C46812bi r1 = this.A09;
        boolean A0G = AnonymousClass143.A0G(r1.A1J.A00);
        ImageView imageView3 = imageView;
        if (A0G) {
            imageView3 = imageView2;
        }
        C63393Jw A0W = r1.A0W();
        AnonymousClass11F r3 = this.A09.A1J.A00;
        C18740tg.A06(r3);
        if (A0W != null) {
            r3 = A0W.A01;
            C18740tg.A06(r3);
        }
        imageView2.setVisibility(C36351kA.A00(A0G ? 1 : 0));
        if (A0G) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.A0E.A08(imageView3, getContactManager().A0D(r3));
        int BGL = ((C160497l6) getPttSavedPlaybackPositionControllerLazy().get()).BGL(this.A09.A1N);
        if (BGL >= 0) {
            audioPlayerView.setSeekbarProgress(BGL);
        }
        if (z) {
            C46812bi r12 = this.A09;
            if (!r12.A1T(32768)) {
                audioPlayerView.setTag((Object) null);
                audioPlayerView.A01();
                return;
            }
            audioPlayerView.setTag(r12.A1J);
            C25121Fb fMessageLazyDataManager = getFMessageLazyDataManager();
            C46812bi r2 = this.A09;
            AnonymousClass00C.A07(r2);
            fMessageLazyDataManager.A03(r2, new C81163wZ((Object) this, 9));
        }
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactManager");
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public final C25121Fb getFMessageLazyDataManager() {
        C25121Fb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("fMessageLazyDataManager");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final AnonymousClass3HF getMessageAudioPlayerFactory() {
        AnonymousClass3HF r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageAudioPlayerFactory");
    }

    public final AnonymousClass7hR getPttFastPlaybackControllerFactory() {
        AnonymousClass7hR r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pttFastPlaybackControllerFactory");
    }

    public final AnonymousClass005 getPttSavedPlaybackPositionControllerLazy() {
        AnonymousClass005 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pttSavedPlaybackPositionControllerLazy");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public C182528pE(Context context) {
        super(context);
        A01();
        this.A0E = getContactPhotos().A04(context, "attachment-newsletter-audio-view");
        setOrientation(0);
        setGravity(16);
        View.inflate(context, R.layout.f9nameremoved, this);
        C165567td.A0k(context, this);
        B7T b7t = new B7T(this, 1);
        C23145B7f b7f = new C23145B7f(this, 2);
        AudioPlayerView audioPlayerView = this.A09;
        if (audioPlayerView == null) {
            throw C36331k8.A0d("audioPlayerView");
        }
        C136166ds r2 = new C136166ds(this.A03, audioPlayerView, b7f, b7t, getPttSavedPlaybackPositionControllerLazy());
        AudioPlayerView audioPlayerView2 = this.A09;
        if (audioPlayerView2 == null) {
            throw C36331k8.A0d("audioPlayerView");
        }
        audioPlayerView2.setPlaybackListener(r2);
        boolean A0E2 = this.A05.A0E(1316);
        this.A0C = A0E2;
        if (A0E2) {
            AnonymousClass7hR pttFastPlaybackControllerFactory = getPttFastPlaybackControllerFactory();
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
            if (voiceNoteProfileAvatarView == null) {
                throw C36331k8.A0d("newsletterAudioProfileAvatarView");
            }
            this.A08 = pttFastPlaybackControllerFactory.B3z(voiceNoteProfileAvatarView);
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView2 = this.A0A;
            if (voiceNoteProfileAvatarView2 == null) {
                throw C36331k8.A0d("newsletterAudioProfileAvatarView");
            }
            voiceNoteProfileAvatarView2.setOnFastPlaybackButtonClickListener(new C67133Yq((Object) this, 41));
        }
    }

    public void A02() {
        C148826zU A002 = getMessageAudioPlayerFactory().A00(C36361kB.A06(this), this.A09, false);
        AnonymousClass00C.A08(A002);
        A002.A0D(this.A09);
        boolean z = this.A0C;
        A002.A0F(z);
        if (z && A002.A11) {
            VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A0A;
            if (voiceNoteProfileAvatarView == null) {
                throw C36331k8.A0d("newsletterAudioProfileAvatarView");
            }
            int i = C148826zU.A12;
            C64933Qa r0 = this.A09.A1J;
            voiceNoteProfileAvatarView.A04(i, true, r0.A02, AnonymousClass143.A0G(r0.A00));
        }
        A00(this);
    }
}
