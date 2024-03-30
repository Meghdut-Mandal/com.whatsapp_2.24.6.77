package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.2mh  reason: invalid class name and case insensitive filesystem */
public final class C50822mh extends WDSButton implements C22928Aye {
    public final int A00;
    public final Context A01;
    public final C57102xh A02;
    public final C28391Sm A03;
    public final AnonymousClass1Sk A04;
    public final AnonymousClass147 A05;
    public final AnonymousClass147 A06;
    public final AnonymousClass2bI A07;
    public final C19770wU A08;
    public final boolean A09;
    public final AnonymousClass00T A0A = C36431kI.A1I(new C83644Ae(this));

    private final AnonymousClass1u8 getViewModel() {
        return (AnonymousClass1u8) this.A0A.getValue();
    }

    public List getCTAViews() {
        if (this.A06 != null || !this.A09) {
            return C36371kC.A11(this);
        }
        return C023409w.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50822mh(Context context, C57102xh r6, C28391Sm r7, AnonymousClass1Sk r8, AnonymousClass147 r9, AnonymousClass147 r10, AnonymousClass2bI r11, C19770wU r12, int i, boolean z) {
        super(context, (AttributeSet) null);
        C36321k7.A18(r6, r8, r7, r12);
        this.A02 = r6;
        this.A04 = r8;
        this.A03 = r7;
        this.A08 = r12;
        this.A01 = context;
        this.A07 = r11;
        this.A05 = r9;
        this.A06 = r10;
        this.A09 = z;
        this.A00 = i;
        setVariant(C27981Qp.OUTLINE);
        setText(R.string.f12nameremoved);
        setIcon((int) R.drawable.ic_action_add_person);
        setVisibility(8);
        C88554Td.A00((AnonymousClass014) C24801Dv.A01(context, AnonymousClass155.class), getViewModel().A00, new C86034Jj(this), 39);
        setOnClickListener(new C66963Xz(this, 7));
    }
}
