package X;

import android.content.SharedPreferences;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.15B  reason: invalid class name */
public final class AnonymousClass15B implements SharedPreferences.Editor {
    public boolean A00 = false;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final /* synthetic */ C19920wj A03;

    public AnonymousClass15B(C19920wj r2) {
        this.A03 = r2;
    }

    private AnonymousClass15N A00() {
        Map map;
        ArrayList arrayList;
        long j;
        Object obj;
        boolean z;
        C19920wj r8 = this.A03;
        synchronized (r8.A09) {
            if (r8.A00 > 0) {
                r8.A04 = new HashMap(r8.A04);
            }
            map = r8.A04;
            r8.A00++;
            boolean z2 = !r8.A0C.isEmpty();
            if (z2) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            synchronized (this.A01) {
                boolean z3 = false;
                if (this.A00) {
                    if (!map.isEmpty()) {
                        map.clear();
                        z = true;
                    } else {
                        z = false;
                    }
                    this.A00 = false;
                    z3 = z;
                }
                Map map2 = this.A02;
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                    } else if (!map.containsKey(str) || (obj = map.get(str)) == null || !obj.equals(value)) {
                        map.put(str, value);
                    }
                    if (z2) {
                        arrayList.add(str);
                    }
                    z3 = true;
                }
                map2.clear();
                if (z3) {
                    r8.A01 = 1 + r8.A01;
                }
                j = r8.A01;
            }
        }
        return new AnonymousClass15N(arrayList, map, j);
    }

    private void A01(AnonymousClass15N r8) {
        List list = r8.A00;
        if (list != null && list.size() != 0) {
            C19920wj r5 = this.A03;
            synchronized (r5.A09) {
                Map map = r5.A0C;
                if (!map.isEmpty()) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        String str = (String) list.get(size);
                        Map map2 = (Map) map.get(str);
                        if (map2 != null) {
                            A02(str, map2);
                        }
                        Map map3 = (Map) map.get(r5.A0B);
                        if (map3 != null) {
                            A02(str, map3);
                        }
                    }
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        synchronized (this.A01) {
            this.A00 = true;
        }
        return this;
    }

    public boolean commit() {
        boolean z;
        C19920wj r8 = this.A03;
        C19880wf r7 = r8.A08;
        if (r7.A04) {
            return false;
        }
        AnonymousClass15N A002 = A00();
        C35291iS r3 = new C35291iS(r8, A002, 15, true);
        synchronized (r8.A09) {
            z = false;
            if (r8.A00 == 1) {
                z = true;
            }
        }
        if (z) {
            r3.run();
        } else {
            r7.A00(r3, r8.A06, false);
        }
        try {
            A002.A03.await();
            A01(A002);
            return A002.A04;
        } catch (InterruptedException e) {
            Log.e("LightSharedPreferencesImpl/Commit: Got exception:", e);
            return false;
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.A01) {
            this.A02.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.A01) {
            this.A02.put(str, Float.valueOf(f));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.A01) {
            this.A02.put(str, Integer.valueOf(i));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.A01) {
            this.A02.put(str, Long.valueOf(j));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.A01) {
            this.A02.put(str, str2);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        HashSet hashSet;
        synchronized (this.A01) {
            Map map = this.A02;
            if (set == null) {
                hashSet = null;
            } else {
                hashSet = new HashSet(set);
            }
            map.put(str, hashSet);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        synchronized (this.A01) {
            this.A02.put(str, this);
        }
        return this;
    }

    private void A02(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Handler) entry.getValue()).post(new C35491im(this, entry.getKey(), str, 8));
        }
    }

    public void apply() {
        AnonymousClass15N A002 = A00();
        C19920wj r4 = this.A03;
        r4.A08.A00(new C35291iS(r4, A002, 15, false), r4.A06, true);
        A01(A002);
    }
}
