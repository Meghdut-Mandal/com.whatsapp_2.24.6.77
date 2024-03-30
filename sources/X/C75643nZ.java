package X;

import android.text.Spannable;
import android.text.style.UnderlineSpan;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.3nZ  reason: invalid class name and case insensitive filesystem */
public final class C75643nZ implements AnonymousClass4R5 {
    public AnonymousClass4R5 A00;
    public TextEntryView A01;
    public final C146806wC A02;
    public final AnonymousClass3A1 A03;

    public void A00(CharSequence charSequence, int i) {
        float f;
        AnonymousClass3A1 r4 = this.A03;
        String obj = charSequence.toString();
        AnonymousClass00C.A0D(obj, 0);
        r4.A04 = obj;
        TextEntryView textEntryView = this.A01;
        if (AnonymousClass000.A1Q(charSequence.length())) {
            DoodleEditText doodleEditText = textEntryView.A03;
            if (doodleEditText == null) {
                throw C36331k8.A0d("doodleEditText");
            }
            f = doodleEditText.getTextSize();
        } else {
            WaTextView waTextView = textEntryView.A00;
            if (waTextView == null) {
                throw C36331k8.A0d("textHolder");
            }
            waTextView.setText(charSequence);
            WaTextView waTextView2 = textEntryView.A00;
            if (waTextView2 == null) {
                throw C36331k8.A0d("textHolder");
            }
            f = waTextView2.getTextSize();
            DoodleEditText doodleEditText2 = textEntryView.A03;
            if (doodleEditText2 == null) {
                throw C36331k8.A0d("doodleEditText");
            }
            doodleEditText2.setTextSize(0, f);
        }
        r4.A00 = f;
        r4.A02 = i;
        Spannable spannable = (Spannable) charSequence;
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spannable.getSpans(0, charSequence.length(), UnderlineSpan.class);
        AnonymousClass00C.A0B(underlineSpanArr);
        for (UnderlineSpan removeSpan : underlineSpanArr) {
            spannable.removeSpan(removeSpan);
        }
    }

    public void dismiss() {
        AnonymousClass4R5 r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public C75643nZ(C146806wC r1, AnonymousClass3A1 r2, TextEntryView textEntryView) {
        this.A02 = r1;
        this.A01 = textEntryView;
        this.A03 = r2;
    }
}
