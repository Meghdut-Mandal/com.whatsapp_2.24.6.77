package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.json.JSONObject;

/* renamed from: X.9oR  reason: invalid class name and case insensitive filesystem */
public final class C203639oR {
    public C203619oP A00;
    public final AnonymousClass9Pb A01;
    public final AnonymousClass9Pc A02;
    public final AnonymousClass17Y A03;
    public final C105675Fp A04;
    public final C105685Fq A05;
    public final AnonymousClass9F7 A06;
    public final C193149Ka A07;
    public final AnonymousClass61B A08;
    public final C194439Ps A09;
    public final C1268565x A0A;
    public final AnonymousClass9FA A0B;
    public final AnonymousClass691 A0C;
    public final String A0D;
    public final Map A0E;
    public final Map A0F;
    public final Map A0G;
    public final Map A0H;
    public final AnonymousClass9E8 A0I;
    public final C19970wo A0J;
    public final C20810yC A0K;
    public final AnonymousClass19A A0L;
    public final AnonymousClass975 A0M;
    public final C197629c1 A0N;
    public final AnonymousClass62E A0O;
    public final AnonymousClass005 A0P;

    private final C185718ug A00() {
        AnonymousClass011[] r2 = new AnonymousClass011[3];
        C90464aC.A1E("session-id", this.A09.A00(), r2);
        C90464aC.A1F("bloks-versioning-id", "b3ee4083bc5153a49b8915306fcb062aac140bd37f9c3c5b42e55d85397fdf0c", r2);
        C90474aD.A1F("phoenix-versioning-id", "ce07772e7ab2c60d4def52839c1ca2016cd29cd9a2ad4b028c19245d1be21e02", r2);
        LinkedHashMap A072 = C000400e.A07(r2);
        AnonymousClass00C.A0E(A072, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        return new C185718ug(C90474aD.A0k(A072), 10);
    }

    private final LinkedHashMap A02(List list) {
        AbstractCollection abstractCollection;
        if (list == null) {
            return null;
        }
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (!map.containsKey("is_entry_screen") || C36371kC.A1X(map.get("is_entry_screen"), false)) {
                Object obj = map.get("sources");
                if ((obj instanceof ArrayList) && (abstractCollection = (AbstractCollection) obj) != null) {
                    Iterator it2 = abstractCollection.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Set set = (Set) A1G.get(next);
                        if (set == null) {
                            set = C36441kJ.A17();
                            A1G.put(next, set);
                        }
                        set.add(new C195669Vm(C90464aC.A0a("app_id", map), (Map) map.get("bloks_server_params")));
                    }
                }
            }
        }
        return A1G;
    }

    public final void A0A(C159637jg r24, C107885Rg r25, C128166Be r26, String str) {
        B7P b7p;
        int i;
        C203399nx r3;
        String str2;
        String str3;
        C107885Rg r10 = r25;
        AnonymousClass00C.A0D(r10, 2);
        C128166Be r0 = r26;
        int hashCode = r0.hashCode();
        String str4 = r0.A00;
        C105675Fp r7 = this.A04;
        r7.A00(hashCode, str4);
        r7.A02(hashCode, "config_name", str4);
        AnonymousClass19A r2 = this.A0L;
        String A092 = r2.A09();
        int hashCode2 = r0.hashCode();
        String name = r10.name();
        r7.A01.A03(hashCode2, "iqRequest");
        if (name != null) {
            r7.A02(hashCode2, "iq_type", name);
        }
        r7.A02(hashCode2, "session_id", this.A09.A00());
        int ordinal = r10.ordinal();
        C159637jg r17 = r24;
        String str5 = str;
        if (ordinal == 0) {
            Map map = r0.A02;
            if (map != null) {
                C18740tg.A06(map);
                LinkedHashMap A1G = C36431kI.A1G();
                Iterator A0y = AnonymousClass000.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (A11.getValue() != null) {
                        C36411kG.A1T(A1G, A11);
                    }
                }
                str2 = new JSONObject(A1G).toString();
            } else {
                str2 = null;
            }
            C186018vH r102 = new C186018vH(new C185648uZ(A00(), 7), A092, str4, r0.A01, str2, 10);
            r3 = r102.A00;
            AnonymousClass00C.A08(r3);
            b7p = new B7P(r17, this, r0, r102, str5, 0);
            i = 302;
        } else if (ordinal == 1) {
            Map map2 = r0.A02;
            if (map2 != null) {
                C18740tg.A06(map2);
                LinkedHashMap A1G2 = C36431kI.A1G();
                Iterator A0y2 = AnonymousClass000.A0y(map2);
                while (A0y2.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A0y2);
                    if (A112.getValue() != null) {
                        C36411kG.A1T(A1G2, A112);
                    }
                }
                str3 = new JSONObject(A1G2).toString();
            } else {
                str3 = null;
            }
            C186018vH r103 = new C186018vH(new C185648uZ(A00(), 8), A092, str4, r0.A01, str3, 11);
            r3 = r103.A00;
            AnonymousClass00C.A08(r3);
            b7p = new B7P(r17, this, r0, r103, str5, 1);
            i = 303;
        } else {
            return;
        }
        r2.A0E(b7p, r3, A092, i, 32000);
    }

    public void A0B(AnonymousClass7hO r17, C159657ji r18, C128166Be r19, String str, String str2, Map map) {
        C128166Be r4 = r19;
        String str3 = r4.A00;
        String str4 = str2;
        if (str2 != null) {
            this.A0F.put(str3, str4);
        }
        int hashCode = hashCode();
        C105685Fq r5 = this.A05;
        r5.A00(hashCode, str3);
        r5.A02(hashCode, "config_name", str3);
        C194439Ps r6 = this.A09;
        r6.A00 = null;
        String A002 = r6.A00();
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("config", str3);
        A1B.put("isStartingState", true);
        A1B.put("sessionId", A002);
        String str5 = str;
        A1B.put("referral", str5);
        this.A0E.put(C108375Tg.SESSION_ID.key, r6.A00());
        r6.A00();
        AnonymousClass61B r2 = this.A08;
        String str6 = this.A0D;
        synchronized (r2) {
            AnonymousClass00C.A0D(str6, 0);
            r2.A00.put(str6, this);
        }
        r5.A01.A03(hashCode, "iqRequest");
        r5.A02(hashCode, "iq_type", "GET");
        r5.A02(hashCode, "session_id", r6.A00());
        A0A(new AGF(this, r17, r18, str3, str5, map, hashCode), C107885Rg.GET, r4, str3);
    }

    public final void A0D(C184578sf r10) {
        AnonymousClass00C.A0D(r10, 0);
        int hashCode = hashCode();
        String str = this.A0D;
        AnonymousClass00C.A0D(str, 2);
        AnonymousClass6D3 r2 = ((AnonymousClass628) this.A0P.get()).A00;
        String str2 = r10.A00;
        AnonymousClass00C.A08(str2);
        String A002 = C130996Nh.A00(Integer.valueOf(hashCode));
        if (A002 == null) {
            A002 = "";
        }
        r2.A00((AnonymousClass64K) null, C36371kC.A0m(), str2, A002, str, "");
    }

    public final void A0E(String str, String str2) {
        List list;
        String str3 = str2;
        AnonymousClass00C.A0D(str3, 1);
        C197629c1 r9 = this.A0N;
        Map map = this.A0E;
        String str4 = this.A0D;
        C36321k7.A0z(map, str4);
        HashMap A012 = C131866Qy.A01(str3);
        if (!A012.isEmpty()) {
            LinkedHashMap A1G = C36431kI.A1G();
            Object obj = A012.get("states");
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Iterator A0y = AnonymousClass000.A0y((Map) obj);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                String A0f = C90494aF.A0f(A11);
                Object value = A11.getValue();
                AnonymousClass00C.A0E(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                C194679Qr A002 = C197629c1.A00(r9, A0f, str, str4, (Map) value, map);
                if (A002 != null) {
                    A1G.put(A11.getKey(), A002);
                }
            }
            Object obj2 = A012.get("next_screens");
            if (obj2 instanceof List) {
                list = (List) obj2;
            } else {
                list = null;
            }
            Object obj3 = A012.get("start_at");
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.String");
            AnonymousClass00C.A0D(obj3, 1);
            A09((C134906bn) null, list, false);
            return;
        }
        throw AnonymousClass001.A09("PslJsonParser/parseStatesFromPsl Invalid JSON is passed");
    }

    public C203639oR(AnonymousClass9Pb r17, AnonymousClass9Pc r18, AnonymousClass9E8 r19, AnonymousClass17Y r20, C19970wo r21, C20810yC r22, AnonymousClass19A r23, AnonymousClass975 r24, C197629c1 r25, C105675Fp r26, C105685Fq r27, AnonymousClass9F7 r28, C193149Ka r29, AnonymousClass61B r30, C194439Ps r31, C1268565x r32, AnonymousClass9FA r33, AnonymousClass691 r34, AnonymousClass62E r35, AnonymousClass005 r36, Map map) {
        String A0l;
        AnonymousClass9XM A002;
        AnonymousClass19A r9 = r23;
        C20810yC r10 = r22;
        C19970wo r11 = r21;
        AnonymousClass17Y r12 = r20;
        C36321k7.A18(r11, r10, r12, r9);
        AnonymousClass975 r8 = r24;
        AnonymousClass00C.A0D(r8, 7);
        AnonymousClass61B r5 = r30;
        C1268565x r4 = r32;
        C36391kE.A1U(r5, r4);
        AnonymousClass9Pb r15 = r17;
        AnonymousClass00C.A0D(r15, 12);
        C105675Fp r7 = r26;
        AnonymousClass9Pc r14 = r18;
        C36361kB.A1L(r7, r14);
        AnonymousClass62E r3 = r35;
        AnonymousClass9E8 r13 = r19;
        C165607th.A1J(r13, 16, r3);
        AnonymousClass005 r1 = r36;
        AnonymousClass00C.A0D(r1, 18);
        Map map2 = map;
        AnonymousClass00C.A0D(map2, 19);
        C105685Fq r6 = r27;
        AnonymousClass00C.A0D(r6, 20);
        this.A0J = r11;
        this.A0K = r10;
        this.A03 = r12;
        this.A0L = r9;
        this.A0N = r25;
        this.A09 = r31;
        this.A0M = r8;
        this.A06 = r28;
        this.A08 = r5;
        this.A0A = r4;
        this.A07 = r29;
        this.A01 = r15;
        this.A0B = r33;
        this.A04 = r7;
        this.A02 = r14;
        this.A0I = r13;
        this.A0O = r3;
        this.A0P = r1;
        this.A0G = map2;
        this.A05 = r6;
        AnonymousClass691 r0 = r34;
        this.A0C = r0;
        if (r34 == null || (A002 = r4.A00(r0.A00)) == null || A002.A00() == null) {
            A0l = C36361kB.A0l();
            AnonymousClass00C.A0B(A0l);
        } else {
            A0l = A002.A03.A02;
        }
        this.A0D = A0l;
        this.A0H = C36431kI.A1G();
        this.A0E = C36431kI.A1G();
        this.A0F = AnonymousClass001.A0J();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.8h3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.8h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.8h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.8gy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.8gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.8h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: X.8h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: X.8h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: X.8h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.8h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.8h2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A01(X.C203639oR r23, X.C184828t4 r24, java.lang.String r25) {
        /*
            r0 = r24
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = X.C36411kG.A13(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x000e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x01b9
            java.lang.Object r1 = r9.next()
            X.8rq r1 = (X.C184068rq) r1
            java.lang.Object r1 = r1.A00
            X.Awl r1 = (X.C22836Awl) r1
            X.AnonymousClass00C.A08(r1)
            boolean r2 = r1 instanceof X.C185168ti
            r12 = 0
            r6 = r23
            if (r2 == 0) goto L_0x00a1
            X.8ti r1 = (X.C185168ti) r1
            X.8sI r7 = r1.A00
            java.lang.String r5 = r7.A01
            java.lang.String r4 = r1.A02
            java.lang.String r2 = r7.A00
            java.util.Map r20 = X.AnonymousClass977.A00(r2)
            java.lang.String r2 = r1.A05
            java.util.Map r8 = X.AnonymousClass977.A00(r2)
            if (r8 == 0) goto L_0x009e
            X.5Tg r2 = X.C108375Tg.ADDITIONAL_PARAMS
            java.lang.String r3 = r2.key
            java.util.Map r2 = r6.A0E
            X.011 r2 = X.C36441kJ.A19(r3, r2)
            java.util.Map r21 = X.C000400e.A0C(r8, r2)
        L_0x004c:
            java.lang.String r2 = r7.A04
            java.util.Map r22 = X.AnonymousClass977.A00(r2)
            java.lang.String r2 = r7.A03
            if (r2 != 0) goto L_0x0099
            java.lang.String r17 = "$"
        L_0x0058:
            java.lang.String r6 = r7.A02
            java.lang.String r3 = r1.A03
            if (r3 != 0) goto L_0x0060
            java.lang.String r3 = "replace"
        L_0x0060:
            java.lang.String r7 = r1.A04
            if (r7 == 0) goto L_0x0097
            org.json.JSONTokener r2 = new org.json.JSONTokener
            r2.<init>(r7)
            java.lang.Object r2 = r2.nextValue()
            X.AnonymousClass00C.A0B(r2)
            java.lang.Object r13 = X.AnonymousClass6HO.A00(r2)
        L_0x0074:
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x007d
            X.9dd r12 = new X.9dd
            r12.<init>(r1)
        L_0x007d:
            X.AnonymousClass00C.A0B(r5)
            X.AnonymousClass00C.A0B(r4)
            X.8h2 r10 = new X.8h2
            r14 = r25
            r11 = r10
            r15 = r5
            r16 = r4
            r18 = r6
            r19 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0092:
            r0.add(r10)
            goto L_0x000e
        L_0x0097:
            r13 = r12
            goto L_0x0074
        L_0x0099:
            java.lang.String r17 = X.C165597tg.A0l(r2)
            goto L_0x0058
        L_0x009e:
            r21 = r12
            goto L_0x004c
        L_0x00a1:
            boolean r2 = r1 instanceof X.C185158th
            if (r2 == 0) goto L_0x00fb
            X.8th r1 = (X.C185158th) r1
            X.8sI r2 = r1.A00
            java.lang.String r6 = r2.A01
            X.AnonymousClass00C.A08(r6)
            java.lang.String r5 = r1.A02
            X.AnonymousClass00C.A08(r5)
            java.util.List r2 = r1.A03
            java.util.ArrayList r7 = X.C36351kA.A0z(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x00bd:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00cf
            java.lang.Object r2 = r3.next()
            X.8rn r2 = (X.C184038rn) r2
            java.lang.Object r2 = r2.A00
            r7.add(r2)
            goto L_0x00bd
        L_0x00cf:
            java.util.ArrayList r4 = X.C36351kA.A0z(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x00d7:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00ec
            java.lang.Object r2 = r3.next()
            X.8rj r2 = (X.C183998rj) r2
            java.lang.String r2 = r2.A00
            X.AnonymousClass00C.A08(r2)
            r4.add(r2)
            goto L_0x00d7
        L_0x00ec:
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x00f5
            X.9dd r12 = new X.9dd
            r12.<init>(r1)
        L_0x00f5:
            X.8gz r10 = new X.8gz
            r10.<init>(r12, r6, r5, r4)
            goto L_0x0092
        L_0x00fb:
            boolean r2 = r1 instanceof X.C185128te
            if (r2 == 0) goto L_0x010e
            X.8te r1 = (X.C185128te) r1
            X.8sI r1 = r1.A00
            java.lang.String r1 = r1.A01
            X.AnonymousClass00C.A08(r1)
            X.8gy r10 = new X.8gy
            r10.<init>(r1)
            goto L_0x0092
        L_0x010e:
            boolean r2 = r1 instanceof X.C185138tf
            if (r2 == 0) goto L_0x013b
            X.8tf r1 = (X.C185138tf) r1
            X.8sI r3 = r1.A00
            java.lang.String r11 = r3.A01
            X.AnonymousClass00C.A08(r11)
            java.lang.String r2 = r3.A00
            java.util.Map r14 = X.AnonymousClass977.A00(r2)
            java.lang.String r1 = r1.A01
            java.util.Map r15 = X.AnonymousClass977.A00(r1)
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x0136
            java.lang.String r12 = "$"
        L_0x012d:
            java.lang.String r13 = r3.A02
            X.8h0 r10 = new X.8h0
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0092
        L_0x0136:
            java.lang.String r12 = X.C165597tg.A0l(r1)
            goto L_0x012d
        L_0x013b:
            boolean r2 = r1 instanceof X.C185148tg
            if (r2 == 0) goto L_0x015d
            X.8tg r1 = (X.C185148tg) r1
            X.8sI r2 = r1.A01
            java.lang.String r4 = r2.A01
            X.AnonymousClass00C.A08(r4)
            java.lang.String r3 = r1.A02
            X.AnonymousClass00C.A08(r3)
            X.8rj r1 = r1.A00
            java.lang.String r2 = r1.A00
            X.AnonymousClass00C.A08(r2)
            X.9FA r1 = r6.A0B
            X.8h1 r10 = new X.8h1
            r10.<init>(r1, r4, r3, r2)
            goto L_0x0092
        L_0x015d:
            boolean r2 = r1 instanceof X.C185178tj
            if (r2 == 0) goto L_0x000e
            X.9Pb r5 = r6.A01
            X.8tj r1 = (X.C185178tj) r1
            X.8sI r3 = r1.A00
            java.lang.String r14 = r3.A01
            java.lang.String r2 = r3.A00
            java.util.Map r20 = X.AnonymousClass977.A00(r2)
            java.lang.String r2 = r1.A04
            java.util.Map r21 = X.AnonymousClass977.A00(r2)
            java.lang.String r2 = r3.A04
            java.util.Map r22 = X.AnonymousClass977.A00(r2)
            java.lang.String r2 = r3.A03
            if (r2 != 0) goto L_0x01b4
            java.lang.String r16 = "$"
        L_0x0181:
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x018a
            X.9dd r12 = new X.9dd
            r12.<init>(r2)
        L_0x018a:
            java.lang.String r15 = r3.A02
            java.lang.String r3 = r1.A03
            java.lang.String r4 = r1.A02
            java.lang.String r2 = r6.A0D
            X.C90474aD.A1A(r14, r3, r4)
            X.0w4 r1 = r5.A00
            X.0tq r1 = r1.A00
            X.61B r13 = X.C165587tf.A0Y(r1)
            X.004 r1 = r1.AMX
            java.lang.Object r11 = r1.get()
            X.1K9 r11 = (X.AnonymousClass1K9) r11
            X.8h3 r10 = new X.8h3
            r17 = r3
            r18 = r4
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0092
        L_0x01b4:
            java.lang.String r16 = X.C165597tg.A0l(r2)
            goto L_0x0181
        L_0x01b9:
            int r1 = X.C36331k8.A01(r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x01c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9Qr r0 = (X.C194679Qr) r0
            java.lang.String r0 = r0.A01
            r3.put(r0, r1)
            goto L_0x01c6
        L_0x01d9:
            java.util.Iterator r1 = X.AnonymousClass000.A0y(r3)
        L_0x01dd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01eb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)
            r0.getValue()
            goto L_0x01dd
        L_0x01eb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203639oR.A01(X.9oR, X.8t4, java.lang.String):java.util.LinkedHashMap");
    }

    public static final void A03(C128616Cy r2, C203639oR r3, Long l, String str, String str2, int i) {
        r2.A01.A03(i, str);
        if (l != null) {
            r2.A01(i, str2, l.longValue());
        }
        r2.A02(i, "session_id", r3.A09.A00());
    }

    public static final void A04(C203639oR r3) {
        AnonymousClass62E r2 = r3.A0O;
        String str = r3.A0D;
        synchronized (r2) {
            AnonymousClass00C.A0D(str, 0);
            r2.A00.remove(str);
        }
        AnonymousClass61B r22 = r3.A08;
        synchronized (r22) {
            r22.A00.remove(str);
        }
        Stack stack = r3.A06.A00;
        stack.clear();
        stack.add(AnonymousClass001.A0J());
        r3.A00 = null;
    }

    public static final void A05(C203639oR r1, C184828t4 r2) {
        C22990Azg azg = (C22990Azg) r1.A0H.get(r2.A01);
        if (azg != null) {
            C203399nx r0 = r2.A00;
            AnonymousClass00C.A08(r0);
            azg.BmO(r0);
        }
    }

    public static final void A06(C203639oR r0, Map map) {
        ((Map) C165607th.A0n(r0.A06.A00)).putAll(map);
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            AnonymousClass000.A11(A0y).getValue();
        }
    }

    private final void A07(AnonymousClass7hO r13, C159657ji r14, C134906bn r15, String str, String str2, String str3, String str4, List list, Map map, Map map2, Map map3, Map map4, int i, boolean z, boolean z2) {
        String str5;
        Map map5 = map2;
        AnonymousClass9Pc r3 = this.A02;
        String str6 = this.A0D;
        AnonymousClass691 r0 = this.A0C;
        if (r0 != null) {
            str5 = r0.A00;
        } else {
            str5 = null;
        }
        C203619oP A002 = r3.A00(this.A06, str, str2, str6, str5, str4);
        this.A00 = A002;
        A002.A09 = map4;
        A002.A08 = list;
        AnonymousClass61B r4 = this.A08;
        synchronized (r4) {
            AnonymousClass00C.A0D(str6, 0);
            r4.A00.put(str6, this);
        }
        r13.BYB(A002.A0N);
        Map map6 = map;
        A06(this, map6);
        if (z2) {
            AnonymousClass62E r42 = this.A0O;
            synchronized (r42) {
                r42.A00.put(str6, r15);
            }
        }
        Map A11 = C36391kE.A11(C108375Tg.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (map2 == null) {
            map5 = C000400e.A0D();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A11);
        linkedHashMap.putAll(map5);
        A002.A0B(new C23217B9z(this, r14, 1), str3, linkedHashMap, map3, z);
        Long A0y = C36441kJ.A0y(map6.size());
        C105685Fq r11 = this.A05;
        int i2 = i;
        A03(r11, this, A0y, "initializeStateMachine", "num_states", i2);
        r11.A01.A04(i2, 467);
    }

    private final void A08(AnonymousClass7hO r39, C159657ji r40, C134906bn r41, String str, String str2, String str3, List list, Map map, Map map2, int i, boolean z) {
        Map map3;
        Object obj;
        String str4;
        Map map4 = map;
        String A002 = this.A09.A00();
        C134906bn r8 = r41;
        List<Map> list2 = list;
        boolean z2 = z;
        A09(r8, list2, z2);
        LinkedHashMap A022 = A02(list2);
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList arrayList = null;
        if (list != null) {
            for (Map map5 : list2) {
                Object obj2 = map5.get("is_entry_screen");
                if (!(obj2 instanceof Boolean)) {
                    obj2 = null;
                }
                if (C36341k9.A1Z(obj2)) {
                    Map map6 = (Map) map5.get("bloks_server_params");
                    if (map6 != null) {
                        obj = map6.get("screen_id");
                    } else {
                        obj = null;
                    }
                    if (!(!(obj instanceof String) || (str4 = (String) obj) == null || str4.length() == 0)) {
                        A0I2.add(str4);
                    }
                }
            }
        }
        if (!A0I2.isEmpty()) {
            arrayList = A0I2;
        }
        Map A11 = C36391kE.A11(C108375Tg.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
        if (map == null) {
            map4 = C000400e.A0D();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A11);
        linkedHashMap.putAll(map4);
        AnonymousClass691 r2 = this.A0C;
        String str5 = str;
        String str6 = str2;
        Map map7 = map2;
        if (r2 != null && this.A0K.A0E(3374)) {
            C1268565x r6 = this.A0A;
            String str7 = r2.A00;
            if (r6.A00(str7) == null) {
                Map map8 = (Map) linkedHashMap.get("overwrite_first_screen_presentation");
                AnonymousClass9E8 r22 = this.A0I;
                C195579Uz r35 = new C195579Uz();
                String str8 = this.A0D;
                if (map8 != null) {
                    map3 = C000400e.A0B(map8);
                } else {
                    map3 = null;
                }
                AnonymousClass9XN r27 = new AnonymousClass9XN(str5, A002, str8, str6, list2, map3, map7);
                System.currentTimeMillis();
                C18800tq r0 = r22.A00.A00;
                AnonymousClass9XM r32 = new AnonymousClass9XM(C36351kA.A0V(r0), C18800tq.AH6(r0), r35, r27, str7);
                synchronized (r6) {
                    Map map9 = r6.A00;
                    if (map9.size() >= 3) {
                        Iterator A10 = AnonymousClass000.A10(map9);
                        if (A10.hasNext()) {
                            Object next = A10.next();
                            while (A10.hasNext()) {
                                String A0C2 = AnonymousClass001.A0C(A10);
                                next = (String) next;
                                AnonymousClass9XM r1 = (AnonymousClass9XM) map9.get(next);
                                AnonymousClass9XM r02 = (AnonymousClass9XM) map9.get(A0C2);
                                if (!(r1 == null || r02 == null || r1.A00 < r02.A00)) {
                                    next = A0C2;
                                }
                            }
                            map9.remove(next);
                        } else {
                            throw AnonymousClass001.A0E("Empty collection can't be reduced.");
                        }
                    }
                    map9.put(r32.A04, r32);
                }
            }
        }
        A07(r39, r40, r8, str5, A002, str6, str3, arrayList, map7, linkedHashMap, (Map) null, A022, i, false, z2);
    }

    private final void A09(C134906bn r8, List list, boolean z) {
        if (z) {
            AnonymousClass62E r2 = this.A0O;
            String str = this.A0D;
            synchronized (r2) {
                AnonymousClass00C.A0D(str, 0);
                r2.A00.put(str, r8);
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (C36341k9.A1Z(map.get("is_entry_screen"))) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("FdsManager:fetchEntryScreenForPslConfig prefetch ");
                    C36321k7.A1N(map.get("app_id"), A0u);
                    int hashCode = hashCode();
                    ((AnonymousClass628) this.A0P.get()).A00(C90464aC.A0a("app_id", map), this.A0D, (Map) map.get("bloks_server_params"), hashCode);
                }
            }
        }
    }

    public final void A0C(AnonymousClass7hO r36, C159657ji r37, C134906bn r38, String str, String str2, String str3, Map map, boolean z) {
        String str4;
        List list;
        Object obj;
        Map map2;
        String str5 = str2;
        AnonymousClass00C.A0D(str5, 1);
        int hashCode = hashCode();
        C105685Fq r1 = this.A05;
        String str6 = str;
        r1.A00(hashCode, str6);
        r1.A02(hashCode, "config_name", str6);
        C1268565x r12 = this.A0A;
        AnonymousClass691 r0 = this.A0C;
        if (r0 != null) {
            str4 = r0.A00;
        } else {
            str4 = null;
        }
        AnonymousClass9XM A002 = r12.A00(str4);
        AnonymousClass7hO r14 = r36;
        C159657ji r15 = r37;
        C134906bn r16 = r38;
        String str7 = str3;
        Map map3 = map;
        boolean z2 = z;
        if (A002 == null || A002.A00() == null) {
            C197629c1 r11 = this.A0N;
            Map map4 = this.A0E;
            String str8 = this.A0D;
            C36341k9.A1E(map4, 2, str8);
            HashMap A012 = C131866Qy.A01(str5);
            if (!A012.isEmpty()) {
                LinkedHashMap A1G = C36431kI.A1G();
                Object obj2 = A012.get("states");
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Iterator A0y = AnonymousClass000.A0y((Map) obj2);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    String A0f = C90494aF.A0f(A11);
                    Object value = A11.getValue();
                    AnonymousClass00C.A0E(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    C194679Qr A003 = C197629c1.A00(r11, A0f, str6, str8, (Map) value, map4);
                    if (A003 != null) {
                        A1G.put(A11.getKey(), A003);
                    }
                }
                Object obj3 = A012.get("next_screens");
                if (obj3 instanceof List) {
                    list = (List) obj3;
                } else {
                    list = null;
                }
                Object obj4 = A012.get("start_at");
                AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type kotlin.String");
                String str9 = (String) obj4;
                AnonymousClass00C.A0D(str9, 1);
                A08(r14, r15, r16, str6, str9, str7, list, map3, A1G, hashCode, z2);
                return;
            }
            throw AnonymousClass001.A09("PslJsonParser/parseStatesFromPsl Invalid JSON is passed");
        }
        AnonymousClass9XN r6 = A002.A03;
        List list2 = r6.A05;
        LinkedHashMap A022 = A02(list2);
        Map map5 = r6.A06;
        String A004 = A002.A00();
        if (A004 != null) {
            AnonymousClass011[] r2 = new AnonymousClass011[2];
            C36341k9.A1J(C108375Tg.REFERRAL.key, PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, r2, 0);
            C36341k9.A1J("overwrite_first_screen_presentation", map5, r2, 1);
            LinkedHashMap A072 = C000400e.A07(r2);
            Stack stack = A002.A06;
            ListIterator listIterator = stack.listIterator(stack.size());
            do {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                obj = listIterator.previous();
            } while (!AnonymousClass00C.A0J(((C195849Wh) obj).A01, A004));
            C195849Wh r13 = (C195849Wh) obj;
            if (r13 == null || (map2 = r13.A02) == null) {
                map2 = C000400e.A0D();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A072);
            linkedHashMap.putAll(map2);
            A07(r14, r15, r16, str6, r6.A03, A004, str7, (List) null, r6.A07, map3, linkedHashMap, A022, hashCode, true, z2);
            return;
        }
        A08(r14, r15, r16, str6, r6.A04, str7, list2, map3, r6.A07, hashCode, z2);
    }

    public void A0F(Map map) {
        if (!map.isEmpty()) {
            this.A0E.putAll(map);
        }
    }
}
