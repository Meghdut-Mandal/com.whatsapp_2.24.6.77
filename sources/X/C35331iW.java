package X;

import android.content.Context;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.1iW  reason: invalid class name and case insensitive filesystem */
public class C35331iW implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C35331iW(FirebaseInstanceId firebaseInstanceId, C19350un r6, long j) {
        this.A04 = 0;
        this.A02 = firebaseInstanceId;
        this.A03 = r6;
        this.A00 = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) A00().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A01 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context A00() {
        C18960u7 r0 = ((FirebaseInstanceId) this.A02).A01;
        C18960u7.A02(r0);
        return r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r6 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0206, code lost:
        if (r6 == 83) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020a, code lost:
        if (r6 != 85) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0212, code lost:
        if (r7.equals("U") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0214, code lost:
        r6 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C19270uf.A01(r9), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0220, code lost:
        if (r3.A0A(r6) != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0222, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r10 = r3.A06;
        r12 = r6.A01;
        r11 = new android.os.Bundle();
        r6 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0239, code lost:
        if (r6.length() == 0) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023b, code lost:
        r6 = "/topics/".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023f, code lost:
        r11.putString("gcm.topic", r6);
        r11.putString("delete", "1");
        r6 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0253, code lost:
        if (r6.length() == 0) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0255, code lost:
        r0 = "/topics/".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0259, code lost:
        com.google.firebase.iid.FirebaseInstanceId.A01(X.C19310uj.A00(r11, r10, r13, r12, r0).continueWith(r10.A04, new X.C141506nM(r10)).continueWith(X.C112985eo.A00, new X.C141496nL()), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x027a, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A05() == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027c, code lost:
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0283, code lost:
        r0 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0289, code lost:
        r6 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0295, code lost:
        if (r7.equals("S") == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0297, code lost:
        r6 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C19270uf.A01(r9), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a3, code lost:
        if (r3.A0A(r6) != false) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a5, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r12 = r6.A01;
        r10 = r3.A06;
        r11 = new android.os.Bundle();
        r6 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bc, code lost:
        if (r6.length() == 0) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02be, code lost:
        r6 = "/topics/".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c2, code lost:
        r11.putString("gcm.topic", r6);
        r6 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02cf, code lost:
        if (r6.length() == 0) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d1, code lost:
        r0 = "/topics/".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d5, code lost:
        com.google.firebase.iid.FirebaseInstanceId.A01(X.C19310uj.A00(r11, r10, r13, r12, r0).continueWith(r10.A04, new X.C141506nM(r10)).continueWith(X.C112985eo.A00, new X.C141496nL()), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f6, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A05() == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f8, code lost:
        android.util.Log.d("FirebaseInstanceId", "subscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02fe, code lost:
        r0 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0304, code lost:
        r6 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r6 = (com.google.android.gms.tasks.TaskCompletionSource) r1.A02.remove(java.lang.Integer.valueOf(r1.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r7 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031b, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r11 = r7.A01;
        r12 = r11.getString("topic_operation_queue", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r14 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0330, code lost:
        if (r14.length() == 0) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0332, code lost:
        r0 = ",".concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033a, code lost:
        if (r12.startsWith(r0) == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033c, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0344, code lost:
        if (r2.length() == 0) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0346, code lost:
        r0 = ",".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0353, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0359, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r11.edit().putString("topic_operation_queue", r12.substring(r0.length())).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r1.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0371, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0372, code lost:
        if (r6 == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r6.setResult((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r1 = new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0382, code lost:
        r1 = new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0389, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x038a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0395, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r2.getMessage()) != false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03a7, code lost:
        if (r2.getMessage() == null) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a9, code lost:
        r0 = "Topic operation failed without exception message. Will retry Topic operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ad, code lost:
        r2 = r2.getMessage();
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 53);
        r1.append("Topic operation failed: ");
        r1.append(r2);
        r1.append(". Will retry Topic operation.");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r4 == -1206) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03e4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0411, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r2 = r0.getMessage();
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 93);
        r1.append("Topic sync or token retrieval failed on hard failure exceptions: ");
        r1.append(r2);
        r1.append(". Won't retry the operation.");
        android.util.Log.e("FirebaseInstanceId", r1.toString());
        ((com.google.firebase.iid.FirebaseInstanceId) r15.A02).A09(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04c5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04d2, code lost:
        if (X.C19440v3.A00().A01(A00()) != false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d4, code lost:
        ((android.os.PowerManager.WakeLock) r15.A01).release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04db, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r10 = r2.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fa, code lost:
        if (r10.length != 2) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fc, code lost:
        r7 = r10[0];
        r14 = r10[1];
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A04
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0458;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0488;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r15.A01
            X.1Zr r6 = (X.C30221Zr) r6
            java.lang.Object r3 = r15.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            long r0 = r15.A00
            java.lang.Object r8 = r15.A03
            X.630 r8 = (X.AnonymousClass630) r8
            X.13u r2 = com.whatsapp.jid.DeviceJid.Companion
            if (r3 == 0) goto L_0x0083
            com.whatsapp.jid.DeviceJid r2 = r3.getPrimaryDevice()
        L_0x001b:
            X.C18740tg.A06(r2)
            X.6EZ r4 = X.C133256Xm.A02(r2)
            X.8dv r2 = X.C177518dv.A00
            java.lang.String r2 = r2.getRawString()
            X.6EU r7 = new X.6EU
            r7.<init>(r4, r2)
            X.189 r5 = r6.A00
            byte[] r4 = r8.A02
            X.6sq r2 = new X.6sq
            r2.<init>(r3, r6, r0)
            X.6Nt r0 = r5.A08(r2, r7, r4)
            int r4 = r0.A00
            if (r4 == 0) goto L_0x0082
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "axolotl error while decrypt-group-using-fast-fatchet; status="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r4 == r0) goto L_0x006b
            r0 = -1203(0xfffffffffffffb4d, float:NaN)
            if (r4 == r0) goto L_0x006b
            r0 = -1202(0xfffffffffffffb4e, float:NaN)
            if (r4 == r0) goto L_0x006b
            r0 = -1204(0xfffffffffffffb4c, float:NaN)
            if (r4 == r0) goto L_0x006b
            r0 = -1205(0xfffffffffffffb4b, float:NaN)
            if (r4 == r0) goto L_0x006b
            r1 = -1206(0xfffffffffffffb4a, float:NaN)
            r0 = 0
            if (r4 != r1) goto L_0x006c
        L_0x006b:
            r0 = 1
        L_0x006c:
            r2 = 0
            if (r0 != 0) goto L_0x0073
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r4 != r0) goto L_0x0082
        L_0x0073:
            X.1P5 r1 = r6.A01
            X.18l r0 = r5.A07
            int r0 = r0.A03()
            byte[] r0 = X.C203239na.A02(r0)
            r1.A0Y(r3, r0, r2)
        L_0x0082:
            return
        L_0x0083:
            r2 = 0
            goto L_0x001b
        L_0x0085:
            X.0v3 r1 = X.C19440v3.A00()
            android.content.Context r0 = r15.A00()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r15.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.acquire()
        L_0x009a:
            r4 = 0
            java.lang.Object r3 = r15.A02     // Catch:{ IOException -> 0x0411 }
            com.google.firebase.iid.FirebaseInstanceId r3 = (com.google.firebase.iid.FirebaseInstanceId) r3     // Catch:{ IOException -> 0x0411 }
            r0 = 1
            r3.A09(r0)     // Catch:{ IOException -> 0x0411 }
            X.0uf r0 = r3.A03     // Catch:{ IOException -> 0x0411 }
            int r0 = r0.A04()     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x040d
            X.0v3 r2 = X.C19440v3.A00()     // Catch:{ IOException -> 0x0411 }
            android.content.Context r1 = r15.A00()     // Catch:{ IOException -> 0x0411 }
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r1 = r1.checkCallingOrSelfPermission(r0)     // Catch:{ IOException -> 0x0411 }
            r0 = 0
            if (r1 != 0) goto L_0x00c1
            r0 = 1
        L_0x00c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0411 }
            r2.A01 = r0     // Catch:{ IOException -> 0x0411 }
        L_0x00c7:
            java.lang.Boolean r0 = r2.A00     // Catch:{ IOException -> 0x0411 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x00dd
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x0411 }
        L_0x00dd:
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x0411 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x00ff
            android.content.Context r1 = r15.A00()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ IOException -> 0x0411 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x03ea
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x03ea
            boolean r0 = r0.isConnected()     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x03ea
        L_0x00ff:
            java.lang.String r5 = "FirebaseInstanceId"
            X.0u7 r9 = r3.A01     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = X.C19270uf.A01(r9)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r8 = "*"
            X.6KS r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r8)     // Catch:{ IOException -> 0x0411 }
            boolean r0 = r3.A0A(r1)     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = X.C19270uf.A01(r9)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            java.lang.String r6 = r3.A06(r0, r8)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            if (r6 != 0) goto L_0x0124
            java.lang.String r0 = "Token retrieval failed: null"
            android.util.Log.e(r5, r0)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            goto L_0x03d7
        L_0x0124:
            r2 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r2)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "Token successfully retrieved"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
        L_0x0130:
            if (r1 == 0) goto L_0x013a
            java.lang.String r0 = r1.A01     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            boolean r0 = r6.equals(r0)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            if (r0 != 0) goto L_0x01d7
        L_0x013a:
            java.lang.String r0 = "[DEFAULT]"
            X.C18960u7.A02(r9)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            java.lang.String r1 = r9.A04     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            if (r0 == 0) goto L_0x01d7
            boolean r0 = android.util.Log.isLoggable(r5, r2)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r2 = "Invoking onNewToken for app: "
            X.C18960u7.A02(r9)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            int r0 = r1.length()     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = r2.concat(r1)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
        L_0x0160:
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
        L_0x0163:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            android.content.Intent r7 = new android.content.Intent     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            java.lang.String r0 = "token"
            r7.putExtra(r0, r6)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            android.content.Context r6 = r15.A00()     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            r1.setAction(r2)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            java.lang.String r0 = "wrapped_intent"
            r1.putExtra(r0, r7)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            r6.sendBroadcast(r1)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            goto L_0x01d7
        L_0x0188:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x018e, SecurityException -> 0x03d2 }
            goto L_0x0160
        L_0x018e:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x01d3
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x03ac
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0411 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0411 }
            int r0 = r0 + 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0411 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "Token retrieval failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x0411 }
            r1.append(r2)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = ". Will retry token retrieval"
            r1.append(r0)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0411 }
            goto L_0x03d4
        L_0x01d3:
            java.lang.String r0 = "Token retrieval failed without exception message. Will retry token retrieval"
            goto L_0x03d4
        L_0x01d7:
            java.lang.Object r1 = r15.A03     // Catch:{ IOException -> 0x0411 }
            X.0un r1 = (X.C19350un) r1     // Catch:{ IOException -> 0x0411 }
        L_0x01db:
            monitor-enter(r1)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r2 = X.C19350un.A00(r1)     // Catch:{ all -> 0x03e7 }
            r11 = 1
            if (r2 != 0) goto L_0x01f1
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A05()     // Catch:{ all -> 0x03e7 }
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x03e7 }
        L_0x01ee:
            monitor-exit(r1)     // Catch:{ all -> 0x03e7 }
            goto L_0x040d
        L_0x01f1:
            monitor-exit(r1)     // Catch:{ all -> 0x03e7 }
            java.lang.String r0 = "!"
            java.lang.String[] r10 = r2.split(r0)     // Catch:{ IOException -> 0x0411 }
            int r6 = r10.length     // Catch:{ IOException -> 0x0411 }
            r0 = 2
            if (r6 != r0) goto L_0x030a
            r7 = r10[r4]     // Catch:{ IOException -> 0x0411 }
            r14 = r10[r11]     // Catch:{ IOException -> 0x0411 }
            int r6 = r7.hashCode()     // Catch:{ IOException -> 0x038a }
            r0 = 83
            if (r6 == r0) goto L_0x028f
            r0 = 85
            if (r6 != r0) goto L_0x030a
            java.lang.String r0 = "U"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = X.C19270uf.A01(r9)     // Catch:{ IOException -> 0x038a }
            X.6KS r6 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r8)     // Catch:{ IOException -> 0x038a }
            boolean r0 = r3.A0A(r6)     // Catch:{ IOException -> 0x038a }
            if (r0 != 0) goto L_0x037a
            java.lang.String r13 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x038a }
            X.0uj r10 = r3.A06     // Catch:{ IOException -> 0x038a }
            java.lang.String r12 = r6.A01     // Catch:{ IOException -> 0x038a }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ IOException -> 0x038a }
            r11.<init>()     // Catch:{ IOException -> 0x038a }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x038a }
            int r0 = r6.length()     // Catch:{ IOException -> 0x038a }
            java.lang.String r7 = "/topics/"
            if (r0 == 0) goto L_0x0289
            java.lang.String r6 = r7.concat(r6)     // Catch:{ IOException -> 0x038a }
        L_0x023f:
            java.lang.String r0 = "gcm.topic"
            r11.putString(r0, r6)     // Catch:{ IOException -> 0x038a }
            java.lang.String r6 = "delete"
            java.lang.String r0 = "1"
            r11.putString(r6, r0)     // Catch:{ IOException -> 0x038a }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x038a }
            int r0 = r6.length()     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x0283
            java.lang.String r0 = r7.concat(r6)     // Catch:{ IOException -> 0x038a }
        L_0x0259:
            com.google.android.gms.tasks.zzw r7 = X.C19310uj.A00(r11, r10, r13, r12, r0)     // Catch:{ IOException -> 0x038a }
            java.util.concurrent.Executor r6 = r10.A04     // Catch:{ IOException -> 0x038a }
            X.6nM r0 = new X.6nM     // Catch:{ IOException -> 0x038a }
            r0.<init>(r10)     // Catch:{ IOException -> 0x038a }
            com.google.android.gms.tasks.Task r7 = r7.continueWith(r6, r0)     // Catch:{ IOException -> 0x038a }
            java.util.concurrent.Executor r6 = X.C112985eo.A00     // Catch:{ IOException -> 0x038a }
            X.6nL r0 = new X.6nL     // Catch:{ IOException -> 0x038a }
            r0.<init>()     // Catch:{ IOException -> 0x038a }
            com.google.android.gms.tasks.Task r0 = r7.continueWith(r6, r0)     // Catch:{ IOException -> 0x038a }
            com.google.firebase.iid.FirebaseInstanceId.A01(r0, r3)     // Catch:{ IOException -> 0x038a }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A05()     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = "unsubscribe operation succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x038a }
            goto L_0x030a
        L_0x0283:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x038a }
            r0.<init>(r7)     // Catch:{ IOException -> 0x038a }
            goto L_0x0259
        L_0x0289:
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x038a }
            r6.<init>(r7)     // Catch:{ IOException -> 0x038a }
            goto L_0x023f
        L_0x028f:
            java.lang.String r0 = "S"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = X.C19270uf.A01(r9)     // Catch:{ IOException -> 0x038a }
            X.6KS r6 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r8)     // Catch:{ IOException -> 0x038a }
            boolean r0 = r3.A0A(r6)     // Catch:{ IOException -> 0x038a }
            if (r0 != 0) goto L_0x0382
            java.lang.String r13 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x038a }
            java.lang.String r12 = r6.A01     // Catch:{ IOException -> 0x038a }
            X.0uj r10 = r3.A06     // Catch:{ IOException -> 0x038a }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ IOException -> 0x038a }
            r11.<init>()     // Catch:{ IOException -> 0x038a }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x038a }
            int r0 = r6.length()     // Catch:{ IOException -> 0x038a }
            java.lang.String r7 = "/topics/"
            if (r0 == 0) goto L_0x0304
            java.lang.String r6 = r7.concat(r6)     // Catch:{ IOException -> 0x038a }
        L_0x02c2:
            java.lang.String r0 = "gcm.topic"
            r11.putString(r0, r6)     // Catch:{ IOException -> 0x038a }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x038a }
            int r0 = r6.length()     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x02fe
            java.lang.String r0 = r7.concat(r6)     // Catch:{ IOException -> 0x038a }
        L_0x02d5:
            com.google.android.gms.tasks.zzw r7 = X.C19310uj.A00(r11, r10, r13, r12, r0)     // Catch:{ IOException -> 0x038a }
            java.util.concurrent.Executor r6 = r10.A04     // Catch:{ IOException -> 0x038a }
            X.6nM r0 = new X.6nM     // Catch:{ IOException -> 0x038a }
            r0.<init>(r10)     // Catch:{ IOException -> 0x038a }
            com.google.android.gms.tasks.Task r7 = r7.continueWith(r6, r0)     // Catch:{ IOException -> 0x038a }
            java.util.concurrent.Executor r6 = X.C112985eo.A00     // Catch:{ IOException -> 0x038a }
            X.6nL r0 = new X.6nL     // Catch:{ IOException -> 0x038a }
            r0.<init>()     // Catch:{ IOException -> 0x038a }
            com.google.android.gms.tasks.Task r0 = r7.continueWith(r6, r0)     // Catch:{ IOException -> 0x038a }
            com.google.firebase.iid.FirebaseInstanceId.A01(r0, r3)     // Catch:{ IOException -> 0x038a }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A05()     // Catch:{ IOException -> 0x038a }
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = "subscribe operation succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x038a }
            goto L_0x030a
        L_0x02fe:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x038a }
            r0.<init>(r7)     // Catch:{ IOException -> 0x038a }
            goto L_0x02d5
        L_0x0304:
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x038a }
            r6.<init>(r7)     // Catch:{ IOException -> 0x038a }
            goto L_0x02c2
        L_0x030a:
            monitor-enter(r1)     // Catch:{ IOException -> 0x0411 }
            java.util.Map r6 = r1.A02     // Catch:{ all -> 0x03e4 }
            int r0 = r1.A00     // Catch:{ all -> 0x03e4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03e4 }
            java.lang.Object r6 = r6.remove(r0)     // Catch:{ all -> 0x03e4 }
            com.google.android.gms.tasks.TaskCompletionSource r6 = (com.google.android.gms.tasks.TaskCompletionSource) r6     // Catch:{ all -> 0x03e4 }
            X.0uh r7 = r1.A01     // Catch:{ all -> 0x03e2 }
            monitor-enter(r7)     // Catch:{ all -> 0x03e2 }
            android.content.SharedPreferences r11 = r7.A01     // Catch:{ all -> 0x03dd }
            java.lang.String r10 = "topic_operation_queue"
            java.lang.String r0 = ""
            java.lang.String r12 = r11.getString(r10, r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r13 = ","
            java.lang.String r14 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x03df }
            int r0 = r14.length()     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = r13.concat(r14)     // Catch:{ all -> 0x03df }
        L_0x0336:
            boolean r0 = r12.startsWith(r0)     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x036a
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x03df }
            int r0 = r2.length()     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x0353
            java.lang.String r0 = r13.concat(r2)     // Catch:{ all -> 0x03df }
        L_0x034a:
            int r0 = r0.length()     // Catch:{ all -> 0x03df }
            java.lang.String r2 = r12.substring(r0)     // Catch:{ all -> 0x03df }
            goto L_0x035f
        L_0x0353:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x03df }
            r0.<init>(r13)     // Catch:{ all -> 0x03df }
            goto L_0x034a
        L_0x0359:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x03df }
            r0.<init>(r13)     // Catch:{ all -> 0x03df }
            goto L_0x0336
        L_0x035f:
            android.content.SharedPreferences$Editor r0 = r11.edit()     // Catch:{ all -> 0x03dd }
            android.content.SharedPreferences$Editor r0 = r0.putString(r10, r2)     // Catch:{ all -> 0x03dd }
            r0.apply()     // Catch:{ all -> 0x03dd }
        L_0x036a:
            monitor-exit(r7)     // Catch:{ all -> 0x03df }
            int r0 = r1.A00     // Catch:{ all -> 0x03e4 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x03e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x03e4 }
            if (r6 == 0) goto L_0x01db
            r0 = 0
            r6.setResult(r0)     // Catch:{ IOException -> 0x0411 }
            goto L_0x01db
        L_0x037a:
            java.lang.String r0 = "token not available"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x038a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x038a }
            goto L_0x0389
        L_0x0382:
            java.lang.String r0 = "token not available"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x038a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x038a }
        L_0x0389:
            throw r1     // Catch:{ IOException -> 0x038a }
        L_0x038a:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x03ad
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x03ad
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            if (r0 != 0) goto L_0x03ac
            java.lang.String r0 = "Topic operation failed without exception message. Will retry Topic operation."
            goto L_0x03d4
        L_0x03ac:
            throw r2     // Catch:{ IOException -> 0x0411 }
        L_0x03ad:
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0411 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0411 }
            int r0 = r0 + 53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0411 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = "Topic operation failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x0411 }
            r1.append(r2)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = ". Will retry Topic operation."
            r1.append(r0)     // Catch:{ IOException -> 0x0411 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0411 }
            goto L_0x03d4
        L_0x03d2:
            java.lang.String r0 = "Token retrieval failed with SecurityException. Will retry token retrieval"
        L_0x03d4:
            android.util.Log.e(r5, r0)     // Catch:{ IOException -> 0x0411 }
        L_0x03d7:
            long r0 = r15.A00     // Catch:{ IOException -> 0x0411 }
            r3.A08(r0)     // Catch:{ IOException -> 0x0411 }
            goto L_0x0442
        L_0x03dd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03df }
        L_0x03df:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x03df }
            throw r0     // Catch:{ all -> 0x03e2 }
        L_0x03e2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03e4 }
        L_0x03e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03e4 }
            goto L_0x03e9
        L_0x03e7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03e7 }
        L_0x03e9:
            throw r0     // Catch:{ IOException -> 0x0411 }
        L_0x03ea:
            X.4ay r2 = new X.4ay     // Catch:{ IOException -> 0x0411 }
            r2.<init>(r15)     // Catch:{ IOException -> 0x0411 }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A05()     // Catch:{ IOException -> 0x0411 }
            if (r0 == 0) goto L_0x03fc
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Connectivity change received registered"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x0411 }
        L_0x03fc:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ IOException -> 0x0411 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0411 }
            X.1iW r0 = r2.A00     // Catch:{ IOException -> 0x0411 }
            android.content.Context r0 = r0.A00()     // Catch:{ IOException -> 0x0411 }
            r0.registerReceiver(r2, r1)     // Catch:{ IOException -> 0x0411 }
            goto L_0x0442
        L_0x040d:
            r3.A09(r4)     // Catch:{ IOException -> 0x0411 }
            goto L_0x0442
        L_0x0411:
            r0 = move-exception
            java.lang.String r3 = "FirebaseInstanceId"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x04c5 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x04c5 }
            int r0 = r0.length()     // Catch:{ all -> 0x04c5 }
            int r0 = r0 + 93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c5 }
            r1.<init>(r0)     // Catch:{ all -> 0x04c5 }
            java.lang.String r0 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r1.append(r0)     // Catch:{ all -> 0x04c5 }
            r1.append(r2)     // Catch:{ all -> 0x04c5 }
            java.lang.String r0 = ". Won't retry the operation."
            r1.append(r0)     // Catch:{ all -> 0x04c5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04c5 }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x04c5 }
            java.lang.Object r0 = r15.A02     // Catch:{ all -> 0x04c5 }
            com.google.firebase.iid.FirebaseInstanceId r0 = (com.google.firebase.iid.FirebaseInstanceId) r0     // Catch:{ all -> 0x04c5 }
            r0.A09(r4)     // Catch:{ all -> 0x04c5 }
        L_0x0442:
            X.0v3 r1 = X.C19440v3.A00()
            android.content.Context r0 = r15.A00()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r15.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
            return
        L_0x0458:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r0
            java.lang.Object r2 = r15.A02
            android.content.Context r2 = (android.content.Context) r2
            long r12 = r15.A00
            java.lang.Object r10 = r15.A03
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10
            X.0wo r6 = r0.A0Q
            X.17Y r3 = r0.A09
            X.1ND r4 = r0.A0G
            X.1HJ r7 = r0.A0S
            X.1Jh r9 = r0.A0V
            X.1HO r8 = r0.A0U
            X.005 r0 = r0.A0l
            java.lang.Object r1 = r0.get()
            X.0y9 r1 = (X.C20780y9) r1
            java.lang.Class<X.0xi> r0 = X.C20530xi.class
            X.00M r5 = r1.A01(r0)
            X.0xi r5 = (X.C20530xi) r5
            r11 = 19
            X.AnonymousClass3UL.A05(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0488:
            java.lang.Object r5 = r15.A01
            X.1SL r5 = (X.AnonymousClass1SL) r5
            java.lang.Object r6 = r15.A02
            X.1Uw r6 = (X.C28981Uw) r6
            long r0 = r15.A00
            java.lang.Object r3 = r15.A03
            X.00S r3 = (X.AnonymousClass00S) r3
            r2 = 3
            X.AnonymousClass00C.A0D(r3, r2)
            X.1SM r2 = r5.A07
            X.3T1 r2 = r2.A02(r6, r0)
            if (r2 == 0) goto L_0x04a6
            r3.invoke()
            return
        L_0x04a6:
            r2 = 1
            X.4Zz r7 = new X.4Zz
            r7.<init>(r3, r2)
            r2 = 25
            long r0 = r0 - r2
            r3 = 99
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x04b7
            r0 = 99
        L_0x04b7:
            X.1TZ r5 = r5.A09
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r12 = 0
            r10 = 50
            r5.A01(r6, r7, r8, r9, r10, r12)
            return
        L_0x04c5:
            r2 = move-exception
            X.0v3 r1 = X.C19440v3.A00()
            android.content.Context r0 = r15.A00()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x04db
            java.lang.Object r0 = r15.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
        L_0x04db:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35331iW.run():void");
    }

    public C35331iW(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = j;
        this.A03 = obj3;
    }
}
