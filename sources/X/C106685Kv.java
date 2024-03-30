package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.5Kv  reason: invalid class name and case insensitive filesystem */
public class C106685Kv extends C147396x9 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public WaImageView A04;
    public C96064mj A05;
    public List A06;
    public boolean A07;
    public final C19730wQ A08;
    public final C129046Es A09;
    public final C104665Ar A0A;
    public final AnonymousClass1HA A0B;
    public final C88234Rx A0C;
    public final boolean A0D;
    public final int A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C106685Kv(android.content.Context r8, android.view.LayoutInflater r9, X.C19730wQ r10, X.C20810yC r11, X.C129046Es r12, X.C104665Ar r13, X.AnonymousClass1HA r14, X.C88234Rx r15, int r16, int r17) {
        /*
            r7 = this;
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A08 = r10
            r7.A09 = r12
            r7.A0A = r13
            r7.A0B = r14
            r7.A0C = r15
            boolean r0 = r13.A0E
            r7.A0D = r0
            r7.A0E = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106685Kv.<init>(android.content.Context, android.view.LayoutInflater, X.0wQ, X.0yC, X.6Es, X.5Ar, X.1HA, X.4Rx, int, int):void");
    }

    public void A05(C135066c4 r10) {
        C135066c4 r2 = r10;
        this.A08 = r10;
        WaImageView waImageView = this.A04;
        if (waImageView == null) {
            return;
        }
        if (r10 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        AnonymousClass1HA r0 = this.A0B;
        int i = this.A0F;
        r0.A08(waImageView, r2, (C88214Rv) null, 0, i, i, true, true);
    }

    public void A03(View view) {
        view.setBackgroundColor(this.A0E);
        View findViewById = view.findViewById(R.id.empty);
        this.A01 = findViewById;
        findViewById.setVisibility(4);
        TextView A0P = C36391kE.A0P(view, R.id.get_stickers_button);
        this.A02 = A0P;
        C33511fU.A03(A0P);
        C67103Yn.A00(this.A02, this, 18);
        this.A03 = C36391kE.A0P(view, R.id.empty_text);
        this.A04 = C36431kI.A0X(view, R.id.empty_image);
        this.A00 = view.findViewById(R.id.sticker_avatar_upsell);
        if (this.A0D) {
            C135066c4 r0 = this.A08;
            if (r0 != null) {
                A05(r0);
            } else {
                this.A04.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A06(List list) {
        C96064mj A002 = A00();
        this.A06 = list;
        A002.A0L(list);
        A002.A06();
        if (this.A01 != null) {
            int A0J = A00().A0J();
            View view = this.A01;
            int i = 8;
            if (A0J == 0) {
                i = 0;
            }
            view.setVisibility(i);
            boolean z = this.A07;
            TextView textView = this.A03;
            if (z) {
                textView.setText(R.string.f12nameremoved);
                this.A02.setVisibility(4);
            } else {
                textView.setText(R.string.f12nameremoved);
                this.A02.setVisibility(0);
            }
            C19730wQ r1 = this.A08;
            if (!r1.A0L()) {
                r1.A0L();
            }
            this.A04.setVisibility(0);
            if (this.A0D) {
                this.A03.setText(R.string.f12nameremoved);
                this.A02.setVisibility(4);
            }
        }
    }

    public void BVR(ViewGroup viewGroup, View view, int i) {
        super.BVR(viewGroup, view, i);
        C96064mj r1 = this.A05;
        if (r1 != null) {
            r1.A03 = null;
        }
        this.A01 = null;
    }
}
