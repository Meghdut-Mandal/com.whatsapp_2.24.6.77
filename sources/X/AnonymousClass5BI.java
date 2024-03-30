package X;

import android.os.Build;
import java.io.File;

/* renamed from: X.5BI  reason: invalid class name */
public final class AnonymousClass5BI extends AnonymousClass1GM {
    public final AnonymousClass17Y A00;
    public final C19630wG A01;
    public final C20810yC A02;
    public final C121795tj A03;
    public final C129706Id A04;
    public final C20310xM A05;
    public final AnonymousClass1F4 A06;
    public final C19780wV A07;

    public final void A0A(C46812bi r8) {
        File file;
        AnonymousClass5SP r0;
        AnonymousClass00C.A0D(r8, 0);
        C65013Qj r02 = r8.A01;
        if (r02 != null && (file = r02.A0I) != null) {
            C20810yC r6 = this.A02;
            int A072 = r6.A07(7027);
            if (A072 == 0) {
                r0 = AnonymousClass5SP.SPEECH_RECOGNIZER;
            } else if (A072 == 1) {
                r0 = AnonymousClass5SP.UNITY;
            } else if (A072 == 2) {
                r0 = AnonymousClass5SP.SPEECH_RECOGNIZER_AND_UNITY;
            } else {
                throw C90464aC.A0R("Invalid PTT_TRANSCRIPTION_ENGINE value: ", AnonymousClass000.A0u(), A072);
            }
            int ordinal = r0.ordinal();
            C158677ht r4 = null;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    r4 = new C1492870o(this.A00, this.A03, this.A04);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    r4 = new C1492970p(this.A00, this.A01, this.A03, this.A04);
                }
            } else if (Build.VERSION.SDK_INT >= 33) {
                r4 = new C1493070q(this.A00, this.A01);
            }
            C158677ht r42 = r4;
            if (r42 != null) {
                this.A07.Boy(new AnonymousClass737(this, r8, new AnonymousClass6CX(r8, new C1492570l(this, r6.A07(6809)), r42, file), 24));
            }
        }
    }

    public static final void A01(C46812bi r8, AnonymousClass5BI r9, String str, int i, int i2, int i3) {
        C65013Qj r0 = r8.A01;
        if (r0 != null) {
            r0.A0P = str;
            AnonymousClass1F4 r3 = r9.A06;
            C63503Kh r1 = r8.A00;
            AnonymousClass00C.A07(r1);
            AnonymousClass1F4.A00(r3, new C63503Kh[]{r1}[0]);
            AnonymousClass3QP r2 = (AnonymousClass3QP) r1.A00;
            if (r2 == null) {
                r2 = new AnonymousClass3QP((byte[]) null, 0, 0, 0, 0);
            }
            r8.A1j(new AnonymousClass3QP(r2.A05, r2.A00, i, i2, i3));
            r9.A05.A0k(r8);
            return;
        }
        throw C36381kD.A0l();
    }

    public /* bridge */ /* synthetic */ Runnable A09(Object obj, Object obj2) {
        return new C1498172w(obj2, this, 10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5BI(AnonymousClass17Y r2, C19630wG r3, C20310xM r4, C20810yC r5, AnonymousClass1F4 r6, C121795tj r7, C19780wV r8, C129706Id r9) {
        super(C165307tD.A00(r8, 17));
        C36321k7.A1B(r3, r5, r2, r4, r6);
        C36321k7.A10(r8, r7);
        this.A01 = r3;
        this.A02 = r5;
        this.A00 = r2;
        this.A05 = r4;
        this.A06 = r6;
        this.A07 = r8;
        this.A03 = r7;
        this.A04 = r9;
    }
}
