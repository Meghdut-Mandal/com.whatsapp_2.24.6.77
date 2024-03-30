package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.2mf  reason: invalid class name and case insensitive filesystem */
public final class C50802mf extends WDSButton {
    public AnonymousClass3HA A00;
    public boolean A01;

    public C50802mf(Context context) {
        super(context, (AttributeSet) null);
        A04();
        setVariant(C27981Qp.OUTLINE);
        setText(R.string.f12nameremoved);
        setIcon((int) R.drawable.ic_invite_link);
    }

    private final void setupOnClick(AnonymousClass11F r8, C225314u r9, C45632Sc r10, AnonymousClass147 r11) {
        C225314u r1 = r9;
        C45632Sc r2 = r10;
        AnonymousClass147 r3 = r11;
        setOnClickListener(new C48872iC(r1, r2, r3, r8, this, 3));
    }

    public final void setGroupInviteClickUtils(AnonymousClass3HA r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public static /* synthetic */ void setupOnClick$default(C50802mf r1, AnonymousClass11F r2, C225314u r3, C45632Sc r4, AnonymousClass147 r5, int i, Object obj) {
        if ((i & 8) != 0) {
            r5 = null;
        }
        r1.setupOnClick(r2, r3, r4, r5);
    }

    public void A04() {
        if (!this.A01) {
            this.A01 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C36321k7.A0k(r1.A0M, this);
            this.A00 = C27111My.A2H(r1.A0L);
        }
    }

    public final AnonymousClass3HA getGroupInviteClickUtils() {
        AnonymousClass3HA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupInviteClickUtils");
    }

    public final void A05(C45632Sc r2, AnonymousClass147 r3, AnonymousClass147 r4) {
        setupOnClick(r3, C36381kD.A0S(getContext()), r2, r4);
    }
}
