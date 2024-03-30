package X;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8av  reason: invalid class name and case insensitive filesystem */
public abstract class C175708av extends C206279t0 {
    public C207159ue A00;
    public C207119ua A01;
    public C207259uo A02;
    public Boolean A03;
    public boolean A04;

    public int describeContents() {
        return 0;
    }

    public int A07() {
        if (this instanceof C175938bJ) {
            return 0;
        }
        if (this instanceof C175918bH) {
            return ((C175918bH) this).A00;
        }
        if (this instanceof C175928bI) {
            return ((C175928bI) this).A00;
        }
        return 0;
    }

    public int A08() {
        if (this instanceof C175938bJ) {
            return 0;
        }
        if (this instanceof C175918bH) {
            return ((C175918bH) this).A01;
        }
        if (this instanceof C175928bI) {
            return ((C175928bI) this).A01;
        }
        return 0;
    }

    public long A09() {
        if (this instanceof C175938bJ) {
            return ((C175938bJ) this).A00;
        }
        if (this instanceof C175918bH) {
            return ((C175918bH) this).A02;
        }
        if (this instanceof C175928bI) {
            return ((C175928bI) this).A04;
        }
        return ((C175908bG) this).A00;
    }

    public long A0A() {
        if (this instanceof C175928bI) {
            return ((C175928bI) this).A05;
        }
        return 0;
    }

    public C207079uW A0B() {
        if (this instanceof C175938bJ) {
            return ((C175938bJ) this).A01;
        }
        return null;
    }

    public C135086c7 A0C() {
        if (this instanceof C175928bI) {
            return ((C175928bI) this).A0A;
        }
        return null;
    }

    public C135086c7 A0D() {
        if (this instanceof C175928bI) {
            return ((C175928bI) this).A0B;
        }
        return null;
    }

    public String A0E() {
        if ((this instanceof C175938bJ) || (this instanceof C175918bH) || !(this instanceof C175928bI)) {
            return null;
        }
        return ((C175928bI) this).A0S;
    }

    public String A0F() {
        if ((this instanceof C175938bJ) || (this instanceof C175918bH) || !(this instanceof C175928bI)) {
            return null;
        }
        return ((C175928bI) this).A0O;
    }

    public String A0G() {
        if (this instanceof C175938bJ) {
            return ((C175938bJ) this).A07;
        }
        if ((this instanceof C175918bH) || !(this instanceof C175928bI)) {
            return null;
        }
        return ((C175928bI) this).A0Q;
    }

    public String A0H() {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        if (this instanceof C175938bJ) {
            C175938bJ r2 = (C175938bJ) this;
            try {
                JSONObject A0J = r2.A0J();
                long j = r2.A00;
                if (j > 0) {
                    A0J.put("expiryTs", j);
                }
                String str2 = r2.A05;
                if (str2 != null) {
                    A0J.put("nonce", str2);
                }
                String str3 = r2.A03;
                if (str3 != null) {
                    A0J.put("amount", str3);
                }
                String str4 = r2.A04;
                if (str4 != null) {
                    A0J.put("deviceId", str4);
                }
                String str5 = r2.A07;
                if (str5 != null) {
                    A0J.put("sender-alias", str5);
                }
                Boolean bool = r2.A02;
                if (bool != null) {
                    A0J.put("isFirstSend", bool);
                }
                String str6 = r2.A06;
                if (str6 != null) {
                    A0J.put("pspTransactionId", str6);
                }
                C207079uW r4 = r2.A01;
                if (r4 != null) {
                    JSONObject A1B = C36441kJ.A1B();
                    A1B.put("max_count", r4.A00);
                    A1B.put("selected_count", r4.A01);
                    C207119ua r0 = r4.A02;
                    C18740tg.A06(r0);
                    A1B.put("due_amount_obj", r0.A02());
                    C207119ua r02 = r4.A03;
                    C18740tg.A06(r02);
                    A1B.put("interest_obj", r02.A02());
                    A0J.put("installment", A1B);
                }
                return A0J.toString();
            } catch (JSONException e) {
                e = e;
                str = "PAY: BrazilTransactionCountryData toDBString threw: ";
                Log.w(str, e);
                return null;
            }
        } else if (this instanceof C175918bH) {
            C175918bH r3 = (C175918bH) this;
            try {
                JSONObject A0J2 = r3.A0J();
                String str7 = r3.A04;
                if (str7 != null) {
                    A0J2.put("pspTransactionId", str7);
                }
                String str8 = r3.A03;
                if (str8 != null) {
                    A0J2.put("pspReceiptURL", str8);
                }
                return A0J2.toString();
            } catch (JSONException e2) {
                e = e2;
                str = "PAY: P2mLiteTransactionMetadata metaDataToDbString threw: ";
                Log.w(str, e);
                return null;
            }
        } else if (this instanceof C175928bI) {
            C175928bI r6 = (C175928bI) this;
            try {
                JSONObject A0J3 = r6.A0J();
                A0J3.put("v", r6.A03);
                String str9 = r6.A0S;
                if (str9 != null) {
                    A0J3.put("seqNum", str9);
                }
                String str10 = r6.A0J;
                if (str10 != null) {
                    A0J3.put("deviceId", str10);
                }
                long j2 = r6.A04;
                if (j2 > 0) {
                    A0J3.put("expiryTs", j2);
                }
                int i = r6.A01;
                if (i > 0) {
                    A0J3.put("previousStatus", i);
                }
                String str11 = r6.A0O;
                if (str11 != null) {
                    A0J3.put("receiverVpa", str11);
                }
                String str12 = r6.A0P;
                if (str12 != null) {
                    A0J3.put("receiverVpaId", str12);
                }
                C135086c7 r1 = r6.A0A;
                if (!C202349ld.A03(r1)) {
                    C165607th.A1D(r1, "receiverName", A0J3);
                }
                String str13 = r6.A0Q;
                if (str13 != null) {
                    A0J3.put("senderVpa", str13);
                }
                String str14 = r6.A0R;
                if (str14 != null) {
                    A0J3.put("senderVpaId", str14);
                }
                C135086c7 r12 = r6.A0B;
                if (!C202349ld.A03(r12)) {
                    C165607th.A1D(r12, "senderName", A0J3);
                }
                int i2 = r6.A00;
                if (i2 > 0) {
                    A0J3.put("counter", i2);
                }
                int i3 = r6.A02;
                if (i3 > 0) {
                    A0J3.put("previousType", i3);
                }
                String str15 = r6.A0V;
                if (str15 != null) {
                    A0J3.put("url", str15);
                }
                String str16 = r6.A0T;
                if (str16 != null) {
                    A0J3.put("syncStatus", str16);
                }
                C135086c7 r22 = r6.A0C;
                if (!C202349ld.A03(r22)) {
                    if (r22 == null) {
                        obj3 = null;
                    } else {
                        obj3 = r22.A00;
                    }
                    A0J3.put("upiBankInfo", obj3);
                }
                String str17 = r6.A0M;
                if (str17 != null) {
                    A0J3.put("mcc", str17);
                }
                String str18 = r6.A0N;
                if (str18 != null) {
                    A0J3.put("purposeCode", str18);
                }
                C201599jw r03 = r6.A0G;
                if (r03 != null) {
                    A0J3.put("indiaUpiMandateMetadata", r03.A01());
                }
                Boolean bool2 = r6.A0I;
                if (bool2 != null) {
                    A0J3.put("isFirstSend", bool2);
                }
                C207189uh r04 = r6.A0H;
                if (r04 != null) {
                    A0J3.put("indiaUpiTransactionComplaintData", r04.A00());
                }
                C198679e1 r05 = r6.A0F;
                if (r05 != null) {
                    A0J3.put("indiaUpiInternationalTransactionDetailData", r05.A00());
                }
                String str19 = r6.A0L;
                if (str19 != null) {
                    A0J3.put("mandateTransactionId", str19);
                }
                if (!C202349ld.A02(r6.A07)) {
                    C165607th.A1D(r6.A07, "note", A0J3);
                }
                Boolean bool3 = r6.A03;
                if (bool3 != null) {
                    A0J3.put("isPendingRequestViewed", bool3);
                }
                A0J3.put("isP2mHybrid", r6.A0X);
                if (!C202349ld.A02(r6.A08)) {
                    C135086c7 r06 = r6.A08;
                    if (r06 == null) {
                        obj2 = null;
                    } else {
                        obj2 = r06.A00;
                    }
                    A0J3.put("paymentInstrumentType", obj2);
                }
                if (!C202349ld.A02(r6.A09)) {
                    C135086c7 r07 = r6.A09;
                    if (r07 == null) {
                        obj = null;
                    } else {
                        obj = r07.A00;
                    }
                    A0J3.put("pspTransactionId", obj);
                }
                C206339tC r42 = r6.A0E;
                if (r42 != null) {
                    JSONObject A1B2 = C36441kJ.A1B();
                    A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r42.A01);
                    A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r42.A00);
                    A0J3.put("externalPaymentMethod", A1B2);
                }
                List list = r6.A0W;
                if (list != null) {
                    A0J3.put("offers", C206519tX.A01.A00(list));
                }
                C207119ua r08 = r6.A06;
                if (r08 != null) {
                    A0J3.put("offerAmount", r08.A02());
                }
                return A0J3.toString();
            } catch (JSONException e3) {
                e = e3;
                str = "PAY: IndiaUpiTransactionMetadata toDBString threw: ";
                Log.w(str, e);
                return null;
            }
        } else {
            C175908bG r43 = (C175908bG) this;
            JSONObject A0J4 = r43.A0J();
            A0J4.put("expiryTs", r43.A00);
            String str20 = r43.A01;
            if (str20 != null) {
                A0J4.put("pspTransactionId", str20);
            }
            return A0J4.toString();
        }
    }

    public String A0I() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if ((this instanceof C175938bJ) || (this instanceof C175918bH) || !(this instanceof C175928bI)) {
            return null;
        }
        C175928bI r6 = (C175928bI) this;
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("v", r6.A03);
            C135086c7 r2 = r6.A0D;
            if (!C202349ld.A03(r2)) {
                if (r2 == null) {
                    obj4 = null;
                } else {
                    obj4 = r2.A00;
                }
                A1B.put("blob", obj4);
            }
            if (!TextUtils.isEmpty(r6.A0U)) {
                A1B.put("token", r6.A0U);
            }
            String str = r6.A0Q;
            if (str != null) {
                A1B.put("senderVpa", str);
            }
            String str2 = r6.A0R;
            if (str2 != null) {
                A1B.put("senderVpaId", str2);
            }
            C135086c7 r1 = r6.A0B;
            if (!C202349ld.A03(r1)) {
                C165607th.A1D(r1, "senderName", A1B);
            }
            String str3 = r6.A0O;
            if (str3 != null) {
                A1B.put("receiverVpa", str3);
            }
            String str4 = r6.A0P;
            if (str4 != null) {
                A1B.put("receiverVpaId", str4);
            }
            C135086c7 r12 = r6.A0A;
            if (!C202349ld.A03(r12)) {
                C165607th.A1D(r12, "receiverName", A1B);
            }
            String str5 = r6.A0J;
            if (str5 != null) {
                A1B.put("deviceId", str5);
            }
            C135086c7 r22 = r6.A0C;
            if (!C202349ld.A03(r22)) {
                if (r22 == null) {
                    obj3 = null;
                } else {
                    obj3 = r22.A00;
                }
                A1B.put("upiBankInfo", obj3);
            }
            if (!C202349ld.A02(r6.A07)) {
                C165607th.A1D(r6.A07, "note", A1B);
            }
            A1B.put("isP2mHybrid", r6.A0X);
            if (!C202349ld.A02(r6.A08)) {
                C135086c7 r0 = r6.A08;
                if (r0 == null) {
                    obj2 = null;
                } else {
                    obj2 = r0.A00;
                }
                A1B.put("paymentInstrumentType", obj2);
            }
            if (!C202349ld.A02(r6.A09)) {
                C135086c7 r02 = r6.A09;
                if (r02 == null) {
                    obj = null;
                } else {
                    obj = r02.A00;
                }
                A1B.put("pspTransactionId", obj);
            }
            C206339tC r4 = r6.A0E;
            if (r4 != null) {
                JSONObject A1B2 = C36441kJ.A1B();
                A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A01);
                A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4.A00);
                A1B.put("externalPaymentMethod", A1B2);
            }
            List list = r6.A0W;
            if (list != null) {
                A1B.put("offers", C206519tX.A01.A00(list));
            }
            C207119ua r03 = r6.A06;
            if (r03 != null) {
                A1B.put("offerAmount", r03.A02());
            }
            return A1B.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
            return null;
        }
    }

    public void A0K(int i) {
        if (this instanceof C175938bJ) {
            return;
        }
        if (this instanceof C175918bH) {
            ((C175918bH) this).A01 = i;
        } else if (this instanceof C175928bI) {
            ((C175928bI) this).A01 = i;
        }
    }

    public void A0L(int i) {
        if (!(this instanceof C175938bJ) && !(this instanceof C175918bH) && (this instanceof C175928bI)) {
            ((C175928bI) this).A02 = i;
        }
    }

    public void A0M(long j) {
        if (this instanceof C175928bI) {
            ((C175928bI) this).A05 = j;
        }
    }

    public void A0O(C175708av r2) {
        this.A04 = r2.A04;
        C207119ua r0 = r2.A01;
        if (r0 != null) {
            this.A01 = r0;
        }
        C207159ue r02 = r2.A00;
        if (r02 != null) {
            this.A00 = r02;
        }
        C207259uo r03 = r2.A02;
        if (r03 != null) {
            this.A02 = r03;
        }
        Boolean bool = r2.A03;
        if (bool != null) {
            this.A03 = bool;
        }
    }

    public void A0P(String str) {
        if (!(this instanceof C175938bJ) && !(this instanceof C175918bH) && (this instanceof C175928bI)) {
            ((C175928bI) this).A0S = str;
        }
    }

    public void A0Q(String str) {
        if (this instanceof C175928bI) {
            ((C175928bI) this).A07 = C165617ti.A0P(C146356vT.A00(), String.class, str, "interopNote");
        }
    }

    public void A0R(String str) {
        if (!(this instanceof C175938bJ) && !(this instanceof C175918bH) && (this instanceof C175928bI)) {
            ((C175928bI) this).A0O = str;
        }
    }

    public void A0S(String str) {
        if (this instanceof C175938bJ) {
            ((C175938bJ) this).A07 = str;
        } else if (!(this instanceof C175918bH) && (this instanceof C175928bI)) {
            ((C175928bI) this).A0Q = str;
        }
    }

    public boolean A0T() {
        C135086c7 r0;
        if (!(this instanceof C175928bI)) {
            return false;
        }
        C175928bI r2 = (C175928bI) this;
        if (!r2.A0X || (r0 = r2.A08) == null) {
            return false;
        }
        if (!"upi".equalsIgnoreCase((String) r0.A00) || TextUtils.isEmpty(r2.A0Q)) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeSerializable(this.A03);
    }

    public void A06(String str) {
        C207259uo r0;
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            this.A04 = A1C.optBoolean("messageDeleted", false);
            JSONObject optJSONObject = A1C.optJSONObject("money");
            if (optJSONObject != null) {
                this.A01 = C199449fK.A00(AnonymousClass16W.A06, new C199449fK(), optJSONObject);
            }
            JSONObject optJSONObject2 = A1C.optJSONObject("incentive");
            if (optJSONObject2 != null) {
                this.A00 = new C207159ue(optJSONObject2);
            }
            JSONObject optJSONObject3 = A1C.optJSONObject("order");
            if (optJSONObject3 != null) {
                r0 = new C207259uo(optJSONObject3);
            } else {
                String optString = A1C.optString("orderId");
                long optLong = A1C.optLong("orderExpiryTsInSec");
                String optString2 = A1C.optString("orderMessageId");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    r0 = new C207259uo(optLong, optString, optString2);
                }
                this.A03 = Boolean.valueOf(A1C.optBoolean("isPendingRequestViewed", false));
            }
            this.A02 = r0;
            this.A03 = Boolean.valueOf(A1C.optBoolean("isPendingRequestViewed", false));
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransactionCountryData fromDBString threw: ", e);
        }
    }

    public JSONObject A0J() {
        JSONArray jSONArray;
        JSONObject A1B = C36441kJ.A1B();
        boolean z = this.A04;
        if (z) {
            A1B.put("messageDeleted", z);
        }
        C207119ua r0 = this.A01;
        if (r0 != null) {
            A1B.put("money", r0.A02());
        }
        C207159ue r3 = this.A00;
        if (r3 != null) {
            JSONObject A1B2 = C36441kJ.A1B();
            try {
                A1B2.put("offer-id", r3.A02);
                String str = r3.A01;
                if (str != null) {
                    A1B2.put("offer-claim-id", str);
                }
                String str2 = r3.A03;
                if (str2 != null) {
                    A1B2.put("parent-transaction-id", str2);
                }
                String str3 = r3.A00;
                if (str3 != null) {
                    A1B2.put("incentive-payment-id", str3);
                }
            } catch (JSONException e) {
                Log.w("PAY: PaymentIncentiveData toJson threw: ", e);
            }
            A1B.put("incentive", A1B2);
        }
        C207259uo r6 = this.A02;
        if (r6 != null) {
            JSONObject A1B3 = C36441kJ.A1B();
            A1B3.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A01);
            A1B3.put("message_id", r6.A02);
            A1B3.put("expiry_ts", r6.A00);
            String str4 = r6.A04;
            if (!TextUtils.isEmpty(str4)) {
                A1B3.put("payment_config_id", str4);
            }
            List<C206319t7> list = r6.A05;
            if (list != null && !list.isEmpty()) {
                boolean z2 = false;
                if (list.isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    jSONArray = C90524aI.A0u();
                    for (C206319t7 r1 : list) {
                        JSONObject A1B4 = C36441kJ.A1B();
                        if (r1 != null) {
                            C206319t7.A00(r1, jSONArray, A1B4);
                        }
                    }
                } else {
                    jSONArray = null;
                }
                A1B3.put("beneficiaries", jSONArray);
            }
            String str5 = r6.A03;
            if (!TextUtils.isEmpty(str5)) {
                A1B3.put("order-type", str5);
            }
            A1B.put("order", A1B3);
        }
        Boolean bool = this.A03;
        if (bool != null) {
            A1B.put("isPendingRequestViewed", bool.booleanValue());
        }
        return A1B;
    }

    public void A0N(Parcel parcel) {
        this.A04 = AnonymousClass000.A1O(parcel.readByte());
        this.A01 = (C207119ua) C36411kG.A0H(parcel, C207119ua.class);
        this.A02 = (C207259uo) C36411kG.A0H(parcel, C207259uo.class);
        this.A03 = (Boolean) parcel.readSerializable();
    }
}
