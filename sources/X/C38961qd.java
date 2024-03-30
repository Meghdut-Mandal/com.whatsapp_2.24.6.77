package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.1qd  reason: invalid class name and case insensitive filesystem */
public final class C38961qd extends ScrollView {
    public final ViewStub A00;
    public final ViewStub A01;
    public final RadioButton A02 = ((RadioButton) C36361kB.A0G(this, R.id.only_share_with_button));
    public final RadioButton A03 = ((RadioButton) C36361kB.A0G(this, R.id.my_contacts_except_button));
    public final RadioButton A04 = ((RadioButton) C36361kB.A0G(this, R.id.my_contacts_button));
    public final WaTextView A05;
    public final WaTextView A06;
    public final WDSButton A07;
    public final WaTextView A08;

    public C38961qd(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        setPadding(0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        WaTextView A0Q = C36341k9.A0Q(this, R.id.status_privacy_bottom_sheet_title);
        this.A08 = A0Q;
        WaTextView A0Q2 = C36341k9.A0Q(this, R.id.excluded);
        this.A05 = A0Q2;
        WaTextView A0Q3 = C36341k9.A0Q(this, R.id.included);
        this.A06 = A0Q3;
        this.A00 = (ViewStub) C36361kB.A0G(this, R.id.status_privacy_stub);
        this.A01 = (ViewStub) C36361kB.A0G(this, R.id.waffle_privacy_stub);
        this.A07 = (WDSButton) C36361kB.A0G(this, R.id.done_btn);
        C33511fU.A03(A0Q);
        C33511fU.A03(A0Q2);
        C33511fU.A03(A0Q3);
        this.A04.setText(R.string.f12nameremoved);
        this.A02.setText(R.string.f12nameremoved);
        this.A03.setText(R.string.f12nameremoved);
    }

    public static final void A00(C38961qd r2) {
        r2.A03.setChecked(false);
        r2.A04.setChecked(false);
        r2.A02.setChecked(false);
    }
}
