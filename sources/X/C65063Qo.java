package X;

import android.database.Cursor;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3Qo  reason: invalid class name and case insensitive filesystem */
public class C65063Qo {
    public final Map A00 = AnonymousClass001.A0J();
    public final Map A01 = C36431kI.A1G();
    public final Map A02 = AnonymousClass001.A0J();
    public final Map A03 = AnonymousClass001.A0J();
    public final Map A04 = AnonymousClass001.A0J();
    public final Map A05 = AnonymousClass001.A0J();

    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.getDefault()).replaceAll("\\s*", "").replace("ifnotexists", "");
    }

    public /* synthetic */ void A01(Pair pair) {
        A08((String) pair.first, (String) pair.second);
    }

    public void A02(C224114e r5, AnonymousClass38H r6) {
        Map map = this.A05;
        map.size();
        Iterator A0y = AnonymousClass000.A0y(this.A04);
        while (A0y.hasNext()) {
            ((AnonymousClass160) C36351kA.A0u(A0y)).B4y(r5, r6);
        }
        Iterator A0y2 = AnonymousClass000.A0y(map);
        while (A0y2.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y2);
            C594834c r0 = (C594834c) A11.getValue();
            C224614k.A05(r5, (String) A11.getKey(), r0.A00, r0.A01);
        }
    }

    public void A03(C224114e r5, String str) {
        Map map = this.A01;
        map.size();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            r5.A0D((String) C36351kA.A0u(A0y), AnonymousClass000.A0q("/schema-registry/createIndexes", AnonymousClass000.A0v(str)));
        }
    }

    public void A04(C224114e r11, String str) {
        Cursor A09;
        C81613xI r1 = C81613xI.A00;
        TreeMap treeMap = new TreeMap(r1);
        treeMap.putAll(this.A02);
        TreeMap treeMap2 = new TreeMap(r1);
        try {
            A09 = r11.A09("SELECT name,sql FROM sqlite_master WHERE type='trigger'", "GET_TRIGGER_SQL", (String[]) null);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("sql");
            while (A09.moveToNext()) {
                treeMap2.put(A09.getString(columnIndexOrThrow), A09.getString(columnIndexOrThrow2));
            }
            A09.close();
        } catch (Exception e) {
            Log.e("schema-registry/scanExistingTriggers", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator A10 = C36371kC.A10(treeMap2);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            Object key = A11.getKey();
            String str2 = (String) treeMap.get(key);
            if (str2 == null || !A00(str2).equalsIgnoreCase(A00((String) A11.getValue()))) {
                A0I.add(String.format("DROP TRIGGER %s;", new Object[]{key}));
            } else {
                A0I2.add(key);
            }
        }
        Iterator it = A0I2.iterator();
        while (it.hasNext()) {
            treeMap.remove(it.next());
        }
        Iterator A102 = C36371kC.A10(treeMap);
        while (A102.hasNext()) {
            A0I.add(C36351kA.A0u(A102));
        }
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            r11.A0D(AnonymousClass001.A0C(it2), AnonymousClass000.A0q("/schema-registry/createTriggers", AnonymousClass000.A0v(str)));
        }
        return;
        throw th;
    }

    public void A05(C224114e r3, String str) {
        Iterator A10 = AnonymousClass000.A10(this.A05);
        while (A10.hasNext()) {
            C224614k.A03(r3, str, AnonymousClass001.A0C(A10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A05.containsKey(r6) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass160 r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.Map r3 = r4.A04
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x0011
            java.util.Map r0 = r4.A05
            boolean r0 = r0.containsKey(r6)
            r2 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r6)
            java.lang.String r0 = " table alread registered"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.C18740tg.A0D(r2, r0)
            r3.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65063Qo.A06(X.160, java.lang.String):void");
    }

    public void A07(String str, String str2) {
        if (this.A01.put(str, str2) != null) {
            C18740tg.A0D(false, AnonymousClass000.A0q(" index already registered", AnonymousClass000.A0v(str)));
        }
    }

    public void A08(String str, String str2) {
        if (this.A02.put(str, str2) != null) {
            C18740tg.A0D(false, AnonymousClass000.A0q(" trigger already registered", AnonymousClass000.A0v(str)));
        }
    }

    public void A09(String str, String str2, String str3) {
        if (this.A00.put(str2, str3) != null) {
            C18740tg.A0D(false, AnonymousClass000.A0q(" index already registered", AnonymousClass000.A0v(str2)));
        }
        Map map = this.A03;
        List list = (List) map.get(str);
        if (list == null) {
            list = AnonymousClass001.A0I();
            map.put(str, list);
        }
        list.add(str2);
    }

    public void A0A(String str, List list, List list2) {
        if (this.A05.put(str, new C594834c(list, list2)) != null) {
            C18740tg.A0D(false, AnonymousClass000.A0q(" table already registered", AnonymousClass000.A0v(str)));
        }
    }

    public /* synthetic */ void A0B(String str, C64563Om... r4) {
        A0A(str, Arrays.asList(r4), Collections.emptyList());
    }
}
