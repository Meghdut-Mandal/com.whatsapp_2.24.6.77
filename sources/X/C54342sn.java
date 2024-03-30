package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.2sn  reason: invalid class name and case insensitive filesystem */
public abstract class C54342sn {
    public static final void A00(View view, AnonymousClass02E r10, AnonymousClass00S r11) {
        TextView A0P = C36391kE.A0P(view, R.id.galleryPermissionsInfoText);
        if (A0P != null) {
            String A0a = C36421kH.A0a(r10, R.string.f12nameremoved);
            String A0a2 = C36421kH.A0a(r10, R.string.f12nameremoved);
            String A0q = C36401kF.A0q(r10, A0a2, C36411kG.A1b(A0a), 1, R.string.f12nameremoved);
            AnonymousClass00C.A08(A0q);
            int A0C = AnonymousClass099.A0C(A0q, A0a, 0, false);
            int A0C2 = AnonymousClass099.A0C(A0q, A0a2, 0, false);
            SpannableStringBuilder A0P2 = C36441kJ.A0P(A0q);
            A0P2.setSpan(new StyleSpan(1), A0C, C36441kJ.A09(A0a, A0C), 33);
            A0P2.setSpan(new StyleSpan(1), A0C2, C36441kJ.A09(A0a2, A0C2), 33);
            A0P.setText(A0P2);
            A0P.requestLayout();
            View findViewById = view.findViewById(R.id.galleryPermisionsDeniedButton);
            if (findViewById != null) {
                AnonymousClass3YG.A00(findViewById, r11, r10, 25);
            }
        }
    }
}
