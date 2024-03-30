package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1zD  reason: invalid class name and case insensitive filesystem */
public class C42681zD extends AnonymousClass0D3 {
    public ImageView A00;
    public ImageView A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass3SF A05;
    public final AnonymousClass1LV A06;
    public final C28431Sq A07;
    public final AnonymousClass16D A08;
    public final AnonymousClass1RY A09;
    public final C220412q A0A;
    public final AnonymousClass17X A0B;
    public final C27751Pr A0C;
    public final C20810yC A0D;
    public final C19770wU A0E;

    public static void A00(AnonymousClass3JY r4, C42681zD r5, C42681zD r6) {
        Integer num;
        TextEmojiLabel textEmojiLabel;
        int i;
        if (!r4.A03 && r5.A0D.A0E(7180) && (num = r4.A02) != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                textEmojiLabel = r6.A04;
                i = R.string.f12nameremoved;
            } else if (intValue == 2) {
                textEmojiLabel = r6.A04;
                i = R.string.f12nameremoved;
            }
            textEmojiLabel.setText(i);
            textEmojiLabel.setVisibility(0);
            return;
        }
        r6.A04.setVisibility(8);
    }

    public C42681zD(View view, AnonymousClass1LI r4, AnonymousClass1LV r5, C28431Sq r6, AnonymousClass16D r7, AnonymousClass1RY r8, C220412q r9, AnonymousClass17X r10, C27751Pr r11, C20810yC r12, C19770wU r13) {
        super(view);
        this.A0D = r12;
        this.A0E = r13;
        this.A0A = r9;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r6;
        this.A0C = r11;
        this.A06 = r5;
        this.A0B = r10;
        this.A02 = C36401kF.A0O(view, R.id.name);
        this.A05 = AnonymousClass3SF.A01(view, r4, R.id.name);
        this.A04 = C36401kF.A0O(view, R.id.status);
        this.A00 = C36401kF.A0G(view, R.id.avatar);
        this.A01 = C36401kF.A0G(view, R.id.group_chat_info_pin_indicator);
        this.A03 = C36401kF.A0O(view, R.id.community_new);
        C011504z.A06(this.A00, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
