package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6OV  reason: invalid class name */
public final class AnonymousClass6OV {
    public final C21327AHf A00;
    public final C24631De A01;
    public final C147676xb A02;
    public final C147686xc A03;
    public final C21323AHb A04;
    public final C147666xa A05;
    public final C147646xY A06;
    public final C21326AHe A07;
    public final C147656xZ A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;

    public final LinkedHashMap A01(AnonymousClass6KU r13, C159667jj r14, Object obj, Map map) {
        AnonymousClass6KU[] r5;
        AnonymousClass6KU r0;
        AnonymousClass6KU r02;
        AnonymousClass00C.A0D(r14, 1);
        LinkedHashMap A1G = C36431kI.A1G();
        if (!(r13 == null || (r5 = r13.A02) == null)) {
            for (AnonymousClass6KU r9 : r5) {
                Enum[] enumArr = (Enum[]) r14.B7I().getEnumConstants();
                if (enumArr != null) {
                    int length = enumArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Enum enumR = enumArr[i];
                        String BBm = ((AnonymousClass7hP) enumR).BBm();
                        String str = r9.A00;
                        if (!AnonymousClass00C.A0J(BBm, str)) {
                            i++;
                        } else if (enumR != null) {
                            Map map2 = map;
                            Object Bod = r14.Bod(enumR, obj, map2);
                            if (Bod instanceof List) {
                                Bod = ((Collection) Bod).toArray(C90524aI.A0w());
                            }
                            if (Bod instanceof Object[]) {
                                ArrayList A0I = AnonymousClass001.A0I();
                                for (Object obj2 : (Object[]) Bod) {
                                    AnonymousClass00C.A0D(str, 0);
                                    Map map3 = r13.A01;
                                    if (map3 != null) {
                                        r02 = (AnonymousClass6KU) map3.get(str);
                                    } else {
                                        r02 = null;
                                    }
                                    A0I.add(A00(r02, obj2, map2));
                                }
                                A1G.put(str, A0I);
                            } else {
                                AnonymousClass00C.A0D(str, 0);
                                Map map4 = r13.A01;
                                if (map4 != null) {
                                    r0 = (AnonymousClass6KU) map4.get(str);
                                } else {
                                    r0 = null;
                                }
                                A1G.put(str, A00(r0, Bod, map2));
                            }
                        }
                    }
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Field not supported: ");
                String str2 = r9.A00;
                C36321k7.A1Z(A0u, str2);
                A1G.put(str2, (Object) null);
            }
        }
        return A1G;
    }

    public Object A00(AnonymousClass6KU r4, Object obj, Map map) {
        AnonymousClass6KU[] r0;
        C159667jj r02;
        C159667jj r03;
        String str;
        String str2;
        if (r4 == null || (r0 = r4.A02) == null || r0.length == 0) {
            return obj;
        }
        if (obj instanceof C207249un) {
            r03 = this.A07;
        } else if (obj instanceof C207119ua) {
            r03 = this.A08;
        } else if (obj instanceof AnonymousClass1EY) {
            r03 = this.A05;
        } else {
            if (obj instanceof C175898bF) {
                Map map2 = this.A0B;
                C202159l8 A022 = this.A01.A02();
                if (A022 != null) {
                    str2 = A022.A03;
                } else {
                    str2 = null;
                }
                r02 = (C159667jj) map2.get(str2);
                if (r02 == null) {
                    Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject PaymentMethodCountryData country not supported");
                    return null;
                }
            } else if (obj instanceof AnonymousClass141) {
                r03 = this.A02;
            } else if (obj instanceof AnonymousClass2bZ) {
                r03 = this.A04;
            } else if (obj instanceof C175728ax) {
                Map map3 = this.A09;
                C202159l8 A023 = this.A01.A02();
                if (A023 != null) {
                    str = A023.A03;
                } else {
                    str = null;
                }
                r02 = (C159667jj) map3.get(str);
                if (r02 == null) {
                    Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject PaymentContactInfoCountryData country not supported");
                    return null;
                }
            } else if (obj instanceof AnonymousClass6JQ) {
                if (obj instanceof AnonymousClass5Ft) {
                    r02 = (C159667jj) this.A0A.get("IN");
                    if (r02 == null) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        AnonymousClass000.A1C(this, A0u);
                        C36321k7.A1Z(A0u, "/resolveObject Country Specific Device resolver does not exists");
                        return AnonymousClass0AJ.A00;
                    }
                } else if (obj instanceof C105715Fu) {
                    r02 = (C159667jj) this.A0A.get("BR");
                    if (r02 == null) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        AnonymousClass000.A1C(this, A0u2);
                        C36321k7.A1Z(A0u2, "/resolveObject Brazil Specific Device resolver does not exists");
                        return AnonymousClass0AJ.A00;
                    }
                } else {
                    r03 = this.A03;
                }
            } else if (obj instanceof C121805tk) {
                r03 = this.A06;
            } else {
                Log.e("PaymentClientDaslQueryResolverRegistry/resolveObject Object type not supported");
                return null;
            }
            return A01(r4, r02, obj, map);
        }
        return A01(r4, r03, obj, map);
    }

    public AnonymousClass6OV(AnonymousClass16D r23, AnonymousClass171 r24, C27761Ps r25, C19630wG r26, C20830yE r27, C18820ts r28, AnonymousClass1FF r29, C20810yC r30, C21010yW r31, C24601Db r32, C24631De r33, AnonymousClass1EU r34, AnonymousClass6PS r35, C199849g7 r36, C29131Vl r37, C21440zF r38, Map map, Map map2, Map map3) {
        C19630wG r6 = r26;
        AnonymousClass16D r10 = r23;
        C20810yC r20 = r30;
        C21010yW r19 = r31;
        AnonymousClass171 r7 = r24;
        C36321k7.A1B(r20, r6, r19, r10, r7);
        C29131Vl r2 = r37;
        AnonymousClass1EU r4 = r34;
        C18820ts r8 = r28;
        AnonymousClass1FF r12 = r29;
        C24601Db r5 = r32;
        C36321k7.A1C(r8, r2, r4, r5, r12);
        C20830yE r21 = r27;
        AnonymousClass00C.A0D(r21, 11);
        AnonymousClass6PS r13 = r35;
        C24631De r11 = r33;
        C21440zF r18 = r38;
        C199849g7 r3 = r36;
        C27761Ps r9 = r25;
        C36321k7.A1D(r3, r13, r18, r11, r9);
        Map map4 = map2;
        Map map5 = map;
        C36361kB.A1M(map5, map4);
        Map map6 = map3;
        AnonymousClass00C.A0D(map6, 19);
        this.A01 = r11;
        this.A0B = map5;
        this.A09 = map4;
        this.A0A = map6;
        this.A00 = new C21327AHf(r10, r12, r4, r13, r2);
        this.A07 = new C21326AHe(r6, r5, r11, r3);
        this.A08 = new C147656xZ(r8);
        this.A02 = new C147676xb(r7, r9, r6, r4);
        this.A04 = new C21323AHb();
        C20830yE r72 = r21;
        this.A03 = new C147686xc(r72, r20, r19, r4, r18);
        this.A06 = new C147646xY();
        this.A05 = new C147666xa(r5, r4);
    }

    public AnonymousClass6OV() {
    }
}
