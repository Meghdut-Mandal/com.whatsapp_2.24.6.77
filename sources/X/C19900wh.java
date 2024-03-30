package X;

import android.content.SharedPreferences;

/* renamed from: X.0wh  reason: invalid class name and case insensitive filesystem */
public class C19900wh {
    public C19960wn A00 = C19960wn.A01;
    public final SharedPreferences A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r2.put("version", java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r2.put("registration_state", java.lang.Integer.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r2.put("force_db_check", java.lang.Boolean.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r1 = java.lang.Integer.class;
        r2.put("companion_registration_state", r1);
        r2.put("registration_device_id", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        r2.put("forced_language", java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        r1 = java.lang.Integer.class;
        r2.put("profile_photo_thumb_id", r1);
        r2.put("profile_photo_full_id", r1);
        r2.put("push_name", java.lang.String.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        r2.put("async_tasks_pending_for_version_change", java.lang.Boolean.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        r5 = java.lang.Integer.class;
        r2.put("night_mode", r5);
        r1 = new java.lang.StringBuilder();
        r1.append("WaStartupSharedPreferences/added ");
        r1.append(r2.size());
        r1.append(" keys");
        com.whatsapp.util.Log.i(r1.toString());
        r12 = r2.entrySet().iterator();
        r4 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c3, code lost:
        if (r12.hasNext() == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
        r1 = (java.util.Map.Entry) r12.next();
        r2 = (java.lang.String) r1.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
        if (r10.contains(r2) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00db, code lost:
        if (r6.contains(r2) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        if (r4 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00df, code lost:
        r4 = r6.edit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e3, code lost:
        r11 = (java.lang.Class) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ec, code lost:
        if (r11 != java.lang.Boolean.class) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ee, code lost:
        r4.putBoolean(r2, r10.getBoolean(r2, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        if (r11 != r5) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f8, code lost:
        r4.putInt(r2, r10.getInt(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0102, code lost:
        if (r11 != java.lang.Float.class) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0104, code lost:
        r4.putFloat(r2, r10.getFloat(r2, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
        if (r11 != java.lang.Long.class) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r4.putLong(r2, r10.getLong(r2, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011d, code lost:
        if (r11 != java.lang.String.class) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        r4.putString(r2, r10.getString(r2, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        if (java.util.Set.class.isAssignableFrom(r11) == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        r4.putStringSet(r2, r10.getStringSet(r2, (java.util.Set) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0136, code lost:
        if (r3 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0138, code lost:
        r3 = r10.edit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013c, code lost:
        r3.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0140, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Cannot access value of type ");
        r1.append(r11);
        r1 = new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015f, code lost:
        if (r4 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0161, code lost:
        r4.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0164, code lost:
        if (r3 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0166, code lost:
        r3.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0169, code lost:
        r6.edit().putInt("startup_migrated_version", 9).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19900wh(X.C19890wg r14) {
        /*
            r13 = this;
            java.lang.String r0 = "startup_prefs"
            android.content.SharedPreferences r2 = r14.A00(r0)
            r9 = 0
            r8 = 9
            r13.<init>()
            X.0wn r0 = X.C19960wn.A01
            r13.A00 = r0
            r13.A01 = r2
            java.lang.String r7 = "startup_migrated_version"
            r1 = 0
            int r0 = r2.getInt(r7, r1)     // Catch:{ all -> 0x0175 }
            if (r0 >= r8) goto L_0x0174
            android.content.SharedPreferences r0 = r13.A01     // Catch:{ all -> 0x0175 }
            r0.getInt(r7, r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = X.C19420v0.A05     // Catch:{ all -> 0x0175 }
            android.content.SharedPreferences r10 = r14.A00(r0)     // Catch:{ all -> 0x0175 }
            if (r10 == 0) goto L_0x0174
            android.content.SharedPreferences r6 = r13.A01     // Catch:{ all -> 0x0175 }
            int r0 = r6.getInt(r7, r1)     // Catch:{ all -> 0x0175 }
            if (r0 >= r8) goto L_0x0174
            int r0 = r6.getInt(r7, r1)     // Catch:{ all -> 0x0175 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0175 }
            r2.<init>()     // Catch:{ all -> 0x0175 }
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x004f;
                case 2: goto L_0x0056;
                case 3: goto L_0x005d;
                case 4: goto L_0x0064;
                case 5: goto L_0x0070;
                case 6: goto L_0x0077;
                case 7: goto L_0x008a;
                case 8: goto L_0x0091;
                default: goto L_0x003c;
            }     // Catch:{ all -> 0x0175 }
        L_0x003c:
            goto L_0x0157
        L_0x003e:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.String r0 = "client_server_time_diff"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "client_ntp_time_diff"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "last_ntp_client_time"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x004f:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "version"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x0056:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.String r0 = "registration_state"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x005d:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.String r0 = "force_db_check"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x0064:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.String r0 = "companion_registration_state"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "registration_device_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x0070:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "forced_language"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x0077:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.String r0 = "profile_photo_thumb_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "profile_photo_full_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "push_name"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x008a:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.String r0 = "async_tasks_pending_for_version_change"
            r2.put(r0, r1)     // Catch:{ all -> 0x0175 }
        L_0x0091:
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            java.lang.String r0 = "night_mode"
            r2.put(r0, r5)     // Catch:{ all -> 0x0175 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r1.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "WaStartupSharedPreferences/added "
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            int r0 = r2.size()     // Catch:{ all -> 0x0175 }
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = " keys"
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0175 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0175 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x0175 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0175 }
            r4 = 0
            r3 = r9
        L_0x00bf:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x015f
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0175 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0175 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0175 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0175 }
            boolean r0 = r10.contains(r2)     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r6.contains(r2)     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x0136
            if (r4 != 0) goto L_0x00e3
            android.content.SharedPreferences$Editor r4 = r6.edit()     // Catch:{ all -> 0x0175 }
        L_0x00e3:
            java.lang.Object r11 = r1.getValue()     // Catch:{ all -> 0x0175 }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x0175 }
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            r0 = 0
            if (r11 != r1) goto L_0x00f6
            boolean r0 = r10.getBoolean(r2, r0)     // Catch:{ all -> 0x0175 }
            r4.putBoolean(r2, r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0136
        L_0x00f6:
            if (r11 != r5) goto L_0x0100
            int r0 = r10.getInt(r2, r0)     // Catch:{ all -> 0x0175 }
            r4.putInt(r2, r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0136
        L_0x0100:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r11 != r0) goto L_0x010d
            r0 = 0
            float r0 = r10.getFloat(r2, r0)     // Catch:{ all -> 0x0175 }
            r4.putFloat(r2, r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0136
        L_0x010d:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r11 != r0) goto L_0x011b
            r0 = 0
            long r0 = r10.getLong(r2, r0)     // Catch:{ all -> 0x0175 }
            r4.putLong(r2, r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0136
        L_0x011b:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r11 != r0) goto L_0x0127
            java.lang.String r0 = r10.getString(r2, r9)     // Catch:{ all -> 0x0175 }
            r4.putString(r2, r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0136
        L_0x0127:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r11)     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0140
            java.util.Set r0 = r10.getStringSet(r2, r9)     // Catch:{ all -> 0x0175 }
            r4.putStringSet(r2, r0)     // Catch:{ all -> 0x0175 }
        L_0x0136:
            if (r3 != 0) goto L_0x013c
            android.content.SharedPreferences$Editor r3 = r10.edit()     // Catch:{ all -> 0x0175 }
        L_0x013c:
            r3.remove(r2)     // Catch:{ all -> 0x0175 }
            goto L_0x00bf
        L_0x0140:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r1.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = "Cannot access value of type "
            r1.append(r0)     // Catch:{ all -> 0x0175 }
            r1.append(r11)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0175 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0175 }
            r1.<init>(r0)     // Catch:{ all -> 0x0175 }
            goto L_0x015e
        L_0x0157:
            java.lang.String r0 = "Version bump required"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0175 }
            r1.<init>(r0)     // Catch:{ all -> 0x0175 }
        L_0x015e:
            throw r1     // Catch:{ all -> 0x0175 }
        L_0x015f:
            if (r4 == 0) goto L_0x0164
            r4.commit()     // Catch:{ all -> 0x0175 }
        L_0x0164:
            if (r3 == 0) goto L_0x0169
            r3.commit()     // Catch:{ all -> 0x0175 }
        L_0x0169:
            android.content.SharedPreferences$Editor r0 = r6.edit()     // Catch:{ all -> 0x0175 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r7, r8)     // Catch:{ all -> 0x0175 }
            r0.apply()     // Catch:{ all -> 0x0175 }
        L_0x0174:
            return
        L_0x0175:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19900wh.<init>(X.0wg):void");
    }

    public int A00() {
        C19960wn r3 = this.A00;
        SharedPreferences sharedPreferences = this.A01;
        int i = 1;
        if (C19550w8.A06()) {
            i = -1;
        }
        Object valueOf = Integer.valueOf(sharedPreferences.getInt("night_mode", i));
        Object obj = r3.A00;
        if (obj != null) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public String A01() {
        return this.A01.getString("forced_language", (String) null);
    }

    public String A02() {
        return this.A01.getString("push_name", "");
    }

    public boolean A03() {
        return this.A01.getBoolean("run_on_connect_tasks_for_version_change", false);
    }
}
