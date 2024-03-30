package X;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.List;

/* renamed from: X.6vw  reason: invalid class name and case insensitive filesystem */
public final class C146646vw implements AnonymousClass4U9, AnonymousClass7d6 {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = R.drawable.input_send;
    public long A04;
    public C225314u A05;
    public C1268765z A06;
    public C160177ka A07;
    public AnonymousClass6VH A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C18820ts A0E;
    public final C20810yC A0F;
    public final C160657lN A0G;
    public final AnonymousClass3L2 A0H;
    public final C29731Xt A0I;
    public final C160677lP A0J;
    public final AnonymousClass00T A0K = C36431kI.A1I(new C153077My(this));
    public final View A0L;
    public final C001600r A0M;
    public final C57922z2 A0N;
    public final C19970wo A0O;
    public final C19630wG A0P;

    public C146646vw(View view, C001600r r5, C57922z2 r6, C225314u r7, C19970wo r8, C19630wG r9, C18820ts r10, C20810yC r11, C160657lN r12, AnonymousClass3L2 r13, C29731Xt r14, C160677lP r15) {
        C1268765z r0;
        AnonymousClass00C.A0D(r8, 1);
        C36321k7.A19(r11, r9, r10, r14);
        C36321k7.A10(r6, r13);
        C90474aD.A18(view, r15);
        this.A0O = r8;
        this.A0F = r11;
        this.A0P = r9;
        this.A0E = r10;
        this.A0I = r14;
        this.A0N = r6;
        this.A0H = r13;
        this.A05 = r7;
        this.A0L = view;
        this.A0G = r12;
        this.A0J = r15;
        this.A0M = r5;
        this.A09 = C36371kC.A0v(r9, R.string.f12nameremoved);
        this.A0A = C36371kC.A11(C177528dw.A00);
        C27111My r1 = r6.A00.A00;
        AnonymousClass6VH r02 = new AnonymousClass6VH(view, r15);
        C27111My.A8d(r1, r02);
        this.A08 = r02;
        if (C36331k8.A1b(this.A0K)) {
            r0 = new AnonymousClass5LM(this);
        } else {
            r0 = new AnonymousClass5LI(this);
        }
        this.A06 = r0;
        ((CreationModeBottomBar) r15).A09 = this;
        r0.A00();
        AnonymousClass3XT r16 = (AnonymousClass3XT) r5.A04();
        if (r16 != null) {
            r12.Brt(r16, this.A0A, true);
        }
    }

    public static final void A00(C146646vw r2) {
        if (r2.A06.A00 == C108225Sr.RECORDING) {
            r2.A06 = new AnonymousClass5LM(r2);
            r2.A0B = false;
            AnonymousClass6VH r1 = r2.A08;
            r1.A05(r2, false);
            r1.A04((ViewGroup) r2.A0J);
        }
    }

    public final void A01(Intent intent) {
        this.A0A = C36401kF.A0u(intent, AnonymousClass11F.class, "jids");
        AnonymousClass3XT r3 = (AnonymousClass3XT) this.A0M.A04();
        if (r3 != null) {
            this.A0G.Brt(r3, this.A0A, false);
        }
        boolean A1a = C36401kF.A1a(this.A0A);
        int i = R.drawable.input_send;
        if (!A1a) {
            i = R.drawable.ic_done;
        }
        this.A03 = i;
        C19630wG r1 = this.A0P;
        int i2 = R.string.f12nameremoved;
        if (A1a) {
            i2 = R.string.f12nameremoved;
        }
        this.A09 = C36371kC.A0v(r1, i2);
        this.A06.A00();
    }

    public void Be3(int i) {
        C160177ka r0 = this.A07;
        if (r0 != null) {
            r0.Be3(i);
        }
    }

    public void Be4(int i) {
        C160177ka r0 = this.A07;
        if (r0 != null) {
            r0.Be4(i);
        }
    }

    public void BeL(boolean z) {
        C160177ka r0 = this.A07;
        if (r0 != null) {
            r0.BeL(z);
        }
    }
}
