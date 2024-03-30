package X;

import android.os.Handler;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;

/* renamed from: X.6zX  reason: invalid class name and case insensitive filesystem */
public final class C148856zX implements AnonymousClass7d8 {
    public C148836zV A00;
    public C125455zw A01;
    public C132476Tw A02;
    public Runnable A03 = new C81183wb(this, 34);
    public final Handler A04 = C36341k9.A0H();
    public final C001600r A05;
    public final C001700s A06;
    public final C001700s A07;
    public final C001700s A08;
    public final AnonymousClass04S A09;
    public final AnonymousClass04S A0A;
    public final C19700wN A0B;
    public final AnonymousClass17Y A0C;
    public final C19630wG A0D;
    public final C20810yC A0E;
    public final C29731Xt A0F;
    public final C111695ch A0G;
    public final C158567hi A0H;
    public final AnonymousClass3QH A0I;
    public final AnonymousClass005 A0J;
    public final File A0K;

    public static final void A00(C148856zX r3) {
        C132476Tw r0 = r3.A02;
        if (r0 != null) {
            r0.A04();
        }
        C132476Tw r02 = r3.A02;
        if (r02 != null) {
            r3.A07.A0D(Integer.valueOf(r02.A02()));
        }
        C132476Tw r03 = r3.A02;
        if (r03 != null) {
            r03.A02();
            Number A0z = C36441kJ.A0z(r3.A07);
            if (A0z != null) {
                r3.A0H.setSeekbarContentDescription((long) A0z.intValue());
            }
        }
        r3.A08.A0D(new AnonymousClass5LR(r3));
        r3.A0I.A01();
    }

    public static final void A01(C148856zX r2) {
        C132476Tw r0 = r2.A02;
        if (r0 != null) {
            r0.A09();
        }
        C132476Tw r02 = r2.A02;
        if (r02 != null) {
            r02.A06();
        }
        r2.A02 = null;
        r2.A08.A0D(new AnonymousClass5LQ(r2));
        C36341k9.A16(r2.A07, 0);
        r2.A0I.A01();
    }

    public static final void A02(C148856zX r3, int i, boolean z) {
        Number A0z;
        Number A0z2 = C36441kJ.A0z(r3.A06);
        if (A0z2 != null) {
            int intValue = A0z2.intValue();
            int A012 = C14960mT.A01((((float) i) / 1000.0f) * ((float) intValue));
            int i2 = (intValue - 50) - 1;
            if (A012 > i2) {
                A012 = i2;
            }
            if (A012 < 0) {
                A012 = 0;
            }
            C001700s r0 = r3.A07;
            C36341k9.A16(r0, A012);
            if (z && (A0z = C36441kJ.A0z(r0)) != null) {
                r3.A0H.setSeekbarContentDescription((long) A0z.intValue());
            }
        }
    }

    public C148856zX(C19700wN r7, AnonymousClass17Y r8, C19630wG r9, C20810yC r10, C29731Xt r11, C111695ch r12, C158567hi r13, AnonymousClass3QH r14, AnonymousClass005 r15, File file) {
        C36321k7.A18(r9, r10, r8, r7);
        C36321k7.A13(r14, r11, r15);
        this.A0D = r9;
        this.A0E = r10;
        this.A0C = r8;
        this.A0B = r7;
        this.A0G = r12;
        this.A0I = r14;
        this.A0F = r11;
        this.A0J = r15;
        this.A0H = r13;
        File file2 = file;
        this.A0K = file2;
        C001700s A0Z = C36441kJ.A0Z(C36381kD.A0m());
        this.A07 = A0Z;
        C001700s A0Z2 = C36441kJ.A0Z(Integer.valueOf((int) AnonymousClass1GW.A06(file2)));
        this.A06 = A0Z2;
        C001700s A0Z3 = C36441kJ.A0Z(new AnonymousClass5LQ(this));
        this.A08 = A0Z3;
        C165197t2 r4 = new C165197t2(this, 20);
        this.A09 = r4;
        AnonymousClass08S A012 = C196339Zf.A01(A0Z, A0Z2, C148916zd.A00, false);
        this.A05 = A012;
        C165197t2 r2 = new C165197t2(this, 21);
        this.A0A = r2;
        ((VoiceRecordingView) r13).A0B = this;
        A0Z3.A0A(r4);
        A012.A0A(r2);
    }
}
