package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9je  reason: invalid class name and case insensitive filesystem */
public class C201459je {
    public long A00;
    public C207119ua A01;
    public C135086c7 A02;
    @Deprecated
    public C135086c7 A03;
    public C135086c7 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public AnonymousClass16X A00() {
        C135086c7 r1 = this.A03;
        if (C202349ld.A03(r1)) {
            return null;
        }
        return C165607th.A0R(AnonymousClass16W.A05, (String) r1.A00);
    }

    public boolean A01() {
        String str;
        String str2;
        String str3 = this.A08;
        if (!str3.equals("UNKNOWN")) {
            if (str3.equals("ACCEPT")) {
                str = this.A09;
                str2 = "PENDING";
            }
            return false;
        }
        str = this.A09;
        str2 = "INIT";
        if (str.equals(str2)) {
            return true;
        }
        return false;
    }

    public C201459je(AnonymousClass16T r7, C203399nx r8) {
        C203399nx A0c = r8.A0c("amount");
        if (A0c == null) {
            String A0x = C36391kE.A0x(r8, "amount");
            if (A0x != null) {
                this.A03 = C165577te.A0T(A0x, "moneyStringValue");
            }
        } else {
            C203399nx A0c2 = A0c.A0c("money");
            if (A0c2 != null) {
                try {
                    AnonymousClass16U A012 = r7.A01(C36391kE.A0x(A0c2, "currency"));
                    C199449fK r2 = new C199449fK();
                    r2.A01 = A0c2.A0W(A0c2.A0h("value"), "value");
                    r2.A00 = C203399nx.A00(A0c2, "offset");
                    r2.A02 = A012;
                    C207119ua A013 = r2.A01();
                    this.A01 = A013;
                    this.A03 = C165617ti.A0P(C146356vT.A00(), String.class, A013.A02.toString(), "moneyStringValue");
                } catch (Exception unused) {
                    Log.e("PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node");
                }
            }
        }
        String A0i = r8.A0i("amount-rule", (String) null);
        if (!TextUtils.isEmpty(A0i)) {
            this.A07 = A0i;
        }
        String A0i2 = r8.A0i("is-revocable", (String) null);
        if (A0i2 != null) {
            this.A06 = A0i2;
        }
        String A0i3 = r8.A0i("end-ts", (String) null);
        if (A0i3 != null) {
            this.A00 = AnonymousClass6R8.A01(A0i3, 0) * 1000;
        }
        String A0i4 = r8.A0i("seq-no", (String) null);
        if (A0i4 != null) {
            this.A04 = C165617ti.A0P(C146356vT.A00(), String.class, A0i4, "upiSequenceNumber");
        }
        String A0i5 = r8.A0i("error-code", (String) null);
        if (A0i5 != null) {
            this.A05 = A0i5;
        }
        String A0i6 = r8.A0i("mandate-update-info", (String) null);
        if (A0i6 != null) {
            this.A02 = C165617ti.A0P(C146356vT.A00(), String.class, A0i6, "upiMandateUpdateInfo");
        }
        String A0i7 = r8.A0i("status", (String) null);
        this.A09 = A0i7 == null ? "INIT" : A0i7;
        String A0i8 = r8.A0i("action", (String) null);
        this.A08 = A0i8 == null ? "UNKNOWN" : A0i8;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ pendingAmount: ");
        C135086c7 r2 = this.A03;
        if (AnonymousClass000.A0o(r2, A0u) == null) {
            return "";
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C200449hQ.A03(A0u2, r2.toString());
        A0u2.append(" errorCode: ");
        A0u2.append(this.A05);
        A0u2.append(" seqNum: ");
        A0u2.append(this.A04);
        A0u2.append(" mandateUpdateInfo: ");
        A0u2.append(this.A02);
        A0u2.append(" mandateUpdateAction: ");
        A0u2.append(this.A08);
        A0u2.append(" mandateUpdateStatus: ");
        return C165567td.A0Y(this.A09, A0u2);
    }

    public C201459je(C207119ua r2, C135086c7 r3, long j) {
        this.A03 = r3;
        this.A01 = r2;
        this.A00 = j;
        this.A08 = "UNKNOWN";
        this.A09 = "INIT";
    }

    public C201459je(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                C146356vT A002 = C146356vT.A00();
                Class<String> cls = String.class;
                C135086c7 r0 = this.A03;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.A00;
                }
                this.A03 = C165617ti.A0P(A002, cls, A1C.optString("pendingAmount", (String) obj), "moneyStringValue");
                if (A1C.optJSONObject("pendingMoney") != null) {
                    this.A01 = new C199449fK(A1C.optJSONObject("pendingMoney")).A01();
                }
                this.A06 = A1C.optString("isRevocable", this.A06);
                this.A00 = A1C.optLong("mandateEndTs", this.A00);
                this.A07 = A1C.optString("mandateAmountRule", this.A07);
                C146356vT A003 = C146356vT.A00();
                C135086c7 r02 = this.A04;
                if (r02 == null) {
                    obj2 = null;
                } else {
                    obj2 = r02.A00;
                }
                this.A04 = C165617ti.A0P(A003, cls, A1C.optString("seqNum", (String) obj2), "upiMandateUpdateInfo");
                this.A05 = A1C.optString("errorCode", this.A05);
                this.A09 = A1C.optString("mandateUpdateStatus", this.A09);
                this.A08 = A1C.optString("mandateUpdateAction", this.A08);
                C146356vT A004 = C146356vT.A00();
                C135086c7 r03 = this.A02;
                if (r03 == null) {
                    obj3 = null;
                } else {
                    obj3 = r03.A00;
                }
                this.A02 = C165617ti.A0P(A004, cls, A1C.optString("mandateUpdateInfo", (String) obj3), "upiMandateUpdateInfo");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e);
            }
        }
    }
}
