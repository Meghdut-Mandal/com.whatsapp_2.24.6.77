package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2Yr  reason: invalid class name and case insensitive filesystem */
public final class C46592Yr extends C42551z0 {
    public final TextEmojiLabel A00;
    public final WaImageView A01;
    public final WaTextView A02;
    public final AnonymousClass1RY A03;
    public final AnonymousClass1GQ A04;
    public final C61553Cl A05;
    public final C64633Ov A06;
    public final AnonymousClass1RJ A07;
    public final AnonymousClass1RJ A08;
    public final AnonymousClass1RJ A09;
    public final WDSProfilePhoto A0A;
    public final C57712yh A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46592Yr(View view, C57712yh r7, AnonymousClass1RY r8, AnonymousClass1GQ r9, C61553Cl r10, C64633Ov r11, C41051wX r12) {
        super(view);
        AnonymousClass00C.A0D(r8, 3);
        C36421kH.A1J(r10, 4, r11);
        C36321k7.A10(r9, r7);
        this.A03 = r8;
        this.A05 = r10;
        this.A06 = r11;
        this.A04 = r9;
        this.A0B = r7;
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.newsletter_name);
        this.A00 = A0R;
        this.A02 = C36351kA.A0Q(view, R.id.newsletter_follow_count);
        WaImageView waImageView = (WaImageView) C36361kB.A0F(view, R.id.quick_follow_icon);
        this.A01 = waImageView;
        AnonymousClass1RJ A0Y = C36341k9.A0Y(view, R.id.quick_follow_button_container);
        this.A07 = A0Y;
        this.A0A = (WDSProfilePhoto) C36361kB.A0F(view, R.id.newsletter_directory_photo);
        this.A08 = C36341k9.A0Y(view, R.id.quick_follow_progressBar_container);
        this.A09 = C36341k9.A0Y(view, R.id.newsletter_subtitle_hidden);
        C36371kC.A1F(view, r12, this, 10);
        C36371kC.A1F(waImageView, this, r12, 11);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) A0Y.A01();
        if (r10.A00(C36371kC.A0B(waButtonWithLoader))) {
            C36391kE.A1H(A0R, waButtonWithLoader);
            waButtonWithLoader.A00 = new AnonymousClass3YM(this, waButtonWithLoader, r12, 4);
        }
        C33511fU.A03(A0R);
    }
}
