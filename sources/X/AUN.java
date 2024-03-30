package X;

import java.io.Serializable;
import java.util.Objects;

public class AUN implements Serializable {
    public static final long serialVersionUID = 1;
    public C187918yk countryCodeSource_ = C187918yk.FROM_NUMBER_WITH_PLUS_SIGN;
    public int countryCode_ = 0;
    public String extension_ = "";
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public boolean hasSecondLeadingZero;
    public boolean italianLeadingZero_ = false;
    public long nationalNumber_ = 0;
    public String preferredDomesticCarrierCode_ = "";
    public String rawInput_ = "";
    public boolean secondLeadingZero_ = false;

    public boolean A01(AUN aun) {
        if (aun == null) {
            return false;
        }
        if (this == aun) {
            return true;
        }
        return this.countryCode_ == aun.countryCode_ && this.nationalNumber_ == aun.nationalNumber_ && this.extension_.equals(aun.extension_) && this.italianLeadingZero_ == aun.italianLeadingZero_ && this.rawInput_.equals(aun.rawInput_) && this.countryCodeSource_ == aun.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(aun.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == aun.hasPreferredDomesticCarrierCode && this.secondLeadingZero_ == aun.secondLeadingZero_;
    }

    public void A00(AUN aun) {
        if (aun.hasCountryCode) {
            int i = aun.countryCode_;
            this.hasCountryCode = true;
            this.countryCode_ = i;
        }
        if (aun.hasNationalNumber) {
            long j = aun.nationalNumber_;
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
        }
        if (aun.hasExtension) {
            String str = aun.extension_;
            Objects.requireNonNull(str);
            this.hasExtension = true;
            this.extension_ = str;
        }
        if (aun.hasItalianLeadingZero) {
            boolean z = aun.italianLeadingZero_;
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
        }
        if (aun.hasRawInput) {
            String str2 = aun.rawInput_;
            Objects.requireNonNull(str2);
            this.hasRawInput = true;
            this.rawInput_ = str2;
        }
        if (aun.hasCountryCodeSource) {
            C187918yk r1 = aun.countryCodeSource_;
            Objects.requireNonNull(r1);
            this.hasCountryCodeSource = true;
            this.countryCodeSource_ = r1;
        }
        if (aun.hasPreferredDomesticCarrierCode) {
            String str3 = aun.preferredDomesticCarrierCode_;
            Objects.requireNonNull(str3);
            this.hasPreferredDomesticCarrierCode = true;
            this.preferredDomesticCarrierCode_ = str3;
        }
        if (aun.hasSecondLeadingZero) {
            boolean z2 = aun.secondLeadingZero_;
            this.hasSecondLeadingZero = true;
            this.secondLeadingZero_ = z2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AUN) || !A01((AUN) obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A02 = C36401kF.A02(Long.valueOf(this.nationalNumber_), (2173 + this.countryCode_) * 53) * 53;
        int i = 1231;
        int A0B = ((C90504aG.A0B(this.preferredDomesticCarrierCode_, C36401kF.A02(this.countryCodeSource_, C90504aG.A0B(this.rawInput_, ((C90504aG.A0B(this.extension_, A02) * 53) + C36341k9.A01(this.italianLeadingZero_ ? 1 : 0)) * 53) * 53) * 53) * 53) + C36341k9.A01(this.hasPreferredDomesticCarrierCode ? 1 : 0)) * 53;
        if (!this.secondLeadingZero_) {
            i = 1237;
        }
        return A0B + i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Country Code: ");
        A0u.append(this.countryCode_);
        A0u.append(" National Number: ");
        A0u.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            A0u.append(" Leading Zero: true");
        }
        if (this.hasExtension) {
            A0u.append(" Extension: ");
            A0u.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            A0u.append(" Country Code Source: ");
            A0u.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            A0u.append(" Preferred Domestic Carrier Code: ");
            A0u.append(this.preferredDomesticCarrierCode_);
        }
        if (this.hasSecondLeadingZero && this.secondLeadingZero_) {
            A0u.append(" Second Leading Zero: true");
        }
        return A0u.toString();
    }
}
