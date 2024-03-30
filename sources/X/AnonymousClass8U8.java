package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.8U8  reason: invalid class name */
public final class AnonymousClass8U8 extends WaFrameLayout {
    public final View A00 = C36361kB.A0G(this, R.id.title_quantity_container);
    public final TextEmojiLabel A01 = C36351kA.A0O(this, R.id.additional_note);
    public final TextEmojiLabel A02 = C36351kA.A0O(this, R.id.paid_amount);
    public final TextEmojiLabel A03 = C36351kA.A0O(this, R.id.total_price);
    public final TextEmojiLabel A04 = C36351kA.A0O(this, R.id.quantity);
    public final TextEmojiLabel A05 = C36351kA.A0O(this, R.id.reference_id);
    public final TextEmojiLabel A06 = C36351kA.A0O(this, R.id.header_title);
    public final WaImageView A07 = C90474aD.A0P(this, R.id.thumbnail);
    public final AnonymousClass1RJ A08 = C36341k9.A0X(this, R.id.pay_options_identifier_view);
    public final AnonymousClass1RJ A09 = C36341k9.A0X(this, R.id.status_container);
    public final AnonymousClass1RJ A0A = C36341k9.A0X(this, R.id.hidden_pay_info_view);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8U8(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
    }
}
