package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;
import com.whatsapp.R;

/* renamed from: X.3Oh  reason: invalid class name and case insensitive filesystem */
public class C64513Oh {
    public static final TypefaceSpan A02 = new TypefaceSpan("monospace");
    public final C19630wG A00;
    public final C18820ts A01;

    public SpannableStringBuilder A00(long j, long j2) {
        String A012;
        Spannable[] spannableArr;
        SpannableString A0O;
        char c;
        C19630wG r1;
        int i;
        SpannableString A0O2 = C36441kJ.A0O(this.A01.A0N().format(((double) j) / 100.0d));
        if (A0O2.length() > 0) {
            A0O2.setSpan(A02, 0, A0O2.length() - 1, 33);
        }
        if (j2 < 60000) {
            A0O = C36441kJ.A0O(String.valueOf(C36391kE.A0B(j2)));
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (j2 < 3600000) {
            A0O = C36441kJ.A0O(String.valueOf(j2 / 60000));
            r1 = this.A00;
            i = R.string.f12nameremoved;
        } else if (j2 < 43200000) {
            SpannableString A0O3 = C36441kJ.A0O(String.valueOf(j2 / 3600000));
            A0O = C36441kJ.A0O(String.valueOf((j2 % 3600000) / 60000));
            A012 = this.A00.A01(R.string.f12nameremoved);
            spannableArr = new Spannable[3];
            C36331k8.A1N(A0O2, A0O3, spannableArr);
            c = 2;
            spannableArr[c] = A0O;
            return AnonymousClass6YV.A04(A012, spannableArr);
        } else {
            A012 = this.A00.A01(R.string.f12nameremoved);
            spannableArr = new Spannable[]{A0O2};
            return AnonymousClass6YV.A04(A012, spannableArr);
        }
        A012 = r1.A01(i);
        spannableArr = new Spannable[2];
        spannableArr[0] = A0O2;
        c = 1;
        spannableArr[c] = A0O;
        return AnonymousClass6YV.A04(A012, spannableArr);
    }

    public C64513Oh(C19630wG r1, C18820ts r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
