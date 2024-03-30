package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3R9  reason: invalid class name */
public abstract class AnonymousClass3R9 {
    public static void A00(C20810yC r14, AnonymousClass39E r15, C203399nx r16, String str) {
        int i;
        boolean z;
        C203399nx A0c = r16.A0c(str);
        C18740tg.A06(A0c);
        List A0j = A0c.A0j("participant");
        ArrayList A0I = AnonymousClass001.A0I();
        Class<UserJid> cls = UserJid.class;
        Iterator it = A0c.A0j("participant").iterator();
        while (it.hasNext()) {
            A0I.add(C36431kI.A0s(it).A0X(cls, "jid"));
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        A01(A0c, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0I2);
        ArrayList A0I3 = AnonymousClass001.A0I();
        A01(A0c, "error", A0I3);
        ArrayList A0I4 = AnonymousClass001.A0I();
        if (C36441kJ.A1L(r14)) {
            Iterator it2 = A0c.A0j("participant").iterator();
            while (it2.hasNext()) {
                A0I4.add(Boolean.valueOf(C36431kI.A1Q("false".equals(C36391kE.A0x(C36431kI.A0s(it2), "addressable")) ? 1 : 0)));
            }
        }
        ArrayList A0I5 = AnonymousClass001.A0I();
        ArrayList A0I6 = AnonymousClass001.A0I();
        Iterator it3 = A0j.iterator();
        while (it3.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it3);
            C203399nx A0c2 = A0s.A0c("add_request");
            if (A0c2 == null) {
                A0I5.add((Object) null);
            } else {
                C36361kB.A1O(A0c2.A0i("code", (String) null), A0c2.A0i("expiration", (String) null), A0I5);
            }
            C203399nx A0c3 = A0s.A0c("membership_approval_request");
            if (A0c3 == null) {
                A0I6.add((Object) null);
            } else {
                A0I6.add(A0c3.A0i("error", (String) null));
            }
        }
        for (int i2 = 0; i2 < A0I.size(); i2++) {
            Jid jid = (Jid) A0I.get(i2);
            String A0e = C36421kH.A0e(A0I3, i2);
            if (A0e != null) {
                try {
                    i = Integer.valueOf(A0e).intValue();
                    if (i == 421 && !TextUtils.isEmpty((CharSequence) A0I6.get(i2)) && TextUtils.isDigitsOnly((CharSequence) A0I6.get(i2))) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append(i);
                        i = Integer.valueOf(AnonymousClass000.A0q(C36421kH.A0e(A0I6, i2), A0u)).intValue();
                    }
                } catch (Exception unused) {
                    i = 499;
                }
                C36421kH.A1M(jid, r15.A02, i);
                if (i == 403) {
                    if (C36441kJ.A1L(r14)) {
                        z = AnonymousClass000.A1X(A0I4.get(i2));
                    } else {
                        z = true;
                    }
                    Pair pair = (Pair) A0I5.get(i2);
                    if (pair != null && z) {
                        try {
                            r15.A03.put(jid, new C596034o((String) pair.first, Long.valueOf((String) pair.second).longValue()));
                        } catch (Exception unused2) {
                        }
                    }
                    if (C36441kJ.A1L(r14) && !AnonymousClass000.A1X(A0I4.get(i2))) {
                        r15.A01.add(jid.getRawString());
                    }
                }
                if (C36441kJ.A1L(r14) && i == 451) {
                    r15.A01.add(jid.getRawString());
                }
            } else {
                Object obj = A0I2.get(i2);
                if (obj == null) {
                    obj = "";
                }
                r15.A04.put(jid, obj);
            }
        }
    }

    public static void A01(C203399nx r1, String str, List list) {
        Iterator it = r1.A0j("participant").iterator();
        while (it.hasNext()) {
            list.add(C36391kE.A0x(C36431kI.A0s(it), str));
        }
    }

    public static void A02(C203399nx r5, String str, Map map, Map map2) {
        int i;
        Class<UserJid> cls = UserJid.class;
        C203399nx A0c = r5.A0c(str);
        C18740tg.A06(A0c);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A0c.A0j("participant").iterator();
        while (it.hasNext()) {
            A0I.add(C36431kI.A0s(it).A0X(cls, "jid"));
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        A01(A0c, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0I2);
        ArrayList A0I3 = AnonymousClass001.A0I();
        A01(A0c, "error", A0I3);
        for (int i2 = 0; i2 < A0I.size(); i2++) {
            Object obj = A0I.get(i2);
            String A0e = C36421kH.A0e(A0I3, i2);
            if (A0e != null) {
                try {
                    i = Integer.valueOf(A0e);
                } catch (Exception unused) {
                    i = 499;
                }
                map2.put(obj, i);
            } else {
                Object obj2 = A0I2.get(i2);
                if (obj2 == null) {
                    obj2 = "";
                }
                map.put(obj, obj2);
            }
        }
    }
}
