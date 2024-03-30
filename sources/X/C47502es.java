package X;

import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2es  reason: invalid class name and case insensitive filesystem */
public final class C47502es extends AnonymousClass3LJ {
    public final FrameLayout A00;
    public final TextEmojiLabel A01;
    public final C33771fu A02;
    public final C20810yC A03;
    public final AnonymousClass3T1 A04;
    public final C63413Jy A05;
    public final C33751fs A06;

    public C47502es(AnonymousClass17Y r13, C32691e2 r14, C33771fu r15, C33751fs r16, C63193Jc r17, C21060yb r18, C19970wo r19, C18820ts r20, C20810yC r21, AnonymousClass1SU r22, AnonymousClass3T1 r23, AnonymousClass3G7 r24) {
        super(r14, r13, r18, r20, r22, r24);
        this.A03 = r21;
        this.A02 = r15;
        this.A06 = r16;
        AnonymousClass3T1 r0 = r23;
        C18740tg.A06(r0);
        this.A04 = r0;
        this.A05 = new C63413Jy(r19, 4500);
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(A0B());
        C36331k8.A0r(textEmojiLabel.getContext(), textEmojiLabel, R.color.f6nameremoved);
        textEmojiLabel.setGravity(17);
        C63193Jc r4 = r17;
        C63193Jc.A00(textEmojiLabel.getContext(), textEmojiLabel, r4);
        int A032 = (int) r4.A03(C36341k9.A0F(textEmojiLabel), r4.A00);
        textEmojiLabel.setPadding(A032, A032, A032, A032);
        this.A01 = textEmojiLabel;
        FrameLayout frameLayout = new FrameLayout(A0B());
        this.A00 = frameLayout;
        C36391kE.A1G(textEmojiLabel, frameLayout, -2, 17);
    }

    public long A0A() {
        return this.A05.A00;
    }

    public void A0G() {
        AnonymousClass3LJ.A09(this.A05, this);
    }

    public void A0H() {
        this.A05.A02();
    }
}
