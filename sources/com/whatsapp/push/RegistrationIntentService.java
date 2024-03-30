package com.whatsapp.push;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass0DY;
import X.AnonymousClass6R8;
import X.C111515cP;
import X.C18700tb;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19700wN;
import X.C19970wo;
import X.C20810yC;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C39171rR;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;

public class RegistrationIntentService extends C39171rR implements C18700tb {
    public C19700wN A00;
    public C19970wo A01;
    public C20810yC A02;
    public AnonymousClass005 A03;
    public AnonymousClass005 A04;
    public AnonymousClass005 A05;
    public AnonymousClass005 A06;
    public AnonymousClass005 A07;
    public AnonymousClass005 A08;
    public AnonymousClass005 A09;
    public AnonymousClass005 A0A;
    public AnonymousClass005 A0B;
    public boolean A0C;
    public C111515cP A0D;
    public final Object A0E;
    public volatile C31091bG A0F;

    private synchronized void A01() {
        if (this.A0D == null) {
            this.A0D = new C111515cP();
        }
    }

    public static void A02(Context context) {
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        Log.i("GCM: force replacing gcm token");
        AnonymousClass0DY.A00(context, new Intent("com.whatsapp.action.FORCE_REPLACE", (Uri) null, context, cls), cls, 4);
    }

    public static void A03(Context context) {
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        Log.i("GCM: refreshing gcm token");
        AnonymousClass0DY.A00(context, new Intent("com.whatsapp.action.REFRESH", (Uri) null, context, cls), cls, 4);
    }

    public static void A04(Context context) {
        Log.i("GCM: force updating push config");
        A05(context, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public static void A05(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        Class<RegistrationIntentService> cls = RegistrationIntentService.class;
        C36321k7.A1Q("GCM: verifying registration; serverRegistrationId=", str, AnonymousClass000.A0u());
        Intent intent = new Intent("com.whatsapp.action.VERIFY", (Uri) null, context, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("registrationId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("mutedChatsHash", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("appMuteConfig", str3);
        }
        intent.putExtra("numberOfAccountsFromServer", AnonymousClass6R8.A00(str4, 1));
        if (!TextUtils.isEmpty(str5)) {
            intent.putExtra("pKeyHash", str5);
        }
        intent.putExtra("voipPayloadType", AnonymousClass6R8.A00(str6, 0));
        AnonymousClass0DY.A00(context, intent, cls, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029e, code lost:
        if (r1 != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a0, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a1, code lost:
        if (r23 != false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a3, code lost:
        android.os.Binder.restoreCallingIdentity(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        X.C36341k9.A0v(X.C19420v0.A00(X.C90504aG.A0O(r3)).putString("c2dm_reg_id", r7), "c2dm_app_vers", 240677001);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b6, code lost:
        if (r22 != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b8, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02bd, code lost:
        if (android.text.TextUtils.equals(r7, r12) != false) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02bf, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c0, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to new token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c5, code lost:
        if (r19 == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c7, code lost:
        if (r21 == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c9, code lost:
        if (r1 != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02da, code lost:
        if (X.C36341k9.A0E(X.C90504aG.A0O(r3)).getBoolean("saved_gcm_token_server_unreg", false) != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02dc, code lost:
        com.whatsapp.util.Log.i("GCM: verifying tokenUnregisteredOnServer fetched saved token");
        r3.A00.A0E("gcm-retrieved-saved-token", (java.lang.String) null, false);
        X.C36331k8.A18(X.C90504aG.A0O(r3), "saved_gcm_token_server_unreg", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f0, code lost:
        if (r9 != false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        if (android.text.TextUtils.isEmpty(r12) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f3, code lost:
        r1 = ((X.AnonymousClass3DK) r3.A06.get()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0303, code lost:
        if (r1.A0E(283) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030b, code lost:
        if (r1.A0E(2792) == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x030d, code lost:
        r4 = ((X.AnonymousClass3DK) r3.A06.get()).A00();
        r1 = r4.A01;
        r10 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x031d, code lost:
        if (r9 != false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x031f, code lost:
        r14 = r6.getStringExtra("mutedChatsHash");
        r8 = r6.getStringExtra("appMuteConfig");
        r0 = (X.AnonymousClass3DK) r3.A06.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0334, code lost:
        if (r14 == null) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0336, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x033b, code lost:
        if (r14.length() != 0) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x033d, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x033e, code lost:
        r15 = !r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0340, code lost:
        if (r1 == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0342, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0347, code lost:
        if (X.C36401kF.A1a(r1) != false) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0349, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034a, code lost:
        if (r15 != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x034c, code lost:
        if (r12 == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        if (r23 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0358, code lost:
        if (r0.A00.A0E(2792) == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x035a, code lost:
        if (r10 != 0) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x035c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035f, code lost:
        if (r8 == null) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0365, code lost:
        if (r8.length() != 0) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0367, code lost:
        if (r15 == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0369, code lost:
        if (r12 == false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036b, code lost:
        if (r1 == null) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r12 = X.C90504aG.A0s();
        X.AnonymousClass00C.A0B(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r11 = X.C19430v1.A0D;
        r15 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x037e, code lost:
        if (r15.hasNext() == false) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0380, code lost:
        r10 = (X.AnonymousClass3J4) r15.next();
        r0 = r10.A01.getRawString();
        X.AnonymousClass00C.A0B(r11);
        r12.update(X.C36371kC.A1Z(r0, r11));
        r0 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0398, code lost:
        if (r0 != null) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x039a, code lost:
        r0 = r10.A02.longValue();
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a4, code lost:
        if (r0 == -1) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a6, code lost:
        r18 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        if (android.text.TextUtils.equals(r12, r13) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03ac, code lost:
        r0 = java.lang.Long.valueOf(r18);
        r10.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03b2, code lost:
        r12.update(X.C36371kC.A1Z(java.lang.String.valueOf(r0.longValue()), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c2, code lost:
        r0 = new byte[6];
        java.lang.System.arraycopy(r12.digest(), 0, r0, 0, 6);
        r0 = X.C36441kJ.A13(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d0, code lost:
        if (r0 == null) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d8, code lost:
        if ((!r0.equalsIgnoreCase(r14)) == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03db, code lost:
        r0 = java.lang.String.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03e3, code lost:
        if (X.C1901797e.A00(r0, r8) != false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03e5, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to new muted chats");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03f2, code lost:
        r0 = X.C36381kD.A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03f7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03fa, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03fb, code lost:
        r1 = r6.getIntExtra("numberOfAccountsFromServer", 1);
        r8 = ((X.AnonymousClass1RU) ((X.C118945oz) r3.A03.get()).A00.get()).A09.A0I() + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x041a, code lost:
        if (r1 == r8) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        r20 = android.text.TextUtils.isEmpty(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x041c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042c, code lost:
        if (r3.A02.A07(4116) == r6.getIntExtra("voipPayloadType", 0)) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042e, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to calling push payload version");
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0434, code lost:
        r10 = (X.AnonymousClass6OJ) r3.A07.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0444, code lost:
        if (r10.A04.A07(4116) > 0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0454, code lost:
        if (((X.AnonymousClass1RU) r10.A00.A00.get()).A0B() != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0456, code lost:
        X.C36341k9.A0u(X.C90464aC.A0C(((X.AnonymousClass6OJ) r3.A07.get()).A02.A00).remove("push:push_pkey_data"), "push:push_pkey_generate_ts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0472, code lost:
        r1 = ((X.AnonymousClass6OJ) r3.A07.get()).A01(r6.getStringExtra("pKeyHash"), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        r0 = X.C36381kD.A1U(240677001, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0484, code lost:
        if (r9 != false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x048c, code lost:
        if (X.AnonymousClass000.A1X(r1.first) == false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x048e, code lost:
        com.whatsapp.util.Log.i("GCM: sending client config due to pKey rotation");
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0494, code lost:
        r2 = (java.lang.String) r1.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0498, code lost:
        if (r9 == false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04a6, code lost:
        if (((X.AnonymousClass12U) r3.A09.get()).A03() != false) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04b5, code lost:
        if (((X.AnonymousClass12U) r3.A09.get()).A00() == 2) goto L_0x04c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        if (r21 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04c6, code lost:
        if (((X.C117075lf) r3.A04.get()).A00.A00() < 7) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04c8, code lost:
        ((X.C31081bF) r3.A08.get()).A00(r4, (X.C159677jk) null, java.lang.Integer.valueOf(r8), r7, "gcm", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        if (r20 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r1 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        if (r0 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r7 == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r7 == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C36321k7.A1Q("GCM: verifying tokenUnregisteredOnServer deleting savedToken:", r13, X.AnonymousClass000.A0u());
        A01();
        r0 = ((X.AnonymousClass11l) r3.A05.get()).A00;
        X.C18740tg.A06(r0);
        r14 = (java.lang.String) r0.get();
        r8 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C18960u7.A00());
        r7 = "FCM";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d7, code lost:
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        if (r7.isEmpty() != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        if (r7.equalsIgnoreCase("fcm") != false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        if (r7.equalsIgnoreCase("gcm") == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r7 = "*";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
        r18 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r2 = r8.A06;
        r1 = X.AnonymousClass001.A07();
        r1.putString("delete", "1");
        com.google.firebase.iid.FirebaseInstanceId.A01(X.C19310uj.A00(r1, r2, r18, r14, r7).continueWith(r2.A04, new X.C141506nM(r2)).continueWith(X.C112985eo.A00, new X.C141496nL()), r8);
        r1 = com.google.firebase.iid.FirebaseInstanceId.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0123, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2 = X.C19290uh.A01(r14, r7);
        r0 = r1.A01.edit();
        r0.remove(r2);
        r0.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0 = X.C90524aI.A0X("MAIN_THREAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013e, code lost:
        X.C36331k8.A0w(X.C19420v0.A00(X.C90504aG.A0O(r3)), "saved_gcm_token_server_unreg", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014c, code lost:
        A01();
        r0 = ((X.AnonymousClass11l) r3.A05.get()).A00;
        X.C18740tg.A06(r0);
        r7 = com.google.firebase.iid.FirebaseInstanceId.getInstance(X.C18960u7.A00()).A06((java.lang.String) r0.get(), "FCM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0174, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0176, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("GCM: token retrieved successfully; token=");
        r1.append(r7.length());
        X.C36321k7.A1T(" bytes; applicationVersion=", r1, 240677001);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018b, code lost:
        if (r20 == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018d, code lost:
        com.whatsapp.util.Log.i("GCM: no previously saved token");
        X.C90504aG.A0O(r3).A1C(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019a, code lost:
        r1 = !android.text.TextUtils.equals(r7, r13);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        if (r19 != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a5, code lost:
        r0 = X.C90524aI.A0Y("GCM: empty token returned but no exception thrown");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c0, code lost:
        r0 = X.C90524aI.A0Y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0220, code lost:
        if (r1.equals("PHONE_REGISTRATION_ERROR") != false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0222, code lost:
        r1 = X.AnonymousClass000.A0u();
        X.C90474aD.A1K("GCM: attempted to register for GCM but received undocumented error; exceptionMessage=", r1, r4);
        r1.append("; playServicesAvailable=");
        X.C36351kA.A1R(r1, X.C34201gc.A00(r3));
        X.C90504aG.A0O(r3).A0r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0245, code lost:
        if (r1.equals("QUOTA_EXCEEDED") != false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0247, code lost:
        X.C36321k7.A1W("GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage=", X.AnonymousClass000.A0u(), r4);
        X.C90504aG.A0O(r3).A0r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025e, code lost:
        if (r1.equals("SERVICE_NOT_AVAILABLE") != false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0260, code lost:
        r7 = java.lang.Math.min(r6.getLongExtra("delay_ms", 15000), 86400000);
        r6.putExtra("delay_ms", 2 * r7);
        r4 = ((X.C21060yb) r3.A0A.get()).A05();
        r3 = X.C65743Th.A04(r3, r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0284, code lost:
        if (r4 == null) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0286, code lost:
        r4.cancel(r3);
        r4.set(3, android.os.SystemClock.elapsedRealtime() + r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0298, code lost:
        com.whatsapp.util.Log.w("RegistrationIntentService/onHandleWork AlarmManager is null");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.content.Intent r25) {
        /*
            r24 = this;
            java.lang.String r5 = "delay_ms"
            android.os.ConditionVariable r0 = X.C18740tg.A00
            r6 = r25
            java.lang.String r1 = r6.getAction()
            java.lang.String r0 = "com.whatsapp.action.VERIFY"
            boolean r23 = r0.equals(r1)
            java.lang.String r1 = r6.getAction()
            java.lang.String r0 = "com.whatsapp.action.REFRESH"
            boolean r22 = r0.equals(r1)
            java.lang.String r1 = r6.getAction()
            java.lang.String r0 = "com.whatsapp.action.FORCE_REPLACE"
            boolean r7 = r0.equals(r1)
            if (r22 != 0) goto L_0x0034
            if (r23 != 0) goto L_0x0034
            if (r7 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GCM: registration intent action was unknown; intent="
            X.C36321k7.A1L(r6, r0, r1)
            return
        L_0x0034:
            r3 = r24
            r3.A01()
            android.content.Context r0 = r3.getApplicationContext()
            X.0u7 r0 = X.C18960u7.A01(r0)
            boolean r2 = X.AnonymousClass000.A1V(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GCM: Init firebase success:"
            X.C36321k7.A1X(r0, r1, r2)
            long r16 = android.os.Binder.clearCallingIdentity()
            java.lang.String r0 = "registrationId"
            java.lang.String r12 = r6.getStringExtra(r0)     // Catch:{ all -> 0x050e }
            r11 = 240677001(0xe587089, float:2.667824E-30)
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ all -> 0x050e }
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x050e }
            java.lang.String r10 = "c2dm_reg_id"
            r4 = 0
            java.lang.String r13 = r0.getString(r10, r4)     // Catch:{ all -> 0x050e }
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ all -> 0x050e }
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)     // Catch:{ all -> 0x050e }
            java.lang.String r9 = "c2dm_app_vers"
            int r2 = X.C36371kC.A01(r0, r9)     // Catch:{ all -> 0x050e }
            if (r23 == 0) goto L_0x0082
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x050e }
            r21 = 1
            if (r0 != 0) goto L_0x0086
        L_0x0082:
            r21 = 0
            if (r23 == 0) goto L_0x008d
        L_0x0086:
            boolean r0 = android.text.TextUtils.equals(r12, r13)     // Catch:{ all -> 0x050e }
            r1 = 1
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            boolean r20 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x050e }
            boolean r0 = X.C36381kD.A1U(r11, r2)
            if (r21 != 0) goto L_0x00a2
            if (r20 != 0) goto L_0x00a2
            if (r1 != 0) goto L_0x00a2
            if (r0 != 0) goto L_0x00a2
            r19 = 0
            if (r7 == 0) goto L_0x014c
        L_0x00a2:
            r19 = 1
            if (r7 == 0) goto L_0x014c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer deleting savedToken:"
            X.C36321k7.A1Q(r0, r13, r1)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r3.A01()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r3.A05     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.11l r0 = (X.AnonymousClass11l) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.C18740tg.A06(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r14 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0u7 r0 = X.C18960u7.A00()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            com.google.firebase.iid.FirebaseInstanceId r8 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r7 = "FCM"
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r1 == r0) goto L_0x0135
            boolean r0 = r7.isEmpty()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "fcm"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "gcm"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == 0) goto L_0x00f1
        L_0x00ef:
            java.lang.String r7 = "*"
        L_0x00f1:
            java.lang.String r18 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0uj r2 = r8.A06     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.os.Bundle r1 = X.AnonymousClass001.A07()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r15 = "delete"
            java.lang.String r0 = "1"
            r1.putString(r15, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = r18
            com.google.android.gms.tasks.zzw r15 = X.C19310uj.A00(r1, r2, r0, r14, r7)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.util.concurrent.Executor r1 = r2.A04     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.6nM r0 = new X.6nM     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            com.google.android.gms.tasks.Task r2 = r15.continueWith(r1, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.util.concurrent.Executor r1 = X.C112985eo.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.6nL r0 = new X.6nL     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0.<init>()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            com.google.android.gms.tasks.Task r0 = r2.continueWith(r1, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            com.google.firebase.iid.FirebaseInstanceId.A01(r0, r8)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0uh r1 = com.google.firebase.iid.FirebaseInstanceId.A08     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r2 = X.C19290uh.A01(r14, r7)     // Catch:{ all -> 0x03f7 }
            android.content.SharedPreferences r0 = r1.A01     // Catch:{ all -> 0x03f7 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x03f7 }
            r0.remove(r2)     // Catch:{ all -> 0x03f7 }
            r0.commit()     // Catch:{ all -> 0x03f7 }
            goto L_0x013d
        L_0x0135:
            java.lang.String r0 = "MAIN_THREAD"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x03f9
        L_0x013d:
            monitor-exit(r1)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "saved_gcm_token_server_unreg"
            X.C36331k8.A0w(r1, r0, r2)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x014c:
            r3.A01()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r3.A05     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.11l r0 = (X.AnonymousClass11l) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.C18740tg.A06(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r2 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0u7 r0 = X.C18960u7.A00()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "FCM"
            java.lang.String r7 = r1.A06(r2, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x01a5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "GCM: token retrieved successfully; token="
            r1.append(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            int r0 = r7.length()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r1.append(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = " bytes; applicationVersion="
            X.C36321k7.A1T(r0, r1, r11)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r20 == 0) goto L_0x019a
            java.lang.String r0 = "GCM: no previously saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0v0 r1 = X.C90504aG.A0O(r3)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 0
            r1.A1C(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x019a:
            boolean r0 = android.text.TextUtils.equals(r7, r13)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r1 = r0 ^ 1
            r2 = 0
            if (r19 != 0) goto L_0x02a7
            goto L_0x029e
        L_0x01a5:
            java.lang.String r0 = "GCM: empty token returned but no exception thrown"
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x03f9
        L_0x01ad:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x0292
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x050e }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x050e }
            r2 = 3
            switch(r0) {
                case -1992442893: goto L_0x0258;
                case -1800638118: goto L_0x023f;
                case -1579216525: goto L_0x021a;
                case -1515255836: goto L_0x0211;
                case -829011630: goto L_0x0208;
                case -630263762: goto L_0x01ff;
                case -595928767: goto L_0x01f6;
                case 370784008: goto L_0x01ed;
                case 855732677: goto L_0x01e4;
                case 901541140: goto L_0x01db;
                case 1750400351: goto L_0x01c5;
                default: goto L_0x01c0;
            }     // Catch:{ all -> 0x050e }
        L_0x01c0:
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r4)     // Catch:{ all -> 0x050e }
        L_0x01c4:
            throw r0     // Catch:{ all -> 0x050e }
        L_0x01c5:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = "GCM: attempted to register for GCM but Google Play Services was missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x050e }
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ all -> 0x050e }
            r0.A0r()     // Catch:{ all -> 0x050e }
            goto L_0x02a3
        L_0x01db:
            java.lang.String r0 = "ACCOUNT_MISSING"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0222
        L_0x01e4:
            java.lang.String r0 = "TOO_MANY_REGISTRATIONS"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0247
        L_0x01ed:
            java.lang.String r0 = "BACKOFF"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0260
        L_0x01f6:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0260
        L_0x01ff:
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0222
        L_0x0208:
            java.lang.String r0 = "INVALID_PARAMETERS"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0222
        L_0x0211:
            java.lang.String r0 = "AUTHENTICATION_FAILED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
            goto L_0x0222
        L_0x021a:
            java.lang.String r0 = "PHONE_REGISTRATION_ERROR"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
        L_0x0222:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x050e }
            java.lang.String r0 = "GCM: attempted to register for GCM but received undocumented error; exceptionMessage="
            X.C90474aD.A1K(r0, r1, r4)     // Catch:{ all -> 0x050e }
            java.lang.String r0 = "; playServicesAvailable="
            r1.append(r0)     // Catch:{ all -> 0x050e }
            int r0 = X.C34201gc.A00(r3)     // Catch:{ all -> 0x050e }
            X.C36351kA.A1R(r1, r0)     // Catch:{ all -> 0x050e }
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ all -> 0x050e }
            r0.A0r()     // Catch:{ all -> 0x050e }
            goto L_0x02a3
        L_0x023f:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
        L_0x0247:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x050e }
            java.lang.String r0 = "GCM: attempted to register for GCM but registration count was exceeded already; exceptionMessage="
            X.C36321k7.A1W(r0, r1, r4)     // Catch:{ all -> 0x050e }
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ all -> 0x050e }
            r0.A0r()     // Catch:{ all -> 0x050e }
            goto L_0x02a3
        L_0x0258:
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x01c0
        L_0x0260:
            r0 = 15000(0x3a98, double:7.411E-320)
            long r7 = r6.getLongExtra(r5, r0)     // Catch:{ all -> 0x050e }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = java.lang.Math.min(r7, r0)     // Catch:{ all -> 0x050e }
            r0 = 2
            long r0 = r0 * r7
            r6.putExtra(r5, r0)     // Catch:{ all -> 0x050e }
            X.005 r0 = r3.A0A     // Catch:{ all -> 0x050e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x050e }
            X.0yb r0 = (X.C21060yb) r0     // Catch:{ all -> 0x050e }
            android.app.AlarmManager r4 = r0.A05()     // Catch:{ all -> 0x050e }
            r0 = 0
            android.app.PendingIntent r3 = X.C65743Th.A04(r3, r6, r0)     // Catch:{ all -> 0x050e }
            if (r4 == 0) goto L_0x0298
            r4.cancel(r3)     // Catch:{ all -> 0x050e }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x050e }
            long r0 = r0 + r7
            r4.set(r2, r0, r3)     // Catch:{ all -> 0x050e }
            goto L_0x02a3
        L_0x0292:
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r4)     // Catch:{ all -> 0x050e }
            goto L_0x01c4
        L_0x0298:
            java.lang.String r0 = "RegistrationIntentService/onHandleWork AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x050e }
            goto L_0x02a3
        L_0x029e:
            if (r1 != 0) goto L_0x02a7
            r9 = 0
        L_0x02a1:
            if (r23 != 0) goto L_0x02f3
        L_0x02a3:
            android.os.Binder.restoreCallingIdentity(r16)
            return
        L_0x02a7:
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r10, r7)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.C36341k9.A0v(r0, r9, r11)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r22 != 0) goto L_0x02bf
            boolean r0 = android.text.TextUtils.equals(r7, r12)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r9 = 0
            if (r0 != 0) goto L_0x02c0
        L_0x02bf:
            r9 = 1
        L_0x02c0:
            java.lang.String r0 = "GCM: sending client config due to new token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r19 == 0) goto L_0x02f0
            if (r21 == 0) goto L_0x02f0
            if (r1 != 0) goto L_0x02f0
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r8 = "saved_gcm_token_server_unreg"
            r10 = 0
            boolean r0 = r0.getBoolean(r8, r10)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x02f0
            java.lang.String r0 = "GCM: verifying tokenUnregisteredOnServer fetched saved token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0wN r1 = r3.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "gcm-retrieved-saved-token"
            r1.A0E(r0, r4, r10)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0v0 r1 = X.C90504aG.A0O(r3)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 1
            X.C36331k8.A18(r1, r8, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x02f0:
            if (r9 != 0) goto L_0x02f3
            goto L_0x02a1
        L_0x02f3:
            X.005 r0 = r3.A06     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.3DK r0 = (X.AnonymousClass3DK) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0yC r1 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 283(0x11b, float:3.97E-43)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x030d
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == 0) goto L_0x03fb
        L_0x030d:
            X.005 r0 = r3.A06     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.3DK r0 = (X.AnonymousClass3DK) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.3Fx r4 = r0.A00()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.util.List r1 = r4.A01     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            int r10 = r4.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r9 != 0) goto L_0x03fb
            java.lang.String r0 = "mutedChatsHash"
            java.lang.String r14 = r6.getStringExtra(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "appMuteConfig"
            java.lang.String r8 = r6.getStringExtra(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r3.A06     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.3DK r0 = (X.AnonymousClass3DK) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r13 = 0
            if (r14 == 0) goto L_0x033d
            int r12 = r14.length()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r11 = 0
            if (r12 != 0) goto L_0x033e
        L_0x033d:
            r11 = 1
        L_0x033e:
            r15 = r11 ^ 1
            if (r1 == 0) goto L_0x0349
            boolean r11 = X.C36401kF.A1a(r1)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r12 = 1
            if (r11 != 0) goto L_0x034a
        L_0x0349:
            r12 = 0
        L_0x034a:
            if (r15 != 0) goto L_0x0350
            if (r12 == 0) goto L_0x0350
            goto L_0x03e5
        L_0x0350:
            X.0yC r11 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 2792(0xae8, float:3.912E-42)
            boolean r0 = r11.A0E(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == 0) goto L_0x035f
            if (r10 != 0) goto L_0x03db
            r0 = 0
            goto L_0x03df
        L_0x035f:
            if (r8 == 0) goto L_0x0367
            int r0 = r8.length()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x03e5
        L_0x0367:
            if (r15 == 0) goto L_0x03fb
            if (r12 == 0) goto L_0x03e5
            if (r1 == 0) goto L_0x03f2
            java.security.MessageDigest r12 = X.C90504aG.A0s()     // Catch:{ NoSuchAlgorithmException -> 0x03eb }
            X.AnonymousClass00C.A0B(r12)     // Catch:{ NoSuchAlgorithmException -> 0x03eb }
            java.nio.charset.Charset r11 = X.C19430v1.A0D     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x037a:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == 0) goto L_0x03c2
            java.lang.Object r10 = r15.next()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.3J4 r10 = (X.AnonymousClass3J4) r10     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.11F r0 = r10.A01     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.AnonymousClass00C.A0B(r11)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            byte[] r0 = X.C36371kC.A1Z(r0, r11)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r12.update(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Long r0 = r10.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x03b2
            java.lang.Long r0 = r10.A02     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r18 = -1
            int r8 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x03ac
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            long r18 = r8.toSeconds(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x03ac:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r10.A00 = r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x03b2:
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            byte[] r0 = X.C36371kC.A1Z(r0, r11)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r12.update(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x037a
        L_0x03c2:
            byte[] r8 = r12.digest()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r1 = 6
            byte[] r0 = new byte[r1]     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.System.arraycopy(r8, r13, r0, r13, r1)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = X.C36441kJ.A13(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == 0) goto L_0x03eb
            boolean r0 = r0.equalsIgnoreCase(r14)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03fb
            goto L_0x03e5
        L_0x03db:
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x03df:
            boolean r0 = X.C1901797e.A00(r0, r8)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x0367
        L_0x03e5:
            java.lang.String r0 = "GCM: sending client config due to new muted chats"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x03fa
        L_0x03eb:
            java.lang.String r0 = "No SHA-256 alg. available"
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x03f9
        L_0x03f2:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x03f9
        L_0x03f7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x03f9:
            throw r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x03fa:
            r9 = 1
        L_0x03fb:
            java.lang.String r1 = "numberOfAccountsFromServer"
            r0 = 1
            int r1 = r6.getIntExtra(r1, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r3.A03     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.5oz r0 = (X.C118945oz) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.1RU r0 = (X.AnonymousClass1RU) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0v0 r0 = r0.A09     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            int r0 = r0.A0I()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            int r8 = r0 + 1
            if (r1 == r8) goto L_0x041d
            r9 = 1
        L_0x041d:
            java.lang.String r1 = "voipPayloadType"
            r0 = 0
            int r10 = r6.getIntExtra(r1, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0yC r1 = r3.A02     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 4116(0x1014, float:5.768E-42)
            int r0 = r1.A07(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == r10) goto L_0x0434
            java.lang.String r0 = "GCM: sending client config due to calling push payload version"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r9 = 1
        L_0x0434:
            X.005 r0 = r3.A07     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r10 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.6OJ r10 = (X.AnonymousClass6OJ) r10     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0yC r1 = r10.A04     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 4116(0x1014, float:5.768E-42)
            int r0 = r1.A07(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 > 0) goto L_0x0472
            X.5oz r0 = r10.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.1RU r0 = (X.AnonymousClass1RU) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            boolean r0 = r0.A0B()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x0472
            X.005 r0 = r3.A07     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.6OJ r0 = (X.AnonymousClass6OJ) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.0v0 r0 = r0.A02     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.005 r0 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.content.SharedPreferences$Editor r1 = X.C90464aC.A0C(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "push:push_pkey_data"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "push:push_pkey_generate_ts"
            X.C36341k9.A0u(r1, r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x0498
        L_0x0472:
            X.005 r0 = r3.A07     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.6OJ r1 = (X.AnonymousClass6OJ) r1     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r0 = "pKeyHash"
            java.lang.String r0 = r6.getStringExtra(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            android.util.Pair r1 = r1.A01(r0, r9)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r9 != 0) goto L_0x0494
            java.lang.Object r0 = r1.first     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 == 0) goto L_0x0494
            java.lang.String r0 = "GCM: sending client config due to pKey rotation"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r9 = 1
        L_0x0494:
            java.lang.Object r2 = r1.second     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
        L_0x0498:
            if (r9 == 0) goto L_0x02a3
            X.005 r0 = r3.A09     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.12U r0 = (X.AnonymousClass12U) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            boolean r0 = r0.A03()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            if (r0 != 0) goto L_0x04c8
            X.005 r0 = r3.A09     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.12U r0 = (X.AnonymousClass12U) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            int r1 = r0.A00()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 2
            if (r1 == r0) goto L_0x04c8
            X.005 r0 = r3.A04     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.5lf r0 = (X.C117075lf) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.13g r0 = r0.A00     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            int r1 = r0.A00()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r0 = 7
            if (r1 < r0) goto L_0x02a3
        L_0x04c8:
            X.005 r0 = r3.A08     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            X.1bF r0 = (X.C31081bF) r0     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            java.lang.String r13 = "gcm"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            r10 = 0
            r8 = r0
            r9 = r4
            r12 = r7
            r14 = r2
            r8.A00(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x01ad, SecurityException -> 0x04e0 }
            goto L_0x02a3
        L_0x04e0:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x050d
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x050e }
            java.lang.String r0 = "com.google.android.c2dm.permission.RECEIVE"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050e }
            if (r0 != 0) goto L_0x04ff
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x050e }
            java.lang.String r0 = "process is bad"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050e }
            if (r0 == 0) goto L_0x050d
        L_0x04ff:
            java.lang.String r0 = "GCM: security exception caught; switching to long-connect"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x050e }
            X.0v0 r0 = X.C90504aG.A0O(r3)     // Catch:{ all -> 0x050e }
            r0.A0r()     // Catch:{ all -> 0x050e }
            goto L_0x02a3
        L_0x050d:
            throw r2     // Catch:{ all -> 0x050e }
        L_0x050e:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.push.RegistrationIntentService.A0A(android.content.Intent):void");
    }

    public final Object generatedComponent() {
        if (this.A0F == null) {
            synchronized (this.A0E) {
                if (this.A0F == null) {
                    this.A0F = new C31091bG(this);
                }
            }
        }
        return this.A0F.generatedComponent();
    }

    public void onCreate() {
        if (!this.A0C) {
            this.A0C = true;
            C31141bL r1 = (C31141bL) ((C31131bK) generatedComponent());
            C18800tq r3 = r1.A05;
            this.A01 = C36351kA.A0V(r3);
            this.A02 = C36341k9.A0V(r3);
            this.A00 = C36391kE.A0V(r3);
            C18830tt r2 = r3.A00;
            this.A05 = C18840tu.A00(r2.A1r);
            this.A0A = C18840tu.A00(r3.A8W);
            this.A08 = C18840tu.A00(r3.AY0);
            this.A0B = C18840tu.A00(r3.A9G);
            this.A07 = C18840tu.A00(r2.ABX);
            this.A04 = C18840tu.A00(r2.A69);
            this.A09 = C18840tu.A00(r3.A7L);
            this.A03 = C18840tu.A00(r2.A4g);
            this.A06 = C18840tu.A00(r1.A03);
        }
        super.onCreate();
    }

    public RegistrationIntentService(int i) {
        this.A0E = C36441kJ.A11();
        this.A0C = false;
    }

    public RegistrationIntentService() {
        this(0);
    }
}
