package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.22A  reason: invalid class name */
public class AnonymousClass22A extends C42791zU {
    public final Context A00;
    public final AnonymousClass012 A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final AnonymousClass1Pp A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass171 A06;
    public final C27761Ps A07;
    public final C18820ts A08;
    public final C39871u3 A09;
    public final C19930wk A0A;

    public CharSequence A0F(int i) {
        if (i == 0) {
            C18820ts r6 = this.A08;
            Context context = this.A00;
            int A002 = C36401kF.A00(this.A09.A03.A02);
            String[] strArr = C65753Ti.A03;
            Resources resources = context.getResources();
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = C65753Ti.A01(context, r6, A002);
            return resources.getQuantityString(R.plurals.f10nameremoved, A002, A0L);
        }
        C61923Ea r62 = (C61923Ea) C36401kF.A0w(this.A09.A06).get(i - 1);
        C18820ts r1 = this.A08;
        Context context2 = this.A00;
        String A012 = C65753Ti.A01(context2, r1, C36401kF.A00(r62.A02));
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = r62.A03;
        return C36391kE.A0v(context2, A012, A0M, 1, R.string.f12nameremoved);
    }

    public int A0H() {
        return C36401kF.A00(this.A09.A06) + 1;
    }

    public AnonymousClass22A(Context context, AnonymousClass012 r4, AnonymousClass17Y r5, C19730wQ r6, AnonymousClass1Pp r7, AnonymousClass16D r8, AnonymousClass171 r9, C27761Ps r10, C18820ts r11, C39871u3 r12, C19930wk r13) {
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A0A = r13;
        this.A06 = r9;
        this.A08 = r11;
        this.A07 = r10;
        this.A00 = context;
        this.A01 = r4;
        this.A09 = r12;
        C65973Ue.A01(r4, r12.A06, this, 15);
    }
}
