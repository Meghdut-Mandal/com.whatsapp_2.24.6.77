package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass0BQ;
import X.AnonymousClass0D3;
import X.AnonymousClass0UE;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16L;
import X.AnonymousClass17Y;
import X.AnonymousClass1PZ;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.AnonymousClass3UF;
import X.AnonymousClass52T;
import X.AnonymousClass60n;
import X.AnonymousClass6CD;
import X.AnonymousClass6PI;
import X.AnonymousClass711;
import X.C001700s;
import X.C06590Ue;
import X.C1028152a;
import X.C1028252b;
import X.C108275Sw;
import X.C116925lQ;
import X.C121465tB;
import X.C129066Eu;
import X.C145156tR;
import X.C1501574e;
import X.C157237cd;
import X.C165167sz;
import X.C18700tb;
import X.C18740tg;
import X.C18820ts;
import X.C19780wV;
import X.C20810yC;
import X.C226815j;
import X.C27731Pn;
import X.C34681hT;
import X.C34831hi;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C37351mE;
import X.C61243Bc;
import X.C90474aD;
import X.C92554eA;
import X.C96104mn;
import X.C96334nA;
import X.C97034oI;
import X.C97114oS;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class CallGrid extends FrameLayout implements C18700tb {
    public AnonymousClass0BQ A00;
    public AnonymousClass17Y A01;
    public AnonymousClass16L A02;
    public C145156tR A03;
    public C157237cd A04;
    public C96104mn A05;
    public AnonymousClass52T A06;
    public CallGridViewModel A07;
    public AnonymousClass1PZ A08;
    public ScreenShareViewModel A09;
    public C121465tB A0A;
    public AnonymousClass711 A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass16I A0D;
    public AnonymousClass1RY A0E;
    public C27731Pn A0F;
    public C18820ts A0G;
    public C20810yC A0H;
    public AnonymousClass13J A0I;
    public C19780wV A0J;
    public AnonymousClass1QZ A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public Parcelable A0Q;
    public C06590Ue A0R;
    public VoiceChatBottomSheetViewModel A0S;
    public boolean A0T;
    public final View A0U;
    public final View A0V;
    public final View A0W;
    public final TextView A0X;
    public final AnonymousClass01Y A0Y;
    public final AnonymousClass0UE A0Z;
    public final AnonymousClass0UE A0a;
    public final RecyclerView A0b;
    public final RecyclerView A0c;
    public final C116925lQ A0d;
    public final AnonymousClass60n A0e;
    public final CallGridLayoutManager A0f;
    public final C96334nA A0g;
    public final PipViewContainer A0h;
    public final C226815j A0i;
    public final AnonymousClass1RJ A0j;
    public final AnonymousClass1RJ A0k;
    public final View A0l;
    public final View A0m;
    public final View A0n;
    public final LinearLayoutManager A0o;
    public final C97114oS A0p;
    public final FocusViewContainer A0q;
    public final AnonymousClass1RJ A0r;
    public final AnonymousClass1RJ A0s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallGrid(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r2 = r17
            r1 = r18
            r3 = r19
            r0 = r20
            r2.<init>(r1, r3, r0)
            boolean r0 = r2.A0L
            if (r0 != 0) goto L_0x009a
            r0 = 1
            r2.A0L = r0
            java.lang.Object r4 = r2.generatedComponent()
            X.1Qb r4 = (X.C27851Qb) r4
            X.1Qc r4 = (X.C27861Qc) r4
            X.0tq r3 = r4.A0M
            X.0yC r0 = X.C36341k9.A0V(r3)
            r2.A0H = r0
            X.1My r0 = r4.A0L
            X.004 r0 = r0.A3c
            java.lang.Object r0 = r0.get()
            X.4mn r0 = (X.C96104mn) r0
            r2.A05 = r0
            X.52T r0 = X.C27861Qc.A07(r4)
            r2.A06 = r0
            X.1Pn r0 = X.C36351kA.A0T(r3)
            r2.A0F = r0
            X.16D r0 = X.C36341k9.A0R(r3)
            r2.A0C = r0
            X.16I r0 = X.C36351kA.A0S(r3)
            r2.A0D = r0
            X.16L r0 = X.C90504aG.A0L(r3)
            r2.A02 = r0
            X.17Y r0 = X.C36351kA.A0M(r3)
            r2.A01 = r0
            X.0ts r0 = X.C36341k9.A0T(r3)
            r2.A0G = r0
            X.004 r0 = r3.Adb
            java.lang.Object r0 = r0.get()
            X.5tB r0 = (X.C121465tB) r0
            r2.A0A = r0
            X.004 r0 = r3.A8v
            java.lang.Object r0 = r0.get()
            X.711 r0 = (X.AnonymousClass711) r0
            r2.A0B = r0
            X.004 r0 = r3.A9Y
            java.lang.Object r0 = r0.get()
            X.0wV r0 = (X.C19780wV) r0
            r2.A0J = r0
            X.0tt r0 = r3.A00
            X.004 r0 = r0.ABD
            java.lang.Object r0 = r0.get()
            X.6tR r0 = (X.C145156tR) r0
            r2.A03 = r0
            X.13J r0 = X.C36351kA.A0q(r3)
            r2.A0I = r0
            X.004 r0 = r3.A1L
            java.lang.Object r0 = r0.get()
            X.1PZ r0 = (X.AnonymousClass1PZ) r0
            r2.A08 = r0
        L_0x009a:
            r3 = 7
            X.7oi r0 = new X.7oi
            r0.<init>(r2, r3)
            r2.A0a = r0
            r3 = 8
            X.7oi r0 = new X.7oi
            r0.<init>(r2, r3)
            r2.A0Z = r0
            com.whatsapp.calling.callgrid.view.CallGrid$$ExternalSyntheticLambda3 r0 = new com.whatsapp.calling.callgrid.view.CallGrid$$ExternalSyntheticLambda3
            r0.<init>(r2)
            r2.A0Y = r0
            r14 = 0
            X.7p5 r0 = new X.7p5
            r0.<init>(r2, r14)
            r2.A0i = r0
            X.60n r0 = new X.60n
            r0.<init>(r2)
            r2.A0e = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r1)
            r0 = 2131624309(0x7f0e0175, float:1.8875794E38)
            r10 = 1
            r3.inflate(r0, r2, r10)
            r0 = 2131428471(0x7f0b0477, float:1.8478587E38)
            androidx.recyclerview.widget.RecyclerView r3 = X.C90504aG.A0J(r2, r0)
            r2.A0c = r3
            r0 = 2131428468(0x7f0b0474, float:1.8478581E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.C90504aG.A0J(r2, r0)
            r2.A0b = r4
            java.lang.String r0 = "CallGrid/constructor Setting adapters"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4mn r0 = r2.A05
            r3.setAdapter(r0)
            X.52T r0 = r2.A06
            r4.setAdapter(r0)
            android.content.res.Resources r5 = r2.getResources()
            r0 = 2131168785(0x7f070e11, float:1.7951882E38)
            int r7 = r5.getDimensionPixelSize(r0)
            X.0ts r0 = r2.A0G
            boolean r9 = X.C36351kA.A1Y(r0)
            r8 = 3
            X.6tR r6 = r2.A03
            X.4nA r5 = new X.4nA
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A0t(r5)
            X.52T r0 = r2.A06
            r0.A00 = r7
            X.13J r0 = r2.A0I
            boolean r0 = r0.BN6()
            if (r0 == 0) goto L_0x0117
            r5.A02 = r10
        L_0x0117:
            r0 = 2131428473(0x7f0b0479, float:1.8478591E38)
            android.view.View r0 = X.C012005e.A02(r2, r0)
            r2.A0n = r0
            r0 = 2131428467(0x7f0b0473, float:1.847858E38)
            android.view.View r0 = X.C012005e.A02(r2, r0)
            r2.A0l = r0
            r0 = 2131431162(0x7f0b0efa, float:1.8484045E38)
            android.view.View r0 = X.C012005e.A02(r2, r0)
            r2.A0U = r0
            r0 = 2131433455(0x7f0b17ef, float:1.8488696E38)
            android.view.View r0 = X.C012005e.A02(r2, r0)
            r2.A0W = r0
            r0 = 2131432730(0x7f0b151a, float:1.8487226E38)
            android.view.View r8 = X.C012005e.A02(r2, r0)
            r2.A0m = r8
            r0 = 2131428469(0x7f0b0475, float:1.8478583E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r2, r0)
            r2.A0X = r0
            r0 = 2131428470(0x7f0b0476, float:1.8478585E38)
            android.view.View r0 = X.C012005e.A02(r2, r0)
            r2.A0V = r0
            android.graphics.drawable.GradientDrawable$Orientation r7 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            int[] r6 = X.C36441kJ.A1O()
            android.content.Context r5 = r2.getContext()
            r0 = 2131099853(0x7f0600cd, float:1.781207E38)
            int r0 = X.AnonymousClass00F.A00(r5, r0)
            r6[r14] = r0
            android.content.Context r5 = r2.getContext()
            r0 = 2131102402(0x7f060ac2, float:1.781724E38)
            int r0 = X.AnonymousClass00F.A00(r5, r0)
            r6[r10] = r0
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r7, r6)
            r8.setBackground(r0)
            X.0ts r0 = r2.A0G
            boolean r7 = X.C36351kA.A1Y(r0)
            r6 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            android.view.View r0 = r2.A0U
            if (r7 == 0) goto L_0x027a
            r0.setRotation(r6)
            android.view.View r0 = r2.A0W
            r0.setRotation(r5)
        L_0x0193:
            A03(r2)
            X.5lS r7 = new X.5lS
            r7.<init>(r2)
            X.4oS r6 = new X.4oS
            r6.<init>()
            r2.A0p = r6
            X.5lR r0 = new X.5lR
            r0.<init>(r2)
            r6.A00 = r0
            r6.A00 = r14
            X.6tR r0 = r2.A03
            com.whatsapp.calling.callgrid.view.CallGridLayoutManager r5 = new com.whatsapp.calling.callgrid.view.CallGridLayoutManager
            r5.<init>(r0, r6)
            r2.A0f = r5
            r5.A02 = r7
            r0 = 0
            r5.A1M(r0)
            int r0 = r5.A01
            if (r14 == r0) goto L_0x01c3
            r5.A01 = r14
            r5.A0S()
        L_0x01c3:
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r14)
            r2.A0o = r0
            r4.setLayoutManager(r0)
            r0 = 0
            r4.setItemAnimator(r0)
            X.C163327q1.A00(r4, r2, r14)
            X.4mF r0 = new X.4mF
            r0.<init>()
            r0.A07(r4)
            r3.setLayoutManager(r5)
            r3.setItemAnimator(r6)
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131168784(0x7f070e10, float:1.795188E38)
            int r13 = r4.getDimensionPixelSize(r0)
            X.0ts r0 = r2.A0G
            boolean r15 = X.C36351kA.A1Y(r0)
            X.6tR r12 = r2.A03
            X.4nA r11 = new X.4nA
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r2.A0g = r11
            r3.A0t(r11)
            r2.A0N = r14
            r0 = 2131432732(0x7f0b151c, float:1.848723E38)
            android.view.View r3 = X.C012005e.A02(r2, r0)
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r3
            r2.A0h = r3
            X.6rL r0 = new X.6rL
            r0.<init>(r2)
            r3.A05 = r0
            r0 = 2131430357(0x7f0b0bd5, float:1.8482413E38)
            android.view.View r0 = X.C012005e.A02(r2, r0)
            com.whatsapp.calling.callgrid.view.FocusViewContainer r0 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r0
            r2.A0q = r0
            X.5lQ r0 = new X.5lQ
            r0.<init>()
            r2.A0d = r0
            X.0yC r0 = r2.A0H
            boolean r3 = X.C34681hT.A0M(r0)
            r0 = 2131431337(0x7f0b0fa9, float:1.84844E38)
            if (r3 == 0) goto L_0x0235
            r0 = 2131434969(0x7f0b1dd9, float:1.8491767E38)
        L_0x0235:
            X.1RJ r0 = X.C36341k9.A0X(r2, r0)
            r2.A0r = r0
            r0 = 2131435214(0x7f0b1ece, float:1.8492264E38)
            X.1RJ r0 = X.C36341k9.A0X(r2, r0)
            r2.A0s = r0
            r0 = 2131428464(0x7f0b0470, float:1.8478573E38)
            X.1RJ r0 = X.C36341k9.A0X(r2, r0)
            r2.A0j = r0
            r0 = 2131434204(0x7f0b1adc, float:1.8490215E38)
            X.1RJ r3 = X.C36341k9.A0X(r2, r0)
            r2.A0k = r3
            X.13J r0 = r2.A0I
            boolean r0 = r0.BMU()
            if (r0 == 0) goto L_0x0279
            r0 = 2131234306(0x7f080e02, float:1.8084774E38)
            X.0BQ r0 = X.AnonymousClass0BQ.A03(r1, r0)
            r2.A00 = r0
            X.7on r0 = new X.7on
            r0.<init>(r2, r10)
            r2.A0R = r0
            android.view.View r1 = r3.A01()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.0BQ r0 = r2.A00
            r1.setImageDrawable(r0)
        L_0x0279:
            return
        L_0x027a:
            r0.setRotation(r5)
            android.view.View r0 = r2.A0W
            r0.setRotation(r6)
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private AnonymousClass0D3 A00(C129066Eu r5) {
        int i;
        RecyclerView recyclerView;
        C96104mn r2 = this.A05;
        int i2 = 0;
        while (true) {
            List list = r2.A08;
            if (i >= list.size()) {
                break;
            } else if (!C129066Eu.A00(r5, (C129066Eu) list.get(i))) {
                i2 = i + 1;
            } else if (i >= 0) {
                recyclerView = this.A0c;
            }
        }
        AnonymousClass52T r22 = this.A06;
        i = 0;
        while (true) {
            List list2 = r22.A08;
            if (i >= list2.size()) {
                return null;
            }
            if (!C129066Eu.A00(r5, (C129066Eu) list2.get(i))) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                recyclerView = this.A0b;
            }
        }
        return recyclerView.A0Q(i);
    }

    public static void A03(CallGrid callGrid) {
        View view = callGrid.A0U;
        RecyclerView recyclerView = callGrid.A0b;
        int i = 0;
        view.setVisibility(C36351kA.A00(recyclerView.canScrollHorizontally(-1) ? 1 : 0));
        View view2 = callGrid.A0W;
        if (!recyclerView.canScrollHorizontally(1)) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A0c.canScrollVertically(-1) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.whatsapp.calling.callgrid.view.CallGrid r4) {
        /*
            android.view.View r2 = r4.A0n
            boolean r0 = r4.A0N
            r3 = 0
            if (r0 != 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0c
            r0 = -1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r2.setVisibility(r0)
            android.view.View r2 = r4.A0l
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0c
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0029
        L_0x0025:
            r2.setVisibility(r3)
            return
        L_0x0029:
            r3 = 8
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.A04(com.whatsapp.calling.callgrid.view.CallGrid):void");
    }

    public static void A05(CallGrid callGrid, C108275Sw r6) {
        AnonymousClass1RJ r3;
        AnonymousClass1RJ r0;
        AnonymousClass141 r2;
        int i = 8;
        if (callGrid.A0O) {
            r3 = callGrid.A0s;
            r0 = callGrid.A0r;
        } else {
            r3 = callGrid.A0r;
            r0 = callGrid.A0s;
        }
        r0.A03(8);
        boolean z = false;
        int i2 = 8;
        if (r6 != C108275Sw.NONE) {
            z = true;
            i2 = 0;
        }
        r3.A03(i2);
        RecyclerView recyclerView = callGrid.A0c;
        int i3 = 1;
        if (z) {
            i3 = 4;
        }
        recyclerView.setImportantForAccessibility(i3);
        if (z) {
            ViewGroup viewGroup = (ViewGroup) r3.A01();
            CallGridViewModel callGridViewModel = callGrid.A07;
            if (callGridViewModel == null) {
                r2 = null;
            } else {
                r2 = callGridViewModel.A03;
            }
            View findViewById = viewGroup.findViewById(R.id.contact_photo);
            if (findViewById != null) {
                if (r2 != null && !callGrid.A0O) {
                    i = 0;
                }
                findViewById.setVisibility(i);
                if (r2 != null) {
                    A08(callGrid, r2);
                }
            }
            callGrid.setupLonelyStateText(viewGroup, r6);
            callGrid.setupLonelyStateButton(viewGroup, r2, r6);
        }
    }

    public static void A06(CallGrid callGrid, AnonymousClass6CD r6) {
        View view;
        int i;
        int i2;
        AnonymousClass1RJ r1;
        int i3;
        if (r6 != null) {
            boolean A1T = C36371kC.A1T(callGrid.A0H.A07(3153), 3);
            if (r6.A02) {
                TextView textView = callGrid.A0X;
                textView.setText(String.valueOf(r6.A01));
                if (A1T) {
                    View view2 = callGrid.A0V;
                    float f = ((float) r6.A00) * -90.0f;
                    view2.setRotation(f);
                    textView.setRotation(f);
                }
                i2 = 0;
                textView.setVisibility(0);
            } else {
                i2 = 8;
                callGrid.A0X.setVisibility(8);
            }
            callGrid.A0V.setVisibility(i2);
            if (r6.A03) {
                if (A1T) {
                    callGrid.A0k.A01().setRotation(((float) r6.A00) * -90.0f);
                }
                r1 = callGrid.A0k;
                i3 = 0;
            } else {
                r1 = callGrid.A0k;
                i3 = 8;
            }
            r1.A03(i3);
            view = callGrid.A0m;
            i = 0;
        } else {
            view = callGrid.A0m;
            i = 8;
        }
        view.setVisibility(i);
        callGrid.setSSPipIconAnimation(r6);
    }

    public static void A07(CallGrid callGrid, AnonymousClass6PI r3) {
        callGrid.A0T = AnonymousClass000.A1S(r3.A00, 2);
        callGrid.setupLonelyStateContainerMargins(callGrid.A0N);
    }

    public static void A08(CallGrid callGrid, AnonymousClass141 r5) {
        ImageView A0N2;
        if (!C34681hT.A0R(callGrid.A0H, false) && (A0N2 = C36391kE.A0N(callGrid.A0r.A01(), R.id.contact_photo)) != null) {
            AnonymousClass1RY r0 = callGrid.A0E;
            if (r0 == null) {
                r0 = callGrid.A0F.A05(callGrid.getContext(), "lonely-state-contact-photo-loader");
                callGrid.A0E = r0;
            }
            r0.A08(A0N2, r5);
        }
    }

    /* access modifiers changed from: private */
    public List getVisibleParticipantJids() {
        Collection A0I2;
        C18740tg.A0B(this.A0N);
        RecyclerView recyclerView = this.A0c;
        C18740tg.A0B(AnonymousClass000.A1V(recyclerView.getLayoutManager()));
        if (this.A0H.A0E(5200)) {
            A0I2 = C36441kJ.A16();
        } else {
            A0I2 = AnonymousClass001.A0I();
        }
        FocusViewContainer focusViewContainer = this.A0q;
        if (focusViewContainer.getVisiblePeerJid() != null) {
            A0I2.add(focusViewContainer.getVisiblePeerJid());
        }
        for (int i = 0; i <= recyclerView.getLayoutManager().A0M(); i++) {
            C97034oI r1 = (C97034oI) recyclerView.A0Q(i);
            if (r1 != null && r1.A0A() && !r1.A05.A0J) {
                A0I2.add(r1.A05.A0b);
            }
        }
        LinearLayoutManager linearLayoutManager = this.A0o;
        int A1T = linearLayoutManager.A1T();
        int A1V = linearLayoutManager.A1V();
        for (int i2 = A1T; i2 <= A1V; i2++) {
            C97034oI r3 = (C97034oI) this.A0b.A0Q(i2);
            if (r3 != null && r3.A0A()) {
                C129066Eu r0 = r3.A05;
                C18740tg.A06(r0);
                if (!r0.A0J) {
                    if (i2 == A1T || i2 == A1V) {
                        Rect A062 = AnonymousClass001.A06();
                        View view = r3.A0H;
                        view.getGlobalVisibleRect(A062);
                        if (A062.width() < view.getWidth() / 3) {
                        }
                    }
                    A0I2.add(r3.A05.A0b);
                }
            }
        }
        if (!(A0I2 instanceof List)) {
            return C36441kJ.A15(A0I2);
        }
        return (List) A0I2;
    }

    /* access modifiers changed from: private */
    public void setIsVoiceChat(boolean z) {
        this.A0O = z;
        CallGridLayoutManager callGridLayoutManager = this.A0f;
        callGridLayoutManager.A07 = z;
        if (z) {
            callGridLayoutManager.A09.post(new C1501574e(callGridLayoutManager, 3));
        }
        this.A05.A05 = z;
        this.A0g.A04 = z;
        CallGridViewModel callGridViewModel = this.A07;
        if (callGridViewModel != null && callGridViewModel.A0q.A04() != null) {
            A05(this, (C108275Sw) this.A07.A0q.A04());
        }
    }

    private void setSSPipIconAnimation(AnonymousClass6CD r4) {
        C06590Ue r1;
        AnonymousClass0BQ r2 = this.A00;
        if (r2 != null && (r1 = this.A0R) != null) {
            if (r4 == null || !r4.A03) {
                r2.A09(r1);
                if (r2.isRunning()) {
                    r2.stop();
                    return;
                }
                return;
            }
            r2.A08(r1);
            if (!r2.isRunning()) {
                r2.start();
            }
        }
    }

    private void setupLonelyStateContainerMargins(boolean z) {
        int i;
        Resources resources;
        int i2;
        if (!this.A0O && !C34681hT.A0R(this.A0H, false)) {
            View A012 = this.A0r.A01();
            ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(A012);
            Resources resources2 = getResources();
            if (z) {
                i = resources2.getDimensionPixelSize(R.dimen.f7nameremoved);
                if (!this.A0T) {
                    resources = getResources();
                    i2 = R.dimen.f7nameremoved;
                }
                resources = getResources();
                i2 = R.dimen.f7nameremoved;
            } else {
                i = resources2.getDimensionPixelSize(R.dimen.f7nameremoved);
                resources = getResources();
                i2 = R.dimen.f7nameremoved;
            }
            A0a2.setMargins(i, 0, i, resources.getDimensionPixelSize(i2));
            A012.setLayoutParams(A0a2);
        }
    }

    public void A0C() {
        setupLonelyStateText((ViewGroup) this.A0s.A01(), C108275Sw.CONNECTING);
    }

    public /* synthetic */ void A0D() {
        int size = this.A05.A08.size();
        C36321k7.A1T("CallGrid/updateGridLayoutMode, nTiles: ", AnonymousClass000.A0u(), size);
        for (int i = 0; i < size; i++) {
            C97034oI r2 = (C97034oI) this.A0c.A0Q(i);
            if ((r2 instanceof C1028252b) || (r2 instanceof C1028152a)) {
                int i2 = 2;
                if (!this.A0O) {
                    if (size <= 2) {
                        i2 = 0;
                    } else if (size <= 8) {
                        i2 = 1;
                    }
                }
                r2.A0D(i2);
            }
        }
        A04(this);
        if (this.A07 != null && this.A0N) {
            if (this.A06.A08.size() > 0 || this.A0H.A0E(5200)) {
                this.A07.A0W(getVisibleParticipantJids());
            }
        }
    }

    public void A0E(AnonymousClass012 r5, CallGridViewModel callGridViewModel, MenuBottomSheetViewModel menuBottomSheetViewModel, VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, ScreenShareViewModel screenShareViewModel) {
        if (this.A07 == null) {
            this.A07 = callGridViewModel;
            this.A09 = screenShareViewModel;
            if (screenShareViewModel != null) {
                C165167sz.A00(r5, screenShareViewModel.A0G, this, 20);
            }
            C165167sz.A00(r5, this.A07.A0L, this, 21);
            C165167sz.A00(r5, this.A07.A0l, this, 19);
            C165167sz.A00(r5, this.A07.A0J, this, 22);
            C001700s r2 = this.A07.A0O;
            PipViewContainer pipViewContainer = this.A0h;
            Objects.requireNonNull(pipViewContainer);
            C165167sz.A00(r5, r2, pipViewContainer, 27);
            C001700s r1 = this.A07.A0H;
            FocusViewContainer focusViewContainer = this.A0q;
            Objects.requireNonNull(focusViewContainer);
            C165167sz.A00(r5, r1, focusViewContainer, 26);
            C165167sz.A00(r5, this.A07.A0I, this, 14);
            C165167sz.A00(r5, this.A07.A0i, this, 33);
            C165167sz.A00(r5, this.A07.A0n, this, 15);
            C165167sz.A00(r5, this.A07.A0j, this, 16);
            C34831hi r12 = this.A07.A0m;
            CallGridLayoutManager callGridLayoutManager = this.A0f;
            Objects.requireNonNull(callGridLayoutManager);
            C165167sz.A00(r5, r12, callGridLayoutManager, 24);
            C34831hi r13 = this.A07.A0o;
            Objects.requireNonNull(callGridLayoutManager);
            C165167sz.A00(r5, r13, callGridLayoutManager, 25);
            C165167sz.A00(r5, this.A07.A0r, this, 28);
            C165167sz.A00(r5, this.A07.A0h, this, 30);
            C165167sz.A00(r5, this.A07.A0s, this, 17);
            C165167sz.A00(r5, this.A07.A0p, this, 18);
            C165167sz.A00(r5, this.A07.A0q, this, 31);
            C165167sz.A00(r5, this.A07.A0N, this, 32);
            C34831hi r14 = this.A07.A0t;
            C96104mn r22 = this.A05;
            Objects.requireNonNull(r22);
            C165167sz.A00(r5, r14, r22, 23);
            C165167sz.A00(r5, this.A07.A0g, this, 29);
            r22.A04 = callGridViewModel;
            this.A06.A04 = callGridViewModel;
            if (menuBottomSheetViewModel != null) {
                focusViewContainer.setMenuViewModel(r5, menuBottomSheetViewModel);
            }
            this.A0S = voiceChatBottomSheetViewModel;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0K;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public LinearLayout getLonelyState() {
        return (LinearLayout) this.A0r.A01();
    }

    public LinearLayout getVoiceChatLonelyStateView() {
        return (LinearLayout) this.A0s.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0282, code lost:
        if (r2.A05.A0b.equals(r3.A0b) != false) goto L_0x0284;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(com.whatsapp.calling.callgrid.view.CallGrid r11, java.util.List r12, boolean r13) {
        /*
            java.util.ArrayList r6 = X.C36441kJ.A15(r12)
            r5 = 0
            r4 = r5
            r3 = r5
            r2 = 0
        L_0x0008:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0021
            java.lang.Object r1 = r6.get(r2)
            X.6Eu r1 = (X.C129066Eu) r1
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x0019
            r3 = r1
        L_0x0019:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x001e
            r4 = r1
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0021:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0045
            com.whatsapp.calling.callgrid.view.CallGridLayoutManager r0 = r11.A0f
            int r7 = r0.A06
            X.6tR r2 = r11.A03
            int r1 = r6.size()
            boolean r0 = r11.A0M
            int r0 = r2.A01(r1, r0)
            if (r7 != r0) goto L_0x0045
            com.whatsapp.calling.callgrid.view.FocusViewContainer r0 = r11.A0q
            X.4oI r0 = r0.A05
            if (r0 == 0) goto L_0x0268
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0268
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0c
            r2.setItemAnimator(r5)
            if (r4 == 0) goto L_0x028b
            com.whatsapp.calling.callgrid.view.PipViewContainer r8 = r11.A0h
            com.whatsapp.jid.UserJid r7 = r4.A0b
            X.4oI r1 = r8.A04
            if (r1 == 0) goto L_0x0251
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0251
            X.6Eu r0 = r1.A05
            com.whatsapp.jid.UserJid r0 = r0.A0b
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0251
            android.graphics.Rect r7 = r8.getGlobalVisibleRect()
        L_0x0068:
            if (r3 == 0) goto L_0x01ce
            r6.remove(r3)
            if (r4 == 0) goto L_0x0184
            boolean r0 = X.C129066Eu.A00(r3, r4)
            if (r0 == 0) goto L_0x0184
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r11.A0h
            r0 = 8
            r3.setVisibility(r0)
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x008b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x008b
            android.animation.ValueAnimator r0 = r3.A00
            r0.cancel()
        L_0x008b:
            X.4oI r1 = r3.A04
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0098
            r1.A0B()
        L_0x0098:
            r3.A04 = r5
            r3.removeAllViews()
        L_0x009d:
            X.0D3 r0 = r11.A00(r4)
            if (r0 == 0) goto L_0x00a8
            X.4oI r0 = (X.C97034oI) r0
            r0.A0B()
        L_0x00a8:
            com.whatsapp.calling.callgrid.view.FocusViewContainer r3 = r11.A0q
            r5 = 8
            X.4oI r1 = r3.A05
            if (r1 == 0) goto L_0x00cd
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x00cd
            X.6Eu r0 = r1.A05
            boolean r0 = X.C129066Eu.A00(r4, r0)
            if (r0 == 0) goto L_0x00c8
            boolean r1 = r4.A0A
            X.4oI r0 = r3.A05
            X.6Eu r0 = r0.A05
            boolean r0 = r0.A0A
            if (r1 == r0) goto L_0x0103
        L_0x00c8:
            X.4oI r0 = r3.A05
            r0.A0B()
        L_0x00cd:
            android.widget.FrameLayout r9 = r3.A01
            r9.removeAllViews()
            X.4mn r8 = r3.A04
            boolean r1 = r4.A0A
            r0 = 2
            if (r1 == 0) goto L_0x00da
            r0 = 6
        L_0x00da:
            X.0D3 r1 = r8.A05(r3, r0)
            X.4oI r1 = (X.C97034oI) r1
            r3.A05 = r1
            boolean r0 = r1 instanceof X.AnonymousClass52X
            if (r0 == 0) goto L_0x00eb
            X.52X r1 = (X.AnonymousClass52X) r1
            r1.A0I()
        L_0x00eb:
            X.4oI r0 = r3.A05
            android.view.View r1 = r0.A0H
            int r0 = r4.hashCode()
            r1.setId(r0)
            X.4oI r0 = r3.A05
            android.view.View r8 = r0.A0H
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r9.addView(r8, r0)
        L_0x0103:
            X.4oI r0 = r3.A05
            if (r0 == 0) goto L_0x010a
            r0.A0H(r4)
        L_0x010a:
            com.whatsapp.WaTextView r8 = r3.A03
            r0 = 0
            r8.setVisibility(r0)
            boolean r0 = r4.A0J
            if (r0 == 0) goto L_0x0178
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            r8.setText(r0)
        L_0x011a:
            int r0 = r3.getVisibility()
            if (r0 == r5) goto L_0x0124
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0146
        L_0x0124:
            android.view.ViewPropertyAnimator r0 = r3.animate()
            r0.cancel()
            r0 = 0
            r3.setVisibility(r0)
            int r0 = r7.width()
            if (r0 == 0) goto L_0x0146
            int r0 = r7.height()
            if (r0 == 0) goto L_0x0146
            android.widget.FrameLayout r4 = r3.A01
            r1 = 1
            X.7qY r0 = new X.7qY
            r0.<init>(r7, r3, r1)
            r4.addOnLayoutChangeListener(r0)
        L_0x0146:
            if (r13 != 0) goto L_0x0291
            X.0CP r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x0154
            android.os.Parcelable r0 = r0.A0z()
            r11.A0Q = r0
        L_0x0154:
            X.4mn r0 = r11.A05
            r0.A0R(r6)
            boolean r0 = r11.A0P
            if (r0 == 0) goto L_0x016a
            r2.A0b()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A07
            if (r0 == 0) goto L_0x016a
            X.1hi r1 = r0.A0s
            r0 = 0
            X.C36341k9.A18(r1, r0)
        L_0x016a:
            android.os.Parcelable r1 = r11.A0Q
            if (r1 == 0) goto L_0x0177
            X.0CP r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x0177
            r0.A19(r1)
        L_0x0177:
            return
        L_0x0178:
            X.171 r1 = r3.A07
            X.141 r0 = r4.A0a
            java.lang.String r0 = r1.A0H(r0)
            r8.setText(r0)
            goto L_0x011a
        L_0x0184:
            X.0D3 r0 = r11.A00(r3)
            if (r0 == 0) goto L_0x018f
            X.4oI r0 = (X.C97034oI) r0
            r0.A0B()
        L_0x018f:
            com.whatsapp.calling.callgrid.view.PipViewContainer r8 = r11.A0h
            r0 = 0
            r8.setVisibility(r0)
            X.4oI r10 = r8.A04
            if (r10 == 0) goto L_0x01ca
            boolean r9 = r8.A0A
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x01c4
            r1 = 1
        L_0x01a4:
            int r0 = r10.A01
            if (r1 != r0) goto L_0x01ca
            boolean r0 = r10.A0A()
            if (r0 == 0) goto L_0x01be
            X.6Eu r0 = r10.A05
            X.C18740tg.A06(r0)
            boolean r0 = X.C129066Eu.A00(r3, r0)
            if (r0 != 0) goto L_0x01be
            X.4oI r0 = r8.A04
            r0.A0B()
        L_0x01be:
            X.4oI r0 = r8.A04
            r0.A0H(r3)
            goto L_0x01f6
        L_0x01c4:
            r1 = 7
            if (r9 == 0) goto L_0x01a4
            r1 = 8
            goto L_0x01a4
        L_0x01ca:
            com.whatsapp.calling.callgrid.view.PipViewContainer.A03(r8, r3)
            goto L_0x01f6
        L_0x01ce:
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r11.A0h
            r0 = 8
            r3.setVisibility(r0)
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x01e4
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x01e4
            android.animation.ValueAnimator r0 = r3.A00
            r0.cancel()
        L_0x01e4:
            X.4oI r1 = r3.A04
            if (r1 == 0) goto L_0x01f1
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x01f1
            r1.A0B()
        L_0x01f1:
            r3.A04 = r5
            r3.removeAllViews()
        L_0x01f6:
            if (r4 != 0) goto L_0x009d
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A07
            X.00s r0 = r0.A0I
            java.lang.Object r0 = r0.A04()
            if (r0 != 0) goto L_0x0146
            com.whatsapp.calling.callgrid.view.FocusViewContainer r4 = r11.A0q
            r3 = 8
            X.4oI r1 = r4.A05
            if (r1 == 0) goto L_0x0213
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0213
            r1.A0B()
        L_0x0213:
            r4.A05 = r5
            android.widget.FrameLayout r0 = r4.A01
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r4.A02
            r0.removeAllViews()
            int r0 = r4.getVisibility()
            if (r0 == r3) goto L_0x0146
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0146
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            r0 = 1
            r4.A0A = r0
            com.whatsapp.WaTextView r0 = r4.A03
            r0.setVisibility(r3)
            android.view.ViewPropertyAnimator r1 = r4.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r3 = r1.alpha(r0)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            X.7oL r0 = new X.7oL
            r0.<init>(r4)
            X.C90514aH.A1E(r0, r1)
            goto L_0x0146
        L_0x0251:
            X.0D3 r1 = r11.A00(r4)
            if (r1 == 0) goto L_0x028b
            android.graphics.Rect r7 = X.AnonymousClass001.A06()
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0068
            android.view.View r0 = r1.A0H
            r0.getGlobalVisibleRect(r7)
            goto L_0x0068
        L_0x0268:
            if (r4 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x0284
            com.whatsapp.calling.callgrid.view.PipViewContainer r0 = r11.A0h
            X.4oI r2 = r0.A04
            if (r2 == 0) goto L_0x0284
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x0284
            com.whatsapp.jid.UserJid r1 = r3.A0b
            X.6Eu r0 = r2.A05
            com.whatsapp.jid.UserJid r0 = r0.A0b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0045
        L_0x0284:
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0c
            X.4oS r0 = r11.A0p
            r2.setItemAnimator(r0)
        L_0x028b:
            android.graphics.Rect r7 = X.AnonymousClass001.A06()
            goto L_0x0068
        L_0x0291:
            X.52T r0 = r11.A06
            r0.A0R(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGrid.A09(com.whatsapp.calling.callgrid.view.CallGrid, java.util.List, boolean):void");
    }

    public static void A0A(CallGrid callGrid, boolean z) {
        C36321k7.A1X("CallGrid/onAvSwitched, isVideoEnabled: ", AnonymousClass000.A0u(), z);
        callGrid.A0N = z;
        callGrid.A0f.A06 = z;
        callGrid.A0p.A09 = z;
        callGrid.setupLonelyStateContainerMargins(z);
    }

    /* access modifiers changed from: private */
    public void setMargins(Rect rect) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.rightMargin = rect.right;
            setLayoutParams(marginLayoutParams);
        }
    }

    private void setupLonelyStateButton(ViewGroup viewGroup, AnonymousClass141 r8, C108275Sw r9) {
        int i;
        WDSButton wDSButton = (WDSButton) viewGroup.findViewById(R.id.lonely_state_button);
        if (wDSButton != null) {
            VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = (VoipCallControlRingingDotsIndicator) viewGroup.findViewById(R.id.ringing_dots);
            if (!(r9 == C108275Sw.RINGING || voipCallControlRingingDotsIndicator == null)) {
                voipCallControlRingingDotsIndicator.clearAnimation();
                voipCallControlRingingDotsIndicator.setVisibility(8);
            }
            int ordinal = r9.ordinal();
            if (ordinal == 2 || ordinal == 6) {
                if (this.A07 != null) {
                    int i2 = 8;
                    if (r8 != null) {
                        i2 = 0;
                    }
                    wDSButton.setVisibility(i2);
                    if (r8 != null) {
                        wDSButton.setText(R.string.f12nameremoved);
                        wDSButton.setIcon(AnonymousClass00E.A00(getContext(), R.drawable.vec_ic_home_tab_chats_filled));
                        i = 33;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (ordinal != 1) {
                if (ordinal != 0) {
                    wDSButton.setVisibility(8);
                    return;
                } else if (this.A07 != null && voipCallControlRingingDotsIndicator != null) {
                    C36391kE.A1K(wDSButton);
                    wDSButton.setIcon((Drawable) null);
                    wDSButton.setVisibility(0);
                    voipCallControlRingingDotsIndicator.setVisibility(0);
                    Animation animation = voipCallControlRingingDotsIndicator.getAnimation();
                    if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
                        C92554eA r1 = new C92554eA(voipCallControlRingingDotsIndicator);
                        r1.setRepeatCount(-1);
                        voipCallControlRingingDotsIndicator.startAnimation(r1);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (this.A07 != null) {
                int i3 = 8;
                if (r8 != null) {
                    i3 = 0;
                }
                wDSButton.setVisibility(i3);
                if (r8 != null) {
                    wDSButton.setVisibility(0);
                    wDSButton.setText(R.string.f12nameremoved);
                    wDSButton.setIcon((int) R.drawable.ic_settings_notification);
                    i = 34;
                } else {
                    return;
                }
            } else {
                return;
            }
            C36361kB.A17(wDSButton, this, i);
        }
    }

    private void setupLonelyStateText(ViewGroup viewGroup, C108275Sw r7) {
        int i;
        String string;
        C61243Bc r0;
        TextView A0P2 = C36391kE.A0P(viewGroup, R.id.lonely_state_text);
        if (A0P2 != null) {
            if (r7 == C108275Sw.CONNECTING) {
                VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = this.A0S;
                if (voiceChatBottomSheetViewModel == null || (r0 = voiceChatBottomSheetViewModel.A03) == null) {
                    string = getResources().getString(R.string.f12nameremoved);
                } else {
                    string = C90474aD.A0V(this, r0).toString();
                }
                A0P2.setText(string);
            } else {
                if (r7 == C108275Sw.NO_ONE_HERE) {
                    i = R.string.f12nameremoved;
                } else {
                    C108275Sw r02 = C108275Sw.GO_TO_CHAT_WITHOUT_PARTICIPANT_LIST;
                    i = R.string.f12nameremoved;
                    if (r7 == r02) {
                        i = R.string.f12nameremoved;
                    }
                }
                A0P2.setText(i);
            }
        }
        TextView A0P3 = C36391kE.A0P(viewGroup, R.id.lonely_state_sub_text);
        if (A0P3 == null) {
            return;
        }
        if (r7 != C108275Sw.NO_ONE_HERE) {
            A0P3.setVisibility(8);
            return;
        }
        A0P3.setVisibility(0);
        A0P3.setText(C37351mE.A01(A0P3.getPaint(), AnonymousClass3UF.A02(getContext(), R.drawable.vec_ic_show_participants, R.color.f6nameremoved), getContext().getString(R.string.f12nameremoved), "%s"));
    }

    public FocusViewContainer getFocusViewContainer() {
        return this.A0q;
    }

    public PipViewContainer getPipViewContainer() {
        return this.A0h;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        PipViewContainer pipViewContainer = this.A0h;
        pipViewContainer.A01 = new Point(i, i2);
        if (pipViewContainer.isLayoutRequested()) {
            pipViewContainer.post(new C1501574e(pipViewContainer, 4));
        } else {
            PipViewContainer.A01(pipViewContainer);
        }
        int measuredHeight = (int) (0.04d * ((double) getMeasuredHeight()));
        C36321k7.A1T("CallGrid/onSizeChanged, scrolling peek height: ", AnonymousClass000.A0u(), measuredHeight);
        View view = this.A0n;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view2 = this.A0l;
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(view2);
        layoutParams.height = measuredHeight;
        A0a2.height = measuredHeight;
        if (this.A0O) {
            this.A0c.A0b();
            A0a2.leftMargin = 0;
            A0a2.rightMargin = 0;
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(A0a2);
    }

    private void setShouldInvalidateItemDecorations(boolean z) {
        this.A0P = z;
    }

    public void setCallGridListener(C157237cd r1) {
        this.A04 = r1;
    }

    public CallGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallGrid(Context context) {
        this(context, (AttributeSet) null);
    }
}
