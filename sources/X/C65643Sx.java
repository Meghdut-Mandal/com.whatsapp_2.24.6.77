package X;

import android.provider.ContactsContract;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Sx  reason: invalid class name and case insensitive filesystem */
public class C65643Sx {
    public static HashMap A0D = AnonymousClass001.A0J();
    public static HashMap A0E;
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public List A04 = AnonymousClass001.A0I();
    public List A05;
    public List A06;
    public List A07;
    public Map A08;
    public C599735z A09 = new C599735z();
    public AnonymousClass3F9 A0A = new AnonymousClass3F9();
    public byte[] A0B;
    public final AnonymousClass361 A0C = new AnonymousClass361();

    public static AnonymousClass3KL A00(Object obj, C65643Sx r3) {
        return (AnonymousClass3KL) ((List) r3.A08.get(obj)).get(0);
    }

    public static C602837f A01(String str) {
        if (str != null) {
            AnonymousClass9UV r3 = new AnonymousClass9UV();
            try {
                Iterator it = C200709i5.A00(str).iterator();
                while (it.hasNext()) {
                    C200709i5.A01(Arrays.asList(C200709i5.A00.split(AnonymousClass001.A0C(it))), r3);
                }
                List list = r3.A02;
                if (list.size() > 0 && ((C602837f) list.get(0)).A01.equals("VCARD")) {
                    return (C602837f) list.get(0);
                }
            } catch (Exception e) {
                Log.e("Error parsing vcard", new C108695Un(e));
                return null;
            }
        }
        return null;
    }

    public String A03() {
        String str = this.A0A.A01;
        if (str != null) {
            return str;
        }
        List list = this.A05;
        if (list != null && list.size() > 0) {
            return ((AnonymousClass360) C36391kE.A0t(this.A05)).A00;
        }
        List list2 = this.A06;
        if (list2 != null && list2.size() > 0) {
            for (C607439e r1 : this.A06) {
                if (r1.A04) {
                    return r1.A02;
                }
            }
        }
        List list3 = this.A03;
        if (list3 == null || list3.size() <= 0) {
            return "";
        }
        for (AnonymousClass3A9 r2 : this.A03) {
            if (r2.A01 == ContactsContract.CommonDataKinds.Email.class && r2.A05) {
                return r2.A02;
            }
        }
        return "";
    }

    public void A04(UserJid userJid, String str, String str2, int i, boolean z) {
        if (str == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("contactstruct/addphone/data is null; skipping (type=");
            A0u.append(i);
            A0u.append(" jidFromWaId=");
            A0u.append(userJid);
            A0u.append(" label=");
            A0u.append(str2);
            A0u.append(" isPrimary=");
            A0u.append(z);
            C36341k9.A1O(A0u, ")");
        } else if (str.length() > 30) {
            this.A0C.A01++;
        } else {
            List list = this.A06;
            if (list == null) {
                list = AnonymousClass001.A0I();
                this.A06 = list;
            }
            if (list.size() >= 10) {
                this.A0C.A00++;
                return;
            }
            C607439e r1 = new C607439e();
            r1.A00 = i;
            r1.A01 = userJid;
            r1.A02 = str;
            r1.A03 = str2;
            r1.A04 = z;
            this.A06.add(r1);
        }
    }

    public void A05(String str, String str2) {
        List list = this.A05;
        if (list == null) {
            list = AnonymousClass001.A0I();
            this.A05 = list;
        }
        AnonymousClass360 r0 = new AnonymousClass360();
        r0.A00 = str;
        r0.A01 = str2;
        list.add(r0);
    }

    public void A06(AnonymousClass3KL r4) {
        List list;
        String str = r4.A02;
        if (str != null && str.length() != 0) {
            String str2 = r4.A01;
            Map map = this.A08;
            if (map == null) {
                map = AnonymousClass001.A0J();
                this.A08 = map;
            }
            if (!map.containsKey(str2)) {
                list = AnonymousClass001.A0I();
                this.A08.put(str2, list);
            } else {
                list = (List) this.A08.get(str2);
            }
            list.add(r4);
        }
    }

    static {
        HashMap A0J = AnonymousClass001.A0J();
        A0E = A0J;
        A0J.put("X-AIM", C36381kD.A0m());
        A0E.put("X-MSN", C36361kB.A0i());
        A0E.put("X-YAHOO", C36361kB.A0j());
        HashMap hashMap = A0E;
        Integer A0p = C36371kC.A0p();
        hashMap.put("X-GOOGLE-TALK", A0p);
        A0E.put("X-GOOGLE TAL", A0p);
        A0E.put("X-ICQ", C36381kD.A0n());
        A0E.put("X-JABBER", C36401kF.A0h());
        A0E.put("X-SKYPE-USERNAME", C36371kC.A0n());
        A0D.put("X-AIM", "AIM");
        A0D.put("X-MSN", "Windows Live");
        A0D.put("X-YAHOO", "YAHOO");
        A0D.put("X-GOOGLE-TALK", "Google Talk");
        A0D.put("X-GOOGLE TAL", "Google Talk");
        A0D.put("X-ICQ", "ICQ");
        A0D.put("X-JABBER", "Jabber");
        A0D.put("X-SKYPE-USERNAME", "Skype");
        A0D.put("NICKNAME", "Nickname");
        A0D.put("BDAY", "Birthday");
    }

    public static void A02(List list, AnonymousClass3F9 r4) {
        int size = list.size();
        if (size > 1) {
            r4.A00 = (String) C36391kE.A0t(list);
            r4.A02 = C36401kF.A0s(list, 1);
            if (size > 2) {
                if (C36401kF.A0s(list, 2).length() > 0) {
                    r4.A03 = C36401kF.A0s(list, 2);
                }
                if (size > 3) {
                    if (C36401kF.A0s(list, 3).length() > 0) {
                        r4.A06 = C36401kF.A0s(list, 3);
                    }
                    if (size > 4 && C36401kF.A0s(list, 4).length() > 0) {
                        r4.A07 = C36401kF.A0s(list, 4);
                    }
                }
            }
        }
    }
}
