package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.242  reason: invalid class name */
public abstract class AnonymousClass242 extends TextEmojiLabel {
    public boolean A00;

    public void A09() {
        if (this instanceof MediaCaptionTextView) {
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) this;
            if (!mediaCaptionTextView.A01) {
                mediaCaptionTextView.A01 = true;
                C18800tq A0P = C36361kB.A0P(mediaCaptionTextView);
                C36321k7.A0d(A0P, mediaCaptionTextView);
                C36361kB.A1D(A0P.A00, mediaCaptionTextView);
                mediaCaptionTextView.A00 = C36391kE.A0j(A0P);
            }
        } else if (!this.A00) {
            this.A00 = true;
            C18800tq A0P2 = C36361kB.A0P(this);
            C36321k7.A0d(A0P2, this);
            C36361kB.A1D(A0P2.A00, this);
        }
    }

    public AnonymousClass242(Context context) {
        super(context);
        A09();
    }

    public AnonymousClass242(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A09();
    }

    public AnonymousClass242(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A09();
    }
}
