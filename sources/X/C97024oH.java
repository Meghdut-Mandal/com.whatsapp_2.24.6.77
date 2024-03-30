package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4oH  reason: invalid class name and case insensitive filesystem */
public abstract class C97024oH extends AnonymousClass0D3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97024oH(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
    }

    public void A0D() {
    }

    public void A0B() {
        C159467jP r14;
        AnonymousClass3XN r0;
        if (this instanceof C1043359f) {
            LottieAnimationView lottieAnimationView = ((C1043359f) this).A00;
            if (lottieAnimationView != null) {
                lottieAnimationView.A04();
                return;
            }
            throw C36331k8.A0d("animation");
        } else if (this instanceof C1043159d) {
            C1043159d r3 = (C1043159d) this;
            AnonymousClass3XU r5 = r3.A01;
            if (r5 == null) {
                ImageView imageView = r3.A05;
                imageView.setOnClickListener((View.OnClickListener) null);
                r3.A04.setOnClickListener((View.OnClickListener) null);
                imageView.setVisibility(8);
                return;
            }
            C48902iF r6 = new C48902iF(r5, r3, 9);
            WaImageView waImageView = r3.A00;
            if (waImageView != null) {
                AnonymousClass3XN r1 = r5.A01;
                if (r1.A01 > 0) {
                    r0 = r1;
                } else {
                    r0 = r5.A02;
                }
                int i = r0.A01;
                if (r1.A00 <= 0) {
                    r1 = r5.A02;
                }
                int i2 = r1.A00;
                if (i == 0 || i2 == 0) {
                    i2 = 1;
                    i = 1;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("h,");
                A0u.append(i);
                A0u.append(':');
                String A10 = C36381kD.A10(A0u, i2);
                ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
                AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                AnonymousClass0BJ r12 = (AnonymousClass0BJ) layoutParams;
                r12.A0u = A10;
                waImageView.setLayoutParams(r12);
            }
            ImageView imageView2 = r3.A05;
            imageView2.setOnClickListener(r6);
            ViewGroup viewGroup = r3.A04;
            viewGroup.setOnClickListener(r6);
            C36331k8.A0q(viewGroup.getContext(), viewGroup, R.string.f12nameremoved);
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(new ColorDrawable(13421772));
            if (r3.A02 == null) {
                r3.A07.A02(imageView2, r5.A03.A02);
                return;
            }
            String str = r5.A02.A02;
            AnonymousClass1GZ r2 = r3.A07;
            C145766uU r13 = new C145766uU(r3, str);
            C18740tg.A01();
            C18740tg.A01();
            if (r2.A0G) {
                r14 = (C159467jP) r2.A0F.get();
            } else {
                C159467jP r142 = r2.A00;
                r14 = r142;
                if (r142 == null) {
                    C106755Lf A00 = r2.A04.A00("gif_preview_obj_store", 256);
                    r2.A00 = A00;
                    r14 = A00;
                }
            }
            C19630wG r11 = r2.A0C;
            C19970wo r10 = r2.A0B;
            C1043559i r4 = new C1043559i(r2.A03, r2.A07, r2.A08, r2.A09, r2.A0A, r10, r11, r2.A0D, r13, r14, str);
            r4.A02.executeOnExecutor(AnonymousClass1GZ.A01(r2), new Void[0]);
            r3.A03 = r4;
        }
    }

    public void A0C() {
        if (this instanceof C1043159d) {
            C1043159d r3 = (C1043159d) this;
            C132446Tt r1 = r3.A03;
            if (r1 != null) {
                r1.A0D(false);
            }
            r3.A03 = null;
            C122535v0 r12 = r3.A02;
            if (r12 != null) {
                C91334bq r0 = r12.A00;
                if (r0 != null) {
                    r0.stop();
                }
                r12.A00 = null;
                C21656ATx aTx = r12.A01;
                if (aTx != null) {
                    aTx.close();
                }
                r12.A01 = null;
                r12.A03.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A0E(boolean z) {
        if (this instanceof C1043459g) {
            ((C1043459g) this).A01.setShouldPlay(z);
        }
    }

    public boolean A0F() {
        boolean z;
        if (this instanceof C1043459g) {
            z = ((C1043459g) this).A01 instanceof AnonymousClass5K0;
        } else {
            z = this instanceof C1043259e;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
