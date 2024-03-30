package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.twofactor.SetCodeFragment;

/* renamed from: X.3M1  reason: invalid class name */
public class AnonymousClass3M1 implements C87424Ot {
    public Object A00;
    public final int A01;

    public AnonymousClass3M1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final SpannableStringBuilder BHn(String str) {
        SpannableStringBuilder spannableStringBuilder;
        Context context;
        int A002;
        switch (this.A01) {
            case 0:
                Context context2 = (Context) this.A00;
                spannableStringBuilder = C36441kJ.A0P(str);
                for (int i = 0; i < spannableStringBuilder.length(); i++) {
                    if (spannableStringBuilder.charAt(i) == '*') {
                        int i2 = i + 1;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i, i2, 33);
                        spannableStringBuilder.setSpan(new C37391mI(context2, AnonymousClass00F.A00(context2, R.color.f6nameremoved)), i, i2, 33);
                    } else if (spannableStringBuilder.charAt(i) != 160) {
                        spannableStringBuilder.setSpan(new C37391mI(context2, C36351kA.A01(context2, R.attr.f4nameremoved, R.color.f6nameremoved)), i, i + 1, 33);
                    }
                }
                break;
            case 1:
                CodeInputField codeInputField = (CodeInputField) this.A00;
                spannableStringBuilder = C36441kJ.A0P(str);
                for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
                    if (spannableStringBuilder.charAt(i3) == codeInputField.A01) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(codeInputField.getContext(), R.color.f6nameremoved)), i3, i3 + 1, 33);
                    }
                }
                break;
            default:
                SetCodeFragment setCodeFragment = (SetCodeFragment) this.A00;
                spannableStringBuilder = C36441kJ.A0P(str);
                for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                    if (spannableStringBuilder.charAt(i4) == '*') {
                        context = setCodeFragment.A02.getContext();
                        A002 = R.color.f6nameremoved;
                    } else if (spannableStringBuilder.charAt(i4) != 160) {
                        context = setCodeFragment.A02.getContext();
                        A002 = C224514j.A00(setCodeFragment.A02.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
                    }
                    spannableStringBuilder.setSpan(new C37391mI(setCodeFragment.A02.getContext(), AnonymousClass00F.A00(context, A002)), i4, i4 + 1, 33);
                }
                break;
        }
        return spannableStringBuilder;
    }
}
