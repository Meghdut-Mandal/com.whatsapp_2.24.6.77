package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9lR  reason: invalid class name and case insensitive filesystem */
public class C202269lR {
    public int A00;
    public int A01;
    public int A02;
    public C175718aw A03;
    public AnonymousClass9YX A04;
    public ArrayList A05;
    public ArrayList A06;
    public ArrayList A07;
    public HashMap A08;
    public final C19700wN A09;
    public final AE0 A0A;
    public final C20810yC A0B;
    public final AF7 A0C;

    public static C175718aw A01(C202269lR r5, String str) {
        String str2;
        String str3;
        if (str == null) {
            str2 = "PAY: IndiaUPIPaymentSetup pspName is null or empty";
        } else {
            ArrayList arrayList = r5.A07;
            if (arrayList == null || arrayList.size() <= 0) {
                str2 = "PAY: IndiaUPIPaymentSetup pspConfig list is null or empty";
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C175718aw r2 = (C175718aw) it.next();
                    Bundle bundle = r2.A00;
                    if (bundle != null) {
                        str3 = bundle.getString("providerType");
                    } else {
                        str3 = null;
                    }
                    if (str.equals(str3)) {
                        return r2;
                    }
                }
                return null;
            }
        }
        Log.e(str2);
        return null;
    }

    public ArrayList A07(C175818b6 r4) {
        Bundle bundle;
        ArrayList arrayList;
        if (r4 != null && (arrayList = r4.A0F) != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        C175718aw r0 = this.A03;
        if (r0 == null || (bundle = r0.A00) == null) {
            return null;
        }
        return bundle.getStringArrayList("pspRouting");
    }

    public static C175718aw A00(C175818b6 r4, C202269lR r5) {
        AE0 ae0 = r5.A0A;
        if (ae0.A0N()) {
            String A0B2 = ae0.A0B();
            if (TextUtils.isEmpty(A0B2)) {
                ae0.Bws(r4);
                if (r4 != null) {
                    A0B2 = r4.A09;
                } else {
                    A0B2 = ae0.A0B();
                }
            }
            if (!TextUtils.isEmpty(A0B2)) {
                return A01(r5, A0B2);
            }
            return null;
        }
        ArrayList A072 = r5.A07(r4);
        if (A072 != null && !A072.isEmpty()) {
            return A01(r5, (String) A072.get(r5.A01 % A072.size()));
        }
        Log.e("PAY: IndiaUPIPaymentSetup psps list is null or empty");
        return null;
    }

    public String A04(C175818b6 r4) {
        String str;
        String A0B2 = this.A0A.A0B();
        if (!TextUtils.isEmpty(A0B2)) {
            return A0B2;
        }
        C175718aw A002 = A00(r4, this);
        if (A002 == null) {
            return "ICICI";
        }
        Bundle bundle = A002.A00;
        if (bundle != null) {
            str = bundle.getString("providerType");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "ICICI";
        }
        Bundle bundle2 = A002.A00;
        if (bundle2 != null) {
            return bundle2.getString("providerType");
        }
        return null;
    }

    public String A06(String str, HashMap hashMap, int i) {
        Object obj = hashMap.get(str);
        String A0l = C90504aG.A0l(str, hashMap);
        if (obj == null || A0l == null) {
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(A0l);
            String str2 = "pay";
            switch (i) {
                case 1:
                    str2 = "setMpin";
                    break;
                case 2:
                    str2 = "changeMpin";
                    break;
                case 3:
                case 6:
                    break;
                case 4:
                    str2 = "reqBalChk";
                    break;
                case 5:
                    str2 = "collect";
                    break;
                default:
                    str2 = "mandate";
                    break;
            }
            JSONObject jSONObject = C36441kJ.A1C(A1C.getString(str2)).getJSONObject("data");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(jSONObject.getString("code"));
            A0u.append(",");
            A0u.append(jSONObject.getString("ki"));
            A0u.append(",");
            return AnonymousClass000.A0q(jSONObject.getString("encryptedBase64String"), A0u);
        } catch (JSONException e) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("PAY: IndiaUPIPaymentBankSetup getEncryptedBlob read: ");
            A0u2.append(str);
            Log.i(AnonymousClass000.A0q("  blob threw: ", A0u2), e);
            return null;
        }
    }

    public void A08() {
        ArrayList arrayList;
        int i = this.A02 + 1;
        if (i != this.A00 || (arrayList = this.A07) == null || arrayList.size() <= 1) {
            this.A02 = i;
            return;
        }
        this.A02 = 0;
        this.A01++;
    }

    public void A09() {
        this.A04 = new AnonymousClass9YX();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A05 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A0C.reset();
    }

    public C202269lR(C19700wN r1, C20810yC r2, AE0 ae0, AF7 af7) {
        this.A0B = r2;
        this.A09 = r1;
        this.A0C = af7;
        this.A0A = ae0;
        A09();
    }

    public static ArrayList A02(C175818b6 r0, C202269lR r1) {
        Bundle bundle;
        ArrayList<String> stringArrayList;
        C175718aw A002 = A00(r0, r1);
        if (A002 != null && (bundle = A002.A00) != null && (stringArrayList = bundle.getStringArrayList("smsGateways")) != null && stringArrayList.size() > 0 && !stringArrayList.isEmpty()) {
            return stringArrayList;
        }
        Log.e("PAY: IndiaUPIPaymentSetup smsGateways list is null or empty");
        return null;
    }

    public AnonymousClass9KU A03(AnonymousClass9YX r8, ArrayList arrayList) {
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = arrayList.iterator();
        C175718aw r2 = null;
        while (it.hasNext()) {
            C206279t0 r5 = (C206279t0) it.next();
            if (r5 instanceof C175718aw) {
                C175718aw r52 = (C175718aw) r5;
                Bundle bundle = r52.A00;
                if (bundle == null || bundle.getString("keys") == null) {
                    Bundle bundle2 = r52.A00;
                    if (bundle2 == null || bundle2.getString("providerType") == null) {
                        Bundle bundle3 = r52.A00;
                        if (!(bundle3 == null || bundle3.getStringArrayList("pspRouting") == null)) {
                            r2 = r52;
                        }
                    } else {
                        A0I2.add(r52);
                    }
                } else {
                    r8.A03("upi-list-keys");
                    Bundle bundle4 = r52.A00;
                    if (bundle4 != null) {
                        str = bundle4.getString("keys");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.A0A.A0J(str);
                    }
                }
            } else if (r5 instanceof C175818b6) {
                A0I.add(r5);
            }
        }
        return new AnonymousClass9KU(r2, A0I2, A0I);
    }

    public String A05(String str) {
        String str2;
        C175718aw A012 = A01(this, str);
        if (A012 != null) {
            Bundle bundle = A012.A00;
            if (bundle != null) {
                str2 = bundle.getString("transactionPrefix");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                Bundle bundle2 = A012.A00;
                if (bundle2 != null) {
                    return bundle2.getString("transactionPrefix");
                }
                return null;
            }
        }
        return this.A0A.A0A();
    }
}
