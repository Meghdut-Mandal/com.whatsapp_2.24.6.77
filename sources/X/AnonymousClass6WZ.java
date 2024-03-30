package X;

import android.os.Handler;
import android.util.Pair;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6WZ  reason: invalid class name */
public class AnonymousClass6WZ {
    public static final Handler A0M = C36341k9.A0H();
    public int A00;
    public AnonymousClass6SN A01;
    public AnonymousClass67F A02;
    public C131536Pl A03 = new C131536Pl();
    public C124105xb A04;
    public C140456lc A05;
    public WeakReference A06 = AnonymousClass001.A0F((Object) null);
    public Map A07 = Collections.emptyMap();
    public boolean A08;
    public AnonymousClass6XK A09;
    public AnonymousClass7fD A0A;
    public Object A0B = C36441kJ.A11();
    public boolean A0C = false;
    public boolean A0D = false;
    public final C131196Oc A0E;
    public final Runnable A0F = new C1497572q(this, 40);
    public final List A0G = AnonymousClass001.A0I();
    public final List A0H = AnonymousClass001.A0I();
    public final List A0I = AnonymousClass001.A0I();
    public final AnonymousClass6IK A0J;
    public final List A0K = AnonymousClass001.A0I();
    public final Map A0L = AnonymousClass001.A0J();

    public static C100674vP A01(C1271967i r14, C131536Pl r15, List list) {
        AnonymousClass65A r0 = r14.A02;
        AnonymousClass7fJ A032 = C133266Xn.A03(r14);
        AnonymousClass6IK B8s = r0.A01.B8s();
        String A002 = C1271967i.A00(r14);
        return new C100674vP((C157187by) null, AnonymousClass6IB.A00, r14, (C1271967i) null, r15, B8s, (C160377ku) null, A032, C023109s.A0C, A002, (String) null, list, (Map) null, (Set) null);
    }

    /* JADX INFO: finally extract failed */
    private Pair A00(List list) {
        Pair pair;
        C130486Lg r1;
        List list2;
        ArrayList<AnonymousClass69T> arrayList;
        AnonymousClass69U r3;
        Map map;
        Map map2;
        List list3;
        AnonymousClass6RN.A00("Bloks ProcessResources");
        LinkedList linkedList = new LinkedList(list);
        ArrayList A0I2 = AnonymousClass001.A0I();
        C1271967i r12 = (C1271967i) this.A06.get();
        C1271967i r23 = r12;
        boolean z = false;
        if (r12 == null) {
            pair = C36441kJ.A0Q(false, AnonymousClass001.A0I());
        } else {
            C131536Pl r26 = this.A03;
            while (!linkedList.isEmpty()) {
                AnonymousClass6XK r2 = (AnonymousClass6XK) linkedList.poll();
                if (!(r2 == null || (r1 = r2.A00) == null)) {
                    C140456lc r22 = r2.A01;
                    C131536Pl r6 = this.A03;
                    Map map3 = r1.A06;
                    if (!map3.isEmpty()) {
                        HashMap hashMap = new HashMap(r6.A03);
                        hashMap.putAll(map3);
                        r6 = new C131536Pl(r6.A00, r6.A06, hashMap, r6.A07, r6.A02, r6.A01, r6.A04, r6.A05);
                    }
                    this.A03 = r6;
                    C1273768a r32 = r1.A00;
                    if (r32 != null) {
                        Map map4 = r32.A00;
                        if (!map4.isEmpty()) {
                            C1273768a r4 = r6.A00;
                            AnonymousClass00C.A0D(r4, 0);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(r4.A00);
                            linkedHashMap.putAll(map4);
                            r6 = new C131536Pl(new C1273768a(linkedHashMap), r6.A06, r6.A03, r6.A07, r6.A02, r6.A01, r6.A04, r6.A05);
                        }
                    }
                    this.A03 = r6;
                    List<C118865or> list4 = r1.A03;
                    if (!list4.isEmpty()) {
                        HashMap hashMap2 = new HashMap(r6.A01);
                        for (C118865or r42 : list4) {
                            hashMap2.put(r42.A01, r42);
                        }
                        r6 = new C131536Pl(r6.A00, r6.A06, r6.A03, r6.A07, r6.A02, hashMap2, r6.A04, r6.A05);
                    }
                    this.A03 = r6;
                    Map map5 = r1.A07;
                    if (map5 != null && !map5.isEmpty()) {
                        HashMap hashMap3 = new HashMap(r6.A04);
                        hashMap3.putAll(map5);
                        r6 = new C131536Pl(r6.A00, r6.A06, r6.A03, r6.A07, r6.A02, r6.A01, hashMap3, r6.A05);
                    }
                    this.A03 = r6;
                    List<C118875os> list5 = r1.A04;
                    if (list5 != null && !list5.isEmpty()) {
                        HashMap hashMap4 = new HashMap(r6.A05);
                        for (C118875os r43 : list5) {
                            hashMap4.put(r43.A01, r43);
                        }
                        r6 = new C131536Pl(r6.A00, r6.A06, r6.A03, r6.A07, r6.A02, r6.A01, r6.A04, hashMap4);
                    }
                    this.A03 = r6;
                    HashMap hashMap5 = null;
                    HashMap hashMap6 = null;
                    for (AnonymousClass6KB r9 : r1.A05) {
                        String str = r9.A00;
                        if (hashMap5 != null) {
                            map = hashMap5;
                        } else {
                            map = this.A03.A06;
                        }
                        if (!map.containsKey(str)) {
                            if (hashMap5 == null) {
                                hashMap5 = new HashMap(this.A03.A06);
                            }
                            hashMap5.put(str, r9);
                        }
                        if (hashMap6 != null) {
                            map2 = hashMap6;
                        } else {
                            map2 = this.A03.A07;
                        }
                        if (!map2.containsKey(str)) {
                            String str2 = r9.A01;
                            C1271967i r33 = r23;
                            AnonymousClass7fH A022 = C133266Xn.A02(r33, str2);
                            if (A022 != null) {
                                if (r22 != null) {
                                    list3 = r22.A08;
                                } else {
                                    list3 = null;
                                }
                                C118845op Bsd = A022.Bsd(r23, this, this.A0J, r9, A01(r33, this.A03, list3));
                                this.A02.A01(Bsd.A01);
                                if (hashMap6 == null) {
                                    hashMap6 = new HashMap(this.A03.A07);
                                }
                                hashMap6.put(str, Bsd.A00);
                            } else {
                                th = C90514aH.A0s(AnonymousClass000.A0p("Missing variable module with type: ", str2, AnonymousClass000.A0u()));
                                throw th;
                            }
                        }
                    }
                    C131536Pl A012 = this.A03.A01(hashMap5, hashMap6);
                    this.A03 = A012;
                    if (r22 != null) {
                        list2 = r22.A08;
                    } else {
                        list2 = null;
                    }
                    C100674vP A013 = A01(r23, A012, list2);
                    List<C128756Dm> list6 = r1.A01;
                    if (list6 == null || list6.isEmpty()) {
                        arrayList = AnonymousClass001.A0I();
                    } else {
                        AnonymousClass6RN.A00("Initialize BloksComponentQueryManager");
                        try {
                            if (this.A01 == null) {
                                C130466Le r34 = (C130466Le) r23.A01(R.id.bk_context_key_async_component_store);
                                if (r34 != null) {
                                    this.A01 = new AnonymousClass6SN(this.A02, this, r34);
                                } else {
                                    th = C90514aH.A0s("Attempting to process async components but missing component query store");
                                    throw th;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            AnonymousClass68E.A00();
                        }
                        try {
                            AnonymousClass68E.A00();
                            AnonymousClass6RN.A00("Bloks Setup AsyncComponentQueries");
                            AnonymousClass6SN r7 = this.A01;
                            ArrayList A0I3 = AnonymousClass001.A0I();
                            for (C128756Dm r8 : list6) {
                                String str3 = (String) AnonymousClass5Z1.A00(A013, r8.A00, "appId");
                                if (str3 != null) {
                                    Map map6 = (Map) AnonymousClass5Z1.A00(A013, r8.A03, "params");
                                    if (map6 == null) {
                                        map6 = C000400e.A0D();
                                    }
                                    Long l = (Long) AnonymousClass5Z1.A00(A013, r8.A01, "cacheTtlSeconds");
                                    if (l != null) {
                                        long longValue = l.longValue();
                                        C130466Le r122 = r7.A02;
                                        AnonymousClass7V5 r11 = new AnonymousClass7V5(r7, A013, r8, str3);
                                        String A002 = AnonymousClass6Vs.A00(str3, map6);
                                        synchronized (r122.A04) {
                                            try {
                                                AnonymousClass6RN.A00(C90464aC.A0d("BloksComponentQueryStore", "getCachedComponentsOrSubscribeToQuery:syncFetchResponseForKey"));
                                                C1259662a r24 = r122.A03.A00;
                                                long now = r24.A00.now();
                                                C100454v2 r15 = new C100454v2();
                                                C117985n9 r13 = r24.A02;
                                                C118835oo r14 = (C118835oo) r13.A00.A01(new C162977pS(A002, 1), "ASYNC_COMPONENT");
                                                if (r14 != null && (r14 instanceof C100554vD) && AnonymousClass6Vs.A02(r14, longValue, now)) {
                                                    r15.A01("cache_src", "memory");
                                                    AnonymousClass011 A19 = C36441kJ.A19(r14, new C100474v5(C000400e.A0B(r15.A01), C000400e.A0B(r15.A00)));
                                                    C118835oo r25 = (C118835oo) A19.first;
                                                    if (r25 instanceof C100554vD) {
                                                        r3 = new AnonymousClass69U(new C100514v9(((C100554vD) r25).A00, (C118825on) A19.second, A002), (Runnable) null);
                                                        AnonymousClass68E.A00();
                                                    }
                                                }
                                                AnonymousClass68E.A00();
                                            } catch (Exception e) {
                                                try {
                                                    Object[] objArr = new Object[1];
                                                    C90514aH.A1U(e, objArr, 0);
                                                    AnonymousClass6RS.A01("BloksComponentQueryStore", C90504aG.A0m("Exception encountered when trying to perform syncFetchResponseForKey inside BloksComponentQueryWriteThroughCache: %s", Arrays.copyOf(objArr, 1)));
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                AnonymousClass68E.A00();
                                                throw th3;
                                            }
                                            C121105sb r35 = new C121105sb(A002, r11, new C154327Rt(r122));
                                            r122.A05.add(r35);
                                            r3 = new AnonymousClass69U((AnonymousClass66B) null, new C1497572q(r35, 43));
                                        }
                                        AnonymousClass66B r27 = r3.A00;
                                        if (r27 == null) {
                                            r7.A00.A01(r3.A01);
                                        } else {
                                            C90494aF.A1F(r8, r27, A0I3);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            synchronized (r7.A03) {
                                ArrayList A0J2 = C36321k7.A0J(A0I3);
                                Iterator it = A0I3.iterator();
                                while (it.hasNext()) {
                                    AnonymousClass011 r16 = (AnonymousClass011) it.next();
                                    A0J2.add(AnonymousClass6SN.A00(r7, A013, (AnonymousClass66B) r16.second, (C128756Dm) r16.first, "resolved_sync"));
                                }
                                arrayList = AnonymousClass03U.A07(A0J2);
                            }
                            AnonymousClass68E.A00();
                        } catch (Throwable th4) {
                            AnonymousClass68E.A00();
                            throw th4;
                        }
                    }
                    for (AnonymousClass69T r17 : arrayList) {
                        C128126Az r5 = r17.A00;
                        AnonymousClass69S r44 = r17.A01;
                        if (r5 != null) {
                            linkedList.add(r5.A00);
                            C36361kB.A1O(r5.A01, r5.A02, A0I2);
                        }
                        this.A03 = this.A03.A00(C36391kE.A11(r44.A01, r44.A00));
                    }
                }
            }
            if (this.A03 != r26) {
                z = true;
            }
            pair = C36441kJ.A0Q(Boolean.valueOf(z), A0I2);
        }
        AnonymousClass68E.A00();
        return pair;
    }

    private C140456lc A02(List list) {
        AnonymousClass6RN.A00("Bloks SnapshotComponent");
        C140456lc r2 = this.A05;
        try {
            if (!list.isEmpty()) {
                r2 = AnonymousClass5Z9.A00((C157187by) null, new C100404ux(list), r2);
            }
            return r2;
        } finally {
            AnonymousClass68E.A00();
        }
    }

    public AnonymousClass66A A03(C1271967i r11, AnonymousClass7fD r12, Map map) {
        C131536Pl r1 = this.A03;
        Map map2 = map;
        if (!map.isEmpty() || !r1.A02.isEmpty()) {
            r1 = new C131536Pl(r1.A00, r1.A06, r1.A03, r1.A07, map2, r1.A01, r1.A04, r1.A05);
        }
        this.A03 = r1;
        this.A02 = new AnonymousClass67F(r11.A00);
        this.A06 = AnonymousClass001.A0F(r11);
        this.A0A = r12;
        Pair A002 = A00(Collections.singletonList(this.A09));
        this.A09 = null;
        if (!((List) A002.second).isEmpty()) {
            this.A05 = A02((List) A002.second);
        }
        synchronized (this.A0B) {
            this.A0D = true;
            if (this.A0C) {
                Handler handler = A0M;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
        return new AnonymousClass66A(this.A03, this.A05);
    }

    public C140456lc A04() {
        if (this.A08) {
            AnonymousClass6RS.A01("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
        }
        C132926Vv.A02("Tree operations are only supported from the UI Thread");
        return A02(this.A0H);
    }

    public void A05() {
        boolean z;
        if (!this.A08) {
            C132926Vv.A02("Tree operations are only supported from the UI Thread");
            Map map = this.A0L;
            boolean z2 = true;
            if (!map.isEmpty()) {
                this.A03 = this.A03.A00(map);
                map.clear();
                z = true;
            } else {
                z = false;
            }
            List list = this.A0I;
            if (!list.isEmpty()) {
                ArrayList A15 = C36441kJ.A15(list);
                list.clear();
                Pair A002 = A00(A15);
                z |= AnonymousClass000.A1X(A002.first);
                this.A0H.addAll((Collection) A002.second);
            }
            AnonymousClass6RN.A00("Bloks ModelMutation");
            List list2 = this.A0H;
            C140456lc A022 = A02(list2);
            if (this.A05 == A022) {
                z2 = false;
            }
            boolean z3 = z | z2;
            this.A05 = A022;
            list2.clear();
            AnonymousClass68E.A00();
            AnonymousClass7fD r3 = this.A0A;
            if (r3 != null && z3) {
                r3.BbZ(new AnonymousClass66A(this.A03, this.A05));
            }
        }
    }

    public void A06(AnonymousClass6XK r3, Map map) {
        C132926Vv.A02("Tree operations are only supported from the UI Thread");
        this.A0H.addAll((Collection) A00(Collections.singletonList(r3)).second);
        HashMap A0J2 = AnonymousClass001.A0J();
        A0J2.putAll(this.A03.A07);
        if (map != null) {
            A0J2.putAll(map);
        }
        if (!A0J2.isEmpty()) {
            this.A03 = this.A03.A00(A0J2);
            A0J2.putAll(this.A07);
            this.A07 = A0J2;
        }
    }

    public void A07(AnonymousClass69S r4) {
        if (!this.A08) {
            C132926Vv.A02("Tree operations are only supported from the UI Thread");
            C114095gd.A05.incrementAndGet();
            this.A0L.put(r4.A01, r4.A00);
            synchronized (this.A0B) {
                if (!this.A0D) {
                    this.A0C = true;
                    return;
                }
                Handler handler = A0M;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
    }

    public void A08(AnonymousClass7fI r3, AnonymousClass65X r4) {
        if (!this.A08) {
            C132926Vv.A02("Tree operations are only supported from the UI Thread");
            this.A0H.add(C36441kJ.A0Q(r3, r4));
        }
    }

    public AnonymousClass6WZ(AnonymousClass6XK r3, AnonymousClass6IK r4, C131196Oc r5) {
        this.A05 = r3.A01;
        this.A09 = r3;
        this.A0J = r4;
        this.A0E = r5;
    }
}
