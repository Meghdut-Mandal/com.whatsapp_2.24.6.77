package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

public class B7A extends C21139A9z {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7A(C22932Ayi ayi, C22933Ayj ayj, C182528pE r4, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, ayi, ayj, audioPlayerView);
        this.A02 = 2;
        this.A00 = ayj;
        this.A01 = r4;
    }

    public C46812bi BBi() {
        switch (this.A02) {
            case 0:
                return (C46812bi) ((AnonymousClass2bU) ((AnonymousClass2IS) this.A00).A0K);
            case 2:
                C46812bi r0 = ((C47142dX) this.A01).A09;
                AnonymousClass00C.A08(r0);
                return r0;
            default:
                return ((C47142dX) this.A00).A09;
        }
    }

    public void BWK(boolean z) {
        Object obj;
        View findViewById;
        switch (this.A02) {
            case 0:
                if (((C148826zU) this.A01).A0b == null && (findViewById = C36361kB.A06((View) this.A00).findViewById(R.id.proximity_overlay)) != null) {
                    int i = 4;
                    if (z) {
                        i = 0;
                    }
                    findViewById.setVisibility(i);
                    return;
                }
                return;
            case 2:
                C148826zU A002 = ((C47142dX) this.A01).A03.A00();
                if (A002 != null && A002.A0b == null) {
                    obj = this.A00;
                    break;
                } else {
                    return;
                }
                break;
            default:
                C148826zU A003 = ((C47142dX) this.A00).A03.A00();
                if (A003 != null && A003.A0b == null) {
                    obj = this.A01;
                    break;
                } else {
                    return;
                }
        }
        ((C22933Ayj) obj).BgZ(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.8pD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.8pE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.8pD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.8pD} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhp(int r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 2: goto L_0x0009;
                case 3: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.Bhp(r3, r4)
        L_0x0008:
            return
        L_0x0009:
            super.Bhp(r3, r4)
            java.lang.Object r1 = r2.A01
            X.8pE r1 = (X.C182528pE) r1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0008
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r1.A0A
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "newsletterAudioProfileAvatarView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x001f:
            super.Bhp(r3, r4)
            java.lang.Object r1 = r2.A00
            X.8pD r1 = (X.C182518pD) r1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0008
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r1.A0A
        L_0x002c:
            X.C165607th.A1H(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7A.Bhp(int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7A(ConversationRowAudioPreview conversationRowAudioPreview, C22932Ayi ayi, C22933Ayj ayj, AudioPlayerView audioPlayerView, Object obj, Object obj2, int i) {
        super(conversationRowAudioPreview, ayi, ayj, audioPlayerView);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7A(C22932Ayi ayi, C22933Ayj ayj, C22933Ayj ayj2, C182518pD r5, AudioPlayerView audioPlayerView) {
        super((ConversationRowAudioPreview) null, ayi, ayj, audioPlayerView);
        this.A02 = 3;
        this.A00 = r5;
        this.A01 = ayj2;
    }
}
