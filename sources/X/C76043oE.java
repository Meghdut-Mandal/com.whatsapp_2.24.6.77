package X;

/* renamed from: X.3oE  reason: invalid class name and case insensitive filesystem */
public final class C76043oE implements AnonymousClass4UU {
    public static final C76043oE A05 = new C76043oE(C36401kF.A0j(), "ambiguous_delivery_destination", "There are multiple active OTP requests for the packages specified by this template, and we could not determine which package to deliver the code to.", true, true);
    public static final C76043oE A06;
    public static final C76043oE A07 = new C76043oE(C36361kB.A0j(), "incorrect_signature_hash", "The signature hash of the installed app is %s, which does not match the signature hash declared in the one-tap template. Please update the template to reflect the correct signature hash", true, true);
    public static final C76043oE A08 = new C76043oE(0, "missing_handshake_or_disorder", "We received an OTP message but were unable to use one-tap as we did not receive the first part of the handshake.", false, true);
    public static final C76043oE A09;
    public static final C76043oE A0A;
    public static final C76043oE A0B = new C76043oE(1, "otp_request_expired", "Too much time elapsed between the OTP_REQUESTED intent and actual WhatsApp message delivery.", false, true);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76043oE) {
                C76043oE r5 = (C76043oE) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00(C36351kA.A05(this.A00, (C36421kH.A04(this.A02) + C36341k9.A09(this.A01)) * 31), this.A03) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    static {
        Integer A0o = C36371kC.A0o();
        A06 = new C76043oE(A0o, "incompatible_os_version", "The current Android version is < 19. one-tap is not supported due to missing platform features.", true, true);
        A0A = new C76043oE(A0o, "no_retriever_button", (String) null, true, false);
        A09 = new C76043oE(A0o, "no_package_name", (String) null, true, false);
    }

    public C76043oE(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public String BAo() {
        return this.A01;
    }

    public String BDM() {
        return this.A02;
    }

    public boolean BHG() {
        return this.A03;
    }

    public boolean BHV() {
        return this.A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OtpSecurityIneligibility(key=");
        A0u.append(this.A02);
        A0u.append(", debugMessage=");
        A0u.append(this.A01);
        A0u.append(", fallbackReason=");
        A0u.append(this.A00);
        A0u.append(", sendOnlyInEmulator=");
        A0u.append(this.A03);
        A0u.append(", shouldSendToThirdPartyApp=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
