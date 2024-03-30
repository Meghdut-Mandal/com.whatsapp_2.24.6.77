package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Zm  reason: invalid class name and case insensitive filesystem */
public class C175058Zm extends AnonymousClass8ZP {
    public AnonymousClass005 A00;
    public AnonymousClass005 A01;
    public final ConversationRowAudioPreview A02;
    public final AnonymousClass3HF A03;
    public final AudioPlayerView A04;
    public final TextView A05;
    public final AnonymousClass1V6 A06;
    public final View.OnClickListener A07 = new C66953Xy(this, 26);
    public final View A08;

    private void A0D() {
        C46812bi r4 = (C46812bi) ((AnonymousClass2bU) this.A0K);
        AnonymousClass1V6 r1 = this.A06;
        if (!r1.A0D(r4)) {
            A0E(r4);
            return;
        }
        C148826zU A002 = r1.A00();
        if (A002 != null) {
            if (!A002.A0I()) {
                A0E(r4);
            } else {
                AudioPlayerView audioPlayerView = this.A04;
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarMax((int) TimeUnit.SECONDS.toMillis((long) r4.A0B));
                audioPlayerView.setSeekbarProgress(A002.A0A());
                setDuration(AnonymousClass3UY.A07(this.A0E, (long) (A002.A0A() / 1000)));
                ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
                if (conversationRowAudioPreview != null) {
                    C165597tg.A12(conversationRowAudioPreview.A01, conversationRowAudioPreview);
                }
            }
            AudioPlayerView audioPlayerView2 = this.A04;
            audioPlayerView2.setSeekbarContentDescription((long) A002.A0A());
            A002.A0H = new C200409hM(this, 0);
            A002.A0G = new B7A(this.A02, new C23182B8q(this, 0), new BA0(this, 0), audioPlayerView2, this, A002, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C() {
        /*
            r9 = this;
            X.3T1 r8 = r9.A0K
            X.2bU r8 = (X.AnonymousClass2bU) r8
            X.2bi r8 = (X.C46812bi) r8
            X.3Qj r1 = r8.A01
            X.C18740tg.A06(r1)
            android.content.Context r3 = r9.getContext()
            X.0wo r6 = r9.A19
            X.16D r4 = r9.A0l
            X.171 r5 = r9.A0n
            X.0ts r7 = r9.A0E
            java.lang.String r6 = X.AnonymousClass3R0.A01(r3, r4, r5, r6, r7, r8)
            X.3Qa r0 = r8.A1J
            X.11F r2 = r0.A00
            boolean r0 = r2 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x006e
            X.12q r0 = r9.A0F
            X.3Qp r3 = X.C36371kC.A0W(r0, r2)
            X.2La r3 = (X.C44072La) r3
            X.0wo r7 = r9.A19
            X.0ts r5 = r9.A0E
            X.005 r0 = r9.A2B
            java.lang.Object r2 = r0.get()
            X.1GQ r2 = (X.AnonymousClass1GQ) r2
            X.005 r0 = r9.A2D
            java.lang.Object r4 = r0.get()
            X.3Ov r4 = (X.C64633Ov) r4
            boolean r0 = X.C65903Tx.A07(r3, r2)
            if (r0 == 0) goto L_0x006e
            long r2 = r8.A0I
            java.lang.String r0 = X.C165607th.A0q(r7, r5, r2)
            int r0 = r6.indexOf(r0)
            java.lang.String r4 = X.C65903Tx.A03(r5, r4, r8)
            java.lang.StringBuilder r3 = X.C90524aI.A0i(r6)
            int r2 = r0 + -1
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C36421kH.A1N(r0)
            X.C90474aD.A1L(r0, r4)
            java.lang.String r0 = r0.toString()
            r3.insert(r2, r0)
            java.lang.String r6 = r3.toString()
        L_0x006e:
            android.view.View r0 = r9.A08
            r0.setContentDescription(r6)
            android.widget.TextView r3 = r9.A05
            r4 = 0
            r3.setVisibility(r4)
            int r0 = r8.A0B
            if (r0 != 0) goto L_0x0085
            java.io.File r0 = r1.A0I
            int r0 = X.AnonymousClass1GW.A04(r0)
            r8.A0B = r0
        L_0x0085:
            X.2bU r0 = r9.getFMessage()
            boolean r0 = X.C66013Ui.A0z(r0)
            if (r0 == 0) goto L_0x00ce
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r0 = r9.A02
            if (r0 == 0) goto L_0x0096
            r0.A01()
        L_0x0096:
            X.0ts r2 = r9.A0E
            long r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            r3.setText(r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r1 = r9.A04
            r0 = 4
            r1.setPlayButtonState(r0)
            X.1fX r0 = r9.A08
            r1.setOnControlButtonClickListener(r0)
            r1.setSeekbarProgress(r4)
        L_0x00af:
            X.0ts r2 = r9.A0E
            long r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
        L_0x00b7:
            r9.setDuration(r0)
        L_0x00ba:
            r9.A1d()
            r9.A2I(r8)
            X.0yC r1 = r9.A0G
            r0 = 5885(0x16fd, float:8.247E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00cd
            r9.A1z(r8)
        L_0x00cd:
            return
        L_0x00ce:
            boolean r0 = X.C37541mm.A09(r9)
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = r8.A1b()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 == 0) goto L_0x00e8
            java.io.File r0 = r1.A0I
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = r0.getName()
            r8.A06 = r0
        L_0x00e8:
            java.lang.String r0 = r8.A1b()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 == 0) goto L_0x0110
            r0 = 8
            r3.setVisibility(r0)
        L_0x00f7:
            com.whatsapp.search.views.itemviews.AudioPlayerView r2 = r9.A04
            android.content.Context r1 = r9.getContext()
            r0 = 2131101755(0x7f06083b, float:1.7815929E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r2.setSeekbarColor(r0)
            r9.A0D()
            android.view.View$OnClickListener r0 = r9.A07
            r2.setOnControlButtonClickListener(r0)
            goto L_0x00ba
        L_0x0110:
            java.lang.String r0 = r8.A1b()
            r3.setText(r0)
            goto L_0x00f7
        L_0x0118:
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r0 = r9.A02
            if (r0 == 0) goto L_0x011f
            r0.A01()
        L_0x011f:
            X.0ts r2 = r9.A0E
            long r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r2, r0)
            r3.setText(r0)
            boolean r0 = X.C54732tQ.A00(r8)
            com.whatsapp.search.views.itemviews.AudioPlayerView r1 = r9.A04
            if (r0 != 0) goto L_0x014a
            r0 = 2
            r1.setPlayButtonState(r0)
            X.1fX r0 = r9.A0A
        L_0x0138:
            r1.setOnControlButtonClickListener(r0)
            int r0 = r8.A0B
            if (r0 == 0) goto L_0x00af
            X.0ts r2 = r9.A0E
            int r0 = r8.A0B
            long r0 = (long) r0
            java.lang.String r0 = X.AnonymousClass3UY.A07(r2, r0)
            goto L_0x00b7
        L_0x014a:
            r0 = 3
            r1.setPlayButtonState(r0)
            X.1fX r0 = r9.A09
            goto L_0x0138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175058Zm.A0C():void");
    }

    private void A0E(C46812bi r4) {
        int intValue;
        Number A10 = C36441kJ.A10(r4.A1J, C148826zU.A13);
        if (A10 == null) {
            intValue = 0;
        } else {
            intValue = A10.intValue();
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r4.A0B * 1000);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription((long) intValue);
        setDuration(AnonymousClass3UY.A07(this.A0E, (long) r4.A0B));
        ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    public boolean A1E() {
        boolean z = this instanceof C175098Zq;
        AnonymousClass005 r2 = this.A25;
        AnonymousClass3T1 r1 = this.A0K;
        if (z) {
            r1 = (AnonymousClass2bU) r1;
        }
        return C66013Ui.A0X(this.A0j, r1, r2);
    }

    public boolean A1F() {
        boolean z = this instanceof C175098Zq;
        C20810yC r3 = this.A0G;
        C21100yf r2 = this.A0V;
        AnonymousClass3T1 r1 = this.A0K;
        if (z) {
            r1 = (AnonymousClass2bU) r1;
        }
        if (!C66013Ui.A0W(r2, r3, r1, this.A1o) || !this.A0d.BtS()) {
            return false;
        }
        return true;
    }

    public boolean A1K() {
        if (!(this instanceof AnonymousClass8Z4) && !(this instanceof C175098Zq)) {
            if (!C66013Ui.A0W(this.A0V, this.A0G, this.A0K, this.A1o) || !this.A0d.BtQ()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A1d() {
        AnonymousClass1RJ r2 = this.A04.A04;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        AnonymousClass3SU.A01(r0, (AnonymousClass2bU) this.A0K, r2);
    }

    public void A1f() {
        AnonymousClass3UR.A04(this.A08.getRootView(), this.A06, this.A00);
        if (this.A02 == null || RequestPermissionActivity.A0K(getContext(), this.A02)) {
            C46812bi r3 = (C46812bi) ((AnonymousClass2bU) this.A0K);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("conversationrowvoicenote/viewmessage ");
            C36321k7.A1N(r3.A1J, A0u);
            Context context = getContext();
            C21624ASq aSq = new C21624ASq(this);
            AnonymousClass1X7 r5 = this.A0L;
            C18740tg.A06(r5);
            if (AnonymousClass6XC.A05(context, this.A0R, r3, aSq, r5, this.A1y)) {
                C148826zU A002 = this.A03.A00(C36361kB.A06(this), r3, false);
                A002.A0D(r3);
                A002.A0H = new C200409hM(this, 0);
                A002.A0F(AnonymousClass000.A1S(r3.A1I, 82));
                A1Y();
            }
        }
    }

    public void A1u(AnonymousClass11F r7) {
        boolean equals;
        ImageView imageView;
        if (this instanceof C175098Zq) {
            C175098Zq r4 = (C175098Zq) this;
            C46812bi r5 = (C46812bi) ((AnonymousClass2bU) r4.A0K);
            C64933Qa r1 = r5.A1J;
            if (!r1.A02 && !r5.A1k()) {
                AnonymousClass11F r3 = r1.A00;
                boolean A0G = AnonymousClass143.A0G(r3);
                if (A0G) {
                    r3 = r5.A0J();
                }
                if (r7.equals(r3)) {
                    if (A0G) {
                        imageView = r4.A05;
                    } else {
                        imageView = r4.A06;
                    }
                    r4.A07.A08(imageView, r4.A0l.A0D(r3));
                }
            }
            if (r5.A0W() != null) {
                C28981Uw r12 = r5.A0W().A01;
                r4.A07.A08(r4.A06, r4.A0l.A0D(r12));
                return;
            }
            return;
        }
        AnonymousClass3T1 r13 = this.A0K;
        if (r13.A1J.A02) {
            equals = this.A0T.A0M(r7);
        } else {
            equals = r7.equals(r13.A0L());
        }
        if (equals) {
            A1X();
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0C();
        } else if (C37541mm.A09(this)) {
            A0D();
        }
    }

    public C46812bi getFMessage() {
        return (C46812bi) ((AnonymousClass2bU) this.A0K);
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(this.A0K)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setDuration(String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A02;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.setDuration(str);
        }
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46812bi);
        super.setFMessage(r2);
    }

    public C175058Zm(Context context, C89004Uw r9, AnonymousClass3HF r10, AnonymousClass1V6 r11, C46812bi r12) {
        super(context, r9, r12);
        this.A03 = r10;
        this.A06 = r11;
        this.A08 = findViewById(R.id.conversation_row_root);
        AudioPlayerView audioPlayerView = (AudioPlayerView) C012005e.A02(this, R.id.conversation_row_audio_player_view);
        this.A04 = audioPlayerView;
        this.A02 = (ConversationRowAudioPreview) findViewById(R.id.conversation_row_audio_preview);
        this.A05 = C36391kE.A0O(this, R.id.description);
        audioPlayerView.setPlaybackListener(new C136166ds(r11, audioPlayerView, new C23145B7f(this, 0), new C106495Jx(this), this.A01));
        View.OnLongClickListener onLongClickListener = this.A2W;
        audioPlayerView.setSeekbarLongClickListener(onLongClickListener);
        audioPlayerView.setOnControlButtonLongClickListener(onLongClickListener);
        A0C();
        int BGL = ((C160497l6) this.A01.get()).BGL(r12.A1N);
        if (BGL >= 0) {
            audioPlayerView.setSeekbarProgress(BGL);
        }
    }

    public void A1Y() {
        super.A1Y();
        A0C();
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
