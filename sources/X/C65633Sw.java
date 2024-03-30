package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public class C65633Sw {
    public static final int A0R;
    public static final int A0S;
    public AnonymousClass2bU A00;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final AnonymousClass1RJ A04;
    public final AnonymousClass1RJ A05;
    public final WDSButton A06;
    public final View.OnClickListener A07 = C48742hy.A00(this, 15);
    public final View A08;
    public final AnonymousClass17Y A09;
    public final AnonymousClass1XY A0A;
    public final AnonymousClass1X4 A0B;
    public final C20830yE A0C;
    public final AnonymousClass1Y4 A0D;
    public final AnonymousClass1ST A0E;
    public final C23981Ap A0F;
    public final StickerView A0G;
    public final AnonymousClass336 A0H;
    public final C160527l9 A0I = new C53702rk(this, 8);
    public final AnonymousClass1SV A0J;
    public final C18820ts A0K;
    public final C20810yC A0L;
    public final AnonymousClass1HA A0M;
    public final C33541fX A0N = C48742hy.A00(this, 12);
    public final C33541fX A0O = C48742hy.A00(this, 13);
    public final C33541fX A0P = C48742hy.A00(this, 14);
    public final C19770wU A0Q;

    public void A05(AnonymousClass31E r10, C46962bx r11, boolean z) {
        C46962bx r5 = r11;
        this.A00 = r11;
        View view = this.A08;
        C64933Qa r3 = r11.A1J;
        view.setTag(r3);
        boolean z2 = z;
        if (z) {
            this.A0G.setImageDrawable((Drawable) null);
        }
        if (this.A0L.A0E(6590)) {
            C135066c4 r1 = r11.A00;
            if (r1 == null || r1.A04 == null || r1.A0E == null) {
                C19770wU r2 = this.A0Q;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(r3.A01);
                r2.Boz(new AnonymousClass755(this, r5, r10, 12, z2), AnonymousClass000.A0q("stickerRetriever", A0u));
                return;
            }
            A00(this, r11, r1, z);
            return;
        }
        A00(this, r11, this.A0F.A00(r11), z);
    }

    static {
        boolean z = AnonymousClass3RT.A00;
        int i = 7;
        int i2 = 1;
        if (z) {
            i2 = 7;
        }
        A0R = i2;
        if (!z) {
            i = 3;
        }
        A0S = i;
    }

    public static void A01(C65633Sw r7, C46962bx r8, boolean z) {
        C46962bx r3 = r8;
        if (!r7.A01 || z) {
            r7.A01 = false;
            r7.A0J.A0C(r7.A0G, r8, r7.A0I);
            return;
        }
        r7.A01 = false;
        r7.A0J.A0E(r7.A0G, r3, r7.A0I, r8.A1J, false);
    }

    public void A02() {
        View view = this.A03;
        view.setVisibility(0);
        AnonymousClass1RJ r5 = this.A05;
        AnonymousClass1RJ r6 = this.A04;
        WDSButton wDSButton = this.A06;
        AnonymousClass2IQ.A0P(view, wDSButton, r5, r6, false, false);
        AnonymousClass2bU r1 = this.A00;
        if (!r1.A1J.A02 || C54732tQ.A00(r1)) {
            StickerView stickerView = this.A0G;
            C36331k8.A0q(stickerView.getContext(), stickerView, R.string.f12nameremoved);
            wDSButton.setText(C66013Ui.A0E(this.A0K, this.A00.A00));
            wDSButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
            C33541fX r0 = this.A0O;
            wDSButton.setOnClickListener(r0);
            stickerView.setOnClickListener(r0);
            return;
        }
        StickerView stickerView2 = this.A0G;
        C36331k8.A0q(stickerView2.getContext(), stickerView2, R.string.f12nameremoved);
        wDSButton.setText(R.string.f12nameremoved);
        wDSButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
        C33541fX r02 = this.A0P;
        wDSButton.setOnClickListener(r02);
        stickerView2.setOnClickListener(r02);
    }

    public void A03() {
        boolean z = this.A00.A1J.A02;
        View view = this.A03;
        if (!z) {
            view.setVisibility(0);
            AnonymousClass1RJ r4 = this.A05;
            AnonymousClass1RJ r5 = this.A04;
            WDSButton wDSButton = this.A06;
            AnonymousClass2IQ.A0P(view, wDSButton, r4, r5, true, false);
            StickerView stickerView = this.A0G;
            C36331k8.A0q(stickerView.getContext(), stickerView, R.string.f12nameremoved);
            C33541fX r0 = this.A0N;
            wDSButton.setOnClickListener(r0);
            r4.A05(r0);
        } else {
            view.setVisibility(8);
        }
        this.A0G.setOnClickListener((View.OnClickListener) null);
    }

    public void A04() {
        View view = this.A03;
        view.setVisibility(8);
        AnonymousClass1RJ r3 = this.A05;
        AnonymousClass1RJ r4 = this.A04;
        WDSButton wDSButton = this.A06;
        AnonymousClass2IQ.A0P(view, wDSButton, r3, r4, false, false);
        wDSButton.setOnClickListener((View.OnClickListener) null);
        this.A0G.setOnClickListener(this.A07);
    }

    public C65633Sw(View view, AnonymousClass17Y r4, AnonymousClass1XY r5, AnonymousClass1X4 r6, C20830yE r7, C18820ts r8, C20810yC r9, AnonymousClass1Y4 r10, AnonymousClass1ST r11, C23981Ap r12, AnonymousClass1HA r13, AnonymousClass336 r14, AnonymousClass1SV r15, C19770wU r16) {
        this.A08 = view;
        this.A0G = (StickerView) view.findViewById(R.id.sticker_image);
        AnonymousClass1RJ A0X = C36341k9.A0X(view, R.id.progress_bar);
        this.A05 = A0X;
        this.A0H = r14;
        A0X.A07(C79473tm.A00);
        this.A04 = C36341k9.A0X(view, R.id.cancel_download);
        this.A03 = view.findViewById(R.id.control_frame);
        this.A06 = C36441kJ.A0u(view, R.id.control_btn);
        this.A0L = r9;
        this.A0M = r13;
        this.A0A = r5;
        this.A09 = r4;
        this.A0Q = r16;
        this.A0B = r6;
        this.A0F = r12;
        this.A0K = r8;
        this.A0J = r15;
        this.A0C = r7;
        this.A0E = r11;
        this.A0D = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r3 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C65633Sw r11, X.C46962bx r12, X.C135066c4 r13, boolean r14) {
        /*
            X.3Qj r1 = X.AnonymousClass2bU.A00(r12)
            com.whatsapp.stickers.StickerView r4 = r11.A0G
            android.content.res.Resources r2 = X.C36341k9.A0F(r4)
            r0 = 2131166133(0x7f0703b5, float:1.7946503E38)
            int r7 = r2.getDimensionPixelSize(r0)
            r0 = 0
            r4.setOnClickListener(r0)
            r5 = r13
            java.lang.String r0 = r13.A0A
            if (r0 == 0) goto L_0x0034
            X.3S2 r3 = r13.A04
            X.0yC r2 = r11.A0L
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0064
            if (r3 == 0) goto L_0x0034
            r12.A05 = r3
        L_0x002a:
            X.1XQ[] r0 = r3.A0D
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = X.C55532um.A00(r0)
            r13.A08 = r0
        L_0x0034:
            android.content.Context r0 = r4.getContext()
            java.lang.String r0 = X.AnonymousClass3RT.A00(r0, r13)
            r4.setContentDescription(r0)
            java.lang.String r0 = r13.A0E
            if (r0 == 0) goto L_0x0060
            java.io.File r0 = r1.A0I
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = r12.A1b()
            if (r0 == 0) goto L_0x0060
        L_0x004d:
            X.1HA r3 = r11.A0M
            r9 = 1
            r10 = 0
            X.3rP r6 = new X.3rP
            r6.<init>(r1, r11, r12, r14)
            r8 = r7
            r3.A09(r4, r5, r6, r7, r8, r9, r10)
        L_0x005a:
            android.view.View r0 = r11.A08
            r0.invalidate()
            return
        L_0x0060:
            A01(r11, r12, r14)
            goto L_0x005a
        L_0x0064:
            if (r3 == 0) goto L_0x0034
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65633Sw.A00(X.3Sw, X.2bx, X.6c4, boolean):void");
    }
}
