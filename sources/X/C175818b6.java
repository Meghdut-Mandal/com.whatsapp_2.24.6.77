package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8b6  reason: invalid class name and case insensitive filesystem */
public final class C175818b6 extends C175848bA {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(43);
    public int A00 = -1;
    public int A01;
    public C135086c7 A02;
    public C135086c7 A03;
    public C135086c7 A04;
    public C135086c7 A05;
    public C135086c7 A06;
    public C135086c7 A07;
    public C135086c7 A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public ArrayList A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public int A0K = 1;

    public void A04(AnonymousClass16T r14, C203399nx r15, int i) {
        String str;
        if (i == 2) {
            str = null;
            this.A01 = C202349ld.A01(r15.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null), "bankName");
            this.A09 = r15.A0i("provider-type", (String) null);
            this.A03 = r15.A0i("image", (String) null);
            this.A0B = r15.A0i("code", (String) null);
            this.A04 = r15.A0i("bank-phone-number", (String) null);
            this.A0J = C203399nx.A0J(r15, "popular-bank", "1");
            String A0i = r15.A0i("psp-routing", (String) null);
            if (!TextUtils.isEmpty(A0i)) {
                this.A0F = C36351kA.A10(A0i.split(","));
            }
            if (this.A00 == -1) {
                this.A00 = C203399nx.A01(r15, "version", -1);
            }
        } else {
            str = null;
            try {
                this.A09 = r15.A0i("provider", (String) null);
                Class<String> cls = String.class;
                this.A02 = C165617ti.A0P(C146356vT.A00(), cls, r15.A0i("account-name", (String) null), "accountHolderName");
                boolean z = false;
                this.A04 = C165617ti.A0P(C146356vT.A00(), Boolean.class, Boolean.valueOf(AnonymousClass000.A1S(AnonymousClass6R8.A00(r15.A0i("is-mpin-set", (String) null), 0), 1)), "isPinSet");
                Class<Integer> cls2 = Integer.class;
                this.A06 = C165617ti.A0P(C146356vT.A00(), cls2, Integer.valueOf(C203399nx.A01(r15, "otp-length", 0)), "otpLength");
                this.A03 = C165617ti.A0P(C146356vT.A00(), cls2, Integer.valueOf(C203399nx.A01(r15, "atm-pin-length", 0)), "atmPinLength");
                this.A07 = C165617ti.A0P(C146356vT.A00(), cls2, Integer.valueOf(C203399nx.A01(r15, "mpin-length", 0)), "pinLength");
                this.A08 = C165617ti.A0P(C146356vT.A00(), cls, r15.A0i("vpa", (String) null), "upiHandle");
                this.A0E = r15.A0i("vpa-id", (String) null);
                this.A0B = r15.A0i("code", (String) null);
                this.A01 = C203399nx.A01(r15, "pin-format-version", 0);
                this.A05 = C165617ti.A0P(C146356vT.A00(), cls, r15.A0i("upi-bank-info", (String) null), "bankInfo");
                this.A03 = r15.A0i("image", (String) null);
                this.A04 = r15.A0i("bank-phone-number", (String) null);
                this.A09 = null;
                this.A01 = C202349ld.A01(r15.A0i("bank-name", (String) null), "bankName");
                this.A06 = r15.A0i("credential-id", (String) null);
                this.A02 = C202349ld.A01(r15.A0i("account-number", (String) null), "bankAccountNumber");
                this.A00 = C203399nx.A02(r15, "created") * 1000;
                this.A07 = AnonymousClass000.A1S(C203399nx.A01(r15, "default-credit", 0), 1);
                this.A08 = AnonymousClass000.A1S(C203399nx.A01(r15, "default-debit", 0), 1);
                if (C203399nx.A01(r15, "default-debit-p2m", 0) == 1) {
                    z = true;
                }
                this.A0G = z;
                this.A0A = r15.A0i("account-type", (String) null);
            } catch (Exception e) {
                Log.e("PAY: IndiaUpiMethodData fromNetwork", e);
                return;
            }
        }
        String A0i2 = r15.A0i("transaction-prefix", str);
        if (!TextUtils.isEmpty(A0i2)) {
            this.A0D = A0i2;
        }
        this.A0H = C203399nx.A0J(r15, "is-aadhaar-enabled", "1");
    }

    public int describeContents() {
        return 0;
    }

    public static boolean A00(C175818b6 r0) {
        return ((Boolean) r0.A04.A00).booleanValue();
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                this.A03 = A1C.optString("bankImageURL", (String) null);
                this.A04 = A1C.optString("bankPhoneNumber", (String) null);
                this.A0K = A1C.optInt("v", 1);
                Class<String> cls = String.class;
                this.A02 = C165617ti.A0P(C146356vT.A00(), cls, A1C.optString("accountHolderName", (String) null), "accountHolderName");
                Class<Integer> cls2 = Integer.class;
                this.A06 = C165617ti.A0P(C146356vT.A00(), cls2, Integer.valueOf(A1C.optInt("otpLength", -1)), "otpLength");
                this.A03 = C165617ti.A0P(C146356vT.A00(), cls2, Integer.valueOf(A1C.optInt("atmPinLength", -1)), "atmPinLength");
                this.A07 = C165617ti.A0P(C146356vT.A00(), cls2, Integer.valueOf(A1C.optInt("upiPinLength", -1)), "pinLength");
                this.A05 = C165617ti.A0P(C146356vT.A00(), cls, A1C.optString("miscBankInfo", (String) null), "bankInfo");
                this.A08 = C165617ti.A0P(C146356vT.A00(), cls, A1C.optString("vpaHandle", (String) null), "upiHandle");
                this.A0E = A1C.optString("vpaId", (String) null);
                this.A0B = A1C.optString("bankCode", (String) null);
                String optString = A1C.optString("accountProvider", "");
                if (!optString.equals(this.A0B)) {
                    this.A09 = optString;
                }
                this.A01 = A1C.optInt("pinFormat", 0);
                this.A04 = C165617ti.A0P(C146356vT.A00(), Boolean.class, Boolean.valueOf(A1C.optBoolean("isMpinSet", false)), "isPinSet");
                this.A0A = A1C.optString("accountType", (String) null);
                this.A0H = A1C.optBoolean("isAadhaarEnabled", false);
                this.A0G = A1C.optBoolean("defaultDebitP2m");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMethodData fromDBString threw: ", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = r1.equals(r0);
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0B() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x000b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1704036199: goto L_0x0030;
                case -240997565: goto L_0x0026;
                case 358786314: goto L_0x0023;
                case 1844922713: goto L_0x0019;
                case 1996005113: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 2131887856(0x7f1206f0, float:1.941033E38)
        L_0x000e:
            return r1
        L_0x000f:
            java.lang.String r0 = "CREDIT"
            boolean r0 = r1.equals(r0)
            r1 = 2131887852(0x7f1206ec, float:1.9410323E38)
            goto L_0x0039
        L_0x0019:
            java.lang.String r0 = "CURRENT"
            boolean r0 = r1.equals(r0)
            r1 = 2131887853(0x7f1206ed, float:1.9410325E38)
            goto L_0x0039
        L_0x0023:
            java.lang.String r0 = "OD_UNSECURED"
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = "OD_SECURED"
        L_0x0028:
            boolean r0 = r1.equals(r0)
            r1 = 2131887854(0x7f1206ee, float:1.9410327E38)
            goto L_0x0039
        L_0x0030:
            java.lang.String r0 = "SAVINGS"
            boolean r0 = r1.equals(r0)
            r1 = 2131887855(0x7f1206ef, float:1.9410329E38)
        L_0x0039:
            if (r0 != 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175818b6.A0B():int");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeStringList(this.A0F);
        byte[] bArr = this.A09;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
    }

    public String A05() {
        Object obj;
        Object obj2;
        try {
            JSONObject A0A2 = A0A();
            A0A2.put("v", this.A0K);
            String str = this.A09;
            if (str != null) {
                A0A2.put("accountProvider", str);
            }
            if (!C202349ld.A02(this.A02)) {
                C135086c7 r0 = this.A02;
                if (r0 == null) {
                    obj2 = null;
                } else {
                    obj2 = r0.A00;
                }
                A0A2.put("accountHolderName", obj2);
            }
            Object obj3 = this.A06.A00;
            if (AnonymousClass000.A0I(obj3) >= 0) {
                A0A2.put("otpLength", obj3);
            }
            Object obj4 = this.A03.A00;
            if (AnonymousClass000.A0I(obj4) >= 0) {
                A0A2.put("atmPinLength", obj4);
            }
            Object obj5 = this.A07.A00;
            if (AnonymousClass000.A0I(obj5) >= 0) {
                A0A2.put("upiPinLength", obj5);
            }
            C135086c7 r3 = this.A05;
            if (!C202349ld.A03(r3)) {
                if (r3 == null) {
                    obj = null;
                } else {
                    obj = r3.A00;
                }
                A0A2.put("miscBankInfo", obj);
            }
            C135086c7 r1 = this.A08;
            if (!C202349ld.A03(r1)) {
                C165607th.A1D(r1, "vpaHandle", A0A2);
            }
            String str2 = this.A0E;
            if (str2 != null) {
                A0A2.put("vpaId", str2);
            }
            String str3 = this.A0B;
            if (str3 != null) {
                A0A2.put("bankCode", str3);
            }
            int i = this.A01;
            if (i >= 0) {
                A0A2.put("pinFormat", i);
            }
            C165607th.A1D(this.A04, "isMpinSet", A0A2);
            String str4 = this.A0A;
            if (str4 != null) {
                A0A2.put("accountType", str4);
            }
            A0A2.put("isAadhaarEnabled", this.A0H);
            A0A2.put("defaultDebitP2m", this.A0G);
            return A0A2.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiMethodData toDBString threw: ", e);
            return null;
        }
    }

    public String toString() {
        int i;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ accountProvider: ");
        A0u.append(this.A09);
        A0u.append(" issuerName: ");
        A0u.append(this.A01);
        A0u.append(" bankImageUrl: ");
        A0u.append(this.A03);
        A0u.append(" icon length: ");
        byte[] bArr = this.A09;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        A0u.append(i);
        StringBuilder A0q = C90484aE.A0q(" otpLength: ", A0u);
        A0q.append(this.A06);
        C200449hQ.A04(A0q, A0u);
        StringBuilder A0q2 = C90484aE.A0q(" upiPinLength: ", A0u);
        A0q2.append(this.A07);
        C200449hQ.A04(A0q2, A0u);
        StringBuilder A0q3 = C90484aE.A0q(" atmPinLength: ", A0u);
        A0q3.append(this.A03);
        C200449hQ.A04(A0q3, A0u);
        A0u.append(" vpaHandle: ");
        A0u.append(this.A08);
        A0u.append(" vpaId: ");
        A0u.append(this.A0E);
        A0u.append(" bankPhoneNumber: ");
        A0u.append(this.A04);
        A0u.append(" bankCode: ");
        A0u.append(this.A0B);
        StringBuilder A0q4 = C90484aE.A0q(" pinFormat: ", A0u);
        A0q4.append(this.A01);
        C200449hQ.A04(A0q4, A0u);
        A0u.append(" pspRouting: ");
        A0u.append(this.A0F);
        A0u.append(" supportPhoneNumber: ");
        A0u.append(this.A0C);
        A0u.append(" transactionPrefix: ");
        A0u.append(this.A0D);
        A0u.append(" banksListVersion: ");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(" ]", A0u);
    }
}
