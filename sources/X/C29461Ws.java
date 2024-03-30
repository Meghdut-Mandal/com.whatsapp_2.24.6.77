package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ws  reason: invalid class name and case insensitive filesystem */
public final class C29461Ws {
    public final C29451Wr A00;
    public final Map A01 = new AnonymousClass166(5);
    public final Map A02 = new AnonymousClass166(100);
    public final Map A03 = new HashMap();

    public C29461Ws(C29451Wr r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public static final C198089ct A00(C29461Ws r10, UserJid userJid) {
        C198089ct r1;
        synchronized (r10) {
            Map map = r10.A01;
            r1 = (C198089ct) map.get(userJid);
            if (r1 == null) {
                r1 = new C198089ct((AnonymousClass9VS) null, (AnonymousClass9VS) null, (List) null, (List) null, (List) null, (Map) null, (C05250Oz) null, 63);
                map.put(userJid, r1);
            }
        }
        return r1;
    }

    public final int A02(UserJid userJid) {
        int i;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            List<C207269up> A09 = A09(userJid);
            i = 7;
            if (A09 != null) {
                for (C207269up hashCode : A09) {
                    i = (i * 31) + hashCode.hashCode();
                }
            }
        }
        return i;
    }

    public final AnonymousClass9VS A03(UserJid userJid) {
        AnonymousClass9VS r0;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            C198089ct r02 = (C198089ct) this.A01.get(userJid);
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final AnonymousClass9VS A04(UserJid userJid, String str) {
        AnonymousClass9VS r0;
        AnonymousClass9VT r02;
        synchronized (this) {
            C198089ct r03 = (C198089ct) this.A01.get(userJid);
            if (r03 == null || (r02 = (AnonymousClass9VT) r03.A05.get(str)) == null) {
                r0 = null;
            } else {
                r0 = r02.A00;
            }
        }
        return r0;
    }

    public final C195929Wv A05(UserJid userJid, String str) {
        C195929Wv r0;
        AnonymousClass9VT r02;
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass00C.A0D(str, 1);
        synchronized (this) {
            C198089ct r03 = (C198089ct) this.A01.get(userJid);
            if (r03 == null || (r02 = (AnonymousClass9VT) r03.A05.get(str)) == null) {
                r0 = null;
            } else {
                r0 = r02.A01;
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r4.put(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r9.length() == 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C207269up A06(com.whatsapp.jid.UserJid r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r9 == 0) goto L_0x000a
            int r1 = r9.length()     // Catch:{ all -> 0x0099 }
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            r6 = 0
            if (r0 != 0) goto L_0x009c
            java.util.Map r4 = r7.A02     // Catch:{ all -> 0x0099 }
            X.69b r0 = new X.69b     // Catch:{ all -> 0x0099 }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0099 }
            X.9up r0 = (X.C207269up) r0     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r7)
            return r0
        L_0x001f:
            java.util.Map r0 = r7.A03     // Catch:{ all -> 0x0099 }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x0099 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x009c
            if (r8 == 0) goto L_0x0032
            boolean r0 = r3.equals(r8)     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0032
            goto L_0x009c
        L_0x0032:
            java.util.Map r0 = r7.A01     // Catch:{ all -> 0x0099 }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0099 }
            X.9ct r2 = (X.C198089ct) r2     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x009c
            java.util.List r0 = r2.A04     // Catch:{ all -> 0x0099 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0099 }
        L_0x0042:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0099 }
            X.9up r5 = (X.C207269up) r5     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r5.A0F     // Catch:{ all -> 0x0099 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r9)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0042
            X.69b r0 = new X.69b     // Catch:{ all -> 0x0099 }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x0099 }
        L_0x005b:
            r4.put(r0, r5)     // Catch:{ all -> 0x0099 }
            goto L_0x0097
        L_0x005f:
            java.util.Map r0 = r2.A05     // Catch:{ all -> 0x0099 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0099 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0099 }
        L_0x0069:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0099 }
            X.9VT r0 = (X.AnonymousClass9VT) r0     // Catch:{ all -> 0x0099 }
            X.9Wv r0 = r0.A01     // Catch:{ all -> 0x0099 }
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0099 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0099 }
        L_0x007d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0069
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0099 }
            X.9up r5 = (X.C207269up) r5     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r5.A0F     // Catch:{ all -> 0x0099 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r9)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x007d
            X.69b r0 = new X.69b     // Catch:{ all -> 0x0099 }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x0099 }
            goto L_0x005b
        L_0x0097:
            monitor-exit(r7)
            return r5
        L_0x0099:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x009c:
            monitor-exit(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29461Ws.A06(com.whatsapp.jid.UserJid, java.lang.String):X.9up");
    }

    public final C206759tv A07(UserJid userJid) {
        C206759tv r0;
        Object obj;
        List list;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            List A09 = A09(userJid);
            r0 = null;
            if (A09 != null) {
                Iterator it = A09.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C207269up r2 = (C207269up) obj;
                    C206769tw r1 = r2.A01;
                    if (r1 != null && r1.A00 == 0 && !r2.A08 && (!r2.A07.isEmpty())) {
                        break;
                    }
                }
                C207269up r3 = (C207269up) obj;
                if (!(r3 == null || (list = r3.A07) == null)) {
                    r0 = (C206759tv) C007103b.A0M(list);
                }
            }
        }
        return r0;
    }

    public final ArrayList A08(UserJid userJid) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            C198089ct r3 = (C198089ct) this.A01.get(userJid);
            if (r3 != null) {
                for (String str : r3.A03) {
                    AnonymousClass9VT r0 = (AnonymousClass9VT) r3.A05.get(str);
                    if (r0 != null) {
                        arrayList.add(r0.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List A09(UserJid userJid) {
        List list;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            C198089ct r0 = (C198089ct) this.A01.get(userJid);
            if (r0 == null) {
                list = null;
            } else {
                list = Collections.unmodifiableList(r0.A04);
            }
        }
        return list;
    }

    public final void A0A(AnonymousClass9VR r10, UserJid userJid, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            C198089ct A002 = A00(this, userJid);
            if (!z) {
                A002.A03.clear();
            }
            for (C195929Wv r7 : r10.A01) {
                AnonymousClass9VT r6 = new AnonymousClass9VT(r7);
                for (C207269up r3 : r7.A04) {
                    Map map = this.A02;
                    String str = r3.A0F;
                    map.put(new C1276369b(userJid, str), r3);
                    this.A03.put(str, userJid);
                }
                List list = A002.A03;
                String str2 = r7.A03;
                list.add(str2);
                A002.A05.put(str2, r6);
            }
            A002.A00 = r10.A00;
        }
    }

    public final void A0B(C21112A8x a8x, UserJid userJid, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            C198089ct A002 = A00(this, userJid);
            if (!z) {
                List<C207269up> list = A002.A04;
                for (C207269up r0 : list) {
                    this.A03.remove(r0.A0F);
                }
                list.clear();
            }
            for (C207269up r1 : a8x.A02) {
                C207269up A012 = A01(r1, userJid);
                A002.A04.add(A012);
                this.A02.put(new C1276369b(userJid, r1.A0F), A012);
                this.A03.put(A012.A0F, userJid);
            }
            A002.A01 = a8x.A01;
            this.A00.A00(userJid);
        }
    }

    public final void A0C(C207269up r10, UserJid userJid) {
        AnonymousClass00C.A0D(r10, 0);
        synchronized (this) {
            C207269up A012 = A01(r10, userJid);
            Map map = this.A02;
            String str = A012.A0F;
            map.put(new C1276369b(userJid, str), A012);
            Object obj = userJid;
            if (userJid == null) {
                obj = this.A03.get(str);
            }
            UserJid userJid2 = (UserJid) obj;
            if (userJid2 != null) {
                C198089ct A002 = A00(this, userJid2);
                Iterator it = A002.A05.values().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    List list = ((AnonymousClass9VT) it.next()).A01.A04;
                    int size = list.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (AnonymousClass00C.A0J(str, ((C207269up) list.get(i)).A0F)) {
                            list.set(i, A012);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                List list2 = A002.A04;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        list2.add(0, A012);
                        this.A03.put(str, userJid2);
                        break;
                    } else if (AnonymousClass00C.A0J(str, ((C207269up) list2.get(i2)).A0F)) {
                        list2.set(i2, A012);
                        break;
                    } else {
                        i2++;
                    }
                }
                this.A00.A00(userJid2);
            }
        }
    }

    public final void A0D(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            Map map = this.A01;
            C198089ct r4 = (C198089ct) map.get(userJid);
            if (r4 != null) {
                for (C207269up r1 : r4.A04) {
                    Map map2 = this.A03;
                    String str = r1.A0F;
                    map2.remove(str);
                    this.A02.remove(new C1276369b(userJid, str));
                }
                for (AnonymousClass9VT r0 : r4.A05.values()) {
                    for (C207269up r12 : r0.A01.A04) {
                        Map map3 = this.A03;
                        String str2 = r12.A0F;
                        map3.remove(str2);
                        this.A02.remove(new C1276369b(userJid, str2));
                    }
                }
            }
            map.remove(userJid);
            this.A00.A00(userJid);
        }
    }

    public final void A0F(UserJid userJid, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            C198089ct r3 = (C198089ct) this.A01.get(userJid);
            if (r3 != null) {
                r3.A03.clear();
                r3.A05.clear();
                if (z) {
                    r3.A00 = new AnonymousClass9VS(true, (String) null);
                }
            }
        }
    }

    public final boolean A0G(UserJid userJid) {
        boolean containsKey;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            containsKey = this.A01.containsKey(userJid);
        }
        return containsKey;
    }

    public final boolean A0H(UserJid userJid) {
        synchronized (this) {
            C198089ct r0 = (C198089ct) this.A01.get(userJid);
            if (r0 == null) {
                return false;
            }
            boolean z = !r0.A03.isEmpty();
            return z;
        }
    }

    public final boolean A0I(UserJid userJid) {
        boolean z;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (this) {
            C198089ct r0 = (C198089ct) this.A01.get(userJid);
            if (r0 != null) {
                z = !r0.A04.isEmpty();
            } else {
                z = false;
            }
        }
        return z;
    }

    private final C207269up A01(C207269up r36, UserJid userJid) {
        C134736bW r13;
        List list;
        C207269up r1 = r36;
        String str = r1.A0F;
        C207269up A06 = A06(userJid, str);
        if (A06 == null || (r13 = A06.A0B) == null) {
            r13 = r1.A0B;
        } else {
            C134736bW r2 = r1.A0B;
            if (r2 != null) {
                List list2 = r2.A03;
                if (list2 == null || list2.isEmpty()) {
                    list2 = r13.A03;
                }
                List list3 = r2.A02;
                if (list3 == null || list3.isEmpty()) {
                    list3 = r13.A02;
                }
                C134666bP r3 = r2.A01;
                if (r3 == null) {
                    r3 = r13.A01;
                }
                C134546bD r22 = r2.A00;
                if (r22 == null || (list = r22.A00) == null || !(!list.isEmpty())) {
                    r22 = r13.A00;
                }
                r13 = new C134736bW(r22, r3, list2, list3);
            }
        }
        String str2 = r1.A05;
        String str3 = r1.A0C;
        BigDecimal bigDecimal = r1.A06;
        C132386Tk r12 = r1.A04;
        String str4 = r1.A0E;
        String str5 = r1.A0G;
        List list4 = r1.A07;
        C206769tw r8 = r1.A01;
        C134726bV r7 = r1.A02;
        String str6 = r1.A0D;
        int i = r1.A00;
        boolean z = r1.A0H;
        boolean z2 = r1.A08;
        BigDecimal bigDecimal2 = bigDecimal;
        List list5 = list4;
        int i2 = i;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        C134726bV r19 = r7;
        C134736bW r20 = r13;
        C132386Tk r21 = r12;
        return new C207269up(r1.A0A, r8, r19, r20, r21, str10, str11, str12, str7, str8, str9, bigDecimal2, list5, i2, r1.A09, z, z2);
    }

    public final void A0E(UserJid userJid, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("CatalogCacheManager/trimProductsInCatalogCache/Invalid size argument - ");
            sb.append(i);
            Log.e(sb.toString());
            return;
        }
        synchronized (this) {
            C198089ct r2 = (C198089ct) this.A01.get(userJid);
            if (r2 != null) {
                r2.A01 = new AnonymousClass9VS(true, (String) null);
                List list = r2.A04;
                int size = list.size() - i;
                for (int i2 = 0; i2 < size; i2++) {
                    int size2 = list.size() - 1;
                    String str = ((C207269up) list.get(size2)).A0F;
                    this.A03.remove(str);
                    this.A02.remove(new C1276369b(userJid, str));
                    list.remove(size2);
                }
            }
        }
    }
}
