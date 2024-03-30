package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.9mp  reason: invalid class name and case insensitive filesystem */
public class C202879mp {
    public static String A07 = C202429lo.class.getName().replace('.', '/');
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final HashMap A04 = AnonymousClass001.A0J();
    public final AnonymousClass5RO A05;
    public final C198099cu[] A06;

    public static void A03(C201489jh r5, C203189nU r6, int i) {
        r6.A0B(21, 2);
        if (i == 0) {
            r6.A0H(r5, 154);
            return;
        }
        if (i == 1) {
            r6.A07(4);
        } else if (i == 2) {
            r6.A07(5);
        } else {
            int i2 = 6;
            if (i != 3) {
                if (i == 4) {
                    i2 = 7;
                } else if (i == 5) {
                    i2 = 8;
                } else if (i >= 6) {
                    r6.A09(16, i);
                } else {
                    throw C90514aH.A0s("non supported negative values");
                }
            }
            r6.A07(i2);
        }
        r6.A0H(r5, 160);
    }

    public static void A00(C198099cu r15, C202879mp r16, C203189nU r17) {
        C201489jh r5;
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        C203189nU r12 = r17;
        r12.A0B(25, 1);
        C202879mp r52 = r16;
        String str4 = r52.A03;
        r12.A0C(192, str4);
        r12.A0B(25, 3);
        C198099cu r7 = r15;
        Class cls = r15.A00;
        C203309nl A032 = C203309nl.A03(cls);
        String replace = cls.getName().replace('.', '/');
        Method method = (Method) r52.A04.get(cls);
        if (method != null) {
            r12.A0F(method.getDeclaringClass().getName().replace('.', '/'), method.getName(), C203309nl.A02(method), 184, false);
        } else {
            if (cls.isEnum()) {
                r5 = new C201489jh();
                r12.A0H(r5, 198);
                r12.A0B(25, 3);
                z = false;
                r12.A0F("java/lang/Object", "toString", "()Ljava/lang/String;", 182, false);
                i = 184;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("(Ljava/lang/String;)L");
                A0u.append(replace);
                str3 = AnonymousClass000.A0q(";", A0u);
                str2 = "valueOf";
                str = replace;
            } else if (cls.equals(String.class)) {
                r5 = new C201489jh();
                r12.A0H(r5, 198);
                r12.A0B(25, 3);
                i = 182;
                z = false;
                str = "java/lang/Object";
                str2 = "toString";
                str3 = "()Ljava/lang/String;";
            } else {
                r12.A0C(192, replace);
            }
            r12.A0F(str, str2, str3, i, z);
            r12.A0B(58, 3);
            r12.A0G(r5);
            r12.A0J((Object[]) null, 3, (Object[]) null, 0, z ? 1 : 0);
            r12.A0B(25, 1);
            r12.A0C(192, str4);
            r12.A0B(25, 3);
            r12.A0C(192, replace);
        }
        Method method2 = r7.A04;
        if (method2 == null) {
            r12.A0D(181, str4, r7.A01, A032.A06());
        } else {
            C203189nU r3 = r12;
            r3.A0F(str4, method2.getName(), C203309nl.A02(method2), 182, false);
        }
        r12.A07(177);
    }

    public static void A01(C202879mp r11, C203189nU r12) {
        String replace = NoSuchFieldException.class.getName().replace('.', '/');
        C203189nU r2 = r12;
        r12.A0C(187, replace);
        r12.A07(89);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mapping ");
        A0u.append(r11.A02);
        r12.A0E(AnonymousClass000.A0q(" failed to map field:", A0u));
        r12.A0B(21, 2);
        r2.A0F("java/lang/Integer", "toString", "(I)Ljava/lang/String;", 184, false);
        r2.A0F("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        r2.A0F(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        r2.A07(191);
    }

    public static void A02(C202879mp r11, C203189nU r12) {
        String replace = NoSuchFieldException.class.getName().replace('.', '/');
        C203189nU r2 = r12;
        r12.A0C(187, replace);
        r12.A07(89);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mapping ");
        A0u.append(r11.A02);
        r12.A0E(AnonymousClass000.A0q(" failed to map field:", A0u));
        r12.A0B(25, 2);
        r2.A0F("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        r2.A0F(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        r2.A07(191);
    }

    public C202879mp(Class cls, AnonymousClass5RO r6, C198099cu[] r7) {
        String concat;
        this.A06 = r7;
        this.A05 = r6;
        String name = cls.getName();
        this.A02 = name;
        if (name.startsWith("java.")) {
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1D("net.minidev.asm.", name, "AccAccess", A0u);
            concat = A0u.toString();
        } else {
            concat = name.concat("AccAccess");
        }
        this.A00 = concat;
        this.A01 = concat.replace('.', '/');
        this.A03 = name.replace('.', '/');
    }
}
