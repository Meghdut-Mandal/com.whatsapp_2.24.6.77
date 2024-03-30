package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3TS  reason: invalid class name */
public class AnonymousClass3TS {
    public C19930wk A00;
    public ConcurrentHashMap A01 = new ConcurrentHashMap(4);
    public SharedPreferences A02;
    public final C20810yC A03;
    public final AnonymousClass3N7 A04;
    public final AnonymousClass1Z8 A05;
    public final C19770wU A06;
    public final C19970wo A07;
    public final C19890wg A08;

    private synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A02;
        if (sharedPreferences == null) {
            sharedPreferences = this.A08.A00("notice_store");
            this.A02 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public boolean A04() {
        C20810yC r2 = this.A03;
        AnonymousClass00C.A0D(r2, 0);
        if (!C20800yB.A01(C21000yV.A01, r2, 1799)) {
            return false;
        }
        AnonymousClass1Z8 r22 = this.A05;
        ArrayList A022 = r22.A06.A02();
        A022.size();
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            if (r22.A03((C64683Pa) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void A02(AnonymousClass3TS r3, int i) {
        ConcurrentHashMap concurrentHashMap = r3.A01;
        Integer valueOf = Integer.valueOf(i);
        if (concurrentHashMap.get(valueOf) != null) {
            concurrentHashMap.remove(valueOf);
            C36341k9.A0u(r3.A00().edit(), String.valueOf(i));
        }
    }

    public static void A03(AnonymousClass3TS r5, int i, int i2) {
        ConcurrentHashMap concurrentHashMap = r5.A01;
        if (concurrentHashMap.size() == 0) {
            A01(r5);
        }
        Integer valueOf = Integer.valueOf(i);
        C605538h r4 = (C605538h) concurrentHashMap.get(valueOf);
        if (r4 != null) {
            int i3 = r4.A00;
            if (i2 > i3 && i3 != -1) {
                r4.A00 = i2;
                if (i3 < 4 && i2 == 4) {
                    r4.A03 = C36371kC.A09(r5.A07);
                }
                concurrentHashMap.put(valueOf, r4);
                try {
                    JSONObject A1B = C36441kJ.A1B();
                    A1B.put("viewId", r4.A01);
                    A1B.put("badgeStage", r4.A00);
                    A1B.put("enabledTimeInSeconds", r4.A02);
                    A1B.put("selectedTimeInSeconds", r4.A03);
                    C36341k9.A0x(r5.A00().edit(), String.valueOf(i), A1B.toString());
                } catch (JSONException e) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("noticebadgemanager/savenotice JEX ");
                    C36321k7.A1Z(A0u, e.toString());
                }
            }
        } else {
            throw AnonymousClass001.A08("Invalid noticeId");
        }
    }

    public AnonymousClass3TS(C19970wo r3, C20810yC r4, C19890wg r5, AnonymousClass3N7 r6, AnonymousClass1Z8 r7, C19770wU r8) {
        this.A07 = r3;
        this.A03 = r4;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = r5;
    }

    public static void A01(AnonymousClass3TS r12) {
        Map.Entry A11;
        StringBuilder sb;
        String str;
        Iterator A0y = AnonymousClass000.A0y(r12.A00().getAll());
        while (A0y.hasNext()) {
            A11 = AnonymousClass000.A11(A0y);
            try {
                Integer valueOf = Integer.valueOf((String) A11.getKey());
                try {
                    JSONObject A1C = C36441kJ.A1C((String) A11.getValue());
                    r12.A01.put(valueOf, new C605538h(A1C.getInt("viewId"), A1C.getInt("badgeStage"), A1C.getLong("enabledTimeInSeconds"), A1C.getLong("selectedTimeInSeconds")));
                } catch (JSONException e) {
                    e = e;
                    sb = AnonymousClass000.A0u();
                    str = "noticebadgemanager/loadFromFile bad json ";
                } catch (NumberFormatException e2) {
                    e = e2;
                    sb = AnonymousClass000.A0u();
                    str = "noticebadgemanager/loadFromFile corrupted number ";
                }
            } catch (NumberFormatException unused) {
                Log.e("noticebadgemanager/loadfromfile notice id key is corrupted");
            }
        }
        return;
        sb.append(str);
        C36321k7.A1Z(sb, e.toString());
        C36341k9.A0u(r12.A00().edit(), (String) A11.getKey());
    }
}
