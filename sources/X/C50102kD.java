package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2kD  reason: invalid class name and case insensitive filesystem */
public final class C50102kD extends C132446Tt {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass1X4 A01;
    public final AnonymousClass4PI A02;
    public final C51092nG A03;
    public final C63633Ku A04;
    public final AnonymousClass141 A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final WeakReference A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        Activity A0D2 = C36441kJ.A0D(this.A0A);
        if (A0D2 != null) {
            if (this.A0F) {
                this.A04.A01(this.A05, this.A07, (List) null);
            }
            AnonymousClass141 r7 = this.A05;
            boolean A0G = r7.A0G();
            C63633Ku r1 = this.A04;
            if (A0G) {
                z = this.A0E;
                r1.A00((C87664Pr) null, r7, z, false);
            } else {
                String str = this.A08;
                Integer num = this.A06;
                String str2 = this.A09;
                C51092nG r6 = this.A03;
                z = this.A0E;
                String str3 = this.A07;
                UserJid A0k = C36351kA.A0k(r7);
                r1.A01.A0F(A0D2, r6, r7, A0k, num, str, str2, str3);
                if (z) {
                    r1.A00.A0P(A0k, true);
                }
            }
            if (z) {
                this.A01.A0P(C36331k8.A0G(r7), this.A0C);
            }
            C225314u.A0S(this.A00, 300);
        }
        return null;
    }

    public void A0A() {
        WeakReference weakReference = this.A0B;
        if (weakReference.get() != null) {
            ((C225014r) weakReference.get()).Bu2(0, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225014r r0 = (C225014r) this.A0B.get();
        if (r0 != null) {
            r0.Bnv();
        }
        AnonymousClass4PI r1 = this.A02;
        if (r1 != null) {
            r1.BfK(true);
        }
        Activity A0D2 = C36441kJ.A0D(this.A0A);
        if (A0D2 != null && this.A0D) {
            A0D2.finish();
        }
    }

    public C50102kD(AnonymousClass01L r3, C225014r r4, AnonymousClass1X4 r5, AnonymousClass4PI r6, C51092nG r7, C63633Ku r8, AnonymousClass141 r9, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0D = z;
        this.A0F = z2;
        this.A0A = AnonymousClass001.A0F(r3);
        this.A0B = AnonymousClass001.A0F(r4);
        this.A01 = r5;
        this.A04 = r8;
        this.A0E = z3;
        this.A0C = z4;
        this.A05 = r9;
        this.A08 = str;
        this.A06 = num;
        this.A09 = str2;
        this.A03 = r7;
        this.A07 = str3;
        this.A02 = r6;
    }
}
