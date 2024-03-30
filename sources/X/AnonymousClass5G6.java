package X;

import java.util.Map;

/* renamed from: X.5G6  reason: invalid class name */
public abstract class AnonymousClass5G6 extends AnonymousClass6F2 implements C160467l3, C162107o2 {
    public C1270766v A00;
    public final C116145k1 A01;

    public void B1S(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00 = new C1270766v(this, C90484aE.A0a(this.A01.A00.A00), str);
    }

    public final C1270766v A08() {
        C1270766v r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("screenOpener");
    }

    public void A09(C128786Dp r5, C159627jf r6, AnonymousClass6PH r7, String str, Map map) {
        if (this instanceof AnonymousClass5G5) {
            AnonymousClass6EW A02 = ((AnonymousClass5G5) this).A02.A02(str);
            String str2 = r5.A03;
            C18740tg.A06(str2);
            A02.A02(new C149096zv(str2));
        } else if (this instanceof C105655Fn) {
            C105655Fn r3 = (C105655Fn) this;
            String str3 = r5.A04;
            r3.A00 = str3;
            String str4 = r5.A03;
            AnonymousClass011 A19 = C36441kJ.A19(str3, str4);
            r3.A02.A00 = A19;
            r3.A01.A02(r5, r6, map, A19);
            A01(r5, r3, r3.A03, str, str4);
            r3.A0A(r7, str4, map);
        } else {
            C105665Fo r32 = (C105665Fo) this;
            String str5 = r5.A04;
            r32.A00 = str5;
            String str6 = r5.A03;
            AnonymousClass011 A192 = C36441kJ.A19(str5, str6);
            r32.A02.A00 = A192;
            r32.A01.A02(r5, r6, map, A192);
            A01(r5, r32, r32.A03, str, str6);
            r32.A0A(r7, str6, map);
        }
    }

    public AnonymousClass5G6(C116145k1 r1, C105705Fs r2) {
        super(r2);
        this.A01 = r1;
    }

    public static void A01(C128786Dp r2, AnonymousClass5G6 r3, C131376Ou r4, String str, String str2) {
        AnonymousClass6EW A02 = r4.A02(str);
        C18740tg.A06(str2);
        A02.A02(new C149096zv(str2));
        boolean z = r2.A06;
        C123405wR r1 = r2.A01;
        C18740tg.A06(r1);
        AnonymousClass00C.A08(r1);
        if (z) {
            r3.A08().A01.A02(new AnonymousClass708(r1.A04, r1.A03.name(), r1.A00));
        }
    }
}
