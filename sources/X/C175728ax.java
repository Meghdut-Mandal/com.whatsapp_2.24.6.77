package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8ax  reason: invalid class name and case insensitive filesystem */
public class C175728ax extends C206279t0 {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(27);
    public int A00;
    public long A01 = -1;
    public C197599by A02;
    public C206829u4 A03;
    public UserJid A04;
    public String A05;
    public boolean A06;
    public C197589bx A07;

    public static int A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 116014:
                    if (str.equals("upi")) {
                        return 3;
                    }
                    break;
                case 3387444:
                    if (str.equals("novi")) {
                        return 2;
                    }
                    break;
                case 97229420:
                    if (str.equals("fbpay")) {
                        return 1;
                    }
                    break;
            }
        }
        return 0;
    }

    public static String A03(int i) {
        if (i == 1) {
            return "fbpay";
        }
        if (i == 3) {
            return "upi";
        }
        throw C90524aI.A0Y(AnonymousClass000.A0r("PAY: getPaymentServiceEnumName/invalid service enum: ", AnonymousClass000.A0u(), i));
    }

    public int describeContents() {
        return 0;
    }

    public static C197589bx A02(C175728ax r1) {
        C197589bx r0 = r1.A07;
        if (r0 != null) {
            return r0;
        }
        C197589bx r02 = new C197589bx();
        r1.A07 = r02;
        return r02;
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A1C = C36441kJ.A1C(str);
                C197589bx A022 = A02(this);
                JSONObject optJSONObject = A1C.optJSONObject("consumer_status");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String A0C = AnonymousClass001.A0C(keys);
                        int A002 = A00(A0C);
                        if (A002 != 0) {
                            C90504aG.A1K(optJSONObject.optString(A0C), A022.A01, A002);
                        }
                    }
                }
                C206829u4 r9 = this.A03;
                if (r9 == null) {
                    r9 = new C206829u4();
                    this.A03 = r9;
                }
                JSONObject optJSONObject2 = A1C.optJSONObject("incentive");
                if (optJSONObject2 != null) {
                    try {
                        Iterator<String> keys2 = optJSONObject2.keys();
                        while (keys2.hasNext()) {
                            String A0C2 = AnonymousClass001.A0C(keys2);
                            JSONArray optJSONArray = optJSONObject2.optJSONArray(A0C2);
                            if (optJSONArray != null) {
                                HashSet A16 = C36441kJ.A16();
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    C36391kE.A1W(A16, optJSONArray.getLong(i));
                                }
                                r9.A00.put(A0C2, A16);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/setIdTransactionMapfromJSON/failed to parse idJSON array", e);
                    }
                }
                C197599by r5 = this.A02;
                if (r5 == null) {
                    r5 = new C197599by();
                    this.A02 = r5;
                }
                JSONObject optJSONObject3 = A1C.optJSONObject("eligible_offers");
                if (optJSONObject3 != null) {
                    try {
                        JSONObject jSONObject = optJSONObject3.getJSONObject("dhash");
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String A0C3 = AnonymousClass001.A0C(keys3);
                            int A003 = A00(A0C3);
                            if (A003 != 0) {
                                C90504aG.A1K(jSONObject.optString(A0C3), r5.A01, A003);
                            }
                        }
                        JSONObject jSONObject2 = optJSONObject3.getJSONObject("offers");
                        Iterator<String> keys4 = jSONObject2.keys();
                        while (keys4.hasNext()) {
                            String A0C4 = AnonymousClass001.A0C(keys4);
                            int A004 = A00(A0C4);
                            if (A004 != 0) {
                                C90504aG.A1K(jSONObject2.optString(A0C4), r5.A00, A004);
                            }
                        }
                    } catch (JSONException e2) {
                        C36321k7.A1J(e2, "PAY: PaymentContactInfoCountryData/fromDbString/exception: ", AnonymousClass000.A0u());
                    }
                }
            } catch (JSONException e3) {
                C36321k7.A1J(e3, "PAY: PaymentContactInfoCountryData/fromDbString/exception: ", AnonymousClass000.A0u());
            }
        }
    }

    public int A07() {
        if (this instanceof C175698au) {
            return 1;
        }
        return this.A00;
    }

    public String A08() {
        Object obj;
        if (!(this instanceof C175698au)) {
            return "";
        }
        C135086c7 r0 = ((C175698au) this).A01;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        return (String) obj;
    }

    public void A09(int i) {
        if (!(this instanceof C175698au)) {
            this.A00 = i;
        }
    }

    public void A0A(String str) {
        if (this instanceof C175698au) {
            ((C175698au) this).A01 = C165577te.A0S(str);
        }
    }

    public void A0B(boolean z) {
        if (!(this instanceof C175698au)) {
            this.A06 = z;
        }
    }

    public boolean A0C() {
        if (this instanceof C175698au) {
            return false;
        }
        return this.A06;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AnonymousClass143.A03(this.A04));
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
        C197589bx A022 = A02(this);
        parcel.writeLong(A022.A00);
        Map map = A022.A01;
        parcel.writeInt(map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            parcel.writeInt(C165577te.A08(A11));
            parcel.writeString(C90514aH.A10(A11));
        }
        parcel.writeParcelable(this.A03, i);
        C197599by r3 = this.A02;
        if (r3 == null) {
            r3 = new C197599by();
            this.A02 = r3;
        }
        Map map2 = r3.A01;
        parcel.writeInt(map2.size());
        Iterator A0y2 = AnonymousClass000.A0y(map2);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            parcel.writeInt(C165577te.A08(A112));
            parcel.writeString(C90514aH.A10(A112));
        }
        Map map3 = r3.A00;
        parcel.writeInt(map3.size());
        Iterator A0y3 = AnonymousClass000.A0y(map3);
        while (A0y3.hasNext()) {
            Map.Entry A113 = AnonymousClass000.A11(A0y3);
            parcel.writeInt(C165577te.A08(A113));
            parcel.writeString(C90514aH.A10(A113));
        }
    }

    public C175728ax(Parcel parcel) {
        this.A04 = C36431kI.A0l(parcel.readString());
        this.A06 = AnonymousClass000.A1O(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A07 = new C197589bx(parcel);
        this.A03 = (C206829u4) C36411kG.A0H(parcel, C206829u4.class);
        this.A02 = new C197599by(parcel);
    }

    public static int A01(String str) {
        switch (str.hashCode()) {
            case -1422950650:
                if (str.equals("active")) {
                    return 3;
                }
                break;
            case -309833220:
                if (str.equals("ineligible")) {
                    return 1;
                }
                break;
            case 100743639:
                if (str.equals("eligible")) {
                    return 2;
                }
                break;
        }
        return 0;
    }

    public String A05() {
        try {
            JSONObject A1B = C36441kJ.A1B();
            C197589bx A022 = A02(this);
            HashMap A0J = AnonymousClass001.A0J();
            JSONObject A1B2 = C36441kJ.A1B();
            Iterator A0y = AnonymousClass000.A0y(A022.A01);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A0J.put(A03(C165577te.A08(A11)), A11.getValue());
                try {
                    A1B2.putOpt(A03(C165577te.A08(A11)), A11.getValue());
                } catch (JSONException e) {
                    C36321k7.A1J(e, "PAY: ConsumerStatusData/getDataHashesDbString/exception: ", AnonymousClass000.A0u());
                }
            }
            A1B.putOpt("consumer_status", new JSONObject(A0J));
            C206829u4 r0 = this.A03;
            if (r0 == null) {
                r0 = new C206829u4();
                this.A03 = r0;
            }
            JSONObject A1B3 = C36441kJ.A1B();
            try {
                HashMap hashMap = r0.A00;
                Iterator A0s = C90484aE.A0s(hashMap);
                while (A0s.hasNext()) {
                    String A0C = AnonymousClass001.A0C(A0s);
                    AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(A0C);
                    if (abstractCollection != null) {
                        JSONArray A0u = C90524aI.A0u();
                        Iterator it = abstractCollection.iterator();
                        while (it.hasNext()) {
                            A0u.put(it.next());
                        }
                        A1B3.put(A0C, A0u);
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/toJson/ failed to build json");
            }
            A1B.putOpt("incentive", A1B3);
            C197599by r9 = this.A02;
            if (r9 == null) {
                r9 = new C197599by();
                this.A02 = r9;
            }
            JSONObject A1B4 = C36441kJ.A1B();
            try {
                HashMap A0J2 = AnonymousClass001.A0J();
                JSONObject A1B5 = C36441kJ.A1B();
                Iterator A0y2 = AnonymousClass000.A0y(r9.A01);
                while (A0y2.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A0y2);
                    A0J2.put(A03(C165577te.A08(A112)), A112.getValue());
                    try {
                        A1B5.putOpt(A03(C165577te.A08(A112)), A112.getValue());
                    } catch (JSONException e2) {
                        C36321k7.A1J(e2, "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", AnonymousClass000.A0u());
                    }
                }
                A1B4.putOpt("dhash", new JSONObject(A0J2));
                HashMap A0J3 = AnonymousClass001.A0J();
                JSONObject A1B6 = C36441kJ.A1B();
                Iterator A0y3 = AnonymousClass000.A0y(r9.A00);
                while (A0y3.hasNext()) {
                    Map.Entry A113 = AnonymousClass000.A11(A0y3);
                    A0J3.put(A03(C165577te.A08(A113)), A113.getValue());
                    try {
                        A1B6.putOpt(A03(C165577te.A08(A113)), A113.getValue());
                    } catch (JSONException e3) {
                        C36321k7.A1J(e3, "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", AnonymousClass000.A0u());
                    }
                }
                A1B4.putOpt("offers", new JSONObject(A0J3));
            } catch (JSONException e4) {
                C36321k7.A1J(e4, "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", AnonymousClass000.A0u());
            }
            A1B.putOpt("eligible_offers", A1B4);
            return A1B.toString();
        } catch (JSONException e5) {
            C36321k7.A1J(e5, "PAY: PaymentContactInfoCountryData/toDBString/exception: ", AnonymousClass000.A0u());
            return null;
        }
    }

    public C175728ax() {
    }
}
