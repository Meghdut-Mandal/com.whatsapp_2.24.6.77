package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.group.GetSubgroupsManager;
import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0xQ  reason: invalid class name and case insensitive filesystem */
public class C20350xQ implements AnonymousClass00M {
    public static Handler A1H;
    public Integer A00;
    public Integer A01;
    public long A02 = 0;
    public final C19700wN A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final AnonymousClass1DT A06;
    public final C26851Lt A07;
    public final AnonymousClass1LV A08;
    public final AnonymousClass1FG A09;
    public final MemberSuggestedGroupsManager A0A;
    public final C19600wD A0B;
    public final AnonymousClass16D A0C;
    public final AnonymousClass171 A0D;
    public final AnonymousClass16K A0E;
    public final C20430xY A0F;
    public final C27301Nr A0G;
    public final AnonymousClass1A6 A0H;
    public final C19970wo A0I;
    public final C19420v0 A0J;
    public final AnonymousClass189 A0K;
    public final AnonymousClass187 A0L;
    public final C220412q A0M;
    public final C24381Cf A0N;
    public final C20310xM A0O;
    public final AnonymousClass1LW A0P;
    public final AnonymousClass1PB A0Q;
    public final AnonymousClass1PF A0R;
    public final AnonymousClass1PG A0S;
    public final C232617u A0T;
    public final AnonymousClass17X A0U;
    public final AnonymousClass168 A0V;
    public final C24541Cv A0W;
    public final C27551Oq A0X;
    public final C27291Nq A0Y;
    public final C231417i A0Z;
    public final C20810yC A0a;
    public final GetSubgroupsManager A0b;
    public final C27531Oo A0c;
    public final C20360xR A0d;
    public final AnonymousClass1P4 A0e;
    public final C27281Np A0f;
    public final C27541Op A0g;
    public final AnonymousClass1PT A0h;
    public final C230717b A0i;
    public final C233117z A0j;
    public final C20510xg A0k;
    public final C26801Lo A0l;
    public final AnonymousClass1PS A0m;
    public final AnonymousClass1EL A0n;
    public final C27321Nt A0o;
    public final AnonymousClass1P5 A0p;
    public final AnonymousClass19A A0q;
    public final AnonymousClass1DL A0r;
    public final AnonymousClass1C4 A0s;
    public final AnonymousClass1PE A0t;
    public final AnonymousClass1O8 A0u;
    public final AnonymousClass1P3 A0v;
    public final C237919w A0w;
    public final C238019x A0x;
    public final C27561Or A0y;
    public final AnonymousClass1C6 A0z;
    public final AnonymousClass1AQ A10;
    public final AnonymousClass1EM A11;
    public final C19770wU A12;
    public final AnonymousClass005 A13;
    public final Map A14 = new ConcurrentHashMap();
    public final Set A15 = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AnonymousClass1PR A16;
    public final AnonymousClass1PC A17;
    public final C19630wG A18;
    public final AnonymousClass1C7 A19;
    public final AnonymousClass182 A1A;
    public final AnonymousClass12P A1B;
    public final C26211Jh A1C;
    public final AnonymousClass1NN A1D;
    public final GetGroupInfoProtocolHelper A1E;
    public final AnonymousClass1EV A1F;
    public final AnonymousClass005 A1G;

    public static AnonymousClass6PM A01(AnonymousClass6X6 r4, C20350xQ r5, UserJid userJid, int i) {
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return null;
        }
        AnonymousClass6X6 r1 = r4;
        AnonymousClass6PM A082 = r4.A08(userJid);
        int i2 = i;
        if (A082 == null) {
            return AnonymousClass6X6.A00(r1, userJid2, r5.A0Z.A0B(userJid), i2, false, true);
        }
        A082.A01 = i;
        return A082;
    }

    private synchronized void A07(int i) {
        Integer valueOf;
        int intValue;
        Integer num = this.A01;
        if (num != null) {
            valueOf = Integer.valueOf(i | num.intValue());
            this.A01 = valueOf;
        } else {
            valueOf = Integer.valueOf(i);
            this.A01 = valueOf;
        }
        Integer num2 = this.A00;
        if (num2 != null) {
            intValue = num2.intValue() | valueOf.intValue();
        } else {
            intValue = valueOf.intValue();
        }
        this.A0J.A19(intValue);
    }

    public static void A0D(C20350xQ r15, GroupJid groupJid) {
        Cursor A092;
        C20350xQ r4 = r15;
        if (C34681hT.A0M(r15.A0a)) {
            C26211Jh r0 = r15.A1C;
            AnonymousClass163 r1 = r0.A02;
            GroupJid groupJid2 = groupJid;
            long A082 = r1.A08(groupJid2);
            AnonymousClass12P r5 = r0.A04;
            AnonymousClass1M0 A052 = r5.A05();
            try {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("is_upcoming", false);
                if (A052.A02.A01(contentValues, "scheduled_calls", "key_chat_row_id = ? AND is_upcoming = 1", "ScheduledCallsStore/UPDATE_IS_UPCOMING_TO_FALSE_FOR_GROUP", new String[]{String.valueOf(A082)}) == 0) {
                    Log.i("ScheduledCallsStore/updateIsUpcomingToFalseForGroup no scheduled calls to update");
                }
                A052.close();
                ArrayList arrayList = new ArrayList();
                String[] strArr = {String.valueOf(r1.A08(groupJid2)), String.valueOf(System.currentTimeMillis())};
                AnonymousClass1M0 A042 = r5.get();
                try {
                    A092 = A042.A02.A09(" SELECT creation_message_row_id FROM scheduled_calls WHERE key_chat_row_id = ?  AND scheduled_timestamp >= ? ", "ScheduledCallsStore/SELECT_ROW_IDS_OF_SCHEDULED_CALLS_AFTER_TIME_IN_CHAT", strArr);
                    int columnIndexOrThrow = A092.getColumnIndexOrThrow("creation_message_row_id");
                    while (A092.moveToNext()) {
                        arrayList.add(Long.valueOf(A092.getLong(columnIndexOrThrow)));
                    }
                    A092.close();
                    A042.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C31021b9) r4.A1G.get()).A00(((Number) it.next()).longValue());
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    A042.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A0H(C20350xQ r9, AnonymousClass147 r10, AnonymousClass147 r11, String str, int i, long j) {
        String str2 = str;
        int i2 = i;
        if (i == 2 || i == 0 || i == 3 || i == 6) {
            AnonymousClass147 r5 = r11;
            if (!C63833Lp.A00(i) || r10 == null) {
                AnonymousClass1LV r1 = r9.A08;
                AnonymousClass00C.A0D(r11, 0);
                r1.A08.A05(r11);
                return;
            }
            AnonymousClass1LV r3 = r9.A08;
            if (str == null) {
                str2 = "";
            }
            List<AnonymousClass3QK> singletonList = Collections.singletonList(new AnonymousClass3QK(r5, str2, i2, j));
            AnonymousClass00C.A0D(singletonList, 1);
            for (AnonymousClass3QK A042 : singletonList) {
                r3.A08.A04(A042, r10);
            }
        }
    }

    public synchronized void A0S(int i) {
        Log.i("groupmgr/groupSyncFailedOrTimedOut");
        this.A0d.A02 = false;
        this.A00 = null;
        A07(i);
    }

    public synchronized void A0U(int i, boolean z) {
        if (z) {
            if (this.A02 != 0 && C19970wo.A00(this.A0I) - this.A02 < 120000) {
                StringBuilder sb = new StringBuilder();
                sb.append("groupmgr/sendGetGroups/skip backoff param=");
                sb.append(i);
                Log.i(sb.toString());
            }
        }
        if (i == 3) {
            Log.i("groupmgr/sendGetGroups/all");
            this.A0d.A02 = true;
        }
        Integer num = this.A00;
        if (num == null) {
            A07(i);
            A06();
        } else if ((num.intValue() & i) == i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("groupmgr/sendGetGroups/skip inFlight param=");
            sb2.append(i);
            Log.i(sb2.toString());
        } else {
            A07(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if ((r7 & 1) != 0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(java.util.Set r6, int r7) {
        /*
            r5 = this;
            r4 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/onGroupSyncSucceeded/"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1A6 r0 = r5.A0H
            java.util.ArrayList r0 = r0.A04()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x002c
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x002c
            r3.add(r1)
            goto L_0x002c
        L_0x0044:
            r5.A0j(r3)
            r3 = 3
            if (r7 != r3) goto L_0x0065
            X.0xR r0 = r5.A0d
            r2 = 1
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x005e
            X.1C4 r2 = r5.A0s
            java.lang.String r1 = "groups"
            r0 = 0
            r2.A03(r1, r0)
        L_0x005e:
            r5.A0l(r6)
        L_0x0061:
            monitor-enter(r4)
            if (r7 != r3) goto L_0x006f
            goto L_0x006a
        L_0x0065:
            r0 = r7 & 1
            if (r0 == 0) goto L_0x0061
            goto L_0x005e
        L_0x006a:
            X.0xR r1 = r5.A0d     // Catch:{ all -> 0x00a7 }
            r0 = 0
            r1.A02 = r0     // Catch:{ all -> 0x00a7 }
        L_0x006f:
            X.0v0 r3 = r5.A0J     // Catch:{ all -> 0x00a5 }
            java.lang.Integer r0 = r3.A0Z()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0097
            java.lang.Integer r2 = r5.A01     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x008a
            int r0 = r0.intValue()     // Catch:{ all -> 0x00a5 }
            int r1 = ~r7     // Catch:{ all -> 0x00a5 }
            r1 = r1 & r0
            int r0 = r2.intValue()     // Catch:{ all -> 0x00a5 }
            r1 = r1 | r0
            r3.A19(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x0097
        L_0x008a:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "get_groups_params"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x00a5 }
            r0.apply()     // Catch:{ all -> 0x00a5 }
        L_0x0097:
            java.lang.Integer r0 = r5.A01     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00a0
            r5.A06()     // Catch:{ all -> 0x00a7 }
        L_0x009e:
            monitor-exit(r4)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a4
        L_0x00a0:
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x00a7 }
            goto L_0x009e
        L_0x00a4:
            return
        L_0x00a5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20350xQ.A0m(java.util.Set, int):void");
    }

    public boolean A0o(GroupJid groupJid) {
        if (groupJid == null || !this.A0U.A0D(groupJid)) {
            return false;
        }
        return !this.A0M.A0O(groupJid);
    }

    public boolean A0p(GroupJid groupJid) {
        AnonymousClass141 A0A2;
        if (groupJid == null || !this.A0U.A0D(groupJid) || this.A0M.A0O(groupJid) || (A0A2 = this.A0C.A0A(groupJid)) == null) {
            return false;
        }
        return this.A0y.A00(A0A2);
    }

    public static AnonymousClass147 A02(C20350xQ r1, AnonymousClass147 r2) {
        AnonymousClass1LV r12 = r1.A08;
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass3QK A002 = r12.A08.A00(r2);
        if (A002 == null) {
            return null;
        }
        GroupJid groupJid = A002.A02;
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        return C65533Sl.A03(groupJid);
    }

    public static UserJid A03(AnonymousClass3T1 r3) {
        C64933Qa r2 = r3.A1J;
        AnonymousClass11F r1 = r2.A00;
        if (AnonymousClass143.A0G(r1)) {
            if (r2.A02 && (r3 instanceof AnonymousClass2bI)) {
                AnonymousClass2bI r22 = (AnonymousClass2bI) r3;
                int i = r22.A00;
                if (i == 10) {
                    return ((C181248nA) r22).A00;
                }
                if (i == 20 || i == 52 || i == 79 || i == 123 || i == 125 || i == 126) {
                    return (UserJid) ((C181758nz) r22).A01.get(0);
                }
            }
            r1 = r3.A0J();
        }
        C222813r r0 = UserJid.Companion;
        return C222813r.A00(r1);
    }

    public static ArrayList A04(C20350xQ r9, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupJid groupJid = (GroupJid) it.next();
            String A0D2 = r9.A0M.A0D(groupJid);
            if (A0D2 == null) {
                A0D2 = "";
            }
            arrayList.add(new AnonymousClass3QK(groupJid, A0D2, 2, 0));
        }
        return arrayList;
    }

    public static List A05(C20350xQ r2, GroupJid groupJid, List list) {
        if (groupJid == null || !r2.A0i.A02(groupJid)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (!AnonymousClass143.A0I(jid)) {
                arrayList.add(jid);
            }
        }
        return arrayList;
    }

    private synchronized void A06() {
        synchronized (this) {
            Integer num = this.A01;
            C18740tg.A06(num);
            if (num.intValue() == 3) {
                this.A02 = C19970wo.A00(this.A0I);
            }
            int intValue = this.A01.intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("groupmgr/sendGetGroups/ ");
            sb.append(intValue);
            Log.i(sb.toString());
            this.A00 = Integer.valueOf(intValue);
            C20810yC r12 = this.A0a;
            C76783pR r10 = new C76783pR(this.A03, r12, this, (C201159iy) this.A13.get(), this.A0q, intValue);
            Log.i("GroupRequestProtocolHelper/sendGetGroups/get-groups");
            AnonymousClass19A r14 = r10.A04;
            String A092 = r14.A09();
            C13540k2 r6 = new C13540k2();
            int i = r10.A00;
            if ((i & 1) != 0) {
                r6.add(new C203399nx("participants", (AnonymousClass1AL[]) null));
            }
            if ((i & 2) != 0) {
                r6.add(new C203399nx("description", (AnonymousClass1AL[]) null));
            }
            C203399nx r7 = new C203399nx("participating", (AnonymousClass1AL[]) null, (C203399nx[]) AnonymousClass03S.A00(r6).toArray(new C203399nx[0]));
            r14.A0F(r10, new C203399nx("iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) C177578e1.A00, "to")}, new C203399nx[]{r7}), A092, 19, 0);
            this.A01 = null;
        }
    }

    private void A09(AnonymousClass6X6 r7, Collection collection, int i, boolean z) {
        AnonymousClass144 r1 = r7.A05;
        AnonymousClass6SZ r0 = GroupJid.Companion;
        GroupJid A002 = AnonymousClass6SZ.A00(r1);
        if (z) {
            int size = r7.A07().size();
            C20810yC r2 = this.A0a;
            C21000yV r12 = C21000yV.A02;
            if (size >= C20800yB.A00(r12, r2, 934) && size <= C20800yB.A00(r12, r2, 1946) && A002 != null) {
                AnonymousClass5J0 r4 = new AnonymousClass5J0(this.A0w.A02(A002, true), C19970wo.A00(this.A0I));
                C27301Nr r3 = this.A0G;
                UserJid[] userJidArr = (UserJid[]) collection.toArray(new UserJid[0]);
                if (userJidArr.length == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncDevicesAndSendInvisibleMessageJob/empty recipients for ");
                    sb.append(r4.A1J);
                    Log.w(sb.toString());
                    return;
                } else if (r3.A02.A01(r4.A1J)) {
                    r3.A00.A01(new SyncDevicesAndSendInvisibleMessageJob(r4, userJidArr));
                    return;
                } else {
                    return;
                }
            }
        }
        this.A0G.A01((UserJid[]) collection.toArray(new UserJid[0]), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.8nf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.8nQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.8nC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.8nQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: X.8nQ} */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.8nx, X.8nz, X.8nB] */
    /* JADX WARNING: type inference failed for: r5v9, types: [X.8nw, X.8nc] */
    /* JADX WARNING: type inference failed for: r5v11, types: [X.8nd, X.8nw] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        if ((r5 instanceof X.C181528nc) != false) goto L_0x00fc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.AnonymousClass3QK r14, X.AnonymousClass3QK r15, X.C20350xQ r16, com.whatsapp.jid.UserJid r17, X.C207209uj r18, java.lang.Integer r19, long r20, boolean r22, boolean r23) {
        /*
            int r10 = r14.A00
            r9 = 0
            if (r15 == 0) goto L_0x0203
            com.whatsapp.jid.GroupJid r8 = r15.A02
            java.lang.String r9 = r15.A04
        L_0x0009:
            r0 = 1
            if (r10 != r0) goto L_0x000e
            java.lang.String r9 = r14.A04
        L_0x000e:
            java.lang.String r0 = "GroupChatManager/updateLinkGroupInfoIfNeeded()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 1
            r0 = 2
            r12 = r16
            r11 = r18
            if (r10 == r0) goto L_0x0023
            if (r10 == r1) goto L_0x0023
            r0 = 3
            if (r10 == r0) goto L_0x0023
            r0 = 6
            if (r10 != r0) goto L_0x00a6
        L_0x0023:
            com.whatsapp.jid.GroupJid r7 = r14.A02
            boolean r0 = r7 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x00a6
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r6 = X.C65533Sl.A03(r8)
            if (r6 == 0) goto L_0x0044
            X.1LV r3 = r12.A08
            java.lang.String r0 = "CommunityChatManageronSubgroupLinked()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r2 = r3.A0C
            r1 = 16
            X.1iV r0 = new X.1iV
            r0.<init>(r3, r14, r6, r1)
            r2.Boy(r0)
        L_0x0044:
            X.1EM r0 = r12.A11
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "groupChatManager/updateLinkGroupInfoIfNeeded/ab prop is off"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1FG r3 = r12.A09
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CommunitySharedPrefs/ setTempGroupType()/groupType = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00T r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.AnonymousClass00C.A08(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "create_"
            r1.append(r0)
            java.lang.String r0 = r7.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r10)
            r0.apply()
            X.1LW r0 = r12.A0P
            boolean r0 = r0.A04(r7, r10)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "groupChatManager/updateLinkGroupInfoIfNeeded/successfully add group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A00(r7)
        L_0x00a6:
            if (r18 == 0) goto L_0x00ad
            X.1C4 r0 = r12.A0s
            r0.A01(r11)
        L_0x00ad:
            return
        L_0x00ae:
            r0 = 6
            r13 = r17
            if (r10 != r0) goto L_0x01ff
            X.0yC r2 = r12.A0a
            r1 = 5021(0x139d, float:7.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x00ad
            X.0wQ r0 = r12.A05
            boolean r0 = r0.A0M(r13)
        L_0x00c5:
            if (r0 == 0) goto L_0x00ad
            r17 = 3010(0xbc2, float:4.218E-42)
            r18 = r22
            if (r22 == 0) goto L_0x00cf
            r17 = 3012(0xbc4, float:4.221E-42)
        L_0x00cf:
            r5 = 0
            r2 = 1
            r15 = 0
            r14 = r19
            r3 = r20
            if (r10 != r2) goto L_0x0101
            X.19x r1 = r12.A0x
            X.19w r0 = r1.A01
            X.3Qa r0 = r0.A02(r7, r2)
            X.8nd r5 = new X.8nd
            r5.<init>(r0, r3)
            r5.A1g(r7, r9)
        L_0x00e8:
            boolean r0 = r5 instanceof X.C181548ne
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r5 instanceof X.C181538nd
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r5 instanceof X.C181558nf
            if (r0 == 0) goto L_0x00f8
            r0 = 0
            throw r0
        L_0x00f6:
            r0 = 0
            goto L_0x00fd
        L_0x00f8:
            boolean r0 = r5 instanceof X.C181528nc
            if (r0 == 0) goto L_0x00f6
        L_0x00fc:
            r0 = 1
        L_0x00fd:
            X.C238019x.A01(r13, r5, r1, r0)
            goto L_0x0123
        L_0x0101:
            if (r8 == 0) goto L_0x0119
            if (r7 == 0) goto L_0x0119
            r16 = 0
            if (r19 != 0) goto L_0x010b
            r16 = 1
        L_0x010b:
            r0 = 2
            if (r10 == r0) goto L_0x01a2
            r0 = 3
            if (r10 == r0) goto L_0x01ed
            r0 = 6
            if (r10 == r0) goto L_0x01a2
            java.lang.String r0 = "groupmgr/unlink action in link creation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0119:
            X.0wN r2 = r12.A03
            java.lang.String r1 = "groupmgr/Failed to create community message"
            java.lang.String r0 = ""
            r2.A0E(r1, r0, r15)
            r2 = 0
        L_0x0123:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/Failed to create community messagecreator="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = "; timestampMs="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; oldGroupType="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "; newGroupType="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; isJoinFromCommunity="
            r1.append(r0)
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = "; originatingStanzaKey="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "; subGroupJid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; parentGroupJid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; parentSubject="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            X.C18740tg.A0D(r2, r0)
            if (r5 != 0) goto L_0x019a
            X.19x r2 = r12.A0x
            X.19w r1 = r2.A01
            r0 = 1
            X.3Qa r1 = r1.A02(r7, r0)
            r0 = 75
            X.8nQ r5 = new X.8nQ
            r5.<init>(r1, r0, r3)
            r5.A03 = r11
            r5.A02 = r14
            r5.A00 = r10
            r5.A01 = r8
            r0 = 0
            if (r19 != 0) goto L_0x0197
            r0 = 1
        L_0x0197:
            X.C238019x.A01(r13, r5, r2, r0)
        L_0x019a:
            X.1Oo r1 = r12.A0c
            r0 = r17
            r1.BJb(r5, r0)
            return
        L_0x01a2:
            X.19x r1 = r12.A0x
            if (r16 == 0) goto L_0x01d8
            if (r22 == 0) goto L_0x01c7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r15)
            X.19w r5 = r1.A01
            X.3Qa r15 = r5.A02(r7, r2)
            X.8nC r5 = new X.8nC
            r5.<init>(r15, r3)
            r5.A1h(r6, r9)
            r5.A00 = r10
            int r6 = r5.A00
            X.C238019x.A00(r13, r5, r1, r0, r6)
        L_0x01c2:
            X.C238019x.A01(r13, r5, r1, r2)
            goto L_0x0123
        L_0x01c7:
            X.19w r0 = r1.A01
            X.3Qa r0 = r0.A02(r7, r2)
            X.8nf r5 = new X.8nf
            r5.<init>(r0, r3)
            r5.A1g(r8, r9)
            r5.A00 = r10
            goto L_0x01c2
        L_0x01d8:
            X.19w r0 = r1.A01
            X.3Qa r0 = r0.A02(r7, r2)
            X.8nB r5 = new X.8nB
            r5.<init>(r0, r3)
            r5.A03 = r11
            r5.A1h(r6, r9)
            X.C238019x.A01(r13, r5, r1, r15)
            goto L_0x0123
        L_0x01ed:
            X.19x r1 = r12.A0x
            X.19w r0 = r1.A01
            X.3Qa r0 = r0.A02(r7, r2)
            X.8nc r5 = new X.8nc
            r5.<init>(r0, r3)
            r5.A1g(r8, r9)
            goto L_0x00e8
        L_0x01ff:
            r0 = r23 ^ 1
            goto L_0x00c5
        L_0x0203:
            r8 = r9
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20350xQ.A0A(X.3QK, X.3QK, X.0xQ, com.whatsapp.jid.UserJid, X.9uj, java.lang.Integer, long, boolean, boolean):void");
    }

    public static void A0B(C20350xQ r3, AnonymousClass11F r4, List list) {
        if (r3.A1F.A04(0) && AnonymousClass143.A0G(r4)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r3.A0O.A0b(r4, (UserJid) it.next());
            }
        }
    }

    public static void A0E(C20350xQ r3, AnonymousClass147 r4) {
        r3.A0C.A0Z(r4, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onGroupDelete/updated group state to deactivated/jid = ");
        sb.append(r4);
        Log.i(sb.toString());
        r3.A19.A01(new C35721j9(r3, r4, 21), 47);
    }

    public static void A0F(C20350xQ r4, AnonymousClass147 r5) {
        AnonymousClass6X6 A0C2 = r4.A0U.A07.A0C(r5);
        C19730wQ r3 = r4.A05;
        r3.A0G();
        PhoneUserJid phoneUserJid = r3.A03;
        C18740tg.A06(phoneUserJid);
        A0C2.A09(phoneUserJid);
        C223313w A082 = r3.A08();
        if (A082 != null) {
            A0C2.A09(A082);
        }
        C225614x it = A0C2.A07().iterator();
        while (it.hasNext()) {
            ((AnonymousClass6PM) it.next()).A01 = 0;
        }
        r4.A0p.A0X(r5);
        r3.A0G();
        A0B(r4, r5, Collections.singletonList(r3.A03));
    }

    public static void A0G(C20350xQ r7, AnonymousClass147 r8, int i) {
        C1495671s B1k;
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/updateGroupMemberCount/updating group size metadata for group: ");
        sb.append(r8);
        sb.append(" to:");
        sb.append(i);
        Log.i(sb.toString());
        AnonymousClass1PC r1 = r7.A17;
        Integer A002 = r1.A00(r8);
        if (A002 != null && A002.intValue() == i) {
            return;
        }
        if (i >= 1) {
            try {
                AnonymousClass1M0 A042 = r1.A01.A04();
                try {
                    B1k = A042.B1k();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("jid_row_id", Long.valueOf(r1.A00.A07(r8)));
                    contentValues.put("member_count", Integer.valueOf(i));
                    A042.A02.A08("group_membership_count", "UPDATE_GROUP_MEMBER_COUNT", contentValues, 5);
                    B1k.A00();
                    B1k.close();
                    A042.close();
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            A1H.post(new C35721j9(r7, r8, 14));
            return;
        }
        throw new IllegalArgumentException("Number of members can't be less than 1.");
        throw th;
    }

    public static void A0I(C20350xQ r3, AnonymousClass147 r4, AnonymousClass147 r5, String str, boolean z) {
        String A0H2;
        if (!z) {
            return;
        }
        if (r5 == null) {
            C19700wN r32 = r3.A03;
            StringBuilder sb = new StringBuilder();
            sb.append(r4);
            sb.append(" has a null parent group");
            r32.A0E("comm-failures/parentGroupJid is null", sb.toString(), false);
            return;
        }
        AnonymousClass16D r2 = r3.A0C;
        AnonymousClass141 A0A2 = r2.A0A(r5);
        if (A0A2 != null && (A0H2 = r3.A0D.A0H(A0A2)) != null && A0H2.equals(str)) {
            AnonymousClass141 A0D2 = r2.A0D(r5);
            A0D2.A0P = str;
            r2.A05.A0U(A0D2);
            r2.A04.A0A(A0D2);
            r3.A04.A0H(new C35721j9(r3, r5, 15));
        }
    }

    public static boolean A0J(AnonymousClass141 r23, C20350xQ r24, UserJid userJid, AnonymousClass3QL r26, String str, String str2, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        AnonymousClass3QL r0;
        C20810yC r1 = r24.A0y.A00;
        C21000yV r14 = C21000yV.A02;
        boolean A012 = C20800yB.A01(r14, r1, 3695);
        AnonymousClass141 r10 = r23;
        String str3 = str;
        boolean z12 = z;
        boolean z13 = z2;
        boolean z14 = z3;
        boolean z15 = z4;
        boolean z16 = z5;
        boolean z17 = z6;
        boolean z18 = z7;
        boolean z19 = z8;
        boolean z20 = z9;
        boolean z21 = z10;
        UserJid userJid2 = userJid;
        AnonymousClass3QL r13 = r26;
        String str4 = str2;
        int i2 = i;
        if (TextUtils.equals(r10.A0J(), str3) && TextUtils.equals(r10.A0V, Long.toString(j))) {
            String str5 = r10.A0K.A03;
            String str6 = r13.A03;
            if (TextUtils.equals(str5, str6) && ((r0 = r10.A0K) != null ? !(!TextUtils.equals(r0.A04, r13.A04)) : r13.A04 == null && r13.A00 == 0 && r13.A02 == null && str6 == null) && r10.A0i == z12 && r10.A13 == z13 && r10.A0d == z14 && r10.A11 == z15 && C1901797e.A00(r10.A0I, userJid2) && r10.A0r == z16 && r10.A0j == z17 && r10.A12 == z18 && ((!A012 || r10.A0p == z19) && TextUtils.equals(r10.A0M, str4) && r10.A04 == i2 && r10.A0c == z20 && r10.A0h == z21 && (r10.A0e == z11 || !C20800yB.A01(r14, r24.A0a, 5021)))) {
                return false;
            }
        }
        r10.A0P = str3;
        r10.A0V = Long.toString(j);
        r10.A09(r13);
        r10.A0i = z12;
        r10.A13 = z13;
        r10.A0d = z14;
        r10.A11 = z15;
        r10.A0I = userJid2;
        r10.A0r = z16;
        r10.A0j = z17;
        r10.A0M = str4;
        r10.A12 = z18;
        r10.A04 = i2;
        if (A012) {
            r10.A0p = z19;
        }
        r10.A0c = z20;
        r10.A0h = z21;
        return true;
    }

    public static boolean A0K(C20350xQ r3, AnonymousClass147 r4, Map map) {
        if (!r3.A0i.A02(r4)) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (AnonymousClass143.A0I(((C63523Kj) it.next()).A02)) {
                    if (!C20800yB.A01(C21000yV.A02, r3.A0a, 2962) || r3.A0U.A0B(r4)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0L(C20350xQ r4, AnonymousClass147 r5, boolean z) {
        AnonymousClass141 A0A2 = r4.A0C.A0A(r5);
        if (!C20800yB.A01(C21000yV.A02, r4.A0a, 982) || A0A2 == null || !z || r4.A0U.A0D(r5) || !A0A2.A0j) {
            return false;
        }
        return true;
    }

    public int A0M(AnonymousClass141 r3) {
        int A052 = this.A0M.A05((GroupJid) r3.A06(AnonymousClass147.class));
        if (!r3.A0G()) {
            return 0;
        }
        Set set = C56602wa.A00;
        Integer valueOf = Integer.valueOf(A052);
        if (set.contains(valueOf) || C56602wa.A01.contains(valueOf)) {
            return r3.A03;
        }
        return 0;
    }

    public int A0N(AnonymousClass11F r3) {
        Integer A002;
        if (!(r3 instanceof GroupJid) || (A002 = this.A17.A00((GroupJid) r3)) == null) {
            return 0;
        }
        return A002.intValue();
    }

    public int A0O(GroupJid groupJid) {
        AnonymousClass141 A092 = this.A0C.A04.A09(groupJid);
        if (A092 == null || !A092.A12) {
            return 1;
        }
        return 4;
    }

    public AnonymousClass146 A0P() {
        C19730wQ r5 = this.A05;
        AnonymousClass3BZ r4 = AnonymousClass146.A01;
        AnonymousClass00C.A0D(r5, 0);
        String obj = UUID.randomUUID().toString();
        AnonymousClass00C.A08(obj);
        return r4.A00(r5, AnonymousClass098.A05(obj, "-", "", false));
    }

    public ArrayList A0Q() {
        AnonymousClass147 A022;
        ArrayList A0P2 = this.A0C.A05.A0P();
        ArrayList arrayList = new ArrayList();
        Iterator it = A0P2.iterator();
        while (it.hasNext()) {
            AnonymousClass141 r5 = (AnonymousClass141) it.next();
            AnonymousClass11F r1 = r5.A0H;
            Parcelable.Creator creator = AnonymousClass147.CREATOR;
            AnonymousClass147 A032 = C65533Sl.A03(r1);
            if (A032 != null && this.A0U.A0D(A032)) {
                C220412q r12 = this.A0M;
                if (!r12.A0Q(A032)) {
                    int A052 = r12.A05(A032);
                    if (A052 == 2) {
                        A022 = this.A08.A02(A032);
                    } else if (A052 == 0) {
                        A022 = null;
                    }
                    if (r5.A0H(this.A03, new AnonymousClass35K(A022, A052))) {
                        arrayList.add(r5);
                    } else {
                        this.A0k.A0E(A032, "subgroup_conflict_recovery", 3);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A0T(int i, Object obj) {
        A1H.obtainMessage(i, obj).sendToTarget();
    }

    public void A0X(C199999gO r4) {
        PhoneUserJid phoneUserJid;
        PhoneUserJid phoneUserJid2;
        HashMap hashMap = new HashMap();
        UserJid userJid = r4.A0B;
        if (AnonymousClass143.A0I(userJid) && (phoneUserJid2 = r4.A09) != null) {
            hashMap.put(userJid, phoneUserJid2);
        }
        UserJid userJid2 = r4.A0C;
        if (AnonymousClass143.A0I(userJid2) && (phoneUserJid = r4.A0A) != null) {
            hashMap.put(userJid2, phoneUserJid);
        }
        if (!hashMap.isEmpty()) {
            this.A0t.A01(hashMap);
        }
    }

    public void A0Y(AnonymousClass144 r13, Iterable iterable, boolean z, boolean z2) {
        boolean z3;
        UserJid userJid;
        AnonymousClass6X6 A0C2 = this.A0U.A07.A0C(r13);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            z3 = z;
            if (!it.hasNext()) {
                break;
            }
            UserJid userJid2 = (UserJid) it.next();
            arrayList.add(new AnonymousClass6PM(userJid2, AnonymousClass6X6.A02(this.A0Z.A0B(userJid2)), 0, z));
        }
        if (r13 instanceof C177538dx) {
            C19730wQ r0 = this.A05;
            if (z2) {
                userJid = r0.A09();
                A0C2.A00 = 3;
            } else {
                r0.A0G();
                userJid = r0.A03;
                C18740tg.A06(userJid);
            }
            AnonymousClass6X6.A00(A0C2, userJid, this.A0Z.A0B(userJid), 2, z3, true);
        }
        A08(A0C2, this, arrayList);
    }

    public void A0Z(AnonymousClass144 r16, List list) {
        C181758nz A032;
        List<UserJid> list2 = list;
        C18740tg.A09("", list2);
        AnonymousClass144 r7 = r16;
        AnonymousClass6X6 A0C2 = this.A0U.A07.A0C(r7);
        ArrayList arrayList = new ArrayList(list2.size());
        for (UserJid userJid : list2) {
            arrayList.add(new AnonymousClass6PM(userJid, AnonymousClass6X6.A02(this.A0Z.A0B(userJid)), 0, false));
        }
        A08(A0C2, this, arrayList);
        this.A0D.A0d(r7);
        int size = list2.size();
        C27531Oo r0 = this.A0c;
        if (size == 1) {
            AnonymousClass144 r9 = r7;
            A032 = this.A0x.A06(r9, (UserJid) list2.get(0), (C207209uj) null, 4, C19970wo.A00(this.A0I));
        } else {
            A032 = this.A0x.A03(A0C2, r7, (UserJid) null, (C207209uj) null, list2, 12, C19970wo.A00(this.A0I));
        }
        r0.BJb(A032, 2);
        this.A04.A0H(new C35631j0(this, r7, A0C2, 20));
    }

    public void A0a(AnonymousClass144 r16, List list) {
        C181758nz A032;
        List list2 = list;
        C18740tg.A09("", list2);
        AnonymousClass144 r8 = r16;
        AnonymousClass6X6 A0C2 = this.A0U.A07.A0C(r8);
        boolean A0R2 = A0C2.A0R(list2);
        A0C2.A0L(list2);
        this.A0p.A0W(r8, list2);
        if (r8 instanceof C177618e5) {
            if (A0R2) {
                if (this.A0K.A0X()) {
                    this.A12.Boy(new C35631j0(this, r8, A0C2, 24));
                } else {
                    AnonymousClass187 r2 = this.A0L;
                    r2.A00.submit(new C35631j0(this, r8, A0C2, 25));
                }
            }
            this.A0D.A0d(r8);
        } else {
            A0B(this, r8, list2);
        }
        int size = list2.size();
        C27531Oo r1 = this.A0c;
        C238019x r6 = this.A0x;
        long A002 = C19970wo.A00(this.A0I);
        if (size == 1) {
            A032 = r6.A06(r8, (UserJid) list2.get(0), (C207209uj) null, 7, A002);
        } else {
            A032 = r6.A03(A0C2, r8, (UserJid) null, (C207209uj) null, list2, 14, A002);
        }
        r1.BJb(A032, 2);
    }

    public void A0b(AnonymousClass144 r4, List list) {
        this.A19.A01(new C35631j0(this, r4, list, 26), 46);
    }

    public void A0c(AnonymousClass147 r14, UserJid userJid) {
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/addGroupParticipantOnCurrentThread/adding participant: ");
        sb.append(userJid);
        sb.append(" to group:");
        sb.append(r14);
        Log.i(sb.toString());
        AnonymousClass6X6.A00(this.A0U.A07.A0C(r14), userJid, this.A0Z.A0B(userJid), 0, false, true);
        this.A0D.A0d(r14);
        C181758nz A062 = this.A0x.A06(r14, userJid, (C207209uj) null, 4, C19970wo.A00(this.A0I));
        this.A0O.A0P(A062);
        A1H.post(new C35721j9(this, A062, 16));
    }

    public void A0e(AnonymousClass147 r13, UserJid userJid, long j, boolean z) {
        String str;
        AnonymousClass16D r3 = this.A0C;
        AnonymousClass141 A0A2 = r3.A0A(r13);
        if (A0A2 == null) {
            str = "groupmgr/onAllowNonAdminSubGroupCreation/new group";
        } else {
            boolean z2 = z;
            if (A0A2.A0c == z2) {
                str = "groupmgr/onAllowNonAdminSubGroupCreation/did not change";
            } else {
                Log.i("groupmgr/onAllowNonAdminSubGroupCreation/changed");
                AnonymousClass141 A0D2 = r3.A0D(r13);
                if (A0D2.A0c != z2) {
                    A0D2.A0c = z2;
                    r3.A05.A0U(A0D2);
                    r3.A04.A0A(A0D2);
                }
                AnonymousClass147 A022 = A02(this, r13);
                if (A022 == null) {
                    Log.e("groupmgr/onAllowNonAdminSubGroupCreation/no cag");
                    return;
                } else if (!this.A0U.A0C(A022)) {
                    str = "groupmgr/onAllowNonAdminSubGroupCreation/not participant";
                } else {
                    C27531Oo r4 = this.A0c;
                    C238019x r5 = this.A0x;
                    int i = 138;
                    if (z) {
                        i = 137;
                    }
                    C181758nz A042 = r5.A04((AnonymousClass6X6) null, A022, (C207209uj) null, i, j);
                    A042.A0q(userJid);
                    Log.i("groupactionhandler/handleCommunityAction/handle allow non admin sub group creation change");
                    r4.A01.A0h(A042);
                    AnonymousClass11F r32 = A042.A1J.A00;
                    AnonymousClass17Y r2 = r4.A00;
                    r2.A0H(new C35721j9(r4, r32, 4));
                    r2.A0H(new C35721j9(r4, r13, 4));
                    return;
                }
            }
        }
        Log.i(str);
    }

    public void A0f(AnonymousClass147 r10, AnonymousClass3G4 r11, long j) {
        AnonymousClass147 r4 = r10;
        C65073Qp A092 = this.A0M.A09(r10, false);
        if (A092 == null) {
            Log.e("groupmgr/onGrowthLockChanged/notification for nonexistent group");
            return;
        }
        C181758nz A002 = this.A0o.A00(r4, A092.A0e, r11, j);
        if (A002 != null) {
            this.A0c.BJb(A002, 8);
        }
        AnonymousClass1LW r3 = this.A0P;
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updategroupchatgrowthlockifexists/");
        sb.append(r10);
        Log.i(sb.toString());
        r3.A00.A01(new C35631j0(r3, r10, r11, 12), 58);
    }

    public void A0g(UserJid userJid, C203399nx r6) {
        Jid A0X2;
        Jid A0X3;
        HashMap hashMap = new HashMap();
        if (AnonymousClass143.A0I(userJid) && (A0X3 = r6.A0X(PhoneUserJid.class, "creator_pn")) != null) {
            hashMap.put(userJid, A0X3);
        }
        Jid A0X4 = r6.A0X(UserJid.class, "s_o");
        if (AnonymousClass143.A0I(A0X4) && (A0X2 = r6.A0X(PhoneUserJid.class, "s_o_pn")) != null) {
            hashMap.put(A0X4, A0X2);
        }
        if (!hashMap.isEmpty()) {
            this.A0t.A01(hashMap);
        }
    }

    public void A0h(UserJid userJid, C207209uj r13, int i, long j, boolean z) {
        String str;
        C181758nz A042;
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onGroupRestrictModeToggled/");
        C207209uj r7 = r13;
        sb.append(r13);
        sb.append("/");
        boolean z2 = z;
        sb.append(z2);
        sb.append("/isServerTriggered");
        boolean z3 = false;
        if (i > 0) {
            z3 = true;
        }
        sb.append(z3);
        Log.i(sb.toString());
        AnonymousClass11F A002 = AnonymousClass143.A00(r13.A02);
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(A002);
        C18740tg.A06(A032);
        AnonymousClass16D r2 = this.A0C;
        AnonymousClass141 A0A2 = r2.A0A(A032);
        if (A0A2 == null) {
            str = "groupmgr/onGroupRestrictModeToggled/new group";
            Log.i(str);
        } else if (A0A2.A13 != z2) {
            Log.i("groupmgr/onGroupRestrictModeToggled/changed");
            AnonymousClass141 A0D2 = r2.A0D(A032);
            if (A0D2.A13 != z2) {
                A0D2.A13 = z2;
                r2.A05.A0U(A0D2);
                r2.A04.A0A(A0D2);
            }
            long j2 = j;
            if (i > 0) {
                A042 = new C181418nR(this.A0x.A01.A02(A032, true), i, j2);
            } else {
                C238019x r4 = this.A0x;
                int i2 = 30;
                if (z) {
                    i2 = 29;
                }
                A042 = r4.A04((AnonymousClass6X6) null, A032, r7, i2, j2);
                A042.A0q(userJid);
            }
            A0T(3008, A042);
        } else {
            str = "groupmgr/onGroupRestrictModeToggled/did not change";
            Log.i(str);
        }
        this.A0s.A01(r13);
    }

    public void A0i(C207209uj r4, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onGroupSuspensionChanged/");
        sb.append(r4);
        sb.append("/");
        sb.append(z);
        Log.i(sb.toString());
        AnonymousClass11F A002 = AnonymousClass143.A00(r4.A02);
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(A002);
        C18740tg.A06(A032);
        AnonymousClass16D r1 = this.A0C;
        AnonymousClass141 A0A2 = r1.A0A(A032);
        if (A0A2 == null) {
            str = "groupmgr/onGroupSuspensionChanged/new group";
            Log.i(str);
        } else if (A0A2.A0r != z) {
            Log.i("groupmgr/onGroupSuspensionChanged/changed");
            r1.A0a(A032, z);
        } else {
            str = "groupmgr/onGroupSuspensionChanged/did not change";
            Log.i(str);
        }
        this.A0s.A01(r4);
    }

    public void A0j(List list) {
        ArrayList arrayList = new ArrayList();
        C19730wQ r0 = this.A05;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        C223313w A082 = r0.A08();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass147 r1 = (AnonymousClass147) it.next();
            AnonymousClass6X6 A0C2 = this.A0U.A07.A0C(r1);
            A0C2.A09(phoneUserJid);
            if (A082 != null) {
                A0C2.A09(A082);
            }
            arrayList.add(r1);
            this.A0p.A0X(r1);
            A0B(this, r1, Collections.singletonList(phoneUserJid));
        }
        this.A19.A01(new C35631j0(this, arrayList, phoneUserJid, 23), 47);
    }

    public void A0k(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("groupmgr/onLeaveGroup/");
        sb.append(Arrays.deepToString(list.toArray()));
        Log.i(sb.toString());
        C19730wQ r3 = this.A05;
        r3.A0G();
        PhoneUserJid phoneUserJid = r3.A03;
        C18740tg.A06(phoneUserJid);
        C223313w A082 = r3.A08();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AnonymousClass147 r8 = (AnonymousClass147) it.next();
            this.A0D.A0d(r8);
            this.A0C.A0Z(r8, 2);
            AnonymousClass6X6 A0C2 = this.A0U.A07.A0C(r8);
            if (A0C2.A0O(r3)) {
                A0C2.A09(phoneUserJid);
                if (A082 != null) {
                    A0C2.A09(A082);
                }
                this.A0p.A0X(r8);
                C19770wU r5 = this.A12;
                r5.Boy(new C35721j9(this, r8, 9));
                r5.Bp1(new C35721j9(this, r8, 11));
                A0B(this, r8, Collections.singletonList(phoneUserJid));
                C181758nz A062 = this.A0x.A06(r8, phoneUserJid, (C207209uj) null, 5, C19970wo.A00(this.A0I));
                if (!z || !this.A0M.A0M(r8)) {
                    A0T(3, A062);
                } else {
                    this.A0c.BJb(A062, 7);
                }
                z2 = true;
            }
            if (this.A0M.A06(r8) == 1) {
                this.A08.A0C(r8);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("groupmgr/onLeaveGroup/deletedParentGroup/jid = ");
                sb2.append(r8);
                Log.i(sb2.toString());
            }
        }
        if (z2) {
            RegistrationIntentService.A04(this.A18.A00);
        }
    }

    public void A0l(Set set) {
        this.A0S.A01(set);
        this.A16.A00(set);
        C27551Oq r2 = this.A0X;
        AnonymousClass00C.A0D(set, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            r2.A00((AnonymousClass147) it.next());
        }
        this.A04.A0H(new C35721j9(this, set, 19));
    }

    public boolean A0n(AnonymousClass141 r3, AnonymousClass147 r4) {
        AnonymousClass1NN r1 = this.A1D;
        if (r1.A00(r3, r4) || r1.A03.A00(r3, r4)) {
            return true;
        }
        return false;
    }

    public boolean A0q(AnonymousClass147 r5) {
        AnonymousClass17X r3 = this.A0U;
        if ((!r3.A0I(r5) || !this.A0M.A0S(r5)) && (!this.A11.A01() || this.A0M.A05(r5) != 3 || !r3.A0D(r5))) {
            return true;
        }
        return false;
    }

    public boolean A0r(AnonymousClass147 r4) {
        if (this.A05.A0L()) {
            AnonymousClass141 A082 = this.A0C.A08(r4);
            if (A082 == null) {
                return false;
            }
            if (A082.A0S != null || !TextUtils.isEmpty(A082.A0V)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void A08(AnonymousClass6X6 r4, C20350xQ r5, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (AnonymousClass143.A0I(((AnonymousClass6PM) it.next()).A03)) {
                if (r4.A00 == 0) {
                    r5.A03.A0E("addParticipants/group with lid", "trying to add a lid participant when is not an incognito CAG", false);
                }
            }
        }
        r4.A0K(list);
    }

    public static void A0C(C20350xQ r3, DeviceJid deviceJid, AnonymousClass147 r5, C207209uj r6, boolean z) {
        if (r3.A0K.A0A.A07(new AnonymousClass6EU(C133256Xm.A02(deviceJid), r5.getRawString()), false)) {
            r3.A06.A0K(r5, 1);
        }
        if (z) {
            r3.A0s.A01(r6);
        }
    }

    public ArrayList A0R(Map map) {
        ArrayList arrayList = new ArrayList(map.keySet().size());
        for (AnonymousClass11F A082 : map.keySet()) {
            AnonymousClass141 A083 = this.A0C.A08(A082);
            if (!(A083 == null || A083.A0F == null)) {
                arrayList.add(A083);
            }
        }
        Collections.sort(arrayList, new AnonymousClass2VJ(this.A05, this.A0D, this));
        return arrayList;
    }

    public void A0d(AnonymousClass147 r4, UserJid userJid) {
        A0a(r4, Collections.singletonList(userJid));
        this.A04.A0H(new C35721j9(this, r4, 13));
    }

    public C20350xQ(C19700wN r13, AnonymousClass17Y r14, C19730wQ r15, AnonymousClass1DT r16, C21100yf r17, C26851Lt r18, AnonymousClass1LV r19, AnonymousClass1FG r20, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass1PR r22, C19600wD r23, AnonymousClass16D r24, AnonymousClass1PC r25, AnonymousClass171 r26, AnonymousClass16K r27, C20430xY r28, C27301Nr r29, AnonymousClass1A6 r30, C19970wo r31, C19630wG r32, C19420v0 r33, C18820ts r34, AnonymousClass189 r35, AnonymousClass187 r36, AnonymousClass1C7 r37, C220412q r38, C24381Cf r39, C20310xM r40, AnonymousClass1LW r41, AnonymousClass1PB r42, AnonymousClass1PF r43, AnonymousClass1PG r44, AnonymousClass182 r45, C232617u r46, AnonymousClass17X r47, AnonymousClass168 r48, C24541Cv r49, AnonymousClass12P r50, C27551Oq r51, C27291Nq r52, C26211Jh r53, C231417i r54, C20810yC r55, GetSubgroupsManager getSubgroupsManager, C27531Oo r57, C20360xR r58, AnonymousClass1P4 r59, C27281Np r60, C27541Op r61, AnonymousClass1NN r62, C230717b r63, C233117z r64, C20510xg r65, C26801Lo r66, AnonymousClass1PS r67, GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, AnonymousClass1EL r69, C27321Nt r70, AnonymousClass1P5 r71, AnonymousClass19A r72, AnonymousClass1DL r73, AnonymousClass1C4 r74, AnonymousClass1EV r75, AnonymousClass1PE r76, AnonymousClass1O8 r77, AnonymousClass1P3 r78, C237919w r79, C238019x r80, C27561Or r81, AnonymousClass1C6 r82, AnonymousClass1AQ r83, AnonymousClass1EM r84, C19770wU r85, AnonymousClass005 r86, AnonymousClass005 r87) {
        AnonymousClass1PT r11 = new AnonymousClass1PT();
        this.A0h = r11;
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0I = r31;
        C20810yC r9 = r55;
        this.A0a = r9;
        this.A04 = r14;
        this.A03 = r13;
        this.A05 = r15;
        C19630wG r5 = r32;
        this.A18 = r5;
        this.A12 = r85;
        this.A0M = r38;
        this.A0s = r74;
        this.A0z = r82;
        this.A0r = r73;
        this.A0i = r63;
        this.A0V = r48;
        this.A0q = r72;
        AnonymousClass16D r3 = r24;
        this.A0C = r3;
        this.A0P = r41;
        this.A06 = r16;
        AnonymousClass171 r4 = r26;
        this.A0D = r4;
        this.A11 = r84;
        this.A1D = r62;
        this.A0W = r49;
        C20310xM r7 = r40;
        this.A0O = r7;
        this.A10 = r83;
        this.A0Y = r52;
        this.A0k = r65;
        this.A0G = r29;
        this.A0o = r70;
        this.A0K = r35;
        this.A0n = r69;
        this.A0Z = r54;
        this.A19 = r37;
        this.A0E = r27;
        this.A0F = r28;
        this.A0w = r79;
        this.A0c = r57;
        this.A0X = r51;
        this.A0y = r81;
        this.A0b = getSubgroupsManager;
        this.A0f = r60;
        this.A1B = r50;
        this.A0u = r77;
        this.A0v = r78;
        this.A1C = r53;
        this.A0J = r33;
        this.A08 = r19;
        this.A09 = r20;
        this.A0H = r30;
        this.A0l = r66;
        this.A0x = r80;
        this.A0e = r59;
        this.A0N = r39;
        this.A0T = r46;
        this.A1F = r75;
        this.A0p = r71;
        this.A13 = r86;
        C27541Op r10 = r61;
        this.A0g = r10;
        AnonymousClass17X r8 = r47;
        this.A0U = r8;
        this.A0B = r23;
        this.A0Q = r42;
        this.A17 = r25;
        this.A1E = getGroupInfoProtocolHelper;
        this.A0j = r64;
        this.A0t = r76;
        this.A1A = r45;
        this.A1G = r87;
        this.A07 = r18;
        this.A0R = r43;
        this.A0S = r44;
        this.A0m = r67;
        this.A0L = r36;
        this.A0A = memberSuggestedGroupsManager;
        this.A16 = r22;
        this.A0d = r58;
        A1H = new AnonymousClass1PU(r14, r17, r3, r4, r5, r34, r7, r8, r9, r10, r11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d6, code lost:
        if (r16 != false) goto L_0x02d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass6X6 r24, X.C20350xQ r25, X.AnonymousClass3S5 r26, java.lang.String r27, java.util.Map r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r10 = r28
            int r0 = r10.size()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            r3 = r24
            X.144 r14 = r3.A05
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r4 = X.AnonymousClass6SZ.A00(r14)
            X.AcK r13 = X.C21891AcK.create()
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x002b:
            boolean r0 = r16.hasNext()
            r2 = r25
            if (r0 == 0) goto L_0x011a
            java.lang.Object r9 = r16.next()
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Object r8 = r10.get(r9)
            X.3Kj r8 = (X.C63523Kj) r8
            X.C18740tg.A06(r8)
            java.lang.String r5 = r8.A04
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x010e
            r7 = 1
        L_0x0051:
            X.6PM r6 = r3.A08(r9)
            if (r6 != 0) goto L_0x00e7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "groupmgr/sync-add-participant: "
            r5.append(r0)
            r5.append(r9)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.add(r9)
        L_0x006e:
            com.whatsapp.jid.UserJid r6 = r8.A02
            boolean r0 = X.AnonymousClass143.A0I(r6)
            if (r0 == 0) goto L_0x00da
            com.whatsapp.jid.PhoneUserJid r5 = r8.A01
            if (r5 == 0) goto L_0x00da
        L_0x007a:
            r13.put(r5, r6)
        L_0x007d:
            X.17i r6 = r2.A0Z
            java.util.HashSet r0 = r6.A0B(r9)
            java.util.HashSet r12 = X.AnonymousClass6X6.A02(r0)
            r5 = 0
            X.6PM r0 = new X.6PM
            r0.<init>(r9, r12, r7, r5)
            r11.add(r0)
            boolean r0 = X.AnonymousClass143.A0I(r9)
            if (r0 == 0) goto L_0x00be
            X.0wQ r0 = r2.A05
            boolean r2 = r0.A0M(r9)
            if (r2 == 0) goto L_0x00be
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r9 = r0.A03
            X.C18740tg.A06(r9)
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            X.C18740tg.A06(r0)
            java.util.HashSet r0 = r6.A0B(r0)
            java.util.HashSet r2 = X.AnonymousClass6X6.A02(r0)
            X.6PM r0 = new X.6PM
            r0.<init>(r9, r2, r7, r5)
            r11.add(r0)
        L_0x00be:
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x002b
            if (r33 == 0) goto L_0x002b
            X.13w r2 = r8.A00
            java.util.HashSet r0 = r6.A0B(r2)
            java.util.HashSet r6 = X.AnonymousClass6X6.A02(r0)
            X.6PM r0 = new X.6PM
            r0.<init>(r2, r6, r7, r5)
            r11.add(r0)
            goto L_0x002b
        L_0x00da:
            boolean r0 = X.AnonymousClass143.A0J(r6)
            if (r0 == 0) goto L_0x007d
            X.13w r0 = r8.A00
            if (r0 == 0) goto L_0x007d
            r5 = r6
            r6 = r0
            goto L_0x007a
        L_0x00e7:
            int r0 = r6.A01
            if (r0 == r7) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "groupmgr/sync-change-admin-participant: "
            r5.append(r0)
            r5.append(r9)
            java.lang.String r0 = " was "
            r5.append(r0)
            int r0 = r6.A01
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r15.add(r6)
            goto L_0x006e
        L_0x010e:
            java.lang.String r0 = "superadmin"
            boolean r0 = r0.equals(r5)
            r7 = 0
            if (r0 == 0) goto L_0x0051
            r7 = 2
            goto L_0x0051
        L_0x011a:
            A08(r3, r2, r11)
            java.util.Collection r0 = r10.values()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            if (r0 == 0) goto L_0x0144
            java.util.Iterator r7 = r0.iterator()
        L_0x012c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r5 = r7.next()
            X.3Kj r5 = (X.C63523Kj) r5
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x012c
            X.13w r0 = r5.A00
            r6.add(r0)
            goto L_0x012c
        L_0x0144:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.0y7 r5 = r3.A06()
            X.14x r9 = r5.iterator()
        L_0x0151:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0194
            java.lang.Object r7 = r9.next()
            X.11F r7 = (X.AnonymousClass11F) r7
            boolean r5 = r10.containsKey(r7)
            if (r5 != 0) goto L_0x0151
            boolean r5 = r6.contains(r7)
            if (r5 != 0) goto L_0x0151
            X.0wQ r8 = r2.A05
            boolean r5 = r8.A0M(r7)
            if (r5 == 0) goto L_0x017c
            X.13w r5 = r8.A08()
            boolean r5 = r10.containsKey(r5)
            if (r5 == 0) goto L_0x017c
            goto L_0x0151
        L_0x017c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r5 = "groupmgr/sync-remove-participant:"
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r0.add(r7)
            goto L_0x0151
        L_0x0194:
            X.0wQ r8 = r2.A05
            r8.A0G()
            com.whatsapp.jid.PhoneUserJid r7 = r8.A03
            X.13w r6 = r8.A08()
            boolean r5 = r1.contains(r6)
            if (r5 == 0) goto L_0x0363
            boolean r5 = r0.contains(r7)
            if (r5 == 0) goto L_0x0363
            r1.remove(r6)
            r0.remove(r7)
        L_0x01b1:
            r3.A0L(r0)
            java.util.List r6 = A05(r2, r4, r1)
            java.util.List r7 = A05(r2, r4, r0)
            android.os.Parcelable$Creator r5 = X.AnonymousClass147.CREATOR
            X.147 r9 = X.C65533Sl.A03(r14)
            X.12q r5 = r2.A0M
            int r9 = r5.A06(r9)
            r5 = 3
            if (r9 != r5) goto L_0x0312
            r16 = 0
        L_0x01cd:
            r5 = 1
            if (r29 == 0) goto L_0x02ec
            java.util.ArrayList r10 = r3.A0F()
            boolean r9 = r6.isEmpty()
            if (r9 != 0) goto L_0x020b
            X.1Oo r9 = r2.A0c
            X.19x r12 = r2.A0x
            r21 = 0
            X.0wo r11 = r2.A0I
            long r24 = X.C19970wo.A00(r11)
            if (r31 == 0) goto L_0x02e9
            int r11 = r10.size()
            if (r11 != r5) goto L_0x02e9
            r5 = 0
            java.lang.Object r5 = r10.get(r5)
            X.6PM r5 = (X.AnonymousClass6PM) r5
            com.whatsapp.jid.UserJid r5 = r5.A03
        L_0x01f7:
            r23 = 12
            r22 = r6
            r18 = r3
            r19 = r4
            r20 = r5
            r17 = r12
            X.8nz r10 = r17.A03(r18, r19, r20, r21, r22, r23, r24)
            r5 = 2
            r9.BJb(r10, r5)
        L_0x020b:
            boolean r5 = r7.isEmpty()
            if (r5 != 0) goto L_0x0231
            X.1Oo r9 = r2.A0c
            X.19x r5 = r2.A0x
            r18 = 0
            X.0wo r10 = r2.A0I
            long r24 = X.C19970wo.A00(r10)
            r23 = 13
            r21 = r18
            r17 = r5
            r19 = r4
            r20 = r18
            r22 = r7
            X.8nz r10 = r17.A03(r18, r19, r20, r21, r22, r23, r24)
            r5 = 2
            r9.BJb(r10, r5)
        L_0x0231:
            r2.A0b(r4, r15)
        L_0x0234:
            X.17X r4 = r2.A0U
            r4.A07(r3)
            boolean r4 = r6.isEmpty()
            r5 = r26
            if (r4 != 0) goto L_0x025d
            boolean r4 = r3.A0O(r8)
            if (r4 == 0) goto L_0x025d
            r8.A0G()
            com.whatsapp.jid.PhoneUserJid r4 = r8.A03
            boolean r4 = r6.contains(r4)
            r9 = r32
            if (r4 == 0) goto L_0x02e2
            X.0y7 r8 = r3.A06()
            int r4 = r5.A00
            r2.A09(r3, r8, r4, r9)
        L_0x025d:
            X.0wU r9 = r2.A12
            r8 = 18
            X.1j9 r4 = new X.1j9
            r4.<init>(r2, r1, r8)
            r9.Boy(r4)
            java.lang.String r8 = r5.A01
            java.lang.String r4 = "phash"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x02c9
            int r4 = r1.size()
            if (r4 > 0) goto L_0x027f
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x02c9
        L_0x027f:
            X.1DT r2 = r2.A06
            boolean r9 = r5.A03
            int r1 = r1.size()
            int r8 = r0.size()
            boolean r4 = r5.A04
            java.util.Map r0 = r3.A08
            int r5 = r0.size()
            X.2RO r3 = new X.2RO
            r3.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r3.A00 = r0
            X.12q r0 = r2.A07
            java.lang.Integer r0 = X.AnonymousClass3UK.A06(r0, r14)
            r3.A03 = r0
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            long r0 = (long) r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A01 = r0
            int r0 = X.AnonymousClass3UK.A03(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            X.0yW r0 = r2.A0E
            r0.Bly(r3)
        L_0x02c9:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02d8
            r1 = 0
            if (r16 == 0) goto L_0x02d9
        L_0x02d8:
            r1 = 1
        L_0x02d9:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x02e1
            r1 = r1 | 2
        L_0x02e1:
            return r1
        L_0x02e2:
            int r4 = r5.A00
            r2.A09(r3, r6, r4, r9)
            goto L_0x025d
        L_0x02e9:
            r5 = 0
            goto L_0x01f7
        L_0x02ec:
            if (r30 == 0) goto L_0x0234
            r5 = r27
            if (r27 == 0) goto L_0x0234
            java.lang.String r4 = r3.A0E()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0234
            X.1Oo r10 = r2.A0c
            X.19x r11 = r2.A0x
            X.0wo r4 = r2.A0I
            long r4 = X.C19970wo.A00(r4)
            r9 = 86
            X.2bI r5 = r11.A02(r14, r9, r4)
            r4 = 2
            r10.BJb(r5, r4)
            goto L_0x0234
        L_0x0312:
            X.0y7 r5 = r3.A06()
            X.14x r11 = r5.iterator()
            r16 = 0
        L_0x031c:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x01cd
            java.lang.Object r10 = r11.next()
            com.whatsapp.jid.Jid r10 = (com.whatsapp.jid.Jid) r10
            boolean r5 = X.AnonymousClass143.A0I(r10)
            if (r5 == 0) goto L_0x0359
            X.7oF r9 = r13.inverse()
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.AnonymousClass00C.A0E(r10, r5)
            java.lang.Object r5 = r9.get(r10)
        L_0x033b:
            if (r5 == 0) goto L_0x031c
            boolean r9 = r6.contains(r5)
            if (r9 == 0) goto L_0x034c
            r6.remove(r5)
            r7.remove(r10)
        L_0x0349:
            r16 = 1
            goto L_0x031c
        L_0x034c:
            boolean r9 = r7.contains(r5)
            if (r9 == 0) goto L_0x031c
            r6.remove(r10)
            r7.remove(r5)
            goto L_0x0349
        L_0x0359:
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid"
            X.AnonymousClass00C.A0E(r10, r5)
            java.lang.Object r5 = r13.get(r10)
            goto L_0x033b
        L_0x0363:
            boolean r5 = r1.contains(r7)
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r0.contains(r6)
            if (r5 == 0) goto L_0x01b1
            r1.remove(r7)
            r0.remove(r6)
            goto L_0x01b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20350xQ.A00(X.6X6, X.0xQ, X.3S5, java.lang.String, java.util.Map, boolean, boolean, boolean, boolean, boolean):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.8nD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: X.8nC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: X.8nS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: X.8nU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v69, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v73, resolved type: X.8nY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v78, resolved type: X.8nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v86, resolved type: X.8nI} */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.8nG] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.8nG] */
    /* JADX WARNING: type inference failed for: r3v43, types: [X.8nH] */
    /* JADX WARNING: type inference failed for: r3v46, types: [X.8nH] */
    /* JADX WARNING: type inference failed for: r3v48, types: [X.8nv] */
    /* JADX WARNING: type inference failed for: r3v51, types: [X.8nv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.AnonymousClass6X6 r19, com.whatsapp.jid.GroupJid r20, com.whatsapp.jid.GroupJid r21, X.AnonymousClass147 r22, com.whatsapp.jid.UserJid r23, com.whatsapp.jid.UserJid r24, X.C207209uj r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.List r29, int r30, long r31, boolean r33) {
        /*
            r18 = this;
            r8 = r21
            java.lang.String r0 = "auto_add"
            r9 = r26
            boolean r10 = r0.equals(r9)
            r4 = r18
            r6 = r20
            r11 = r22
            r12 = r23
            r13 = r25
            r14 = r29
            r0 = r31
            if (r10 != 0) goto L_0x01ef
            java.lang.String r2 = "default_sub_group_admin_add"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x01ef
            java.lang.String r2 = "invite_auto_add"
            boolean r3 = r2.equals(r9)
            r10 = r19
            r5 = r24
            r2 = r28
            if (r3 == 0) goto L_0x0067
            if (r33 == 0) goto L_0x0277
            X.19x r9 = r4.A0x
            android.os.Parcelable$Creator r3 = X.AnonymousClass147.CREATOR
            X.147 r10 = X.C65533Sl.A03(r11)
            X.147 r7 = X.C65533Sl.A03(r8)
            if (r25 != 0) goto L_0x0061
            X.19w r6 = r9.A01
            r3 = 1
            X.3Qa r6 = r6.A02(r10, r3)
            X.8nI r3 = new X.8nI
            r3.<init>((X.C64933Qa) r6, (long) r0)
        L_0x004c:
            r3.A1h(r7, r2)
            r3.A0q(r5)
            r3.A16(r2)
            int r0 = r3.A00
            X.C238019x.A00(r5, r3, r9, r14, r0)
        L_0x005a:
            X.1Oo r1 = r4.A0c
            r0 = 2
            r1.BJb(r3, r0)
            return
        L_0x0061:
            X.8nI r3 = new X.8nI
            r3.<init>((X.C207209uj) r13, (long) r0)
            goto L_0x004c
        L_0x0067:
            java.lang.String r3 = "invite"
            r6 = r30
            if (r33 == 0) goto L_0x00c0
            r7 = 3
            if (r6 != r7) goto L_0x00c0
            boolean r6 = r3.equals(r9)
            X.19x r7 = r4.A0x
            android.os.Parcelable$Creator r3 = X.AnonymousClass147.CREATOR
            X.147 r9 = X.C65533Sl.A03(r11)
            X.147 r8 = X.C65533Sl.A03(r8)
            if (r6 == 0) goto L_0x00a5
            if (r25 != 0) goto L_0x009f
            X.19w r6 = r7.A01
            r3 = 1
            X.3Qa r6 = r6.A02(r9, r3)
            X.8nH r3 = new X.8nH
            r3.<init>((X.C64933Qa) r6, (long) r0)
        L_0x0090:
            r3.A1h(r8, r2)
            r3.A0q(r5)
            r3.A16(r2)
        L_0x0099:
            int r0 = r3.A00
            X.C238019x.A00(r5, r3, r7, r14, r0)
            goto L_0x005a
        L_0x009f:
            X.8nH r3 = new X.8nH
            r3.<init>((X.C207209uj) r13, (long) r0)
            goto L_0x0090
        L_0x00a5:
            if (r25 != 0) goto L_0x00ba
            X.19w r6 = r7.A01
            r3 = 1
            X.3Qa r6 = r6.A02(r9, r3)
            X.8nJ r3 = new X.8nJ
            r3.<init>((X.C64933Qa) r6, (long) r0)
        L_0x00b3:
            r3.A1h(r8, r2)
            r3.A0q(r5)
            goto L_0x0099
        L_0x00ba:
            X.8nJ r3 = new X.8nJ
            r3.<init>((X.C207209uj) r13, (long) r0)
            goto L_0x00b3
        L_0x00c0:
            X.1EM r5 = r4.A11
            boolean r5 = r5.A02(r6)
            r7 = r27
            if (r5 == 0) goto L_0x0105
            X.0wQ r5 = r4.A05
            r5.A0G()
            com.whatsapp.jid.PhoneUserJid r5 = r5.A03
            boolean r5 = r14.contains(r5)
            if (r5 == 0) goto L_0x0105
            X.19x r5 = r4.A0x
            android.os.Parcelable$Creator r3 = X.AnonymousClass147.CREATOR
            X.147 r10 = X.C65533Sl.A03(r8)
            r8 = 1
            if (r25 != 0) goto L_0x00ff
            X.19w r3 = r5.A01
            X.3Qa r6 = r3.A02(r11, r8)
            X.8nY r3 = new X.8nY
            r3.<init>((X.C64933Qa) r6, (long) r0)
        L_0x00ed:
            r3.A1h(r10, r7)
            r3.A1i(r11, r2, r8)
            r3.A0q(r12)
            r3.A0m = r9
        L_0x00f8:
            int r0 = r3.A00
            X.C238019x.A00(r12, r3, r5, r14, r0)
            goto L_0x005a
        L_0x00ff:
            X.8nY r3 = new X.8nY
            r3.<init>((X.C207209uj) r13, (long) r0)
            goto L_0x00ed
        L_0x0105:
            java.lang.String r2 = "accept"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0119
            r15 = 52
        L_0x010f:
            X.19x r9 = r4.A0x
            r16 = r0
            X.8nz r3 = r9.A03(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x005a
        L_0x0119:
            java.lang.String r2 = "default_sub_group_promote"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0124
            r15 = 93
            goto L_0x010f
        L_0x0124:
            boolean r2 = r3.equals(r9)
            if (r2 == 0) goto L_0x0156
            r2 = 2
            if (r6 == r2) goto L_0x0130
            r2 = 6
            if (r6 != r2) goto L_0x0183
        L_0x0130:
            if (r33 == 0) goto L_0x0183
            X.19x r9 = r4.A0x
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR
            X.147 r5 = X.C65533Sl.A03(r8)
            X.19w r3 = r9.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r11, r2)
            X.8nC r3 = new X.8nC
            r3.<init>(r2, r0)
            r3.A1h(r5, r7)
            r3.A00 = r6
        L_0x014b:
            int r0 = r3.A00
            X.C238019x.A00(r12, r3, r9, r14, r0)
            r0 = 1
            X.C238019x.A01(r12, r3, r9, r0)
            goto L_0x005a
        L_0x0156:
            java.lang.String r2 = "linked_group_join"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0161
            r15 = 79
            goto L_0x010f
        L_0x0161:
            r2 = 2
            if (r6 == r2) goto L_0x0167
            r2 = 6
            if (r6 != r2) goto L_0x01b9
        L_0x0167:
            if (r33 == 0) goto L_0x01b9
            X.19x r9 = r4.A0x
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR
            X.147 r5 = X.C65533Sl.A03(r8)
            X.19w r3 = r9.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r11, r2)
            X.8nD r3 = new X.8nD
            r3.<init>(r2, r0)
            r3.A1h(r5, r7)
            r3.A00 = r6
            goto L_0x014b
        L_0x0183:
            int r3 = r14.size()
            r5 = 0
            r2 = 1
            if (r3 != r2) goto L_0x01b5
            X.0wQ r3 = r4.A05
            java.lang.Object r2 = r14.get(r5)
            X.11F r2 = (X.AnonymousClass11F) r2
            boolean r2 = r3.A0M(r2)
            if (r2 == 0) goto L_0x01b5
            X.0yC r5 = r4.A0a
            r3 = 4579(0x11e3, float:6.417E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r5, r3)
            if (r2 == 0) goto L_0x01b5
            X.19x r5 = r4.A0x
            X.19w r3 = r5.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r11, r2)
            X.8nU r3 = new X.8nU
            r3.<init>(r2, r13, r0)
            goto L_0x00f8
        L_0x01b5:
            r15 = 20
            goto L_0x010f
        L_0x01b9:
            int r3 = r14.size()
            r5 = 0
            r2 = 1
            if (r3 != r2) goto L_0x01eb
            X.0wQ r3 = r4.A05
            java.lang.Object r2 = r14.get(r5)
            X.11F r2 = (X.AnonymousClass11F) r2
            boolean r2 = r3.A0M(r2)
            if (r2 == 0) goto L_0x01eb
            X.0yC r5 = r4.A0a
            r3 = 4579(0x11e3, float:6.417E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r5, r3)
            if (r2 == 0) goto L_0x01eb
            X.19x r5 = r4.A0x
            X.19w r3 = r5.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r11, r2)
            X.8nS r3 = new X.8nS
            r3.<init>(r2, r13, r0)
            goto L_0x00f8
        L_0x01eb:
            r15 = 12
            goto L_0x010f
        L_0x01ef:
            if (r21 != 0) goto L_0x01f7
            X.1LV r2 = r4.A08
            X.147 r8 = r2.A02(r11)
        L_0x01f7:
            r5 = 0
            if (r8 == 0) goto L_0x0275
            X.12q r2 = r4.A0M
            java.lang.String r7 = r2.A0D(r8)
            r3 = 1
            r2 = 0
            X.9Wj r9 = new X.9Wj
            r9.<init>(r8, r7, r3, r2)
        L_0x0207:
            if (r20 == 0) goto L_0x0216
            X.12q r2 = r4.A0M
            java.lang.String r7 = r2.A0D(r6)
            r3 = 2
            r2 = 0
            X.9Wj r5 = new X.9Wj
            r5.<init>(r6, r7, r3, r2)
        L_0x0216:
            X.19x r7 = r4.A0x
            android.os.Parcelable$Creator r2 = X.AnonymousClass147.CREATOR
            if (r10 == 0) goto L_0x024c
            X.147 r6 = X.C65533Sl.A03(r11)
            if (r25 != 0) goto L_0x0246
            X.19w r3 = r7.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r6, r2)
            X.8nG r3 = new X.8nG
            r3.<init>((X.C64933Qa) r2, (long) r0)
        L_0x022e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r9 == 0) goto L_0x0238
            r0.add(r9)
        L_0x0238:
            if (r5 == 0) goto L_0x023d
            r0.add(r5)
        L_0x023d:
            r3.A1f(r0)
        L_0x0240:
            r3.A0q(r12)
            int r0 = r3.A00
            goto L_0x02b7
        L_0x0246:
            X.8nG r3 = new X.8nG
            r3.<init>((X.C207209uj) r13, (long) r0)
            goto L_0x022e
        L_0x024c:
            X.147 r8 = X.C65533Sl.A03(r11)
            r6 = 0
            if (r9 == 0) goto L_0x0273
            com.whatsapp.jid.GroupJid r2 = r9.A02
            X.147 r5 = X.C65533Sl.A03(r2)
            java.lang.String r6 = r9.A03
        L_0x025b:
            if (r25 != 0) goto L_0x026d
            X.19w r3 = r7.A01
            r2 = 1
            X.3Qa r2 = r3.A02(r8, r2)
            X.8nJ r3 = new X.8nJ
            r3.<init>((X.C64933Qa) r2, (long) r0)
        L_0x0269:
            r3.A1h(r5, r6)
            goto L_0x0240
        L_0x026d:
            X.8nJ r3 = new X.8nJ
            r3.<init>((X.C207209uj) r13, (long) r0)
            goto L_0x0269
        L_0x0273:
            r5 = r6
            goto L_0x025b
        L_0x0275:
            r9 = r5
            goto L_0x0207
        L_0x0277:
            if (r21 != 0) goto L_0x027f
            X.1LV r2 = r4.A08
            X.147 r8 = r2.A02(r11)
        L_0x027f:
            X.19x r7 = r4.A0x
            X.12q r3 = r4.A0M
            java.lang.String r2 = r3.A0D(r6)
            java.lang.String r5 = r3.A0D(r8)
            if (r25 != 0) goto L_0x02bc
            X.19w r9 = r7.A01
            r3 = 1
            X.3Qa r9 = r9.A02(r11, r3)
            X.8nv r3 = new X.8nv
            r3.<init>(r9, r0)
        L_0x0299:
            if (r20 == 0) goto L_0x02a7
            java.util.List r10 = r3.A00
            r9 = 2
            r1 = 0
            X.9Wj r0 = new X.9Wj
            r0.<init>(r6, r2, r9, r1)
            r10.add(r0)
        L_0x02a7:
            if (r8 == 0) goto L_0x02b5
            java.util.List r6 = r3.A00
            r2 = 1
            r1 = 0
            X.9Wj r0 = new X.9Wj
            r0.<init>(r8, r5, r2, r1)
            r6.add(r0)
        L_0x02b5:
            r0 = 101(0x65, float:1.42E-43)
        L_0x02b7:
            X.C238019x.A00(r12, r3, r7, r14, r0)
            goto L_0x005a
        L_0x02bc:
            X.8nv r3 = new X.8nv
            r3.<init>(r10, r13, r0)
            goto L_0x0299
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20350xQ.A0V(X.6X6, com.whatsapp.jid.GroupJid, com.whatsapp.jid.GroupJid, X.147, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, X.9uj, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x016e, code lost:
        if (r40 != false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0254, code lost:
        if (r80 != false) goto L_0x0256;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(X.AnonymousClass3S5 r55, X.AnonymousClass147 r56, X.AnonymousClass147 r57, com.whatsapp.jid.UserJid r58, X.AnonymousClass3QL r59, X.AnonymousClass3G4 r60, java.lang.Integer r61, java.lang.String r62, java.lang.String r63, java.util.Map r64, int r65, int r66, int r67, int r68, long r69, long r71, long r73, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86) {
        /*
            r54 = this;
            r11 = r71
            java.lang.String r0 = "groupmgr/onGroupInfoFromList"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r54
            X.16D r1 = r0.A0C
            r51 = r1
            r1 = r56
            r2 = r51
            X.141 r2 = r2.A0D(r1)
            java.lang.String r3 = r2.A0V
            boolean r40 = android.text.TextUtils.isEmpty(r3)
            boolean r3 = r2.A0p
            r19 = 0
            r5 = r83
            if (r3 == r5) goto L_0x0025
            r19 = 1
        L_0x0025:
            boolean r3 = r2.A0h
            r14 = 0
            r13 = r85
            if (r3 == r13) goto L_0x002d
            r14 = 1
        L_0x002d:
            boolean r4 = r2.A0e
            r10 = 0
            r3 = r86
            if (r4 == r3) goto L_0x0035
            r10 = 1
        L_0x0035:
            r52 = r63
            r53 = r62
            r23 = r59
            r45 = r58
            r26 = r68
            r37 = r84
            r27 = r69
            r35 = r81
            r34 = r80
            r33 = r79
            r32 = r78
            r31 = r77
            r30 = r76
            r29 = r75
            r24 = r53
            r25 = r52
            r36 = r5
            r38 = r13
            r39 = r3
            r20 = r2
            r21 = r0
            r22 = r45
            boolean r18 = A0J(r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            int r4 = r2.A02
            r5 = r65
            if (r4 == r5) goto L_0x030f
            r2.A02 = r5
            r18 = 1
            r17 = 1
        L_0x0071:
            r44 = r53
            X.12q r15 = r0.A0M
            boolean r5 = r15.A0M(r1)
            r4 = 1
            r16 = r5 ^ 1
            r6 = 0
            r7 = 3
            r32 = r66
            r5 = r32
            if (r5 != r7) goto L_0x0085
            r6 = 1
        L_0x0085:
            r5 = 0
            r29 = r57
            if (r16 == 0) goto L_0x027c
            boolean r3 = A0L(r0, r1, r6)
            if (r3 == 0) goto L_0x00ad
            X.1Oo r3 = r0.A0c
            X.19x r7 = r0.A0x
            X.0wo r8 = r0.A0I
            long r25 = X.C19970wo.A00(r8)
            r24 = 99
            r23 = r5
            r20 = r7
            r21 = r5
            r22 = r1
            X.8nz r7 = r20.A04(r21, r22, r23, r24, r25)
            X.0xM r3 = r3.A01
            r3.A0h(r7)
        L_0x00ad:
            X.1Oo r3 = r0.A0c
            X.19x r14 = r0.A0x
            r24 = 11
            r30 = r5
            r23 = r5
            r20 = r14
            r21 = r5
            r22 = r1
            r25 = r11
            X.8nz r8 = r20.A04(r21, r22, r23, r24, r25)
            r7 = r53
            r8.A16(r7)
            r7 = r45
            r8.A0q(r7)
            r3.BJb(r8, r4)
            X.0wQ r8 = r0.A05
            boolean r7 = r8.A0M(r7)
            if (r7 != 0) goto L_0x00f3
            r8.A0G()
            com.whatsapp.jid.PhoneUserJid r10 = r8.A03
            X.C18740tg.A06(r10)
            X.19w r7 = r14.A01
            X.3Qa r9 = r7.A02(r1, r4)
            r8 = 4
            X.8nz r7 = new X.8nz
            r7.<init>(r9, r8, r11)
            r7.A0q(r10)
            r8 = 2
            r3.BJb(r7, r8)
        L_0x00f3:
            if (r57 == 0) goto L_0x0104
            r24 = 0
            java.lang.String r22 = ""
            X.3QK r5 = new X.3QK
            r23 = 1
            r20 = r5
            r21 = r29
            r20.<init>(r21, r22, r23, r24)
        L_0x0104:
            X.3QK r7 = new X.3QK
            r20 = r7
            r21 = r1
            r22 = r53
            r23 = r32
            r24 = r11
            r20.<init>(r21, r22, r23, r24)
            r49 = 0
            int r8 = r7.A00
            if (r8 != r4) goto L_0x0128
            com.whatsapp.jid.GroupJid r4 = r7.A02
            android.os.Parcelable$Creator r8 = X.AnonymousClass147.CREATOR
            X.147 r8 = X.C65533Sl.A03(r4)
            if (r8 == 0) goto L_0x0128
            com.whatsapp.group.GetSubgroupsManager r4 = r0.A0b
            r4.A03(r8)
        L_0x0128:
            r46 = r30
            r50 = 0
            r41 = r7
            r42 = r5
            r43 = r0
            r44 = r45
            r45 = r30
            r47 = r27
            A0A(r41, r42, r43, r44, r45, r46, r47, r49, r50)
            if (r85 == 0) goto L_0x015b
            X.0wo r4 = r0.A0I
            long r25 = X.C19970wo.A00(r4)
            r24 = 150(0x96, float:2.1E-43)
            r23 = r30
            r20 = r14
            r21 = r30
            r22 = r1
            X.8nz r5 = r20.A04(r21, r22, r23, r24, r25)
            r4 = r30
            r5.A0q(r4)
            r4 = 3019(0xbcb, float:4.23E-42)
            r3.BJb(r5, r4)
        L_0x015b:
            r4 = r64
            if (r64 == 0) goto L_0x016a
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x016a
            X.1PE r3 = r0.A0t
            r3.A02(r4)
        L_0x016a:
            if (r16 != 0) goto L_0x0170
            r39 = 1
            if (r40 == 0) goto L_0x0172
        L_0x0170:
            r39 = 0
        L_0x0172:
            if (r64 != 0) goto L_0x0237
            r6 = 0
        L_0x0175:
            if (r18 == 0) goto L_0x017c
            r3 = r51
            r3.A0S(r2)
        L_0x017c:
            X.17u r3 = r0.A0T
            r5 = 0
            X.AnonymousClass00C.A0D(r1, r5)
            java.util.Map r3 = r3.A07
            boolean r3 = r3.containsKey(r1)
            if (r3 != 0) goto L_0x0190
            X.1O8 r4 = r0.A0u
            r3 = 2
            r4.A01(r1, r5, r3)
        L_0x0190:
            r3 = r6 & 2
            if (r3 == 0) goto L_0x0198
            r3 = 5
            r0.A0T(r3, r1)
        L_0x0198:
            if (r17 == 0) goto L_0x01b9
            if (r39 == 0) goto L_0x01b9
            r5 = 3017(0xbc9, float:4.228E-42)
            X.19x r6 = r0.A0x
            r22 = 0
            int r4 = r2.A02
            X.0wo r3 = r0.A0I
            long r25 = X.C19970wo.A00(r3)
            r20 = r6
            r21 = r1
            r23 = r22
            r24 = r4
            X.8nV r3 = r20.A09(r21, r22, r23, r24, r25)
            r0.A0T(r5, r3)
        L_0x01b9:
            if (r19 == 0) goto L_0x01e2
            if (r39 == 0) goto L_0x01e2
            r7 = 0
            X.0wo r3 = r0.A0I
            long r8 = X.C19970wo.A00(r3)
            boolean r4 = r2.A0p
            X.1Or r2 = r0.A0y
            X.0yC r5 = r2.A00
            r3 = 3695(0xe6f, float:5.178E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r5, r3)
            if (r2 == 0) goto L_0x01e2
            r3 = 3027(0xbd3, float:4.242E-42)
            X.19x r2 = r0.A0x
            r5 = r2
            r6 = r1
            r10 = r4
            X.8nz r2 = r5.A07(r6, r7, r8, r10)
            r0.A0T(r3, r2)
        L_0x01e2:
            r3 = 3
            r2 = r32
            if (r2 != r3) goto L_0x0212
            if (r61 == 0) goto L_0x01f0
            int r2 = r61.intValue()
            A0G(r0, r1, r2)
        L_0x01f0:
            r28 = r0
            r30 = r1
            r31 = r53
            r33 = r11
            A0H(r28, r29, r30, r31, r32, r33)
            X.182 r4 = r0.A1A
            r2 = r73
            r4.A00(r1, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r11 = r71 / r2
            r4.A01(r1, r11)
            X.1C6 r2 = r0.A0z
            r0 = 0
            r3 = r82
            r2.A05(r1, r0, r3)
            return
        L_0x0212:
            r5 = 1
            if (r2 != r5) goto L_0x01f0
            r2 = 0
            X.3Qp r4 = r15.A09(r1, r2)
            r6 = r67
            if (r4 == 0) goto L_0x022c
            X.1LV r3 = r0.A08
            r2 = 1
            if (r6 == r5) goto L_0x0224
            r2 = 0
        L_0x0224:
            r4.A0n = r2
            X.1Eu r2 = r3.A03
            r2.A00(r4)
            goto L_0x01f0
        L_0x022c:
            if (r16 == 0) goto L_0x01f0
            if (r6 == r5) goto L_0x0231
            r5 = 0
        L_0x0231:
            X.1FG r2 = r0.A09
            r2.A01(r1, r5)
            goto L_0x01f0
        L_0x0237:
            X.17X r3 = r0.A0U
            X.17r r3 = r3.A07
            X.6X6 r3 = r3.A0C(r1)
            java.lang.String r7 = "lid"
            r5 = r52
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0273
            r5 = 3
        L_0x024a:
            r3.A00 = r5
            java.lang.String r5 = r2.A0S
            r41 = 1
            if (r7 != 0) goto L_0x0256
            r43 = 0
            if (r80 == 0) goto L_0x0258
        L_0x0256:
            r43 = 1
        L_0x0258:
            r42 = 0
            r36 = r55
            r34 = r3
            r35 = r0
            r37 = r5
            r38 = r4
            int r6 = A00(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r3 = r6 & 1
            if (r3 == 0) goto L_0x0175
            X.171 r3 = r0.A0D
            r3.A0d(r1)
            goto L_0x0175
        L_0x0273:
            if (r6 == 0) goto L_0x027a
            r5 = 2
        L_0x0276:
            if (r80 != 0) goto L_0x024a
            r5 = 0
            goto L_0x024a
        L_0x027a:
            r5 = 1
            goto L_0x0276
        L_0x027c:
            r4 = 0
            X.3Qp r7 = r15.A09(r1, r4)
            if (r7 != 0) goto L_0x030b
            r9 = r5
        L_0x0284:
            X.1Nt r8 = r0.A0o
            X.0wo r4 = r0.A0I
            long r24 = X.C19970wo.A00(r4)
            r43 = r60
            r20 = r8
            r21 = r1
            r22 = r9
            r23 = r43
            X.8nz r9 = r20.A00(r21, r22, r23, r24)
            if (r9 == 0) goto L_0x02a3
            X.1Oo r8 = r0.A0c
            r4 = 8
            r8.BJb(r9, r4)
        L_0x02a3:
            if (r14 == 0) goto L_0x02c3
            X.1Oo r9 = r0.A0c
            X.19x r4 = r0.A0x
            r8 = 3019(0xbcb, float:4.23E-42)
            r26 = 151(0x97, float:2.12E-43)
            if (r85 == 0) goto L_0x02b1
            r26 = 150(0x96, float:2.1E-43)
        L_0x02b1:
            r25 = r5
            r23 = r5
            r24 = r1
            r22 = r4
            X.8nz r4 = r22.A04(r23, r24, r25, r26, r27)
            r4.A0q(r5)
            r9.BJb(r4, r8)
        L_0x02c3:
            if (r10 == 0) goto L_0x02e8
            if (r86 == 0) goto L_0x02e8
            X.1PS r9 = r0.A0m
            r3 = 0
            X.AnonymousClass00C.A0D(r1, r3)
            java.util.Set r8 = java.util.Collections.singleton(r1)
            X.AnonymousClass00C.A08(r8)
            X.040 r3 = r9.A08
            X.02h r4 = r3.BAE()
            X.02l r3 = r9.A07
            X.02h r4 = r4.plus(r3)
            com.whatsapp.group.generalchat.GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1 r3 = new com.whatsapp.group.generalchat.GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1
            r3.<init>(r9, r8, r5)
            X.C110515an.A00(r4, r3)
        L_0x02e8:
            X.1LW r4 = r0.A0P
            boolean r3 = android.text.TextUtils.isEmpty(r53)
            if (r3 == 0) goto L_0x02fe
            java.lang.String r3 = r7.A08()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02fe
            java.lang.String r44 = r7.A08()
        L_0x02fe:
            r41 = r4
            r42 = r1
            r45 = r32
            r46 = r27
            r41.A03(r42, r43, r44, r45, r46)
            goto L_0x015b
        L_0x030b:
            X.3G4 r9 = r7.A0e
            goto L_0x0284
        L_0x030f:
            r17 = 0
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20350xQ.A0W(X.3S5, X.147, X.147, com.whatsapp.jid.UserJid, X.3QL, X.3G4, java.lang.Integer, java.lang.String, java.lang.String, java.util.Map, int, int, int, int, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
