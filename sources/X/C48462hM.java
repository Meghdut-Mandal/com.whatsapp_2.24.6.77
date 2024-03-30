package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2hM  reason: invalid class name and case insensitive filesystem */
public final class C48462hM extends C42581z3 {
    public C48142gm A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass3SF A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final AnonymousClass1RY A05;
    public final C61553Cl A06;
    public final C64633Ov A07;
    public final UpdatesFragment A08;
    public final AnonymousClass1RJ A09;
    public final AnonymousClass1RJ A0A;
    public final WDSProfilePhoto A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48462hM(View view, AnonymousClass1LI r7, AnonymousClass1RY r8, C61553Cl r9, C64633Ov r10, UpdatesFragment updatesFragment) {
        super(view);
        C36321k7.A1A(r8, r9, r10, r7, 3);
        this.A08 = updatesFragment;
        this.A05 = r8;
        this.A06 = r9;
        this.A07 = r10;
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.newsletter_name);
        this.A01 = A0R;
        this.A04 = C36351kA.A0Q(view, R.id.newsletter_follow_count);
        WaImageView waImageView = (WaImageView) C36361kB.A0F(view, R.id.quick_follow_icon);
        this.A03 = waImageView;
        AnonymousClass1RJ A0Y = C36341k9.A0Y(view, R.id.quick_follow_button_container);
        this.A09 = A0Y;
        this.A0B = (WDSProfilePhoto) C36361kB.A0F(view, R.id.newsletter_directory_photo);
        this.A0A = C36341k9.A0Y(view, R.id.quick_follow_progressBar_container);
        this.A02 = AnonymousClass3SF.A01(view, r7, R.id.newsletter_name);
        AnonymousClass3Y9.A00(view, this, 18);
        AnonymousClass3Y9.A00(waImageView, this, 19);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) A0Y.A01();
        if (r9.A00(C36371kC.A0B(waButtonWithLoader))) {
            C36391kE.A1H(A0R, waButtonWithLoader);
            waButtonWithLoader.A00 = new AnonymousClass3YC(this, waButtonWithLoader, 34);
        }
        C33511fU.A03(A0R);
    }
}
