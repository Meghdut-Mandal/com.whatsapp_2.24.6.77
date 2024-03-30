package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6To  reason: invalid class name and case insensitive filesystem */
public final class C132426To {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public AnonymousClass6QG A04;
    public Set A05 = C36441kJ.A17();
    public AnonymousClass011 A06;
    public final C001700s A07 = C36431kI.A0S();
    public final C139266jV A08;
    public final C1255860l A09;
    public final C123195w6 A0A;
    public final C133196Xe A0B;
    public final C91204bd A0C;
    public final List A0D = AnonymousClass001.A0I();
    public final List A0E = AnonymousClass001.A0I();

    public C132426To(C139266jV r4, C1255860l r5, C123195w6 r6) {
        AnonymousClass00C.A0D(r4, 1);
        this.A08 = r4;
        this.A0A = r6;
        this.A09 = r5;
        this.A0B = new C133196Xe(r4);
        Context context = r4.A0O;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact);
        AnonymousClass00C.A08(decodeResource);
        this.A02 = decodeResource;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_business_cat);
        AnonymousClass00C.A08(decodeResource2);
        this.A03 = decodeResource2;
        this.A0C = new C91204bd(context);
        r4.A0V.add(new C163477qG(this, 1));
    }

    public static final void A00(C134996bx r29, C132426To r30) {
        Number A0z;
        C132426To r7 = r30;
        r7.A01 = 0;
        r7.A00 = 0;
        C139266jV r6 = r7.A08;
        AnonymousClass6WY r28 = r6.A0R;
        C135076c5 r8 = r28.A06().A04;
        C133196Xe r5 = r7.A0B;
        C132526Ud r4 = r5.A03;
        C130866Ms A082 = r5.A08(r8, 60);
        HashSet A16 = C36441kJ.A16();
        C124355y2 r3 = r4.A00;
        C132526Ud.A00(r3, r4, A082, A16);
        Iterator it = A16.iterator();
        while (it.hasNext()) {
            C144426sA r9 = (C144426sA) ((AnonymousClass72U) it.next()).A03;
            float f = r9.A06;
            float f2 = r29.A02;
            if (f > f2 && r9.A05 > f2) {
                Map map = r5.A05;
                C139206jP r1 = (C139206jP) map.get(r9);
                if (r1 != null) {
                    r6.A0C(r1);
                    r7.A0D.add(r1);
                    r5.A06.remove(r9);
                    map.remove(r9);
                }
                it.remove();
            }
        }
        ArrayList A0q = C36361kB.A0q(C163907qx.A00(C007103b.A0Y(A16), 9));
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AnonymousClass7eK r12 = ((AnonymousClass72U) it2.next()).A03;
            C144426sA r11 = (C144426sA) r12;
            Set set = r5.A06;
            if (set.size() < 5) {
                if (C134996bx.A00(r5.A02) >= r11.A06) {
                    Iterator it3 = set.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            set.add(r11);
                            break;
                        }
                        C144426sA r13 = (C144426sA) it3.next();
                        if (!r13.equals(r11)) {
                            double A072 = r5.A07(r5.A00);
                            if (C133196Xe.A05(C133196Xe.A02(r13, r5, A072), C133196Xe.A02(r11, r5, A072))) {
                                break;
                            }
                        }
                    }
                } else {
                    set.remove(r11);
                }
            }
            r11.A0A = set.contains(r12);
        }
        Set<C144426sA> set2 = r5.A06;
        for (C144426sA r0 : set2) {
            double[] A062 = C133196Xe.A06(r0.BG3(), r5);
            Context context = r5.A01;
            float A002 = r0.A00(context);
            AnonymousClass00C.A0D(context, 0);
            float f3 = r0.A07;
            if (f3 == -1.0f) {
                f3 = C90524aI.A01(context, 4.0f);
                r0.A07 = f3;
            }
            float f4 = r0.A02;
            if (f4 == -1.0f) {
                f4 = C90524aI.A01(context, 120.0f);
                r0.A02 = f4;
            }
            float A012 = r0.A03 + r0.A00 + C90524aI.A01(context, 3.0f);
            float A013 = C90524aI.A01(context, 20.0f);
            float f5 = A013 / 2.0f;
            double A073 = r5.A07((f3 * 2.0f) + f5 + A002 + f4 + A013);
            double A074 = r5.A07(f5 + A012);
            double d = A062[0];
            double d2 = A062[1];
            C130866Ms r18 = new C130866Ms(d - A073, d2 - A074, A073 + d, A074 + d2);
            HashSet A162 = C36441kJ.A16();
            C132526Ud.A00(r3, r4, r18, A162);
            C130866Ms A014 = C133196Xe.A01(r0, r5);
            HashSet A032 = C133196Xe.A03(C133196Xe.A00(r0, r5), r0, r5, A162);
            HashSet A033 = C133196Xe.A03(A014, r0, r5, A162);
            int size = A032.size();
            int size2 = A033.size();
            int i = 1;
            int i2 = r0.A08;
            if (size2 == 0 || size == 0) {
                if ((i2 == -1 && size2 == 0) || (size != 0 && i2 == 1)) {
                    i = 2;
                } else if (!(i2 == -1 && size == 0) && (size2 == 0 || i2 != 2)) {
                    i = i2;
                }
            } else if (i2 == -1) {
                if (size >= size2) {
                    C133196Xe.A04(A0q, A033);
                    r0.A08 = 2;
                } else {
                    C133196Xe.A04(A0q, A032);
                }
            } else if (i2 == 1) {
                C133196Xe.A04(A0q, A032);
            } else {
                C133196Xe.A04(A0q, A033);
            }
            r0.A08 = i;
        }
        ArrayList A0J = C36321k7.A0J(A0q);
        Iterator it4 = A0q.iterator();
        while (it4.hasNext()) {
            A0J.add(((AnonymousClass72U) it4.next()).A03);
        }
        Set A0e = C007103b.A0e(A0J);
        r7.A05 = A0e;
        AnonymousClass011 r02 = r7.A06;
        if (r02 != null) {
            A0e.add(r02.first);
        }
        Set set3 = r7.A05;
        Map map2 = r5.A05;
        AnonymousClass00C.A08(map2);
        Iterator A0y = AnonymousClass000.A0y(map2);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            if (!set3.contains(A11.getKey())) {
                r6.A0C((C139206jP) A11.getValue());
                List list = r7.A0D;
                Object value = A11.getValue();
                AnonymousClass00C.A08(value);
                list.add(value);
                set2.remove(A11.getKey());
                A0y.remove();
            }
        }
        for (C144426sA r42 : r7.A05) {
            char c = 1;
            if (r29.A02 >= r42.A06) {
                r7.A01(r42, 1);
            } else {
                r7.A01(r42, 2);
                c = 2;
            }
            boolean A022 = r8.A02(r42.BG3());
            if (c == 1) {
                if (A022) {
                    r7.A01++;
                }
            } else if (A022) {
                r7.A00++;
            }
        }
        AnonymousClass6QG r14 = r7.A04;
        if (r14 != null) {
            C135076c5 r2 = r28.A06().A04;
            C134976bv A003 = r2.A00();
            Double d3 = r14.A03;
            C18740tg.A06(d3);
            AnonymousClass00C.A08(d3);
            double doubleValue = d3.doubleValue();
            Double d4 = r14.A04;
            C18740tg.A06(d4);
            AnonymousClass00C.A08(d4);
            if (C131836Qv.A00(A003, C134976bv.A00(doubleValue, d4.doubleValue())) > 3000.0f || ((A0z = C36441kJ.A0z(r7.A07)) != null && A0z.intValue() == 3)) {
                for (C144426sA BG3 : r7.A05) {
                    if (r2.A02(BG3.BG3())) {
                        C001700s r22 = r7.A07;
                        Number A0z2 = C36441kJ.A0z(r22);
                        if (A0z2 != null && A0z2.intValue() == 3) {
                            C36341k9.A16(r22, 0);
                            return;
                        }
                        return;
                    }
                }
                C36341k9.A16(r7.A07, 3);
            }
        }
    }

    private final void A01(C144426sA r15, int i) {
        C144426sA r12 = r15;
        if (!r15.A09) {
            Map map = this.A0B.A05;
            C97674q5 r6 = (C97674q5) map.get(r15);
            if (r6 == null) {
                List list = this.A0D;
                if (C36401kF.A1a(list)) {
                    r6 = (C97674q5) list.remove(0);
                    r6.A02 = r15;
                    r6.A01 = null;
                    r6.A09(3);
                    C144406s8 r3 = r6.A02.A0B;
                    r6.A00 = AnonymousClass6WY.A01(r3.A07);
                    r6.A01 = AnonymousClass6WY.A00(r3.A06);
                    r6.A07();
                    C91194bc r32 = r6.A0C;
                    r32.A0I = false;
                    r32.A0B = -1;
                    r32.A0C = -1;
                    r32.A0E = null;
                    C97674q5.A00(r6);
                    String str = r15.A0B.A09.A02;
                    if (str != null) {
                        r32.A08 = Color.parseColor(str);
                    }
                    map.put(r15, r6);
                    this.A08.A0B(r6);
                } else {
                    C139266jV r9 = this.A08;
                    r6 = new C97674q5(this.A02, this.A03, r9, this.A09, this.A0A, r12, this.A0C);
                    map.put(r15, r6);
                    r9.A0B(r6);
                }
            }
            r6.A09(i);
            boolean z = r15.A0A;
            C91194bc r1 = r6.A0C;
            r1.A0I = z;
            r1.A0A = r15.A08;
            r6.A07();
        }
    }

    public final void A02() {
        this.A06 = null;
        this.A0E.clear();
        C133196Xe r4 = this.A0B;
        C124355y2 r1 = r4.A03.A00;
        r1.A07.clear();
        r1.A04 = true;
        r1.A01 = null;
        r1.A00 = null;
        r1.A03 = null;
        r1.A02 = null;
        Map map = r4.A05;
        Iterator A0z = AnonymousClass000.A0z(map);
        while (A0z.hasNext()) {
            C139206jP r12 = (C139206jP) A0z.next();
            r12.A07.A0C(r12);
        }
        r4.A06.clear();
        map.clear();
        this.A0D.clear();
    }

    public final void A05(C144426sA r14, Integer num) {
        Object obj;
        C97674q5 r0;
        AnonymousClass00C.A0D(r14, 0);
        AnonymousClass011 r02 = this.A06;
        if (r02 != null) {
            obj = r02.first;
        } else {
            obj = null;
        }
        if (!AnonymousClass00C.A0J(obj, r14)) {
            AnonymousClass011 r03 = this.A06;
            if (!(r03 == null || (r0 = (C97674q5) r03.second) == null)) {
                r0.A08();
            }
            C133196Xe r3 = this.A0B;
            Map map = r3.A05;
            if (map.get(r14) == null) {
                if (C134996bx.A00(this.A08) >= r14.A06) {
                    A01(r14, 1);
                } else {
                    A01(r14, 2);
                }
            }
            C97674q5 r2 = (C97674q5) map.get(r14);
            if (r2 != null) {
                int i = 1;
                r2.A02.A09 = true;
                r2.A04 = true;
                Bitmap bitmap = r2.A01;
                if (bitmap == null) {
                    C91204bd r5 = r2.A03;
                    float A012 = C90524aI.A01(r5.A0A, 22.0f);
                    r5.A06 = null;
                    r5.A03 = A012;
                    r5.A02 = A012 + (0.083333f * A012);
                    r5.A00();
                    C97674q5.A01(r2);
                } else {
                    r2.A03.A01(bitmap);
                }
                if (r2.A00 == 2) {
                    i = 0;
                }
                float f = (float) i;
                if (r2.A02.A09) {
                    f = 2.0f;
                }
                C139266jV r04 = r2.A07;
                r04.A0C(r2);
                r2.A02 = f;
                r04.A0B(r2);
                r2.A03();
                this.A06 = C36441kJ.A19(r14, r2);
                if (num != null) {
                    int intValue = num.intValue();
                    C139266jV r10 = this.A08;
                    C130866Ms A082 = r3.A08(r10.A0R.A06().A04, 0);
                    double A072 = r3.A07((float) intValue);
                    double A073 = r3.A07(C90524aI.A01(r10.A0O, 120.0f));
                    double d = A082.A00 - A082.A03;
                    double d2 = (double) 2;
                    C144406s8 r05 = r2.A02.A0B;
                    double d3 = r05.A06;
                    double d4 = r05.A07;
                    C134976bv A002 = C134976bv.A00(AnonymousClass6WY.A02((AnonymousClass6WY.A00(C134976bv.A00(d3, d4).A00) - (((d - A072) / d2) + (A073 / d2))) + (d / d2)), C134976bv.A00(d3, d4).A01);
                    C1264964g r22 = new C1264964g();
                    r22.A06 = A002;
                    r10.A0A(r22, new C139216jQ(), 300);
                }
            }
        }
    }

    public final void A03() {
        C97674q5 r0;
        AnonymousClass011 r02 = this.A06;
        if (!(r02 == null || (r0 = (C97674q5) r02.second) == null)) {
            Bitmap bitmap = r0.A01;
            if (bitmap == null) {
                C97674q5.A01(r0);
            } else {
                r0.A03.A01(bitmap);
            }
        }
        C139266jV r1 = this.A08;
        A00(r1.A02(), this);
        r1.A0Q.invalidate();
    }

    public final void A04(AnonymousClass6QG r7, List list) {
        this.A04 = r7;
        this.A0E.addAll(list);
        C133196Xe r5 = this.A0B;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C132526Ud r2 = r5.A03;
            C132526Ud.A01(new AnonymousClass72U((C144426sA) it.next(), C1505375q.A00), r2.A00, r2);
        }
        C139266jV r1 = this.A08;
        A00(r1.A02(), this);
        r1.A0Q.invalidate();
    }

    public final void A06(List list) {
        LinkedHashSet A17 = C36441kJ.A17();
        A17.addAll(C007103b.A0a(C163907qx.A00(list, 8), 1));
        AnonymousClass6M7 r4 = AnonymousClass6M7.A00;
        C139266jV r3 = this.A08;
        ArrayList A0J = C36321k7.A0J(A17);
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            A0J.add(((C144426sA) it.next()).BG3());
        }
        r4.A00(r3, A0J, false);
    }
}
