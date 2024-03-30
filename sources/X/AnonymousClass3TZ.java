package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.3TZ  reason: invalid class name */
public abstract class AnonymousClass3TZ {
    public static AnonymousClass11F A01(C19730wQ r3, AnonymousClass141 r4, AnonymousClass3T1 r5) {
        if (r5 == null || r5.A0D == 6 || (!r4.A0G() && !(r4.A0H instanceof C177618e5))) {
            return null;
        }
        if (r5.A1J.A02) {
            return C36441kJ.A0n(r3);
        }
        AnonymousClass11F A0J = r5.A0J();
        if (A0J != null) {
            return A0J;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("conversations_row/missing_rmt_src:");
        C36321k7.A1Z(A0u, C66013Ui.A0F(r5));
        return null;
    }

    public static CharSequence A02(Context context, C19730wQ r3, AnonymousClass171 r4, C18820ts r5, AnonymousClass141 r6, C20810yC r7, CharSequence charSequence, boolean z) {
        CharSequence A03 = A03(context, r3, r4, r5, r6, r7, z);
        if (TextUtils.isEmpty(A03)) {
            return charSequence;
        }
        boolean A0C = AnonymousClass1JZ.A0C(charSequence);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = A03;
        char c = 8207;
        if (A0C) {
            c = 8206;
        }
        String valueOf = String.valueOf(c);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = charSequence;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }

    public static AnonymousClass11F A00(C19730wQ r2, AnonymousClass1HX r3, AnonymousClass141 r4, AnonymousClass3T1 r5) {
        AnonymousClass11F A0J;
        if (r5 == null || (A0J = r5.A0J()) == null || !C197029b1.A00(A0J) || !r3.A00.A00()) {
            return A01(r2, r4, r5);
        }
        return A0J;
    }

    public static CharSequence A03(Context context, C19730wQ r5, AnonymousClass171 r6, C18820ts r7, AnonymousClass141 r8, C20810yC r9, boolean z) {
        String string;
        AnonymousClass11F r0;
        if (z) {
            string = context.getString(R.string.f12nameremoved);
        } else if (r8 == null || (r0 = r8.A0H) == null || r5.A0M(r0)) {
            string = "";
        } else {
            string = C36381kD.A0v(r6, r8);
            if (r9.A0E(7459)) {
                string = AnonymousClass14B.A0D(string, 128);
            }
        }
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        String A0q = AnonymousClass000.A0q(": ", AnonymousClass000.A0v(string));
        CharSequence[] charSequenceArr = new CharSequence[3];
        char c = 8207;
        if (C36351kA.A1Y(r7)) {
            c = 8206;
        }
        String valueOf = String.valueOf(c);
        charSequenceArr[0] = valueOf;
        charSequenceArr[1] = A0q;
        charSequenceArr[2] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }

    public static CharSequence A04(CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence2)) {
            return charSequence;
        }
        boolean A0C = AnonymousClass1JZ.A0C(charSequence2);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = charSequence;
        char c = 8207;
        if (A0C) {
            c = 8206;
        }
        String valueOf = String.valueOf(c);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = charSequence2;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }
}
