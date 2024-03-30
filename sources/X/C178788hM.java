package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8hM  reason: invalid class name and case insensitive filesystem */
public class C178788hM extends C196109Xr {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ImageView A03;
    public ImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass17Y A0A;
    public final C199849g7 A0B;
    public final C19770wU A0C;
    public final C18820ts A0D;
    public final C33541fX A0E = new C48762i0(this, 3);
    public final C33541fX A0F = new C48762i0(this, 2);

    public void A00() {
        View view = this.A04.A00;
        ViewStub viewStub = (ViewStub) C012005e.A02(view, R.id.default_payment_method_stub);
        viewStub.setLayoutResource(R.layout.f9nameremoved);
        View inflate = viewStub.inflate();
        this.A00 = inflate;
        this.A02 = C36411kG.A0O(inflate, R.id.p2p_method_container);
        this.A01 = C36411kG.A0O(this.A00, R.id.p2m_method_container);
        this.A06 = C36401kF.A0Q(this.A00, R.id.p2p_default_message);
        this.A04 = C36401kF.A0G(this.A00, R.id.p2p_default_icon);
        this.A05 = C36401kF.A0Q(this.A00, R.id.p2m_default_message);
        this.A03 = C36401kF.A0G(this.A00, R.id.p2m_default_icon);
        ImageView A0G = C36401kF.A0G(view, R.id.p2p_default_icon);
        int i = this.A03;
        AnonymousClass3UF.A0E(A0G, i);
        AnonymousClass3UF.A0E(C36401kF.A0G(view, R.id.p2m_default_icon), i);
    }

    public void A01(C207249un r5, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        C175858bB r3;
        boolean A1S = AnonymousClass000.A1S(r5.A01, 2);
        WaTextView waTextView = this.A06;
        int i5 = R.string.f12nameremoved;
        if (A1S) {
            i5 = R.string.f12nameremoved;
        }
        waTextView.setText(i5);
        WaTextView waTextView2 = this.A06;
        if (A1S) {
            i = this.A09;
        } else {
            i = this.A08;
        }
        waTextView2.setTextColor(i);
        ImageView imageView = this.A04;
        int i6 = R.drawable.ic_group;
        if (A1S) {
            i6 = R.drawable.vec_ic_check_circle_24dp;
        }
        imageView.setImageResource(i6);
        if (A1S) {
            i2 = this.A07;
        } else {
            i2 = this.A03;
        }
        AnonymousClass3UF.A0E(imageView, i2);
        ViewGroup viewGroup = this.A02;
        C33541fX r0 = this.A0F;
        if (A1S) {
            viewGroup.setOnClickListener((View.OnClickListener) null);
            viewGroup.setBackground((Drawable) null);
        } else {
            viewGroup.setOnClickListener(r0);
            C34081gQ.A02(viewGroup);
        }
        boolean A1S2 = AnonymousClass000.A1S(r5.A03, 2);
        WaTextView waTextView3 = this.A05;
        int i7 = R.string.f12nameremoved;
        if (A1S2) {
            i7 = R.string.f12nameremoved;
        }
        waTextView3.setText(i7);
        WaTextView waTextView4 = this.A05;
        if (A1S2) {
            i3 = this.A09;
        } else {
            i3 = this.A08;
        }
        waTextView4.setTextColor(i3);
        ImageView imageView2 = this.A03;
        int i8 = R.drawable.ic_shopping_cart;
        if (A1S2) {
            i8 = R.drawable.vec_ic_check_circle_24dp;
        }
        imageView2.setImageResource(i8);
        if (A1S2) {
            i4 = this.A07;
        } else {
            i4 = this.A03;
        }
        AnonymousClass3UF.A0E(imageView2, i4);
        ViewGroup viewGroup2 = this.A01;
        C33541fX r02 = this.A0E;
        if (A1S2) {
            viewGroup2.setOnClickListener((View.OnClickListener) null);
            viewGroup2.setBackground((Drawable) null);
        } else {
            viewGroup2.setOnClickListener(r02);
            C34081gQ.A02(viewGroup2);
        }
        if (C203449o2.A08(r5) && (r3 = (C175858bB) r5.A08) != null) {
            int i9 = 0;
            this.A02.setVisibility(C36351kA.A00(r3.A0X ? 1 : 0));
            ViewGroup viewGroup3 = this.A01;
            if (!r3.A0T) {
                i9 = 8;
            }
            viewGroup3.setVisibility(i9);
        }
    }

    public C178788hM(AnonymousClass17Y r3, C18820ts r4, C178888i4 r5, C199849g7 r6, C19770wU r7) {
        super(r5);
        this.A0A = r3;
        this.A0C = r7;
        this.A0D = r4;
        this.A0B = r6;
        this.A08 = C36351kA.A01(r5, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A09 = AnonymousClass00F.A00(r5, R.color.f6nameremoved);
        this.A07 = C36351kA.A01(r5, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public void A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C207249un A0S = C165607th.A0S(it);
            if (A0S.A0A.equals(this.A04.A04.A0A)) {
                A01(A0S, false);
                return;
            }
        }
    }
}
