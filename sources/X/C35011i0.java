package X;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1i0  reason: invalid class name and case insensitive filesystem */
public final class C35011i0 {
    public static final AnonymousClass1US A0K = AnonymousClass1US.CROSSPOST_MANAGER;
    public final C24801Dv A00;
    public final AnonymousClass17Y A01;
    public final C18820ts A02;
    public final C19770wU A03;
    public final C35051i4 A04;
    public final C35021i1 A05;
    public final C35061i5 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass005 A0D;
    public final AnonymousClass005 A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass005 A0G;
    public final AnonymousClass005 A0H;
    public final AnonymousClass005 A0I;
    public final AnonymousClass005 A0J;

    public final void A05(View view, C009904e r8, C225314u r9, C134876bk r10, C159817jy r11) {
        View.OnClickListener r1;
        AnonymousClass00C.A0D(view, 0);
        View A022 = C012005e.A02(view, R.id.linking_fb_icon);
        AnonymousClass00C.A08(A022);
        ImageView imageView = (ImageView) A022;
        View A023 = C012005e.A02(view, R.id.default_status_privacy_fb_crossposting_setting_text);
        AnonymousClass00C.A08(A023);
        TextView textView = (TextView) A023;
        View A024 = C012005e.A02(view, R.id.default_status_privacy_fb_crossposting_setting_container);
        AnonymousClass00C.A08(A024);
        boolean A062 = ((AnonymousClass1UM) this.A0C.get()).A06(A0K);
        Context context = view.getContext();
        if (A062) {
            imageView.setColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved));
            C131886Rd.A01(new C85574Hp(view, textView, r10), 2);
            r1 = new C35101i9(r8, new Intent(view.getContext(), ShareToFacebookActivity.class), 4);
        } else {
            imageView.setColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved));
            textView.setText(R.string.f12nameremoved);
            r1 = new C35111iA(this, r9, r11, 1);
        }
        A024.setOnClickListener(r1);
    }

    public final boolean A07(int i, Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        return ((AnonymousClass3EM) this.A0J.get()).A00(i, collection);
    }

    public final boolean A09(AnonymousClass3T1 r6) {
        Integer A012;
        AnonymousClass00C.A0D(r6, 0);
        C35061i5 r0 = this.A06;
        long j = r6.A1N;
        C35071i6 r1 = r0.A00;
        if (!r1.A03(j) || (A012 = r1.A01(j)) == null || 3 != A012.intValue()) {
            return false;
        }
        return true;
    }

    public static final void A00(Context context, C35011i0 r6, Integer num, String str, int i) {
        C132686Uv r1;
        C33541fX r0;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyCrosspostManager/handleErrorWithSnackbarMessage/errorCode: ");
        sb.append(i);
        sb.append(", errorSubCode: ");
        sb.append(num);
        AnonymousClass00C.A0D(sb.toString(), 0);
        String str2 = str;
        if (i == -4) {
            r1 = (C132686Uv) r6.A0A.get();
            r0 = null;
            i2 = R.string.f12nameremoved;
        } else if (i == -3) {
            r1 = (C132686Uv) r6.A0A.get();
            r0 = null;
            i2 = R.string.f12nameremoved;
        } else if (i == -2) {
            r1 = (C132686Uv) r6.A0A.get();
            r0 = null;
            i2 = R.string.f12nameremoved;
        } else if (i == 190) {
            if (num != null && num.intValue() == 452) {
                C132686Uv.A01((C33541fX) null, (C132686Uv) r6.A0A.get(), str2, R.string.f12nameremoved, 0, false);
            }
            ((AnonymousClass1UM) r6.A0C.get()).A04(A0K, true);
            return;
        } else if (i != 3463044) {
            AnonymousClass005 r02 = r6.A0A;
            if (i != 3463126) {
                r1 = (C132686Uv) r02.get();
                r0 = null;
                i2 = R.string.f12nameremoved;
            } else {
                C132686Uv r4 = (C132686Uv) r02.get();
                C132686Uv.A01(new C48902iF(context, r4, 41), r4, str2, R.string.f12nameremoved, R.string.f12nameremoved, false);
                return;
            }
        } else {
            r1 = (C132686Uv) r6.A0A.get();
            r0 = null;
            i2 = R.string.f12nameremoved;
        }
        C132686Uv.A01(r0, r1, str2, i2, 0, false);
    }

    public final void A01(Context context, AnonymousClass5VM r9, Integer num, Integer num2, String str, boolean z) {
        C132686Uv r2;
        int i;
        int i2;
        C48902iF r1;
        StringBuilder sb = new StringBuilder();
        sb.append("XFamilyCrosspostManager/handleErrorLinkingWithSnackbarMessage/errorCode: ");
        sb.append(num);
        sb.append(", errorSubCode: ");
        sb.append(num2);
        sb.append(", exception: ");
        sb.append(r9);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (r9 != null) {
            if (AnonymousClass00C.A0J(r9.getClass(), AnonymousClass5QY.class)) {
                r2 = (C132686Uv) this.A0A.get();
                i = 0;
                i2 = R.string.f12nameremoved;
            }
            r2 = (C132686Uv) this.A0A.get();
            i = 0;
            i2 = R.string.f12nameremoved;
        } else {
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue != 459) {
                    if (intValue == 467 || intValue == 463) {
                        r2 = (C132686Uv) this.A0A.get();
                        i = 0;
                        i2 = R.string.f12nameremoved;
                    } else if (intValue != 464) {
                        return;
                    }
                }
            } else {
                if (num != null) {
                    int intValue2 = num.intValue();
                    if (intValue2 == -1) {
                        r2 = (C132686Uv) this.A0A.get();
                        i = 0;
                        i2 = R.string.f12nameremoved;
                    } else if (!(intValue2 == 4 || intValue2 == 17)) {
                        if (intValue2 != 190) {
                            if (!(intValue2 == 341 || intValue2 == 368)) {
                                if (intValue2 != 3463126) {
                                    r2 = (C132686Uv) this.A0A.get();
                                    i = 0;
                                    i2 = R.string.f12nameremoved;
                                }
                            }
                        }
                    }
                }
                r2 = (C132686Uv) this.A0A.get();
                i = 0;
                i2 = R.string.f12nameremoved;
            }
            r2 = (C132686Uv) this.A0A.get();
            i2 = R.string.f12nameremoved;
            i = R.string.f12nameremoved;
            r1 = new C48902iF(context, r2, 40);
            C132686Uv.A01(r1, r2, str, i2, i, z);
        }
        r1 = null;
        C132686Uv.A01(r1, r2, str, i2, i, z);
    }

    public final void A02(Context context, Integer num, String str, List list) {
        C80043uh r2 = new C80043uh(context, this, num, str);
        ((C64663Oy) this.A0H.get()).A00(context, r2, num, str, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.view.View r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r3 = "status_fragment"
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            if (r12 == 0) goto L_0x0134
            android.content.Context r2 = r10.getContext()
            X.AnonymousClass00C.A08(r2)
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.3uh r0 = new X.3uh
            r0.<init>(r2, r9, r1, r3)
            X.3ug r7 = new X.3ug
            r7.<init>(r9, r0)
            X.005 r0 = r9.A08
            java.lang.Object r4 = r0.get()
            X.3Ab r4 = (X.C60973Ab) r4
            r6 = 1
            r5 = 2
            r3 = 4
            r0 = r10
            r2 = 5
            X.3Ys r1 = new X.3Ys
            r1.<init>((X.C60973Ab) r4, (X.C88674Tp) r7)
            if (r11 == r3) goto L_0x003c
            r0 = 2131429324(0x7f0b07cc, float:1.8480318E38)
            android.view.View r0 = X.C012005e.A02(r10, r0)
            X.AnonymousClass00C.A08(r0)
        L_0x003c:
            r0.setOnClickListener(r1)
            if (r11 == r5) goto L_0x011e
            r0 = 2131434302(0x7f0b1b3e, float:1.8490414E38)
            android.view.View r7 = X.C012005e.A02(r10, r0)
            X.AnonymousClass00C.A08(r7)
            r1 = 40
            X.6cl r0 = new X.6cl
            r0.<init>(r4, r1)
            r7.setOnClickListener(r0)
            if (r11 == r5) goto L_0x011e
            if (r11 != r2) goto L_0x007b
            r0 = 2131427725(0x7f0b018d, float:1.8477074E38)
            android.view.View r1 = X.C012005e.A02(r10, r0)
            X.AnonymousClass00C.A08(r1)
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r7, r0)
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            android.content.Context r1 = r1.getContext()
            r0 = 1107296256(0x42000000, float:32.0)
            int r0 = X.C65103Qt.A01(r1, r0)
            r7.setMarginStart(r0)
        L_0x007b:
            X.5Qf r7 = r4.A04
            r8 = 927610551(0x374a36b7, float:1.20528775E-5)
            r1 = 0
            java.lang.String r0 = "SEE_F_ICON"
            r7.A06(r1, r0, r8)
            X.1UM r1 = r4.A03
            X.1US r0 = X.AnonymousClass1US.CROSSPOST_CONTEXTUAL_SHARE_VIEW_CONTROLLER
            boolean r0 = r1.A06(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_account_linked"
            r7.A02(r1, r0)
            X.1Xt r0 = r4.A02
            X.3Ao r0 = r0.A00
            if (r0 == 0) goto L_0x011b
            long r0 = r0.A05
        L_0x009f:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "status_session_id"
            r7.A02(r1, r0)
            if (r11 == 0) goto L_0x01c4
            if (r11 == r6) goto L_0x00b3
            if (r11 == r5) goto L_0x00b3
            if (r11 == r3) goto L_0x00b3
            if (r11 == r2) goto L_0x00b3
        L_0x00b2:
            return
        L_0x00b3:
            java.lang.ref.WeakReference r0 = X.C60973Ab.A09
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r0.get()
            if (r0 != r10) goto L_0x00c8
        L_0x00bd:
            r5 = 0
            int r2 = X.C60973Ab.A08
            r0 = 5
            X.4VK r3 = new X.4VK
            r3.<init>(r10, r0)
            goto L_0x0175
        L_0x00c8:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            X.C60973Ab.A09 = r0
            int r3 = r10.getVisibility()
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            int r2 = r0.height
            r5 = 0
            r10.setVisibility(r5)
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            r0 = -2
            r1.height = r0
            android.view.ViewParent r0 = r10.getParent()
            if (r0 != 0) goto L_0x010b
            int r1 = r10.getWidth()
        L_0x00ee:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r10.measure(r1, r0)
            int r0 = r10.getMeasuredHeight()
            X.C60973Ab.A08 = r0
            r10.setVisibility(r3)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            r0.height = r2
            goto L_0x00bd
        L_0x010b:
            android.view.ViewParent r1 = r10.getParent()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.AnonymousClass00C.A0E(r1, r0)
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getWidth()
            goto L_0x00ee
        L_0x011b:
            r0 = 0
            goto L_0x009f
        L_0x011e:
            r0 = 2131428856(0x7f0b05f8, float:1.8479368E38)
            android.view.View r7 = X.C012005e.A02(r10, r0)
            X.AnonymousClass00C.A08(r7)
            r1 = 41
            X.6cl r0 = new X.6cl
            r0.<init>(r4, r1)
            r7.setOnClickListener(r0)
            goto L_0x007b
        L_0x0134:
            X.005 r0 = r9.A08
            java.lang.Object r4 = r0.get()
            X.3Ab r4 = (X.C60973Ab) r4
            if (r11 == 0) goto L_0x01ef
            r0 = 1
            if (r11 == r0) goto L_0x014b
            r0 = 2
            if (r11 == r0) goto L_0x014b
            r0 = 4
            if (r11 == r0) goto L_0x014b
            r0 = 5
            if (r11 == r0) goto L_0x014b
            return
        L_0x014b:
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x0169
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x015a
            r0.removeAllListeners()
        L_0x015a:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x0161
            r0.removeAllUpdateListeners()
        L_0x0161:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x00b2
            r0.cancel()
            return
        L_0x0169:
            int r5 = r10.getHeight()
            r2 = 0
            r0 = 4
            X.4VK r3 = new X.4VK
            r3.<init>(r10, r0)
            r13 = 0
        L_0x0175:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x017c
            r0.removeAllListeners()
        L_0x017c:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x0183
            r0.removeAllUpdateListeners()
        L_0x0183:
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x018a
            r0.cancel()
        L_0x018a:
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r2
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r1)
            r4.A00 = r2
            if (r2 == 0) goto L_0x00b2
            r0 = 400(0x190, double:1.976E-321)
            r2.setDuration(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r2.setInterpolator(r0)
            r2.addListener(r3)
            r1 = 3
            X.2rX r0 = new X.2rX
            r0.<init>(r10, r1)
            r2.addUpdateListener(r0)
            if (r13 == 0) goto L_0x01c1
            r0 = 1400(0x578, double:6.917E-321)
        L_0x01ba:
            r2.setStartDelay(r0)
            r2.start()
            return
        L_0x01c1:
            r0 = 0
            goto L_0x01ba
        L_0x01c4:
            android.view.ViewPropertyAnimator r0 = r10.animate()
            r0.cancel()
            android.view.ViewPropertyAnimator r1 = r10.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 600(0x258, double:2.964E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r0 = 1400(0x578, double:6.917E-321)
            android.view.ViewPropertyAnimator r2 = r2.setStartDelay(r0)
            r1 = 3
            X.4VK r0 = new X.4VK
            r0.<init>(r10, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            r0.start()
            return
        L_0x01ef:
            android.view.ViewPropertyAnimator r0 = r10.animate()
            r0.cancel()
            r0 = 8
            r10.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35011i0.A03(android.view.View, int, boolean, boolean):void");
    }

    public final void A04(View view, int i, boolean z, boolean z2) {
        long j;
        int width;
        View view2 = view;
        AnonymousClass00C.A0D(view, 0);
        if (z) {
            Context context = view.getContext();
            AnonymousClass00C.A08(context);
            C80033ug r4 = new C80033ug(this, new C80043uh(context, this, 4, "status_fragment"));
            C65293Rm r7 = (C65293Rm) this.A0I.get();
            if (view.getVisibility() == 0 && view.getHeight() == C65293Rm.A09) {
                C65293Rm.A01(r7);
                return;
            }
            C107635Qg r2 = r7.A04;
            r2.A06((String) null, "SEE_UPSELL_BANNER", 927608564);
            r2.A02(Boolean.valueOf(r7.A02.A06(AnonymousClass1US.CROSSPOST_CONTEXTUAL_UPSELL_VIEW_CONTROLLER)), "is_account_linked");
            C61103Ao r0 = r7.A01.A00;
            if (r0 != null) {
                j = r0.A05;
            } else {
                j = 0;
            }
            r2.A02(Long.valueOf(j), "status_session_id");
            View A022 = C012005e.A02(view, R.id.close);
            AnonymousClass00C.A08(A022);
            C67153Ys r22 = new C67153Ys(r7, (C88674Tp) r4);
            C135476cl r02 = new C135476cl(r7, 42);
            view.setOnClickListener(r22);
            A022.setOnClickListener(r02);
            if (i == 0) {
                View A023 = C012005e.A02(view, R.id.text1);
                AnonymousClass00C.A08(A023);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String string = view.getResources().getString(R.string.f12nameremoved);
                AnonymousClass00C.A08(string);
                int color = view.getResources().getColor(R.color.f6nameremoved);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder2.length(), 0);
                SpannableStringBuilder append = spannableStringBuilder.append(spannableStringBuilder2).append(" ");
                String string2 = view.getResources().getString(R.string.f12nameremoved);
                AnonymousClass00C.A08(string2);
                int color2 = view.getResources().getColor(R.color.f6nameremoved);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
                spannableStringBuilder3.setSpan(new ForegroundColorSpan(color2), 0, spannableStringBuilder3.length(), 0);
                spannableStringBuilder3.setSpan(new StyleSpan(1), 0, spannableStringBuilder3.length(), 0);
                SpannableStringBuilder append2 = append.append(spannableStringBuilder3);
                AnonymousClass00C.A08(append2);
                ((TextView) A023).setText(append2);
            }
            WeakReference weakReference = C65293Rm.A0A;
            if (weakReference == null || weakReference.get() != view) {
                C65293Rm.A0A = new WeakReference(view);
                int visibility = view.getVisibility();
                int i2 = view.getLayoutParams().height;
                view.setVisibility(0);
                view.getLayoutParams().height = -2;
                if (view.getParent() == null) {
                    width = view.getWidth();
                } else {
                    ViewParent parent = view.getParent();
                    AnonymousClass00C.A0E(parent, "null cannot be cast to non-null type android.view.View");
                    width = ((View) parent).getWidth();
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                C65293Rm.A09 = view.getMeasuredHeight();
                view.setVisibility(visibility);
                view.getLayoutParams().height = i2;
            }
            C10770fC r03 = new C10770fC();
            r03.element = true;
            C65293Rm.A00(new C36521kR(view, r7, r03), view2, r7, 0, C65293Rm.A09, true);
            return;
        }
        C65293Rm r72 = (C65293Rm) this.A0I.get();
        if (!z2) {
            C65293Rm.A01(r72);
            view.setVisibility(8);
        } else if (view.getVisibility() == 8) {
            C65293Rm.A01(r72);
        } else {
            C65293Rm.A00(new AnonymousClass4VK(view, 6), view2, r72, view.getHeight(), 0, false);
        }
        r72.A04.A03("SEE_UPSELL_BANNER_DISAPPEAR");
    }

    public final boolean A06() {
        AnonymousClass3EM r5 = (AnonymousClass3EM) this.A0J.get();
        AnonymousClass005 r4 = r5.A01;
        AnonymousClass1US r2 = AnonymousClass1US.STATUS_PRIVACY_ACTIVITY;
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/hasSystemUnlinkedUser called by ");
        sb.append(r2);
        AnonymousClass00C.A0D(sb.toString(), 0);
        if (!AnonymousClass1UI.A00(((AnonymousClass1UM) r4.get()).A00.A03).getBoolean("pref_xfamily_fb_account_has_system_unlinked", false)) {
            Context context = r5.A00.A00;
            AnonymousClass00C.A08(context);
            if (C55962vT.A00(context) || ((AnonymousClass1UM) r4.get()).A06(AnonymousClass1US.CROSSPOST_ENTRY_POINT_MANAGER)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A08(AnonymousClass3T1 r7) {
        Integer A012;
        C35061i5 r0 = this.A06;
        long j = r7.A1N;
        C35071i6 r5 = r0.A00;
        if (!r5.A03(j)) {
            return false;
        }
        Integer A013 = r5.A01(j);
        if ((A013 == null || 1 != A013.intValue()) && ((A012 = r5.A01(j)) == null || 7 != A012.intValue())) {
            return false;
        }
        return true;
    }

    public C35011i0(C24801Dv r21, AnonymousClass17Y r22, C18820ts r23, C19770wU r24, C35051i4 r25, C35021i1 r26, C35061i5 r27, AnonymousClass005 r28, AnonymousClass005 r29, AnonymousClass005 r30, AnonymousClass005 r31, AnonymousClass005 r32, AnonymousClass005 r33, AnonymousClass005 r34, AnonymousClass005 r35, AnonymousClass005 r36, AnonymousClass005 r37, AnonymousClass005 r38, AnonymousClass005 r39, AnonymousClass005 r40) {
        AnonymousClass17Y r0 = r22;
        AnonymousClass00C.A0D(r0, 1);
        C19770wU r17 = r24;
        AnonymousClass00C.A0D(r17, 2);
        C18820ts r18 = r23;
        AnonymousClass00C.A0D(r18, 3);
        C24801Dv r19 = r21;
        AnonymousClass00C.A0D(r19, 4);
        AnonymousClass005 r14 = r28;
        AnonymousClass00C.A0D(r14, 5);
        C35021i1 r15 = r26;
        AnonymousClass00C.A0D(r15, 6);
        C35051i4 r16 = r25;
        AnonymousClass00C.A0D(r16, 7);
        AnonymousClass005 r13 = r29;
        AnonymousClass00C.A0D(r13, 8);
        AnonymousClass005 r12 = r30;
        AnonymousClass00C.A0D(r12, 10);
        AnonymousClass005 r11 = r31;
        AnonymousClass00C.A0D(r11, 11);
        AnonymousClass005 r10 = r32;
        AnonymousClass00C.A0D(r10, 12);
        AnonymousClass005 r9 = r33;
        AnonymousClass00C.A0D(r9, 13);
        AnonymousClass005 r8 = r34;
        AnonymousClass00C.A0D(r8, 14);
        AnonymousClass005 r7 = r35;
        AnonymousClass00C.A0D(r7, 15);
        AnonymousClass005 r6 = r36;
        AnonymousClass00C.A0D(r6, 16);
        AnonymousClass005 r5 = r37;
        AnonymousClass00C.A0D(r5, 17);
        AnonymousClass005 r4 = r38;
        AnonymousClass00C.A0D(r4, 18);
        AnonymousClass005 r3 = r39;
        AnonymousClass00C.A0D(r3, 19);
        AnonymousClass005 r2 = r40;
        AnonymousClass00C.A0D(r2, 20);
        this.A01 = r0;
        this.A03 = r17;
        this.A02 = r18;
        this.A00 = r19;
        this.A0C = r14;
        this.A05 = r15;
        this.A04 = r16;
        this.A0B = r13;
        this.A06 = r27;
        this.A08 = r12;
        this.A0D = r11;
        this.A0H = r10;
        this.A0J = r9;
        this.A0I = r8;
        this.A0A = r7;
        this.A0E = r6;
        this.A09 = r5;
        this.A07 = r4;
        this.A0G = r3;
        this.A0F = r2;
    }
}
