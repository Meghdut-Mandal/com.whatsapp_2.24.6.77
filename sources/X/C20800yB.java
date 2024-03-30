package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0yB  reason: invalid class name and case insensitive filesystem */
public abstract class C20800yB {
    public Handler A00;
    public C35691j6 A01;
    public C21010yW A02;
    public final C20790yA A03;
    public final C19770wU A04;
    public final AnonymousClass005 A05;
    public final SharedPreferences A06;
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap(32);

    public synchronized void A0C(SharedPreferences.Editor editor, Set set) {
        editor.putStringSet("ab_props:sys:last_exposure_keys", set);
        editor.apply();
        C20920yN r3 = (C20920yN) this.A05.get();
        String join = TextUtils.join(",", set);
        AnonymousClass00C.A0D(r3, 0);
        r3.BqE(join, 5029, 0);
        r3.BqE(join, 5029, 1);
        r3.BqE(join, 5029, 3);
        r3.BqE(join, 5029, 2);
    }

    public float A05(int i) {
        return A06(C21000yV.A02, i);
    }

    public int A07(int i) {
        return A00(C21000yV.A02, this, i);
    }

    public Object A08(C21000yV r3, int i) {
        ConcurrentHashMap concurrentHashMap;
        if (this instanceof C21520zN) {
            concurrentHashMap = ((C21520zN) this).A01;
        } else if (r3.A00) {
            concurrentHashMap = this.A07;
        } else {
            concurrentHashMap = this.A08;
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    public String A09(int i) {
        String str;
        C20070wy r0;
        ConcurrentHashMap concurrentHashMap;
        C21000yV r02 = C21000yV.A02;
        String str2 = (String) A08(r02, i);
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            str = (String) A08(r02, i);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_expo_key");
                A0D(sb.toString());
                if (this instanceof C20810yC) {
                    r0 = ((C20810yC) this).A04;
                } else {
                    r0 = ((C21520zN) this).A00.A04;
                }
                Integer valueOf = Integer.valueOf(i);
                String str3 = (String) r0.get(valueOf);
                if (str3 != null) {
                    str = this.A06.getString(Integer.toString(i), str3);
                    if (str != null) {
                        if (this instanceof C21520zN) {
                            concurrentHashMap = ((C21520zN) this).A01;
                        } else {
                            concurrentHashMap = this.A08;
                        }
                        concurrentHashMap.put(valueOf, str);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown StringField: ");
                    sb2.append(i);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        return str;
    }

    public JSONObject A0A(int i) {
        JSONObject jSONObject;
        C20070wy r0;
        IllegalArgumentException illegalArgumentException;
        ConcurrentHashMap concurrentHashMap;
        C21000yV r02 = C21000yV.A02;
        JSONObject jSONObject2 = (JSONObject) A08(r02, i);
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        synchronized (this) {
            jSONObject = (JSONObject) A08(r02, i);
            if (jSONObject == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_expo_key");
                A0D(sb.toString());
                if (this instanceof C20810yC) {
                    r0 = ((C20810yC) this).A03;
                } else {
                    r0 = ((C21520zN) this).A00.A03;
                }
                Integer valueOf = Integer.valueOf(i);
                String str = (String) r0.get(valueOf);
                if (str != null) {
                    String num = Integer.toString(i);
                    SharedPreferences sharedPreferences = this.A06;
                    String string = sharedPreferences.getString(num, (String) null);
                    if (!TextUtils.isEmpty(string)) {
                        str = string;
                    }
                    try {
                        jSONObject = new JSONObject(str);
                        if (this instanceof C21520zN) {
                            concurrentHashMap = ((C21520zN) this).A01;
                        } else {
                            concurrentHashMap = this.A08;
                        }
                        concurrentHashMap.put(valueOf, jSONObject);
                    } catch (JSONException e) {
                        sharedPreferences.edit().remove(num).apply();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("AbstractABProps/invalid json format for property; prefKey=");
                        sb2.append(num);
                        sb2.append("; value=");
                        sb2.append(str);
                        illegalArgumentException = new IllegalArgumentException(sb2.toString(), e);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown JsonField: ");
                    sb3.append(i);
                    illegalArgumentException = new IllegalArgumentException(sb3.toString());
                    throw illegalArgumentException;
                }
            }
        }
        return jSONObject;
    }

    public void A0B() {
        ConcurrentHashMap concurrentHashMap;
        if (this instanceof C21520zN) {
            concurrentHashMap = ((C21520zN) this).A01;
        } else {
            concurrentHashMap = this.A08;
        }
        concurrentHashMap.clear();
    }

    public void A0D(String str) {
        C000000a r1;
        if (!(this instanceof C21520zN)) {
            SharedPreferences sharedPreferences = this.A06;
            String string = sharedPreferences.getString(str, (String) null);
            Set<String> stringSet = sharedPreferences.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
            if (stringSet != null) {
                r1 = new C000000a(0);
                r1.addAll(stringSet);
            }
            if (!TextUtils.isEmpty(string) && !r1.contains(string)) {
                r1.add(string);
                A0C(sharedPreferences.edit(), r1);
                C21000yV r3 = C21000yV.A02;
                if (A01(r3, this, 3099)) {
                    if (this.A00 == null) {
                        this.A00 = new Handler(Looper.getMainLooper());
                        this.A01 = new C35691j6(this, 48);
                    }
                    long millis = TimeUnit.SECONDS.toMillis((long) A00(r3, this, 3100));
                    this.A00.removeCallbacks(this.A01);
                    this.A00.postDelayed(this.A01, millis);
                }
            }
        }
    }

    public boolean A0E(int i) {
        return A01(C21000yV.A02, this, i);
    }

    public C20800yB(C20790yA r3, C19890wg r4, C19770wU r5, AnonymousClass005 r6, String str) {
        this.A04 = r5;
        this.A03 = r3;
        this.A05 = r6;
        this.A06 = r4.A00(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C21000yV r4, X.C20800yB r5, int r6) {
        /*
            java.lang.Object r0 = r5.A08(r4, r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            monitor-enter(r5)
            java.lang.Object r0 = r5.A08(r4, r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x001c
            int r0 = r0.intValue()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "_expo_key"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            r5.A0D(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r5 instanceof X.C20810yC     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0076
            r0 = r5
            X.0yC r0 = (X.C20810yC) r0     // Catch:{ all -> 0x0096 }
            X.0wy r0 = r0.A02     // Catch:{ all -> 0x0096 }
        L_0x0039:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x007f
            android.content.SharedPreferences r2 = r5.A06     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0096 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0096 }
            int r2 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r5 instanceof X.C21520zN     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0069
            r0 = r5
            X.0zN r0 = (X.C21520zN) r0     // Catch:{ all -> 0x0096 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A01     // Catch:{ all -> 0x0096 }
        L_0x0060:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            goto L_0x007e
        L_0x0069:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A08     // Catch:{ all -> 0x0096 }
            goto L_0x0060
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A07     // Catch:{ all -> 0x0096 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0067
        L_0x0076:
            r0 = r5
            X.0zN r0 = (X.C21520zN) r0     // Catch:{ all -> 0x0096 }
            X.0yC r0 = r0.A00     // Catch:{ all -> 0x0096 }
            X.0wy r0 = r0.A02     // Catch:{ all -> 0x0096 }
            goto L_0x0039
        L_0x007e:
            return r2
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "Unknown IntField: "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0096 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0096 }
            r0.<init>(r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20800yB.A00(X.0yV, X.0yB, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C21000yV r4, X.C20800yB r5, int r6) {
        /*
            java.lang.Object r0 = r5.A08(r4, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.booleanValue()
            return r0
        L_0x000d:
            monitor-enter(r5)
            java.lang.Object r0 = r5.A08(r4, r6)     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            return r0
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "_expo_key"
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            r5.A0D(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r5 instanceof X.C20810yC     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0076
            r0 = r5
            X.0yC r0 = (X.C20810yC) r0     // Catch:{ all -> 0x0096 }
            X.0wy r0 = r0.A00     // Catch:{ all -> 0x0096 }
        L_0x0039:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x007f
            android.content.SharedPreferences r2 = r5.A06     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0096 }
            boolean r2 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x006c
            boolean r0 = r5 instanceof X.C21520zN     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0069
            r0 = r5
            X.0zN r0 = (X.C21520zN) r0     // Catch:{ all -> 0x0096 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A01     // Catch:{ all -> 0x0096 }
        L_0x0060:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            goto L_0x007e
        L_0x0069:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A08     // Catch:{ all -> 0x0096 }
            goto L_0x0060
        L_0x006c:
            java.util.concurrent.ConcurrentHashMap r1 = r5.A07     // Catch:{ all -> 0x0096 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0096 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0067
        L_0x0076:
            r0 = r5
            X.0zN r0 = (X.C21520zN) r0     // Catch:{ all -> 0x0096 }
            X.0yC r0 = r0.A00     // Catch:{ all -> 0x0096 }
            X.0wy r0 = r0.A00     // Catch:{ all -> 0x0096 }
            goto L_0x0039
        L_0x007e:
            return r2
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "Unknown BooleanField: "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0096 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0096 }
            r0.<init>(r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20800yB.A01(X.0yV, X.0yB, int):boolean");
    }

    public float A06(C21000yV r5, int i) {
        C20070wy r0;
        float f;
        ConcurrentHashMap concurrentHashMap;
        Number number = (Number) A08(r5, i);
        if (number != null) {
            return number.floatValue();
        }
        synchronized (this) {
            Float f2 = (Float) A08(r5, i);
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_expo_key");
                A0D(sb.toString());
                if (this instanceof C20810yC) {
                    r0 = ((C20810yC) this).A01;
                } else {
                    r0 = ((C21520zN) this).A00.A01;
                }
                Integer valueOf = Integer.valueOf(i);
                Float f3 = (Float) r0.get(valueOf);
                if (f3 != null) {
                    f = this.A06.getFloat(Integer.toString(i), f3.floatValue());
                    if (this instanceof C21520zN) {
                        concurrentHashMap = ((C21520zN) this).A01;
                    } else {
                        concurrentHashMap = this.A08;
                    }
                    concurrentHashMap.put(valueOf, Float.valueOf(f));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown FloatField: ");
                    sb2.append(i);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        return f;
    }
}
