package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4fM  reason: invalid class name and case insensitive filesystem */
public final class C92994fM extends LinearLayout {
    public WaImageView A00;
    public TextView A01;
    public TextView A02;
    public final int A03;
    public final C123425wT A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new C152887Mf(this));
    public final AnonymousClass00T A06 = C36431kI.A1I(new C152897Mg(this));
    public final C1262663f A07;
    public final C33041ec A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92994fM(Context context, C123425wT r6, C1262663f r7, C33041ec r8, int i) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(r7, 5);
        C36321k7.A10(r6, r8);
        View inflate = C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        this.A00 = (WaImageView) C36361kB.A0F(inflate, R.id.privacy_disclosure_bullet_icon);
        this.A02 = C36351kA.A0F(inflate, R.id.privacy_disclosure_bullet_text);
        this.A01 = C36351kA.A0F(inflate, R.id.privacy_disclosure_bullet_text_secondary);
        C33521fV.A07(this.A02, true);
        this.A03 = i;
        this.A07 = r7;
        this.A04 = r6;
        this.A08 = r8;
    }

    private final int getPaddingVerticalDivider() {
        return C36331k8.A02(this.A05);
    }

    private final int getPaddingVerticalFixed() {
        return C36331k8.A02(this.A06);
    }

    public final void setItemPaddingIfNeeded(boolean z) {
        int i;
        AnonymousClass00T r3 = this.A06;
        int A022 = C36331k8.A02(r3);
        if (z) {
            i = C36331k8.A02(this.A05);
        } else {
            i = 0;
        }
        setPadding(0, C36331k8.A02(r3), 0, A022 + i);
    }

    public final void setSecondaryText(String str) {
        this.A07.A00(C36371kC.A0B(this), this.A01, this.A08, str);
    }

    public final void setText(String str) {
        this.A07.A00(C36371kC.A0B(this), this.A02, this.A08, str);
    }
}
