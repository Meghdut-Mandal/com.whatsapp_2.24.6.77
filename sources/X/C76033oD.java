package X;

/* renamed from: X.3oD  reason: invalid class name and case insensitive filesystem */
public final class C76033oD implements AnonymousClass4UU {
    public static final C76033oD A02 = new C76033oD("whatsapp_message_notification_disabled", "We received an OTP message, but were unable to show the OTP notification as you disabled WhatsApp notifications in the WhatsApp settings. Please un-mute the chat in the chat screen");
    public static final C76033oD A03 = new C76033oD("whatsapp_notification_disabled", "We received an OTP message, but were unable to show the OTP notification as you disabled WhatsApp notifications. Please turn it on in device settings");
    public static final C76033oD A04 = new C76033oD("zero_tap_unavailable", "Zero-tap is not yet available in this version of WhatsApp. Message will be delivered one-tap. Please update to the newest version of WhatsApp to test zero-tap");
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76033oD) {
                C76033oD r5 = (C76033oD) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C36381kD.A08(this.A00, C36421kH.A04(this.A01)) * 31) + 1231) * 31) + 1231;
    }

    public C76033oD(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String BAo() {
        return this.A00;
    }

    public String BDM() {
        return this.A01;
    }

    public boolean BHG() {
        return true;
    }

    public boolean BHV() {
        return true;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OtpEligibilityWarning(key=");
        A0u.append(this.A01);
        A0u.append(", debugMessage=");
        A0u.append(this.A00);
        A0u.append(", fallbackReason=");
        A0u.append((Object) null);
        A0u.append(", sendOnlyInEmulator=");
        A0u.append(true);
        A0u.append(", shouldSendToThirdPartyApp=");
        return C36321k7.A0H(A0u, true);
    }
}
