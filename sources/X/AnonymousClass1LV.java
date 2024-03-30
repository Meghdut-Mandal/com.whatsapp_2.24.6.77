package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1LV  reason: invalid class name */
public final class AnonymousClass1LV {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final C220412q A02;
    public final C25051Eu A03;
    public final AnonymousClass1LW A04;
    public final AnonymousClass17X A05;
    public final C20810yC A06;
    public final C26801Lo A07;
    public final C230917d A08;
    public final C26831Lr A09;
    public final AnonymousClass1EL A0A;
    public final AnonymousClass1EM A0B;
    public final C19770wU A0C;
    public final AnonymousClass00T A0D = new AnonymousClass00U(new C26871Lv(this));
    public final C19730wQ A0E;
    public final C26851Lt A0F;
    public final C19970wo A0G;
    public final C26811Lp A0H;
    public final AnonymousClass180 A0I;
    public final C26821Lq A0J;
    public final C26841Ls A0K;
    public final C26791Ln A0L;
    public final AnonymousClass1LX A0M;
    public final AnonymousClass1CR A0N;
    public final AtomicBoolean A0O = new AtomicBoolean(false);

    public final GroupJid A01(AnonymousClass147 r5) {
        AnonymousClass00C.A0D(r5, 0);
        C26831Lr r3 = this.A09;
        Iterator it = r3.A01.A02(r5).iterator();
        while (it.hasNext()) {
            AnonymousClass17X r0 = r3.A00;
            GroupJid groupJid = ((AnonymousClass3QK) it.next()).A02;
            if (r0.A0C(groupJid)) {
                return groupJid;
            }
        }
        return null;
    }

    public final AnonymousClass147 A02(AnonymousClass147 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C230917d r0 = this.A08;
        r0.A03();
        return (AnonymousClass147) r0.A02.get(r2);
    }

    public final HashSet A04(AnonymousClass147 r5) {
        AnonymousClass00C.A0D(r5, 0);
        C26831Lr r3 = this.A09;
        return r3.A01.A01(new C65893Tw(r3, 4), r5);
    }

    public final List A05(AnonymousClass147 r3) {
        AnonymousClass00C.A0D(r3, 0);
        return C007103b.A0Y(C007103b.A0c(A00(this.A08.A02(r3)), (Comparator) this.A0D.getValue()));
    }

    public final List A06(AnonymousClass147 r6) {
        AnonymousClass00C.A0D(r6, 0);
        HashSet A022 = this.A08.A02(r6);
        ArrayList arrayList = new ArrayList();
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.A02.A02(((AnonymousClass3QK) next).A02) > 0) {
                arrayList.add(next);
            }
        }
        List A002 = A00(C007103b.A0Y(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : A002) {
            if (this.A05.A0C(((AnonymousClass3QK) next2).A02)) {
                arrayList2.add(next2);
            }
        }
        return C007103b.A0Y(arrayList2);
    }

    public final void A08(int i) {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor editor;
        String str;
        SharedPreferences sharedPreferences;
        if (i != 0) {
            if (i != 1) {
                AtomicBoolean atomicBoolean = this.A0O;
                if (i == 2) {
                    atomicBoolean.set(false);
                    C26821Lq r1 = this.A0J;
                    editor = C26821Lq.A00(r1).edit();
                    sharedPreferences = C26821Lq.A00(r1);
                    str = "community_tab_group_navigation";
                } else if (atomicBoolean.getAndSet(false)) {
                    C26821Lq r7 = this.A0J;
                    putInt = C26821Lq.A00(r7).edit().putInt("community_tab_no_action_view", Math.min(C26821Lq.A00(r7).getInt("community_tab_no_action_view", 0), C26821Lq.A00(r7).getInt("community_tab_daily_views", 0) + C26821Lq.A00(r7).getInt("community_tab_views_via_context_menu", 0)) + 1);
                } else {
                    return;
                }
            } else {
                this.A0O.set(false);
                C26821Lq r12 = this.A0J;
                editor = C26821Lq.A00(r12).edit();
                sharedPreferences = C26821Lq.A00(r12);
                str = "community_tab_to_home_views";
            }
            putInt = editor.putInt(str, sharedPreferences.getInt(str, 0) + 1);
        } else {
            this.A0O.set(true);
            C26821Lq r13 = this.A0J;
            putInt = C26821Lq.A00(r13).edit().putInt("community_tab_daily_views", C26821Lq.A00(r13).getInt("community_tab_daily_views", 0) + 1);
        }
        putInt.apply();
    }

    public final void A09(C65073Qp r5) {
        AnonymousClass00C.A0D(r5, 0);
        long A002 = C19970wo.A00(this.A0G) / 1000;
        synchronized (r5) {
            r5.A0J = A002;
        }
        this.A03.A00(r5);
        this.A00.A0H(new C35651j2(this, r5, 18));
    }

    public final void A0A(GroupJid groupJid, int i) {
        String str;
        C1495671s B1k;
        AnonymousClass00C.A0D(groupJid, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("\n        CommunityChatManagerincrementCommunityHomeActionLoggingCount\n        /parentGroupJid = ");
        sb.append(groupJid.getRawString());
        sb.append(" \n        action type = ");
        int i2 = i;
        sb.append(i2);
        sb.append("\n        ");
        AnonymousClass091.A01(sb.toString());
        C26841Ls r1 = this.A0K;
        long A072 = r1.A00.A07(groupJid);
        if (i == 0) {
            str = "home_view_count";
        } else if (i2 == 1) {
            str = "home_group_navigation_count";
        } else if (i2 != 2) {
            str = "home_group_join_count";
        } else {
            str = "home_group_discovery_count";
        }
        AnonymousClass1M0 A042 = r1.A01.A04();
        try {
            B1k = A042.B1k();
            C224114e r6 = A042.A02;
            if (!(!TextUtils.isEmpty(C224614k.A00(r6, "table", "community_home_action_logging")))) {
                Log.e("CommunityHomeActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UPDATE community_home_action_logging SET ");
                sb2.append(str);
                sb2.append(" = ");
                sb2.append(str);
                sb2.append(" + ?");
                sb2.append(" WHERE ");
                sb2.append("jid_row_id");
                sb2.append(" = ?");
                AnonymousClass6QI A0C2 = r6.A0C(sb2.toString(), "update_community_action");
                A0C2.A05(1, 1);
                A0C2.A05(2, A072);
                if (A0C2.A01() == 0) {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("jid_row_id", Long.valueOf(A072));
                    contentValues.put(str, 1);
                    r6.A04("community_home_action_logging", "update_community_action", contentValues);
                }
                B1k.A00();
            }
            B1k.close();
            A042.close();
            return;
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

    public final void A0B(GroupJid groupJid, Integer num) {
        C1495671s B1k;
        StringBuilder sb;
        String str;
        AnonymousClass3QK r0;
        GroupJid groupJid2 = groupJid;
        AnonymousClass00C.A0D(groupJid2, 0);
        if (C20800yB.A01(C21000yV.A02, this.A06, 7180)) {
            C230917d r6 = this.A08;
            r6.A03();
            try {
                AnonymousClass1M0 A042 = r6.A00.A00.A04();
                try {
                    B1k = A042.B1k();
                    String rawString = groupJid2.getRawString();
                    ContentValues contentValues = new ContentValues(1);
                    Integer num2 = num;
                    contentValues.put("group_membership_approval_state", num2);
                    if (A042.A02.A01(contentValues, "subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.updateSubgroupMembershipApprovalState", new String[]{rawString}) == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SubgroupStore/setGroupMembershipApprovalState/Subgroup entry doesn't exist for");
                        sb2.append(groupJid2);
                        Log.e(sb2.toString());
                        B1k.close();
                        A042.close();
                        return;
                    }
                    B1k.A00();
                    B1k.close();
                    A042.close();
                    AnonymousClass147 r4 = (AnonymousClass147) r6.A02.get(groupJid2);
                    if (r4 == null) {
                        sb = new StringBuilder();
                        str = "SubgroupCache/updateSubgroupMembershipApprovalState/subgroup has no parent ";
                    } else {
                        C64213Nc r2 = (C64213Nc) r6.A01.get(r4);
                        if (r2 == null) {
                            sb = new StringBuilder();
                            str = "SubgroupCache/updateSubgroupMembershipApprovalState/Subgroup not in cache: ";
                        } else {
                            ArrayList arrayList = new ArrayList(r6.A01(new C65893Tw(groupJid2, 3), r4));
                            if (arrayList.isEmpty() || (r0 = (AnonymousClass3QK) arrayList.get(0)) == null) {
                                sb = new StringBuilder();
                                str = "SubgroupCache/updateSubgroupMembershipApprovalState/Subgroup no longer in cache: ";
                            } else {
                                Set set = r2.A02;
                                set.remove(r0);
                                set.add(new AnonymousClass3QK(groupJid2, num2, r0.A04, r0.A00, r0.A01));
                                for (AnonymousClass3N0 r02 : this.A0L.getObservers()) {
                                    C40051uf r3 = r02.A00;
                                    if (C007103b.A0k(r3.A0z, new C42241yV(groupJid2, 0))) {
                                        C40051uf.A04(r3);
                                    }
                                }
                                return;
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(groupJid2);
                    Log.e(sb.toString());
                    return;
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
                return;
            } catch (Error | RuntimeException e2) {
                Log.e(e2);
                throw e2;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A0C(AnonymousClass147 r10) {
        AnonymousClass00C.A0D(r10, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("CommunityChatManager/deleteParentGroup: ");
        sb.append(r10);
        Log.i(sb.toString());
        AnonymousClass141 A082 = this.A01.A08(r10);
        C26851Lt r7 = this.A0F;
        Set A062 = r7.A01.A06(r10, true);
        r7.A03.A0e(r10, true);
        r7.A00.A0Q(A062);
        if (A082 != null) {
            AnonymousClass180 r6 = this.A0I;
            synchronized (r6) {
                AnonymousClass1M0 A052 = r6.A01.A05();
                try {
                    A052.A02.A03("parent_group_participants", "parent_group_jid_row_id = ?", "parent_group_participants_store/DELETE_ALL_PARTICIPANTS", new String[]{String.valueOf(Long.valueOf(r6.A00.A07(r10)))});
                    A052.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            this.A0N.A0d(r10, A082.A0G());
            r7.A00(A082);
            A0D(r10);
            return;
        }
        return;
        throw th;
    }

    public final void A0D(AnonymousClass147 r5) {
        AnonymousClass00C.A0D(r5, 0);
        C230917d r3 = this.A08;
        r3.A03();
        r3.A00.A03(r5, Collections.emptyList());
        C64213Nc r0 = (C64213Nc) r3.A01.remove(r5);
        if (r0 != null) {
            for (AnonymousClass3QK r02 : r0.A02) {
                r3.A02.remove(r02.A02);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r4 = r6.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(X.AnonymousClass147 r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0037
            X.0yC r2 = r6.A06
            r1 = 1864(0x748, float:2.612E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0037
            X.12q r4 = r6.A02
            X.3Qp r3 = r4.A09(r7, r5)
            r2 = 1
            if (r3 == 0) goto L_0x0037
            X.17X r1 = r6.A05
            boolean r0 = r1.A0D(r7)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r1.A0I(r7)
            if (r0 != 0) goto L_0x0037
            int r0 = r4.A05(r7)
            if (r0 != r2) goto L_0x0037
            monitor-enter(r3)
            boolean r0 = r3.A0k     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)
            if (r0 != 0) goto L_0x0037
            r5 = 1
            return r5
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0037:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LV.A0I(X.147):boolean");
    }

    public final boolean A0J(AnonymousClass147 r4) {
        AnonymousClass141 A082 = this.A01.A08(r4);
        if (A082 == null) {
            C18740tg.A0D(false, "unexpected parent group null in subgroup creation, was it deactivated?");
            return false;
        } else if (A082.A0c || this.A05.A0D(r4)) {
            return true;
        } else {
            return false;
        }
    }

    public final ArrayList A03() {
        Cursor A092;
        C25051Eu r1 = this.A03;
        C224214g r7 = new C224214g("CommunityChatStore/getCommunityChats");
        AnonymousClass163 r6 = r1.A00;
        AnonymousClass1M0 A042 = r6.A04.get();
        try {
            A092 = A042.A02.A09("SELECT _id FROM chat WHERE group_type = ?", "GET_ROW_ID_BY_GROUP_TYPE_SQL", new String[]{Integer.toString(1)});
            ArrayList arrayList = new ArrayList(A092.getCount());
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("_id");
            while (A092.moveToNext()) {
                arrayList.add(Long.valueOf(A092.getLong(columnIndexOrThrow)));
            }
            A092.close();
            A042.close();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                AnonymousClass11F A0A2 = r6.A0A(longValue);
                if (A0A2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CommunityChatStore/failed to find chatJid by row id: ");
                    sb.append(longValue);
                    Log.w(sb.toString());
                } else {
                    arrayList2.add(A0A2);
                }
            }
            r7.A01();
            return arrayList2;
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

    public final void A07() {
        C230917d r0 = this.A08;
        r0.A03();
        ArrayList arrayList = new ArrayList();
        for (C64213Nc r02 : r0.A01.values()) {
            AnonymousClass3QK r03 = r02.A00;
            if (r03 != null) {
                arrayList.add(r03.A02);
            }
        }
    }

    public final void A0E(AnonymousClass147 r6, boolean z) {
        boolean z2;
        C65073Qp A092 = this.A02.A09(r6, false);
        if (A092 != null) {
            C26811Lp r3 = this.A0H;
            synchronized (A092) {
                z2 = A092.A0k;
            }
            if (z2 != z) {
                synchronized (A092) {
                    A092.A0k = z;
                }
                r3.A00.A01(new C35701j7(r3, A092, 20), 60);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r3.A05.A0D(r1) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F(X.AnonymousClass11F r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.AnonymousClass147
            r2 = 0
            if (r0 == 0) goto L_0x0034
            X.1LX r0 = r3.A0M
            java.lang.String r1 = "community_home"
            X.1LY r0 = r0.A00
            boolean r0 = r0.A01(r4, r1)
            if (r0 != 0) goto L_0x0034
            boolean r0 = r3.A0G(r4)
            if (r0 == 0) goto L_0x0025
            r1 = r4
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.AnonymousClass00C.A0D(r1, r2)
            X.17X r0 = r3.A05
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0033
        L_0x0025:
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            X.12q r0 = r3.A02
            int r0 = r0.A05(r4)
            boolean r0 = X.C63833Lp.A00(r0)
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LV.A0F(X.11F):boolean");
    }

    public final boolean A0G(AnonymousClass11F r4) {
        if (!(r4 instanceof AnonymousClass147) || this.A02.A05((GroupJid) r4) != 1) {
            return false;
        }
        return true;
    }

    public final boolean A0H(GroupJid groupJid) {
        if (this.A02.A05(groupJid) == 3) {
            return true;
        }
        return false;
    }

    private final List A00(Collection collection) {
        List A0V = C007103b.A0V(collection);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0V) {
            if (this.A02.A09(((AnonymousClass3QK) next).A02, false) != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (!this.A02.A0N(((AnonymousClass3QK) next2).A02)) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : arrayList2) {
            AnonymousClass3LI A0S = this.A0N.A0S(((AnonymousClass3QK) next3).A02);
            if (A0S == null || !A0S.A0I) {
                arrayList3.add(next3);
            }
        }
        return arrayList3;
    }

    public final boolean A0K(AnonymousClass147 r3, int i) {
        boolean A002 = C63833Lp.A00(i);
        if (this.A0B.A01()) {
            C19730wQ r0 = this.A0E;
            r0.A0G();
            if (r0.A03 == null || r3 == null || !A002 || !this.A05.A0C(r3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass1LV(AnonymousClass17Y r24, C19730wQ r25, C26851Lt r26, AnonymousClass16D r27, C19970wo r28, C220412q r29, C25051Eu r30, AnonymousClass1LW r31, AnonymousClass17X r32, C26811Lp r33, AnonymousClass180 r34, C26821Lq r35, C26841Ls r36, C20810yC r37, C26801Lo r38, C230917d r39, C26791Ln r40, C26831Lr r41, AnonymousClass1EL r42, AnonymousClass1LX r43, AnonymousClass1CR r44, AnonymousClass1EM r45, C19770wU r46) {
        C19970wo r18 = r28;
        AnonymousClass00C.A0D(r18, 1);
        C20810yC r15 = r37;
        AnonymousClass00C.A0D(r15, 2);
        AnonymousClass17Y r22 = r24;
        AnonymousClass00C.A0D(r22, 3);
        C19730wQ r21 = r25;
        AnonymousClass00C.A0D(r21, 4);
        C19770wU r2 = r46;
        AnonymousClass00C.A0D(r2, 5);
        C220412q r17 = r29;
        AnonymousClass00C.A0D(r17, 6);
        C230917d r7 = r39;
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass1LW r14 = r31;
        AnonymousClass00C.A0D(r14, 8);
        AnonymousClass16D r19 = r27;
        AnonymousClass00C.A0D(r19, 9);
        AnonymousClass1EM r3 = r45;
        AnonymousClass00C.A0D(r3, 10);
        C26791Ln r6 = r40;
        AnonymousClass00C.A0D(r6, 12);
        AnonymousClass1CR r4 = r44;
        AnonymousClass00C.A0D(r4, 13);
        AnonymousClass1EL r5 = r42;
        AnonymousClass00C.A0D(r5, 14);
        C25051Eu r16 = r30;
        AnonymousClass00C.A0D(r16, 15);
        C26801Lo r8 = r38;
        AnonymousClass00C.A0D(r8, 16);
        C26811Lp r12 = r33;
        AnonymousClass00C.A0D(r12, 17);
        C26821Lq r10 = r35;
        AnonymousClass00C.A0D(r10, 18);
        AnonymousClass17X r13 = r32;
        AnonymousClass00C.A0D(r13, 19);
        AnonymousClass180 r11 = r34;
        AnonymousClass00C.A0D(r11, 21);
        C26841Ls r9 = r36;
        AnonymousClass00C.A0D(r9, 22);
        C26851Lt r20 = r26;
        AnonymousClass00C.A0D(r20, 23);
        this.A0G = r18;
        this.A06 = r15;
        this.A00 = r22;
        this.A0E = r21;
        this.A0C = r2;
        this.A02 = r17;
        this.A08 = r7;
        this.A04 = r14;
        this.A01 = r19;
        this.A0B = r3;
        this.A0M = r43;
        this.A0L = r6;
        this.A0N = r4;
        this.A0A = r5;
        this.A03 = r16;
        this.A07 = r8;
        this.A0H = r12;
        this.A0J = r10;
        this.A05 = r13;
        this.A09 = r41;
        this.A0I = r11;
        this.A0K = r9;
        this.A0F = r20;
    }
}
