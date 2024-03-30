package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.8aw  reason: invalid class name and case insensitive filesystem */
public final class C175718aw extends C206279t0 {
    public static final HashSet A01 = C36421kH.A0g(new String[]{"vpa", "keys", "vpaName", "balance", "usableBalance", "updatedSenderVpa", "sufficientBalance"});
    public static final Parcelable.Creator CREATOR = new C205839sI();
    public Bundle A00;

    public void A04(AnonymousClass16T r16, C203399nx r17, int i) {
        ArrayList A0I;
        ArrayList A0I2;
        String str;
        String A0i;
        Bundle bundle;
        C203399nx r3 = r17;
        int i2 = i;
        if (i2 == 4) {
            String A0x = C36391kE.A0x(r3, "credential-id");
            if (A0x != null) {
                Bundle A07 = AnonymousClass001.A07();
                this.A00 = A07;
                A07.putString("credentialId", A0x);
                return;
            }
            return;
        }
        if (i2 == 5) {
            str = "keys";
            A0i = C36391kE.A0x(r3, str);
            if (A0i != null) {
                bundle = AnonymousClass001.A07();
                this.A00 = bundle;
            } else {
                return;
            }
        } else {
            if (i2 == 6) {
                this.A00 = AnonymousClass001.A07();
                String A0i2 = r3.A0i("vpa-mismatch", (String) null);
                if (A0i2 != null) {
                    this.A00.putString("updatedVpaFor", A0i2);
                    if (C203399nx.A0J(r3, "vpa-mismatch", "sender")) {
                        this.A00.putString("updatedSenderVpa", r3.A0i("vpa", (String) null));
                        this.A00.putString("updatedSenderVpaId", r3.A0i("vpa-id", (String) null));
                        return;
                    }
                    return;
                }
                String A0i3 = r3.A0i("valid", (String) null);
                if (A0i3 != null) {
                    this.A00.putString("valid", A0i3);
                }
                String A002 = A00(r3, "balance");
                if (A002 != null) {
                    this.A00.putString("balance", A002);
                }
                this.A00.putString("sufficientBalance", r3.A0i("sufficient-balance", (String) null));
            } else if (i2 == 8) {
                this.A00 = AnonymousClass001.A07();
                String A0i4 = r3.A0i("vpa-mismatch", (String) null);
                if (A0i4 != null) {
                    this.A00.putString("updatedVpaFor", A0i4);
                    if (C203399nx.A0J(r3, "vpa-mismatch", "sender")) {
                        this.A00.putString("updatedSenderVpa", r3.A0i("vpa", (String) null));
                        this.A00.putString("updatedSenderVpaId", r3.A0i("vpa-id", (String) null));
                    }
                    String A003 = A00(r3, "balance");
                    if (A003 != null) {
                        this.A00.putString("balance", A003);
                    }
                } else {
                    return;
                }
            } else if (i2 == 7) {
                this.A00 = AnonymousClass001.A07();
                this.A00.putString("vpa", r3.A0i("vpa", (String) null));
                this.A00.putString("vpaId", r3.A0i("vpa-id", (String) null));
                this.A00.putString("vpaName", r3.A0i("vpa-name", (String) null));
                this.A00.putString("vpaValid", r3.A0i("valid", (String) null));
                this.A00.putString("jid", r3.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_USER, (String) null));
                this.A00.putString("blocked", r3.A0i("blocked", (String) null));
                this.A00.putString("token", r3.A0i("token", (String) null));
                this.A00.putString("merchant", r3.A0i("merchant", (String) null));
                this.A00.putString("verifiedMerchant", r3.A0i("verified-merchant", (String) null));
                str = "mcc";
                A0i = r3.A0i(str, (String) null);
                bundle = this.A00;
            } else if (i2 == 2) {
                Bundle A072 = AnonymousClass001.A07();
                this.A00 = A072;
                String str2 = r3.A00;
                if ("psp".equals(str2)) {
                    A072.putString("providerType", r3.A0i("provider-type", (String) null));
                    Bundle bundle2 = this.A00;
                    String A0i5 = r3.A0i("sms-gateways", (String) null);
                    if (!TextUtils.isEmpty(A0i5)) {
                        A0I2 = C36351kA.A10(A0i5.split(","));
                    } else {
                        A0I2 = AnonymousClass001.A0I();
                    }
                    bundle2.putStringArrayList("smsGateways", A0I2);
                    this.A00.putString("smsPrefix", r3.A0i("sms-prefix", (String) null));
                    this.A00.putString("transactionPrefix", r3.A0i("transaction-prefix", (String) null));
                    return;
                } else if ("psp-routing".equals(str2)) {
                    String A0x2 = C36391kE.A0x(r3, "providers");
                    if (!TextUtils.isEmpty(A0x2)) {
                        A0I = C36351kA.A10(A0x2.split(","));
                    } else {
                        A0I = AnonymousClass001.A0I();
                    }
                    A072.putStringArrayList("pspRouting", A0I);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
            String A004 = A00(r3, "usable-balance");
            if (A004 != null) {
                this.A00.putString("usableBalance", A004);
                return;
            }
            return;
        }
        bundle.putString(str, A0i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public static String A00(C203399nx r6, String str) {
        C203399nx A0c = r6.A0c(str);
        if (A0c == null) {
            return C36391kE.A0x(r6, str);
        }
        try {
            C203399nx A0d = A0c.A0d("money");
            return String.valueOf(((double) ((long) C203399nx.A00(A0d, "value"))) / ((double) ((long) C203399nx.A00(A0d, "offset"))));
        } catch (C235919b unused) {
            Log.e("PAY: IndiaUpiPaymentData parseBalance failure");
            return null;
        }
    }

    public String A05() {
        throw null;
    }

    public String toString() {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator<String> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            boolean contains = A01.contains(A0C);
            StringBuilder A0u = AnonymousClass000.A0u();
            if (!contains) {
                A0u.append(A0C);
                A0u.append("=");
                A0u.append(this.A00.get(A0C));
            } else {
                A0u.append(A0C);
                A0u.append("=SCRUBBED");
            }
            A0I.add(A0u.toString());
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(" [ bundle: {");
        A0u2.append(TextUtils.join(", ", A0I));
        return AnonymousClass000.A0q("}]", A0u2);
    }

    public void A06(String str) {
        throw null;
    }
}
