package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5FE  reason: invalid class name */
public class AnonymousClass5FE extends C46482Xv {
    public C226815j A00;
    public AnonymousClass1RY A01;
    public final CircleWaImageView A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final AnonymousClass6V2 A06;
    public final AnonymousClass16I A07;

    public void A0B() {
        this.A01.A02();
        C226815j r1 = this.A00;
        if (r1 != null) {
            this.A07.unregisterObserver(r1);
        }
        this.A06.A03();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5E4 r5 = (AnonymousClass5E4) obj;
        this.A01.A0B(this.A02, new AnonymousClass141(C36421kH.A0N(r5.A03)), false);
        C162737p4 r1 = new C162737p4(r5, this, 0);
        this.A00 = r1;
        this.A07.registerObserver(r1);
        List list = r5.A04;
        if (list.isEmpty() || C36401kF.A0s(list, 0).isEmpty()) {
            this.A05.setVisibility(8);
        } else {
            WaTextView waTextView = this.A05;
            waTextView.setText(TextUtils.join(", ", list));
            waTextView.setVisibility(0);
        }
        this.A04.setText(r5.A02);
        C36361kB.A18(this.A03, r5, 49);
        C36411kG.A1C(this.A0H, this, r5, 28);
    }

    public AnonymousClass5FE(View view, AnonymousClass6V2 r4, AnonymousClass16I r5, C27731Pn r6) {
        super(view);
        this.A07 = r5;
        this.A01 = r6.A05(view.getContext(), "business-profile-recent-item");
        this.A06 = r4;
        this.A02 = (CircleWaImageView) C012005e.A02(view, R.id.business_avatar);
        this.A04 = C36401kF.A0Q(view, R.id.business_name);
        this.A05 = C36401kF.A0Q(view, R.id.category);
        this.A03 = C36431kI.A0X(view, R.id.delete_button);
    }
}
