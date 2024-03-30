package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1GM  reason: invalid class name */
public abstract class AnonymousClass1GM {
    public final AnonymousClass005 A00;
    public final Map A01 = new HashMap();

    public static synchronized boolean A00(AnonymousClass75K r2, AnonymousClass1GM r3, Object obj) {
        boolean z;
        synchronized (r3) {
            Map map = r3.A01;
            if (r2.equals(map.get(obj))) {
                map.remove(obj);
                ((ThreadPoolExecutor) r3.A00.get()).remove(r2);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public synchronized Runnable A02(Object obj) {
        return A04(obj, (Object) null);
    }

    public synchronized Runnable A03(Object obj) {
        Runnable runnable;
        AnonymousClass75K r0 = (AnonymousClass75K) this.A01.get(obj);
        if (r0 != null) {
            runnable = r0.A00;
        } else {
            runnable = null;
        }
        return runnable;
    }

    public synchronized Runnable A04(Object obj, Object obj2) {
        AnonymousClass75K r1;
        Map map = this.A01;
        r1 = (AnonymousClass75K) map.get(obj);
        if (r1 == null) {
            r1 = new AnonymousClass75K(this, obj, obj2, A09(obj, obj2));
            map.put(obj, r1);
            ((ThreadPoolExecutor) this.A00.get()).execute(r1);
        }
        return r1.A00;
    }

    public synchronized HashSet A05() {
        return new HashSet(this.A01.keySet());
    }

    public synchronized void A07(Runnable runnable) {
        Iterator it = A05().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (runnable.equals(A03(next))) {
                A08(next);
                break;
            }
        }
    }

    public synchronized boolean A08(Object obj) {
        boolean z;
        Map map = this.A01;
        AnonymousClass75K r1 = (AnonymousClass75K) map.get(obj);
        if (r1 != null) {
            r1.cancel();
            ((ThreadPoolExecutor) this.A00.get()).remove(r1);
            map.remove(obj);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public Runnable A09(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this instanceof AnonymousClass1GN) {
            AnonymousClass1GN r3 = (AnonymousClass1GN) this;
            C131516Pj r14 = (C131516Pj) obj4;
            C18740tg.A06(r14);
            int A002 = r14.A00();
            if (A002 != 2) {
                AnonymousClass1D5 r0 = r3.A00;
                if (A002 != 4) {
                    boolean booleanValue = r0.A05().booleanValue();
                    C19630wG r23 = r0.A07;
                    C19970wo r22 = r0.A06;
                    C20810yC r26 = r0.A0A;
                    AnonymousClass17Y r43 = r0.A02;
                    C19700wN r1 = r0.A00;
                    if (booleanValue) {
                        C19700wN r42 = r1;
                        C19770wU r20 = r0.A0O;
                        C20690y0 r19 = r0.A01;
                        C20050ww r18 = r0.A05;
                        AnonymousClass1D7 r17 = r0.A0P;
                        AnonymousClass1BS r15 = r0.A0N;
                        AnonymousClass1D8 r13 = r0.A0E;
                        AnonymousClass1D4 r12 = r0.A0G;
                        AnonymousClass1D9 r11 = r0.A0K;
                        AnonymousClass1DF r10 = r0.A08;
                        AnonymousClass1GD r9 = r0.A0L;
                        AnonymousClass1GF r8 = r0.A09;
                        AnonymousClass1E1 r7 = r0.A0I;
                        AnonymousClass1GH r6 = r0.A0F;
                        AnonymousClass1BU r5 = r0.A0D;
                        AnonymousClass1GE r4 = r0.A0B;
                        AnonymousClass1BV r32 = r0.A0C;
                        C19890wg r2 = r0.A0M;
                        AnonymousClass1GI r16 = r0.A0J;
                        C19770wU r40 = r20;
                        AnonymousClass1D7 r41 = r17;
                        C20050ww r21 = r18;
                        AnonymousClass1DF r24 = r10;
                        AnonymousClass1GF r25 = r8;
                        AnonymousClass1GE r27 = r4;
                        AnonymousClass1BV r28 = r32;
                        AnonymousClass1BU r29 = r5;
                        AnonymousClass1D8 r30 = r13;
                        AnonymousClass1GH r31 = r6;
                        return new AnonymousClass5C4(r42, r19, r43, r0.A04, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r12, r7, r14, r16, r11, r9, r2, r15, r40, r41);
                    }
                    C19700wN r202 = r1;
                    C19770wU r192 = r0.A0O;
                    C20690y0 r182 = r0.A01;
                    C20050ww r172 = r0.A05;
                    AnonymousClass1BS r152 = r0.A0N;
                    AnonymousClass1D8 r132 = r0.A0E;
                    AnonymousClass1D4 r122 = r0.A0G;
                    AnonymousClass1D9 r112 = r0.A0K;
                    AnonymousClass1DF r102 = r0.A08;
                    AnonymousClass1GD r92 = r0.A0L;
                    AnonymousClass1GF r82 = r0.A09;
                    AnonymousClass1E1 r72 = r0.A0I;
                    AnonymousClass1GH r62 = r0.A0F;
                    AnonymousClass1BU r52 = r0.A0D;
                    AnonymousClass1GE r44 = r0.A0B;
                    AnonymousClass1BV r33 = r0.A0C;
                    C19890wg r210 = r0.A0M;
                    AnonymousClass1GI r110 = r0.A0J;
                    C19770wU r402 = r192;
                    C20050ww r212 = r172;
                    AnonymousClass1DF r242 = r102;
                    AnonymousClass1GF r252 = r82;
                    AnonymousClass1GE r272 = r44;
                    AnonymousClass1BV r282 = r33;
                    AnonymousClass1BU r292 = r52;
                    AnonymousClass1D8 r302 = r132;
                    AnonymousClass1GH r312 = r62;
                    return new C101314xL(r202, r182, r43, r0.A04, r212, r22, r23, r242, r252, r26, r272, r282, r292, r302, r312, r122, r72, r14, r110, r112, r92, r210, r152, r402);
                }
                C19630wG r232 = r0.A07;
                C19970wo r222 = r0.A06;
                C20810yC r262 = r0.A0A;
                AnonymousClass17Y r412 = r0.A02;
                C19700wN r203 = r0.A00;
                C19770wU r193 = r0.A0O;
                C20690y0 r183 = r0.A01;
                C20050ww r173 = r0.A05;
                AnonymousClass1BS r153 = r0.A0N;
                AnonymousClass1D8 r133 = r0.A0E;
                AnonymousClass1D4 r123 = r0.A0G;
                AnonymousClass1D9 r113 = r0.A0K;
                AnonymousClass1DF r103 = r0.A08;
                AnonymousClass1GD r93 = r0.A0L;
                AnonymousClass1GF r83 = r0.A09;
                AnonymousClass1E1 r73 = r0.A0I;
                AnonymousClass1GH r63 = r0.A0F;
                AnonymousClass1BU r53 = r0.A0D;
                AnonymousClass1GE r45 = r0.A0B;
                AnonymousClass1BV r34 = r0.A0C;
                C19890wg r211 = r0.A0M;
                AnonymousClass1GI r111 = r0.A0J;
                C19770wU r403 = r193;
                C20050ww r213 = r173;
                AnonymousClass1DF r243 = r103;
                AnonymousClass1GF r253 = r83;
                AnonymousClass1GE r273 = r45;
                AnonymousClass1BV r283 = r34;
                AnonymousClass1BU r293 = r53;
                AnonymousClass1D8 r303 = r133;
                AnonymousClass1GH r313 = r63;
                return new AnonymousClass5C3(r203, r183, r412, r0.A04, r213, r222, r232, r243, r253, r262, r273, r283, r293, r303, r313, r123, r73, r14, r111, r113, r93, r211, r153, r403);
            }
            AnonymousClass1D5 r02 = r3.A00;
            C19630wG r233 = r02.A07;
            C19970wo r223 = r02.A06;
            C20810yC r263 = r02.A0A;
            AnonymousClass17Y r413 = r02.A02;
            C19700wN r204 = r02.A00;
            C19770wU r194 = r02.A0O;
            C20690y0 r184 = r02.A01;
            C20050ww r174 = r02.A05;
            AnonymousClass1BS r154 = r02.A0N;
            AnonymousClass1D8 r134 = r02.A0E;
            AnonymousClass1D4 r124 = r02.A0G;
            AnonymousClass1D9 r114 = r02.A0K;
            AnonymousClass1DF r104 = r02.A08;
            AnonymousClass1GD r94 = r02.A0L;
            AnonymousClass1GF r84 = r02.A09;
            AnonymousClass1E1 r74 = r02.A0I;
            AnonymousClass1GH r64 = r02.A0F;
            AnonymousClass1BU r54 = r02.A0D;
            AnonymousClass1GE r46 = r02.A0B;
            AnonymousClass1BV r35 = r02.A0C;
            C19890wg r214 = r02.A0M;
            AnonymousClass1GI r115 = r02.A0J;
            C19770wU r404 = r194;
            C20050ww r215 = r174;
            AnonymousClass1DF r244 = r104;
            AnonymousClass1GF r254 = r84;
            AnonymousClass1GE r274 = r46;
            AnonymousClass1BV r284 = r35;
            AnonymousClass1BU r294 = r54;
            AnonymousClass1D8 r304 = r134;
            AnonymousClass1GH r314 = r64;
            return new AnonymousClass5C5(r204, r184, r413, r02.A04, r215, r223, r233, r244, r254, r263, r274, r284, r294, r304, r314, r124, r74, (AnonymousClass5BQ) r14, r115, r114, r94, r214, r154, r404);
        } else if (this instanceof C29651Xl) {
            AnonymousClass3T1 r47 = (AnonymousClass3T1) obj3;
            C101344xO r142 = (C101344xO) obj4;
            AnonymousClass00C.A0D(r47, 0);
            if (r142 != null) {
                return r142;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(new C019308f(getClass()).BHa());
            sb.append("/makeRunnable: mediaDownload of message ");
            sb.append(r47.A1J);
            sb.append(" is null");
            throw new NullPointerException(sb.toString());
        } else if ((this instanceof AnonymousClass1TP) || (this instanceof C29961Yr)) {
            return (C101344xO) obj4;
        } else {
            if (this instanceof C25451Gj) {
                C121645tU r143 = (C121645tU) obj4;
                C25431Gh r03 = ((C25451Gj) this).A00;
                C18740tg.A06(r143);
                AnonymousClass00C.A08(r143);
                C18800tq r116 = r03.A00.A00;
                return new AnonymousClass75G((C19700wN) r116.A2U.get(), (AnonymousClass1AV) r116.A9R.get(), (C19630wG) r116.A91.get(), r143);
            }
            Runnable runnable = (Runnable) obj4;
            C18740tg.A06(runnable);
            return runnable;
        }
    }

    public AnonymousClass1GM(AnonymousClass005 r2) {
        this.A00 = r2;
    }

    public void A06(C25711Hj r3) {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            r3.accept(it.next());
        }
    }
}
