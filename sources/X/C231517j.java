package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.17j  reason: invalid class name and case insensitive filesystem */
public class C231517j {
    public final C19730wQ A00;
    public final AnonymousClass12P A01;
    public final C231817m A02;
    public final AnonymousClass12O A03;
    public final C231917n A04;
    public final C231617k A05;
    public final C232117p A06;
    public final AnonymousClass005 A07;
    public volatile String A08;

    public void A06() {
        String str;
        synchronized (this) {
            C19730wQ r2 = this.A00;
            r2.A0G();
            if (r2.A02 == null) {
                str = null;
            } else {
                HashSet hashSet = new HashSet(this.A04.A00().keySet());
                r2.A0G();
                hashSet.add(r2.A02);
                str = AnonymousClass6UD.A03(hashSet);
            }
            this.A08 = str;
        }
    }

    public static C20760y7 A00(C20760y7 r5, UserJid userJid) {
        HashSet hashSet = new HashSet();
        C225614x it = r5.iterator();
        while (it.hasNext()) {
            DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(userJid, ((Jid) it.next()).getDevice());
            boolean z = false;
            if (fromUserJidAndDeviceIdNullable != null) {
                z = true;
            }
            C18740tg.A0D(z, "DeviceJid must not be null");
            if (fromUserJidAndDeviceIdNullable != null) {
                hashSet.add(fromUserJidAndDeviceIdNullable);
            }
        }
        return C20760y7.copyOf((Collection) hashSet);
    }

    public static void A01(C20760y7 r6, C20760y7 r7, C20760y7 r8, C231517j r9, UserJid userJid) {
        boolean z;
        PhoneUserJid A0A;
        PhoneUserJid A0A2;
        C1495671s B1k;
        PhoneUserJid A0A3;
        AnonymousClass3OB r3 = (AnonymousClass3OB) r9.A07.get();
        if (!r8.isEmpty()) {
            if (r3.A05.A0X()) {
                r3.A0B.Boy(new C81193wc(r3, r8, 22));
            } else {
                AnonymousClass187 r2 = r3.A06;
                r2.A00.execute(new C81193wc(r3, r8, 23));
            }
        }
        if (!r7.isEmpty() && !r8.isEmpty()) {
            HashSet hashSet = new HashSet(r6);
            hashSet.removeAll(r8);
            hashSet.addAll(r7);
            AnonymousClass17X r0 = r3.A09;
            C20760y7 copyOf = C20760y7.copyOf((Collection) hashSet);
            C232317r r5 = r0.A07;
            if (!copyOf.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("participant-user-store/onDevicesRefreshed/");
                sb.append(userJid);
                sb.append("/");
                sb.append(copyOf);
                Log.i(sb.toString());
                HashSet A0F = r5.A0F(userJid);
                HashMap hashMap = new HashMap();
                Iterator it = A0F.iterator();
                while (it.hasNext()) {
                    AnonymousClass6X6 A0C = r5.A0C((AnonymousClass144) it.next());
                    C121165sh A0A4 = A0C.A0A(copyOf, userJid);
                    if (A0C.A00 != 0 && AnonymousClass143.A0I(userJid)) {
                        boolean A0P = A0C.A0P(r5.A01);
                        AnonymousClass6PM A082 = A0C.A08(userJid);
                        if (A082 != null && ((A082.A01 != 0 || A0P) && (A0A3 = r5.A08.A0A((C223313w) userJid)) != null)) {
                            A0C.A0A(C232317r.A01(copyOf, A0A3), A0A3);
                        }
                    }
                    if (A0A4.A00 || A0A4.A01) {
                        hashMap.put(A0C, Boolean.valueOf(A0A4.A02));
                    }
                }
                if (!hashMap.isEmpty()) {
                    AnonymousClass1M0 A052 = r5.A06.A05();
                    try {
                        B1k = A052.B1k();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            C232317r.A07((AnonymousClass6X6) entry.getKey(), r5, userJid, ((Boolean) entry.getValue()).booleanValue());
                        }
                        B1k.A00();
                        B1k.close();
                        A052.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            A052.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (!r7.isEmpty()) {
            C232317r r4 = r3.A09.A07;
            if (!r7.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("participant-user-store/onDevicesAdded/");
                sb2.append(userJid);
                sb2.append("/");
                sb2.append(r7);
                Log.i(sb2.toString());
                HashSet A0F2 = r4.A0F(userJid);
                HashSet hashSet2 = new HashSet();
                Iterator it2 = A0F2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass6X6 A0C2 = r4.A0C((AnonymousClass144) it2.next());
                    C232317r.A04(r7, A0C2, r4, userJid);
                    if (A0C2.A00 != 0 && AnonymousClass143.A0I(userJid)) {
                        boolean A0P2 = A0C2.A0P(r4.A01);
                        AnonymousClass6PM A083 = A0C2.A08(userJid);
                        if (A083 != null && ((A083.A01 != 0 || A0P2) && (A0A2 = r4.A08.A0A((C223313w) userJid)) != null)) {
                            C232317r.A04(C232317r.A01(r7, A0A2), A0C2, r4, A0A2);
                        }
                    }
                    hashSet2.add(A0C2);
                }
                C232317r.A08(r4, userJid, hashSet2, false);
                return;
            }
            return;
        } else if (!r8.isEmpty()) {
            C232317r r52 = r3.A09.A07;
            if (!r8.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("participant-user-store/onDevicesRemoved/");
                sb3.append(userJid);
                sb3.append("/");
                sb3.append(r8);
                Log.i(sb3.toString());
                HashSet A0F3 = r52.A0F(userJid);
                HashSet hashSet3 = new HashSet();
                boolean z2 = false;
                Iterator it3 = A0F3.iterator();
                while (it3.hasNext()) {
                    AnonymousClass6X6 A0C3 = r52.A0C((AnonymousClass144) it3.next());
                    boolean A0N = A0C3.A0N(r8, userJid);
                    if (A0C3.A00 != 0 && AnonymousClass143.A0I(userJid)) {
                        boolean A0P3 = A0C3.A0P(r52.A01);
                        AnonymousClass6PM A084 = A0C3.A08(userJid);
                        if (A084 != null && ((A084.A01 != 0 || A0P3) && (A0A = r52.A08.A0A((C223313w) userJid)) != null)) {
                            z = A0C3.A0N(C232317r.A01(r8, A0A), A0A);
                            z2 = z2 | z | A0N;
                            hashSet3.add(A0C3);
                        }
                    }
                    z = false;
                    z2 = z2 | z | A0N;
                    hashSet3.add(A0C3);
                }
                C232317r.A08(r52, userJid, hashSet3, z2);
                return;
            }
            return;
        } else {
            return;
        }
        throw th;
    }

    public static void A02(C20760y7 r13, C20760y7 r14, C20760y7 r15, C231517j r16, UserJid userJid, boolean z, boolean z2) {
        AnonymousClass3OB r7 = (AnonymousClass3OB) r16.A07.get();
        C20760y7 r10 = r15;
        UserJid userJid2 = userJid;
        if (!r15.isEmpty()) {
            HashSet A0G = r7.A09.A07.A0G(r15);
            boolean z3 = z2;
            if (r7.A05.A0X()) {
                r7.A0B.Boy(new C1502674p(r7, A0G, userJid2, r10, 4, z3));
            }
            AnonymousClass187 r0 = r7.A06;
            r0.A00.execute(new C1502674p(r7, A0G, userJid2, r10, 5, z3));
        }
        if (!r14.isEmpty() || !r15.isEmpty() || !z) {
            if (r7.A04.A2C() && z) {
                r14.toString();
                r15.toString();
                C19730wQ r2 = r7.A00;
                if (r2.A0M(userJid2)) {
                    Iterator it = r7.A02.A04().iterator();
                    while (it.hasNext()) {
                        r2.A0M((AnonymousClass11F) it.next());
                    }
                } else if (!r13.isEmpty()) {
                    if (r7.A02.A0E(userJid2)) {
                        C20310xM r4 = r7.A08;
                        C238019x r3 = r7.A0A;
                        C181088mu r02 = new C181088mu(r3.A01.A02(userJid2, true), C19970wo.A00(r7.A03));
                        r02.A0q(userJid2);
                        r4.A0P(r02);
                    }
                    Iterator it2 = AnonymousClass3OB.A00(r7, userJid2).iterator();
                    while (it2.hasNext()) {
                        C20310xM r42 = r7.A08;
                        C238019x r32 = r7.A0A;
                        C181088mu r03 = new C181088mu(r32.A01.A02((AnonymousClass11F) it2.next(), true), C19970wo.A00(r7.A03));
                        r03.A0q(userJid2);
                        r42.A0P(r03);
                    }
                }
            }
        } else if (r7.A04.A2C()) {
            if (r7.A02.A0E(userJid2)) {
                C20310xM r43 = r7.A08;
                C238019x r33 = r7.A0A;
                C181088mu r04 = new C181088mu(r33.A01.A02(userJid2, true), C19970wo.A00(r7.A03));
                r04.A0q(userJid2);
                r43.A0P(r04);
            }
            Iterator it3 = AnonymousClass3OB.A00(r7, userJid2).iterator();
            while (it3.hasNext()) {
                C20310xM r44 = r7.A08;
                C238019x r34 = r7.A0A;
                C181088mu r05 = new C181088mu(r34.A01.A02((AnonymousClass11F) it3.next(), true), C19970wo.A00(r7.A03));
                r05.A0q(userJid2);
                r44.A0P(r05);
            }
        }
        if (r7.A00.A0M(userJid2)) {
            AnonymousClass6XG.A02(C67643aF.A00, r15);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.2cI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.2cH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.2cI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.2cI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.2cI} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r10.A00 != 1) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r7 = X.C52772q9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        X.AnonymousClass00C.A0D(r12, 1);
        r6 = r5.A00;
        r11 = r6.A0M(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r11 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r8.B5o(new X.C35691j6(r5, 44));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r4 = (X.C20390xU) r5.A01.A01(X.C20390xU.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r4.A01.A0M(r12) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        X.C18740tg.A0D(false, "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged: Only SMB supports CoEx!");
        r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged invalid for this application";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r5.A02, 7564) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r2 = new X.C45222Qn();
        r2.A04 = r12.user;
        r2.A01 = java.lang.Boolean.valueOf(r11);
        r2.A00 = java.lang.Boolean.valueOf(r3);
        r2.A03 = java.lang.Long.valueOf((long) r6.A04());
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r7 != X.C52772q9.A02) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r2.A02 = java.lang.Integer.valueOf(r0);
        r5.A03.Bly(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r4.A02.A00, 6939) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r7 != X.C52772q9.A02) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r2 = r4.A00;
        r1 = new java.lang.StringBuilder();
        r1.append("ADV: ");
        r1.append(r7);
        r2.A0E("unexpected-hosted-device", r1.toString(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r8 = (X.C20310xM) r4.A06.getValue();
        r4.A05.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r8.A0j.A08(r12) != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cc, code lost:
        if (r7 != X.C52772q9.A02) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        r3 = r8.A1A;
        r0 = X.C19970wo.A00(r8.A0C);
        r4 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (r8.A07.A0M(r12) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        r4 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r10 = new X.AnonymousClass2cH(r3.A01.A02(r12, true), r0);
        r0 = com.whatsapp.jid.UserJid.Companion;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        if (X.C222813r.A00(r12) == null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        r10.A00 = r4;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        X.C20310xM.A05(r8, r10, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0102, code lost:
        if (r8.A0R(r10, -1).A01 != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0104, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("BusinessPrivacySystemMessageUpdater/insert transitional system message for jid: ");
        r1.append(r12);
        r1.append(" failed");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011c, code lost:
        r2 = r8.A1D;
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0121, code lost:
        if (r7 != X.C52772q9.A02) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0123, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0124, code lost:
        r1 = r2.A02;
        r2 = X.C19970wo.A00(r2.A00);
        r4 = X.AnonymousClass3U8.A07(r12);
        r10 = new X.AnonymousClass2cI(r1.A01.A02(r12, true), 69, r2);
        r10.A00 = r9;
        r10.A01 = r4;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0143, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0146, code lost:
        r7 = X.C52772q9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0150, code lost:
        if (r1 != r10.A00) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r1 == 1) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r5 = r11.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r10 == null) goto L_0x0146;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C26901Ly r8, X.AnonymousClass3QO r9, X.AnonymousClass3QO r10, X.C231517j r11, com.whatsapp.jid.UserJid r12) {
        /*
            if (r9 != 0) goto L_0x0006
            if (r10 != 0) goto L_0x0006
        L_0x0004:
            r3 = 1
        L_0x0005:
            return r3
        L_0x0006:
            r0 = 1
            if (r9 != 0) goto L_0x014a
            int r1 = r10.A00
        L_0x000b:
            if (r1 != r0) goto L_0x0004
        L_0x000d:
            X.17p r5 = r11.A06
            if (r10 == 0) goto L_0x0146
            int r1 = r10.A00
            r0 = 1
            if (r1 != r0) goto L_0x0146
            X.2q9 r7 = X.C52772q9.HOSTED
        L_0x0018:
            r0 = 1
            X.AnonymousClass00C.A0D(r12, r0)
            X.0wQ r6 = r5.A00
            boolean r11 = r6.A0M(r12)
            if (r11 != 0) goto L_0x002e
            r1 = 44
            X.1j6 r0 = new X.1j6
            r0.<init>(r5, r1)
            r8.B5o(r0)
        L_0x002e:
            X.0y9 r1 = r5.A01
            java.lang.Class<X.0xU> r0 = X.C20390xU.class
            X.00M r4 = r1.A01(r0)
            X.0xU r4 = (X.C20390xU) r4
            r3 = 0
            X.0wQ r0 = r4.A01
            boolean r0 = r0.A0M(r12)
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged: Only SMB supports CoEx!"
            X.C18740tg.A0D(r3, r0)
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged invalid for this application"
        L_0x0048:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004b:
            r3 = 0
        L_0x004c:
            X.0yC r2 = r5.A02
            r1 = 7564(0x1d8c, float:1.06E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0005
            X.2Qn r2 = new X.2Qn
            r2.<init>()
            java.lang.String r0 = r12.user
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r2.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A00 = r0
            int r0 = r6.A04()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            X.2q9 r1 = X.C52772q9.HOSTED
            r0 = 1
            if (r7 != r1) goto L_0x007e
            r0 = 0
        L_0x007e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.0yW r0 = r5.A03
            r0.Bly(r2)
            return r3
        L_0x008a:
            X.1OF r0 = r4.A02
            X.0yC r2 = r0.A00
            r1 = 6939(0x1b1b, float:9.724E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x00b5
            X.2q9 r0 = X.C52772q9.HOSTED
            if (r7 != r0) goto L_0x00b5
            X.0wN r2 = r4.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ADV: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "unexpected-hosted-device"
            r2.A0E(r0, r1, r3)
            goto L_0x004b
        L_0x00b5:
            X.00T r0 = r4.A06
            java.lang.Object r8 = r0.getValue()
            X.0xM r8 = (X.C20310xM) r8
            X.005 r0 = r4.A05
            r0.get()
            X.17T r0 = r8.A0j
            boolean r0 = r0.A08(r12)
            if (r0 != 0) goto L_0x011c
            X.2q9 r0 = X.C52772q9.HOSTED
            if (r7 != r0) goto L_0x011c
            X.19x r3 = r8.A1A
            X.0wo r0 = r8.A0C
            long r0 = X.C19970wo.A00(r0)
            X.0wQ r2 = r8.A07
            boolean r2 = r2.A0M(r12)
            r4 = 16
            if (r2 == 0) goto L_0x00e2
            r4 = 17
        L_0x00e2:
            X.19w r3 = r3.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r12, r2)
            X.2cH r10 = new X.2cH
            r10.<init>(r2, r0)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r12)
            if (r0 == 0) goto L_0x00f8
            r10.A00 = r4
        L_0x00f8:
            r0 = -1
            X.C20310xM.A05(r8, r10, r0)
            X.34U r0 = r8.A0R(r10, r0)
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0143
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/insert transitional system message for jid: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " failed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0048
        L_0x011c:
            X.1GA r2 = r8.A1D
            X.2q9 r0 = X.C52772q9.HOSTED
            r9 = 1
            if (r7 != r0) goto L_0x0124
            r9 = 5
        L_0x0124:
            X.19x r1 = r2.A02
            X.0wo r0 = r2.A00
            long r2 = X.C19970wo.A00(r0)
            java.lang.String r4 = X.AnonymousClass3U8.A07(r12)
            X.19w r1 = r1.A01
            r0 = 1
            X.3Qa r1 = r1.A02(r12, r0)
            r0 = 69
            X.2cI r10 = new X.2cI
            r10.<init>(r1, r0, r2)
            r10.A00 = r9
            r10.A01 = r4
            goto L_0x00f8
        L_0x0143:
            r3 = 1
            goto L_0x004c
        L_0x0146:
            X.2q9 r7 = X.C52772q9.E2EE
            goto L_0x0018
        L_0x014a:
            int r1 = r9.A00
            if (r10 == 0) goto L_0x000b
            int r0 = r10.A00
            if (r1 == r0) goto L_0x0004
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231517j.A03(X.1Ly, X.3QO, X.3QO, X.17j, com.whatsapp.jid.UserJid):boolean");
    }

    public C20070wy A04() {
        C225614x it = this.A04.A00().entrySet().iterator();
        C20090x0 r3 = new C20090x0();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((AnonymousClass3SB) entry.getValue()).A02()) {
                r3.put(entry.getKey(), entry.getValue());
            }
        }
        return r3.build();
    }

    public C20070wy A05(UserJid userJid) {
        C20070wy build;
        String valueOf;
        C20070wy r0;
        UserJid userJid2 = userJid;
        C18740tg.A0F(!this.A00.A0M(userJid2), "only get user for others");
        C231617k r4 = this.A05;
        Map map = r4.A04.A00;
        if (map.containsKey(userJid2) && (r0 = (C20070wy) map.get(userJid2)) != null) {
            return r0;
        }
        C219712j r10 = r4.A01;
        long A072 = r10.A07(userJid2);
        AnonymousClass1M0 A042 = r4.A02.get();
        try {
            synchronized (r4) {
                Cursor A09 = A042.A02.A09("SELECT device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id = ?", "GET_DEVICE_JIDS_BY_USER_JID_SQL", new String[]{Long.toString(A072)});
                try {
                    C20090x0 r18 = new C20090x0();
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("device_jid_row_id");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("key_index");
                    HashSet hashSet = new HashSet();
                    while (A09.moveToNext()) {
                        long j = A09.getLong(columnIndexOrThrow);
                        long j2 = A09.getLong(columnIndexOrThrow2);
                        Jid A092 = r10.A09(j);
                        DeviceJid of = DeviceJid.of(A092);
                        if (of != null) {
                            boolean z = false;
                            if (of.getDevice() == 0) {
                                z = true;
                            }
                            if ((z && j2 == 0) || ((!z) && j2 > 0)) {
                                r18.put(of, Long.valueOf(j2));
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("DeviceStore/getDevicesForUser/invalid devices jid=");
                        sb.append(A092);
                        sb.append("; deviceJidRowId=");
                        sb.append(j);
                        sb.append("; keyIndex=");
                        sb.append(j2);
                        Log.e(sb.toString());
                        if (of == null) {
                            C19700wN r13 = r4.A00;
                            if (A092 == null) {
                                valueOf = String.valueOf(j);
                            } else {
                                valueOf = String.valueOf(A092.getType());
                            }
                            r13.A0E("invalid-device", valueOf, false);
                        } else {
                            hashSet.add(of);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        r4.A05.Boy(new C35631j0(r4, userJid2, hashSet, 15));
                    }
                    build = r18.build();
                    map.put(userJid2, build);
                    C18740tg.A06(build);
                    A09.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            A042.close();
            return build;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
        throw th;
    }

    public void A07() {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A01.A05();
        try {
            C1495671s B1k2 = A052.B1k();
            try {
                C231817m r4 = this.A02;
                AnonymousClass1M0 A053 = r4.A01.A05();
                try {
                    B1k = A053.B1k();
                    A053.A02.A03("user_device_info", (String) null, "CLEAR_ALL_USER_DEVICE_INFO_TABLE", (String[]) null);
                    B1k.A00();
                    Map map = r4.A03;
                    Objects.requireNonNull(map);
                    A053.B5o(new C35691j6(map, 40));
                    B1k.close();
                    A053.close();
                    C231617k r42 = this.A05;
                    A053 = r42.A02.A05();
                    B1k = A053.B1k();
                    A053.A02.A03("user_device", (String) null, "CLEAR_ALL_USER_DEVICE_TABLE", (String[]) null);
                    B1k.A00();
                    C231717l r2 = r42.A04;
                    Objects.requireNonNull(r2);
                    A053.B5o(new C35691j6(r2, 43));
                    B1k.close();
                    A053.close();
                    B1k2.A00();
                    B1k2.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                B1k2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public void A09(C20760y7 r18, UserJid userJid, String str) {
        C1495671s B1k;
        C1495671s B1k2;
        UserJid userJid2 = userJid;
        C18740tg.A0F(!this.A00.A0M(userJid2), "only remove device for others");
        C20760y7 r7 = r18;
        C18740tg.A0F(!r7.contains(userJid2.getPrimaryDevice()), "never remove primary device.");
        Set<UserJid> A0G = this.A03.A0G(userJid2);
        String str2 = str;
        if (!r7.isEmpty()) {
            HashMap hashMap = new HashMap();
            AnonymousClass1M0 A052 = this.A01.A05();
            try {
                B1k2 = A052.B1k();
                for (UserJid userJid3 : A0G) {
                    C20760y7 keySet = A05(userJid3).keySet();
                    hashMap.put(userJid3, keySet);
                    C20760y7 A002 = A00(r7, userJid3);
                    if (str != null) {
                        C231817m r3 = this.A02;
                        if (!A03(A052, r3.A01(userJid3), (AnonymousClass3QO) null, this, userJid3)) {
                            B1k2.close();
                            A052.close();
                            return;
                        }
                        r3.A04(userJid3);
                        this.A05.A04(userJid3);
                    } else {
                        this.A05.A02(A002, userJid3);
                    }
                    A02(keySet, C20760y7.of(), A002, this, userJid3, false, "identity_changed".equals(str2));
                }
                B1k2.A00();
                B1k2.close();
                A052.close();
                for (UserJid userJid4 : A0G) {
                    Object obj = hashMap.get(userJid4);
                    C18740tg.A06(obj);
                    A01((C20760y7) obj, C20760y7.of(), A00(r7, userJid4), this, userJid4);
                }
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (str != null) {
            AnonymousClass1M0 A053 = this.A01.A05();
            try {
                B1k = A053.B1k();
                Iterator it = A0G.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        B1k.A00();
                        break;
                    }
                    UserJid userJid5 = (UserJid) it.next();
                    C231817m r1 = this.A02;
                    if (A03(A053, r1.A01(userJid5), (AnonymousClass3QO) null, this, userJid5)) {
                        r1.A04(userJid5);
                        this.A05.A04(userJid5);
                    }
                }
                B1k.close();
                A053.close();
                return;
            } catch (Throwable th3) {
                th = th3;
                A053.close();
                throw th;
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }

    public void A0A(C20760y7 r23, boolean z) {
        Log.i("DeviceManager/removeMyDevices/start");
        C19730wQ r2 = this.A00;
        r2.A0G();
        C20760y7 r5 = r23;
        C18740tg.A0F(!r5.contains(r2.A02), "never remove my primary device.");
        if (!r5.isEmpty()) {
            r2.A0G();
            PhoneUserJid phoneUserJid = r2.A03;
            C18740tg.A06(phoneUserJid);
            AnonymousClass1M0 A052 = this.A01.A05();
            try {
                C1495671s B1k = A052.B1k();
                try {
                    C231917n r6 = this.A04;
                    C20760y7 keySet = r6.A00().keySet();
                    if (z) {
                        AnonymousClass1M0 A042 = r6.A02.A04();
                        try {
                            C1495671s B1k2 = A042.B1k();
                            try {
                                synchronized (r6) {
                                    long A002 = C19970wo.A00(r6.A01);
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("logout_time", Long.valueOf(A002));
                                    String[] A0O = AnonymousClass143.A0O(r5);
                                    String join = TextUtils.join(", ", Collections.nCopies(A0O.length, "?"));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("device_id IN (");
                                    sb.append(join);
                                    sb.append(")");
                                    String obj = sb.toString();
                                    A042.A02.A01(contentValues, "devices", obj, "markDeviceLoggedOut/UPDATE_DEVICES", A0O);
                                    B1k2.A00();
                                    r6.A00 = null;
                                }
                                B1k2.close();
                                A042.close();
                            } catch (Throwable th) {
                                B1k2.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            A042.close();
                            throw th2;
                        }
                    } else {
                        r6.A01(r5);
                    }
                    C20760y7 r17 = r5;
                    A02(keySet, C20760y7.of(), r17, this, phoneUserJid, false, false);
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    A06();
                    A01(keySet, C20760y7.of(), r5, this, phoneUserJid);
                    C223313w A082 = r2.A08();
                    if (A082 != null) {
                        A01(A00(keySet, A082), C20760y7.of(), A00(r5, A082), this, A082);
                    }
                } catch (Throwable th3) {
                    B1k.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    A052.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        }
        Log.i("DeviceManager/removeMyDevices/done");
    }

    public void A0B(AnonymousClass3SB r22) {
        UserJid userJid;
        boolean z;
        boolean z2;
        Log.i("DeviceManager/addMyDevice/start");
        AnonymousClass3SB r8 = r22;
        DeviceJid deviceJid = r8.A07;
        boolean A0I = AnonymousClass143.A0I(deviceJid);
        C19730wQ r3 = this.A00;
        if (A0I) {
            userJid = r3.A09();
        } else {
            r3.A0G();
            userJid = r3.A03;
            C18740tg.A06(userJid);
        }
        C20760y7 of = C20760y7.of(deviceJid);
        AnonymousClass1M0 A052 = this.A01.A05();
        try {
            C1495671s B1k = A052.B1k();
            try {
                C231917n r6 = this.A04;
                C20760y7 keySet = r6.A00().keySet();
                AnonymousClass1M0 A042 = r6.A02.A04();
                try {
                    C1495671s B1k2 = A042.B1k();
                    try {
                        synchronized (r6) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("device_id", deviceJid.getRawString());
                            contentValues.put("platform_type", Integer.valueOf(r8.A08.value));
                            contentValues.put("device_os", r8.A09);
                            contentValues.put("last_active", Long.valueOf(r8.A00));
                            contentValues.put("login_time", Long.valueOf(r8.A05));
                            contentValues.put("logout_time", Long.valueOf(r8.A01));
                            contentValues.put("adv_key_index", Integer.valueOf(r8.A04));
                            contentValues.put("place_name", r8.A03);
                            C198959eT r9 = r8.A06;
                            if (r9 != null) {
                                z = r9.A05;
                            } else {
                                z = false;
                            }
                            int i = 1;
                            int i2 = 0;
                            if (z) {
                                i2 = 1;
                            }
                            contentValues.put("support_bot_user_agent_chat_history", Integer.valueOf(i2));
                            if (r9 == null || !r9.A06) {
                                i = 0;
                            }
                            contentValues.put("support_cag_reactions_and_polls_history", Integer.valueOf(i));
                            if (r9 != null) {
                                z2 = r9.A08;
                            } else {
                                z2 = false;
                            }
                            AnonymousClass3SW.A02(contentValues, "support_recent_sync_chunk_message_tuning", z2);
                            A042.A02.A07("devices", "addDevice/REPLACE_DEVICES", contentValues);
                            B1k2.A00();
                            r6.A00 = null;
                        }
                        B1k2.close();
                        A042.close();
                        A02(keySet, of, C20760y7.of(), this, userJid, false, false);
                        B1k.A00();
                        B1k.close();
                        A052.close();
                        A06();
                        A01(keySet, of, C20760y7.of(), this, userJid);
                        C223313w A082 = r3.A08();
                        if ((userJid instanceof PhoneUserJid) && A082 != null) {
                            A01(A00(keySet, A082), A00(of, A082), C20760y7.of(), this, A082);
                        }
                        Log.i("DeviceManager/addMyDevice/done");
                    } catch (Throwable th) {
                        B1k2.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A042.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                B1k.close();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A052.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public C231517j(C19730wQ r1, AnonymousClass12P r2, C231817m r3, AnonymousClass12O r4, C231917n r5, C231617k r6, C232117p r7, AnonymousClass005 r8) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
    }

    public void A08(C20760y7 r5) {
        C1495671s B1k;
        if (!r5.isEmpty()) {
            AnonymousClass1M0 A052 = this.A01.A05();
            try {
                B1k = A052.B1k();
                this.A04.A01(r5);
                B1k.A00();
                B1k.close();
                A052.close();
                A06();
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
