package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.2YW  reason: invalid class name */
public final class AnonymousClass2YW extends C38151nn implements C18700tb {
    public AnonymousClass1H2 A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final CardView A07;
    public final AnonymousClass3SF A08;

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public AnonymousClass2YW(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36351kA.A0a(A0W);
            this.A01 = C36361kB.A0V(A0W);
            this.A03 = C36351kA.A0U(A0W);
            this.A06 = C36351kA.A0m(A0W);
            this.A05 = (C64633Ov) A0W.A00.A2u.get();
            this.A02 = C36361kB.A0W(A0W);
            this.A00 = C36361kB.A0S(A0W);
            this.A00 = C36351kA.A0e(A0W);
        }
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        this.A07 = (CardView) C36361kB.A0F(inflate, R.id.newsletter_link_card);
        this.A04 = C36361kB.A0M(inflate, R.id.newsletter_link_thumbnail);
        this.A08 = AnonymousClass3SF.A01(this, getTextEmojiLabelViewControllerFactory(), R.id.newsletter_link_name);
        this.A06 = C36351kA.A0F(inflate, R.id.newsletter_link_followers);
        this.A05 = C36351kA.A0F(inflate, R.id.newsletter_link_description);
        View A0F = C36361kB.A0F(inflate, R.id.newsletter_link_button);
        this.A03 = A0F;
        C36371kC.A13(context, A0F, C222013h.A05 ? R.drawable.button_background_v2 : R.drawable.button_background);
    }

    public final View getButtonView() {
        return this.A03;
    }

    public CardView getCardView() {
        return this.A07;
    }

    public TextView getFollowersView() {
        return this.A06;
    }

    public AnonymousClass3SF getNameViewController() {
        return this.A08;
    }

    public ImageView getThumbnailView() {
        return this.A04;
    }
}
