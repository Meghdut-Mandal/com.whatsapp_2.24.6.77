package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.FacebookMapPreview;

/* renamed from: X.5FH  reason: invalid class name */
public final class AnonymousClass5FH extends C46482Xv {
    public AnonymousClass6QG A00;
    public FacebookMapPreview A01;
    public C132426To A02;
    public AnonymousClass5E6 A03;
    public C20830yE A04;
    public AnonymousClass1P6 A05;
    public final View A06;
    public final C129006Eo A07;
    public final C123195w6 A08;
    public final AnonymousClass1QW A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FH(View view, C129006Eo r13, C123195w6 r14, C20830yE r15, AnonymousClass1P6 r16, AnonymousClass1QW r17) {
        super(view);
        AnonymousClass1P6 r1 = r16;
        AnonymousClass1QW r0 = r17;
        C36321k7.A19(r1, r15, r0, r13);
        this.A06 = view;
        this.A05 = r1;
        this.A04 = r15;
        this.A09 = r0;
        this.A07 = r13;
        this.A08 = r14;
        AnonymousClass6QG A022 = r13.A02();
        this.A00 = A022 == null ? new AnonymousClass6QG(Double.valueOf(2800.0d), Double.valueOf(-23.533773d), Double.valueOf(-46.62529d), (Double) null, (Double) null, (Double) null, "São Paulo", (String) null, "city_default") : A022;
        ViewGroup A0O = C36411kG.A0O(view, R.id.map_preview);
        AnonymousClass00C.A0B(A0O);
        this.A01 = new FacebookMapPreview(A0O, new C163487qH(this, 1), A00(this, 15.5f), this.A05);
    }

    public static final C134996bx A00(AnonymousClass5FH r4, float f) {
        Double d = r4.A00.A03;
        C18740tg.A06(d);
        AnonymousClass00C.A08(d);
        double doubleValue = d.doubleValue();
        Double d2 = r4.A00.A04;
        C18740tg.A06(d2);
        AnonymousClass00C.A08(d2);
        return new C134996bx(C134976bv.A00(doubleValue, d2.doubleValue()), f, 90.0f, 0.0f);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5E6 r4 = (AnonymousClass5E6) obj;
        AnonymousClass00C.A0D(r4, 0);
        this.A03 = r4;
        this.A01.A00.A0J(new C165327tF(r4, this, 1));
    }
}
