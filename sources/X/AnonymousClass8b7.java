package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8b7  reason: invalid class name */
public class AnonymousClass8b7 extends C175858bB {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(47);
    public int A00 = 0;
    public int A01;
    public String A02 = null;
    public String A03;
    public String A04;
    public String A05 = null;
    public boolean A06;
    public boolean A07;
    public int A08 = 1;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0124, code lost:
        if (X.C203399nx.A0J(r4, "default-eligible-p2p", "1") != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0093, code lost:
        if (X.C203399nx.A0J(r8, "default-debit", "1") != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass16T r7, X.C203399nx r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "verified"
            r2 = 0
            java.lang.String r0 = r8.A0i(r0, r2)
            java.lang.String r5 = "1"
            boolean r0 = r5.equals(r0)
            r6.A0a = r0
            java.lang.String r0 = "automatic-binding"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r6.A06 = r0
            java.lang.String r0 = "bank-name"
            java.lang.String r1 = r8.A0i(r0, r2)
            java.lang.String r0 = "bankName"
            X.6c7 r0 = X.C202349ld.A01(r1, r0)
            r6.A08 = r0
            java.lang.String r0 = "bank-phone-number"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A0B = r0
            java.lang.String r3 = "image"
            java.lang.String r0 = r8.A0i(r3, r2)
            r6.A0A = r0
            java.lang.String r0 = "time-last-added"
            java.lang.String r4 = r8.A0i(r0, r2)
            r0 = -1
            long r0 = X.AnonymousClass6R8.A01(r4, r0)
            r6.A06 = r0
            java.lang.String r0 = "pending-verification-type"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A0O = r0
            java.lang.String r0 = "country"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A0G = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A0H = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.A0i(r0, r2)
            int r0 = X.C175798b4.A00(r0)
            r6.A00 = r0
            java.lang.String r0 = "created"
            long r0 = X.C203399nx.A02(r8, r0)
            r6.A05 = r0
            java.lang.String r0 = "network-type"
            java.lang.String r0 = r8.A0i(r0, r2)
            int r0 = X.C175798b4.A01(r0)
            r6.A01 = r0
            java.lang.String r0 = "last4"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A0J = r0
            java.lang.String r0 = "default-debit-p2p"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r4 = 0
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "default-debit"
            boolean r1 = X.C203399nx.A0J(r8, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x0096
        L_0x0095:
            r0 = 1
        L_0x0096:
            r6.A0W = r0
            java.lang.String r0 = "default-credit-p2p"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "default-credit"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            if (r0 == 0) goto L_0x00a9
        L_0x00a8:
            r4 = 1
        L_0x00a9:
            r6.A0V = r4
            java.lang.String r0 = "default-debit-p2m"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r6.A0S = r0
            java.lang.String r0 = "default-credit-p2m"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r6.A0R = r0
            java.lang.String r0 = "needs-device-binding"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r6.A07 = r0
            java.lang.String r0 = "binding-type"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A02 = r0
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A05 = r0
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r6.A0Y = r0
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = X.C203399nx.A0J(r8, r0, r5)
            r6.A0U = r0
            java.lang.String r1 = "state"
            java.lang.String r0 = "UNSET"
            java.lang.String r0 = r8.A0i(r1, r0)
            r6.A0F = r0
            java.lang.String r0 = "display-state"
            java.lang.String r1 = r8.A0i(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = "ACTIVE"
        L_0x00fb:
            r6.A0I = r1
            java.lang.String r0 = "capabilities"
            X.9nx r4 = r8.A0c(r0)
            if (r4 == 0) goto L_0x0197
            java.lang.String r0 = "editable"
            boolean r0 = X.C203399nx.A0J(r4, r0, r5)
            r6.A0P = r0
            java.lang.String r0 = "verifiable"
            boolean r0 = X.C203399nx.A0J(r4, r0, r5)
            r6.A0Z = r0
            java.lang.String r0 = "default-eligible"
            boolean r0 = X.C203399nx.A0J(r4, r0, r5)
            if (r0 != 0) goto L_0x0126
            java.lang.String r0 = "default-eligible-p2p"
            boolean r1 = X.C203399nx.A0J(r4, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x0127
        L_0x0126:
            r0 = 1
        L_0x0127:
            r6.A0X = r0
            java.lang.String r0 = "default-eligible-p2m"
            boolean r0 = X.C203399nx.A0J(r4, r0, r5)
            r6.A0T = r0
            java.lang.String r0 = "p2p-send"
            java.lang.String r0 = r4.A0i(r0, r2)
            java.lang.String r0 = X.C175858bB.A01(r0)
            if (r0 != 0) goto L_0x0151
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x01cb
            java.lang.String r1 = r6.A0I
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01cb
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = "ENABLED"
        L_0x0151:
            r6.A0N = r0
            java.lang.String r0 = "p2p-receive"
            java.lang.String r0 = r4.A0i(r0, r2)
            java.lang.String r0 = X.C175858bB.A01(r0)
            if (r0 != 0) goto L_0x0163
            java.lang.String r0 = r6.A0A()
        L_0x0163:
            r6.A0M = r0
            java.lang.String r0 = "p2m-send"
            java.lang.String r0 = r4.A0i(r0, r2)
            java.lang.String r0 = X.C175858bB.A01(r0)
            if (r0 != 0) goto L_0x0185
            boolean r0 = r6.A0U
            if (r0 == 0) goto L_0x01c5
            java.lang.String r1 = r6.A0I
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = "ENABLED"
        L_0x0185:
            r6.A0L = r0
            java.lang.String r0 = "p2m-receive"
            java.lang.String r0 = r4.A0i(r0, r2)
            java.lang.String r0 = X.C175858bB.A01(r0)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "DISABLED"
        L_0x0195:
            r6.A0K = r0
        L_0x0197:
            java.lang.String r0 = "verification-status"
            java.lang.String r0 = r8.A0i(r0, r2)
            int r0 = X.C207249un.A04(r0)
            r6.A01 = r0
            X.9nx r1 = r8.A0c(r3)
            java.lang.String r0 = "image-content-id"
            if (r1 == 0) goto L_0x01ce
            java.lang.String r0 = r1.A0i(r0, r2)
            r6.A0C = r0
            java.lang.String r0 = "image-url"
            java.lang.String r0 = r1.A0i(r0, r2)
            r6.A0E = r0
            java.lang.String r0 = "image-label-color"
            java.lang.String r0 = r1.A0i(r0, r2)
            r6.A0D = r0
            return
        L_0x01c2:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x0185
        L_0x01c5:
            java.lang.String r0 = "DISABLED"
            goto L_0x0185
        L_0x01c8:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x0151
        L_0x01cb:
            java.lang.String r0 = "DISABLED"
            goto L_0x0151
        L_0x01ce:
            java.lang.String r0 = r8.A0i(r0, r2)
            r6.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8b7.A04(X.16T, X.9nx, int):void");
    }

    public void A06(String str) {
        String str2;
        String str3;
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A0a = A1C.optBoolean("verified", false);
                this.A08 = C202349ld.A01(A1C.optString("bankName", (String) null), "bankName");
                this.A07 = C202349ld.A01(A1C.optString("bankCode", (String) null), "bankCode");
                this.A0B = A1C.optString("bankPhoneNumber", (String) null);
                this.A0A = A1C.optString("bankLogoUrl", this.A0A);
                this.A06 = A1C.optLong("timeLastAdded", -1);
                this.A0O = A1C.optString("verificationType", (String) null);
                this.A0Q = A1C.optBoolean("otpNumberMatch", false);
                this.A02 = A1C.optInt("otpLength", 8);
                String optString = A1C.optString("displayState", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "ACTIVE";
                }
                this.A0I = optString;
                this.A0P = A1C.optBoolean("editable", false);
                this.A0Z = A1C.optBoolean("verifiable", false);
                String str4 = "p2pDefaultEligible";
                if (!A1C.has(str4)) {
                    str4 = "defaultEligible";
                }
                this.A0X = A1C.optBoolean(str4, false);
                this.A0T = A1C.optBoolean("p2mDefaultEligible", false);
                if (!this.A0Y || !"ACTIVE".equals(this.A0I)) {
                    str2 = "DISABLED";
                } else if (this.A0a) {
                    str2 = "ENABLED";
                } else {
                    str2 = "REQUIRES_VERIFICATION";
                }
                this.A0N = A1C.optString("p2pSend", str2);
                this.A0M = A1C.optString("p2pReceive", A0A());
                if (!this.A0U || !"ACTIVE".equals(this.A0I)) {
                    str3 = "DISABLED";
                } else if (this.A0a) {
                    str3 = "ENABLED";
                } else {
                    str3 = "REQUIRES_VERIFICATION";
                }
                this.A0L = A1C.optString("p2mSend", str3);
                this.A0K = A1C.optString("p2mReceive", "DISABLED");
                this.A08 = A1C.optInt("v", 1);
                this.A03 = A1C.optInt("paymentRails", 0);
                this.A0Y = A1C.optBoolean("p2pEligible", false);
                this.A0U = A1C.optBoolean("p2mEligible", false);
                this.A07 = A1C.optBoolean("needsDeviceBinding", false);
                this.A06 = A1C.optBoolean("automaticBinding", false);
                this.A02 = A1C.optString("bindingType", (String) null);
                this.A05 = A1C.optString("tokenId", (String) null);
                this.A0C = A1C.optString("cardImageContentId", (String) null);
                this.A0E = A1C.optString("cardImageUrl", (String) null);
                this.A0D = A1C.optString("cardImageLabelColor", (String) null);
                this.A0J = A1C.optString("lastFour", (String) null);
                this.A09 = Long.valueOf(A1C.optLong("cardDataUpdatedTimeMillis", 0));
                this.A04 = A1C.optString("notificationType", (String) null);
                this.A0F = A1C.optString("cardState", "UNSET");
                this.A01 = A1C.optInt("verificationStatus");
            } catch (JSONException e) {
                C36321k7.A1L(e, "PAY: BrazilCardMethodData fromDBString threw: ", AnonymousClass000.A0u());
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0O);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A09.longValue());
        parcel.writeString(this.A04);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
    }

    public String A05() {
        try {
            JSONObject A1B = C36441kJ.A1B();
            try {
                A1B.put("verified", this.A0a);
                C135086c7 r1 = this.A08;
                if (!C202349ld.A03(r1)) {
                    C165607th.A1D(r1, "bankName", A1B);
                }
                C135086c7 r12 = this.A07;
                if (!C202349ld.A03(r12)) {
                    C165607th.A1D(r12, "bankCode", A1B);
                }
                String str = this.A0B;
                if (str != null) {
                    A1B.put("bankPhoneNumber", str);
                }
                String str2 = this.A0A;
                if (str2 != null) {
                    A1B.put("bankLogoUrl", str2);
                }
                long j = this.A06;
                if (j >= 0) {
                    A1B.put("timeLastAdded", j);
                }
                String str3 = this.A0O;
                if (str3 != null) {
                    A1B.put("verificationType", str3);
                }
                if ("otp".equals(this.A0O)) {
                    A1B.put("otpNumberMatch", this.A0Q);
                }
                int i = this.A02;
                if (i >= 0) {
                    A1B.put("otpLength", i);
                }
                String str4 = this.A0I;
                if (str4 != null) {
                    A1B.put("displayState", str4);
                }
                try {
                    A1B.put("editable", this.A0P);
                    A1B.put("verifiable", this.A0Z);
                    A1B.put("p2pDefaultEligible", this.A0X);
                    A1B.put("p2mDefaultEligible", this.A0T);
                    A1B.put("p2pSend", this.A0N);
                    A1B.put("p2pReceive", this.A0M);
                    A1B.put("p2mSend", this.A0L);
                    A1B.put("p2mReceive", this.A0K);
                } catch (JSONException e) {
                    C36321k7.A1L(e, "PAY: PaymentMethodCardCountryData/addCapabilitiesToJson threw: ", AnonymousClass000.A0u());
                }
            } catch (JSONException e2) {
                C36321k7.A1L(e2, "PAY: PaymentMethodCardCountryData toJSONObject threw: ", AnonymousClass000.A0u());
            }
            A1B.put("v", this.A08);
            A1B.put("paymentRails", this.A03);
            A1B.put("needsDeviceBinding", this.A07);
            A1B.put("automaticBinding", this.A06);
            String str5 = this.A02;
            if (str5 != null) {
                A1B.put("bindingType", str5);
            }
            String str6 = this.A05;
            if (str6 != null) {
                A1B.put("tokenId", str6);
            }
            String str7 = this.A0C;
            if (str7 != null) {
                A1B.put("cardImageContentId", str7);
            }
            String str8 = this.A0E;
            if (str8 != null) {
                A1B.put("cardImageUrl", str8);
            }
            String str9 = this.A0D;
            if (str9 != null) {
                A1B.put("cardImageLabelColor", str9);
            }
            String str10 = this.A0J;
            if (str10 != null) {
                A1B.put("lastFour", str10);
            }
            Long l = this.A09;
            if (l != null) {
                A1B.put("cardDataUpdatedTimeMillis", l);
            }
            A1B.put("notificationType", this.A04);
            A1B.put("cardState", this.A0F);
            A1B.put("p2pEligible", this.A0Y);
            A1B.put("p2mEligible", this.A0U);
            A1B.put("verificationStatus", this.A01);
            return A1B.toString();
        } catch (JSONException e3) {
            C36321k7.A1L(e3, "PAY: BrazilCardMethodData toDBString threw: ", AnonymousClass000.A0u());
            return null;
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ verified: ");
        A0u.append(this.A0a);
        A0u.append(" automaticBinding: ");
        A0u.append(this.A06);
        A0u.append(" accountType: ");
        A0u.append(this.A00);
        A0u.append(" bankName: ");
        A0u.append(this.A08);
        A0u.append(" bankPhoneNumber: ");
        A0u.append(this.A0B);
        A0u.append(" bankLogoUrl: ");
        A0u.append(this.A0A);
        A0u.append(" verificationType: ");
        A0u.append(this.A0O);
        A0u.append(" otpNumberMatch: ");
        A0u.append(this.A0Q);
        A0u.append(" paymentRails: ");
        A0u.append(this.A03);
        A0u.append(" p2pEligible: ");
        A0u.append(this.A0Y);
        A0u.append(" p2mEligible: ");
        A0u.append(this.A0U);
        A0u.append(" timeLastAdded: ");
        A0u.append(this.A06);
        A0u.append(" needsDeviceBinding: ");
        A0u.append(this.A07);
        A0u.append(" bindingType: ");
        A0u.append(this.A02);
        A0u.append(" cardImageContentId: ");
        A0u.append(this.A0C);
        A0u.append(" cardImageUrl: ");
        A0u.append(this.A0E);
        A0u.append(" cardImageLabelColor: ");
        A0u.append(this.A0D);
        A0u.append(" notificationType: ");
        A0u.append(this.A04);
        A0u.append(" lastFour: ");
        A0u.append(this.A0J);
        A0u.append("payoutVerificationStatus: ");
        A0u.append(this.A01);
        A0u.append(" displayState: ");
        StringBuilder A0q = C90484aE.A0q(this.A0I, A0u);
        A0q.append(" capabilities { editable: ");
        A0q.append(this.A0P);
        A0q.append(", verifiable: ");
        A0q.append(this.A0Z);
        A0q.append(", p2pDefaultEligible: ");
        A0q.append(this.A0X);
        A0q.append(", p2mDefaultEligible: ");
        A0q.append(this.A0T);
        A0q.append(", p2pSend: ");
        A0q.append(this.A0N);
        A0q.append(", p2pReceive: ");
        A0q.append(this.A0M);
        A0q.append(", p2mSend: ");
        A0q.append(this.A0L);
        A0q.append(", p2mReceive: ");
        A0q.append(this.A0K);
        A0q.append("}");
        C36351kA.A1K(A0q, A0u);
        return AnonymousClass000.A0q(" ]", A0u);
    }
}
