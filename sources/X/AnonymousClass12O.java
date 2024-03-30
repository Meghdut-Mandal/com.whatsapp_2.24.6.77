package X;

import android.database.Cursor;
import android.database.SQLException;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: X.12O  reason: invalid class name */
public final class AnonymousClass12O extends AnonymousClass12N {
    public final int A00;
    public final C219912l A01;
    public final C219812k A02;
    public final C219712j A03;
    public final C20810yC A04;
    public final C220112n A05;
    public final C19770wU A06;
    public final Object A07 = new Object();
    public final Map A08;
    public final Map A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass12O(C219912l r3, C219812k r4, C219712j r5, C20810yC r6, C220112n r7, C19770wU r8) {
        super(r7);
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r8, 3);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r7, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r4;
        this.A01 = r3;
        this.A08 = linkedHashMap;
        this.A05 = r7;
        this.A09 = linkedHashMap2;
        int A002 = C20800yB.A00(C21000yV.A02, r6, 7863);
        this.A00 = A002;
        if (A002 >= 0) {
            A08();
        }
    }

    public C223313w A09(PhoneUserJid phoneUserJid) {
        Long l;
        Cursor A092;
        long j;
        AnonymousClass00C.A0D(phoneUserJid, 0);
        C219712j r7 = this.A03;
        long A082 = r7.A08(phoneUserJid);
        if (A082 >= 0) {
            synchronized (this.A07) {
                SortedSet sortedSet = (SortedSet) this.A09.get(Long.valueOf(A082));
                if (sortedSet != null) {
                    Object obj = null;
                    if (!(sortedSet instanceof List)) {
                        Iterator it = sortedSet.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                obj = it.next();
                                if (!it.hasNext()) {
                                    break;
                                }
                            }
                        }
                    } else {
                        List list = (List) sortedSet;
                        if (!list.isEmpty()) {
                            obj = list.get(list.size() - 1);
                        }
                    }
                    l = (Long) obj;
                } else {
                    l = null;
                }
            }
            if (l == null) {
                AnonymousClass1M0 A042 = this.A02.A00.get();
                try {
                    A092 = A042.A02.A09("SELECT lid_row_id\nFROM jid_map\nWHERE jid_row_id = ?\nORDER BY lid_row_id DESC\nLIMIT 1", "JidMapStore/GET_LID_BY_JID", new String[]{String.valueOf(A082)});
                    int columnIndex = A092.getColumnIndex("lid_row_id");
                    if (columnIndex < 0 || !A092.moveToFirst()) {
                        A092.close();
                        A042.close();
                        j = -1;
                    } else {
                        j = (long) A092.getInt(columnIndex);
                        A092.close();
                        A042.close();
                    }
                    l = Long.valueOf(j);
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            long longValue = l.longValue();
            Jid A093 = r7.A09(longValue);
            if (A093 instanceof C223313w) {
                C223313w r6 = (C223313w) A093;
                A00(longValue, A082);
                return r6;
            }
        }
        return null;
        throw th;
    }

    public PhoneUserJid A0A(C223313w r11) {
        Long l;
        Cursor A092;
        long j;
        AnonymousClass00C.A0D(r11, 0);
        C219712j r7 = this.A03;
        long A072 = r7.A07(r11);
        if (A072 >= 0) {
            synchronized (this.A07) {
                l = (Long) this.A08.get(Long.valueOf(A072));
            }
            if (l == null) {
                AnonymousClass1M0 A042 = this.A02.A00.get();
                try {
                    A092 = A042.A02.A09("SELECT jid_row_id\nFROM jid_map\nWHERE lid_row_id = ?", "JidMapStore/GET_JID_BY_LID", new String[]{String.valueOf(A072)});
                    int columnIndex = A092.getColumnIndex("jid_row_id");
                    if (columnIndex < 0 || !A092.moveToFirst()) {
                        A092.close();
                        A042.close();
                        j = -1;
                    } else {
                        j = (long) A092.getInt(columnIndex);
                        A092.close();
                        A042.close();
                    }
                    l = Long.valueOf(j);
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            long longValue = l.longValue();
            Jid A093 = r7.A09(longValue);
            if (A093 instanceof PhoneUserJid) {
                PhoneUserJid phoneUserJid = (PhoneUserJid) A093;
                A00(A072, longValue);
                return phoneUserJid;
            }
        }
        return null;
        throw th;
    }

    public UserJid A0B(UserJid userJid) {
        UserJid A092;
        if (userJid == null || AnonymousClass143.A0H(userJid)) {
            return null;
        }
        if (AnonymousClass143.A0I(userJid)) {
            A092 = A0A((C223313w) userJid);
        } else if (!AnonymousClass143.A0J(userJid)) {
            return null;
        } else {
            A092 = A09((PhoneUserJid) userJid);
        }
        return A092;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r4 == r0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0C(java.util.List r13) {
        /*
            r12 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r11 = r13.iterator()
        L_0x0012:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r11.next()
            X.00I r2 = (X.AnonymousClass00I) r2
            X.12j r1 = r12.A03
            java.lang.Object r8 = r2.A00
            r0 = r8
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r4 = r1.A07(r0)
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r0 = r1.A07(r0)
            r9 = 0
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0040
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0040
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1
            if (r7 != 0) goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r2 == 0) goto L_0x0012
            boolean r2 = r12.A01(r4, r0)
            if (r2 != 0) goto L_0x0012
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.00I r0 = new X.00I
            r0.<init>(r2, r1)
            r6.add(r0)
            X.AnonymousClass00C.A07(r8)
            r3.add(r8)
            goto L_0x0012
        L_0x0060:
            X.12k r1 = r12.A02
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00b4
            X.12P r0 = r1.A00     // Catch:{ SQLException -> 0x00ee }
            X.1M0 r7 = r0.A05()     // Catch:{ SQLException -> 0x00ee }
            X.71s r8 = r7.B1k()     // Catch:{ all -> 0x00aa }
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x0076:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00a0 }
            X.00I r1 = (X.AnonymousClass00I) r1     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x00a0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a0 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00a0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a0 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x00a0 }
            X.C219812k.A00(r7, r4, r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x0076
        L_0x0096:
            r8.A00()     // Catch:{ all -> 0x00a0 }
            r8.close()     // Catch:{ all -> 0x00aa }
            r7.close()     // Catch:{ SQLException -> 0x00ee }
            goto L_0x00b4
        L_0x00a0:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00aa }
        L_0x00a9:
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x00ee }
        L_0x00b3:
            throw r1     // Catch:{ SQLException -> 0x00ee }
        L_0x00b4:
            r7 = 1
            java.util.Iterator r2 = r6.iterator()
        L_0x00b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r1 = r2.next()
            X.00I r1 = (X.AnonymousClass00I) r1
            java.lang.Object r0 = r1.A00
            X.AnonymousClass00C.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            java.lang.Object r0 = r1.A01
            X.AnonymousClass00C.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r12.A00(r4, r0)
            goto L_0x00b9
        L_0x00df:
            X.0wU r2 = r12.A06
            r0 = 32
            X.1j7 r1 = new X.1j7
            r1.<init>(r6, r12, r0)
            java.lang.String r0 = "WaJidMapRepository/setJidMapping"
            r2.Bp6(r1, r0)
            goto L_0x00f5
        L_0x00ee:
            r1 = move-exception
            java.lang.String r0 = "JidMapStore/upsertLidToJidMapping"
            com.whatsapp.util.Log.e(r0, r1)
            r7 = 0
        L_0x00f5:
            if (r7 != 0) goto L_0x00fc
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00fc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12O.A0C(java.util.List):java.util.ArrayList");
    }

    public ArrayList A0D(Map map) {
        AnonymousClass00C.A0D(map, 0);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new AnonymousClass00I(entry.getKey(), entry.getValue()));
        }
        return A0C(arrayList);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    public java.util.List A0F(com.whatsapp.jid.PhoneUserJid r14) {
        /*
            r13 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            X.12j r8 = r13.A03
            long r11 = r8.A08(r14)
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            X.09w r9 = X.C023409w.A00
        L_0x0012:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            com.whatsapp.jid.Jid r1 = r8.A09(r0)
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            r3.add(r1)
            goto L_0x001b
        L_0x0039:
            java.lang.Object r7 = r13.A07
            monitor-enter(r7)
            java.util.Map r6 = r13.A09     // Catch:{ all -> 0x00b7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x00b7 }
            java.util.SortedSet r0 = (java.util.SortedSet) r0     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x004f
            java.util.List r9 = X.C007103b.A0Y(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x009d
        L_0x004f:
            monitor-exit(r7)
            X.12k r0 = r13.A02
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.12P r0 = r0.A00
            X.1M0 r4 = r0.get()
            X.14e r10 = r4.A02     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "SELECT lid_row_id\nFROM jid_map\nWHERE jid_row_id = ?\nORDER BY lid_row_id DESC"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ad }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00ad }
            r2[r1] = r0     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "JidMapStore/GET_LIDS_BY_JID"
            android.database.Cursor r3 = r10.A09(r3, r0, r2)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "lid_row_id"
            int r2 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00a1 }
            if (r2 < 0) goto L_0x008b
        L_0x0079:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x008b
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x00a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            r9.add(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x0079
        L_0x008b:
            r3.close()     // Catch:{ all -> 0x00ad }
            r4.close()
            monitor-enter(r7)
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ all -> 0x00b7 }
            r0.<init>()     // Catch:{ all -> 0x00b7 }
            X.C007103b.A0i(r9, r0)     // Catch:{ all -> 0x00b7 }
            r6.put(r5, r0)     // Catch:{ all -> 0x00b7 }
        L_0x009d:
            monitor-exit(r7)
            goto L_0x0012
        L_0x00a0:
            return r3
        L_0x00a1:
            r1 = move-exception
            if (r3 == 0) goto L_0x00ac
            r3.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00b2 }
            throw r1
        L_0x00b2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12O.A0F(com.whatsapp.jid.PhoneUserJid):java.util.List");
    }

    public Set A0G(UserJid userJid) {
        PhoneUserJid phoneUserJid;
        AnonymousClass00C.A0D(userJid, 0);
        if (userJid instanceof C223313w) {
            phoneUserJid = A0A((C223313w) userJid);
        } else {
            if (userJid instanceof PhoneUserJid) {
                phoneUserJid = (PhoneUserJid) userJid;
            }
            Set singleton = Collections.singleton(userJid);
            AnonymousClass00C.A08(singleton);
            return singleton;
        }
        if (phoneUserJid != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(phoneUserJid);
            linkedHashSet.addAll(A0F(phoneUserJid));
            return linkedHashSet;
        }
        Set singleton2 = Collections.singleton(userJid);
        AnonymousClass00C.A08(singleton2);
        return singleton2;
    }

    public boolean A0H(C223313w r10, PhoneUserJid phoneUserJid) {
        AnonymousClass1M0 A052;
        AnonymousClass00C.A0D(r10, 0);
        AnonymousClass00C.A0D(phoneUserJid, 1);
        C219712j r0 = this.A03;
        long A072 = r0.A07(r10);
        long A073 = r0.A07(phoneUserJid);
        if (A072 < 0 || A073 < 0 || A072 == A073) {
            return false;
        }
        if (A01(A072, A073)) {
            return true;
        }
        try {
            A052 = this.A02.A00.A05();
            C219812k.A00(A052, A072, A073);
            A052.close();
            A00(A072, A073);
            this.A06.Bp6(new AVd(this, A072, A073), "WaJidMapRepository/setJidMapping");
            return true;
        } catch (SQLException e) {
            Log.e("JidMapStore/upsertLidToJidMapping", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean A0I(UserJid userJid, UserJid userJid2) {
        if (userJid == null) {
            return userJid2 == null;
        }
        if (!userJid.equals(userJid2)) {
            if ((!AnonymousClass143.A0J(userJid) || !AnonymousClass143.A0I(userJid2)) && (!AnonymousClass143.A0I(userJid) || !AnonymousClass143.A0J(userJid2))) {
                return false;
            }
            return AnonymousClass00C.A0J(A0B(userJid), userJid2);
        }
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        AnonymousClass00C.A0D(r3, 1);
        if (r3.ordinal() >= this.A00) {
            synchronized (this.A07) {
                this.A08.clear();
                this.A09.clear();
            }
        }
    }

    private final void A00(long j, long j2) {
        synchronized (this.A07) {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            this.A08.put(valueOf, valueOf2);
            Map map = this.A09;
            Object obj = map.get(valueOf2);
            if (obj == null) {
                obj = new TreeSet();
                map.put(valueOf2, obj);
            }
            ((SortedSet) obj).add(valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r1 != 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(long r6, long r8) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A07
            monitor-enter(r4)
            java.util.Map r1 = r5.A08     // Catch:{ all -> 0x001d }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x001d }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x001d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            long r2 = r0.longValue()     // Catch:{ all -> 0x001d }
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r4)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12O.A01(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r2.isEmpty() != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedHashMap A0E(java.util.Collection r12) {
        /*
            r11 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r6.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.12j r0 = r11.A03
            long r1 = r0.A07(r1)
            java.lang.Object r4 = r11.A07
            monitor-enter(r4)
            java.util.Map r0 = r11.A09     // Catch:{ all -> 0x004b }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x004b }
            java.util.SortedSet r2 = (java.util.SortedSet) r2     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0038
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x004b }
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x003f
            r7.add(r3)     // Catch:{ all -> 0x004b }
            goto L_0x0049
        L_0x003f:
            java.lang.Object r0 = r2.last()     // Catch:{ all -> 0x004b }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x004b }
            r5.put(r3, r0)     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r4)
            goto L_0x000e
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x004e:
            X.12k r4 = r11.A02
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.Long.toString(r0)
            r3.add(r0)
            goto L_0x005e
        L_0x0076:
            java.lang.String[] r0 = X.C19430v1.A0N
            java.lang.Object[] r2 = r3.toArray(r0)
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r2, r0)
            X.12P r0 = r4.A00
            X.1M0 r7 = r0.get()
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x0174 }
        L_0x008d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x0174 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x0174 }
            X.14e r3 = r7.A02     // Catch:{ all -> 0x0174 }
            int r2 = r4.length     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r1.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "SELECT lid_row_id, jid_row_id\nFROM jid_map\nWHERE jid_row_id IN"
            r1.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r2)     // Catch:{ all -> 0x0174 }
            r1.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = " ORDER BY lid_row_id DESC"
            r1.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "GET_LIDS_BY_JIDS"
            android.database.Cursor r8 = r3.A09(r1, r0, r4)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "lid_row_id"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "jid_row_id"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ec }
        L_0x00c8:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e8
            long r2 = r8.getLong(r9)     // Catch:{ all -> 0x00ec }
            long r0 = r8.getLong(r4)     // Catch:{ all -> 0x00ec }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ec }
            boolean r0 = r6.containsKey(r1)     // Catch:{ all -> 0x00ec }
            if (r0 != 0) goto L_0x00c8
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00ec }
            r6.put(r1, r0)     // Catch:{ all -> 0x00ec }
            goto L_0x00c8
        L_0x00e8:
            r8.close()     // Catch:{ all -> 0x0174 }
            goto L_0x008d
        L_0x00ec:
            r1 = move-exception
            if (r8 == 0) goto L_0x00f7
            r8.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f7
        L_0x00f3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0174 }
        L_0x00f7:
            throw r1     // Catch:{ all -> 0x0174 }
        L_0x00f8:
            r7.close()
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0103:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            X.AnonymousClass00C.A0B(r0)
            long r2 = r0.longValue()
            X.AnonymousClass00C.A0B(r1)
            long r0 = r1.longValue()
            r11.A00(r2, r0)
            goto L_0x0103
        L_0x012d:
            r5.putAll(r6)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x013d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            X.12j r4 = r11.A03
            java.lang.Class<X.13w> r2 = X.C223313w.class
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            com.whatsapp.jid.Jid r3 = r4.A0C(r2, r0)
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r2 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.Object r0 = r5.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            com.whatsapp.jid.Jid r0 = r4.A0C(r2, r0)
            if (r0 == 0) goto L_0x013d
            if (r3 == 0) goto L_0x013d
            r7.put(r0, r3)
            goto L_0x013d
        L_0x0173:
            return r7
        L_0x0174:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0179 }
            throw r1
        L_0x0179:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12O.A0E(java.util.Collection):java.util.LinkedHashMap");
    }

    public String BHv() {
        String obj;
        synchronized (this.A07) {
            StringBuilder sb = new StringBuilder();
            sb.append("JidMapRepository/l2J=");
            sb.append(this.A08.size());
            sb.append(", p2L");
            sb.append(this.A09.size());
            obj = sb.toString();
        }
        return obj;
    }
}
