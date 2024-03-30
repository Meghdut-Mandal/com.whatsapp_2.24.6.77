package X;

import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.631  reason: invalid class name */
public class AnonymousClass631 {
    public final AnonymousClass3HF A00;
    public final C19420v0 A01;
    public final VoiceNoteProfileAvatarView A02;

    public void A00(C46812bi r7) {
        C148826zU r1;
        C132476Tw r0;
        AnonymousClass1V6 r12 = this.A00.A03;
        if (r12.A0D(r7)) {
            r1 = r12.A00();
            if (r1 != null) {
                r1.A07++;
            }
        } else {
            r1 = null;
        }
        int i = C148826zU.A12;
        int i2 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 0;
                } else {
                    throw C90464aC.A0R("fastPlaybackOnClick: Did not handle fastPlaybackPlayerState: ", AnonymousClass000.A0u(), i);
                }
            }
        }
        if (r1 == null || (r0 = r1.A0L) == null || !r0.A0D() || r1.A0J(i2)) {
            C148826zU.A12 = i2;
            C36341k9.A0v(C19420v0.A00(this.A01), "ptt_fast_playback_player_state", i2);
            C64933Qa r02 = r7.A1J;
            boolean z = r02.A02;
            boolean A0G = AnonymousClass143.A0G(r02.A00);
            int i3 = 1;
            if (i2 != 0) {
                i3 = 2;
                if (i2 != 1) {
                    i3 = 3;
                }
            }
            this.A02.A05(i3, false, z, A0G);
        }
    }

    public AnonymousClass631(AnonymousClass3HF r1, C19420v0 r2, VoiceNoteProfileAvatarView voiceNoteProfileAvatarView) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = voiceNoteProfileAvatarView;
    }
}
