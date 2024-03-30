package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.9XV  reason: invalid class name */
public final class AnonymousClass9XV {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;
    public final TextEmojiLabel A09;
    public final TextEmojiLabel A0A;
    public final StickerView A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XV) {
                AnonymousClass9XV r5 = (AnonymousClass9XV) obj;
                if (!AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A04, C36351kA.A05(this.A08, C36351kA.A05(this.A05, C36351kA.A05(this.A0B, C36351kA.A05(this.A03, C36351kA.A05(this.A06, C36351kA.A05(this.A01, C36351kA.A05(this.A00, C36351kA.A05(this.A02, C36351kA.A05(this.A07, C36351kA.A05(this.A09, C36391kE.A0A(this.A0A))))))))))));
    }

    public AnonymousClass9XV(View view, View view2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextEmojiLabel textEmojiLabel, TextEmojiLabel textEmojiLabel2, TextEmojiLabel textEmojiLabel3, TextEmojiLabel textEmojiLabel4, StickerView stickerView) {
        C36321k7.A18(textEmojiLabel, textEmojiLabel2, textEmojiLabel3, imageView);
        AnonymousClass00C.A0D(textView, 7);
        C36321k7.A14(imageView2, stickerView, textView2);
        C36341k9.A1G(textEmojiLabel4, imageView3);
        this.A0A = textEmojiLabel;
        this.A09 = textEmojiLabel2;
        this.A07 = textEmojiLabel3;
        this.A02 = imageView;
        this.A00 = view;
        this.A01 = view2;
        this.A06 = textView;
        this.A03 = imageView2;
        this.A0B = stickerView;
        this.A05 = textView2;
        this.A08 = textEmojiLabel4;
        this.A04 = imageView3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReplyRenderViews(titleView=");
        A0u.append(this.A0A);
        A0u.append(", textView=");
        A0u.append(this.A09);
        A0u.append(", subTextView=");
        A0u.append(this.A07);
        A0u.append(", imageView=");
        A0u.append(this.A02);
        A0u.append(", colorView=");
        A0u.append(this.A00);
        A0u.append(", paymentAmountContainer=");
        A0u.append(this.A01);
        A0u.append(", paymentAmountText=");
        A0u.append(this.A06);
        A0u.append(", paymentAmountExpressiveBackground=");
        A0u.append(this.A03);
        A0u.append(", stickerView=");
        A0u.append(this.A0B);
        A0u.append(", bulletDividerView=");
        A0u.append(this.A05);
        A0u.append(", subtitleView=");
        A0u.append(this.A08);
        A0u.append(", photoView=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
