package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.9lo  reason: invalid class name and case insensitive filesystem */
public abstract class C202429lo {
    public static ConcurrentHashMap A00 = C90524aI.A0s();

    public static void A00(Class cls) {
        Class<Object> cls2;
        String concat;
        int i;
        Method method;
        C203189nU r26;
        Method method2;
        int i2;
        Method method3;
        Class cls3 = cls;
        A00.get(cls3);
        Class cls4 = cls3;
        HashMap A0J = AnonymousClass001.A0J();
        while (true) {
            cls2 = Object.class;
            if (cls4 == cls2) {
                break;
            }
            for (Field field : cls4.getDeclaredFields()) {
                String name = field.getName();
                if (!A0J.containsKey(name)) {
                    C198099cu r1 = new C198099cu(cls4, field);
                    if (r1.A02 != null || r1.A03 != null || r1.A04 != null) {
                        A0J.put(name, r1);
                    }
                }
            }
            cls4 = cls4.getSuperclass();
        }
        C198099cu[] r9 = (C198099cu[]) A0J.values().toArray(new C198099cu[A0J.size()]);
        String name2 = cls3.getName();
        if (name2.startsWith("java.util.")) {
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1D("net.minidev.asm.", name2, "AccAccess", A0u);
            concat = A0u.toString();
        } else {
            concat = name2.concat("AccAccess");
        }
        AnonymousClass5RO r8 = new AnonymousClass5RO(cls3.getClassLoader());
        Class<?> cls5 = null;
        try {
            cls5 = r8.loadClass(concat);
        } catch (ClassNotFoundException unused) {
        }
        Class cls6 = cls3;
        LinkedList A0l = C90524aI.A0l();
        while (!cls6.equals(cls2)) {
            A0l.addLast(cls6);
            for (Class addLast : cls6.getInterfaces()) {
                A0l.addLast(addLast);
            }
            cls6 = cls6.getSuperclass();
            if (cls6 == null) {
                break;
            }
        }
        A0l.addLast(cls2);
        if (cls5 == null) {
            C202879mp r4 = new C202879mp(cls3, r8, r9);
            Iterator it = A0l.iterator();
            while (it.hasNext()) {
                Iterable<Class> iterable = (Iterable) C196979as.A01.get(it.next());
                if (iterable != null) {
                    for (Class cls7 : iterable) {
                        if (cls7 != null) {
                            for (Method method4 : cls7.getMethods()) {
                                if ((method4.getModifiers() & 8) != 0) {
                                    Class[] parameterTypes = method4.getParameterTypes();
                                    if (parameterTypes.length == 1 && parameterTypes[0].equals(cls2)) {
                                        Class<?> returnType = method4.getReturnType();
                                        if (!returnType.equals(Void.TYPE)) {
                                            r4.A04.put(returnType, method4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i3 = 1;
            AnonymousClass9Xc r14 = new AnonymousClass9Xc();
            C198099cu[] r13 = r4.A06;
            int i4 = 0;
            boolean A1T = C90474aD.A1T(r7, 10);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Lnet/minidev/asm/BeansAccess<L");
            String str = r4.A03;
            A0u2.append(str);
            String A0q = AnonymousClass000.A0q(";>;", A0u2);
            String str2 = r4.A01;
            String str3 = C202879mp.A07;
            r14.A0D = 50;
            r14.A00 = 33;
            C203329nn r6 = r14.A0V;
            r6.A03 = 50;
            r6.A05 = str2;
            r14.A0C = C203329nn.A03(str2, r6, 7).A02;
            if (A0q != null) {
                r14.A09 = r6.A08(A0q);
            }
            if (str3 == null) {
                i = 0;
            } else {
                i = C203329nn.A03(str3, r6, 7).A02;
            }
            r14.A0B = i;
            C203189nU A01 = r14.A01("<init>", "()V", (String) null, (String[]) null, 1);
            A01.A0B(25, 0);
            int i5 = 0;
            A01.A0F(str3, "<init>", "()V", 183, false);
            A01.A07(177);
            A01.A0A(1, 1);
            AnonymousClass9Xc r22 = r14;
            C203189nU A012 = r22.A01("set", "(Ljava/lang/Object;ILjava/lang/Object;)V", (String) null, (String[]) null, 1);
            if (r7 != 0) {
                if (r7 > 14) {
                    A012.A0B(21, 2);
                    C201489jh[] A02 = A02(r7);
                    C201489jh r92 = new C201489jh();
                    A012.A0I(r92, A02, 0, A02.length - 1);
                    int i6 = 0;
                    int i7 = 0;
                    do {
                        C198099cu r3 = r13[i6];
                        int i8 = i7 + 1;
                        A012.A0G(A02[i7]);
                        if (r3.A02 == null && r3.A03 == null) {
                            A012.A07(177);
                        } else {
                            C202879mp.A00(r3, r4, A012);
                        }
                        i6++;
                        i7 = i8;
                    } while (i6 < r7);
                    A012.A0G(r92);
                } else {
                    C201489jh[] A022 = A02(r7);
                    int i9 = 0;
                    int i10 = 0;
                    do {
                        C198099cu r82 = r13[i9];
                        C202879mp.A03(A022[i10], A012, i10);
                        C202879mp.A00(r82, r4, A012);
                        A012.A0G(A022[i10]);
                        A012.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                        i10++;
                        i9++;
                    } while (i9 < r7);
                }
            }
            C202879mp.A01(r4, A012);
            A012.A0A(0, 0);
            C203189nU A013 = r14.A01("get", "(Ljava/lang/Object;I)Ljava/lang/Object;", (String) null, (String[]) null, 1);
            int i11 = 192;
            if (r7 == 0) {
                A013.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
            } else if (r7 > 14) {
                A013.A0B(21, 2);
                C201489jh[] A023 = A02(r7);
                C201489jh r93 = new C201489jh();
                A013.A0I(r93, A023, 0, A023.length - 1);
                int i12 = 0;
                do {
                    C198099cu r5 = r13[i4];
                    i5++;
                    A013.A0G(A023[i12]);
                    r26 = A013;
                    r26.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    if (r5.A02 == null && r5.A03 == null) {
                        A013.A07(i3);
                    } else {
                        A013.A0B(25, i3);
                        A013.A0C(i11, str);
                        C203309nl A03 = C203309nl.A03(r5.A00);
                        if ((r5.A04 == null && r5.A03 == null) || (method2 = r5.A03) == null) {
                            A013.A0D(180, str, r5.A01, A03.A06());
                        } else {
                            A013.A0F(str, method2.getName(), C203309nl.A02(method2), 182, false);
                        }
                        A01(A013, A03);
                    }
                    A013.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    i4++;
                    i12 = i5;
                    i11 = 192;
                    i3 = 1;
                } while (i4 < r7);
                A013.A0G(r93);
                r26.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
            } else {
                C201489jh[] A024 = A02(r7);
                int i13 = 0;
                do {
                    C198099cu r62 = r13[i4];
                    C202879mp.A03(A024[i13], A013, i13);
                    A013.A0B(25, 1);
                    A013.A0C(192, str);
                    C203309nl A032 = C203309nl.A03(r62.A00);
                    if ((r62.A04 == null && r62.A03 == null) || (method = r62.A03) == null) {
                        A013.A0D(180, str, r62.A01, A032.A06());
                    } else {
                        A013.A0F(str, method.getName(), C203309nl.A02(method), 182, false);
                    }
                    A01(A013, A032);
                    A013.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    A013.A0G(A024[i13]);
                    A013.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    i13++;
                    i4++;
                } while (i4 < r7);
            }
            C202879mp.A01(r4, A013);
            A013.A0A(0, 0);
            int i14 = 153;
            if (!A1T) {
                i2 = MediaCodecVideoEncoder.MIN_ENCODER_WIDTH;
                C203189nU A014 = r14.A01("set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", (String) null, (String[]) null, 1);
                C201489jh[] A025 = A02(r7);
                int i15 = 0;
                for (C198099cu r32 : r13) {
                    A014.A0B(25, 2);
                    A014.A0E(r32.A01);
                    C203189nU r262 = A014;
                    r262.A0F("java/lang/String", "equals", "(Ljava/lang/Object;)Z", 182, false);
                    A014.A0H(A025[i15], 153);
                    C202879mp.A00(r32, r4, A014);
                    A014.A0G(A025[i15]);
                    r262.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    i15++;
                }
                C202879mp.A02(r4, A014);
                int i16 = 0;
                A014.A0A(0, 0);
                C203189nU A015 = r22.A01("get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", (String) null, (String[]) null, 1);
                C201489jh[] A026 = A02(r7);
                int i17 = 0;
                while (i16 < r7) {
                    C198099cu r52 = r13[i16];
                    A015.A0B(25, 2);
                    String str4 = r52.A01;
                    A015.A0E(str4);
                    C203189nU r222 = A015;
                    r222.A0F("java/lang/String", "equals", "(Ljava/lang/Object;)Z", 182, false);
                    A015.A0H(A026[i17], i14);
                    A015.A0B(25, 1);
                    A015.A0C(192, str);
                    C203309nl A033 = C203309nl.A03(r52.A00);
                    if ((r52.A04 == null && r52.A03 == null) || (method3 = r52.A03) == null) {
                        A015.A0D(180, str, str4, A033.A06());
                    } else {
                        r222.A0F(str, method3.getName(), C203309nl.A02(method3), 182, false);
                    }
                    A01(A015, A033);
                    A015.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    A015.A0G(A026[i17]);
                    r222.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    i17++;
                    i16++;
                    i14 = 153;
                }
                C202879mp.A02(r4, A015);
                A015.A0A(0, 0);
            } else {
                i2 = MediaCodecVideoEncoder.MIN_ENCODER_WIDTH;
            }
            C203189nU A016 = r14.A01("newInstance", "()Ljava/lang/Object;", (String) null, (String[]) null, 1);
            A016.A0C(187, str);
            A016.A07(89);
            A016.A0F(str, "<init>", "()V", 183, false);
            A016.A07(i2);
            A016.A0A(2, 1);
            cls5 = r4.A05.A00(r4.A00, r14.A02());
        }
        try {
            cls5.newInstance();
            throw AnonymousClass001.A0A("setAccessor");
        } catch (Exception e) {
            throw C90524aI.A0e(AnonymousClass000.A0p("Error constructing accessor class: ", concat, AnonymousClass000.A0u()), e);
        }
    }

    public static void A01(C203189nU r6, C203309nl r7) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        int i2 = r7.A00;
        if (i2 != 12) {
            switch (i2) {
                case 1:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Boolean";
                    str2 = "valueOf";
                    str = "(Z)Ljava/lang/Boolean;";
                    break;
                case 2:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Character";
                    str2 = "valueOf";
                    str = "(C)Ljava/lang/Character;";
                    break;
                case 3:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Byte";
                    str2 = "valueOf";
                    str = "(B)Ljava/lang/Byte;";
                    break;
                case 4:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Short";
                    str2 = "valueOf";
                    str = "(S)Ljava/lang/Short;";
                    break;
                case 5:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Integer";
                    str2 = "valueOf";
                    str = "(I)Ljava/lang/Integer;";
                    break;
                case 6:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Float";
                    str2 = "valueOf";
                    str = "(F)Ljava/lang/Float;";
                    break;
                case 7:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Long";
                    str2 = "valueOf";
                    str = "(J)Ljava/lang/Long;";
                    break;
                case 8:
                    i = 184;
                    z = false;
                    str3 = "java/lang/Double";
                    str2 = "valueOf";
                    str = "(D)Ljava/lang/Double;";
                    break;
                default:
                    return;
            }
            r6.A0F(str3, str2, str, i, z);
        }
    }

    public static C201489jh[] A02(int i) {
        C201489jh[] r2 = new C201489jh[i];
        for (int i2 = 0; i2 < i; i2++) {
            r2[i2] = new C201489jh();
        }
        return r2;
    }

    public C202429lo() {
        throw null;
    }
}
