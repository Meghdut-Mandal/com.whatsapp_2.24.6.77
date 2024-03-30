package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.17d  reason: invalid class name and case insensitive filesystem */
public class C230917d {
    public final C230817c A00;
    public final Map A01 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();
    public final Object A03 = new Object();
    public volatile boolean A04;

    public void A03() {
        Cursor A09;
        StringBuilder sb;
        int i;
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C230817c r0 = this.A00;
                    HashMap hashMap = new HashMap();
                    AnonymousClass1M0 A032 = r0.A00.get();
                    try {
                        A09 = A032.A02.A09("SELECT subgroup_raw_jid, subject, subject_ts, group_type, group_membership_approval_state, relationship.parent_raw_jid FROM subgroup_info INNER JOIN group_relationship relationship ON subgroup_raw_jid = relationship.subgroup_raw_id", "GET_ALL_SUBGROUPS", (String[]) null);
                        while (A09.moveToNext()) {
                            String string = A09.getString(A09.getColumnIndexOrThrow("parent_raw_jid"));
                            Set set = (Set) hashMap.get(string);
                            if (set == null) {
                                set = new HashSet();
                                hashMap.put(string, set);
                            }
                            AnonymousClass3QK A002 = C230817c.A00(A09);
                            if (A002 != null) {
                                set.add(A002);
                            }
                        }
                        A09.close();
                        A032.close();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            AnonymousClass147 A06 = AnonymousClass147.A01.A06((String) entry.getKey());
                            if (A06 == null) {
                                if (entry.getValue() == null) {
                                    i = 0;
                                } else {
                                    i = ((Set) entry.getValue()).size();
                                }
                                sb = new StringBuilder();
                                sb.append("Cache initialized with an empty parent, ");
                                sb.append(i);
                                sb.append(" subgroups not loaded");
                            } else {
                                Map map = this.A01;
                                C64213Nc r6 = (C64213Nc) map.get(A06);
                                if (r6 == null) {
                                    r6 = new C64213Nc();
                                    map.put(A06, r6);
                                }
                                Set<AnonymousClass3QK> set2 = (Set) entry.getValue();
                                if (set2 == null) {
                                    sb = new StringBuilder();
                                    sb.append("Parent without any subgroups, jid=");
                                    sb.append(A06);
                                } else {
                                    for (AnonymousClass3QK r2 : set2) {
                                        int i2 = r2.A00;
                                        if (i2 == 3) {
                                            r6.A00 = r2;
                                        } else if (i2 == 6) {
                                            r6.A01 = r2;
                                        }
                                        this.A02.put(r2.A02, A06);
                                    }
                                    r6.A02.addAll(set2);
                                }
                            }
                            Log.e(sb.toString());
                        }
                        this.A04 = true;
                    } catch (Throwable th) {
                        try {
                            A032.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    public C230917d(C230817c r2) {
        this.A00 = r2;
    }

    public AnonymousClass3QK A00(AnonymousClass147 r2) {
        A03();
        C64213Nc r0 = (C64213Nc) this.A01.get(r2);
        if (r0 == null) {
            return null;
        }
        return r0.A00;
    }

    public HashSet A01(C16670pt r4, AnonymousClass147 r5) {
        HashSet A022 = A02(r5);
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            if (!r4.BvZ(it.next())) {
                it.remove();
            }
        }
        return A022;
    }

    public HashSet A02(AnonymousClass147 r3) {
        A03();
        HashSet hashSet = new HashSet();
        C64213Nc r0 = (C64213Nc) this.A01.get(r3);
        if (r0 != null) {
            hashSet.addAll(r0.A02);
        }
        return hashSet;
    }

    public void A04(AnonymousClass3QK r4, AnonymousClass147 r5) {
        A03();
        if (this.A00.A04(r5, Collections.singletonList(r4))) {
            Map map = this.A01;
            C64213Nc r2 = (C64213Nc) map.get(r5);
            if (r2 == null) {
                r2 = new C64213Nc();
                map.put(r5, r2);
            }
            r2.A02.add(r4);
            int i = r4.A00;
            if (i == 3) {
                r2.A00 = r4;
            } else if (i == 6) {
                r2.A01 = r4;
            }
            this.A02.put(r4.A02, r5);
        }
    }

    public void A05(GroupJid groupJid) {
        AnonymousClass147 r3;
        C64213Nc r2;
        Object obj;
        A03();
        if (this.A00.A01(groupJid) == 1 && (r3 = (AnonymousClass147) this.A02.remove(groupJid)) != null && (r2 = (C64213Nc) this.A01.get(r3)) != null) {
            ArrayList arrayList = new ArrayList(A01(new C65893Tw(groupJid, 3), r3));
            if (!arrayList.isEmpty() && (obj = arrayList.get(0)) != null) {
                r2.A02.remove(obj);
            }
        }
    }
}
