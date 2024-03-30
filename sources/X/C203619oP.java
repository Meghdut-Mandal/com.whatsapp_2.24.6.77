package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9oP  reason: invalid class name and case insensitive filesystem */
public final class C203619oP {
    public int A00;
    public AnonymousClass9S8 A01;
    public C187868yf A02;
    public C202129l5 A03;
    public AnonymousClass66U A04;
    public C194679Qr A05;
    public AnonymousClass9XM A06;
    public String A07;
    public List A08;
    public Map A09;
    public boolean A0A;
    public B1W A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;
    public final AnonymousClass17Y A0F;
    public final C105705Fs A0G;
    public final AnonymousClass9F7 A0H;
    public final AnonymousClass9F8 A0I;
    public final AnonymousClass6EW A0J;
    public final AnonymousClass005 A0K;
    public final Runnable A0L;
    public final String A0M;
    public final String A0N;
    public final AnonymousClass0z8 A0O;
    public final C21390zA A0P;
    public final AnonymousClass9E3 A0Q;
    public final AnonymousClass60Z A0R;
    public final AnonymousClass9E7 A0S;
    public final AnonymousClass975 A0T;
    public final AnonymousClass9F6 A0U;
    public final C194409Po A0V;
    public final C194419Pp A0W;
    public final C1268565x A0X;
    public final C131376Ou A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;

    public static final void A04(C203619oP r11, AnonymousClass6PH r12, String str, Map map, Map map2, boolean z) {
        C019408g aol;
        Map map3;
        LinkedHashMap linkedHashMap;
        AnonymousClass5SM r7;
        Object obj;
        String str2;
        JSONObject jSONObject;
        C203619oP r5 = r11;
        AnonymousClass9F7 r0 = r11.A0H;
        AnonymousClass00C.A0D(str, 0);
        C194679Qr r10 = (C194679Qr) ((Map) C165607th.A0n(r0.A00)).get(str);
        if (r10 != null) {
            r11.A0F.A0G(r11.A0L);
            if (r10 instanceof C178718gz) {
                A03(r11, r10, map);
                aol = new C22555Aok(r11);
            } else {
                String str3 = null;
                if (r10 instanceof AnonymousClass8h2) {
                    if (!(map == null || map2 == null)) {
                        str3 = ((AnonymousClass8h2) r10).A02;
                    }
                    AnonymousClass8h2 r102 = (AnonymousClass8h2) r10;
                    Map A022 = C132596Uk.A00.A02(r102.A01, r102.A02, map, map2);
                    if (z) {
                        r7 = AnonymousClass5SM.RESUME;
                    } else {
                        r7 = AnonymousClass5SM.EXECUTE;
                    }
                    A02(r5, r7, r102, r12, str3, A022);
                    return;
                } else if ((r10 instanceof AnonymousClass8h1) || (r10 instanceof C178708gy) || (r10 instanceof AnonymousClass8h0)) {
                    A03(r11, r10, map);
                    aol = new C22556Aol(r11);
                } else if (r10 instanceof AnonymousClass8h3) {
                    A03(r11, r10, map);
                    AnonymousClass8h3 r103 = (AnonymousClass8h3) r10;
                    if (z) {
                        C194419Pp r3 = r11.A0W;
                        AnonymousClass00C.A0D(r3, 2);
                        C18740tg.A0B(AnonymousClass00C.A0J(r103.A04, "embedded"));
                        AnonymousClass8h3.A00(r3, r103, r12, r103.A00, map);
                        r103.A00 = null;
                        return;
                    }
                    AnonymousClass9S8 r02 = r11.A01;
                    if (r02 == null) {
                        throw C36331k8.A0d("flowManager");
                    }
                    String str4 = (String) C165607th.A0n(r02.A03);
                    C194419Pp r9 = r11.A0W;
                    C36321k7.A0v(str4, 0, r9);
                    if (map == null) {
                        map3 = C000400e.A0D();
                    } else {
                        map3 = map;
                    }
                    Map A032 = C201769kM.A03(map3, r103.A06);
                    String A0Z2 = C90464aC.A0Z("state", A032);
                    String A0Z3 = C90464aC.A0Z("error_map_type", A032);
                    Map A0o = C165587tf.A0o("server_parameters", A032);
                    String str5 = r103.A05;
                    if (A0o != null) {
                        linkedHashMap = new LinkedHashMap(A0o);
                    } else {
                        linkedHashMap = null;
                    }
                    C128166Be r32 = new C128166Be(str5, A0Z2, linkedHashMap);
                    Map A0o2 = C165587tf.A0o("state_machine_parameters", A032);
                    if (AnonymousClass00C.A0J(r103.A04, "embedded")) {
                        r103.A00 = map;
                        C203639oR A002 = r103.A02.A00(r103.A03);
                        C18740tg.A06(A002);
                        A002.A0A(new AGE(r9, r103, A002, A0Z3, A0o2, map), C107885Rg.GET, r32, str4);
                        return;
                    }
                    r103.A01.A00((AnonymousClass691) null).A0B((AnonymousClass7hO) null, new C203579oL(r103, map, r9, 0), r32, "", A0Z3, A0o2);
                    return;
                } else {
                    throw AnonymousClass001.A08("Unsupported Type");
                }
            }
            C019408g r33 = aol;
            if (r10 instanceof AnonymousClass8h1) {
                AnonymousClass8h1 r104 = (AnonymousClass8h1) r10;
                AnonymousClass00C.A0D(r33, 1);
                Object obj2 = r104.A02;
                HashMap A012 = C131866Qy.A01(r104.A01);
                Object obj3 = A012.get("exists");
                AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj3;
                AnonymousClass9FA r03 = r104.A00;
                AnonymousClass00C.A0D(str6, 0);
                InputStream open = r03.A00.A00.getAssets().open("versioning/phoenix-features.json");
                AnonymousClass00C.A08(open);
                try {
                    C200759iB.A01(C165607th.A0w(AnonymousClass0Va.A01(open))).Bmq(str6, new C22902AyE[0]);
                    obj2 = A012.get("next");
                    AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.String");
                } catch (C21831Ab9 unused) {
                }
                r33.BKt(obj2, map, (Object) null);
            } else if (r10 instanceof C178708gy) {
                AnonymousClass00C.A0D(r33, 1);
                String str7 = r10.A00;
                if (map == null) {
                    map = C000400e.A0D();
                }
                r33.BKt(str7, map, (Object) null);
            } else if (r10 instanceof AnonymousClass8h3) {
                throw AnonymousClass001.A0D();
            } else if (r10 instanceof AnonymousClass8h2) {
                throw AnonymousClass001.A0D();
            } else if (r10 instanceof AnonymousClass8h0) {
                AnonymousClass8h0 r105 = (AnonymousClass8h0) r10;
                AnonymousClass00C.A0D(r33, 1);
                if (map == null) {
                    map = C000400e.A0D();
                }
                r33.BKt(r105.A00, C201769kM.A01(r105.A00, C201769kM.A02(map, r105.A01), C201769kM.A03(map, r105.A02)), (Object) null);
            } else {
                C178718gz r106 = (C178718gz) r10;
                AnonymousClass00C.A0D(r33, 1);
                Object obj4 = null;
                if (map != null) {
                    jSONObject = new JSONObject(map);
                } else {
                    try {
                        jSONObject = C36441kJ.A1B();
                    } catch (Exception e) {
                        Log.e("FcsStateMachine", e);
                        if (e instanceof UnsupportedOperationException) {
                            str2 = "unsupportedComparisonTypes";
                        } else if (e instanceof ClassCastException) {
                            str2 = "comparingValuesWithDifferentTypes";
                        } else {
                            str2 = "genericChoiceStateError";
                        }
                        Object r1 = new AnonymousClass6PH((Integer) null, str2, e.getMessage());
                        C198479dd r04 = r106.A00;
                        if (r04 != null) {
                            obj4 = r04.A00(str2);
                        }
                        obj = obj4;
                        obj4 = r1;
                    }
                }
                List list = r106.A02;
                String str8 = r106.A01;
                AnonymousClass00C.A0D(list, 0);
                try {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        JSONObject A1C = C36441kJ.A1C(AnonymousClass001.A0C(it));
                        if (A1C.has("next")) {
                            String string = A1C.getString("next");
                            B4W A003 = AnonymousClass976.A00(A1C);
                            if (A003 != null) {
                                AnonymousClass00C.A0B(string);
                                A0I2.add(new AnonymousClass9I5(A003, string));
                            }
                        }
                    }
                    C18740tg.A0D(AnonymousClass000.A1Q(A0I2.isEmpty() ? 1 : 0), "expected at least 1 choice");
                    AnonymousClass9I6 r6 = new AnonymousClass9I6(str8, A0I2);
                    C194429Pq r52 = new C194429Pq(C36381kD.A0y(jSONObject));
                    Iterator it2 = r6.A01.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = r6.A00;
                            break;
                        }
                        AnonymousClass9I5 r13 = (AnonymousClass9I5) it2.next();
                        if (r13.A00.B6r(r52)) {
                            obj = r13.A01;
                            break;
                        }
                    }
                } catch (JSONException unused2) {
                    obj = null;
                }
                r33.BKt(obj, map, obj4);
            }
        } else {
            throw C90524aI.A0Y(AnonymousClass000.A0p("state not found for name: ", str, AnonymousClass000.A0u()));
        }
    }

    public static final void A05(C203619oP r12, AnonymousClass6PH r13, String str, Map map, short s) {
        String str2;
        C203619oP r8 = r12;
        AnonymousClass9XM r1 = r12.A06;
        if (r1 != null) {
            r1.A01 = false;
        }
        if (r12.A0E) {
            return;
        }
        if (r12.A09()) {
            A06(r8, (AnonymousClass6PH) null, (Map) null);
            return;
        }
        C105705Fs r0 = r8.A0G;
        r0.A01.A04(r8.A00, s);
        AnonymousClass6PH r9 = r13;
        String str3 = str;
        Map map2 = map;
        if (str == null) {
            AnonymousClass9S8 r3 = r8.A01;
            if (r3 == null) {
                throw C36331k8.A0d("flowManager");
            }
            Stack stack = r3.A04;
            String str4 = (String) ((Deque) C165607th.A0n(stack)).pollFirst();
            if (str4 != null) {
                r3.A00.A00(str4, map, false);
            } else if (stack.size() > 1) {
                stack.pop();
                String str5 = (String) r3.A03.pop();
                C194409Po r32 = r3.A00;
                AnonymousClass00C.A0B(str5);
                AnonymousClass00C.A0D(str5, 0);
                C203619oP r14 = r32.A00;
                r14.A0H.A00.pop();
                C202129l5 r82 = r14.A03;
                if (r82 == null) {
                    throw C36331k8.A0d("backNavManager");
                }
                String A0t = AnonymousClass000.A0t(AnonymousClass000.A0v(str5), ':');
                AnonymousClass9WF r2 = r82.A03;
                ArrayList A0S2 = C007103b.A0S(C36441kJ.A15(r2.A02), C36441kJ.A15(r2.A01));
                ArrayList A0I2 = AnonymousClass001.A0I();
                ArrayList A0I3 = AnonymousClass001.A0I();
                Iterator it = A0S2.iterator();
                while (true) {
                    str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!AnonymousClass098.A07(((C195679Vn) next).A01, A0t, false)) {
                        A0I2.add(next);
                    } else {
                        A0I3.add(next);
                    }
                }
                C195679Vn r02 = (C195679Vn) C007103b.A0O(A0I2);
                if (r02 != null) {
                    str2 = r02.A01;
                }
                C202129l5.A00(r82, str2);
                Object pollFirst = ((Deque) C165607th.A0n(stack)).pollFirst();
                C18740tg.A06(pollFirst);
                String str6 = (String) pollFirst;
                AnonymousClass00C.A0B(str6);
                r32.A00(str6, map, true);
            } else {
                A06(r8, r13, map);
            }
        } else {
            A04(r8, r9, str3, map2, (Map) null, false);
        }
    }

    public AnonymousClass0p4 A0A(String str) {
        AnonymousClass6F2 r1;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass9RW r0 = (AnonymousClass9RW) this.A0I.A00.get(str);
        if (r0 != null) {
            r1 = r0.A00();
        } else {
            r1 = null;
        }
        if (r1 instanceof AnonymousClass0p4) {
            return (AnonymousClass0p4) r1;
        }
        return null;
    }

    public C203619oP(C21390zA r17, AnonymousClass9E3 r18, AnonymousClass60Z r19, AnonymousClass9E7 r20, AnonymousClass17Y r21, AnonymousClass975 r22, C105705Fs r23, AnonymousClass9F7 r24, AnonymousClass9F8 r25, C1268565x r26, C131376Ou r27, AnonymousClass005 r28, String str, String str2, String str3, String str4, String str5) {
        String str6 = str5;
        C131376Ou r5 = r27;
        C1268565x r6 = r26;
        AnonymousClass975 r10 = r22;
        AnonymousClass17Y r11 = r21;
        AnonymousClass9E3 r14 = r18;
        C36321k7.A1B(r11, r10, r5, r6, r14);
        AnonymousClass005 r4 = r28;
        AnonymousClass9F8 r7 = r25;
        C105705Fs r9 = r23;
        AnonymousClass9E7 r12 = r20;
        C21390zA r15 = r17;
        C36321k7.A1C(r7, r12, r15, r9, r4);
        AnonymousClass60Z r13 = r19;
        AnonymousClass00C.A0D(r13, 11);
        String str7 = str3;
        AnonymousClass9F7 r8 = r24;
        C165607th.A1J(str7, 14, r8);
        this.A0F = r11;
        this.A0T = r10;
        this.A0Y = r5;
        this.A0X = r6;
        this.A0Q = r14;
        this.A0I = r7;
        this.A0S = r12;
        this.A0P = r15;
        this.A0G = r9;
        this.A0K = r4;
        this.A0R = r13;
        this.A0a = str;
        this.A0c = str2;
        this.A0M = str7;
        this.A0b = str4;
        this.A0Z = str6;
        this.A0H = r8;
        str6 = str5 == null ? C90464aC.A0V() : str6;
        this.A0N = str6;
        this.A0J = r5.A02(str6);
        this.A0L = new AVX(this, 11);
        this.A0O = new A8Q(this);
        this.A0U = new AnonymousClass9F6(this);
        this.A0V = new C194409Po(this);
        this.A0W = new C194419Pp(this);
    }

    public static final void A00(C203619oP r4) {
        C105705Fs r3 = r4.A0G;
        r3.A02(r4.A00, "session_id", r4.A0c);
        String str = r4.A0C;
        if (str != null) {
            r3.A02(r4.A00, "product_session_id", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
        if (r0 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C203619oP r28, X.C187868yf r29, X.AnonymousClass6F2 r30, X.AnonymousClass5SM r31, X.AnonymousClass8h2 r32, X.AnonymousClass6PH r33, java.lang.String r34, java.util.Map r35) {
        /*
            r6 = r30
            java.lang.String r4 = r6.A06()
            java.lang.String r0 = "resource_id"
            r7 = r28
            A08(r7, r0, r4)
            r10 = 0
            r5 = r35
            if (r35 == 0) goto L_0x006d
            X.5Te r0 = X.C108355Te.ERROR
            java.lang.String r0 = r0.key
            java.lang.Object r8 = r5.get(r0)
        L_0x001a:
            java.util.List r2 = r7.A08
            r1 = r5
            if (r35 != 0) goto L_0x0023
            X.00f r1 = X.C000400e.A0D()
        L_0x0023:
            r30 = r32
            r0 = r30
            java.util.Map r0 = r0.A04
            java.util.Map r1 = X.C201769kM.A03(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.Map r3 = X.C07710Yz.A02(r1)
            if (r8 == 0) goto L_0x003f
            X.5Te r0 = X.C108355Te.ERROR
            java.lang.String r0 = r0.key
            r3.put(r0, r8)
        L_0x003f:
            if (r2 == 0) goto L_0x0046
            java.lang.String r0 = "entry_screens"
            r3.put(r0, r2)
        L_0x0046:
            boolean r0 = r6 instanceof X.C162087o0
            r12 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0054
            r7.A0A = r12
            java.lang.String r0 = r30.A00()
            r7.A07 = r0
        L_0x0054:
            java.lang.String r0 = "context"
            java.lang.String r28 = X.C90464aC.A0Z(r0, r3)
            boolean r9 = r6 instanceof X.AnonymousClass5G6
            java.lang.String r16 = "initialStateMachineInput"
            java.lang.String r17 = "backNavManager"
            if (r9 == 0) goto L_0x0100
            X.9S8 r0 = r7.A01
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "flowManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x006d:
            r8 = r10
            goto L_0x001a
        L_0x006f:
            java.util.Stack r0 = r0.A03
            java.lang.Object r1 = X.C165607th.A0n(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r8 = r7.A0D
            if (r8 != 0) goto L_0x0080
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x0080:
            X.9l5 r13 = r7.A03
            if (r13 != 0) goto L_0x0089
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x0089:
            int r2 = r31.ordinal()
            r14 = 0
            if (r2 == r12) goto L_0x00a7
            r0 = 2
            if (r2 == r0) goto L_0x00a7
            X.9WF r0 = r13.A03
            java.util.Stack r0 = r0.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x009e
            r14 = 1
        L_0x009e:
            X.9l5 r2 = r7.A03
            if (r2 != 0) goto L_0x00ba
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x00a7:
            boolean r2 = r13.A01
            X.9WF r0 = r13.A03
            if (r2 == 0) goto L_0x00b7
            java.util.Stack r0 = r0.A02
        L_0x00af:
            int r0 = r0.size()
            if (r0 != r12) goto L_0x009e
            r14 = 1
            goto L_0x009e
        L_0x00b7:
            java.util.Stack r0 = r0.A01
            goto L_0x00af
        L_0x00ba:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x00d1
            X.9WF r2 = r2.A03
            java.util.Stack r0 = r2.A01
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00d1
            X.9Vn r0 = r2.A00()
            boolean r0 = r0.A00
            r2 = 1
            if (r0 == 0) goto L_0x00d2
        L_0x00d1:
            r2 = 0
        L_0x00d2:
            X.9XM r13 = r7.A06
            X.AnonymousClass00C.A0D(r1, r11)
            if (r14 == 0) goto L_0x00f4
            java.lang.String r14 = "overwrite_first_screen_presentation"
            java.lang.Object r0 = r8.get(r14)
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r14 = r8.get(r14)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r14, r0)
        L_0x00ec:
            java.util.Map r14 = (java.util.Map) r14
        L_0x00ee:
            X.5wR r8 = new X.5wR
            r8.<init>(r13, r1, r14, r2)
            goto L_0x0101
        L_0x00f4:
            java.lang.String r0 = "presentation"
            java.lang.Object r14 = r3.get(r0)
            boolean r0 = r14 instanceof java.util.Map
            if (r0 != 0) goto L_0x00ec
            r14 = 0
            goto L_0x00ee
        L_0x0100:
            r8 = r10
        L_0x0101:
            java.lang.String r22 = r30.A00()
            int r15 = r7.A00
            java.lang.String r14 = r7.A0M
            X.9l5 r0 = r7.A03
            if (r0 != 0) goto L_0x0112
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x0112:
            boolean r13 = r0.A01
            java.util.Map r2 = r7.A0D
            if (r2 != 0) goto L_0x011d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x011d:
            X.9XM r0 = r7.A06
            X.6Dp r1 = new X.6Dp
            r19 = r29
            r24 = r34
            r25 = r2
            r26 = r15
            r27 = r13
            r18 = r1
            r20 = r8
            r21 = r0
            r23 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.AGD r0 = new X.AGD
            r23 = r0
            r24 = r7
            r25 = r6
            r26 = r30
            r27 = r4
            r29 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29)
            int r13 = r31.ordinal()
            java.lang.String r16 = "fcsLoadingEventManager"
            r15 = r33
            if (r13 == r11) goto L_0x0164
            r8 = 2
            X.66U r2 = r7.A04
            if (r13 == r8) goto L_0x015d
            if (r2 != 0) goto L_0x01ed
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x015d:
            if (r2 != 0) goto L_0x01da
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x0164:
            if (r9 == 0) goto L_0x01c0
            X.9l5 r14 = r7.A03
            if (r14 != 0) goto L_0x016f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x016f:
            X.C18740tg.A06(r8)
            X.AnonymousClass00C.A08(r8)
            java.lang.String r13 = r30.A00()
            org.json.JSONObject r10 = X.C36441kJ.A1B()
            boolean r9 = r14.A01
            java.lang.String r2 = "isModalOnScreen"
            org.json.JSONObject r9 = r10.put(r2, r9)
            X.5Rw r10 = r8.A02
            java.lang.String r2 = "presentationType"
            org.json.JSONObject r9 = r9.put(r2, r10)
            java.lang.String r2 = "backstack_input"
            org.json.JSONObject r2 = r9.put(r2, r5)
            X.AnonymousClass00C.A08(r2)
            X.5SL r2 = r8.A03
            r14.A00 = r2
            X.5Rw r2 = X.C108025Rw.MODAL
            if (r10 != r2) goto L_0x01c9
            X.9WF r9 = r14.A03
            java.util.Stack r8 = r9.A02
            int r2 = r8.size()
            if (r2 != 0) goto L_0x01c9
            X.AnonymousClass00C.A0D(r13, r11)
            X.9Vn r2 = new X.9Vn
            r2.<init>(r13, r12)
            r8.add(r2)
        L_0x01b3:
            X.AnonymousClass00C.A0D(r13, r11)
            java.util.Stack r8 = r9.A01
        L_0x01b8:
            X.9Vn r2 = new X.9Vn
            r2.<init>(r13, r12)
            r8.add(r2)
        L_0x01c0:
            X.66U r2 = r7.A04
            if (r2 != 0) goto L_0x01d7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x01c9:
            X.9WF r9 = r14.A03
            java.util.Stack r8 = r9.A02
            int r2 = r8.size()
            if (r2 == 0) goto L_0x01b3
            X.AnonymousClass00C.A0D(r13, r11)
            goto L_0x01b8
        L_0x01d7:
            X.5Sq r9 = X.C108215Sq.ON_START
            goto L_0x01dc
        L_0x01da:
            X.5Sq r9 = X.C108215Sq.ON_RESTORE
        L_0x01dc:
            java.lang.String r12 = r30.A00()
            r10 = 0
            r11 = r4
            r13 = r28
            r14 = r10
            r8 = r2
            r8.A00(r9, r10, r11, r12, r13, r14)
            r6.A07(r1, r0, r15, r3)
            goto L_0x0211
        L_0x01ed:
            X.5Sq r19 = X.C108215Sq.ON_RESUME
            java.lang.String r22 = r30.A00()
            r24 = r10
            r18 = r2
            r20 = r10
            r21 = r4
            r23 = r28
            r18.A00(r19, r20, r21, r22, r23, r24)
            if (r9 == 0) goto L_0x021a
            X.5G6 r6 = (X.AnonymousClass5G6) r6
            if (r6 == 0) goto L_0x021a
            java.lang.String r2 = r7.A0N
            r8 = r6
            r9 = r1
            r10 = r0
            r11 = r15
            r12 = r2
            r13 = r3
            r8.A09(r9, r10, r11, r12, r13)
        L_0x0211:
            X.9l5 r0 = r7.A03
            if (r0 != 0) goto L_0x023a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r17)
            throw r0
        L_0x021a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to resume "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ". Resume is only supported for UI resource states."
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r2)
            java.lang.String r1 = "FailToResume"
            X.6PH r0 = new X.6PH
            r0.<init>(r10, r1, r2)
            A06(r7, r0, r10)
            goto L_0x0211
        L_0x023a:
            X.9WF r1 = r0.A03
            X.9Vo r2 = new X.9Vo
            r0 = r30
            r2.<init>(r0, r5)
            java.util.Map r1 = r1.A00
            X.8h2 r0 = r2.A00
            java.lang.String r0 = r0.A00()
            r1.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203619oP.A01(X.9oP, X.8yf, X.6F2, X.5SM, X.8h2, X.6PH, java.lang.String, java.util.Map):void");
    }

    public static final void A02(C203619oP r16, AnonymousClass5SM r17, AnonymousClass8h2 r18, AnonymousClass6PH r19, String str, Map map) {
        AnonymousClass6F2 A002;
        C203619oP r5 = r16;
        AnonymousClass9F8 r0 = r5.A0I;
        AnonymousClass8h2 r9 = r18;
        String str2 = r9.A03;
        AnonymousClass9RW r02 = (AnonymousClass9RW) r0.A00.get(str2);
        if (r02 == null || (A002 = r02.A00()) == null) {
            String A0p = AnonymousClass000.A0p("Resource not found: ", str2, AnonymousClass000.A0u());
            Log.e(A0p);
            A06(r5, new AnonymousClass6PH((Integer) null, "ResourceNotFound", A0p), (Map) null);
            return;
        }
        if (!A002.A00) {
            if (A002 instanceof C162107o2) {
                ((C162107o2) A002).B1S(r5.A0N);
            }
            A002.A03();
        }
        AnonymousClass5SM r8 = r17;
        AnonymousClass6PH r10 = r19;
        Map map2 = map;
        if (r8.ordinal() != 0) {
            A03(r5, r9, map2);
            A01(r5, r5.A02, A002, r8, r9, r10, str, map2);
        } else {
            if (A002 instanceof AnonymousClass5G6) {
                C202129l5 r6 = r5.A03;
                if (r6 == null) {
                    throw C36331k8.A0d("backNavManager");
                }
                C187868yf r3 = r5.A02;
                String A003 = r9.A00();
                AnonymousClass9WF r03 = r6.A03;
                boolean A012 = r03.A01(A003);
                boolean A022 = r03.A02(A003);
                if (A012 || A022) {
                    if (r3 == null) {
                        r3 = C187868yf.FORWARD_LOOPBACK;
                    }
                    r6.A04(r3, r10, A003, (String) null, map2);
                    C105705Fs r04 = r5.A0G;
                    r04.A01.A04(r5.A00, 4);
                    return;
                }
            }
            if (A002 instanceof C162087o0) {
                C202129l5 r05 = r5.A03;
                if (r05 == null) {
                    throw C36331k8.A0d("backNavManager");
                } else if (r05.A03.A01.size() != 0 && r5.A0A) {
                    String str3 = r5.A07;
                    C18740tg.A06(str3);
                    AnonymousClass66U r1 = r5.A04;
                    if (r1 == null) {
                        throw C36331k8.A0d("fcsLoadingEventManager");
                    }
                    AnonymousClass00C.A0B(str3);
                    r1.A01((AnonymousClass6PH) null, "onStartLoading", str3, (Map) null);
                    Map A032 = C201769kM.A03(map2, r9.A04);
                    AnonymousClass00C.A0E(A032, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    Map A023 = C07710Yz.A02(A032);
                    int i = r5.A00;
                    ((C162087o0) A002).Bm2(new AnonymousClass64K(r16, A002, r18, r19, str3, map), r5.A0M, A023, i);
                }
            }
            A03(r5, r9, map2);
            A01(r5, (C187868yf) null, A002, AnonymousClass5SM.EXECUTE, r9, r10, (String) null, map2);
        }
        if (A002 instanceof AnonymousClass5G6) {
            r5.A02 = null;
        }
    }

    public static final void A03(C203619oP r5, C194679Qr r6, Map map) {
        AnonymousClass6F2 A002;
        Stack stack;
        r5.A05 = r6;
        int hashCode = r6.hashCode();
        r5.A00 = hashCode;
        C105705Fs r1 = r5.A0G;
        AnonymousClass9S8 r0 = r5.A01;
        if (r0 == null) {
            throw C36331k8.A0d("flowManager");
        }
        r1.A00(hashCode, (String) C165607th.A0n(r0.A03));
        String str = r6.A01;
        A08(r5, "state_name", str);
        AnonymousClass9S8 r02 = r5.A01;
        if (r02 == null) {
            throw C36331k8.A0d("flowManager");
        }
        A08(r5, "config_name", (String) C165607th.A0n(r02.A03));
        AnonymousClass00C.A08(C36441kJ.A1B().put("input", map));
        AnonymousClass9XM r3 = r5.A06;
        if (r3 != null) {
            AnonymousClass9S8 r03 = r5.A01;
            if (r03 == null) {
                throw C36331k8.A0d("flowManager");
            }
            String str2 = (String) C165607th.A0n(r03.A03);
            AnonymousClass00C.A0D(str2, 0);
            AnonymousClass9XN r62 = r3.A03;
            if (str2.equals(r62.A01)) {
                C194679Qr r12 = (C194679Qr) r62.A07.get(str);
                if (r12 != null) {
                    HashMap A0J2 = AnonymousClass001.A0J();
                    if (r12 instanceof AnonymousClass8h2) {
                        AnonymousClass9F8 r04 = r3.A02;
                        String str3 = ((AnonymousClass8h2) r12).A03;
                        AnonymousClass9RW r05 = (AnonymousClass9RW) r04.A00.get(str3);
                        if (r05 == null || (A002 = r05.A00()) == null) {
                            throw C165577te.A0c(" is not in the resource registry", AnonymousClass000.A0v(str3));
                        } else if (A002 instanceof AnonymousClass5G6) {
                            Set set = r3.A05;
                            if (set.contains(str)) {
                                while (true) {
                                    stack = r3.A06;
                                    if (AnonymousClass00C.A0J(str, ((C195849Wh) stack.peek()).A01)) {
                                        break;
                                    }
                                    String str4 = ((C195849Wh) stack.pop()).A01;
                                    if (set.contains(str4)) {
                                        set.remove(str4);
                                        r62.A08.pop();
                                    }
                                }
                                set.remove(str);
                                r62.A08.pop();
                                Object pop = stack.pop();
                                AnonymousClass00C.A08(pop);
                                A0J2.putAll(((C195849Wh) pop).A03);
                            }
                            set.add(str);
                            r62.A08.push(str);
                        }
                    }
                    r3.A06.push(new C195849Wh(C187888yh.INCOMPLETE, str, map, A0J2));
                    r3.A00 = System.currentTimeMillis();
                    return;
                }
                throw C165577te.A0c(" is not part of the state registry", AnonymousClass000.A0v(str));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        if ((r8.A03.A07.get(((X.C195849Wh) r7.peek()).A01) instanceof X.C178708gy) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (r1.containsKey(X.C108355Te.A02.key) != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
        r3.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011e, code lost:
        if (r0 != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012c, code lost:
        if (r0 != null) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C203619oP r9, X.AnonymousClass6PH r10, java.util.Map r11) {
        /*
            boolean r0 = r9.A0E
            if (r0 != 0) goto L_0x0137
            r0 = 1
            r9.A0E = r0
            X.17Y r1 = r9.A0F
            java.lang.Runnable r0 = r9.A0L
            r1.A0G(r0)
            X.9F8 r0 = r9.A0I
            java.util.Map r0 = r0.A00
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.next()
            X.9RW r1 = (X.AnonymousClass9RW) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            X.6F2 r1 = r1.A00()
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            r1.A04()
            goto L_0x0016
        L_0x0032:
            X.9S8 r1 = r9.A01
            r4 = 0
            if (r1 != 0) goto L_0x003e
            java.lang.String r0 = "flowManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003e:
            X.6EW r0 = r1.A01
            r0.A04(r1)
            X.9l5 r3 = r9.A03
            if (r3 != 0) goto L_0x004e
            java.lang.String r0 = "backNavManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x004e:
            X.9WF r1 = r3.A03
            java.util.Stack r0 = r1.A01
            r0.clear()
            java.util.Stack r0 = r1.A02
            r0.clear()
            X.6EW r2 = r3.A04
            X.09w r1 = X.C023409w.A00
            X.6zx r0 = new X.6zx
            r0.<init>(r1)
            r2.A02(r0)
            r2.A04(r3)
            X.0zA r1 = r9.A0P
            X.0z8 r0 = r9.A0O
            r1.unregisterObserver(r0)
            X.6Ou r2 = r9.A0Y
            java.lang.String r1 = r9.A0N
            monitor-enter(r2)
            java.util.Map r0 = X.C131376Ou.A02     // Catch:{ all -> 0x0134 }
            r0.remove(r1)     // Catch:{ all -> 0x0134 }
            monitor-exit(r2)
            r9.A05 = r4
            if (r10 != 0) goto L_0x00e6
            X.B1W r5 = r9.A0B
            if (r5 == 0) goto L_0x0131
            X.B9z r5 = (X.C23217B9z) r5
            int r0 = r5.A02
            if (r0 == 0) goto L_0x0121
            java.lang.Object r6 = r5.A01
            X.9oR r6 = (X.C203639oR) r6
            X.691 r0 = r6.A0C
            if (r0 == 0) goto L_0x00de
            X.65x r3 = r6.A0A
            java.lang.String r2 = r0.A00
            monitor-enter(r3)
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x00da }
            java.lang.Object r8 = r0.get(r2)     // Catch:{ all -> 0x00da }
            X.9XM r8 = (X.AnonymousClass9XM) r8     // Catch:{ all -> 0x00da }
            if (r8 == 0) goto L_0x00dd
            java.util.Stack r7 = r8.A06     // Catch:{ all -> 0x00da }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00bc
            java.lang.Object r0 = r7.peek()     // Catch:{ all -> 0x00da }
            X.9Wh r0 = (X.C195849Wh) r0     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x00da }
            X.9XN r0 = r8.A03     // Catch:{ all -> 0x00da }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00da }
            boolean r0 = r0 instanceof X.C178708gy     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d6
        L_0x00bc:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00dd
            java.lang.Object r0 = r7.peek()     // Catch:{ all -> 0x00da }
            X.9Wh r0 = (X.C195849Wh) r0     // Catch:{ all -> 0x00da }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x00da }
            if (r1 == 0) goto L_0x00dd
            X.5Te r0 = X.C108355Te.ERROR     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r0.key     // Catch:{ all -> 0x00da }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00dd
        L_0x00d6:
            r3.A01(r2)     // Catch:{ all -> 0x00da }
            goto L_0x00dd
        L_0x00da:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00dd:
            monitor-exit(r3)
        L_0x00de:
            X.C203639oR.A04(r6)
            java.lang.Object r0 = r5.A00
            X.7ji r0 = (X.C159657ji) r0
            goto L_0x012e
        L_0x00e6:
            X.B1W r3 = r9.A0B
            if (r3 == 0) goto L_0x0131
            X.B9z r3 = (X.C23217B9z) r3
            int r2 = r3.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FDSManage/FcsStateMachine Terminated with error: "
            X.C36321k7.A1J(r10, r0, r1)
            if (r2 == 0) goto L_0x0113
            java.lang.Object r2 = r3.A01
            X.9oR r2 = (X.C203639oR) r2
            X.691 r0 = r2.A0C
            if (r0 == 0) goto L_0x0108
            X.65x r1 = r2.A0A
            java.lang.String r0 = r0.A00
            r1.A01(r0)
        L_0x0108:
            X.C203639oR.A04(r2)
            java.lang.Object r0 = r3.A00
            X.7ji r0 = (X.C159657ji) r0
        L_0x010f:
            r0.BXS(r10, r11)
            goto L_0x0131
        L_0x0113:
            java.lang.Object r0 = r3.A01
            X.9oR r0 = (X.C203639oR) r0
            X.C203639oR.A04(r0)
            java.lang.Object r0 = r3.A00
            X.7ji r0 = (X.C159657ji) r0
            if (r0 == 0) goto L_0x0131
            goto L_0x010f
        L_0x0121:
            java.lang.Object r0 = r5.A01
            X.9oR r0 = (X.C203639oR) r0
            X.C203639oR.A04(r0)
            java.lang.Object r0 = r5.A00
            X.7ji r0 = (X.C159657ji) r0
            if (r0 == 0) goto L_0x0131
        L_0x012e:
            r0.BiH(r11)
        L_0x0131:
            r9.A0B = r4
            return
        L_0x0134:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203619oP.A06(X.9oP, X.6PH, java.util.Map):void");
    }

    public static final void A07(C203619oP r1, String str) {
        C105705Fs r0 = r1.A0G;
        r0.A01.A03(r1.A00, str);
    }

    public static final void A08(C203619oP r2, String str, String str2) {
        r2.A0G.A02(r2.A00, str, str2);
        A00(r2);
    }

    private final boolean A09() {
        Boolean bool;
        String str = this.A0Z;
        if (str == null) {
            return false;
        }
        synchronized (this.A0Y) {
            bool = (Boolean) C131376Ou.A01.get(str);
        }
        if (C36371kC.A1X(bool, true)) {
            return true;
        }
        return false;
    }

    public final void A0B(B1W b1w, String str, Map map, Map map2, boolean z) {
        boolean z2;
        AnonymousClass6F2 r0;
        Boolean bool;
        this.A0P.registerObserver(this.A0O);
        this.A0B = b1w;
        String str2 = this.A0b;
        if (str2 != null) {
            this.A06 = this.A0X.A00(str2);
        }
        Map map3 = map;
        Map A0B2 = C000400e.A0B(map3);
        this.A0D = A0B2;
        this.A0C = C90464aC.A0Z("product_qpl_session_id", A0B2);
        Object obj = map3.get("is_modal_on_screen");
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        AnonymousClass9E7 r02 = this.A0S;
        String str3 = this.A0N;
        AnonymousClass9F6 r7 = this.A0U;
        C18800tq r03 = r02.A00.A00;
        C131376Ou A0a2 = C90484aE.A0a(r03);
        C202129l5 r5 = new C202129l5((AnonymousClass975) r03.A6T.get(), r7, new AnonymousClass9WF(), A0a2, str3, z2);
        this.A03 = r5;
        AnonymousClass6EW r4 = r5.A04;
        r4.A01(new C23160B7u(r5, 4), AnonymousClass707.class, r5);
        r4.A01(new C23160B7u(r5, 3), C149016zn.class, r5);
        r4.A01(new C23160B7u(r5, 5), C149056zr.class, r5);
        AnonymousClass9E3 r04 = this.A0Q;
        String str4 = this.A0a;
        AnonymousClass9S8 r6 = new AnonymousClass9S8(this.A0V, C90484aE.A0a(r04.A00.A00), str4, str3);
        this.A01 = r6;
        r6.A04.add(C90524aI.A0l());
        r6.A03.add(r6.A02);
        r6.A01.A01(new C23160B7u(r6, 1), AT9.class, r6);
        this.A04 = this.A0R.A00(str3);
        AnonymousClass9XM r62 = this.A06;
        if (r62 != null && !r62.A06.isEmpty()) {
            for (C195849Wh r9 : r62.A06) {
                Map map4 = r62.A03.A07;
                String str5 = r9.A01;
                if (map4.get(str5) instanceof AnonymousClass8h2) {
                    Object obj2 = map4.get(str5);
                    AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.payments.phoenix.flowconfigurationservice.state.FcsResourceState");
                    AnonymousClass8h2 r72 = (AnonymousClass8h2) obj2;
                    AnonymousClass9RW r05 = (AnonymousClass9RW) this.A0I.A00.get(r72.A03);
                    if (r05 != null) {
                        r0 = r05.A00();
                    } else {
                        r0 = null;
                    }
                    if ((r0 instanceof AnonymousClass5G6) && r9.A00 == C187888yh.COMPLETE) {
                        C202129l5 r06 = this.A03;
                        if (r06 == null) {
                            throw C36331k8.A0d("backNavManager");
                        }
                        String A002 = r72.A00();
                        AnonymousClass00C.A0D(A002, 0);
                        AnonymousClass9WF r2 = r06.A03;
                        Stack stack = r2.A01;
                        if (stack.size() == 0) {
                            stack.add(new C195679Vn(A002, false));
                        }
                        r2.A02.add(new C195679Vn(A002, false));
                        C202129l5 r07 = this.A03;
                        if (r07 == null) {
                            throw C36331k8.A0d("backNavManager");
                        }
                        Map map5 = r9.A02;
                        AnonymousClass9WF r08 = r07.A03;
                        C195689Vo r22 = new C195689Vo(r72, map5);
                        r08.A00.put(r22.A00.A00(), r22);
                    }
                }
            }
        }
        String str6 = this.A0c;
        Object obj3 = map3.get(C108375Tg.REFERRAL.key);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("config", str4);
        A1B.put("isStartingState", true);
        A1B.put("sessionId", str6);
        A1B.put("referral", obj3);
        if (A09()) {
            A06(this, (AnonymousClass6PH) null, (Map) null);
            return;
        }
        AnonymousClass9XM r09 = this.A06;
        boolean z3 = z;
        if (r09 != null) {
            r09.A01 = z3;
        }
        AnonymousClass6EW r42 = this.A0J;
        r42.A02(new C149066zs());
        String str7 = str;
        if (z) {
            A04(this, (AnonymousClass6PH) null, str7, map2, (Map) null, false);
        } else {
            A04(this, (AnonymousClass6PH) null, str7, map3, (Map) null, false);
        }
        r42.A01(new C23160B7u(this, 2), C149036zp.class, this);
    }
}
