package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1g7  reason: invalid class name and case insensitive filesystem */
public class C33901g7 implements C33681fl {
    public View A00;
    public final AnonymousClass01z A01;
    public final C33571fa A02;
    public final C19970wo A03;
    public final C31871cW A04;
    public final C33891g6 A05;

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        this.A02.getContext();
        return false;
    }

    public void BwS() {
        C33571fa r7 = this.A02;
        r7.getContext();
        View view = this.A00;
        if (view == null) {
            view = LayoutInflater.from(r7.getContext()).inflate(R.layout.f9nameremoved, r7, false);
            this.A00 = view;
        }
        ((TextView) C012005e.A02(view, R.id.smb_warning_banner_body)).setText(AnonymousClass14B.A01(r7.getContext(), new Object[]{AnonymousClass14B.A03(r7.getContext(), R.color.f6nameremoved)}, R.string.f12nameremoved));
        r7.setBackgroundResource(C224514j.A00(r7.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        C33891g6 r3 = this.A05;
        r7.setOnClickListener(new C35161iF(this, 18));
        C012005e.A02(view, R.id.close).setOnClickListener(new C35161iF(this, 19));
        view.setVisibility(0);
        if (!C20800yB.A01(C21000yV.A02, r3.A00, 1730)) {
            AnonymousClass2PD r1 = new AnonymousClass2PD();
            r1.A00 = 1;
            r1.A01 = 32;
            r3.A03.Blw(r1);
        }
        new AnonymousClass2S0();
        throw new NullPointerException("source");
    }

    public C33901g7(AnonymousClass01z r1, C33571fa r2, C19970wo r3, C31871cW r4, C33891g6 r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
    }
}
