package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1NG  reason: invalid class name */
public final class AnonymousClass1NG {
    public final AnonymousClass1NH A00;
    public final C19700wN A01;
    public final AnonymousClass17Y A02;
    public final C27191Ng A03;
    public final C27181Nf A04;
    public final AnonymousClass1NI A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass16I A07;
    public final AnonymousClass171 A08;
    public final C19970wo A09;
    public final C19420v0 A0A;
    public final C18820ts A0B;
    public final AnonymousClass1HK A0C;
    public final C24541Cv A0D;
    public final AnonymousClass17T A0E;
    public final C230416y A0F;
    public final C20810yC A0G;
    public final C21010yW A0H;
    public final AnonymousClass1C6 A0I;
    public final C19770wU A0J;
    public final Set A0K = new LinkedHashSet();
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final C26861Lu A0N;
    public final C21100yf A0O;
    public final AnonymousClass19J A0P;
    public final C25791Hr A0Q;
    public final C27201Nh A0R;
    public final C27261Nn A0S;
    public final AnonymousClass185 A0T;
    public final AnonymousClass1NM A0U;
    public final C20310xM A0V;
    public final C25821Hu A0W;
    public final AnonymousClass12P A0X;
    public final AnonymousClass12O A0Y;
    public final C20500xf A0Z;
    public final C27251Nm A0a;
    public final AnonymousClass19A A0b;
    public final C238019x A0c;
    public final AnonymousClass1NJ A0d;

    public static final UserJid A00(AnonymousClass1NG r3) {
        Object obj;
        UserJid userJid;
        synchronized (r3) {
            Iterator it = r3.A0K.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((UserJid) obj) instanceof C177638e7) {
                    break;
                }
            }
            userJid = (UserJid) obj;
        }
        return userJid;
    }

    public final ArrayList A07(AnonymousClass11F r10) {
        String A002;
        AnonymousClass00C.A0D(r10, 0);
        ArrayList arrayList = new ArrayList();
        C24541Cv r3 = this.A0D;
        Iterator it = C24541Cv.A01(r3, r10, 5, false, false).iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r6 = (AnonymousClass3T1) it.next();
            AnonymousClass3GF r2 = new AnonymousClass3GF();
            if (r6 instanceof C88854Uh) {
                A002 = ((C88854Uh) r6).BIE().A05;
            } else {
                if (r6 instanceof AnonymousClass2bZ) {
                    A002 = this.A0W.A00(r6);
                    if (A002 == null) {
                    }
                }
                r2.A02 = r3.A08(r10, r6.A0I);
                r2.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(r6.A0I) * TimeUnit.HOURS.toSeconds(1));
                arrayList.add(r2);
            }
            r2.A01 = A002;
            r2.A02 = r3.A08(r10, r6.A0I);
            r2.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(r6.A0I) * TimeUnit.HOURS.toSeconds(1));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public final synchronized Set A09() {
        return C007103b.A0f(this.A0K);
    }

    public final synchronized Set A0A() {
        Set A0e;
        Set<UserJid> set = this.A0K;
        A0e = C007103b.A0e(set);
        for (UserJid userJid : set) {
            if (userJid instanceof PhoneUserJid) {
                AnonymousClass12O r1 = this.A0Y;
                AnonymousClass00C.A0E(userJid, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
                for (C223313w remove : r1.A0F((PhoneUserJid) userJid)) {
                    A0e.remove(remove);
                }
            }
        }
        return A0e;
    }

    public final void A0B() {
        Set A0f;
        synchronized (this) {
            Set set = this.A0K;
            A0f = C007103b.A0f(set);
            set.clear();
            A0C();
            this.A0N.A01(new C35671j4(this, 15));
        }
        A06(this, A0f);
    }

    public final void A0E(Activity activity, AnonymousClass4PI r15, UserJid userJid) {
        AnonymousClass00C.A0D(activity, 0);
        UserJid userJid2 = userJid;
        AnonymousClass00C.A0D(userJid2, 2);
        this.A00.A00(activity, new C68583c8(activity, r15, this, new AnonymousClass3B0((C51092nG) null, (AnonymousClass141) null, userJid2, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, false)), false);
    }

    public final void A0F(Activity activity, C51092nG r16, AnonymousClass141 r17, UserJid userJid, Integer num, String str, String str2, String str3) {
        Boolean bool;
        ArrayList arrayList;
        AnonymousClass00C.A0D(activity, 0);
        UserJid userJid2 = userJid;
        AnonymousClass00C.A0D(userJid2, 1);
        String str4 = str3;
        AnonymousClass00C.A0D(str4, 6);
        AnonymousClass141 r5 = r17;
        AnonymousClass00C.A0D(r5, 7);
        String str5 = str;
        if (str == null) {
            bool = null;
        } else if (this.A0D.A05(userJid2) != null) {
            bool = Boolean.valueOf(!this.A0E.A07(userJid2));
        } else {
            bool = null;
        }
        if (A0N(r5, true)) {
            arrayList = A07(userJid2);
        } else {
            arrayList = null;
        }
        A04(activity, (AnonymousClass4PI) null, this, new AnonymousClass3B0(r16, r5, userJid2, bool, num, str5, str2, str4, arrayList, true), false);
    }

    public final void A0G(Activity activity, AnonymousClass141 r14, String str, boolean z) {
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass00C.A0D(r14, 1);
        A03(activity, (AnonymousClass4PI) null, this, (C51092nG) null, r14, (Integer) null, (String) null, (String) null, str, false, z);
    }

    public final void A0H(Activity activity, UserJid userJid) {
        AnonymousClass00C.A0D(activity, 0);
        AnonymousClass00C.A0D(userJid, 1);
        A0E(activity, (AnonymousClass4PI) null, userJid);
    }

    public final void A0I(UserJid userJid, String str) {
        synchronized (this) {
            if (this.A0K.add(userJid)) {
                A05(this, userJid, str, true);
            }
        }
    }

    public final void A0J(UserJid userJid, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        C238019x r2 = this.A0c;
        AnonymousClass2cL r22 = new AnonymousClass2cL(r2.A01.A02(userJid, true), C19970wo.A00(this.A09));
        r22.A00 = z;
        this.A0V.A0Q(r22, -1);
    }

    public final synchronized void A0L(String str, Map map, Set set) {
        String str2;
        UserJid A002;
        synchronized (this) {
            AnonymousClass12P r0 = this.A0X;
            r0.A06();
            Set set2 = set;
            if (r0.A08) {
                set2.addAll(A02(this, set2));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Set A0e = C007103b.A0e(set2);
            Set set3 = this.A0K;
            A0e.removeAll(set3);
            Set A0e2 = C007103b.A0e(set3);
            A0e2.removeAll(set2);
            if (C20800yB.A01(C21000yV.A02, this.A0Z.A00, 1844) && (A002 = A00(this)) != null) {
                A0e2.remove(A002);
                set2.add(A002);
            }
            linkedHashSet.addAll(A0e);
            linkedHashSet.addAll(A0e2);
            AtomicBoolean atomicBoolean = this.A0M;
            boolean z = atomicBoolean.get();
            boolean A0M2 = A0M();
            atomicBoolean.set(true);
            C26861Lu r3 = this.A0N;
            r3.A01(new C35651j2(this, map, 0));
            if (!linkedHashSet.isEmpty()) {
                if (A0M2 && z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("old block list: ");
                    String arrays = Arrays.toString(set3.toArray(new UserJid[0]));
                    AnonymousClass00C.A08(arrays);
                    sb.append(arrays);
                    Log.e(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("new block list: ");
                    String arrays2 = Arrays.toString(set2.toArray(new UserJid[0]));
                    AnonymousClass00C.A08(arrays2);
                    sb2.append(arrays2);
                    Log.e(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("added: ");
                    String arrays3 = Arrays.toString(A0e.toArray(new UserJid[0]));
                    AnonymousClass00C.A08(arrays3);
                    sb3.append(arrays3);
                    Log.e(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("removed: ");
                    String arrays4 = Arrays.toString(A0e2.toArray(new UserJid[0]));
                    AnonymousClass00C.A08(arrays4);
                    sb4.append(arrays4);
                    Log.e(sb4.toString());
                    if ((!A0e.isEmpty()) && (!A0e2.isEmpty())) {
                        str2 = "Added/Removed";
                    } else if (!A0e.isEmpty()) {
                        str2 = "Added";
                    } else {
                        str2 = "Removed";
                    }
                    this.A01.A0E("block list de-synchronization", str2, true);
                }
                r3.A01(new C35521ip(this, set2, linkedHashSet, str, 1));
            } else {
                C19420v0 r1 = this.A0A;
                C19420v0.A00(r1).putLong("block_list_receive_time", C19970wo.A00(this.A09)).apply();
                if (!A0M2) {
                    this.A02.A0H(new C35671j4(this, 14));
                }
            }
        }
    }

    public static final UserJid A01(AnonymousClass1NG r1, UserJid userJid) {
        UserJid A0A2;
        if (userJid instanceof PhoneUserJid) {
            AnonymousClass12O r12 = r1.A0Y;
            AnonymousClass00C.A0E(userJid, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            A0A2 = r12.A09((PhoneUserJid) userJid);
        } else if (!AnonymousClass143.A0I(userJid)) {
            return null;
        } else {
            AnonymousClass12O r13 = r1.A0Y;
            AnonymousClass00C.A0E(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            A0A2 = r13.A0A((C223313w) userJid);
        }
        return A0A2;
    }

    public static final HashSet A02(AnonymousClass1NG r3, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid A012 = A01(r3, (UserJid) it.next());
            if (A012 != null) {
                hashSet.add(A012);
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.3dV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.3dY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.3dY} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.app.Activity r14, X.AnonymousClass4PI r15, X.AnonymousClass1NG r16, X.C51092nG r17, X.AnonymousClass141 r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            r8 = r18
            com.whatsapp.jid.Jid r9 = r8.A06(r0)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r0 = "jid is NULL"
            java.util.Objects.requireNonNull(r9, r0)
            r3 = r16
            r16 = r23
            r4 = r14
            if (r24 == 0) goto L_0x005f
            X.3dY r5 = new X.3dY
            r12 = r15
            r13 = r3
            r14 = r8
            r15 = r16
            r11 = r4
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x0022:
            X.4PI r5 = (X.AnonymousClass4PI) r5
            r12 = r20
            if (r23 == 0) goto L_0x005d
            if (r20 == 0) goto L_0x005d
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            X.1Cv r0 = r3.A0D
            X.3T1 r0 = r0.A05(r9)
            if (r0 == 0) goto L_0x005d
            X.17T r0 = r3.A0E
            boolean r0 = r0.A07(r9)
            r0 = r0 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
        L_0x0042:
            r15 = 0
            X.3B0 r6 = new X.3B0
            r7 = r17
            r11 = r19
            r13 = r21
            r14 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1NH r2 = r3.A00
            boolean r1 = r6.A0A
            X.3c8 r0 = new X.3c8
            r0.<init>(r4, r5, r3, r6)
            r2.A00(r4, r0, r1)
            return
        L_0x005d:
            r10 = 0
            goto L_0x0042
        L_0x005f:
            X.3dV r5 = new X.3dV
            r5.<init>(r15)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A03(android.app.Activity, X.4PI, X.1NG, X.2nG, X.141, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ec, code lost:
        if (r5.equals("biz_account_info_block") == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f6, code lost:
        if (r5.equals("account_info_block") != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01f8, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0204, code lost:
        if (r5.equals("biz_overflow_menu_block") == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020e, code lost:
        if (r5.equals("chat") == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0212, code lost:
        r2 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.app.Activity r24, X.AnonymousClass4PI r25, X.AnonymousClass1NG r26, X.AnonymousClass3B0 r27, boolean r28) {
        /*
            r1 = r27
            r12 = r25
            boolean r6 = r1.A0A
            java.lang.String r3 = r1.A08
            r2 = 0
            if (r3 == 0) goto L_0x0020
            int r0 = X.C65143Qx.A00(r3)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
        L_0x0013:
            r0 = r26
            X.1NM r7 = r0.A0U
            com.whatsapp.jid.UserJid r4 = r1.A04
            r27 = r4
            X.AnonymousClass00C.A08(r27)
            monitor-enter(r7)
            goto L_0x0023
        L_0x0020:
            r19 = r2
            goto L_0x0013
        L_0x0023:
            boolean r4 = X.AnonymousClass143.A0G(r27)     // Catch:{ all -> 0x04a1 }
            if (r4 != 0) goto L_0x008c
            android.content.SharedPreferences r8 = X.AnonymousClass1NM.A00(r7)     // Catch:{ all -> 0x04a1 }
            java.lang.String r4 = r27.getRawString()     // Catch:{ all -> 0x04a1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a1 }
            r5.<init>()     // Catch:{ all -> 0x04a1 }
            r5.append(r4)     // Catch:{ all -> 0x04a1 }
            java.lang.String r4 = "_integrity"
            r5.append(r4)     // Catch:{ all -> 0x04a1 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x04a1 }
            java.lang.String r4 = "0,null,null,0"
            java.lang.String r4 = r8.getString(r9, r4)     // Catch:{ all -> 0x04a1 }
            java.lang.String r10 = ","
            java.lang.String[] r5 = r4.split(r10)     // Catch:{ all -> 0x04a1 }
            r4 = 0
            long r17 = X.C202339lc.A00(r5, r4)     // Catch:{ all -> 0x04a1 }
            r4 = 3
            long r15 = X.C202339lc.A00(r5, r4)     // Catch:{ all -> 0x04a1 }
            X.C202339lc.A02(r5)     // Catch:{ all -> 0x04a1 }
            r13 = 2
            X.C202339lc.A01(r5, r13)     // Catch:{ all -> 0x04a1 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x04a1 }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x04a1 }
            r4 = 4
            java.io.Serializable[] r11 = new java.io.Serializable[r4]     // Catch:{ all -> 0x04a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x04a1 }
            r4 = 0
            r11[r4] = r5     // Catch:{ all -> 0x04a1 }
            r4 = 1
            r11[r4] = r19     // Catch:{ all -> 0x04a1 }
            r11[r13] = r14     // Catch:{ all -> 0x04a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x04a1 }
            r4 = 3
            r11[r4] = r5     // Catch:{ all -> 0x04a1 }
            java.util.List r4 = java.util.Arrays.asList(r11)     // Catch:{ all -> 0x04a1 }
            java.lang.String r4 = android.text.TextUtils.join(r10, r4)     // Catch:{ all -> 0x04a1 }
            android.content.SharedPreferences$Editor r4 = r8.putString(r9, r4)     // Catch:{ all -> 0x04a1 }
            r4.apply()     // Catch:{ all -> 0x04a1 }
        L_0x008c:
            monitor-exit(r7)
            X.19J r4 = r0.A0P
            boolean r4 = r4.A06
            if (r4 == 0) goto L_0x00fa
            r14 = r24
            if (r25 != 0) goto L_0x009c
            X.3dX r12 = new X.3dX
            r12.<init>(r14, r0, r6)
        L_0x009c:
            X.1Nn r5 = r0.A0S
            r4 = r27
            X.3Nj r20 = r5.A00(r4)
            X.1Nh r5 = r0.A0R
            boolean r4 = X.AnonymousClass143.A0H(r27)
            r26 = r28
            if (r4 == 0) goto L_0x0238
            X.1Nj r4 = r5.A01
            X.0w4 r4 = r4.A00
            X.0tq r5 = r4.A00
            X.004 r4 = r5.A3e
            java.lang.Object r9 = r4.get()
            X.17Y r9 = (X.AnonymousClass17Y) r9
            X.004 r4 = r5.A0v
            java.lang.Object r8 = r4.get()
            X.1NG r8 = (X.AnonymousClass1NG) r8
            X.004 r4 = r5.A2B
            java.lang.Object r7 = r4.get()
            X.16I r7 = (X.AnonymousClass16I) r7
            X.004 r4 = r5.A4J
            java.lang.Object r5 = r4.get()
            X.1Nm r5 = (X.C27251Nm) r5
            X.040 r21 = X.C26591Kt.A00
            X.C19620wF.A00(r21)
            X.3Ad r4 = new X.3Ad
            r15 = r9
            r16 = r12
            r17 = r8
            r18 = r1
            r19 = r7
            r20 = r5
            r22 = r26
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.040 r8 = r4.A07
            com.whatsapp.blocklist.InteropBlockListResponseHandler$send$1 r7 = new com.whatsapp.blocklist.InteropBlockListResponseHandler$send$1
            r7.<init>(r4, r2)
            X.03u r5 = X.C008903u.A00
            java.lang.Integer r4 = X.C023109s.A00
            X.AnonymousClass0A2.A02(r4, r5, r7, r8)
        L_0x00fa:
            if (r6 == 0) goto L_0x01c4
            X.0xf r7 = r0.A0Z
            r4 = r27
            boolean r4 = X.AnonymousClass3M3.A01(r7, r4)
            if (r4 == 0) goto L_0x012e
            java.lang.String r5 = r1.A07
            if (r5 == 0) goto L_0x0112
            int r4 = r5.hashCode()
            r6 = 1
            switch(r4) {
                case -1801846342: goto L_0x01e6;
                case -401299234: goto L_0x01fe;
                case 3052376: goto L_0x0208;
                case 894529294: goto L_0x01f0;
                case 1622880667: goto L_0x0219;
                default: goto L_0x0112;
            }
        L_0x0112:
            r5 = 0
            if (r3 == 0) goto L_0x011c
            int r4 = r3.hashCode()
            switch(r4) {
                case -612071747: goto L_0x01c5;
                case -174614655: goto L_0x01d0;
                case 133626717: goto L_0x01db;
                default: goto L_0x011c;
            }
        L_0x011c:
            X.0wU r4 = r0.A0J
            X.0yW r8 = r0.A0H
            X.1Cv r6 = r0.A0D
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r13 = 1
            r9 = r27
            r10 = r4
            r11 = r2
            X.C65093Qs.A01(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x012e:
            X.0wU r5 = r0.A0J
            r4 = 47
            X.1iz r2 = new X.1iz
            r2.<init>(r1, r0, r4)
            r5.Boy(r2)
            java.lang.String r5 = r1.A07
            com.whatsapp.jid.PhoneUserJid r4 = r1.A00
            X.1Hr r6 = r0.A0Q
            int r11 = X.C65143Qx.A01(r5)
            java.lang.String r2 = r1.A09
            int r1 = X.C53352rB.A00(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r12 = 6
            r5 = 0
            r13 = 0
            r7 = r27
            r9 = r3
            r10 = r2
            r6.A02(r7, r8, r9, r10, r11, r12, r13)
            X.1NJ r3 = r0.A0d
            if (r4 != 0) goto L_0x015d
            r4 = r7
        L_0x015d:
            X.0yC r2 = r3.A03
            r1 = 5245(0x147d, float:7.35E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x01c4
            X.12q r0 = r3.A01
            X.3Qp r8 = r0.A09(r4, r5)
            if (r8 == 0) goto L_0x01c4
            X.2Q8 r2 = new X.2Q8
            r2.<init>()
            java.lang.String r0 = r4.getRawString()
            r2.A03 = r0
            java.lang.Long r0 = r8.A07()
            long r6 = r0.longValue()
            X.0wo r0 = r3.A00
            long r4 = X.C19970wo.A00(r0)
            X.0xM r0 = r3.A02
            long r0 = r0.A0K(r6)
            long r4 = r4 - r0
            double r0 = X.AnonymousClass1NJ.A00(r4)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A02 = r0
            java.lang.Long r0 = r8.A07()
            long r0 = r0.longValue()
            double r0 = X.AnonymousClass1NJ.A01(r3, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            java.lang.Long r0 = r8.A07()
            long r0 = r0.longValue()
            double r0 = X.AnonymousClass1NJ.A02(r3, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A01 = r0
            X.0yW r0 = r3.A04
            r0.Bly(r2)
        L_0x01c4:
            return
        L_0x01c5:
            java.lang.String r4 = "messages_not_helpful"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x011c
            r5 = 1
            goto L_0x011c
        L_0x01d0:
            java.lang.String r4 = "too_many_messages"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x011c
            r5 = 2
            goto L_0x011c
        L_0x01db:
            java.lang.String r4 = "suspicious"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x011c
            r5 = 3
            goto L_0x011c
        L_0x01e6:
            java.lang.String r4 = "biz_account_info_block"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x01f8
            goto L_0x0112
        L_0x01f0:
            java.lang.String r4 = "account_info_block"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0112
        L_0x01f8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x0112
        L_0x01fe:
            java.lang.String r4 = "biz_overflow_menu_block"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0212
            goto L_0x0112
        L_0x0208:
            java.lang.String r4 = "chat"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0212
            goto L_0x0112
        L_0x0212:
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0112
        L_0x0219:
            java.lang.String r4 = "psa_banner_block"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0112
            r2 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.0v0 r4 = r0.A0A
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r4)
            java.lang.String r4 = "wac_consent_shown"
            android.content.SharedPreferences$Editor r4 = r5.putBoolean(r4, r6)
            r4.apply()
            goto L_0x0112
        L_0x0238:
            X.1Ni r4 = r5.A00
            X.0w4 r4 = r4.A00
            X.0tq r4 = r4.A00
            X.004 r5 = r4.A3e
            java.lang.Object r13 = r5.get()
            X.17Y r13 = (X.AnonymousClass17Y) r13
            X.004 r5 = r4.A2U
            java.lang.Object r11 = r5.get()
            X.0wN r11 = (X.C19700wN) r11
            X.0xf r24 = r4.AzV()
            X.004 r5 = r4.A4x
            java.lang.Object r10 = r5.get()
            X.19A r10 = (X.AnonymousClass19A) r10
            X.004 r5 = r4.A0v
            java.lang.Object r9 = r5.get()
            X.1NG r9 = (X.AnonymousClass1NG) r9
            X.004 r5 = r4.A2B
            java.lang.Object r8 = r5.get()
            X.16I r8 = (X.AnonymousClass16I) r8
            X.004 r5 = r4.A98
            java.lang.Object r7 = r5.get()
            X.12O r7 = (X.AnonymousClass12O) r7
            X.004 r4 = r4.A9G
            java.lang.Object r5 = r4.get()
            X.0v0 r5 = (X.C19420v0) r5
            X.9XY r4 = new X.9XY
            r15 = r11
            r16 = r13
            r17 = r12
            r18 = r9
            r19 = r1
            r21 = r8
            r22 = r5
            r23 = r7
            r25 = r10
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.19A r11 = r4.A0C
            java.lang.String r16 = r11.A09()
            X.0xf r7 = r4.A0B
            X.3B0 r9 = r4.A06
            X.141 r5 = r9.A03
            boolean r5 = X.AnonymousClass3M3.A00(r5, r7)
            if (r5 == 0) goto L_0x032c
            X.A9a r5 = new X.A9a
            r5.<init>(r4)
            X.AHt r8 = new X.AHt
            r8.<init>(r5, r11)
            boolean r13 = r9.A0A
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "SetChatPsaBlockingStatusHelper/setChatPsaBlockingStatus to "
            r5.append(r4)
            r5.append(r13)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.19A r10 = r8.A00
            java.lang.String r9 = r10.A09()
            java.lang.String r4 = "iq"
            X.6QB r12 = new X.6QB
            r12.<init>(r4)
            X.8e2 r7 = X.C177588e2.A00
            java.lang.String r5 = "to"
            X.1AL r4 = new X.1AL
            r4.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r5)
            r12.A04(r4)
            java.lang.String r7 = "xmlns"
            java.lang.String r5 = "w:comms:chat"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r7, (java.lang.String) r5)
            r12.A04(r4)
            java.lang.String r5 = "id"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r9)
            r12.A04(r4)
            java.lang.String r7 = "type"
            java.lang.String r5 = "set"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r7, (java.lang.String) r5)
            r12.A04(r4)
            java.lang.String r4 = "blocking"
            X.6QB r11 = new X.6QB
            r11.<init>(r4)
            if (r13 == 0) goto L_0x0329
            java.lang.String r7 = "block"
        L_0x0309:
            java.lang.String r5 = "action"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r7)
            r11.A04(r4)
            X.9nx r4 = r11.A03()
            r12.A05(r4)
            X.9nx r12 = r12.A03()
            r14 = 339(0x153, float:4.75E-43)
            r15 = 0
            r11 = r8
            r13 = r9
            r10.A0E(r11, r12, r13, r14, r15)
            goto L_0x00fa
        L_0x0329:
            java.lang.String r7 = "unblock"
            goto L_0x0309
        L_0x032c:
            com.whatsapp.jid.UserJid r14 = r9.A04
            boolean r5 = X.AnonymousClass143.A0I(r14)
            if (r5 == 0) goto L_0x033f
            X.12O r7 = r4.A0A
            r5 = r14
            X.13w r5 = (X.C223313w) r5
            com.whatsapp.jid.PhoneUserJid r5 = r7.A0A(r5)
            r9.A00 = r5
        L_0x033f:
            X.0wN r10 = r4.A02
            X.0v0 r8 = r4.A09
            X.9Pe r5 = new X.9Pe
            r5.<init>(r4)
            X.AHx r7 = new X.AHx
            r7.<init>(r10, r5, r8, r11)
            X.3Nj r13 = r4.A07
            java.lang.String r4 = "blocklistv2setprotocolhelper/sendSetBlocklistRequest"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.19A r4 = r7.A01
            r17 = r4
            X.0v0 r4 = r7.A00
            java.lang.String r12 = r4.A0a()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            boolean r11 = r9.A0A
            if (r11 == 0) goto L_0x049d
            java.lang.String r15 = "block"
        L_0x036e:
            java.lang.String r5 = "action"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r15)
            r8.add(r4)
            com.whatsapp.jid.PhoneUserJid r15 = r9.A00
            java.lang.String r5 = "jid"
            if (r15 != 0) goto L_0x037f
            r15 = r14
        L_0x037f:
            X.1AL r4 = new X.1AL
            r4.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r5)
            r8.add(r4)
            boolean r4 = X.AnonymousClass14B.A0F(r12)
            if (r4 != 0) goto L_0x0397
            java.lang.String r5 = "dhash"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r12)
            r8.add(r4)
        L_0x0397:
            r4 = 0
            X.1AL[] r4 = new X.AnonymousClass1AL[r4]
            java.lang.Object[] r8 = r8.toArray(r4)
            X.1AL[] r8 = (X.AnonymousClass1AL[]) r8
            if (r11 != 0) goto L_0x0418
            r12 = 0
        L_0x03a3:
            java.lang.String r5 = "item"
            X.9nx r4 = new X.9nx
            r4.<init>((X.C203399nx) r12, (java.lang.String) r5, (X.AnonymousClass1AL[]) r8)
            r10.add(r4)
            r13 = 1
            r12 = 0
            if (r11 == 0) goto L_0x03ca
            java.lang.String r9 = r9.A07
            if (r9 == 0) goto L_0x03ca
            X.1AL[] r8 = new X.AnonymousClass1AL[r13]
            java.lang.String r5 = "source"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r9)
            r8[r12] = r4
            java.lang.String r5 = "entry_point"
            X.9nx r4 = new X.9nx
            r4.<init>(r5, r8)
            r10.add(r4)
        L_0x03ca:
            r4 = 4
            X.1AL[] r9 = new X.AnonymousClass1AL[r4]
            X.8e2 r8 = X.C177588e2.A00
            java.lang.String r5 = "to"
            X.1AL r4 = new X.1AL
            r4.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r5)
            r9[r12] = r4
            java.lang.String r8 = "id"
            X.1AL r5 = new X.1AL
            r4 = r16
            r5.<init>((java.lang.String) r8, (java.lang.String) r4)
            r9[r13] = r5
            r11 = 2
            java.lang.String r8 = "type"
            java.lang.String r5 = "set"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r8, (java.lang.String) r5)
            r9[r11] = r4
            r11 = 3
            java.lang.String r8 = "xmlns"
            java.lang.String r5 = "blocklist"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r8, (java.lang.String) r5)
            r9[r11] = r4
            X.9nx[] r4 = new X.C203399nx[r12]
            java.lang.Object[] r8 = r10.toArray(r4)
            X.9nx[] r8 = (X.C203399nx[]) r8
            java.lang.String r5 = "iq"
            X.9nx r4 = new X.9nx
            r4.<init>((java.lang.String) r5, (X.AnonymousClass1AL[]) r9, (X.C203399nx[]) r8)
            r12 = 2
            r13 = 20000(0x4e20, double:9.8813E-320)
            r8 = r17
            r9 = r7
            r10 = r4
            r11 = r16
            r8.A0K(r9, r10, r11, r12, r13)
            goto L_0x00fa
        L_0x0418:
            java.lang.Boolean r4 = r9.A05
            if (r4 != 0) goto L_0x0491
            java.lang.String r14 = "none"
        L_0x041e:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r5 = "first_message"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r14)
            r12.add(r4)
            java.lang.String r14 = r9.A08
            if (r14 == 0) goto L_0x0449
            java.lang.String r5 = "reason"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r14)
            r12.add(r4)
            java.lang.String r14 = r9.A09
            if (r14 == 0) goto L_0x0449
            java.lang.String r5 = "reason_description"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r14)
            r12.add(r4)
        L_0x0449:
            java.lang.String r14 = r9.A07
            if (r14 == 0) goto L_0x0457
            java.lang.String r5 = "entry_point"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r14)
            r12.add(r4)
        L_0x0457:
            if (r13 == 0) goto L_0x047f
            java.lang.String r14 = r13.A03
            java.lang.String r5 = "business_discovery_entry_point"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r14)
            r12.add(r4)
            long r4 = r13.A00
            java.lang.String r15 = "business_discovery_timestamp"
            X.1AL r14 = new X.1AL
            r14.<init>((java.lang.String) r15, (long) r4)
            r12.add(r14)
            java.lang.String r13 = r13.A02
            if (r13 == 0) goto L_0x047f
            java.lang.String r5 = "business_discovery_id"
            X.1AL r4 = new X.1AL
            r4.<init>((java.lang.String) r5, (java.lang.String) r13)
            r12.add(r4)
        L_0x047f:
            r4 = 0
            X.1AL[] r4 = new X.AnonymousClass1AL[r4]
            java.lang.Object[] r5 = r12.toArray(r4)
            X.1AL[] r5 = (X.AnonymousClass1AL[]) r5
            java.lang.String r4 = "biz_opt_out"
            X.9nx r12 = new X.9nx
            r12.<init>(r4, r5)
            goto L_0x03a3
        L_0x0491:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x049a
            java.lang.String r14 = "true"
            goto L_0x041e
        L_0x049a:
            java.lang.String r14 = "false"
            goto L_0x041e
        L_0x049d:
            java.lang.String r15 = "unblock"
            goto L_0x036e
        L_0x04a1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A04(android.app.Activity, X.4PI, X.1NG, X.3B0, boolean):void");
    }

    public final LinkedHashMap A08() {
        String string = C27181Nf.A00(this.A04).getString("biz_block_reasons", (String) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, jSONObject.get(next));
                }
            } catch (JSONException unused) {
            }
        }
        return linkedHashMap;
    }

    public final void A0C() {
        C19420v0 r3 = this.A0A;
        C19420v0.A00(r3).putString("block_list_v2_dhash", (String) null).apply();
        C19420v0.A00(r3).remove("block_list_receive_time").apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r4.equals(r1) != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
            r16 = this;
            r3 = r16
            X.1Nf r5 = r3.A04
            android.content.SharedPreferences r1 = X.C27181Nf.A00(r5)
            java.lang.String r6 = "biz_block_reasons_language"
            r0 = 0
            java.lang.String r4 = r1.getString(r6, r0)
            X.0ts r7 = r3.A0B
            java.lang.String r2 = r7.A06()
            int r0 = r2.length()
            r1 = 1
            if (r0 <= 0) goto L_0x00a9
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x00a9
        L_0x0022:
            r2 = 0
            if (r1 == 0) goto L_0x0083
            android.content.SharedPreferences r4 = X.C27181Nf.A00(r5)
            java.lang.String r1 = "biz_block_reasons_country"
            r0 = 0
            java.lang.String r4 = r4.getString(r1, r0)
            if (r4 == 0) goto L_0x0048
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = r7.A05()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0083
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0083
        L_0x0048:
            r10 = 1
        L_0x0049:
            android.content.SharedPreferences r1 = X.C27181Nf.A00(r5)
            java.lang.String r0 = "biz_block_reasons_api_back_off_days"
            int r0 = r1.getInt(r0, r2)
            if (r0 < 0) goto L_0x0114
            X.0wo r0 = r3.A09
            long r8 = X.C19970wo.A00(r0)
            android.content.SharedPreferences r6 = X.C27181Nf.A00(r5)
            java.lang.String r4 = "biz_block_reasons_api_cooling_timestamp"
            r0 = 0
            long r6 = r6.getLong(r4, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0114
            if (r10 == 0) goto L_0x0081
            X.0yf r1 = r3.A0O
            X.0yh r0 = X.C21100yf.A1h
            int r4 = r1.A04(r0)
            android.content.SharedPreferences r1 = X.C27181Nf.A00(r5)
            java.lang.String r0 = "biz_block_reasons_version"
            int r0 = r1.getInt(r0, r2)
            if (r4 <= r0) goto L_0x0114
        L_0x0081:
            monitor-enter(r3)
            goto L_0x00ac
        L_0x0083:
            r10 = 0
            android.content.SharedPreferences r0 = X.C27181Nf.A00(r5)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "biz_block_reasons"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "biz_block_reasons_version"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r6)
            java.lang.String r0 = "biz_block_reasons_country"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            r5.A01(r2)
            goto L_0x0049
        L_0x00a9:
            r1 = 0
            goto L_0x0022
        L_0x00ac:
            X.1Ng r10 = r3.A03     // Catch:{ all -> 0x0110 }
            X.19A r9 = r10.A00     // Catch:{ all -> 0x0110 }
            java.lang.String r12 = r9.A09()     // Catch:{ all -> 0x0110 }
            r6 = 2
            X.1AL[] r8 = new X.AnonymousClass1AL[r6]     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "name"
            java.lang.String r1 = "biz_block_reasons"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x0110 }
            r0.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ all -> 0x0110 }
            r8[r2] = r0     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "v"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x0110 }
            r0.<init>((java.lang.String) r1, (int) r6)     // Catch:{ all -> 0x0110 }
            r7 = 1
            r8[r7] = r0     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "mobile_config"
            X.9nx r5 = new X.9nx     // Catch:{ all -> 0x0110 }
            r5.<init>(r0, r8)     // Catch:{ all -> 0x0110 }
            r0 = 4
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "id"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x0110 }
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0110 }
            r4[r2] = r0     // Catch:{ all -> 0x0110 }
            X.8e2 r2 = X.C177588e2.A00     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x0110 }
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0110 }
            r4[r7] = r0     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x0110 }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0110 }
            r4[r6] = r0     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "w:biz"
            X.1AL r1 = new X.1AL     // Catch:{ all -> 0x0110 }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0110 }
            r0 = 3
            r4[r0] = r1     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "iq"
            X.9nx r11 = new X.9nx     // Catch:{ all -> 0x0110 }
            r11.<init>((X.C203399nx) r5, (java.lang.String) r0, (X.AnonymousClass1AL[]) r4)     // Catch:{ all -> 0x0110 }
            r13 = 234(0xea, float:3.28E-43)
            r14 = 20000(0x4e20, double:9.8813E-320)
            r9.A0K(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0110 }
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0113:
            monitor-exit(r3)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NG.A0D():void");
    }

    public final void A0K(AnonymousClass3EB r24) {
        C203399nx r11;
        C19970wo r1 = this.A09;
        AnonymousClass19A r8 = this.A0b;
        C19970wo r16 = r1;
        C76713pK r14 = new C76713pK(this, r16, this.A0A, r8, r24);
        Log.i("getblocklistprotocolhelper/sendGetBlocklistRequest");
        AnonymousClass19A r9 = r14.A03;
        String A092 = r9.A09();
        String A0a2 = r14.A02.A0a();
        if (TextUtils.isEmpty(A0a2)) {
            r11 = null;
        } else {
            r11 = new C203399nx("item", new AnonymousClass1AL[]{new AnonymousClass1AL("dhash", A0a2)});
        }
        C177588e2 r6 = C177588e2.A00;
        r9.A0E(r14, new C203399nx(r11, "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) r6, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL("xmlns", "blocklist")}), A092, 198, 0);
        if (C20800yB.A01(C21000yV.A02, this.A0Z.A00, 1844)) {
            C21340AHs aHs = new C21340AHs(new C69483db(this), r8);
            Log.i("GetChatPsaBlockingStatusHelper/sendGetChatPsaBlockStatusRequest");
            AnonymousClass19A r82 = aHs.A00;
            String A093 = r82.A09();
            AnonymousClass6QB r7 = new AnonymousClass6QB("iq");
            r7.A04(new AnonymousClass1AL((Jid) r6, "to"));
            r7.A04(new AnonymousClass1AL("xmlns", "w:comms:chat"));
            r7.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A093));
            r7.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
            AnonymousClass6QB r2 = new AnonymousClass6QB("query");
            r2.A05(new AnonymousClass6QB("blocking_status").A03());
            r7.A05(r2.A03());
            r82.A0E(aHs, r7.A03(), A093, 340, 0);
        }
    }

    public final boolean A0M() {
        if (((SharedPreferences) this.A0A.A00.get()).getLong("block_list_receive_time", 0) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A0N(AnonymousClass141 r5, boolean z) {
        UserJid userJid;
        if (r5 != null) {
            C222813r r0 = UserJid.Companion;
            userJid = C222813r.A00(r5.A0H);
        } else {
            userJid = null;
        }
        if (C20800yB.A01(C21000yV.A02, this.A0G, 978) || !z || r5 == null || userJid == null || !r5.A0C() || !this.A0T.A04(userJid)) {
            return false;
        }
        return true;
    }

    public final boolean A0O(UserJid userJid) {
        Set set;
        if (userJid == null) {
            return false;
        }
        if (AnonymousClass143.A0H(userJid)) {
            set = this.A0a.A02;
        } else {
            set = this.A0K;
        }
        return set.contains(userJid);
    }

    public static final void A05(AnonymousClass1NG r3, UserJid userJid, String str, boolean z) {
        r3.A0J(userJid, z);
        if (r3.A05.A02(userJid, z)) {
            C19420v0.A00(r3.A0A).putString("block_list_v2_dhash", str).apply();
        }
        r3.A02.A0H(new C35621iz(r3, userJid, 49));
    }

    public static final void A06(AnonymousClass1NG r1, Collection collection) {
        if (!collection.isEmpty()) {
            r1.A07.A03(collection);
        }
    }

    public AnonymousClass1NG(AnonymousClass1NH r38, C19700wN r39, C26861Lu r40, AnonymousClass17Y r41, C21100yf r42, AnonymousClass19J r43, C25791Hr r44, C27201Nh r45, C27191Ng r46, C27181Nf r47, AnonymousClass1NI r48, AnonymousClass16D r49, AnonymousClass16I r50, C27261Nn r51, AnonymousClass185 r52, AnonymousClass171 r53, AnonymousClass1NM r54, C19970wo r55, C19420v0 r56, C18820ts r57, AnonymousClass1HK r58, C20310xM r59, C25821Hu r60, C24541Cv r61, AnonymousClass12P r62, AnonymousClass17T r63, C230416y r64, AnonymousClass12O r65, C20810yC r66, C20500xf r67, C21010yW r68, C27251Nm r69, AnonymousClass19A r70, C238019x r71, AnonymousClass1NJ r72, AnonymousClass1C6 r73, C19770wU r74) {
        C19970wo r23 = r55;
        AnonymousClass00C.A0D(r23, 1);
        C20810yC r18 = r66;
        AnonymousClass00C.A0D(r18, 2);
        AnonymousClass1NH r36 = r38;
        AnonymousClass00C.A0D(r36, 3);
        AnonymousClass17Y r33 = r41;
        AnonymousClass00C.A0D(r33, 4);
        C19700wN r35 = r39;
        AnonymousClass00C.A0D(r35, 5);
        C19770wU r15 = r74;
        AnonymousClass00C.A0D(r15, 6);
        AnonymousClass17T r20 = r63;
        AnonymousClass00C.A0D(r20, 7);
        C21010yW r16 = r68;
        AnonymousClass00C.A0D(r16, 8);
        C21100yf r32 = r42;
        AnonymousClass00C.A0D(r32, 9);
        AnonymousClass1C6 r13 = r73;
        AnonymousClass00C.A0D(r13, 10);
        AnonymousClass1HK r21 = r58;
        AnonymousClass00C.A0D(r21, 11);
        C20500xf r17 = r67;
        AnonymousClass00C.A0D(r17, 12);
        AnonymousClass19A r14 = r70;
        AnonymousClass00C.A0D(r14, 13);
        AnonymousClass171 r24 = r53;
        AnonymousClass00C.A0D(r24, 14);
        AnonymousClass16D r27 = r49;
        AnonymousClass00C.A0D(r27, 15);
        C18820ts r22 = r57;
        AnonymousClass00C.A0D(r22, 16);
        C26861Lu r34 = r40;
        AnonymousClass00C.A0D(r34, 18);
        AnonymousClass16I r26 = r50;
        AnonymousClass00C.A0D(r26, 19);
        AnonymousClass12O r19 = r65;
        AnonymousClass00C.A0D(r19, 20);
        C24541Cv r12 = r61;
        AnonymousClass00C.A0D(r12, 21);
        AnonymousClass19J r31 = r43;
        AnonymousClass00C.A0D(r31, 22);
        C25791Hr r30 = r44;
        AnonymousClass00C.A0D(r30, 23);
        AnonymousClass1NJ r2 = r72;
        AnonymousClass00C.A0D(r2, 24);
        AnonymousClass12P r6 = r62;
        AnonymousClass00C.A0D(r6, 25);
        C19420v0 r9 = r56;
        AnonymousClass00C.A0D(r9, 26);
        AnonymousClass185 r11 = r52;
        AnonymousClass00C.A0D(r11, 27);
        C20310xM r8 = r59;
        AnonymousClass00C.A0D(r8, 28);
        AnonymousClass1NM r10 = r54;
        AnonymousClass00C.A0D(r10, 29);
        C238019x r3 = r71;
        AnonymousClass00C.A0D(r3, 30);
        C27191Ng r29 = r46;
        AnonymousClass00C.A0D(r29, 31);
        C27251Nm r4 = r69;
        AnonymousClass00C.A0D(r4, 33);
        C27261Nn r25 = r51;
        AnonymousClass00C.A0D(r25, 34);
        C230416y r5 = r64;
        AnonymousClass00C.A0D(r5, 35);
        C27181Nf r28 = r47;
        AnonymousClass00C.A0D(r28, 36);
        C25821Hu r7 = r60;
        AnonymousClass00C.A0D(r7, 37);
        this.A09 = r23;
        this.A0G = r18;
        this.A00 = r36;
        this.A02 = r33;
        this.A01 = r35;
        this.A0J = r15;
        this.A0E = r20;
        this.A0H = r16;
        this.A0O = r32;
        this.A0I = r13;
        this.A0C = r21;
        this.A0Z = r17;
        this.A0b = r14;
        this.A08 = r24;
        this.A06 = r27;
        this.A0B = r22;
        this.A05 = r48;
        this.A0N = r34;
        this.A07 = r26;
        this.A0Y = r19;
        this.A0D = r12;
        this.A0P = r31;
        this.A0Q = r30;
        this.A0d = r2;
        this.A0X = r6;
        this.A0A = r9;
        this.A0T = r11;
        this.A0V = r8;
        this.A0U = r10;
        this.A0c = r3;
        this.A03 = r29;
        this.A0R = r45;
        this.A0a = r4;
        this.A0S = r25;
        this.A0F = r5;
        this.A04 = r28;
        this.A0W = r7;
    }
}
