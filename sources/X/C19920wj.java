package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: X.0wj  reason: invalid class name and case insensitive filesystem */
public class C19920wj implements SharedPreferences {
    public int A00;
    public long A01;
    public long A02;
    public Throwable A03;
    public Map A04 = new HashMap();
    public boolean A05;
    public final int A06;
    public final C19910wi A07;
    public final C19880wf A08;
    public final Object A09 = new Object();
    public final Object A0A = new Object();
    public final String A0B = UUID.randomUUID().toString();
    public final Map A0C = new HashMap();
    public final boolean A0D;
    public final Handler A0E = new Handler(Looper.getMainLooper());

    private void A00() {
        if (!this.A0D) {
            ConditionVariable conditionVariable = C18740tg.A00;
        }
        while (!this.A05) {
            try {
                this.A09.wait();
            } catch (InterruptedException unused) {
            }
        }
        Throwable th = this.A03;
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.A09) {
            A00();
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        synchronized (this.A09) {
            A00();
        }
        return new AnonymousClass15B(this);
    }

    public Map getAll() {
        HashMap hashMap;
        synchronized (this.A09) {
            A00();
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        synchronized (this.A09) {
            A00();
            try {
                Boolean bool = (Boolean) this.A04.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return z;
    }

    public float getFloat(String str, float f) {
        synchronized (this.A09) {
            A00();
            try {
                Float f2 = (Float) this.A04.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return f;
    }

    public int getInt(String str, int i) {
        synchronized (this.A09) {
            A00();
            try {
                Integer num = (Integer) this.A04.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return i;
    }

    public long getLong(String str, long j) {
        synchronized (this.A09) {
            A00();
            try {
                Long l = (Long) this.A04.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return j;
    }

    public String getString(String str, String str2) {
        synchronized (this.A09) {
            A00();
            try {
                String str3 = (String) this.A04.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return str2;
    }

    public Set getStringSet(String str, Set set) {
        synchronized (this.A09) {
            A00();
            try {
                Set set2 = (Set) this.A04.get(str);
                if (set2 != null) {
                    set = set2;
                }
            } catch (ClassCastException unused) {
                Log.e("LightSharedPreferencesImpl/get: ClassCastException return default value");
            }
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0B;
        Handler handler = this.A0E;
        synchronized (this.A09) {
            Map map = this.A0C;
            C18740tg.A06(str);
            WeakHashMap weakHashMap = (WeakHashMap) map.get(str);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                map.put(str, weakHashMap);
            }
            C18740tg.A06(onSharedPreferenceChangeListener);
            C18740tg.A06(handler);
            weakHashMap.put(onSharedPreferenceChangeListener, handler);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0B;
        synchronized (this.A09) {
            Map map = this.A0C;
            C18740tg.A06(str);
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                C18740tg.A06(onSharedPreferenceChangeListener);
                map2.remove(onSharedPreferenceChangeListener);
            }
        }
    }

    public C19920wj(C19910wi r5, C19880wf r6, int i, boolean z) {
        this.A07 = r5;
        this.A0D = z;
        this.A08 = r6;
        this.A06 = i;
        synchronized (this.A09) {
            this.A05 = false;
        }
        this.A08.A00(new C35731jA((Object) this, 7), this.A06, false);
    }
}
