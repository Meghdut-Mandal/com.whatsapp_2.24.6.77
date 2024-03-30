package X;

import android.animation.Animator;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.B7c  reason: case insensitive filesystem */
public class C23142B7c implements Animator.AnimatorListener {
    public Object A00;
    public final int A01;

    public C23142B7c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 == 0) {
            AnonymousClass8ZY r1 = (AnonymousClass8ZY) this.A00;
            r1.A07 = false;
            AnonymousClass8ZY.A0E(r1, false);
        }
    }

    public void onAnimationRepeat(Animator animator) {
        int i;
        int i2;
        WaImageView waImageView;
        if (this.A01 != 0) {
            IndiaUpiFcsTransactionConfirmationActivity indiaUpiFcsTransactionConfirmationActivity = (IndiaUpiFcsTransactionConfirmationActivity) this.A00;
            int i3 = indiaUpiFcsTransactionConfirmationActivity.A00;
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                return;
            }
            if (indiaUpiFcsTransactionConfirmationActivity.A0C) {
                if (i3 == 1) {
                    i = 360;
                    i2 = 449;
                } else if (i3 != 2) {
                    i = 270;
                    i2 = 359;
                } else {
                    i = 180;
                    i2 = 269;
                }
                AnonymousClass011 A19 = C36441kJ.A19(i, Integer.valueOf(i2));
                LottieAnimationView lottieAnimationView = indiaUpiFcsTransactionConfirmationActivity.A01;
                if (lottieAnimationView == null) {
                    throw C36331k8.A0d("lottieAnimationView");
                }
                lottieAnimationView.A09.A0F(AnonymousClass000.A0I(A19.first), C90474aD.A08(A19));
                LottieAnimationView lottieAnimationView2 = indiaUpiFcsTransactionConfirmationActivity.A01;
                if (lottieAnimationView2 == null) {
                    throw C36331k8.A0d("lottieAnimationView");
                }
                lottieAnimationView2.setRepeatCount(1);
                int i4 = indiaUpiFcsTransactionConfirmationActivity.A00;
                if (i4 == 1) {
                    WaTextView waTextView = indiaUpiFcsTransactionConfirmationActivity.A05;
                    if (waTextView == null) {
                        throw C36331k8.A0d("amountTextView");
                    }
                    waTextView.setVisibility(8);
                    WaTextView waTextView2 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    if (waTextView2 == null) {
                        throw C36331k8.A0d("primaryStatus");
                    }
                    waTextView2.setText(R.string.f12nameremoved);
                    WaTextView waTextView3 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    if (waTextView3 == null) {
                        throw C36331k8.A0d("primaryStatus");
                    }
                    ViewGroup.LayoutParams layoutParams = waTextView3.getLayoutParams();
                    AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = indiaUpiFcsTransactionConfirmationActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    WaTextView waTextView4 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    if (waTextView4 == null) {
                        throw C36331k8.A0d("primaryStatus");
                    }
                    waTextView4.setLayoutParams(marginLayoutParams);
                    WaTextView waTextView5 = indiaUpiFcsTransactionConfirmationActivity.A08;
                    if (waTextView5 == null) {
                        throw C36331k8.A0d("secondaryStatus");
                    }
                    waTextView5.setText(R.string.f12nameremoved);
                    waTextView5.setVisibility(0);
                    WDSButton wDSButton = indiaUpiFcsTransactionConfirmationActivity.A0A;
                    if (wDSButton == null) {
                        throw C36331k8.A0d("doneButton");
                    }
                    wDSButton.setVisibility(0);
                    waImageView = indiaUpiFcsTransactionConfirmationActivity.A04;
                    if (waImageView == null) {
                        throw C36331k8.A0d("closeButton");
                    }
                } else if (i4 == 2) {
                    WaTextView waTextView6 = indiaUpiFcsTransactionConfirmationActivity.A05;
                    if (waTextView6 == null) {
                        throw C36331k8.A0d("amountTextView");
                    }
                    Resources resources = indiaUpiFcsTransactionConfirmationActivity.getResources();
                    WaTextView waTextView7 = indiaUpiFcsTransactionConfirmationActivity.A05;
                    if (waTextView7 == null) {
                        throw C36331k8.A0d("amountTextView");
                    }
                    C36351kA.A15(resources, waTextView6, C224514j.A00(waTextView7.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                    WaTextView waTextView8 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    if (waTextView8 == null) {
                        throw C36331k8.A0d("primaryStatus");
                    }
                    waTextView8.setText(R.string.f12nameremoved);
                    C36351kA.A15(waTextView8.getResources(), waTextView8, R.color.f6nameremoved);
                    waTextView8.setVisibility(0);
                    WaTextView waTextView9 = indiaUpiFcsTransactionConfirmationActivity.A08;
                    if (waTextView9 == null) {
                        throw C36331k8.A0d("secondaryStatus");
                    }
                    Object[] objArr = new Object[1];
                    String str = indiaUpiFcsTransactionConfirmationActivity.A0B;
                    if (str == null) {
                        throw C36331k8.A0d("merchantName");
                    }
                    objArr[0] = str;
                    C36341k9.A0s(indiaUpiFcsTransactionConfirmationActivity, waTextView9, objArr, R.string.f12nameremoved);
                    waTextView9.setVisibility(0);
                    WaTextView waTextView10 = indiaUpiFcsTransactionConfirmationActivity.A06;
                    if (waTextView10 == null) {
                        throw C36331k8.A0d("dateTextView");
                    }
                    C18820ts whatsAppLocale = waTextView10.getWhatsAppLocale();
                    C18820ts whatsAppLocale2 = waTextView10.getWhatsAppLocale();
                    C19970wo r2 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    String A05 = C20040wv.A05(whatsAppLocale2, r2.A08(r2.A04()));
                    C18820ts whatsAppLocale3 = waTextView10.getWhatsAppLocale();
                    C19970wo r22 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    C36341k9.A0s(indiaUpiFcsTransactionConfirmationActivity, waTextView10, new Object[]{AnonymousClass6XI.A03(whatsAppLocale, A05, C165607th.A0q(r22, whatsAppLocale3, r22.A04()))}, R.string.f12nameremoved);
                    waTextView10.setVisibility(0);
                    WDSButton wDSButton2 = indiaUpiFcsTransactionConfirmationActivity.A0A;
                    if (wDSButton2 == null) {
                        throw C36331k8.A0d("doneButton");
                    }
                    wDSButton2.setVisibility(0);
                    waImageView = indiaUpiFcsTransactionConfirmationActivity.A04;
                    if (waImageView == null) {
                        throw C36331k8.A0d("closeButton");
                    }
                } else if (i4 == 3) {
                    WaTextView waTextView11 = indiaUpiFcsTransactionConfirmationActivity.A05;
                    if (waTextView11 == null) {
                        throw C36331k8.A0d("amountTextView");
                    }
                    waTextView11.setPaintFlags(waTextView11.getPaintFlags() | 16);
                    WaTextView waTextView12 = indiaUpiFcsTransactionConfirmationActivity.A07;
                    if (waTextView12 == null) {
                        throw C36331k8.A0d("primaryStatus");
                    }
                    waTextView12.setText(R.string.f12nameremoved);
                    C36351kA.A15(waTextView12.getResources(), waTextView12, R.color.f6nameremoved);
                    WaTextView waTextView13 = indiaUpiFcsTransactionConfirmationActivity.A08;
                    if (waTextView13 == null) {
                        throw C36331k8.A0d("secondaryStatus");
                    }
                    waTextView13.setText(R.string.f12nameremoved);
                    waTextView13.setVisibility(0);
                    WDSButton wDSButton3 = indiaUpiFcsTransactionConfirmationActivity.A0A;
                    if (wDSButton3 == null) {
                        throw C36331k8.A0d("doneButton");
                    }
                    wDSButton3.setVisibility(0);
                    waImageView = indiaUpiFcsTransactionConfirmationActivity.A04;
                    if (waImageView == null) {
                        throw C36331k8.A0d("closeButton");
                    }
                } else {
                    return;
                }
                waImageView.setVisibility(4);
                return;
            }
            LottieAnimationView lottieAnimationView3 = indiaUpiFcsTransactionConfirmationActivity.A01;
            if (lottieAnimationView3 == null) {
                throw C36331k8.A0d("lottieAnimationView");
            }
            lottieAnimationView3.A09.A0F(90, 179);
            indiaUpiFcsTransactionConfirmationActivity.A0C = true;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A01 == 0) {
            AnonymousClass8ZY r1 = (AnonymousClass8ZY) this.A00;
            r1.A07 = true;
            AnonymousClass8ZY.A0E(r1, false);
        }
    }

    public void onAnimationCancel(Animator animator) {
    }
}
