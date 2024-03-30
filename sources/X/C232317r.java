package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.17r  reason: invalid class name and case insensitive filesystem */
public class C232317r {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass12g A03;
    public final C232617u A04;
    public final C219712j A05;
    public final AnonymousClass12P A06;
    public final C232817w A07;
    public final AnonymousClass12O A08;
    public final C231417i A09;
    public final C230717b A0A;
    public final C19770wU A0B;
    public final C232417s A0C;
    public final C19970wo A0D;
    public final C220412q A0E;
    public final C232917x A0F = new C232917x(this);
    public final AnonymousClass005 A0G;

    public static void A07(AnonymousClass6X6 r6, C232317r r7, UserJid userJid, boolean z) {
        UserJid userJid2 = userJid;
        AnonymousClass6PM A082 = r6.A08(userJid);
        AnonymousClass144 r3 = r6.A05;
        if (A082 != null) {
            r7.A07.A02(C20760y7.copyOf(A082.A04.values()), r3, userJid2, A00(r7, userJid));
        }
        if (z) {
            r7.A07.A03(r3);
        }
    }

    public boolean A0L(AnonymousClass141 r6, AnonymousClass144 r7) {
        GroupJid groupJid;
        if (!(r7 == null || r6 == null || !(r7 instanceof AnonymousClass147) || r6.A0J() == null || (groupJid = (GroupJid) r6.A06(GroupJid.class)) == null)) {
            C220412q r2 = this.A0E;
            return r2.A06(groupJid) != 1 && (!r2.A0Q(groupJid) || ((C235718z) this.A0G.get()).A03);
        }
    }

    public static C20760y7 A01(C20760y7 r4, UserJid userJid) {
        HashSet hashSet = new HashSet();
        try {
            C225614x it = r4.iterator();
            while (it.hasNext()) {
                hashSet.add(DeviceJid.Companion.A01(userJid, ((Jid) it.next()).getDevice()));
            }
        } catch (C19740wR e) {
            Log.e((Throwable) e);
        }
        return C20760y7.copyOf((Collection) hashSet);
    }

    public static AnonymousClass6PM A02(AnonymousClass6PM r7, UserJid userJid) {
        C20760y7 copyOf = C20760y7.copyOf(r7.A04.values());
        HashSet hashSet = new HashSet();
        C225614x it = copyOf.iterator();
        while (it.hasNext()) {
            AnonymousClass6B1 r4 = (AnonymousClass6B1) it.next();
            try {
                hashSet.add(new AnonymousClass6B1(DeviceJid.Companion.A01(userJid, r4.A02.getDevice()), r4.A01, r4.A00));
            } catch (C19740wR unused) {
                Log.e("participant-user-store/generateDevicesForJid/invalid device jid");
            }
        }
        return new AnonymousClass6PM(userJid, hashSet, r7.A01, r7.A02);
    }

    public static UserJid A03(C232317r r1, UserJid userJid) {
        if (userJid.equals(C223613z.A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append("participant-user-store/sanitizeParticipantJid/my jid = ");
            C19730wQ r12 = r1.A01;
            r12.A0G();
            sb.append(r12.A03);
            Log.i(sb.toString());
            r12.A0G();
            PhoneUserJid phoneUserJid = r12.A03;
            C18740tg.A06(phoneUserJid);
            return phoneUserJid;
        } else if (!userJid.equals(C177648e8.A00)) {
            return userJid;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("participant-user-store/sanitizeParticipantJid/my lid jid = ");
            C19730wQ r13 = r1.A01;
            sb2.append(r13.A08());
            Log.i(sb2.toString());
            return r13.A08();
        }
    }

    public static void A05(AnonymousClass6PM r2) {
        C225614x it = C20760y7.copyOf(r2.A04.values()).iterator();
        while (it.hasNext()) {
            ((AnonymousClass6B1) it.next()).A01 = false;
        }
    }

    public static void A08(C232317r r4, UserJid userJid, Set set, boolean z) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = r4.A06.A05();
        try {
            B1k = A052.B1k();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A07((AnonymousClass6X6) it.next(), r4, userJid, z);
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
        throw th;
    }

    public static boolean A09(C232317r r6, AnonymousClass144 r7, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("participant-user-store/removeGroupParticipant/");
        sb.append(r7);
        sb.append(" ");
        sb.append(j);
        Log.i(sb.toString());
        String valueOf = String.valueOf(r6.A05.A07(r7));
        AnonymousClass1M0 A052 = r6.A06.A05();
        try {
            boolean z = false;
            if (A052.A02.A03("group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "removeGroupParticipant/DELETE_GROUP_PARTICIPANT_USER", new String[]{valueOf, String.valueOf(j)}) != 0) {
                z = true;
            }
            A052.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public int A0A(AnonymousClass144 r8) {
        Cursor A092;
        StringBuilder sb = new StringBuilder();
        sb.append("participant-user-store/getGroupParticipantsCount/");
        sb.append(r8);
        Log.i(sb.toString());
        int A0B2 = A0B(r8);
        if (A0B2 != -1) {
            return A0B2;
        }
        String valueOf = String.valueOf(this.A05.A07(r8));
        AnonymousClass1M0 A042 = this.A06.get();
        try {
            A092 = A042.A02.A09("SELECT COUNT(1) as count FROM group_participant_user WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANTS_COUNT_SQL", new String[]{valueOf});
            if (A092.moveToFirst()) {
                int i = A092.getInt(A092.getColumnIndexOrThrow("count"));
                A092.close();
                A042.close();
                return i;
            }
            A092.close();
            A042.close();
            return 0;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public int A0B(AnonymousClass144 r3) {
        AnonymousClass6X6 A092;
        StringBuilder sb = new StringBuilder();
        sb.append("participant-user-store/getGroupParticipantsCountFromCacheIfAvailable/");
        sb.append(r3);
        Log.i(sb.toString());
        C232617u r1 = this.A04;
        AnonymousClass00C.A0D(r3, 0);
        if (!r1.A07.containsKey(r3) || (A092 = r1.A09(r3)) == null) {
            return -1;
        }
        return A092.A08.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04fe, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ff, code lost:
        X.C05600Qi.A00(r24, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0504, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x023a, code lost:
        if (r5 != null) goto L_0x023c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6X6 A0C(X.AnonymousClass144 r40) {
        /*
            r39 = this;
            r0 = r39
            X.17u r5 = r0.A04
            X.17x r4 = r0.A0F
            r0 = 0
            r3 = r40
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            java.util.Map r0 = r5.A07
            r38 = r0
            java.lang.Object r2 = r0.get(r3)
            X.6X6 r2 = (X.AnonymousClass6X6) r2
            if (r2 != 0) goto L_0x0508
            X.12P r0 = r5.A03
            X.1M0 r24 = r0.get()
            X.17v r1 = r5.A01     // Catch:{ all -> 0x04fc }
            int r0 = r3.hashCode()     // Catch:{ all -> 0x04fc }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x04fc }
            int r0 = r0 % 128
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04fc }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00     // Catch:{ all -> 0x04fc }
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x04fc }
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x04fc }
            r0.<init>()     // Catch:{ all -> 0x04fc }
            r1.putIfAbsent(r2, r0)     // Catch:{ all -> 0x04fc }
        L_0x0042:
            java.lang.Object r23 = r1.get(r2)     // Catch:{ all -> 0x04fc }
            X.C18740tg.A06(r23)     // Catch:{ all -> 0x04fc }
            X.AnonymousClass00C.A08(r23)     // Catch:{ all -> 0x04fc }
            monitor-enter(r23)     // Catch:{ all -> 0x04fc }
            r0 = r38
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x04f9 }
            X.6X6 r2 = (X.AnonymousClass6X6) r2     // Catch:{ all -> 0x04f9 }
            if (r2 != 0) goto L_0x04f7
            X.12O r0 = r5.A04     // Catch:{ all -> 0x04f9 }
            r37 = r0
            X.17r r1 = r4.A00     // Catch:{ all -> 0x04f9 }
            X.17b r0 = r1.A0A     // Catch:{ all -> 0x04f9 }
            r36 = r0
            int r0 = r0.A01(r3)     // Catch:{ all -> 0x04f9 }
            X.6X6 r2 = new X.6X6     // Catch:{ all -> 0x04f9 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x04f9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f5 }
            r4.<init>()     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "participant-user-store/migrated="
            r4.append(r0)     // Catch:{ all -> 0x04f5 }
            r0 = 1
            r4.append(r0)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04f5 }
            X.144 r7 = r2.A05     // Catch:{ all -> 0x04f5 }
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04f5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f5 }
            r4.<init>()     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "participant-user-store/getGroupParticipantsOptimized/"
            r4.append(r0)     // Catch:{ all -> 0x04f5 }
            r4.append(r7)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04f5 }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x04f5 }
            r0.<init>()     // Catch:{ all -> 0x04f5 }
            X.12j r6 = r1.A05     // Catch:{ all -> 0x04f5 }
            long r4 = r6.A07(r7)     // Catch:{ all -> 0x04f5 }
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x04f5 }
            X.12P r4 = r1.A06     // Catch:{ all -> 0x04f5 }
            X.1M0 r22 = r4.get()     // Catch:{ all -> 0x04f5 }
            r4 = r22
            X.14e r9 = r4.A02     // Catch:{ all -> 0x04eb }
            java.lang.String r8 = "SELECT user_jid_row_id, pending, rank, device_jid_row_id, sent_sender_key, sent_add_on_sender_key FROM group_participant_user JOIN group_participant_device ON group_participant_row_id = group_participant_user._id WHERE group_jid_row_id = ?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x04eb }
            r4 = 0
            r5[r4] = r10     // Catch:{ all -> 0x04eb }
            java.lang.String r4 = "GET_GROUP_PARTICIPANT_USERS_SQL_OPTIMIZED"
            android.database.Cursor r4 = r9.A09(r8, r4, r5)     // Catch:{ all -> 0x04eb }
            java.lang.String r5 = "user_jid_row_id"
            int r19 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x04df }
            java.lang.String r5 = "device_jid_row_id"
            int r15 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x04df }
            java.lang.String r5 = "rank"
            int r14 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x04df }
            java.lang.String r5 = "pending"
            int r13 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x04df }
            java.lang.String r5 = "sent_sender_key"
            int r12 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x04df }
            java.lang.String r5 = "sent_add_on_sender_key"
            int r10 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x04df }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x04df }
            r16.<init>()     // Catch:{ all -> 0x04df }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x04df }
            r9.<init>()     // Catch:{ all -> 0x04df }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x04df }
            r8.<init>()     // Catch:{ all -> 0x04df }
        L_0x00f3:
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x04df }
            if (r5 == 0) goto L_0x0147
            r5 = r19
            long r27 = r4.getLong(r5)     // Catch:{ all -> 0x04df }
            long r29 = r4.getLong(r15)     // Catch:{ all -> 0x04df }
            int r26 = r4.getInt(r14)     // Catch:{ all -> 0x04df }
            int r11 = r4.getInt(r13)     // Catch:{ all -> 0x04df }
            r5 = 1
            r31 = 0
            if (r11 != r5) goto L_0x0112
            r31 = 1
        L_0x0112:
            int r11 = r4.getInt(r12)     // Catch:{ all -> 0x04df }
            r32 = 0
            if (r11 != r5) goto L_0x011c
            r32 = 1
        L_0x011c:
            boolean r11 = r4.isNull(r10)     // Catch:{ all -> 0x04df }
            if (r11 != 0) goto L_0x012a
            int r11 = r4.getInt(r10)     // Catch:{ all -> 0x04df }
            r33 = 1
            if (r11 == r5) goto L_0x012c
        L_0x012a:
            r33 = 0
        L_0x012c:
            java.lang.Long r5 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x04df }
            r9.add(r5)     // Catch:{ all -> 0x04df }
            java.lang.Long r5 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x04df }
            r8.add(r5)     // Catch:{ all -> 0x04df }
            X.9N8 r5 = new X.9N8     // Catch:{ all -> 0x04df }
            r25 = r5
            r25.<init>(r26, r27, r29, r31, r32, r33)     // Catch:{ all -> 0x04df }
            r11 = r16
            r11.add(r5)     // Catch:{ all -> 0x04df }
            goto L_0x00f3
        L_0x0147:
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.util.HashMap r21 = r6.A0D(r5, r9)     // Catch:{ all -> 0x04df }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r5 = com.whatsapp.jid.DeviceJid.class
            java.util.HashMap r20 = r6.A0D(r5, r8)     // Catch:{ all -> 0x04df }
            r8 = 0
            java.util.Iterator r19 = r16.iterator()     // Catch:{ all -> 0x04df }
        L_0x0158:
            boolean r5 = r19.hasNext()     // Catch:{ all -> 0x04df }
            if (r5 == 0) goto L_0x026c
            java.lang.Object r9 = r19.next()     // Catch:{ all -> 0x04df }
            X.9N8 r9 = (X.AnonymousClass9N8) r9     // Catch:{ all -> 0x04df }
            long r5 = r9.A02     // Catch:{ all -> 0x04df }
            r34 = r5
            java.lang.Long r6 = java.lang.Long.valueOf(r34)     // Catch:{ all -> 0x04df }
            r5 = r21
            java.lang.Object r10 = r5.get(r6)     // Catch:{ all -> 0x04df }
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x04df }
            long r5 = r9.A01     // Catch:{ all -> 0x04df }
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x04df }
            r5 = r20
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x04df }
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5     // Catch:{ all -> 0x04df }
            if (r10 != 0) goto L_0x018a
            java.lang.String r5 = "participant-user-store/getGroupParticipants invalid jid from db"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x04df }
            goto L_0x0158
        L_0x018a:
            com.whatsapp.jid.UserJid r11 = A03(r1, r10)     // Catch:{ all -> 0x04df }
            X.0wQ r6 = r1.A01     // Catch:{ all -> 0x04df }
            boolean r6 = r6.A0M(r10)     // Catch:{ all -> 0x04df }
            if (r6 == 0) goto L_0x01be
            if (r8 != 0) goto L_0x01bb
            java.lang.String r6 = "participant-user-store/getGroupParticipants/found orphaned me participant"
            com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ all -> 0x04df }
            X.0wN r12 = r1.A00     // Catch:{ all -> 0x04df }
            java.lang.String r10 = "participant-user-orphaned-me"
            java.lang.Class r6 = r7.getClass()     // Catch:{ all -> 0x04df }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x04df }
            r6 = 0
            r12.A0E(r10, r8, r6)     // Catch:{ all -> 0x04df }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x04df }
            r12.<init>()     // Catch:{ all -> 0x04df }
            int r10 = r9.A00     // Catch:{ all -> 0x04df }
            boolean r6 = r9.A03     // Catch:{ all -> 0x04df }
            X.6PM r8 = new X.6PM     // Catch:{ all -> 0x04df }
            r8.<init>(r11, r12, r10, r6)     // Catch:{ all -> 0x04df }
        L_0x01bb:
            r33 = r8
            goto L_0x01e5
        L_0x01be:
            boolean r6 = r0.containsKey(r11)     // Catch:{ all -> 0x04df }
            if (r6 == 0) goto L_0x01d3
            java.lang.Object r13 = r0.get(r11)     // Catch:{ all -> 0x04df }
            X.6PM r13 = (X.AnonymousClass6PM) r13     // Catch:{ all -> 0x04df }
        L_0x01ca:
            X.C18740tg.A06(r13)     // Catch:{ all -> 0x04df }
            com.whatsapp.jid.UserJid r6 = r13.A03     // Catch:{ all -> 0x04df }
            r0.put(r6, r13)     // Catch:{ all -> 0x04df }
            goto L_0x01e2
        L_0x01d3:
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x04df }
            r12.<init>()     // Catch:{ all -> 0x04df }
            int r10 = r9.A00     // Catch:{ all -> 0x04df }
            boolean r6 = r9.A03     // Catch:{ all -> 0x04df }
            X.6PM r13 = new X.6PM     // Catch:{ all -> 0x04df }
            r13.<init>(r11, r12, r10, r6)     // Catch:{ all -> 0x04df }
            goto L_0x01ca
        L_0x01e2:
            r33 = r8
            r8 = r13
        L_0x01e5:
            X.17w r10 = r1.A07     // Catch:{ all -> 0x04df }
            boolean r13 = r9.A05     // Catch:{ all -> 0x04df }
            boolean r14 = r9.A04     // Catch:{ all -> 0x04df }
            r12 = 0
            if (r5 == 0) goto L_0x0268
            X.0wQ r6 = r10.A01     // Catch:{ all -> 0x04df }
            boolean r9 = r6.A0M(r11)     // Catch:{ all -> 0x04df }
            if (r9 == 0) goto L_0x023c
            com.whatsapp.jid.UserJid r9 = r5.userJid     // Catch:{ all -> 0x04df }
            boolean r9 = r6.A0M(r9)     // Catch:{ all -> 0x04df }
            if (r9 != 0) goto L_0x023c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x04df }
            r15.<init>()     // Catch:{ all -> 0x04df }
            java.lang.String r9 = "participant-device-store/getParticipantDevices/invalid self device: "
            r15.append(r9)     // Catch:{ all -> 0x04df }
            r15.append(r5)     // Catch:{ all -> 0x04df }
            java.lang.String r9 = r15.toString()     // Catch:{ all -> 0x04df }
            com.whatsapp.util.Log.w((java.lang.String) r9)     // Catch:{ all -> 0x04df }
            X.0wN r9 = r10.A00     // Catch:{ all -> 0x04df }
            int r5 = r5.getDevice()     // Catch:{ all -> 0x04df }
            r16 = 0
            if (r5 != 0) goto L_0x021e
            r16 = 1
        L_0x021e:
            java.lang.String r15 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x04df }
            java.lang.String r5 = "participant-devices-invalid-self-devices"
            r9.A0E(r5, r15, r12)     // Catch:{ all -> 0x04df }
            if (r16 == 0) goto L_0x0268
            boolean r5 = X.AnonymousClass143.A0I(r11)     // Catch:{ all -> 0x04df }
            if (r5 == 0) goto L_0x0234
            X.8du r5 = r6.A07()     // Catch:{ all -> 0x04df }
            goto L_0x0239
        L_0x0234:
            r6.A0G()     // Catch:{ all -> 0x04df }
            X.13x r5 = r6.A02     // Catch:{ all -> 0x04df }
        L_0x0239:
            r12 = 1
            if (r5 == 0) goto L_0x0268
        L_0x023c:
            X.6B1 r9 = new X.6B1     // Catch:{ all -> 0x04df }
            r9.<init>(r5, r13, r14)     // Catch:{ all -> 0x04df }
            if (r12 == 0) goto L_0x025b
            X.0wU r6 = r10.A04     // Catch:{ all -> 0x04df }
            r30 = 2
            X.1ib r5 = new X.1ib     // Catch:{ all -> 0x04df }
            r25 = r5
            r26 = r10
            r27 = r7
            r28 = r11
            r29 = r9
            r31 = r34
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x04df }
            r6.Boy(r5)     // Catch:{ all -> 0x04df }
        L_0x025b:
            java.util.concurrent.ConcurrentHashMap r8 = r8.A04     // Catch:{ all -> 0x04df }
            com.whatsapp.jid.DeviceJid r6 = r9.A02     // Catch:{ all -> 0x04df }
            boolean r5 = r8.containsKey(r6)     // Catch:{ all -> 0x04df }
            if (r5 != 0) goto L_0x0268
            r8.put(r6, r9)     // Catch:{ all -> 0x04df }
        L_0x0268:
            r8 = r33
            goto L_0x0158
        L_0x026c:
            if (r8 == 0) goto L_0x02ac
            com.whatsapp.jid.UserJid r9 = r8.A03     // Catch:{ all -> 0x04df }
            X.0wQ r6 = r1.A01     // Catch:{ all -> 0x04df }
            X.13w r5 = r6.A08()     // Catch:{ all -> 0x04df }
            boolean r5 = r9.equals(r5)     // Catch:{ all -> 0x04df }
            if (r5 == 0) goto L_0x0287
            X.13w r5 = r6.A08()     // Catch:{ all -> 0x04df }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x04df }
            X.6PM r5 = (X.AnonymousClass6PM) r5     // Catch:{ all -> 0x04df }
            goto L_0x0295
        L_0x0287:
            r6.A0G()     // Catch:{ all -> 0x04df }
            com.whatsapp.jid.PhoneUserJid r5 = r6.A03     // Catch:{ all -> 0x04df }
            X.C18740tg.A06(r5)     // Catch:{ all -> 0x04df }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x04df }
            X.6PM r5 = (X.AnonymousClass6PM) r5     // Catch:{ all -> 0x04df }
        L_0x0295:
            if (r5 != 0) goto L_0x029c
            r0.put(r9, r8)     // Catch:{ all -> 0x04df }
            r14 = 1
            goto L_0x029d
        L_0x029c:
            r14 = 0
        L_0x029d:
            X.0wU r6 = r1.A0B     // Catch:{ all -> 0x04df }
            r13 = 6
            X.1iY r5 = new X.1iY     // Catch:{ all -> 0x04df }
            r9 = r5
            r10 = r1
            r11 = r7
            r12 = r8
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x04df }
            r6.Boy(r5)     // Catch:{ all -> 0x04df }
        L_0x02ac:
            r4.close()     // Catch:{ all -> 0x04eb }
            r22.close()     // Catch:{ all -> 0x04f5 }
            X.12g r8 = r1.A03     // Catch:{ all -> 0x04f5 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04f5 }
            long r4 = r4 - r17
            java.lang.String r6 = "ParticipantUserStore/getGroupParticipantsOptimized"
            r8.A01(r6, r4)     // Catch:{ all -> 0x04f5 }
            r4 = r36
            boolean r15 = r4.A02(r7)     // Catch:{ all -> 0x04f5 }
            r5 = 0
            if (r15 == 0) goto L_0x0437
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x04f5 }
            r9.<init>()     // Catch:{ all -> 0x04f5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x04f5 }
            r8.<init>()     // Catch:{ all -> 0x04f5 }
            java.util.Set r4 = r0.keySet()     // Catch:{ all -> 0x04f5 }
            java.util.Iterator r10 = r4.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x02da:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r4 == 0) goto L_0x02ee
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x04f5 }
            boolean r4 = r6 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x04f5 }
            if (r4 == 0) goto L_0x02da
            r9.add(r6)     // Catch:{ all -> 0x04f5 }
            goto L_0x02da
        L_0x02ee:
            r4 = r37
            java.util.LinkedHashMap r11 = r4.A0E(r9)     // Catch:{ all -> 0x04f5 }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x02f8:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r4 == 0) goto L_0x032f
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x04f5 }
            java.lang.Object r6 = r11.get(r10)     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x04f5 }
            if (r6 != 0) goto L_0x0318
            java.lang.String r4 = "participant-user-store/substitutePhoneJidsWithLids/could not find lid for jid"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x04f5 }
            X.0wN r10 = r1.A00     // Catch:{ all -> 0x04f5 }
            r6 = 0
            java.lang.String r4 = "participant-cag-lid-not-found"
            r10.A0E(r4, r6, r5)     // Catch:{ all -> 0x04f5 }
            goto L_0x02f8
        L_0x0318:
            java.lang.Object r4 = r0.get(r10)     // Catch:{ all -> 0x04f5 }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x04f5 }
            X.6PM r4 = (X.AnonymousClass6PM) r4     // Catch:{ all -> 0x04f5 }
            X.6PM r4 = A02(r4, r6)     // Catch:{ all -> 0x04f5 }
            r8.add(r4)     // Catch:{ all -> 0x04f5 }
            r0.remove(r10)     // Catch:{ all -> 0x04f5 }
            r0.put(r6, r4)     // Catch:{ all -> 0x04f5 }
            goto L_0x02f8
        L_0x032f:
            X.0wU r6 = r1.A0B     // Catch:{ all -> 0x04f5 }
            r21 = 12
            X.1ia r4 = new X.1ia     // Catch:{ all -> 0x04f5 }
            r16 = r4
            r17 = r1
            r18 = r7
            r19 = r8
            r20 = r9
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x04f5 }
            r6.Boy(r4)     // Catch:{ all -> 0x04f5 }
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x04f5 }
            r6.<init>()     // Catch:{ all -> 0x04f5 }
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x04f5 }
            r8.<init>()     // Catch:{ all -> 0x04f5 }
            X.0wQ r9 = r1.A01     // Catch:{ all -> 0x04f5 }
            r9.A0G()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.PhoneUserJid r4 = r9.A03     // Catch:{ all -> 0x04f5 }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x04f5 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x04f5 }
            X.6PM r4 = (X.AnonymousClass6PM) r4     // Catch:{ all -> 0x04f5 }
            r14 = 1
            if (r4 == 0) goto L_0x03c1
            int r4 = r4.A01     // Catch:{ all -> 0x04f5 }
            if (r4 == 0) goto L_0x03c1
        L_0x0366:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x04f5 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x036e:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x03d7
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x04f5 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x04f5 }
            java.lang.Object r11 = r0.getKey()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x04f5 }
            java.lang.Object r10 = r0.getValue()     // Catch:{ all -> 0x04f5 }
            X.6PM r10 = (X.AnonymousClass6PM) r10     // Catch:{ all -> 0x04f5 }
            boolean r0 = r11 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ all -> 0x04f5 }
            r12 = 0
            if (r0 == 0) goto L_0x0398
            java.lang.String r0 = "participant-user-store/initParticipantsFromStorage/unexpectedly found jid in CAG"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f5 }
            X.0wN r4 = r1.A00     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "participant-cag-has-jid"
            r4.A0E(r0, r12, r5)     // Catch:{ all -> 0x04f5 }
            goto L_0x036e
        L_0x0398:
            if (r14 != 0) goto L_0x039e
            int r0 = r10.A01     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x03b5
        L_0x039e:
            r4 = r11
            X.13w r4 = (X.C223313w) r4     // Catch:{ all -> 0x04f5 }
            r0 = r37
            com.whatsapp.jid.PhoneUserJid r4 = r0.A0A(r4)     // Catch:{ all -> 0x04f5 }
            if (r4 != 0) goto L_0x03b9
            java.lang.String r0 = "participant-user-store/initParticipantsFromStorage/could not find jid for lid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f5 }
            X.0wN r4 = r1.A00     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "participant-cag-jid-not-found"
            r4.A0E(r0, r12, r5)     // Catch:{ all -> 0x04f5 }
        L_0x03b5:
            r6.put(r11, r10)     // Catch:{ all -> 0x04f5 }
            goto L_0x036e
        L_0x03b9:
            X.6PM r0 = A02(r10, r4)     // Catch:{ all -> 0x04f5 }
            r8.put(r4, r0)     // Catch:{ all -> 0x04f5 }
            goto L_0x03b5
        L_0x03c1:
            X.13w r4 = r9.A08()     // Catch:{ all -> 0x04f5 }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x04f5 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x04f5 }
            X.6PM r4 = (X.AnonymousClass6PM) r4     // Catch:{ all -> 0x04f5 }
            if (r4 == 0) goto L_0x03d5
            int r4 = r4.A01     // Catch:{ all -> 0x04f5 }
            if (r4 == 0) goto L_0x03d5
            goto L_0x0366
        L_0x03d5:
            r14 = 0
            goto L_0x0366
        L_0x03d7:
            X.13w r4 = r9.A09()     // Catch:{ all -> 0x04f5 }
            if (r14 != 0) goto L_0x03fb
            boolean r0 = r6.containsKey(r4)     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x03fb
            java.lang.Object r0 = r6.get(r4)     // Catch:{ all -> 0x04f5 }
            X.6PM r0 = (X.AnonymousClass6PM) r0     // Catch:{ all -> 0x04f5 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x04f5 }
            r9.A0G()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.PhoneUserJid r4 = r9.A03     // Catch:{ all -> 0x04f5 }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x04f5 }
            X.6PM r0 = A02(r0, r4)     // Catch:{ all -> 0x04f5 }
            r8.put(r4, r0)     // Catch:{ all -> 0x04f5 }
        L_0x03fb:
            r2.A0M(r8)     // Catch:{ all -> 0x04f5 }
            int r0 = r2.A00     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x043a
            java.util.Map r9 = r2.A07     // Catch:{ all -> 0x04f5 }
            r9.clear()     // Catch:{ all -> 0x04f5 }
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x04f5 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x040f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x043a
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x04f5 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x04f5 }
            java.lang.Object r0 = r6.getKey()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ all -> 0x04f5 }
            boolean r0 = X.AnonymousClass143.A0I(r0)     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x0433
            java.lang.Object r4 = r6.getKey()     // Catch:{ all -> 0x04f5 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x04f5 }
            r9.put(r4, r0)     // Catch:{ all -> 0x04f5 }
            goto L_0x040f
        L_0x0433:
            r6.getKey()     // Catch:{ all -> 0x04f5 }
            goto L_0x040f
        L_0x0437:
            r2.A0M(r0)     // Catch:{ all -> 0x04f5 }
        L_0x043a:
            r2.A0J()     // Catch:{ all -> 0x04f5 }
            X.0y7 r0 = r2.A07()     // Catch:{ all -> 0x04f5 }
            X.14x r4 = r0.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x0445:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x0456
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04f5 }
            X.6PM r0 = (X.AnonymousClass6PM) r0     // Catch:{ all -> 0x04f5 }
            r0.A00 = r5     // Catch:{ all -> 0x04f5 }
            int r5 = r5 + 1
            goto L_0x0445
        L_0x0456:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f5 }
            r4.<init>()     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = "participant-user-store/syncParticipantDevicesWithDeviceStore/"
            r4.append(r0)     // Catch:{ all -> 0x04f5 }
            r4.append(r7)     // Catch:{ all -> 0x04f5 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04f5 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x04f5 }
            r6.<init>()     // Catch:{ all -> 0x04f5 }
            if (r15 == 0) goto L_0x0472
            goto L_0x0477
        L_0x0472:
            X.0y7 r4 = r2.A06()     // Catch:{ all -> 0x04f5 }
            goto L_0x0481
        L_0x0477:
            java.util.Map r0 = r2.A07     // Catch:{ all -> 0x04f5 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x04f5 }
            X.0y7 r4 = X.C20760y7.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x04f5 }
        L_0x0481:
            X.17i r0 = r1.A09     // Catch:{ all -> 0x04f5 }
            java.util.HashMap r0 = r0.A08(r4)     // Catch:{ all -> 0x04f5 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x04f5 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x048f:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x04c7
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x04f5 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x04f5 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ all -> 0x04f5 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x04f5 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x04f5 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x04f5 }
            boolean r0 = r2.A0Q(r5)     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x048f
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r4)     // Catch:{ all -> 0x04f5 }
            X.5sh r4 = r2.A0A(r0, r5)     // Catch:{ all -> 0x04f5 }
            boolean r0 = r4.A00     // Catch:{ all -> 0x04f5 }
            if (r0 != 0) goto L_0x04bd
            boolean r0 = r4.A01     // Catch:{ all -> 0x04f5 }
            if (r0 == 0) goto L_0x048f
        L_0x04bd:
            boolean r0 = r4.A02     // Catch:{ all -> 0x04f5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04f5 }
            r6.put(r5, r0)     // Catch:{ all -> 0x04f5 }
            goto L_0x048f
        L_0x04c7:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x04f5 }
            if (r0 != 0) goto L_0x04d9
            X.0wU r5 = r1.A0B     // Catch:{ all -> 0x04f5 }
            r4 = 14
            X.1j0 r0 = new X.1j0     // Catch:{ all -> 0x04f5 }
            r0.<init>(r1, r2, r6, r4)     // Catch:{ all -> 0x04f5 }
            r5.Boy(r0)     // Catch:{ all -> 0x04f5 }
        L_0x04d9:
            r0 = r38
            r0.put(r3, r2)     // Catch:{ all -> 0x04f9 }
            goto L_0x04f7
        L_0x04df:
            r1 = move-exception
            if (r4 == 0) goto L_0x04ea
            r4.close()     // Catch:{ all -> 0x04e6 }
            goto L_0x04ea
        L_0x04e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04eb }
        L_0x04ea:
            throw r1     // Catch:{ all -> 0x04eb }
        L_0x04eb:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x04f0 }
            goto L_0x04f4
        L_0x04f0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04f5 }
        L_0x04f4:
            throw r1     // Catch:{ all -> 0x04f5 }
        L_0x04f5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04f9 }
        L_0x04f7:
            monitor-exit(r23)     // Catch:{ all -> 0x04fc }
            goto L_0x0505
        L_0x04f9:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x04fc }
            throw r0     // Catch:{ all -> 0x04fc }
        L_0x04fc:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x04fe }
        L_0x04fe:
            r1 = move-exception
            r0 = r24
            X.C05600Qi.A00(r0, r2)
            throw r1
        L_0x0505:
            r24.close()
        L_0x0508:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C232317r.A0C(X.144):X.6X6");
    }

    public HashMap A0D(UserJid userJid, Set set, int i) {
        Cursor A092;
        HashMap hashMap = new HashMap();
        if (set.isEmpty()) {
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            UserJid userJid2 = (UserJid) it.next();
            hashMap2.put(String.valueOf(A00(this, userJid2)), userJid2);
        }
        String valueOf = String.valueOf(A00(this, userJid));
        AnonymousClass72Z r1 = new AnonymousClass72Z(hashMap2.keySet().toArray(C19430v1.A0N), 974);
        HashMap hashMap3 = new HashMap();
        AnonymousClass1M0 A042 = this.A06.get();
        try {
            Iterator it2 = r1.iterator();
            while (it2.hasNext()) {
                String[] strArr = (String[]) it2.next();
                int length = strArr.length;
                String[] strArr2 = new String[(length + 1)];
                System.arraycopy(strArr, 0, strArr2, 1, length);
                strArr2[0] = valueOf;
                A092 = A042.A02.A09(C54152sU.A00(length), "GET_GROUPS_BY_USER_JIDS_SQL", strArr2);
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("group_jid_row_id");
                int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("user_jid_row_id");
                while (A092.moveToNext()) {
                    long j = A092.getLong(columnIndexOrThrow);
                    long j2 = A092.getLong(columnIndexOrThrow2);
                    Long valueOf2 = Long.valueOf(j);
                    Set set2 = (Set) hashMap3.get(valueOf2);
                    if (set2 == null) {
                        set2 = new HashSet();
                    }
                    set2.add(Long.valueOf(j2));
                    hashMap3.put(valueOf2, set2);
                }
                A092.close();
            }
            HashMap A0D2 = this.A05.A0D(AnonymousClass144.class, hashMap3.keySet());
            HashMap A0K = this.A02.A0K(A0D2.values());
            for (Map.Entry entry : hashMap3.entrySet()) {
                AnonymousClass144 r8 = (AnonymousClass144) A0D2.get(entry.getKey());
                if (A0L((AnonymousClass141) A0K.get(r8), r8)) {
                    HashSet hashSet = new HashSet();
                    for (Long valueOf3 : (Set) entry.getValue()) {
                        UserJid userJid3 = (UserJid) hashMap2.get(String.valueOf(valueOf3));
                        if (userJid3 != null) {
                            hashSet.add(userJid3);
                        }
                    }
                    hashMap.put((AnonymousClass147) r8, hashSet);
                    int i2 = i;
                    if (i2 > -1 && hashMap.size() >= i2) {
                        break;
                    }
                }
            }
            A042.close();
            return hashMap;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public HashSet A0E(AnonymousClass144 r20) {
        Cursor A092;
        UserJid userJid;
        HashSet hashSet = new HashSet();
        C219712j r7 = this.A05;
        String valueOf = String.valueOf(r7.A07(r20));
        AnonymousClass1M0 A042 = this.A06.get();
        try {
            A092 = A042.A02.A09("SELECT user, server, agent, device, type, raw_string, user_jid_row_id FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?", "GET_GROUP_PARTICIPANT_USER_JIDS_SQL", new String[]{valueOf});
            int columnIndexOrThrow = A092.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("server");
            int columnIndexOrThrow3 = A092.getColumnIndexOrThrow("agent");
            int columnIndexOrThrow4 = A092.getColumnIndexOrThrow("device");
            int columnIndexOrThrow5 = A092.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int columnIndexOrThrow6 = A092.getColumnIndexOrThrow("raw_string");
            int columnIndexOrThrow7 = A092.getColumnIndexOrThrow("user_jid_row_id");
            while (A092.moveToNext()) {
                UserJid userJid2 = (UserJid) r7.A0B(A092, A042, UserJid.class, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndexOrThrow5, columnIndexOrThrow6, A092.getLong(columnIndexOrThrow7));
                if (userJid2 == null) {
                    userJid = null;
                } else {
                    userJid = A03(this, userJid2);
                }
                if (userJid != null) {
                    hashSet.add(userJid);
                }
            }
            A092.close();
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public HashSet A0F(UserJid userJid) {
        Cursor A092;
        HashSet hashSet = new HashSet();
        AnonymousClass1M0 A042 = this.A06.get();
        try {
            A092 = A042.A02.A09("SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ?", "GET_PARTICIPANT_GROUPS_BY_USER_JID_SQL", new String[]{String.valueOf(A00(this, userJid))});
            while (A092.moveToNext()) {
                AnonymousClass144 r0 = (AnonymousClass144) this.A05.A0C(AnonymousClass144.class, A092.getLong(A092.getColumnIndexOrThrow("group_jid_row_id")));
                if (r0 != null) {
                    hashSet.add(r0);
                }
            }
            A092.close();
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public HashSet A0G(Set set) {
        Cursor A092;
        HashSet hashSet = new HashSet();
        if (set.isEmpty()) {
            return hashSet;
        }
        AnonymousClass1M0 A042 = this.A06.get();
        try {
            Iterator it = new AnonymousClass72Z((DeviceJid[]) set.toArray(new DeviceJid[0]), 975).iterator();
            while (it.hasNext()) {
                DeviceJid[] deviceJidArr = (DeviceJid[]) it.next();
                C224114e r8 = A042.A02;
                int length = deviceJidArr.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT DISTINCT(group_jid_row_id) FROM group_participant_user AS user JOIN group_participant_device AS device ON  user._id =  device.group_participant_row_id WHERE ");
                sb.append("device_jid_row_id IN ");
                sb.append(AnonymousClass1M2.A00(length));
                sb.append(" AND ");
                sb.append("sent_sender_key = 1");
                String obj = sb.toString();
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = String.valueOf(this.A05.A07(deviceJidArr[i]));
                }
                A092 = r8.A09(obj, "GET_PARTICIPANT_GROUPS_WITH_SENDER_KEY_SENT_SQL", strArr);
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("group_jid_row_id");
                HashSet hashSet2 = new HashSet();
                while (A092.moveToNext()) {
                    hashSet2.add(Long.valueOf(A092.getLong(columnIndexOrThrow)));
                }
                for (AnonymousClass144 r0 : this.A05.A0D(AnonymousClass144.class, hashSet2).values()) {
                    if (r0 != null) {
                        hashSet.add(r0);
                    }
                }
                A092.close();
            }
            A042.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0H(AnonymousClass6PM r15, AnonymousClass144 r16) {
        C1495671s B1k;
        StringBuilder sb = new StringBuilder();
        sb.append("participant-user-store/updateGroupParticipant/");
        AnonymousClass144 r10 = r16;
        sb.append(r10);
        sb.append(" ");
        sb.append(r15);
        Log.i(sb.toString());
        UserJid userJid = r15.A03;
        long A002 = A00(this, userJid);
        String valueOf = String.valueOf(this.A05.A07(r10));
        String valueOf2 = String.valueOf(A002);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("group_jid_row_id", valueOf);
        contentValues.put("user_jid_row_id", valueOf2);
        contentValues.put("rank", Integer.valueOf(r15.A01));
        contentValues.put("pending", Integer.valueOf(r15.A02 ? 1 : 0));
        String[] strArr = {valueOf, valueOf2};
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            B1k = A052.B1k();
            C224114e r4 = A052.A02;
            if (r4.A01(contentValues, "group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "insertOrUpdateGroupParticipant/UPDATE_GROUP_PARTICIPANT_USER", strArr) != 0) {
                this.A07.A02(C20760y7.copyOf(r15.A04.values()), r10, userJid, A002);
            } else {
                r4.A04("group_participant_user", "insertOrUpdateGroupParticipant/INSERT_GROUP_PARTICIPANT_USER", contentValues);
                this.A07.A01(C20760y7.copyOf(r15.A04.values()), r10, userJid, A002);
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
        throw th;
    }

    public void A0I(AnonymousClass6X6 r6) {
        C1495671s B1k;
        StringBuilder sb = new StringBuilder();
        sb.append("participant-user-store/resetSentSenderKeyForAllParticipants/");
        sb.append(r6);
        Log.i(sb.toString());
        AnonymousClass144 r4 = r6.A05;
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            B1k = A052.B1k();
            this.A07.A03(r4);
            A06(r6);
            B1k.A00();
            B1k.close();
            A052.close();
            C232417s r0 = this.A0C;
            r0.A01.A01(new AnonymousClass3CH(r4));
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
        throw th;
    }

    public void A0K(AnonymousClass144 r7, List list) {
        C1495671s B1k;
        AnonymousClass1M0 A052 = this.A06.A05();
        try {
            B1k = A052.B1k();
            boolean z = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = (AnonymousClass11F) it.next();
                if ((r1 instanceof UserJid) && A0N(r7, (UserJid) r1)) {
                    z = true;
                }
            }
            if (z) {
                this.A07.A03(r7);
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
        throw th;
    }

    public boolean A0M(AnonymousClass11F r4) {
        if (!(r4 instanceof GroupJid) || A0C((AnonymousClass144) r4).A08.size() <= 2) {
            return false;
        }
        return true;
    }

    public boolean A0N(AnonymousClass144 r3, UserJid userJid) {
        StringBuilder sb = new StringBuilder();
        sb.append("participant-user-store/removeGroupParticipant/");
        sb.append(r3);
        sb.append(" ");
        sb.append(userJid);
        Log.i(sb.toString());
        return A09(this, r3, A00(this, userJid));
    }

    public C232317r(C19700wN r2, C19730wQ r3, C232417s r4, AnonymousClass16D r5, C19970wo r6, C220412q r7, AnonymousClass12g r8, C232617u r9, C219712j r10, AnonymousClass12P r11, C232817w r12, AnonymousClass12O r13, C231417i r14, C230717b r15, C19770wU r16, AnonymousClass005 r17) {
        this.A0D = r6;
        this.A05 = r10;
        this.A00 = r2;
        this.A01 = r3;
        this.A0B = r16;
        this.A0E = r7;
        this.A0A = r15;
        this.A02 = r5;
        this.A08 = r13;
        this.A09 = r14;
        this.A0C = r4;
        this.A03 = r8;
        this.A06 = r11;
        this.A0G = r17;
        this.A04 = r9;
        this.A07 = r12;
    }

    public static long A00(C232317r r2, UserJid userJid) {
        C18740tg.A0E(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
        C19730wQ r1 = r2.A01;
        r1.A0G();
        PhoneUserJid phoneUserJid = r1.A03;
        C18740tg.A06(phoneUserJid);
        if (phoneUserJid.equals(userJid)) {
            userJid = C223613z.A00;
        } else if (r1.A08() != null && r1.A08().equals(userJid)) {
            userJid = C177648e8.A00;
        }
        return r2.A05.A07(userJid);
    }

    public static void A04(C20760y7 r8, AnonymousClass6X6 r9, C232317r r10, UserJid userJid) {
        boolean z;
        C225614x it = r8.iterator();
        while (true) {
            if (it.hasNext()) {
                if (AnonymousClass143.A0I(((DeviceJid) it.next()).userJid)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z && r9.A00 == 0) {
            r10.A00.A0E("addDevice/group with lid", "trying to add a lid device for a non lid based group", false);
        }
        boolean A0I = AnonymousClass143.A0I(userJid);
        if (!A0I && z) {
            r10.A00.A0E("addDevice/group with lid", "a non lid participant and is trying to add a lid device", false);
        }
        AnonymousClass6PM A082 = r9.A08(userJid);
        if (A082 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("GroupParticipants/addDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            return;
        }
        r9.A0A = true;
        C225614x it2 = r8.iterator();
        while (it2.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it2.next();
            if ((!A0I && !AnonymousClass143.A0I(deviceJid)) || r9.A00 != 0) {
                AnonymousClass6B1 r3 = new AnonymousClass6B1(deviceJid, false, false);
                ConcurrentHashMap concurrentHashMap = A082.A04;
                DeviceJid deviceJid2 = r3.A02;
                if (!concurrentHashMap.containsKey(deviceJid2)) {
                    concurrentHashMap.put(deviceJid2, r3);
                }
            }
        }
        if (!r8.isEmpty()) {
            AnonymousClass6X6.A04(r9);
        }
    }

    public static void A06(AnonymousClass6X6 r1) {
        C225614x it = r1.A07().iterator();
        while (it.hasNext()) {
            A05((AnonymousClass6PM) it.next());
        }
    }

    public void A0J(AnonymousClass144 r6, Collection collection) {
        C1495671s B1k;
        AnonymousClass6X6 A0C2 = A0C(r6);
        if (!this.A0A.A02(A0C2.A05)) {
            AnonymousClass1M0 A052 = this.A06.A05();
            try {
                B1k = A052.B1k();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass6PM A082 = A0C2.A08((UserJid) it.next());
                    if (A082 != null) {
                        A0H(A082, r6);
                    }
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
        throw th;
    }
}
