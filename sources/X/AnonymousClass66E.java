package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.66E  reason: invalid class name */
public final class AnonymousClass66E {
    public boolean A00 = true;
    public final C21430zE A01;

    public AnonymousClass66E(C21430zE r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public final void A00(String str) {
        C21430zE r1;
        String str2;
        AnonymousClass00C.A0D(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1313911455) {
            if (hashCode != 3260) {
                if (hashCode != 3358) {
                    if (hashCode == 97213313 && str.equals("fb_ig")) {
                        r1 = this.A01;
                        str2 = "fetch_auth_fb_ig_error";
                    } else {
                        return;
                    }
                } else if (str.equals("ig")) {
                    r1 = this.A01;
                    str2 = "fetch_auth_ig_error";
                } else {
                    return;
                }
            } else if (str.equals("fb")) {
                r1 = this.A01;
                str2 = "fetch_auth_fb_error";
            } else {
                return;
            }
        } else if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
            r1 = this.A01;
            str2 = "fetch_auth_timeout";
        } else {
            return;
        }
        r1.markerPoint(551497305, str2);
    }

    public final void A01(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A01.markerAnnotate(551497305, "fetch_source", str);
    }
}
