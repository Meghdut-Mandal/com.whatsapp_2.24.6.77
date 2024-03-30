package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1WI  reason: invalid class name */
public class AnonymousClass1WI {
    public static final AnonymousClass1AL[] A08 = new AnonymousClass1AL[0];
    public final C19460v5 A00;
    public final C19700wN A01;
    public final C20050ww A02;
    public final AnonymousClass1WH A03;
    public final AnonymousClass1WG A04;
    public final AnonymousClass1EU A05;
    public final C19460v5 A06;
    public final AnonymousClass1DV A07;

    public static C203399nx A00(DeviceJid deviceJid, String str, C203399nx... r7) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            C203399nx r0 = r7[i];
            if (r0 != null) {
                arrayList.add(r0);
            }
            i++;
        } while (i < 2);
        return new C203399nx("to", A04(deviceJid, str), (C203399nx[]) arrayList.toArray(new C203399nx[arrayList.size()]));
    }

    public static C203399nx A01(UserJid userJid, C1270266q r5, String str) {
        if ("url".equals(str) && r5 != null) {
            Map map = r5.A01;
            if (map.containsKey(userJid)) {
                return new C203399nx("content_binding", (byte[]) map.get(userJid), (AnonymousClass1AL[]) null);
            }
        }
        return null;
    }

    public static void A03(C1270266q r2, String str, List list) {
        if ("url".equals(str) && r2 != null) {
            list.add(new C203399nx("sender_content_binding", r2.A02, (AnonymousClass1AL[]) null));
        }
    }

    public static AnonymousClass1AL[] A04(DeviceJid deviceJid, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1AL((Jid) deviceJid, "jid"));
        if (str != null) {
            arrayList.add(new AnonymousClass1AL("eph_setting", str));
        }
        return (AnonymousClass1AL[]) arrayList.toArray(A08);
    }

    public AnonymousClass1WI(C19460v5 r1, C19460v5 r2, C19700wN r3, C20050ww r4, AnonymousClass1WH r5, AnonymousClass1WG r6, AnonymousClass1EU r7, AnonymousClass1DV r8) {
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r8;
        this.A05 = r7;
        this.A00 = r1;
        this.A04 = r6;
        this.A06 = r2;
        this.A03 = r5;
    }

    public static ArrayList A02(C1270266q r21, Integer num, String str, String str2, List list, Map map, Map map2, Map map3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C203399nx A012;
        DeviceJid deviceJid;
        DeviceJid deviceJid2;
        C203399nx r11;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        C1270266q r8 = r21;
        String str3 = str;
        Map map4 = map;
        int i2 = i;
        boolean z5 = z2;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                DeviceJid deviceJid3 = (DeviceJid) entry.getKey();
                UserJid userJid = deviceJid3.userJid;
                if (userJid != null) {
                    deviceJid2 = userJid.getPrimaryDevice();
                } else {
                    deviceJid2 = null;
                }
                String str4 = (String) map4.get(deviceJid2);
                AnonymousClass630 r15 = (AnonymousClass630) entry.getValue();
                if (z3) {
                    r11 = A01(deviceJid3.userJid, r8, str3);
                } else {
                    r11 = null;
                }
                String str5 = null;
                Integer num2 = null;
                String str6 = null;
                if (z) {
                    str5 = str3;
                    num2 = num;
                    str6 = str2;
                }
                C203399nx A013 = C132906Vt.A01(r15, num2, str5, str6, i2, z5);
                if (r11 != null) {
                    hashSet.add(deviceJid3);
                }
                arrayList.add(A00(deviceJid3, str4, A013, r11));
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid4 = (DeviceJid) it.next();
                UserJid userJid2 = deviceJid4.userJid;
                if (userJid2 != null) {
                    deviceJid = userJid2.getPrimaryDevice();
                } else {
                    deviceJid = null;
                }
                arrayList.add(new C203399nx("to", A04(deviceJid4, (String) map4.get(deviceJid))));
            }
        }
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                DeviceJid deviceJid5 = (DeviceJid) entry2.getKey();
                arrayList.add(A00(deviceJid5, (String) null, C132906Vt.A01((AnonymousClass630) entry2.getValue(), num, str, str2, i2, z5), A01(deviceJid5.userJid, r8, str3)));
            }
        }
        if (z3 && z4 && r8 != null) {
            for (DeviceJid deviceJid6 : r8.A00) {
                if (!hashSet.contains(deviceJid6) && (A012 = A01(deviceJid6.userJid, r8, str3)) != null) {
                    arrayList.add(new C203399nx(A012, "to", A04(deviceJid6, (String) null)));
                }
            }
        }
        return arrayList;
    }
}
