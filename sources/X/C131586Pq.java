package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Pq  reason: invalid class name and case insensitive filesystem */
public class C131586Pq {
    public int A00 = 0;
    public boolean A01;
    public final C108515Tu A02;
    public final List A03 = AnonymousClass001.A0I();
    public final List A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public void A02(C106765Lg r3) {
        List list = this.A03;
        synchronized (list) {
            list.add(r3);
        }
    }

    public boolean A03() {
        boolean z;
        List list = this.A03;
        synchronized (list) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C106765Lg) it.next()).A00) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public C131586Pq(C131666Pz r3) {
        this.A02 = r3.A05;
        this.A01 = r3.A02;
        this.A07 = r3.A03;
        this.A08 = r3.A04;
        this.A06 = r3.A01;
        this.A04 = r3.A06;
        this.A05 = r3.A07;
        AnonymousClass6NS r1 = r3.A00;
        this.A0B = r1.A02;
        this.A0H = r1.A08;
        this.A0I = r1.A09;
        this.A0G = r1.A07;
        this.A0A = r1.A01;
        this.A0C = r1.A03;
        this.A0F = r1.A06;
        this.A0D = r1.A04;
        this.A0E = r1.A05;
        this.A09 = r1.A00;
        this.A0K = r1.A0B;
        this.A0J = r1.A0A;
    }

    public static C131586Pq A00(String str) {
        JSONObject A1C = C36441kJ.A1C(str);
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (A1C.has("sync_jid_hash")) {
            JSONArray jSONArray = A1C.getJSONArray("sync_jid_hash");
            for (int i = 0; i < jSONArray.length(); i++) {
                A0I2.add(Base64.decode((String) jSONArray.get(i), 0));
            }
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        if (A1C.has("sync_jid")) {
            JSONArray jSONArray2 = A1C.getJSONArray("sync_jid");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                UserJid A0l = C36431kI.A0l((String) jSONArray2.get(i2));
                if (A0l != null) {
                    A0I3.add(A0l);
                }
            }
        }
        int i3 = A1C.getInt("sync_type_code");
        for (C108515Tu r5 : C108515Tu.values()) {
            if (r5.code == i3) {
                C131666Pz r1 = new C131666Pz(r5);
                r1.A02 = A1C.getBoolean("sync_is_urgent");
                r1.A03 = A1C.getBoolean("sync_only_if_changed");
                r1.A04 = A1C.getBoolean("sync_only_if_registered");
                r1.A01 = A1C.getBoolean("sync_clear_whatsapp_sync_data");
                r1.A00 = new AnonymousClass6NS(A1C.optBoolean("sync_sidelist", true), A1C.optBoolean("sync_status", true), A1C.optBoolean("sync_picture", true), A1C.optBoolean("sync_business", true), A1C.optBoolean("sync_devices", true), A1C.optBoolean("sync_payment", true), A1C.optBoolean("sync_disappearing_mode", true), A1C.optBoolean("sync_lid", true), A1C.optBoolean("sync_contact", true), A1C.optBoolean("sync_bot"), A1C.optBoolean("sync_username", true), A1C.optBoolean("sync_text_status", true));
                C131666Pz.A00(r1, A0I2);
                r1.A07.addAll(A0I3);
                C131586Pq A012 = r1.A01();
                A012.A00 = A1C.getInt("sync_retry_count");
                if (A1C.getBoolean("sync_should_retry")) {
                    A012.A02(new C106765Lg(true));
                }
                return A012;
            }
        }
        return null;
    }

    public String A01() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("sync_type_code", this.A02.code);
        A1B.put("sync_is_urgent", this.A01);
        A1B.put("sync_only_if_changed", this.A07);
        A1B.put("sync_only_if_registered", this.A08);
        A1B.put("sync_clear_whatsapp_sync_data", this.A06);
        A1B.put("sync_should_retry", A03());
        A1B.put("sync_retry_count", this.A00);
        A1B.put("sync_contact", this.A0B);
        A1B.put("sync_sidelist", this.A0H);
        A1B.put("sync_status", this.A0I);
        A1B.put("sync_picture", this.A0G);
        A1B.put("sync_disappearing_mode", this.A0D);
        A1B.put("sync_lid", this.A0E);
        A1B.put("sync_devices", this.A0C);
        A1B.put("sync_bot", this.A09);
        A1B.put("sync_username", this.A0K);
        A1B.put("sync_text_status", this.A0J);
        List<byte[]> list = this.A04;
        if (!list.isEmpty()) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (byte[] encodeToString : list) {
                A0I2.add(Base64.encodeToString(encodeToString, 0));
            }
            A1B.put("sync_jid_hash", new JSONArray(A0I2));
        }
        Set<Jid> set = this.A05;
        if (!set.isEmpty()) {
            ArrayList A0I3 = AnonymousClass001.A0I();
            for (Jid jid : set) {
                if (jid != null) {
                    A0I3.add(jid.getRawString());
                }
            }
            A1B.put("sync_jid", new JSONArray(A0I3));
        }
        return A1B.toString();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncRequest, mode=");
        C108515Tu r1 = this.A02;
        A0u.append(r1.mode.modeString);
        A0u.append(", context=");
        A0u.append(r1.context.contextString);
        A0u.append(", protocols=");
        String str11 = "";
        if (this.A0G) {
            str = "A";
        } else {
            str = str11;
        }
        A0u.append(str);
        if (this.A0B) {
            str2 = "C";
        } else {
            str2 = str11;
        }
        A0u.append(str2);
        if (this.A0H) {
            str3 = "I";
        } else {
            str3 = str11;
        }
        A0u.append(str3);
        if (this.A0I) {
            str4 = "S";
        } else {
            str4 = str11;
        }
        A0u.append(str4);
        if (this.A0A) {
            str5 = "B";
        } else {
            str5 = str11;
        }
        A0u.append(str5);
        if (this.A0C) {
            str6 = "D";
        } else {
            str6 = str11;
        }
        A0u.append(str6);
        if (this.A0F) {
            str7 = "P";
        } else {
            str7 = str11;
        }
        A0u.append(str7);
        if (this.A0D) {
            str8 = "M";
        } else {
            str8 = str11;
        }
        A0u.append(str8);
        if (this.A0E) {
            str9 = "L";
        } else {
            str9 = str11;
        }
        A0u.append(str9);
        if (this.A09) {
            str10 = "T";
        } else {
            str10 = str11;
        }
        A0u.append(str10);
        if (this.A0J) {
            str11 = "E";
        }
        return AnonymousClass000.A0q(str11, A0u);
    }
}
