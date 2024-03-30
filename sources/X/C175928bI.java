package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8bI  reason: invalid class name and case insensitive filesystem */
public final class C175928bI extends C175708av {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(45);
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 1;
    public long A04;
    public long A05 = -1;
    public C207119ua A06;
    public C135086c7 A07;
    public C135086c7 A08;
    public C135086c7 A09;
    public C135086c7 A0A;
    public C135086c7 A0B;
    public C135086c7 A0C;
    public C135086c7 A0D;
    public C206339tC A0E;
    public C198679e1 A0F;
    public C201599jw A0G;
    public C207189uh A0H;
    public Boolean A0I = null;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public List A0W;
    public boolean A0X;

    public String A05() {
        throw null;
    }

    public void A06(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C206339tC r0;
        String str2 = str;
        try {
            super.A06(str2);
            JSONObject A1C = C36441kJ.A1C(str2);
            this.A03 = A1C.optInt("v", 1);
            this.A0S = A1C.optString("seqNum", this.A0S);
            this.A00 = A1C.optInt("counter", 0);
            this.A0J = A1C.optString("deviceId", this.A0J);
            this.A0Q = A1C.optString("senderVpa", this.A0Q);
            this.A0R = A1C.optString("senderVpaId", this.A0R);
            C146356vT A002 = C146356vT.A00();
            Class<String> cls = String.class;
            C135086c7 r02 = this.A0B;
            if (r02 == null) {
                obj = null;
            } else {
                obj = r02.A00;
            }
            this.A0B = C165617ti.A0P(A002, cls, A1C.optString("senderName", (String) obj), "legalName");
            this.A0O = A1C.optString("receiverVpa", this.A0O);
            this.A0P = A1C.optString("receiverVpaId", this.A0P);
            C146356vT A003 = C146356vT.A00();
            C135086c7 r03 = this.A0A;
            if (r03 == null) {
                obj2 = null;
            } else {
                obj2 = r03.A00;
            }
            this.A0A = C165617ti.A0P(A003, cls, A1C.optString("receiverName", (String) obj2), "legalName");
            C146356vT A004 = C146356vT.A00();
            C135086c7 r04 = this.A0D;
            if (r04 == null) {
                obj3 = null;
            } else {
                obj3 = r04.A00;
            }
            this.A0D = C165617ti.A0P(A004, cls, A1C.optString("blob", (String) obj3), "pin");
            this.A0U = A1C.optString("token", this.A0U);
            this.A04 = A1C.optLong("expiryTs", this.A04);
            this.A01 = A1C.optInt("previousStatus", this.A01);
            this.A02 = A1C.optInt("previousType", this.A02);
            this.A0V = A1C.optString("url", this.A0V);
            C146356vT A005 = C146356vT.A00();
            C135086c7 r05 = this.A0C;
            if (r05 == null) {
                obj4 = null;
            } else {
                obj4 = r05.A00;
            }
            this.A0C = C165617ti.A0P(A005, cls, A1C.optString("upiBankInfo", (String) obj4), "bankInfo");
            this.A0T = A1C.optString("syncStatus", this.A0T);
            this.A0M = A1C.optString("mcc", this.A0M);
            this.A0N = A1C.optString("purposeCode", this.A0N);
            ArrayList arrayList = null;
            if (A1C.has("indiaUpiMandateMetadata")) {
                this.A0G = new C201599jw(A1C.optString("indiaUpiMandateMetadata", (String) null));
            }
            if (A1C.has("isFirstSend")) {
                this.A0I = Boolean.valueOf(A1C.optBoolean("isFirstSend", false));
            }
            if (A1C.has("indiaUpiTransactionComplaintData")) {
                this.A0H = new C207189uh(A1C.optString("indiaUpiTransactionComplaintData", (String) null));
            }
            if (A1C.has("indiaUpiInternationalTransactionDetailData")) {
                this.A0F = new C198679e1(A1C.optString("indiaUpiInternationalTransactionDetailData", (String) null));
            }
            this.A0L = A1C.optString("mandateTransactionId", this.A0L);
            C146356vT A006 = C146356vT.A00();
            C135086c7 r06 = this.A07;
            if (r06 == null) {
                obj5 = null;
            } else {
                obj5 = r06.A00;
            }
            this.A07 = C165617ti.A0P(A006, cls, A1C.optString("note", (String) obj5), "interopNote");
            this.A0X = A1C.optBoolean("isP2mHybrid", false);
            String optString = A1C.optString("paymentInstrumentType");
            if (!AnonymousClass14B.A0F(optString)) {
                this.A08 = C165617ti.A0P(C146356vT.A00(), cls, optString, "paymentInstrumentType");
            }
            String optString2 = A1C.optString("pspTransactionId");
            if (!AnonymousClass14B.A0F(optString2)) {
                this.A09 = C165617ti.A0P(C146356vT.A00(), cls, optString2, "pspTransactionId");
            }
            if (A1C.has("externalPaymentMethod")) {
                JSONObject jSONObject = A1C.getJSONObject("externalPaymentMethod");
                if (jSONObject != null) {
                    r0 = new C206339tC(C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject), C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject));
                } else {
                    r0 = null;
                }
                this.A0E = r0;
            }
            if (A1C.has("offers")) {
                JSONArray jSONArray = A1C.getJSONArray("offers");
                if (jSONArray != null) {
                    arrayList = AnonymousClass001.A0I();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            arrayList.add(new C206519tX(C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2)));
                        }
                    }
                }
                this.A0W = arrayList;
            }
            if (A1C.has("offerAmount")) {
                C199449fK r1 = new C199449fK();
                r1.A02 = AnonymousClass16W.A05;
                r1.A01();
                this.A06 = new C199449fK(A1C.getJSONObject("offerAmount")).A01();
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata fromDBString threw: ", e);
        }
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String str;
        String str2;
        Object valueOf;
        String str3;
        String str4;
        C201599jw r0 = this.A0G;
        String str5 = "null";
        if (r0 == null) {
            obj = str5;
        } else {
            obj = r0.toString();
        }
        String str6 = "order = [";
        C207189uh r02 = this.A0H;
        if (r02 == null) {
            obj2 = str5;
        } else {
            obj2 = r02.toString();
        }
        C198679e1 r03 = this.A0F;
        if (r03 == null) {
            obj3 = str5;
        } else {
            obj3 = r03.toString();
        }
        C207259uo r2 = this.A02;
        if (r2 != null) {
            StringBuilder A0v = AnonymousClass000.A0v(str6);
            A0v.append("id: ");
            StringBuilder A0v2 = AnonymousClass000.A0v(AnonymousClass000.A0q(C200449hQ.A00(r2.A01), A0v));
            A0v2.append("expiryTsInSec:");
            C207259uo r22 = this.A02;
            StringBuilder A0v3 = AnonymousClass000.A0v(C36411kG.A11(A0v2, r22.A00));
            A0v3.append("messageId:");
            str6 = AnonymousClass000.A0q(C200449hQ.A00(r22.A02), A0v3);
        }
        String A0q = AnonymousClass000.A0q("]", AnonymousClass000.A0v(str6));
        C206339tC r04 = this.A0E;
        if (r04 != null) {
            str5 = r04.toString();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ seq-no: ");
        C200449hQ.A03(A0u, this.A0S);
        A0u.append(" timestamp: ");
        A0u.append(this.A05);
        A0u.append(" deviceId: ");
        A0u.append(this.A0J);
        A0u.append(" sender: ");
        A0u.append(C200449hQ.A02(this.A0Q));
        A0u.append(" senderVpaId: ");
        A0u.append(this.A0R);
        A0u.append(" senderName: ");
        C135086c7 r05 = this.A0B;
        String str7 = null;
        if (r05 != null) {
            str = r05.toString();
        } else {
            str = null;
        }
        C200449hQ.A03(A0u, str);
        A0u.append(" receiver: ");
        A0u.append(C200449hQ.A02(this.A0O));
        A0u.append(" receiverVpaId: ");
        A0u.append(C200449hQ.A02(this.A0P));
        A0u.append(" receiverName : ");
        C135086c7 r06 = this.A0A;
        if (r06 != null) {
            str2 = r06.toString();
        } else {
            str2 = null;
        }
        C200449hQ.A03(A0u, str2);
        A0u.append(" encryptedKeyLength: ");
        C135086c7 r5 = this.A0D;
        if (C202349ld.A03(r5)) {
            valueOf = "0";
        } else {
            valueOf = Integer.valueOf(((String) r5.A00).length());
        }
        A0u.append(valueOf);
        A0u.append(" previousType: ");
        A0u.append(this.A02);
        A0u.append(" previousStatus: ");
        A0u.append(this.A01);
        A0u.append(" token: ");
        C200449hQ.A03(A0u, this.A0U);
        A0u.append(" url: ");
        C200449hQ.A03(A0u, this.A0V);
        A0u.append(" upiBankInfo: ");
        A0u.append(this.A0C);
        A0u.append(" order : ");
        A0u.append(A0q);
        A0u.append(" mcc: ");
        C200449hQ.A03(A0u, this.A0M);
        A0u.append(" purposeCode: ");
        C200449hQ.A03(A0u, this.A0N);
        A0u.append(" isFirstSend: ");
        A0u.append(this.A0I);
        A0u.append(" indiaUpiMandateMetadata: {");
        A0u.append(obj);
        A0u.append("} ] indiaUpiTransactionComplaintData: {");
        A0u.append(obj2);
        A0u.append("}  indiaUpiInternationalTransactionDetailData: {");
        A0u.append(obj3);
        A0u.append("}  mandateTransactionId: ");
        C200449hQ.A03(A0u, this.A0L);
        A0u.append(" note : ");
        C135086c7 r07 = this.A07;
        if (r07 != null) {
            str3 = r07.toString();
        } else {
            str3 = null;
        }
        C200449hQ.A03(A0u, str3);
        A0u.append(" isPendingRequestViewed: ");
        A0u.append(this.A03);
        A0u.append(" isP2mHybrid: ");
        A0u.append(this.A0X);
        A0u.append(" paymentInstrumentType: ");
        C135086c7 r08 = this.A08;
        if (r08 != null) {
            str4 = r08.toString();
        } else {
            str4 = null;
        }
        C200449hQ.A03(A0u, str4);
        A0u.append(" pspTransactionId: ");
        C135086c7 r09 = this.A09;
        if (r09 != null) {
            str7 = r09.toString();
        }
        C200449hQ.A03(A0u, str7);
        AnonymousClass000.A1D(" externalPaymentMethodData: ", str5, "]", A0u);
        return A0u.toString();
    }

    public void A0O(C175708av r8) {
        super.A0O(r8);
        C175928bI r82 = (C175928bI) r8;
        String str = r82.A0S;
        if (str != null) {
            this.A0S = str;
        }
        String str2 = r82.A0J;
        if (str2 != null) {
            this.A0J = str2;
        }
        String str3 = r82.A0O;
        if (str3 != null) {
            this.A0O = str3;
        }
        String str4 = r82.A0P;
        if (str4 != null) {
            this.A0P = str4;
        }
        C135086c7 r0 = r82.A0A;
        if (r0 != null) {
            this.A0A = r0;
        }
        String str5 = r82.A0Q;
        if (str5 != null) {
            this.A0Q = str5;
        }
        String str6 = r82.A0R;
        if (str6 != null) {
            this.A0R = str6;
        }
        C135086c7 r1 = r82.A0B;
        if (!C202349ld.A03(r1)) {
            this.A0B = r1;
        }
        long j = r82.A04;
        if (j > 0) {
            this.A04 = j;
        }
        int i = r82.A01;
        if (i > 0) {
            this.A01 = i;
        }
        int i2 = r82.A00;
        if (i2 > 0) {
            this.A00 = i2;
        }
        int i3 = r82.A02;
        if (i3 > 0) {
            this.A02 = i3;
        }
        String str7 = r82.A0V;
        if (str7 != null) {
            this.A0V = str7;
        }
        C135086c7 r12 = r82.A0C;
        if (!C202349ld.A03(r12)) {
            this.A0C = r12;
        }
        String str8 = r82.A0T;
        if (str8 != null) {
            this.A0T = str8;
        }
        String str9 = r82.A0M;
        if (str9 != null) {
            this.A0M = str9;
        }
        String str10 = r82.A0N;
        if (str10 != null) {
            this.A0N = str10;
        }
        C201599jw r2 = r82.A0G;
        if (r2 != null) {
            C201599jw r13 = this.A0G;
            C135086c7 r02 = r2.A08;
            if (r02 != null) {
                r13.A08 = r02;
            }
            C135086c7 r03 = r2.A07;
            if (r03 != null) {
                r13.A07 = r03;
            }
            C135086c7 r04 = r2.A0A;
            if (r04 != null) {
                r13.A0A = r04;
            }
            r13.A0H = r2.A0H;
            String str11 = r2.A0G;
            if (str11 != null) {
                r13.A0G = str11;
            }
            r13.A0M = r2.A0M;
            r13.A0N = r2.A0N;
            r13.A0O = r2.A0O;
            long j2 = r2.A02;
            if (j2 > 0) {
                r13.A02 = j2;
            }
            long j3 = r2.A01;
            if (j3 > 0) {
                r13.A01 = j3;
            }
            String str12 = r2.A0D;
            if (str12 != null) {
                r13.A0D = str12;
            }
            String str13 = r2.A0I;
            if (str13 != null) {
                r13.A0I = str13;
            }
            long j4 = r2.A04;
            if (j4 > 0) {
                r13.A04 = j4;
            }
            long j5 = r2.A03;
            if (j5 > 0) {
                r13.A03 = j5;
            }
            int i4 = r2.A00;
            if (i4 > 0) {
                r13.A00 = i4;
            }
            C135086c7 r05 = r2.A09;
            if (r05 != null) {
                r13.A09 = r05;
            }
            C207119ua r06 = r2.A05;
            if (r06 != null) {
                r13.A05 = r06;
            }
            C135086c7 r07 = r2.A06;
            if (r07 != null) {
                r13.A06 = r07;
            }
            String str14 = r2.A0E;
            if (str14 != null) {
                r13.A0E = str14;
            }
            String str15 = r2.A0K;
            if (str15 != null) {
                r13.A0K = str15;
            }
            String str16 = r2.A0J;
            if (str16 != null) {
                r13.A0J = str16;
            }
            String str17 = r2.A0L;
            if (str17 != null) {
                r13.A0L = str17;
            }
            String str18 = r2.A0F;
            if (str18 != null) {
                r13.A0F = str18;
            }
            r13.A0C = r2.A0C;
            r13.A0P = r2.A0P;
            r13.A0B = r2.A0B;
        }
        Boolean bool = r82.A0I;
        if (bool != null) {
            this.A0I = bool;
        }
        C207189uh r6 = r82.A0H;
        if (r6 != null) {
            C207189uh r5 = this.A0H;
            if (r5 == null) {
                this.A0H = new C207189uh(r6.A00());
            } else {
                r5.A03 = r6.A03;
                long j6 = r6.A00;
                if (j6 > 0) {
                    r5.A00 = j6;
                }
                long j7 = r6.A01;
                if (j7 > 0) {
                    r5.A01 = j7;
                }
                String str19 = r6.A02;
                if (str19 != null) {
                    r5.A02 = str19;
                }
            }
        }
        C198679e1 r22 = r82.A0F;
        if (r22 != null) {
            C198679e1 r14 = this.A0F;
            if (r14 == null) {
                this.A0F = new C198679e1(r22.A00());
            } else {
                String str20 = r22.A01;
                if (str20 != null) {
                    r14.A01 = str20;
                }
                r14.A00 = r22.A00;
            }
        }
        String str21 = r82.A0L;
        if (str21 != null) {
            this.A0L = str21;
        }
        C135086c7 r15 = r82.A07;
        if (!C202349ld.A03(r15)) {
            this.A07 = r15;
        }
        this.A0X = r82.A0X;
        C135086c7 r16 = r82.A08;
        if (!C202349ld.A03(r16)) {
            this.A08 = r16;
        }
        C135086c7 r17 = r82.A09;
        if (!C202349ld.A03(r17)) {
            this.A09 = r17;
        }
        C206339tC r08 = r82.A0E;
        if (r08 != null) {
            this.A0E = r08;
        }
        List list = r82.A0W;
        if (list != null) {
            this.A0W = list;
        }
        C207119ua r09 = r82.A06;
        if (r09 != null) {
            this.A06 = r09;
        }
    }

    public void A0U(String str) {
        this.A0A = C165617ti.A0P(C146356vT.A00(), String.class, str, "legalName");
    }

    public void writeToParcel(Parcel parcel, int i) {
        String A012;
        int A1P;
        String A002;
        String A003;
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString((String) C165577te.A0g(this.A0B));
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeString((String) C165577te.A0g(this.A0A));
        parcel.writeLong(this.A05);
        parcel.writeString(this.A0J);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0V);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        C201599jw r0 = this.A0G;
        String str = null;
        if (r0 == null) {
            A012 = null;
        } else {
            A012 = r0.A01();
        }
        parcel.writeString(A012);
        Boolean bool = this.A0I;
        if (bool == null) {
            A1P = -1;
        } else {
            A1P = AnonymousClass000.A1P(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(A1P);
        C207189uh r02 = this.A0H;
        if (r02 == null) {
            A002 = null;
        } else {
            A002 = r02.A00();
        }
        parcel.writeString(A002);
        C198679e1 r03 = this.A0F;
        if (r03 == null) {
            A003 = null;
        } else {
            A003 = r03.A00();
        }
        parcel.writeString(A003);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A0E, i);
        List list = this.A0W;
        if (list != null) {
            str = C206519tX.A01.A00(list).toString();
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A06, i);
    }
}
