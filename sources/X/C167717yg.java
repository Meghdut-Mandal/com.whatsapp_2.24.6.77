package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.7yg  reason: invalid class name and case insensitive filesystem */
public class C167717yg extends AnonymousClass04R {
    public int A00 = 0;
    public int A01 = 0;
    public DialogInterface.OnClickListener A02;
    public AnonymousClass9RB A03;
    public AnonymousClass3HL A04;
    public C132626Uo A05;
    public C193769Mu A06;
    public C192769Im A07;
    public C001700s A08;
    public C001700s A09;
    public C001700s A0A;
    public C001700s A0B;
    public C001700s A0C;
    public C001700s A0D;
    public C001700s A0E;
    public C001700s A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public int A0S() {
        C193769Mu r2 = this.A06;
        if (r2 == null) {
            return 0;
        }
        C132626Uo r0 = this.A05;
        int i = r2.A00;
        if (i != 0) {
            return i;
        }
        int i2 = 255;
        if (r0 != null) {
            i2 = 15;
        }
        if (r2.A05) {
            return i2 | 32768;
        }
        return i2;
    }

    public void A0T(int i) {
        C001700s r1 = this.A0C;
        if (r1 == null) {
            r1 = C36431kI.A0S();
            this.A0C = r1;
        }
        A01(r1, Integer.valueOf(i));
    }

    public void A0U(CharSequence charSequence) {
        C001700s r0 = this.A0B;
        if (r0 == null) {
            r0 = C36431kI.A0S();
            this.A0B = r0;
        }
        A01(r0, charSequence);
    }

    public void A0V(boolean z) {
        C001700s r1 = this.A0F;
        if (r1 == null) {
            r1 = C36431kI.A0S();
            this.A0F = r1;
        }
        A01(r1, Boolean.valueOf(z));
    }

    public static void A01(C001700s r2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.A0D(obj);
        } else {
            r2.A0C(obj);
        }
    }
}
