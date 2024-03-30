package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: X.9mr  reason: invalid class name and case insensitive filesystem */
public class C202899mr {
    public static final HashMap A0M = AnonymousClass001.A0J();
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public byte[] A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass16K A07;
    public final AnonymousClass1O7 A08;
    public final C19970wo A09;
    public final C20310xM A0A;
    public final AnonymousClass17X A0B;
    public final C24541Cv A0C;
    public final AnonymousClass11F A0D;
    public final C21904Aca A0E;
    public final AnonymousClass1O8 A0F;
    public final C238019x A0G;
    public final Long A0H;
    public final long A0I = SystemClock.elapsedRealtime();
    public final AnonymousClass16I A0J;
    public final C21010yW A0K;
    public final boolean A0L;

    public static boolean A02(AnonymousClass11F r3) {
        if (r3 != null) {
            Iterator A10 = C36391kE.A10(A0M);
            while (A10.hasNext()) {
                if (r3.equals(((C202899mr) A10.next()).A0D)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A00(AnonymousClass11F r2, C202899mr r3) {
        r3.A08.A03.A04(r3.A06.A0D(r2));
        r3.A0J.A00(r2);
    }

    public static void A01(C202899mr r5, int i) {
        int length;
        C1039857v r4 = new C1039857v();
        byte[] bArr = r5.A02;
        int i2 = 0;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        byte[] bArr2 = r5.A03;
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        r4.A01 = Double.valueOf((double) (length + i2));
        r4.A03 = C90504aG.A0h(SystemClock.elapsedRealtime(), r5.A0I);
        r4.A02 = Integer.valueOf(i);
        r4.A00 = Boolean.valueOf(r5.A0L);
        r5.A0K.Blw(r4);
    }

    public C202899mr(AnonymousClass17Y r5, C19730wQ r6, AnonymousClass16D r7, AnonymousClass16I r8, AnonymousClass16K r9, AnonymousClass1O7 r10, C19970wo r11, C20310xM r12, AnonymousClass17X r13, C24541Cv r14, C21010yW r15, AnonymousClass11F r16, AnonymousClass1O8 r17, C238019x r18, byte[] bArr, byte[] bArr2, boolean z) {
        this.A09 = r11;
        this.A04 = r5;
        this.A05 = r6;
        this.A0K = r15;
        this.A06 = r7;
        this.A0J = r8;
        this.A0C = r14;
        this.A07 = r9;
        this.A08 = r10;
        this.A0F = r17;
        this.A0G = r18;
        this.A0A = r12;
        this.A0B = r13;
        this.A0D = r16;
        this.A02 = bArr;
        this.A03 = bArr2;
        this.A0L = z;
        Long A0g = C90484aE.A0g();
        this.A0H = A0g;
        A0M.put(A0g.toString(), this);
        C21904Aca aca = new C21904Aca(this);
        this.A0E = aca;
        new Timer().schedule(aca, 32000);
    }
}
