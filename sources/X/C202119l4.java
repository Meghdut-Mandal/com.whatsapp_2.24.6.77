package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9l4  reason: invalid class name and case insensitive filesystem */
public class C202119l4 {
    public final AnonymousClass1N4 A00;
    public final C21060yb A01;
    public final AE0 A02;
    public final AF7 A03;
    public final C24611Dc A04;

    private String A01(SubscriptionInfo subscriptionInfo) {
        boolean A1a;
        String A012;
        if (Build.VERSION.SDK_INT < 29) {
            return subscriptionInfo.getIccId();
        }
        C24611Dc r2 = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Sub Id : ");
        C165577te.A1D(r2, A0u, subscriptionInfo.getSubscriptionId());
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(subscriptionInfo.getSubscriptionId());
        AE0 ae0 = this.A02;
        synchronized (ae0) {
            A1a = C36421kH.A1a(C165617ti.A0a(AE0.A06(ae0, "device_binding_sim_iccid")));
        }
        if (A1a) {
            A012 = "";
        } else {
            A012 = C18750th.A01(this.A01.A0O());
        }
        return AnonymousClass000.A0q(A012, A0u2);
    }

    public int A03(AnonymousClass8gJ r19, String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        this.A04.A06("IndiaUpiSimSwapDetectionUtils : Check sim on version >= 22");
        SubscriptionManager A0J = this.A01.A0J();
        if (A0J == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null || activeSubscriptionInfoList.isEmpty()) {
            this.A04.A06("IndiaUpiSimSwapDetectionUtils : No subscription info found");
            return 1;
        }
        String A0C = this.A02.A0C();
        JSONObject A1B = C36441kJ.A1B();
        JSONObject A1B2 = C36441kJ.A1B();
        int i = 1;
        boolean z = false;
        int i2 = 0;
        for (SubscriptionInfo next : activeSubscriptionInfoList) {
            JSONObject A1B3 = C36441kJ.A1B();
            JSONObject A1B4 = C36441kJ.A1B();
            String A012 = A01(next);
            String number = next.getNumber();
            C24611Dc r15 = this.A04;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("checkSimWithWaRegisteredNumberIsInstalled simId : ");
            A0u.append(C200449hQ.A01(A012));
            A0u.append(" | storedId : ");
            C165567td.A18(r15, C200449hQ.A01(A0C), A0u);
            boolean A013 = C201529jn.A01(this.A00, this.A03, number, str);
            C24611Dc r152 = this.A04;
            if (A013) {
                r152.A06("Phone matched");
                return 0;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("checkSimWithWaRegisteredNumberIsInstalled Phone number not matched | sim number : ");
            A0u2.append(number);
            A0u2.append(" | waNumber : ");
            C165567td.A18(r152, str, A0u2);
            if (TextUtils.isEmpty(number) && (TextUtils.isEmpty(A012) || TextUtils.isEmpty(A0C) || TextUtils.equals(A012, A0C))) {
                i = 0;
            }
            if (!z) {
                z = TextUtils.equals(A012, A0C);
            }
            try {
                A1B3.put("slotIndex", next.getSimSlotIndex());
                A1B3.put("simPhoneNumber", number);
                A1B3.put("storedId", A0C);
                A1B3.put("simId", A012);
                A1B3.put("waPhoneNumber", str);
                A1B4.put("isSimNumberEmpty", TextUtils.isEmpty(number));
                A1B4.put("isSimIdEmpty", TextUtils.isEmpty(A012));
                A1B4.put("isStoredIdEmpty", TextUtils.isEmpty(A0C));
                A1B4.put("isSimIdMatched", TextUtils.equals(A012, A0C));
                A1B4.put("isAddPaymentAttempted", z);
                A1B.put(C90464aC.A0h(i2, "subIndex_").toString(), A1B4);
                A1B2.put(C90464aC.A0h(i2, "subIndex_").toString(), A1B3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i2++;
        }
        if (i != 0 && z && activeSubscriptionInfoList.size() > 1) {
            i = 2;
        }
        this.A04.A06(AnonymousClass000.A0r("Fallback to ICCID match ", AnonymousClass000.A0u(), i));
        if (i != 0) {
            AnonymousClass8gJ r2 = r19;
            r2.A02 = A1B2;
            r2.A03 = A1B;
            r2.A00("SIM_SWAP", (List) null);
        }
        return i;
    }

    public String A04(String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        SubscriptionManager A0J = this.A01.A0J();
        if (!(A0J == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null)) {
            int i = 0;
            int A07 = this.A02.A07();
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (A07 == next.getSubscriptionId()) {
                    i = next.getSimSlotIndex();
                }
                String A012 = A01(next);
                if (C201529jn.A01(this.A00, this.A03, next.getNumber(), str)) {
                    this.A04.A04("iccid matched number");
                    return A012;
                }
            }
            if (activeSubscriptionInfoList.size() > 0) {
                this.A04.A04("no matching phone number found, storing the selected iccid");
                return A01(activeSubscriptionInfoList.get(i));
            }
        }
        return null;
    }

    public C202119l4(C21060yb r1, C24611Dc r2, AnonymousClass1N4 r3, AF7 af7, AE0 ae0) {
        this.A01 = r1;
        this.A04 = r2;
        this.A00 = r3;
        this.A03 = af7;
        this.A02 = ae0;
    }

    public static SmsManager A00(int i) {
        return SmsManager.getSmsManagerForSubscriptionId(i);
    }

    public static List A02(Context context) {
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        ArrayList A0I = AnonymousClass001.A0I();
        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() == 2) {
            A0I.add(((SubscriptionInfo) C36391kE.A0t(activeSubscriptionInfoList)).getNumber());
            A0I.add(activeSubscriptionInfoList.get(1).getNumber());
        }
        return A0I;
    }
}
