package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5Kt  reason: invalid class name and case insensitive filesystem */
public class C106665Kt extends C147396x9 {
    public View A00;
    public WaTextView A01;
    public List A02;
    public WaImageView A03;
    public final int A04;
    public final AnonymousClass1HA A05;
    public final AnonymousClass1AP A06;
    public final C88234Rx A07;
    public final boolean A08;

    public C106665Kt(Context context, LayoutInflater layoutInflater, C20810yC r11, AnonymousClass1HA r12, AnonymousClass1AP r13, C88234Rx r14, int i, int i2, boolean z) {
        super(context, layoutInflater, r11, i, i2);
        this.A06 = r13;
        this.A05 = r12;
        this.A07 = r14;
        boolean z2 = z;
        this.A04 = C36371kC.A00(z2 ? 1 : 0);
        this.A08 = z2;
    }

    public void A05(C135066c4 r10) {
        C135066c4 r2 = r10;
        this.A08 = r10;
        WaImageView waImageView = this.A03;
        if (waImageView == null) {
            return;
        }
        if (r10 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        AnonymousClass1HA r0 = this.A05;
        int i = this.A0F;
        r0.A08(waImageView, r2, (C88214Rv) null, 0, i, i, true, true);
    }

    public void A06(List list) {
        this.A02 = list;
        C96064mj A002 = A00();
        A002.A0L(this.A02);
        A002.A06();
        if (this.A00 != null) {
            if (this.A08) {
                this.A01.setText(R.string.f12nameremoved);
            }
            int A0J = A00().A0J();
            View view = this.A00;
            int i = 8;
            if (A0J == 0) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        this.A03 = C36431kI.A0X(view, R.id.empty_image);
        WaTextView A0Q = C36401kF.A0Q(view, R.id.empty_text);
        this.A01 = A0Q;
        A0Q.setText(R.string.f12nameremoved);
        if (this.A08) {
            C135066c4 r0 = this.A08;
            if (r0 != null) {
                A05(r0);
            } else {
                this.A03.setImageDrawable((Drawable) null);
            }
        }
    }

    public void BVR(ViewGroup viewGroup, View view, int i) {
        super.BVR(viewGroup, view, i);
        this.A00 = null;
    }
}
