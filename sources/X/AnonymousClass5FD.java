package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5FD  reason: invalid class name */
public class AnonymousClass5FD extends C46482Xv {
    public final CircleWaImageView A00;
    public final TextEmojiLabel A01;
    public final C20810yC A02;
    public final C117555mS A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (this instanceof AnonymousClass5FJ) {
            ((AnonymousClass5FJ) this).A0E((AnonymousClass5E0) obj);
        } else {
            A0E((AnonymousClass5E0) obj);
        }
    }

    public void A0E(AnonymousClass5E0 r7) {
        TextEmojiLabel textEmojiLabel = this.A01;
        C144416s9 r2 = r7.A00;
        textEmojiLabel.setText(r2.A0I);
        if (r2.A08 == 2) {
            textEmojiLabel.A0F(C55832vG.A00(this.A02), R.dimen.f7nameremoved);
        } else {
            textEmojiLabel.A0E();
        }
        String str = r2.A0G;
        if (!TextUtils.isEmpty(str)) {
            C117555mS r22 = this.A03;
            CircleWaImageView circleWaImageView = this.A00;
            Drawable A002 = AnonymousClass00E.A00(circleWaImageView.getContext(), R.drawable.avatar_contact);
            r22.A00.A00(A002, A002, circleWaImageView, (C160197kc) null, str);
        } else {
            this.A00.setImageResource(R.drawable.avatar_contact);
        }
        C48902iF.A00(this.A0H, this, r7, 19);
    }

    public AnonymousClass5FD(View view, C20810yC r3, C117555mS r4) {
        super(view);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = C36401kF.A0O(view, R.id.business_name);
        this.A00 = (CircleWaImageView) C012005e.A02(view, R.id.business_avatar);
    }
}
