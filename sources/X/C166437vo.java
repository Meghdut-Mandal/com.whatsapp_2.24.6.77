package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7vo  reason: invalid class name and case insensitive filesystem */
public class C166437vo extends LinearLayout implements C18700tb {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass1RY A09;
    public C27731Pn A0A;
    public C24631De A0B;
    public AnonymousClass1FR A0C;
    public AnonymousClass1QZ A0D;
    public boolean A0E;

    public void A00(AnonymousClass141 r6, String str, String str2) {
        this.A03.setVisibility(0);
        this.A00.setVisibility(0);
        this.A09.A08(this.A02, r6);
        this.A08.setText(str);
        this.A07.setText(C36411kG.A0w(getResources(), str2, AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0D;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public void setScanQrText(int i) {
        this.A06.setText(i);
    }

    public C166437vo(Context context) {
        super(context);
        if (!this.A0E) {
            this.A0E = true;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            this.A0A = C165577te.A0Q(r1);
            this.A0C = C36431kI.A0p(r1);
            this.A0B = (C24631De) C165577te.A0f(r1);
        }
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        this.A02 = C36391kE.A0N(this, R.id.profile_image);
        this.A08 = C36391kE.A0P(this, R.id.profile_payment_name);
        this.A07 = C36391kE.A0P(this, R.id.profile_payment_handler);
        this.A09 = this.A0A.A04(getContext(), "india-upi-payment-settings-header-row");
        this.A03 = C36441kJ.A0U(this, R.id.profile_container);
        LinearLayout A0U = C36441kJ.A0U(this, R.id.send_payment_container);
        this.A05 = A0U;
        C36391kE.A0N(A0U, R.id.payments_drawable_image_view).setImageDrawable(this.A0C.A0K(getContext(), this.A0B.A02(), R.color.f6nameremoved, R.dimen.f7nameremoved));
        LinearLayout A0U2 = C36441kJ.A0U(this, R.id.scan_qr_container);
        this.A04 = A0U2;
        this.A06 = C36391kE.A0O(A0U2, R.id.scan_qr);
        this.A00 = findViewById(R.id.divider_above_send_payment);
        this.A01 = C36401kF.A0G(this, R.id.profile_details_icon);
    }

    public LinearLayout getProfileContainer() {
        return this.A03;
    }

    public LinearLayout getScanQrContainer() {
        return this.A04;
    }

    public LinearLayout getSendPaymentContainer() {
        return this.A05;
    }
}
