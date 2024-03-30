package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;

/* renamed from: X.3Xn  reason: invalid class name and case insensitive filesystem */
public final class C66843Xn implements TextWatcher {
    public boolean A00;
    public String A01 = "";
    public boolean A02;
    public final C87424Ot A03;
    public final CodeInputField A04;
    public final C88294Sd A05;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        SpannableStringBuilder spannableStringBuilder;
        C37391mI r4;
        int i;
        int length;
        int length2;
        CodeInputField codeInputField = this.A04;
        int selectionStart = codeInputField.getSelectionStart();
        Editable editable2 = editable;
        String replace = editable2.toString().replace(Character.toString(codeInputField.A01), "");
        if (!replace.isEmpty() && replace.charAt(0) != 160) {
            codeInputField.A04 = false;
        }
        int i2 = codeInputField.A02 / 2;
        int length3 = replace.length();
        if (length3 > 0 && this.A01.startsWith(replace.substring(0, 1)) && this.A01.indexOf(160) >= 0 && replace.indexOf(160) < 0 && selectionStart == i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(replace.substring(0, i2 - 1));
            replace = AnonymousClass000.A0q(replace.substring(i2), A0u);
            selectionStart--;
        } else if (length3 > selectionStart && replace.indexOf(160) == selectionStart && selectionStart == i2 + 1) {
            selectionStart++;
        }
        String replace2 = replace.replace(Character.toString(160), "");
        int length4 = replace2.length();
        int i3 = codeInputField.A02;
        if (i3 > 4) {
            if (length4 > i2) {
                length4++;
            }
            while (true) {
                length2 = replace2.length();
                if (length2 >= i2) {
                    break;
                }
                replace2 = AnonymousClass000.A0t(AnonymousClass000.A0v(replace2), codeInputField.A01);
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append(replace2.substring(0, i2));
            A0u2.append(160);
            A0u2.append(replace2.substring(i2, Math.min(codeInputField.A02, length2)));
            while (true) {
                replace2 = A0u2.toString();
                if (replace2.length() >= codeInputField.A02 + 1) {
                    break;
                }
                A0u2 = AnonymousClass000.A0v(replace2);
                A0u2.append(codeInputField.A01);
            }
        } else {
            while (true) {
                length = replace2.length();
                if (length >= i3) {
                    break;
                }
                replace2 = AnonymousClass000.A0t(AnonymousClass000.A0v(replace2), codeInputField.A01);
            }
            if (length > i3) {
                replace2 = replace2.substring(0, i3);
            }
        }
        if (codeInputField.A04) {
            spannableStringBuilder = C36441kJ.A0P(replace2);
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == codeInputField.A01) {
                    i = i4 + 1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i4, i, 33);
                    r4 = new C37391mI(codeInputField.getContext(), AnonymousClass00F.A00(codeInputField.getContext(), R.color.f6nameremoved));
                } else if (spannableStringBuilder.charAt(i4) != 160) {
                    r4 = new C37391mI(codeInputField.getContext(), C36351kA.A02(codeInputField.getContext(), codeInputField.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                    i = i4 + 1;
                }
                spannableStringBuilder.setSpan(r4, i4, i, 33);
            }
        } else {
            spannableStringBuilder = this.A03.BHn(replace2);
        }
        if (spannableStringBuilder.length() > 0) {
            InputFilter[] filters = editable2.getFilters();
            codeInputField.removeTextChangedListener(this);
            editable2.setFilters(new InputFilter[0]);
            Class<CharacterStyle> cls = CharacterStyle.class;
            for (Object removeSpan : editable2.getSpans(0, editable2.length(), cls)) {
                editable2.removeSpan(removeSpan);
            }
            editable2.replace(0, editable2.length(), spannableStringBuilder.toString());
            for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
                editable2.setSpan(obj, spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj), 18);
            }
            editable2.setFilters(filters);
            codeInputField.addTextChangedListener(this);
        }
        codeInputField.setSelection(Math.min(selectionStart, Math.min(length4, replace2.length())));
        if (!this.A00) {
            C88294Sd r3 = this.A05;
            String replaceAll = replace2.toString().replaceAll("[^0-9]", "");
            if (replaceAll.length() != codeInputField.A02) {
                this.A02 = false;
                r3.Bbi(replaceAll);
            } else if (!this.A02) {
                this.A02 = true;
                r3.BTv(replaceAll);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.A01 = charSequence.toString();
        }
    }

    public C66843Xn(C88294Sd r2, C87424Ot r3, CodeInputField codeInputField) {
        this.A05 = r2;
        this.A04 = codeInputField;
        this.A03 = r3;
    }
}
