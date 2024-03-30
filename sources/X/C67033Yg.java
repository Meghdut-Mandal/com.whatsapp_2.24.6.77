package X;

import android.view.View;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.3Yg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67033Yg implements View.OnClickListener {
    public final /* synthetic */ BusinessProfileFieldView A00;
    public final /* synthetic */ C201549jr A01;
    public final /* synthetic */ C206949uI A02;
    public final /* synthetic */ AnonymousClass2XH A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C67033Yg(BusinessProfileFieldView businessProfileFieldView, C201549jr r2, C206949uI r3, AnonymousClass2XH r4, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A05 = str;
        this.A04 = num;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = businessProfileFieldView;
        this.A06 = str2;
    }

    public final void onClick(View view) {
        C201549jr r4 = this.A01;
        String str = this.A05;
        Integer num = this.A04;
        boolean z = this.A07;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        C206949uI r2 = this.A02;
        AnonymousClass2XH r11 = this.A03;
        BusinessProfileFieldView businessProfileFieldView = this.A00;
        String str2 = this.A06;
        r4.A06((Integer) null, num, str, 3, z, z2);
        if (z3) {
            r4.A02(r2, 8);
        }
        r11.A08(businessProfileFieldView.getContext(), (String) null, str2, 0.0d, 0.0d);
    }
}
