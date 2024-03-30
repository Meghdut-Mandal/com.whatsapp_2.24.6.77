package X;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.16D  reason: invalid class name */
public class AnonymousClass16D implements AnonymousClass169, AnonymousClass16A, AnonymousClass16B, AnonymousClass16C {
    public LruCache A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C19730wQ A02;
    public final C229216m A03;
    public final C230516z A04;
    public final C229516p A05;
    public final AnonymousClass16I A06;
    public final C229316n A07;
    public final AnonymousClass16K A08;
    public final C19970wo A09;
    public final C19630wG A0A;
    public final C19420v0 A0B;
    public final C18820ts A0C;
    public final AnonymousClass16J A0D;
    public final AnonymousClass16E A0E;
    public final C230416y A0F;
    public final AnonymousClass12O A0G;
    public final C20810yC A0H;
    public final C230116v A0I;
    public final AnonymousClass005 A0J;
    public final AnonymousClass005 A0K;

    public AnonymousClass16D(C19730wQ r5, C229216m r6, C229516p r7, AnonymousClass16I r8, C229316n r9, AnonymousClass16K r10, C19970wo r11, C19630wG r12, C19420v0 r13, C18820ts r14, AnonymousClass16J r15, AnonymousClass16E r16, C230416y r17, AnonymousClass12O r18, C20810yC r19, C230116v r20, C220112n r21, AnonymousClass005 r22, AnonymousClass005 r23) {
        C20810yC r3 = r19;
        C230516z r2 = new C230516z(r3, r21, new C18910u1((Object) null, new C36271k2(r12, r14, 0)));
        this.A09 = r11;
        this.A0H = r3;
        this.A02 = r5;
        this.A0A = r12;
        this.A0E = r16;
        this.A04 = r2;
        this.A0J = r22;
        this.A0C = r14;
        this.A06 = r8;
        this.A0D = r15;
        this.A0G = r18;
        this.A08 = r10;
        this.A0K = r23;
        this.A03 = r6;
        this.A0B = r13;
        this.A07 = r9;
        this.A05 = r7;
        this.A0I = r20;
        this.A0F = r17;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri A04(X.AnonymousClass141 r7, X.C21050ya r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0088
            X.16m r0 = r6.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0088
            X.0wQ r0 = r6.A02
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0088
            X.3IL r0 = r7.A0F
            if (r0 == 0) goto L_0x003c
            long r1 = r0.A00
            r3 = -2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r0, r1)
        L_0x002b:
            if (r4 == 0) goto L_0x0088
            r3 = r6
            X.0yC r2 = r6.A0H
            r1 = 5914(0x171a, float:8.287E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0050
            monitor-enter(r3)
            goto L_0x003e
        L_0x003c:
            r4 = 0
            goto L_0x002b
        L_0x003e:
            android.util.LruCache r1 = r6.A00     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x004b
            r0 = 20
            android.util.LruCache r1 = new android.util.LruCache     // Catch:{ all -> 0x004d }
            r1.<init>(r0)     // Catch:{ all -> 0x004d }
            r6.A00 = r1     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            r1 = 0
        L_0x0051:
            if (r1 == 0) goto L_0x005c
            java.lang.Object r0 = r1.get(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            return r0
        L_0x005c:
            if (r8 == 0) goto L_0x0088
            android.content.ContentResolver r0 = r8.A00     // Catch:{ SecurityException -> 0x0073, NullPointerException -> 0x006c }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.getContactLookupUri(r0, r4)     // Catch:{ SecurityException -> 0x0073, NullPointerException -> 0x006c }
            if (r1 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x005b
            r1.put(r4, r0)     // Catch:{ SecurityException -> 0x0073, NullPointerException -> 0x006c }
            return r0
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = "contactmanager/NPE"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L_0x0073:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contactmanager/permission problem:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0088:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16D.A04(X.141, X.0ya):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r2 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x00a0, B:38:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0108 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass141 A0F(java.lang.String r13) {
        /*
            r12 = this;
            r11 = 0
            if (r13 != 0) goto L_0x0004
            return r11
        L_0x0004:
            java.lang.String r0 = r13.trim()
            java.lang.String r6 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0022
            r0 = 0
            char r0 = r6.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L_0x0022
            r0 = 1
            java.lang.String r6 = r6.substring(r0)
        L_0x0022:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0029
            return r11
        L_0x0029:
            X.16p r7 = r12.A05
            r10 = r6
            r0 = 1
            X.14g r5 = new X.14g
            r5.<init>((boolean) r0)
            r5.A03()
            int r2 = r6.length()
            r0 = 5
            if (r2 < r0) goto L_0x005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "%"
            r1.append(r0)
            r0 = 5
            if (r2 <= r0) goto L_0x0053
            int r2 = r2 - r0
            r0 = 3
            int r0 = java.lang.Math.min(r2, r0)
            java.lang.String r10 = r6.substring(r0)
        L_0x0053:
            r1.append(r10)
            java.lang.String r10 = r1.toString()
        L_0x005a:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r4 = 0
            X.16r r0 = r7.A00     // Catch:{ IllegalStateException -> 0x00c6 }
            X.1M0 r8 = r0.get()     // Catch:{ IllegalStateException -> 0x00c6 }
            java.lang.String r3 = X.AnonymousClass2x7.A05     // Catch:{ all -> 0x00bc }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r1.<init>()     // Catch:{ all -> 0x00bc }
            r1.append(r10)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "@"
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "s.whatsapp.net"
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bc }
            r2[r4] = r0     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "GET_CONTACTS_BY_JID_PATTERN"
            android.database.Cursor r2 = X.C229416o.A03(r8, r3, r0, r2)     // Catch:{ all -> 0x00bc }
            int r4 = r2.getCount()     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00ac }
            r3.<init>(r4)     // Catch:{ all -> 0x00ac }
        L_0x0092:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a0
            X.141 r0 = X.C53712rl.A00(r2)     // Catch:{ all -> 0x00aa }
            r3.add(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x0092
        L_0x00a0:
            r2.close()     // Catch:{ all -> 0x00b9 }
            r8.close()     // Catch:{ IllegalStateException -> 0x00a7 }
            goto L_0x00d1
        L_0x00a7:
            r2 = move-exception
            r9 = r3
            goto L_0x00c7
        L_0x00aa:
            r1 = move-exception
            goto L_0x00b0
        L_0x00ac:
            r1 = move-exception
            r3 = r9
            if (r2 == 0) goto L_0x00b8
        L_0x00b0:
            r2.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b8:
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            r9 = r3
            goto L_0x00bd
        L_0x00bc:
            r1 = move-exception
        L_0x00bd:
            r8.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x00c6 }
        L_0x00c5:
            throw r1     // Catch:{ IllegalStateException -> 0x00c6 }
        L_0x00c6:
            r2 = move-exception
        L_0x00c7:
            java.lang.String r1 = "contactmanagerdb/getContactsByPhoneNumberLoose/"
            int r0 = r9.size()     // Catch:{ all -> 0x010a }
            X.C229516p.A0L(r2, r1, r4, r0)     // Catch:{ all -> 0x010a }
            r3 = r9
        L_0x00d1:
            X.C229516p.A0F(r7, r3)
            r3.size()
            r5.A00()
            r5 = 0
            java.util.Iterator r4 = r3.iterator()
            r3 = r11
        L_0x00e0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r2 = r4.next()
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A06(r0)
            if (r1 == 0) goto L_0x00e0
            boolean r0 = r2.A0z
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = r1.user
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0101
            return r2
        L_0x0101:
            int r5 = r5 + 1
            r3 = r2
            goto L_0x00e0
        L_0x0105:
            r0 = 1
            if (r5 != r0) goto L_0x0109
            return r3
        L_0x0109:
            return r11
        L_0x010a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16D.A0F(java.lang.String):X.141");
    }

    public void A0O(AnonymousClass141 r6) {
        r6.A0w = true;
        C229516p r2 = this.A05;
        C224214g r4 = new C224214g(true);
        r4.A03();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_spam_reported", Boolean.valueOf(r6.A0w));
        C229516p.A09(contentValues, r2, r6.A0H);
        StringBuilder sb = new StringBuilder();
        sb.append("updated is reported spam for jid=");
        sb.append(r6.A0H);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r4.A00());
        Log.i(sb.toString());
        this.A04.A0A(r6);
    }

    public void A0Y(GroupJid groupJid) {
        AnonymousClass141 A0D2 = A0D(groupJid);
        if (!A0D2.A0e) {
            if (C20800yB.A01(C21000yV.A02, this.A0H, 5021)) {
                A0D2.A0e = true;
                this.A05.A0U(A0D2);
                this.A04.A0A(A0D2);
            }
        }
    }

    public /* synthetic */ void BSM(UserJid userJid) {
    }

    public /* synthetic */ void BUY() {
    }

    private void A00(AnonymousClass141 r4, AnonymousClass11F r5) {
        String str;
        if (r4 != null && (r5 instanceof C223213v)) {
            C230116v r1 = this.A0I;
            if (r4.A0n) {
                if (C20800yB.A01(C21000yV.A02, r1.A01, 3519)) {
                    return;
                }
            }
            if (!(r5 instanceof AnonymousClass148)) {
                if (r5 instanceof C223313w) {
                    PhoneUserJid A0A2 = this.A0G.A0A((C223313w) r5);
                    if (A0A2 != null) {
                        AnonymousClass141 A082 = A08(A0A2);
                        if (A082 == null || !A082.A0B()) {
                            str = AnonymousClass3U8.A01(C203559oI.A00(), A0A2.user);
                            r4.A0P = str;
                        }
                        r4.A0P = A082.A0J();
                        r4.A0G = A082;
                        return;
                    }
                } else {
                    return;
                }
            }
            str = this.A0F.A00((C223213v) r5);
            if (str == null) {
                if (!AnonymousClass14B.A0F(r4.A0a)) {
                    str = r4.A0a;
                } else {
                    str = this.A0A.A01(R.string.f12nameremoved);
                }
            }
            r4.A0P = str;
        }
    }

    private void A03(List list) {
        C230516z r6 = this.A04;
        HashMap hashMap = new HashMap();
        List A0V = C007103b.A0V(list);
        C82073y6 r4 = C82073y6.A00;
        AnonymousClass00C.A0D(A0V, 0);
        AnonymousClass00C.A0D(r4, 1);
        ArrayList<AnonymousClass141> arrayList = new ArrayList<>();
        for (Object next : A0V) {
            if (((Boolean) r4.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        for (AnonymousClass141 r1 : arrayList) {
            hashMap.put(r1.A0H, r1);
        }
        r6.A01.putAll(hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        if (r2 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0082, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x006c, B:36:0x0079] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass141 A05(long r10) {
        /*
            r9 = this;
            X.16z r4 = r9.A04
            X.005 r3 = r4.A00
            r3.get()
            r1 = -2
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            java.lang.Object r7 = r3.get()
            X.141 r7 = (X.AnonymousClass141) r7
            if (r7 == 0) goto L_0x0038
            return r7
        L_0x0016:
            java.util.Map r4 = r4.A01
            monitor-enter(r4)
            java.util.Collection r0 = r4.values()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x0021:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0037
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x00a1 }
            X.141 r7 = (X.AnonymousClass141) r7     // Catch:{ all -> 0x00a1 }
            long r1 = r7.A0I()     // Catch:{ all -> 0x00a1 }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            return r7
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
        L_0x0038:
            X.16p r6 = r9.A05
            r0 = 1
            X.14g r5 = new X.14g
            r5.<init>((boolean) r0)
            r5.A03()
            r4 = 0
            r7 = 0
            X.16r r0 = r6.A00     // Catch:{ IllegalStateException -> 0x0091 }
            X.1M0 r8 = r0.get()     // Catch:{ IllegalStateException -> 0x0091 }
            java.lang.String r2 = X.AnonymousClass2x7.A07     // Catch:{ all -> 0x0084 }
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0084 }
            r1[r4] = r0     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "CONTACT"
            android.database.Cursor r2 = X.C229416o.A03(r8, r2, r0, r1)     // Catch:{ all -> 0x0084 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0067
            X.141 r7 = X.C53712rl.A00(r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            int r4 = r2.getCount()     // Catch:{ all -> 0x0073 }
            r2.close()     // Catch:{ all -> 0x0082 }
            r8.close()     // Catch:{ IllegalStateException -> 0x008f }
            goto L_0x0098
        L_0x0073:
            r1 = move-exception
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            r3 = 0
            if (r2 == 0) goto L_0x0081
        L_0x0079:
            r2.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0082 }
        L_0x0081:
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            goto L_0x0086
        L_0x0084:
            r1 = move-exception
            r3 = 0
        L_0x0086:
            r8.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x008f }
        L_0x008e:
            throw r1     // Catch:{ IllegalStateException -> 0x008f }
        L_0x008f:
            r1 = move-exception
            goto L_0x0093
        L_0x0091:
            r1 = move-exception
            r3 = 0
        L_0x0093:
            java.lang.String r0 = "contactmanagerdb/getContactById/"
            X.C229516p.A0L(r1, r0, r4, r3)     // Catch:{ all -> 0x009f }
        L_0x0098:
            X.C229516p.A0C(r6, r7)
            r5.A00()
            return r7
        L_0x009f:
            r0 = move-exception
            throw r0
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16D.A05(long):X.141");
    }

    public AnonymousClass141 A06(C177538dx r22, String str, String str2, long j) {
        AnonymousClass141 r1 = new AnonymousClass141(r22);
        A0W(r1, (UserJid) null, AnonymousClass3QL.A05, str, str2, 0, 0, j, false, false, false, false, false, false, false, false, false, false, false);
        return r1;
    }

    public AnonymousClass141 A07(AnonymousClass11F r3) {
        C19730wQ r1 = this.A02;
        if (r1.A0M(r3)) {
            r1.A0G();
            return r1.A0E;
        }
        boolean z = r3 instanceof C177638e7;
        C230516z r0 = this.A04;
        if (z) {
            return (AnonymousClass141) r0.A00.get();
        }
        return r0.A09(r3);
    }

    public AnonymousClass141 A08(AnonymousClass11F r3) {
        C19730wQ r1 = this.A02;
        if (!r1.A0M(r3)) {
            return A0E(r3, false);
        }
        r1.A0G();
        return r1.A0E;
    }

    public AnonymousClass141 A09(AnonymousClass11F r3) {
        C19730wQ r1 = this.A02;
        if (!r1.A0M(r3)) {
            return this.A04.A09(r3);
        }
        r1.A0G();
        return r1.A0E;
    }

    public AnonymousClass141 A0A(AnonymousClass11F r5) {
        C230516z r1 = this.A04;
        AnonymousClass141 A092 = r1.A09(r5);
        if (A092 == null) {
            A092 = this.A05.A0O(r5);
            A01(A092, r5);
            if (A092 != null) {
                Class<AnonymousClass11F> cls = AnonymousClass11F.class;
                if (A092.A06(cls) != null) {
                    Map map = r1.A01;
                    Jid A062 = A092.A06(cls);
                    C18740tg.A06(A062);
                    map.put(A062, A092);
                }
            }
        }
        return A092;
    }

    public AnonymousClass141 A0E(AnonymousClass11F r2, boolean z) {
        if (r2 == null) {
            return null;
        }
        if (r2 instanceof C177638e7) {
            return (AnonymousClass141) this.A04.A00.get();
        }
        if (z) {
            this.A04.A01.remove(r2);
        }
        return A0A(r2);
    }

    public UserJid A0G(GroupJid groupJid) {
        UserJid userJid;
        String str;
        int indexOf;
        String substring;
        AnonymousClass141 A082;
        if (groupJid == null || (A082 = A08(groupJid)) == null || (userJid = A082.A0I) == null) {
            userJid = null;
            if (!(groupJid == null || (str = groupJid.user) == null || (indexOf = str.indexOf("-")) == -1 || (substring = str.substring(0, indexOf)) == null)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("@");
                    sb.append("s.whatsapp.net");
                    String obj = sb.toString();
                    C222813r r0 = UserJid.Companion;
                    return C222813r.A01(obj);
                } catch (C19740wR unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jids/failed to get group creator jid from group jid: ");
                    sb2.append(groupJid.getRawString());
                    Log.w(sb2.toString());
                    return null;
                }
            }
        }
        return userJid;
    }

    public ArrayList A0H() {
        Cursor A032;
        C229516p r6 = this.A05;
        C224214g r5 = new C224214g(true);
        r5.A03();
        ArrayList arrayList = new ArrayList();
        C19730wQ r0 = r6.A03;
        r0.A0G();
        String A033 = AnonymousClass143.A03(r0.A03);
        String[] strArr = new String[1];
        if (A033 == null) {
            A033 = C177588e2.A00.getRawString();
        }
        int i = 0;
        strArr[0] = A033;
        try {
            AnonymousClass1M0 A034 = r6.A00.get();
            try {
                A032 = C229416o.A03(A034, AnonymousClass2x7.A02, "CONTACT", strArr);
                A032.getCount();
                i = A032.getCount();
                while (A032.moveToNext()) {
                    arrayList.add(C53712rl.A00(A032));
                }
                A032.close();
                A034.close();
            } catch (Throwable th) {
                A034.close();
                throw th;
            }
        } catch (IllegalStateException e) {
            C229516p.A0L(e, "contactmanagerdb/getAllIndividualContacts/", i, arrayList.size());
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        C229516p.A0F(r6, arrayList);
        arrayList.size();
        r5.A00();
        return arrayList;
        throw th;
    }

    public ArrayList A0I() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A05.A0P().iterator();
        while (it.hasNext()) {
            AnonymousClass141 r1 = (AnonymousClass141) it.next();
            if (r1.A0H instanceof AnonymousClass147) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public HashSet A0M(Collection collection) {
        AnonymousClass141 A072;
        if (collection == null || collection.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r0 = (AnonymousClass11F) it.next();
            if (!(r0 == null || (A072 = A07(r0)) == null)) {
                hashSet.add(A072);
            }
        }
        return hashSet;
    }

    public void A0N() {
        byte[] bArr = new byte[12];
        new Random().nextBytes(bArr);
        C19420v0.A00(this.A0B).putString("web_contact_checksum", Base64.encodeToString(bArr, 8)).apply();
    }

    public void A0P(AnonymousClass141 r13) {
        C1495671s B1k;
        C229516p r5 = this.A05;
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("given_name", (String) null);
        contentValues.put("display_name", (String) null);
        contentValues.put("raw_contact_id", -1);
        contentValues.put("sync_policy", 2);
        boolean z = false;
        contentValues.put("is_contact_synced", 0);
        try {
            AnonymousClass1M0 A042 = r5.A00.A04();
            try {
                B1k = A042.B1k();
                if (C229416o.A01(contentValues, A042, "wa_contacts", "wa_contacts._id = ?", new String[]{String.valueOf(r13.A0I())}) == 1) {
                    z = true;
                }
                B1k.A00();
                B1k.close();
                A042.close();
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to remove contact ");
            sb.append(r13.A0H);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        r13.A0P = null;
        r13.A0R = null;
        r13.A0F = new AnonymousClass3IL(-1, r13.A0F.A01);
        r13.A07 = 2;
        if (r13.A0G != null) {
            r13.A0G = null;
        }
        if (z) {
            ((AnonymousClass2ZF) r5.A08.get()).A01(Collections.singleton(r13));
        }
        C230516z r0 = this.A04;
        r0.A01.remove(r13.A0H);
        return;
        throw th;
    }

    public void A0Q(AnonymousClass141 r6) {
        C229516p r2 = this.A05;
        C224214g r4 = new C224214g(true);
        r4.A03();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("status_autodownload_disabled", Integer.valueOf(r6.A14 ? 1 : 0));
        C229516p.A09(contentValues, r2, r6.A0H);
        StringBuilder sb = new StringBuilder();
        sb.append("updated contact status autodownload jid=");
        sb.append(r6.A0H);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r4.A00());
        Log.i(sb.toString());
    }

    public void A0R(AnonymousClass141 r6) {
        C229516p r4 = this.A05;
        C224214g r3 = new C224214g(true);
        r3.A03();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("wa_name", r6.A0a);
        C229516p.A09(contentValues, r4, r6.A0H);
        StringBuilder sb = new StringBuilder();
        sb.append("updated whatsapp name for contact jid=");
        sb.append(r6.A0H);
        sb.append("");
        sb.append(" | time: ");
        sb.append(r3.A00());
        Log.i(sb.toString());
        this.A04.A0A(r6);
        A0N();
        this.A01.post(new C35651j2(this, r6, 35));
    }

    public void A0S(AnonymousClass141 r4) {
        this.A05.A0U(r4);
        this.A04.A0A(r4);
        this.A01.post(new C35671j4(this, 43));
    }

    public void A0T(AnonymousClass141 r6) {
        C229516p r2 = this.A05;
        C224214g r3 = new C224214g(true);
        r3.A03();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("photo_ts", Integer.valueOf(r6.A05));
        contentValues.put("thumb_ts", Integer.valueOf(r6.A06));
        contentValues.put("photo_id_timestamp", Long.valueOf(r6.A0C));
        C229516p.A09(contentValues, r2, r6.A0H);
        StringBuilder sb = new StringBuilder();
        sb.append("updated photo id for contact jid=");
        sb.append(r6.A0H);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r3.A00());
        Log.i(sb.toString());
        this.A04.A0A(r6);
    }

    public void A0U(AnonymousClass141 r4, AnonymousClass11F r5) {
        C229516p r2 = this.A05;
        AnonymousClass141 A0O = r2.A0O(r5);
        A0O.A0P = r4.A0J();
        A0O.A0R = r4.A0R;
        A0O.A0Q = r4.A0Q;
        r2.A0S(A0O);
        this.A01.post(new C35651j2(this, r5, 39));
    }

    public void A0V(AnonymousClass141 r26, AnonymousClass11F r27, Long l, String str, String str2) {
        Cursor A032;
        C229516p r6 = this.A05;
        long longValue = l.longValue();
        C21050ya A0O = r6.A04.A0O();
        if (A0O == null) {
            Log.w("contact-mgr-db/deleteContact cr=null");
        } else {
            String[] strArr = {"data1"};
            String valueOf = String.valueOf(longValue);
            String[] strArr2 = {valueOf, "vnd.android.cursor.item/phone_v2"};
            try {
                Uri uri = ContactsContract.Data.CONTENT_URI;
                A032 = A0O.A03(uri, strArr, "raw_contact_id = ? AND mimetype = ? ", strArr2, (String) null);
                if (A032 != null) {
                    if (A032.getCount() == 1) {
                        A0O.A01(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, longValue), (String) null, (String[]) null);
                    } else {
                        int i = 0;
                        int i2 = 0;
                        while (A032.moveToNext()) {
                            String string = A032.getString(A032.getColumnIndex("data1"));
                            if (AnonymousClass3U2.A04(string, str, str2) || str2 == null) {
                                A0O.A01(uri, "raw_contact_id = ? AND mimetype = ? AND data1 = ? ", new String[]{valueOf, "vnd.android.cursor.item/phone_v2", string});
                                i2++;
                            }
                            i++;
                        }
                        if (i == i2) {
                            A0O.A01(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, longValue), (String) null, (String[]) null);
                        }
                    }
                    A032.close();
                    A032.close();
                }
            } catch (Exception e) {
                C18740tg.A08("contact-mgr-db/delete unable to delete contact ", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        ((AnonymousClass2ZF) r6.A08.get()).A01(Collections.singleton(r26));
        this.A04.A01.remove(r27);
        return;
        throw th;
    }

    public void A0W(AnonymousClass141 r7, UserJid userJid, AnonymousClass3QL r9, String str, String str2, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        AnonymousClass1M0 A042;
        Log.i("addGroupChatContact");
        r7.A0P = str;
        r7.A0V = Long.toString(j);
        r7.A0i = z;
        r7.A13 = z2;
        r7.A0d = z3;
        r7.A11 = z4;
        r7.A02 = i;
        r7.A0I = userJid;
        r7.A0r = z5;
        r7.A09(r9);
        r7.A0j = z6;
        r7.A04 = i2;
        r7.A12 = z7;
        r7.A0M = str2;
        r7.A0p = z8;
        r7.A0c = z9;
        r7.A0h = z10;
        r7.A0e = z11;
        C229516p r4 = this.A05;
        C224214g r3 = new C224214g(true);
        r3.A03();
        AnonymousClass11F r0 = r7.A0H;
        if (r0 == null) {
            Log.w("contact-mgr-db/unable to add group chat with null jid");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("jid", r0.getRawString());
        contentValues.put("is_whatsapp_user", true);
        contentValues.put("status", r7.A0X);
        contentValues.put("status_timestamp", Long.valueOf(r7.A0D));
        contentValues.put("display_name", r7.A0J());
        contentValues.put("phone_label", r7.A0V);
        contentValues.put("history_sync_initial_phash", r7.A0S);
        try {
            A042 = r4.A00.A04();
            r7.A0L(C229416o.A00(contentValues, A042, "wa_contacts"));
            C229516p.A0D(r4, r7, (AnonymousClass144) r7.A06(AnonymousClass144.class));
            A042.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to add group chat ");
            sb.append(r7);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r3.A00();
        return;
        throw th;
    }

    public void A0X(C223213v r4) {
        A00(this.A04.A09(r4), r4);
        this.A01.post(new C35651j2(this, r4, 38));
    }

    public void A0e(UserJid userJid, int i, long j) {
        AnonymousClass1M0 A042;
        C229516p r5 = this.A05;
        long j2 = (long) i;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("disappearing_mode_duration", Long.valueOf(j2));
        contentValues.put("disappearing_mode_timestamp", Long.valueOf(j));
        try {
            A042 = r5.A00.A04();
            String A032 = AnonymousClass143.A03(userJid);
            C18740tg.A06(A032);
            C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{A032});
            A042.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update disappearing_mode_duration state  ");
            sb.append(userJid);
            sb.append(", ");
            sb.append(j2);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        this.A04.A01.remove(userJid);
        A0N();
        return;
        throw th;
    }

    public void A0f(UserJid userJid, String str, long j) {
        this.A05.A0V(userJid, str, j);
        this.A04.A01.remove(userJid);
        this.A01.post(new C35651j2(this, userJid, 42));
    }

    public void A0g(UserJid userJid, String str, String str2, long j) {
        AnonymousClass1M0 A042;
        C229516p r2 = this.A05;
        C224214g r4 = new C224214g(true);
        r4.A03();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("status", str);
        contentValues.put("status_timestamp", Long.valueOf(j));
        contentValues.put("status_emoji", str2);
        try {
            A042 = r2.A00.A04();
            C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{userJid.getRawString()});
            A042.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update contact text status ");
            sb.append(userJid);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r4.A00();
        this.A04.A01.remove(userJid);
        this.A01.post(new C35651j2(this, userJid, 32));
        return;
        throw th;
    }

    public void A0h(UserJid userJid, boolean z) {
        AnonymousClass1M0 A042;
        C229516p r3 = this.A05;
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_sidelist_synced", Boolean.valueOf(z));
        try {
            A042 = r3.A00.A04();
            C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{userJid.getRawString()});
            A042.close();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update contact sidelist sync ");
            sb.append(userJid);
            sb.append(", ");
            sb.append(z);
            C18740tg.A08(sb.toString(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        this.A04.A01.remove(userJid);
        return;
        throw th;
    }

    public void A0i(ArrayList arrayList) {
        C229516p.A0G(this.A05, arrayList, 1, false, false, false);
    }

    public void A0k(Collection collection) {
        AnonymousClass141 r2;
        C1495671s B1k;
        C229516p r1 = this.A05;
        if (!collection.isEmpty()) {
            C224214g r5 = new C224214g(true);
            r5.A03();
            ContentValues contentValues = new ContentValues(1);
            try {
                AnonymousClass1M0 A042 = r1.A00.A04();
                try {
                    B1k = A042.B1k();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass141 r9 = (AnonymousClass141) it.next();
                        AnonymousClass11F r22 = r9.A0H;
                        if (r22 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("contact-mgr-db/update contact skipped for jid=");
                            sb.append(r22);
                            Log.i(sb.toString());
                        } else {
                            contentValues.put("keep_timestamp", Long.valueOf(r9.A0B));
                            C229416o.A01(contentValues, A042, "wa_contacts", "_id = ?", new String[]{String.valueOf(r9.A0I())});
                        }
                    }
                    B1k.A00();
                    B1k.close();
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (IllegalArgumentException e) {
                C18740tg.A08("contact-mgr-db/unable to update keep timestamp ", e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            collection.size();
            r5.A00();
        }
        C230516z r52 = this.A04;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AnonymousClass141 r3 = (AnonymousClass141) it2.next();
            Jid A062 = r3.A06(AnonymousClass11F.class);
            if (!(A062 == null || (r2 = (AnonymousClass141) r52.A01.get(A062)) == null)) {
                r2.A0B = r3.A0B;
            }
        }
        return;
        throw th;
    }

    public void A0l(Collection collection) {
        C1495671s A002;
        String str;
        C229516p r10 = this.A05;
        C224214g r8 = new C224214g(true);
        r8.A03();
        ArrayList arrayList = new ArrayList();
        ContentValues contentValues = new ContentValues();
        try {
            AnonymousClass1M0 A042 = r10.A00.A04();
            try {
                A002 = A042.A00();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 r11 = (AnonymousClass141) it.next();
                    AnonymousClass11F r2 = r11.A0H;
                    if (r2 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("contact-mgr-db/update or add contact skipped for jid=");
                        sb.append(r2);
                        Log.i(sb.toString());
                    } else {
                        String rawString = r2.getRawString();
                        arrayList.add(r11);
                        contentValues.clear();
                        long A0I2 = r11.A0I();
                        if (A0I2 > 0) {
                            contentValues.put("_id", Long.valueOf(A0I2));
                        }
                        contentValues.put("jid", rawString);
                        contentValues.put("is_whatsapp_user", Boolean.valueOf(r11.A0z));
                        contentValues.put("status", r11.A0X);
                        contentValues.put("status_timestamp", Long.valueOf(r11.A0D));
                        AnonymousClass3IL r0 = r11.A0F;
                        Long l = null;
                        if (r0 != null) {
                            str = r0.A01;
                        } else {
                            str = null;
                        }
                        contentValues.put("number", str);
                        AnonymousClass3IL r02 = r11.A0F;
                        if (r02 != null) {
                            l = Long.valueOf(r02.A00);
                        }
                        contentValues.put("raw_contact_id", l);
                        if (r11.A0n) {
                            contentValues.put("raw_contact_id", -4L);
                        }
                        contentValues.put("display_name", r11.A0J());
                        contentValues.put("phone_type", r11.A0L);
                        contentValues.put("phone_label", r11.A0V);
                        contentValues.put("given_name", r11.A0R);
                        contentValues.put("family_name", r11.A0Q);
                        contentValues.put("sort_name", r11.A0W);
                        contentValues.put("photo_ts", Integer.valueOf(r11.A05));
                        contentValues.put("thumb_ts", Integer.valueOf(r11.A06));
                        contentValues.put("photo_id_timestamp", Long.valueOf(r11.A0C));
                        contentValues.put("history_sync_initial_phash", r11.A0S);
                        contentValues.put("wa_name", r11.A0a);
                        contentValues.put("nickname", r11.A0U);
                        contentValues.put("company", r11.A0O);
                        contentValues.put("title", r11.A0Z);
                        contentValues.put("is_spam_reported", Boolean.valueOf(r11.A0w));
                        contentValues.put("is_starred", Boolean.valueOf(r11.A0q));
                        contentValues.put("status_emoji", r11.A0Y);
                        if (C20800yB.A01(C21000yV.A02, r10.A06, 5868)) {
                            contentValues.put("is_wa_created_contact", Boolean.valueOf(r11.A0s));
                            contentValues.put("sync_policy", Integer.valueOf(r11.A07));
                        }
                        C229416o.A05(contentValues, A042, "wa_contacts");
                        if (r2 instanceof AnonymousClass147) {
                            C229516p.A0J(A002, A042, (AnonymousClass147) r2, r11.A0K);
                        }
                    }
                }
                A002.A00();
                A002.close();
                A042.close();
                ((AnonymousClass2ZF) r10.A08.get()).A00(arrayList);
                collection.size();
                r8.A00();
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
        } catch (IllegalArgumentException e) {
            C18740tg.A08("contact-mgr-db/unable to update or add contacts ", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            this.A04.A0A((AnonymousClass141) it2.next());
        }
        return;
        throw th;
    }

    public void A0m(List list) {
        C1495671s B1k;
        Cursor A032;
        C229516p r7 = this.A05;
        if (list.isEmpty()) {
            Log.i("contact-mgr-db/delete contacts called without any contacts");
            return;
        }
        C224214g r4 = new C224214g(true);
        r4.A03();
        try {
            C229716r r8 = r7.A00;
            AnonymousClass1M0 A042 = r8.A04();
            try {
                B1k = A042.B1k();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C229516p.A0I(B1k, (AnonymousClass141) it.next(), A042);
                }
                B1k.A00();
                A042.B5o(new C35651j2(r7, list, 45));
                B1k.close();
                A042.close();
                r4.A00();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass141 r9 = (AnonymousClass141) it2.next();
                    Jid A062 = r9.A06(AnonymousClass11F.class);
                    if (A062 != null) {
                        AnonymousClass1M0 A033 = r8.get();
                        try {
                            A032 = C229416o.A03(A033, "SELECT 1 FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE wa_contacts.jid = ?", "HAS_CONTACT_FOR_JID", new String[]{A062.getRawString()});
                            boolean moveToNext = A032.moveToNext();
                            A032.close();
                            A033.close();
                            if (!moveToNext) {
                                arrayList.add(r9);
                            }
                        } catch (Throwable th) {
                            try {
                                A033.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (AnonymousClass169 BZS : ((C19580wB) r7.A08.get()).getObservers()) {
                        BZS.BZS(arrayList);
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                A042.close();
                throw th3;
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to delete contacts ");
            sb.append(list);
            C18740tg.A08(sb.toString(), e);
            return;
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th;
        throw th;
    }

    public void A0n(List list) {
        C229516p.A0G(this.A05, list, 0, false, false, false);
        A03(list);
    }

    public void A0o(List list) {
        C229516p.A0G(this.A05, list, 0, true, false, false);
        A03(list);
    }

    public boolean A0p() {
        int i;
        Cursor A032;
        Integer num;
        C229516p r6 = this.A05;
        synchronized (r6.A09) {
            i = -1;
            if (r6.A01 == null) {
                C19730wQ r0 = r6.A03;
                r0.A0G();
                PhoneUserJid phoneUserJid = r0.A03;
                if (phoneUserJid != null) {
                    C224214g r7 = new C224214g(true);
                    r7.A03();
                    AnonymousClass1M0 A033 = r6.A00.get();
                    try {
                        A032 = C229416o.A03(A033, "SELECT count(*) AS _count FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND wa_contacts.jid != ?", "initIndividualContactCount", new String[]{phoneUserJid.getRawString()});
                        if (A032.moveToNext()) {
                            int i2 = A032.getInt(A032.getColumnIndexOrThrow("_count"));
                            r7.A00();
                            num = Integer.valueOf(i2);
                        } else {
                            Log.w("contact-mgr-db/individual contact count missing cursor");
                            num = null;
                        }
                        r6.A01 = num;
                        A032.close();
                        A033.close();
                    } catch (Throwable th) {
                        try {
                            A033.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            Integer num2 = r6.A01;
            if (num2 != null) {
                i = num2.intValue();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("indivcount/count ");
        sb.append(i);
        Log.i(sb.toString());
        if (i > 0) {
            return true;
        }
        return false;
        throw th;
    }

    public void BQY() {
        AnonymousClass16I r1 = this.A06;
        C19730wQ r0 = this.A02;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        r1.A02(phoneUserJid);
    }

    public void BSP(UserJid userJid) {
        this.A04.A01.remove(userJid);
    }

    public void BUR(AnonymousClass141 r4) {
        C230516z r2 = this.A04;
        r2.A01.remove(r4.A06(AnonymousClass11F.class));
    }

    public void BUW(Collection collection) {
        this.A01.post(new C35651j2(this, collection, 34));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C230516z r2 = this.A04;
            r2.A01.remove(((AnonymousClass141) it.next()).A06(AnonymousClass11F.class));
        }
    }

    public void BUX(Collection collection, boolean z) {
        if (z) {
            this.A04.A01.clear();
            AnonymousClass16I r2 = this.A06;
            for (C226815j A032 : r2.getObservers()) {
                A032.A03();
            }
            r2.A04(collection);
        }
    }

    public void BZS(Collection collection) {
        Iterator it = this.A07.getObservers().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onJidsRemoved");
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AnonymousClass141 r1 = (AnonymousClass141) it2.next();
            AnonymousClass16K r0 = this.A08;
            r0.A03(r1);
            r0.A04(r1);
        }
    }

    private void A01(AnonymousClass141 r3, AnonymousClass11F r4) {
        String string;
        A00(r3, r4);
        if (r3 != null && (r4 instanceof UserJid)) {
            UserJid userJid = (UserJid) r4;
            if (C197029b1.A00(userJid)) {
                AnonymousClass005 r1 = this.A0J;
                if (((AnonymousClass1HX) r1.get()).A00.A00()) {
                    string = ((AnonymousClass1HX) r1.get()).A03(userJid);
                } else {
                    Context context = this.A0A.A00;
                    AnonymousClass00C.A0D(context, 0);
                    string = context.getString(R.string.f12nameremoved);
                    AnonymousClass00C.A08(string);
                }
                r3.A0P = string;
            }
        }
    }

    public static void A02(String str, Collection collection) {
        int size = collection.size();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/count ");
        sb.append(size);
        Log.i(sb.toString());
    }

    @Deprecated
    public AnonymousClass141 A0B(AnonymousClass11F r2) {
        return A0A(r2);
    }

    @Deprecated
    public AnonymousClass141 A0C(AnonymousClass11F r2) {
        return A0D(r2);
    }

    public AnonymousClass141 A0D(AnonymousClass11F r3) {
        AnonymousClass141 A082 = A08(r3);
        if (A082 != null) {
            return A082;
        }
        AnonymousClass141 r1 = new AnonymousClass141(r3);
        this.A05.A0T(r1);
        return r1;
    }

    public ArrayList A0J(Set set) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList A072 = C229516p.A07(this.A05, false);
        ArrayList arrayList = new ArrayList();
        Iterator it = A072.iterator();
        while (it.hasNext()) {
            AnonymousClass141 r2 = (AnonymousClass141) it.next();
            AnonymousClass11F r1 = r2.A0H;
            if ((r2.A0C() && !AnonymousClass143.A0I(r1)) || set.contains(r1)) {
                arrayList.add(r2);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("returned ");
        sb.append(arrayList.size());
        sb.append(" sidelist sync pending contacts | time: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        Log.i(sb.toString());
        return arrayList;
    }

    public HashMap A0K(Collection collection) {
        C1495671s B1k;
        int i;
        Throwable th;
        HashMap hashMap = new HashMap(collection.size(), 1.0f);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r2 = (AnonymousClass11F) it.next();
            C19730wQ r1 = this.A02;
            if (r1.A0M(r2)) {
                r1.A0G();
                hashMap.put(r2, r1.A0E);
            }
            if (r2 instanceof C177638e7) {
                hashMap.put(r2, this.A04.A00.get());
            }
        }
        collection.removeAll(hashMap.keySet());
        ConditionVariable conditionVariable = C18740tg.A00;
        HashMap hashMap2 = new HashMap(collection.size(), 1.0f);
        HashSet hashSet = new HashSet(collection.size(), 1.0f);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            AnonymousClass11F r12 = (AnonymousClass11F) it2.next();
            AnonymousClass141 A092 = this.A04.A09(r12);
            if (A092 != null) {
                hashMap2.put(r12, A092);
            } else {
                hashSet.add(r12);
            }
        }
        C229516p r10 = this.A05;
        int min = Math.min(975, 975);
        C224214g r9 = new C224214g(true);
        r9.A03();
        HashMap hashMap3 = new HashMap(hashSet.size(), 1.0f);
        HashSet hashSet2 = new HashSet();
        AnonymousClass72Z r13 = new AnonymousClass72Z(AnonymousClass143.A0O(hashSet), min);
        AnonymousClass1M0 A042 = r10.A00.A04();
        try {
            Iterator it3 = r13.iterator();
            while (it3.hasNext()) {
                String[] strArr = (String[]) it3.next();
                int length = strArr.length;
                int i2 = 0;
                boolean z = false;
                if (length <= 975) {
                    z = true;
                }
                C18740tg.A0E(z, "SQL param length exceeded");
                try {
                    String str = AnonymousClass2x7.A07;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT ");
                    sb.append(C73993kt.A00);
                    sb.append(" FROM ");
                    sb.append("wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid)");
                    sb.append(" WHERE ");
                    sb.append("wa_contacts.jid IN ");
                    sb.append(AnonymousClass1M2.A00(length));
                    sb.append(" ORDER BY ");
                    sb.append("wa_contacts.jid");
                    Cursor A032 = C229416o.A03(A042, sb.toString(), "CONTACTS_BULK", strArr);
                    try {
                        int count = A032.getCount();
                        while (A032.moveToNext()) {
                            try {
                                AnonymousClass141 A002 = C53712rl.A00(A032);
                                i2++;
                                AnonymousClass141 A062 = C229516p.A06(A002, (AnonymousClass141) hashMap3.get(A002.A0H));
                                hashMap3.put(A062.A0H, A062);
                                if (A002.A0F == null) {
                                    hashSet2.add(A002);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i = i2;
                                i2 = count;
                                try {
                                    A032.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (IllegalStateException e) {
                                        e = e;
                                        C229516p.A0L(e, "contactmanagerdb/fetchContacts/", i2, i);
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            A032.close();
                        } catch (IllegalStateException e2) {
                            e = e2;
                            i = i2;
                            i2 = count;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i = 0;
                        if (A032 == null) {
                            throw th;
                        }
                        A032.close();
                        throw th;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    i = 0;
                    C229516p.A0L(e, "contactmanagerdb/fetchContacts/", i2, i);
                }
            }
            Collection values = hashMap3.values();
            if (hashSet2.size() != 0) {
                B1k = A042.B1k();
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    AnonymousClass141 r14 = (AnonymousClass141) it4.next();
                    if (!values.contains(r14)) {
                        C229516p.A0B(r10, r14);
                    }
                }
                B1k.A00();
                B1k.close();
            }
            C229516p.A0F(r10, values);
            A042.close();
            r9.A01();
            for (Map.Entry entry : hashMap3.entrySet()) {
                A01((AnonymousClass141) entry.getValue(), (AnonymousClass11F) entry.getKey());
                C230516z r15 = this.A04;
                AnonymousClass141 r3 = (AnonymousClass141) entry.getValue();
                if (r3 != null) {
                    Class<AnonymousClass11F> cls = AnonymousClass11F.class;
                    if (r3.A06(cls) != null) {
                        Map map = r15.A01;
                        Jid A063 = r3.A06(cls);
                        C18740tg.A06(A063);
                        map.put(A063, r3);
                    }
                }
                hashMap2.put(entry.getKey(), entry.getValue());
            }
            hashMap.putAll(hashMap2);
            return hashMap;
        } catch (Throwable th5) {
            try {
                A042.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
        throw th;
    }

    public HashMap A0L(Collection collection) {
        HashMap A0K2 = A0K(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r2 = (AnonymousClass11F) it.next();
            if (!A0K2.containsKey(r2)) {
                AnonymousClass141 r1 = new AnonymousClass141(r2);
                A0K2.put(r2, r1);
                this.A05.A0T(r1);
            }
        }
        return A0K2;
    }

    public void A0Z(GroupJid groupJid, int i) {
        AnonymousClass141 A0D2 = A0D(groupJid);
        if (A0D2.A03 != i) {
            A0D2.A03 = i;
            this.A05.A0U(A0D2);
            this.A04.A0A(A0D2);
        }
    }

    public void A0a(GroupJid groupJid, boolean z) {
        AnonymousClass141 A0D2 = A0D(groupJid);
        if (A0D2.A0r != z) {
            A0D2.A0r = z;
            this.A05.A0U(A0D2);
            this.A04.A0A(A0D2);
        }
    }

    public void A0b(AnonymousClass147 r3, int i) {
        AnonymousClass141 A0D2 = A0D(r3);
        if (A0D2.A02 != i) {
            A0D2.A02 = i;
            this.A05.A0U(A0D2);
            this.A04.A0A(A0D2);
        }
    }

    public void A0c(AnonymousClass147 r3, AnonymousClass3QL r4) {
        AnonymousClass141 A0D2 = A0D(r3);
        A0D2.A09(r4);
        this.A05.A0U(A0D2);
        this.A04.A0A(A0D2);
    }

    public void A0d(AnonymousClass147 r3, boolean z) {
        AnonymousClass141 A0D2 = A0D(r3);
        if (A0D2.A0v != z) {
            A0D2.A0v = z;
            this.A05.A0U(A0D2);
            this.A04.A0A(A0D2);
        }
    }

    public void A0j(Collection collection) {
        AnonymousClass1M0 A042;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass141 r3 = (AnonymousClass141) it.next();
            C229516p r4 = this.A05;
            Jid A062 = r3.A06(UserJid.class);
            boolean z = r3.A0z;
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("is_whatsapp_user", Boolean.valueOf(z));
            try {
                A042 = r4.A00.A04();
                String A032 = AnonymousClass143.A03(A062);
                C18740tg.A06(A032);
                C229416o.A01(contentValues, A042, "wa_contacts", "jid = ?", new String[]{A032});
                A042.close();
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("contact-mgr-db/unable to update is_whatsapp_user state  ");
                sb.append(A062);
                sb.append(", ");
                sb.append(z);
                C18740tg.A08(sb.toString(), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            this.A04.A0A(r3);
            this.A01.post(new C35651j2(this, r3, 36));
        }
        return;
        throw th;
    }

    public boolean A0q(UserJid userJid) {
        AnonymousClass3IL r0;
        AnonymousClass141 A082 = A08(userJid);
        if (A082 == null || (r0 = A082.A0F) == null || TextUtils.isEmpty(r0.A01)) {
            return false;
        }
        return true;
    }

    public void BUU(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C230516z r2 = this.A04;
            r2.A01.remove(((AnonymousClass141) it.next()).A06(AnonymousClass11F.class));
        }
        this.A01.post(new C35651j2(this, collection, 33));
    }
}
