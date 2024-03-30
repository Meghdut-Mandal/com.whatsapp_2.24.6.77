package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Te  reason: invalid class name and case insensitive filesystem */
public abstract class C65713Te {
    public static String A00(C80163ux r2) {
        String str;
        AnonymousClass11F r22 = r2.A00;
        if (r22 instanceof GroupJid) {
            str = r22.getRawString();
        } else {
            C18740tg.A0D(r22 instanceof UserJid, "MentionUtil/unexpected jid type in mention");
            str = r22.user;
            C18740tg.A06(str);
        }
        return AnonymousClass000.A0p("@", str, AnonymousClass000.A0u());
    }

    public static String A01(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C80163ux r3 = (C80163ux) it.next();
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("j", r3.A00.getRawString());
            Object obj = r3.A01;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            A1B.put("d", obj);
            jSONArray.put(A1B);
        }
        return jSONArray.toString();
    }

    public static boolean A05(C19730wQ r2, List list) {
        return A02(UserJid.class, list).contains(C36441kJ.A0n(r2));
    }

    public static ArrayList A02(Class cls, Iterable iterable) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = ((C80163ux) it.next()).A00;
                if (cls.isInstance(r1)) {
                    A0I.add(cls.cast(r1));
                }
            }
        }
        return A0I;
    }

    public static ArrayList A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '[') {
            return A04(str);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                AnonymousClass00C.A0D(jSONObject, 0);
                C222713q r0 = AnonymousClass11F.A00;
                A0I.add(new C80163ux(C222713q.A01(jSONObject.getString("j")), C63893Lv.A00("d", jSONObject, false)));
            }
            return A0I;
        } catch (JSONException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MentionUtil/Failed to parse mention from JSON looking string: ");
            A0u.append(str.substring(0, 5));
            C36321k7.A1Z(A0u, "...");
            return A04(str);
        }
    }

    public static ArrayList A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList A06 = AnonymousClass143.A06(UserJid.class, Arrays.asList(str.split(",")));
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            A0I.add(new C80163ux(C36401kF.A0a(it), (String) null));
        }
        return A0I;
    }
}
