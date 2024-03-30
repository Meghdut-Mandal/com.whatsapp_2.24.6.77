package X;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4vw  reason: invalid class name and case insensitive filesystem */
public class C100844vw extends C38871qM implements AnonymousClass7hH {
    public int A00;
    public Handler A01;
    public View A02;
    public TextView A03;
    public ConstraintLayout A04;
    public RecyclerView A05;
    public ShimmerFrameLayout A06;
    public C135106c9 A07;
    public C96004md A08;
    public WDSButton A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final C29971Ys A0E;
    public final C29931Yo A0F;
    public final PaymentAmountInputField A0G;
    public final C144326s0 A0H;
    public final C124885yx A0I;
    public final List A0J = AnonymousClass001.A0I();
    public final AnonymousClass060 A0K;

    public C100844vw(Activity activity, ImageView imageView, TextView textView, TextView textView2, TextView textView3, AnonymousClass060 r14, C19700wN r15, C87484Oz r16, C21060yb r17, C19420v0 r18, C29971Ys r19, C29931Yo r20, PaymentAmountInputField paymentAmountInputField, C144326s0 r22, C124885yx r23, AnonymousClass1N2 r24) {
        super(activity, r15, r16, r17, r18, r24);
        this.A0F = r20;
        this.A0E = r19;
        this.A0K = r14;
        this.A0H = r22;
        this.A0G = paymentAmountInputField;
        this.A0B = textView;
        this.A0C = textView2;
        this.A0I = r23;
        this.A0D = textView3;
        this.A0A = imageView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (java.lang.System.currentTimeMillis() < r9.A0V("payment_backgrounds_backoff_timestamp")) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C100844vw r8, boolean r9) {
        /*
            androidx.constraintlayout.widget.ConstraintLayout r1 = r8.A04
            r0 = 8
            r1.setVisibility(r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r8.A06
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = r8.A03
            r0 = 2131890826(0x7f12128a, float:1.9416355E38)
            r1.setText(r0)
            X.1Yo r5 = r8.A0F
            X.6ww r4 = new X.6ww
            r4.<init>(r8)
            X.1Yw r3 = r5.A0C
            if (r9 != 0) goto L_0x0051
            X.0v0 r9 = r3.A01
            java.lang.String r8 = "payment_backgrounds_last_fetch_timestamp"
            long r6 = r9.A0V(r8)
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            long r0 = X.C30011Yw.A02
            boolean r0 = r9.A2V(r8, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            long r6 = java.lang.System.currentTimeMillis()
            long r1 = r9.A0V(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
        L_0x0044:
            X.0wU r2 = r5.A0D
            r1 = 8
            X.1jD r0 = new X.1jD
            r0.<init>(r5, r4, r1)
            r2.Boy(r0)
            return
        L_0x0051:
            X.0wD r0 = r3.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0044
            X.0v0 r8 = r3.A01
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r8)
            java.lang.String r7 = "payment_background_backoff_attempt"
            int r0 = X.C36371kC.A01(r0, r7)
            int r6 = r0 + 1
            r2 = 720(0x2d0, double:3.557E-321)
            r0 = 1
            X.1Bd r9 = new X.1Bd
            r9.<init>(r0, r2)
            long r0 = (long) r6
            r9.A03(r0)
            long r2 = r9.A01()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            X.C36321k7.A0q(r8, r7, r6)
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            r8.A1h(r0, r2)
            X.1Yv r2 = r5.A0A
            r1 = 0
            X.6tX r0 = new X.6tX
            r0.<init>(r4, r5)
            r2.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100844vw.A04(X.4vw, boolean):void");
    }

    public void Bj3(C135106c9 r12) {
        this.A07 = r12;
        ImageView imageView = this.A0A;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C135106c9 r2 = this.A07;
        if (r2 != null) {
            layoutParams.height = (int) (((float) layoutParams.width) / (((float) r2.A0D) / ((float) r2.A09)));
            String str = r2.A01;
            if (!TextUtils.isEmpty(str)) {
                imageView.setContentDescription(str);
            }
            this.A0E.A00(imageView, this.A07, layoutParams.width, layoutParams.height);
            PaymentAmountInputField paymentAmountInputField = this.A0G;
            paymentAmountInputField.setTextColor(this.A07.A0C);
            int i = this.A07.A0C;
            paymentAmountInputField.setHintTextColor(Color.argb((int) (((float) Color.alpha(i)) * 0.3f), (int) ((float) Color.red(i)), (int) ((float) Color.green(i)), (int) ((float) Color.blue(i))));
            this.A0B.setTextColor(this.A07.A0C);
            this.A0C.setTextColor(this.A07.A0C);
            TextView textView = this.A0D;
            textView.setTextColor(this.A07.A0B);
            textView.setBackgroundColor(this.A07.A0A);
        } else {
            imageView.setImageResource(R.drawable.payment_default_background);
            PaymentAmountInputField paymentAmountInputField2 = this.A0G;
            C124885yx r10 = this.A0I;
            AnonymousClass088.A06(paymentAmountInputField2, r10.A00);
            TextView textView2 = this.A0B;
            Pair pair = r10.A02;
            AnonymousClass088.A06(textView2, C36381kD.A04(pair));
            TextView textView3 = this.A0C;
            int[] iArr = (int[]) pair.second;
            textView3.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            Pair pair2 = r10.A01;
            AnonymousClass088.A06(textView3, C36381kD.A04(pair2));
            int[] iArr2 = (int[]) pair2.second;
            textView3.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            TextView textView4 = this.A0D;
            Activity activity = this.A03;
            C36351kA.A15(activity.getResources(), textView4, C224514j.A00(activity, R.attr.f4nameremoved, R.color.f6nameremoved));
            textView4.setBackgroundColor(0);
        }
        imageView.setTag(R.id.selected_expressive_background_theme, this.A07);
    }

    public void dismiss() {
        this.A0K.A05(true);
        C144326s0 r2 = this.A0H;
        r2.A03.setVisibility(0);
        View view = r2.A02;
        if (view != null) {
            view.setVisibility(0);
        }
        super.dismiss();
    }

    public static void A03(C100844vw r6) {
        r6.A09();
        if (r6.A02 == null) {
            Activity activity = r6.A03;
            LinearLayout linearLayout = new LinearLayout(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.f9nameremoved, linearLayout, true);
            r6.A02 = inflate;
            C36421kH.A13(C012005e.A02(inflate, R.id.close_button), r6, 48);
            r6.A03 = C36391kE.A0O(r6.A02, R.id.themes_title);
            r6.A05 = C90504aG.A0J(r6.A02, R.id.expressive_themes_list);
            C96004md r1 = new C96004md(r6.A0E, r6.A0F, r6);
            r6.A08 = r1;
            r6.A05.setAdapter(r1);
            r6.A06 = (ShimmerFrameLayout) C012005e.A02(r6.A02, R.id.expressive_bg_loading_shimmer);
            ConstraintLayout constraintLayout = (ConstraintLayout) C012005e.A02(r6.A02, R.id.backgrounds_download_error_layout);
            r6.A04 = constraintLayout;
            r6.A09 = C36431kI.A0y(constraintLayout, R.id.retry_backgrounds_download);
            r6.setContentView(linearLayout);
            r6.setTouchable(true);
            r6.setOutsideTouchable(true);
            r6.setInputMethodMode(2);
            r6.setAnimationStyle(0);
            r6.setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(C36411kG.A01(activity))));
            r6.A02.measure(C90504aG.A08(activity.getWindowManager().getDefaultDisplay().getWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
            r6.A00 = r6.A02.getMeasuredHeight();
            r6.A01 = new Handler();
            r6.setTouchInterceptor(C135786dG.A00);
        }
        r6.setHeight(r6.A00);
        r6.setWidth(-1);
        C87484Oz r4 = r6.A04;
        r4.setKeyboardPopup(r6);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r4;
        if (keyboardPopupLayout.A04) {
            View view = (View) r4;
            C164757sK.A00(view.getViewTreeObserver(), r6, 17);
            keyboardPopupLayout.A04 = false;
            view.requestLayout();
        } else if (!r6.isShowing()) {
            r6.showAtLocation((View) r4, 48, 0, 1000000);
            C144326s0 r2 = r6.A0H;
            r2.A03.setVisibility(8);
            View view2 = r2.A02;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        r6.A0K.A04(true);
        A04(r6, false);
    }

    public void A0E() {
        if (!isShowing()) {
            super.A0E();
            C144326s0 r1 = this.A0H;
            if (AnonymousClass1N2.A00(r1.A0B)) {
                C87484Oz r8 = this.A04;
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r8;
                keyboardPopupLayout.A04 = true;
                InputMethodManager A0N = this.A05.A0N();
                C18740tg.A06(A0N);
                if (!A0N.hideSoftInputFromWindow(r1.A0B.getWindowToken(), 0, new C37171lw(C36341k9.A0H(), new AVY(this, 35), this.A08))) {
                    keyboardPopupLayout.A04 = false;
                    ((View) r8).requestLayout();
                    return;
                }
                return;
            }
            A03(this);
        }
    }

    public int A0D(int i) {
        return this.A00;
    }
}
