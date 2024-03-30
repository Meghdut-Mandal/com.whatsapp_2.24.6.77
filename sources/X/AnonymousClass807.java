package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.807  reason: invalid class name */
public class AnonymousClass807 extends AnonymousClass0D3 {
    public final View A00;
    public final View A01;
    public final RadioButton A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final WaImageView A06;
    public final AnonymousClass1RJ A07;

    public AnonymousClass807(View view, C21060yb r6, C20810yC r7) {
        super(view);
        this.A04 = C36401kF.A0O(view, R.id.payment_title);
        TextEmojiLabel A0O = C36401kF.A0O(view, R.id.payment_subtitle);
        this.A03 = A0O;
        C36331k8.A16(A0O, r6);
        C36331k8.A1A(r7, A0O);
        this.A06 = C36431kI.A0X(view, R.id.payment_option_icon);
        this.A02 = (RadioButton) C012005e.A02(view, R.id.payment_radio_button);
        this.A01 = C012005e.A02(view, R.id.payment_secure_badge);
        TextEmojiLabel A0O2 = C36401kF.A0O(view, R.id.secure_text_content);
        this.A05 = A0O2;
        C36331k8.A16(A0O2, r6);
        C36331k8.A1A(r7, A0O2);
        AnonymousClass1RJ A0X = C36341k9.A0X(view, R.id.hidden_installment_content);
        this.A07 = A0X;
        ((TextEmojiLabel) A0X.A01()).setAccessibilityHelper(new C34011gJ((TextView) A0X.A01(), r6));
        C36331k8.A1A(r7, (TextEmojiLabel) A0X.A01());
        this.A00 = C012005e.A02(view, R.id.payment_option_icon_wrapper);
    }
}
