package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.banners.WDSBannerCompact;
import java.util.Objects;

/* renamed from: X.2HG  reason: invalid class name */
public class AnonymousClass2HG extends AnonymousClass2HL {
    public AnonymousClass141 A00;
    public WDSBannerCompact A01 = null;
    public final C21100yf A02;
    public final C220712t A03;
    public final C220412q A04;
    public final boolean A05;
    public final C21060yb A06;
    public final AnonymousClass1H2 A07;
    public final C19890wg A08;
    public final C32681e1 A09;

    public AnonymousClass2HG(ViewGroup viewGroup, C21100yf r3, AnonymousClass4V7 r4, C21060yb r5, C220712t r6, C220412q r7, AnonymousClass141 r8, AnonymousClass1H2 r9, C19890wg r10, C32681e1 r11, boolean z) {
        super(viewGroup, r4, 40);
        this.A09 = r11;
        this.A04 = r7;
        this.A03 = r6;
        this.A07 = r9;
        this.A02 = r3;
        this.A06 = r5;
        this.A08 = r10;
        this.A00 = r8;
        this.A05 = z;
    }

    private SpannableStringBuilder A00(TextPaint textPaint) {
        AnonymousClass3QL r0 = this.A00.A0K;
        Objects.requireNonNull(r0);
        CharSequence A032 = AnonymousClass3UG.A03(C80183uz.A05(this), textPaint, this.A07, r0.A03);
        C21060yb r1 = this.A06;
        C19890wg r02 = this.A08;
        float textSize = textPaint.getTextSize();
        int A012 = AnonymousClass1K2.A01(r1, r02);
        int i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        if (A012 < 2011) {
            i = 512;
        }
        return C36441kJ.A0P(AnonymousClass6YV.A01(A032, textSize, -16777216, i, false));
    }

    public static void A01(AnonymousClass2HG r4) {
        C48912iG r2 = new C48912iG(r4, 33);
        WDSBannerCompact wDSBannerCompact = r4.A01;
        if (wDSBannerCompact != null) {
            wDSBannerCompact.setOnClickListener(r2);
            TextPaint textPaint = r4.A01.getTextPaint();
            Objects.requireNonNull(textPaint);
            SpannableStringBuilder A002 = r4.A00(textPaint);
            ReadMoreTextView readMoreTextView = r4.A01.A00;
            if (readMoreTextView != null) {
                readMoreTextView.A0I(A002);
                return;
            }
            return;
        }
        ViewGroup viewGroup = r4.A01;
        viewGroup.setOnClickListener(r2);
        ReadMoreTextView readMoreTextView2 = (ReadMoreTextView) viewGroup.findViewById(R.id.group_description_text);
        readMoreTextView2.A02 = new AnonymousClass4Y6(r4, 0);
        SpannableStringBuilder A003 = r4.A00(readMoreTextView2.getPaint());
        r4.A09.A04(readMoreTextView2.getContext(), A003);
        readMoreTextView2.A0I(A003);
    }
}
