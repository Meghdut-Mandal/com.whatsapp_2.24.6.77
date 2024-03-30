package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7tP  reason: invalid class name and case insensitive filesystem */
public class C165427tP implements C236119d {
    public Object A00;
    public final int A01;

    public C165427tP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVN(String str) {
        switch (this.A01) {
            case 2:
                Log.i("PushXmppMethod/clear config delivery failure");
                ((C159677jk) this.A00).BXH();
                return;
            case 3:
                ((C160047kN) this.A00).BVK();
                return;
            default:
                return;
        }
    }

    public void BWw(C203399nx r7, String str) {
        SharedPreferences sharedPreferences;
        int A012;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(r7, 1);
                ((AtomicInteger) this.A00).set(AnonymousClass3ME.A00(r7));
                return;
            case 1:
                int A002 = AnonymousClass3ME.A00(r7);
                C21510zM r5 = ((AnonymousClass649) this.A00).A01;
                r5.A04(A002);
                if (A002 == 207 || A002 == 304 || (A002 >= 400 && A002 <= 503)) {
                    synchronized (r5) {
                        sharedPreferences = r5.A00;
                        A012 = C36371kC.A01(sharedPreferences, "ab_props:sys:fetch_attemp_count");
                    }
                    int i = A012 + 1;
                    r5.A03(i);
                    if (i >= 3) {
                        long A003 = C19970wo.A00(r5.A01);
                        synchronized (r5) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong("ab_props:sys:last_refresh_time", A003);
                            edit.apply();
                        }
                        r5.A03(0);
                        return;
                    }
                    return;
                }
                C36321k7.A1S("ABPropsManager/onABPropError; unknown error code: ", AnonymousClass000.A0u(), A002);
                return;
            case 2:
                AnonymousClass00C.A0D(r7, 1);
                C36321k7.A1S("PushXmppMethod/clear config error/", AnonymousClass000.A0u(), AnonymousClass3ME.A00(r7));
                ((C159677jk) this.A00).BXH();
                return;
            default:
                C36321k7.A0w(str, r7);
                ((C160047kN) this.A00).BWj(new AnonymousClass5V6(r7, str));
                return;
        }
    }

    public void BiM(C203399nx r22, String str) {
        SharedPreferences.Editor putString;
        boolean z;
        SharedPreferences sharedPreferences;
        C000000a r12;
        String str2;
        switch (this.A01) {
            case 0:
                return;
            case 1:
                C203399nx r1 = r22;
                C203399nx A0c = r1.A0c("props");
                C203399nx A0c2 = r1.A0c("erid");
                if (A0c != null) {
                    AnonymousClass649 r8 = (AnonymousClass649) this.A00;
                    AnonymousClass6R8.A00(A0c.A0i("protocol", (String) null), 1);
                    String A0i = A0c.A0i("ab_key", (String) null);
                    String A0i2 = A0c.A0i("hash", (String) null);
                    long A012 = AnonymousClass6R8.A01(A0c.A0i("refresh", (String) null), 86400) * 1000;
                    int A0S = A0c.A0S("refresh_id", 0);
                    SparseArray sparseArray = new SparseArray();
                    List A0j = A0c.A0j("prop");
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    Iterator it = A0j.iterator();
                    while (it.hasNext()) {
                        C203399nx A0s = C36431kI.A0s(it);
                        if (!TextUtils.isEmpty(A0s.A0i("config_code", (String) null))) {
                            sparseArray.append(A0s.A0R("config_code"), Pair.create(A0s.A0h("config_value"), A0s.A0i("config_expo_key", (String) null)));
                        } else {
                            sparseIntArray.append(A0s.A0R("event_code"), A0s.A0R("sampling_weight"));
                        }
                    }
                    C21510zM r3 = r8.A01;
                    C19970wo r20 = r8.A00;
                    synchronized (r3) {
                        SharedPreferences sharedPreferences2 = r3.A00;
                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                        if (!TextUtils.isEmpty(A0i2) && ((C21100yf) ((C20660xv) r3.A04.A00.A01(C20660xv.class)).A00.get()).A09(C21100yf.A0T)) {
                            SharedPreferences A002 = r3.A07.A00("ab-props-backup");
                            C90504aG.A12(A002);
                            Map<String, ?> all = sharedPreferences2.getAll();
                            if (!all.isEmpty()) {
                                SharedPreferences.Editor edit2 = A002.edit();
                                Iterator A0y = AnonymousClass000.A0y(all);
                                while (A0y.hasNext()) {
                                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                                    String A0f = C90494aF.A0f(A11);
                                    Object value = A11.getValue();
                                    if (value != null) {
                                        Class<?> cls = value.getClass();
                                        if (cls.equals(Boolean.class)) {
                                            edit2.putBoolean(A0f, AnonymousClass000.A1X(value));
                                        } else if (cls.equals(Float.class)) {
                                            edit2.putFloat(A0f, ((Float) value).floatValue());
                                        } else if (cls.equals(Integer.class)) {
                                            edit2.putInt(A0f, C90514aH.A0H(value));
                                        } else if (cls.equals(Long.class)) {
                                            edit2.putLong(A0f, C90524aI.A07(value));
                                        } else if (cls.equals(String.class)) {
                                            edit2.putString(A0f, (String) value);
                                        } else if (Set.class.isAssignableFrom(cls)) {
                                            edit2.putStringSet(A0f, (Set) value);
                                        }
                                    }
                                }
                                edit2.commit();
                            }
                        }
                        long max = Math.max(A012, 600000);
                        edit.putLong("ab_props:sys:refresh", max);
                        if (!TextUtils.isEmpty(A0i2)) {
                            HashMap A0J = AnonymousClass001.A0J();
                            Set<String> stringSet = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                            sharedPreferences2.getAll();
                            edit.clear();
                            edit.putLong("ab_props:sys:refresh", max);
                            edit.putStringSet("ab_props:sys:last_exposure_keys", stringSet);
                            AnonymousClass6OK r13 = (AnonymousClass6OK) r3.A08.get();
                            synchronized (r13) {
                                try {
                                    r13.A01 = false;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            z = true;
                            C20790yA r14 = r3.A03;
                            Iterator A0s2 = C36361kB.A0s(r14);
                            while (A0s2.hasNext()) {
                                AnonymousClass1DJ r15 = (AnonymousClass1DJ) A0s2.next();
                                try {
                                    r15.A02();
                                } catch (Exception e) {
                                    C20790yA.A00(r15, r14, e);
                                }
                            }
                            int i = 0;
                            while (i < sparseArray.size()) {
                                try {
                                    int keyAt = sparseArray.keyAt(i);
                                    Pair pair = (Pair) sparseArray.valueAt(i);
                                    String str3 = (String) pair.second;
                                    if (C21510zM.A00(edit, r3, (String) pair.first, keyAt) && !TextUtils.isEmpty(str3)) {
                                        edit.putString(AnonymousClass000.A0q("_expo_key", C90504aG.A0q(keyAt)), str3);
                                    }
                                    i++;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            Set<String> stringSet2 = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
                            if (stringSet2 == null) {
                                r12 = new C000000a(0);
                            } else {
                                r12 = new C000000a(0);
                                r12.addAll(stringSet2);
                            }
                            C000000a r11 = new C000000a(0);
                            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                                Pair pair2 = (Pair) sparseArray.valueAt(i2);
                                if (pair2 == null) {
                                    str2 = null;
                                } else {
                                    str2 = (String) pair2.second;
                                }
                                if (r12.contains(str2)) {
                                    r11.add(str2);
                                }
                            }
                            C20800yB r0 = r3.A05;
                            r0.A0C(edit, r11);
                            r0.A0B();
                            A0J.isEmpty();
                        } else {
                            z = false;
                        }
                        edit.putString("ab_props:sys:config_key", A0i);
                        C20920yN r5 = r3.A06;
                        AnonymousClass00C.A0D(r5, 0);
                        r5.BqE(A0i, 4473, 0);
                        r5.BqE(A0i, 4473, 1);
                        if (!TextUtils.isEmpty(A0i2)) {
                            edit.putString("ab_props:sys:config_hash", A0i2);
                        }
                        edit.putLong("ab_props:sys:last_refresh_time", C19970wo.A00(r20));
                        edit.putInt("ab_props:sys:last_version", A0S);
                        edit.apply();
                        if (z) {
                            C20790yA r52 = r3.A03;
                            Iterator A0s3 = C36361kB.A0s(r52);
                            while (A0s3.hasNext()) {
                                AnonymousClass1DJ r16 = (AnonymousClass1DJ) A0s3.next();
                                try {
                                    r16.A01();
                                } catch (Exception e2) {
                                    C20790yA.A00(r16, r52, e2);
                                }
                            }
                        }
                        r3.A04(0);
                        r3.A03(0);
                        C90464aC.A18(C36441kJ.A0w(C90514aH.A0j(r3.A02), "crash_counter"));
                    }
                    if (!TextUtils.isEmpty(A0i2)) {
                        C20970yS r2 = r8.A03;
                        synchronized (r2) {
                            sharedPreferences = r2.A00;
                            if (sharedPreferences == null) {
                                sharedPreferences = r2.A01.A00("field-stats-events-sampling");
                                r2.A00 = sharedPreferences;
                            }
                        }
                        SharedPreferences.Editor edit3 = sharedPreferences.edit();
                        edit3.clear();
                        for (int i3 = 0; i3 < sparseIntArray.size(); i3++) {
                            int keyAt2 = sparseIntArray.keyAt(i3);
                            edit3.putInt(String.valueOf(keyAt2), sparseIntArray.valueAt(i3));
                        }
                        edit3.apply();
                    }
                }
                if (A0c2 != null) {
                    String A13 = C36441kJ.A13(A0c2.A01);
                    C119595q7 r17 = ((AnonymousClass649) this.A00).A02;
                    AnonymousClass005 r32 = r17.A01;
                    String A0b = ((C19420v0) r32.get()).A0b();
                    C20800yB r18 = r17.A00;
                    if (r18.A0E(3664)) {
                        if (!A0b.isEmpty()) {
                            putString = C19420v0.A00((C19420v0) r32.get()).remove("encrypted_rid");
                        } else {
                            return;
                        }
                    } else if (r18.A0E(6084) && !A0b.equals(A13)) {
                        putString = C19420v0.A00((C19420v0) r32.get()).putString("encrypted_rid", A13);
                    } else {
                        return;
                    }
                    putString.apply();
                    return;
                }
                return;
            case 2:
                Log.i("PushXmppMethod/clear config success");
                ((C159677jk) this.A00).onSuccess();
                return;
            default:
                ((C160047kN) this.A00).BiS((C122515uy) null, (Integer) null);
                return;
        }
    }
}
