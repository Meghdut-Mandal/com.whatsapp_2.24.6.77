package X;

import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: X.8y7  reason: invalid class name and case insensitive filesystem */
public enum C187568y7 {
    ;

    /* access modifiers changed from: public */
    static {
        A00 = new B73(0);
        A01 = new B73(1);
    }

    public boolean A00(C203559oI r6, AUN aun, String str) {
        AU4 A0E;
        AU3 A0C;
        if (((B73) this).A00 != 0) {
            C187568y7 r2 = A00;
            if (r2.A00(r6, aun, str)) {
                return true;
            }
            if (aun.hasNationalNumber) {
                String valueOf = String.valueOf(aun.nationalNumber_);
                if (valueOf.startsWith("8") && aun.hasCountryCode && aun.countryCode_ == 7 && aun.hasCountryCodeSource && aun.countryCodeSource_ == C187918yk.FROM_DEFAULT_COUNTRY) {
                    long parseLong = Long.parseLong(valueOf.substring(1));
                    aun.hasNationalNumber = true;
                    aun.nationalNumber_ = parseLong;
                    C187918yk r0 = C187918yk.FROM_NUMBER_WITHOUT_PLUS_SIGN;
                    Objects.requireNonNull(r0);
                    aun.hasCountryCodeSource = true;
                    aun.countryCodeSource_ = r0;
                    return r2.A00(r6, aun, str);
                }
            }
            if (!aun.hasItalianLeadingZero || !aun.italianLeadingZero_) {
                return false;
            }
            aun.hasItalianLeadingZero = false;
            aun.italianLeadingZero_ = false;
            return r2.A00(r6, aun, str);
        } else if (!r6.A0N(aun)) {
            return false;
        } else {
            Pattern pattern = AYC.A08;
            int i = 0;
            while (i < str.length() - 1) {
                char charAt = str.charAt(i);
                if (charAt == 'x' || charAt == 'X') {
                    int i2 = i + 1;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == 'x' || charAt2 == 'X') {
                        if (r6.A0H(aun, str.substring(i2)) != C023109s.A0G) {
                            return false;
                        }
                        i = i2;
                    } else if (!C203559oI.A03(str.substring(i)).equals(aun.extension_)) {
                        return false;
                    }
                }
                i++;
            }
            if (aun.countryCodeSource_ != C187918yk.FROM_DEFAULT_COUNTRY || (A0E = r6.A0E(r6.A0I(aun.countryCode_))) == null || (A0C = r6.A0C(C203559oI.A02(aun), A0E.numberFormat_)) == null) {
                return true;
            }
            String str2 = A0C.nationalPrefixFormattingRule_;
            if (str2.length() <= 0 || A0C.nationalPrefixOptionalWhenFormatting_ || C203559oI.A03(str2.substring(0, str2.indexOf("$1"))).length() == 0) {
                return true;
            }
            return r6.A0L(A0E, C90524aI.A0i(C203559oI.A03(aun.rawInput_)), (StringBuilder) null);
        }
    }
}
