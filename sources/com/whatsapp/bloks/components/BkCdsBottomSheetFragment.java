package com.whatsapp.bloks.components;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass65A;
import X.AnonymousClass6LC;
import X.AnonymousClass6LD;
import X.AnonymousClass6WB;
import X.AnonymousClass6YR;
import X.AnonymousClass7eF;
import X.C023109s;
import X.C114505hM;
import X.C122045uD;
import X.C1271967i;
import X.C128926Ed;
import X.C129306Gj;
import X.C134476b6;
import X.C139036j8;
import X.C56912xJ;
import X.C81283wl;
import X.C90484aE;
import X.C90704aa;
import X.C92724eV;
import X.C92734eW;
import X.C92774ec;
import X.C98124qv;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.redex.OriginalClassName;
import java.util.Deque;
import java.util.List;

public class BkCdsBottomSheetFragment extends DialogFragment implements AnonymousClass7eF {
    public AnonymousClass65A A00;
    public C139036j8 A01;
    public AnonymousClass6WB A02;

    public static void A06(Activity activity, int i) {
        C81283wl r2 = new C81283wl((Object) activity, i, 2);
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26 || (!A07(activity, 16842840) && !A07(activity, 16842839) && !A07(activity, 16843763))) {
            try {
                r2.run();
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = OriginalClassName.getClassSimpleName(activity);
                    List list = AnonymousClass6YR.A00;
                    if (C90484aE.A1P()) {
                        AnonymousClass6YR.A0C("FixedOrientationCompat", StringFormatUtil.formatStrLocaleSafe("%s hit fixed orientation exception", A0L), e);
                        return;
                    }
                    return;
                }
                throw e;
            }
        }
    }

    public static C139036j8 A03(BkCdsBottomSheetFragment bkCdsBottomSheetFragment) {
        C139036j8 r0 = bkCdsBottomSheetFragment.A01;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("Must initialize bottom sheet delegate!");
    }

    public static boolean A07(Activity activity, int i) {
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    public void A1R(Bundle bundle) {
        AnonymousClass6WB r0 = this.A02;
        if (r0 != null) {
            bundle.putBundle("open_screen_config", r0.A03());
        }
        super.A1R(bundle);
    }

    public static BkCdsBottomSheetFragment A05(AnonymousClass6WB r3, String str) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("request_data", str);
        A07.putBundle("open_screen_config", r3.A03());
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = new BkCdsBottomSheetFragment();
        bkCdsBottomSheetFragment.A17(A07);
        return bkCdsBottomSheetFragment;
    }

    public void A19() {
        super.A19();
        C139036j8 r2 = this.A01;
        if (r2 != null) {
            C134476b6 r0 = this.A02.A00;
            if (r0 != null) {
                r0.A00.Bou(r2.A00);
            }
            Runnable runnable = r2.A08;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C139036j8 A03 = A03(this);
        Context A0a = A0a();
        AnonymousClass6WB r4 = this.A02;
        C56912xJ r7 = new C56912xJ(A03);
        C114505hM r6 = new C114505hM(A03);
        C1271967i r3 = r4.A01;
        A03.A04 = new AnonymousClass6LD(A0a, r7, r3, r4.A0C);
        A03.A03 = new AnonymousClass6LC(A0a, r6, r7, r3);
        A03.A06 = r4.A0A;
        Activity A002 = C129306Gj.A00(A0a);
        if (A002 != null) {
            A03.A07 = Integer.valueOf(A002.getRequestedOrientation());
            A06(A002, 1);
        }
        C92734eW r0 = new C92734eW(A0a, A03.A06);
        A03.A01 = r0;
        r0.getContentPager().A00 = A03;
        C92734eW r1 = A03.A01;
        AnonymousClass00C.A0D(r1, 2);
        A03.A02 = new C92724eV(A0a, r1, r3, r4);
        C122045uD r12 = (C122045uD) A03.A0A.peek();
        if (r12 != null) {
            C128926Ed r42 = r12.A03;
            if (r12.A00 == null) {
                View A003 = r42.A00(A0a);
                r12.A00 = A003;
                C92774ec.A02(A003, A03.A01.getContentPager(), C023109s.A00, false);
                C98124qv r13 = r42.A02;
                C92734eW r02 = A03.A01;
                if (r02 != null) {
                    ViewGroup headerContainer = r02.getHeaderContainer();
                    headerContainer.removeAllViews();
                    headerContainer.addView(r13);
                }
            } else {
                throw AnonymousClass001.A09("NavStack entry should have no view associated at Fragment's view creation");
            }
        }
        return A03.A02;
    }

    public void A1H() {
        Activity A002;
        super.A1H();
        C139036j8 r4 = this.A01;
        if (r4 != null) {
            Context A0a = A0a();
            Deque<C122045uD> deque = r4.A0A;
            for (C122045uD r0 : deque) {
                r0.A03.A01();
            }
            deque.clear();
            if (r4.A07 != null && (A002 = C129306Gj.A00(A0a)) != null) {
                A06(A002, r4.A07.intValue());
                r4.A07 = null;
            }
        }
    }

    public void A1J() {
        super.A1J();
        C139036j8 r5 = this.A01;
        if (r5 != null) {
            C92734eW r0 = r5.A01;
            if (r0 != null) {
                r0.getHeaderContainer().removeAllViews();
            }
            Deque<C122045uD> deque = r5.A0A;
            for (C122045uD r1 : deque) {
                if (r1.A00 != null) {
                    if (r1 == deque.peek()) {
                        r1.A03.A03();
                    }
                    r1.A03.A02();
                    r1.A00 = null;
                }
            }
            AnonymousClass6LD r02 = r5.A04;
            if (r02 != null) {
                r02.A00 = null;
                r5.A04 = null;
            }
            AnonymousClass6LC r03 = r5.A03;
            if (r03 != null) {
                r03.A00 = null;
                r5.A03 = null;
            }
        }
    }

    public void A1Q(Bundle bundle) {
        Bundle bundle2;
        super.A1Q(bundle);
        if (bundle != null) {
            A1b();
        }
        Bundle A0b = A0b();
        if (bundle == null) {
            bundle2 = A0b.getBundle("open_screen_config");
        } else {
            bundle2 = bundle.getBundle("open_screen_config");
        }
        this.A02 = AnonymousClass6WB.A00(bundle2);
        this.A01 = new C139036j8();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        if (r6 != r0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r1 == r5) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
        r1 = X.AnonymousClass6I4.A00;
        r11.A06 = java.util.Collections.singletonList(X.C90704aa.A0I);
        r11.A02 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        r5 = r7.A01;
        r1 = X.AnonymousClass6GU.A00(r8, X.C108465Tp.A02, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0119, code lost:
        if (r2.A02 == r1) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        r2.A02 = r1;
        X.C90704aa.A01(r2, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        r1 = ((float) android.graphics.Color.alpha(r1)) / ((float) 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        if (r2.A01 == r1) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r2.A01 = r1;
        X.C90704aa.A01(r2, r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        r0 = r2.getWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (r0 == null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
        r0.setStatusBarColor(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0141, code lost:
        r9.A05 = r2;
        r2.A05 = new X.AnonymousClass5o0(r8, r9);
        r0 = X.C129306Gj.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014e, code lost:
        if (r0 == null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        r1 = X.C129306Gj.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        if (r1 == null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015a, code lost:
        if (r1.isEmpty() != false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015c, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0164, code lost:
        if (r1.hasNext() == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016a, code lost:
        if (r1.next() != r14) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        if (r6 != X.C023109s.A0S) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0170, code lost:
        r4 = new X.C91244bh(268435455, 0.0f);
        X.C90514aH.A1H(android.graphics.PorterDuff.Mode.MULTIPLY, r4, -15173646);
        r3 = X.C36441kJ.A0K();
        r4.A00 = r3;
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018c, code lost:
        if (X.AnonymousClass6GU.A01(r8, r5) == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018e, code lost:
        r0 = -15787746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0191, code lost:
        r3.setColor(r0);
        r2.setOnShowListener(new X.AnonymousClass5YM(r4, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a7, code lost:
        throw X.AnonymousClass001.A09("Cannot show a fragment in a null activity");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r15) {
        /*
            r14 = this;
            X.6j8 r9 = A03(r14)
            android.content.Context r8 = r14.A0a()
            X.6WB r7 = r14.A02
            java.lang.Integer r6 = r7.A0A
            r9.A06 = r6
            java.lang.Integer r5 = X.C023109s.A0G
            if (r6 == r5) goto L_0x01af
            r9.A06 = r6
            if (r6 == r5) goto L_0x01a8
            r4 = 0
            r3 = 1
            X.4aa r2 = new X.4aa
            r2.<init>(r8)
            java.lang.Integer r10 = r7.A07
            r0 = -1
            if (r10 == 0) goto L_0x008a
            int r1 = r10.intValue()
            if (r1 == r0) goto L_0x008a
            if (r1 == r3) goto L_0x0086
            r0 = 2
            if (r1 != r0) goto L_0x0030
            r2.setCanceledOnTouchOutside(r4)
        L_0x0030:
            java.lang.Integer r0 = r7.A05
            java.lang.Integer r10 = X.C023109s.A0C
            if (r0 != r10) goto L_0x0038
            r2.A0D = r3
        L_0x0038:
            X.6bo r0 = r7.A02
            if (r0 == 0) goto L_0x0079
            int r13 = r0.A01
            int r12 = r0.A03
            int r11 = r0.A02
            int r1 = r0.A00
            android.widget.FrameLayout r0 = r2.A04
            r0.setPadding(r13, r12, r11, r1)
        L_0x0049:
            java.lang.Integer r0 = X.C023109s.A0R
            if (r6 == r0) goto L_0x00a9
            X.AnonymousClass00C.A07(r6)
            int r1 = r6.intValue()
            if (r1 == r4) goto L_0x00be
            if (r1 == r3) goto L_0x00a6
            r0 = 5
            if (r1 == r0) goto L_0x00a6
            r0 = 2
            if (r1 == r0) goto L_0x00a6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Encountered unsupported CDS bottom sheet style: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass6RW.A01(r6)
            r1.append(r0)
            r0 = 46
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x0079:
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C109525Xx.A00(r8, r0)
            int r1 = (int) r0
            android.widget.FrameLayout r0 = r2.A04
            r0.setPadding(r1, r1, r1, r1)
            goto L_0x0049
        L_0x0086:
            r2.setCanceledOnTouchOutside(r3)
            goto L_0x0030
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid enum value for DimmedBackgroundTapToDismiss: "
            r1.append(r0)
            if (r10 == 0) goto L_0x00a3
            java.lang.String r0 = X.AnonymousClass6RV.A01(r10)
        L_0x0099:
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "CDSBloksBottomSheetDialogHelper"
            X.AnonymousClass6RS.A01(r0, r1)
            goto L_0x0030
        L_0x00a3:
            java.lang.String r0 = "null"
            goto L_0x0099
        L_0x00a6:
            r0 = 1061158912(0x3f400000, float:0.75)
            goto L_0x00c0
        L_0x00a9:
            X.6j4 r1 = X.C139016j4.A00
            r2.A07 = r1
            X.4du r11 = r2.A08
            X.7eE r0 = r2.A06
            X.7eE[] r1 = X.C90704aa.A02(r1, r0)
            boolean r0 = r2.isShowing()
            r11.A04(r1, r0)
            r12 = 0
            goto L_0x00d6
        L_0x00be:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00c0:
            X.6j3 r12 = new X.6j3
            r12.<init>(r0)
            r2.A07 = r12
            X.4du r11 = r2.A08
            X.7eE r0 = r2.A06
            X.7eE[] r1 = X.C90704aa.A02(r12, r0)
            boolean r0 = r2.isShowing()
            r11.A04(r1, r0)
        L_0x00d6:
            r2.A06 = r12
            X.7eE r0 = r2.A07
            X.7eE[] r1 = X.C90704aa.A02(r0, r12)
            boolean r0 = r2.isShowing()
            r11.A04(r1, r0)
            boolean r0 = r2.A0E
            if (r0 == r4) goto L_0x00eb
            r2.A0E = r4
        L_0x00eb:
            boolean r0 = r2.A09
            if (r0 == r3) goto L_0x00f6
            r2.A09 = r3
            float r0 = r2.A00
            X.C90704aa.A01(r2, r0)
        L_0x00f6:
            r11.A09 = r3
            java.lang.Integer r1 = r7.A08
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x019e
            r1 = r6
            if (r6 == r0) goto L_0x0103
        L_0x0101:
            if (r1 != r5) goto L_0x010f
        L_0x0103:
            X.6I4 r1 = X.AnonymousClass6I4.A00
            X.7eE r0 = X.C90704aa.A0I
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r11.A06 = r0
            r11.A02 = r1
        L_0x010f:
            X.67i r5 = r7.A01
            X.5Tp r0 = X.C108465Tp.OVERLAY_ON_SURFACE
            int r1 = X.AnonymousClass6GU.A00(r8, r0, r5)
            int r0 = r2.A02
            if (r0 == r1) goto L_0x0122
            r2.A02 = r1
            float r0 = r2.A00
            X.C90704aa.A01(r2, r0)
        L_0x0122:
            int r0 = android.graphics.Color.alpha(r1)
            float r1 = (float) r0
            r0 = 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = r2.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            r2.A01 = r1
            float r0 = r2.A00
            X.C90704aa.A01(r2, r0)
        L_0x0138:
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x0141
            r0.setStatusBarColor(r4)
        L_0x0141:
            r9.A05 = r2
            X.5o0 r0 = new X.5o0
            r0.<init>(r8, r9)
            r2.A05 = r0
            android.app.Activity r0 = X.C129306Gj.A00(r8)
            if (r0 == 0) goto L_0x01a1
            java.util.List r1 = X.C129306Gj.A01(r0)
            if (r1 == 0) goto L_0x016c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x016c
            java.util.Iterator r1 = r1.iterator()
        L_0x0160:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r1.next()
            if (r0 != r14) goto L_0x0160
        L_0x016c:
            java.lang.Integer r0 = X.C023109s.A0S
            if (r6 != r0) goto L_0x019d
            r1 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = 0
            X.4bh r4 = new X.4bh
            r4.<init>(r1, r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            r0 = -15173646(0xffffffffff1877f2, float:-2.0266545E38)
            X.C90514aH.A1H(r1, r4, r0)
            android.graphics.Paint r3 = X.C36441kJ.A0K()
            r4.A00 = r3
            boolean r1 = X.AnonymousClass6GU.A01(r8, r5)
            r0 = -1
            if (r1 == 0) goto L_0x0191
            r0 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
        L_0x0191:
            r3.setColor(r0)
            r1 = 0
            X.5YM r0 = new X.5YM
            r0.<init>(r4, r1)
            r2.setOnShowListener(r0)
        L_0x019d:
            return r2
        L_0x019e:
            r5 = r10
            goto L_0x0101
        L_0x01a1:
            java.lang.String r0 = "Cannot show a fragment in a null activity"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01a8:
            java.lang.String r0 = "onCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x01af:
            java.lang.String r0 = "onFragmentCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A1a(android.os.Bundle):android.app.Dialog");
    }

    public void A1h(Runnable runnable) {
        C139036j8 A03 = A03(this);
        A03.A08 = runnable;
        if (A03.A06 == C023109s.A0G) {
            A03.A09 = true;
            A03.A00 = 1;
            return;
        }
        C90704aa r0 = A03.A05;
        if (r0 != null) {
            A03.A09 = true;
            A03.A00 = 1;
            r0.dismiss();
        }
    }

    public boolean A1i(String str) {
        for (C122045uD r0 : A03(this).A0A) {
            if (str.equals(r0.A03.A03)) {
                return true;
            }
        }
        return false;
    }

    public void Bef(int i) {
        A03(this).A03(i);
    }
}
