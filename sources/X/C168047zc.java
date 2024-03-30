package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.7zc  reason: invalid class name and case insensitive filesystem */
public class C168047zc extends AnonymousClass0CZ {
    public String A00 = "WhatsappPay";
    public final C21060yb A01;
    public final C20810yC A02;
    public final List A03 = AnonymousClass001.A0I();

    public int A0J() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        String str;
        String str2;
        SpannableString spannableString;
        AnonymousClass807 r82 = (AnonymousClass807) r8;
        C193679Mk r3 = (C193679Mk) this.A03.get(i);
        r82.A02.setChecked(r3.A00);
        C206369tH r6 = r3.A03;
        C195719Vr r1 = r6.A03;
        if (r1.A01) {
            r82.A01.setVisibility(0);
            SpannableString spannableString2 = r1.A00;
            if (!TextUtils.isEmpty(spannableString2)) {
                r82.A05.setText(spannableString2);
            }
        }
        int i2 = r6.A00;
        if (i2 != 0) {
            r82.A06.setImageResource(i2);
            View view = r82.A00;
            view.setVisibility(0);
            if (r6.A0C) {
                view.setBackground((Drawable) null);
            }
        }
        AnonymousClass1RJ r2 = r82.A07;
        r2.A03(8);
        C195699Vp r12 = r6.A01;
        if (r12.A01 && (spannableString = r12.A00) != null) {
            ((TextView) C36391kE.A0L(r2, 0)).setText(spannableString);
        }
        AnonymousClass1LB r22 = r3.A02;
        if (r22 != null) {
            str = C165587tf.A0h(r22, r6.A09, r6.A08);
            str2 = C165587tf.A0h(r22, r6.A07, r6.A06);
        } else {
            str = r6.A08;
            str2 = r6.A06;
        }
        if (!TextUtils.isEmpty(str)) {
            r82.A04.setText(str);
        }
        C195709Vq r13 = r6.A02;
        if (r13.A01) {
            SpannableString spannableString3 = r13.A00;
            TextEmojiLabel textEmojiLabel = r82.A03;
            textEmojiLabel.setText(spannableString3);
            textEmojiLabel.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextEmojiLabel textEmojiLabel2 = r82.A03;
            textEmojiLabel2.setText(str2);
            textEmojiLabel2.setVisibility(0);
        }
        C36371kC.A1F(r82.A0H, r82, r3, 47);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 0 || i == 1) {
            List list = AnonymousClass0D3.A0I;
            C20810yC r3 = this.A02;
            return new AnonymousClass807(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A01, r3);
        }
        throw AnonymousClass001.A09("PaymentOptionsBottomSheetAdapter/onCreateViewHolder/unhandled view type");
    }

    public int getItemViewType(int i) {
        return ((C193679Mk) this.A03.get(i)).A01;
    }

    public C168047zc(C21060yb r2, C20810yC r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
