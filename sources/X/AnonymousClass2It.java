package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2It  reason: invalid class name */
public final class AnonymousClass2It extends AnonymousClass24D {
    public static final Integer[][] A06;
    public final Context A00;
    public final C57212xs A01;
    public final AnonymousClass11F A02;
    public final AnonymousClass147 A03;
    public final C19970wo A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new C83674Ah(this));

    static {
        Integer[][] numArr = new Integer[3][];
        Integer[] numArr2 = new Integer[4];
        int A1b = C36361kB.A1b(numArr2, R.string.f12nameremoved);
        numArr2[1] = Integer.valueOf(R.string.f12nameremoved);
        numArr2[2] = Integer.valueOf(R.string.f12nameremoved);
        AnonymousClass000.A1L(numArr2, R.string.f12nameremoved, 3);
        numArr[A1b] = numArr2;
        Integer[] numArr3 = new Integer[4];
        AnonymousClass000.A1L(numArr3, R.string.f12nameremoved, A1b);
        AnonymousClass000.A1L(numArr3, R.string.f12nameremoved, 1);
        AnonymousClass000.A1L(numArr3, R.string.f12nameremoved, 2);
        AnonymousClass000.A1L(numArr3, R.string.f12nameremoved, 3);
        numArr[1] = numArr3;
        Integer[] numArr4 = new Integer[4];
        AnonymousClass000.A1L(numArr4, R.string.f12nameremoved, A1b);
        AnonymousClass000.A1L(numArr4, R.string.f12nameremoved, 1);
        AnonymousClass000.A1L(numArr4, R.string.f12nameremoved, 2);
        numArr4[3] = null;
        numArr[2] = numArr4;
        A06 = numArr;
    }

    private final C39641t5 getViewModel() {
        return (C39641t5) this.A05.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2It(Context context, C57212xs r6, C19970wo r7, AnonymousClass11F r8, AnonymousClass147 r9) {
        super(context);
        C36321k7.A0x(r7, r6);
        this.A04 = r7;
        this.A01 = r6;
        this.A00 = context;
        this.A03 = r9;
        this.A02 = r8;
        C88554Td.A00((AnonymousClass014) C24801Dv.A01(context, AnonymousClass155.class), getViewModel().A00, new C86104Jq(this), 46);
    }
}
