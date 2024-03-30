package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.text.ReadMoreTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Zx  reason: invalid class name and case insensitive filesystem */
public class C46652Zx extends AnonymousClass80F {
    public final ReadMoreTextView A00;
    public final AnonymousClass17Y A01;
    public final C32691e2 A02;
    public final AnonymousClass9SI A03;
    public final C21060yb A04;
    public final C28371Sj A05;

    public void A0B(AnonymousClass9FU r11, int i) {
        AnonymousClass3T1 r3 = ((AnonymousClass2Zy) r11).A00;
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass14B.A02(r3.A0b()));
        this.A05.A04(C36441kJ.A0F(this), A0P, r3.A1J.A00, r3.A0w, true);
        ReadMoreTextView readMoreTextView = this.A00;
        A00(A0P, readMoreTextView, this, true);
        this.A03.A00(readMoreTextView, new C70423f8(this), r3, A0P);
    }

    public C46652Zx(View view, AnonymousClass17Y r3, C32691e2 r4, AnonymousClass9SI r5, C21060yb r6, C28371Sj r7) {
        super(view);
        this.A01 = r3;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = (ReadMoreTextView) C012005e.A02(view, R.id.payment_note_text);
    }

    public static void A00(Spannable spannable, TextEmojiLabel textEmojiLabel, C46652Zx r15, boolean z) {
        Context context = textEmojiLabel.getContext();
        ArrayList A0C = AnonymousClass6YV.A0C(spannable);
        if (A0C != null && !A0C.isEmpty()) {
            Iterator it = A0C.iterator();
            int i = 0;
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                String url = uRLSpan.getURL();
                spannable.setSpan(new C429721s(context, r15.A02, r15.A01, r15.A04, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                i++;
            }
            Iterator it2 = A0C.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
            if (i > 0) {
                if (textEmojiLabel.A00 == null) {
                    C36331k8.A16(textEmojiLabel, r15.A04);
                }
                textEmojiLabel.A0I(spannable);
            }
        }
        if (textEmojiLabel.A00 != null) {
            textEmojiLabel.setFocusable(false);
            C011504z.A06(textEmojiLabel, 0);
        }
        textEmojiLabel.setAccessibilityHelper((AnonymousClass0BN) null);
        if (!z) {
            return;
        }
        textEmojiLabel.A0I(spannable);
    }
}
