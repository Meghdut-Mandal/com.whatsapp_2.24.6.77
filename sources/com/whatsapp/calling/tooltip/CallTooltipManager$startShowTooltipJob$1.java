package com.whatsapp.calling.tooltip;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0BT;
import X.AnonymousClass53P;
import X.AnonymousClass6A2;
import X.AnonymousClass6PK;
import X.AnonymousClass6T1;
import X.AnonymousClass6UI;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C107865Re;
import X.C108085Sc;
import X.C123265wD;
import X.C1266765a;
import X.C136106dm;
import X.C1501574e;
import X.C153297Nu;
import X.C18820ts;
import X.C27631Pa;
import X.C33521fV;
import X.C36341k9;
import X.C36371kC;
import X.C36401kF;
import X.C36421kH;
import X.C65103Qt;
import X.C90474aD;
import X.C90484aE;
import X.C91354bs;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.tooltip.CallTooltipManager$startShowTooltipJob$1", f = "CallTooltipManager.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
public final class CallTooltipManager$startShowTooltipJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C1266765a $config;
    public int label;
    public final /* synthetic */ AnonymousClass6T1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallTooltipManager$startShowTooltipJob$1(AnonymousClass6T1 r2, C1266765a r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$config = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CallTooltipManager$startShowTooltipJob$1(this.this$0, this.$config, r5);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        C001700s r3;
        C107865Re r2;
        C108085Sc r1;
        View findViewById;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass6T1 r12 = this.this$0;
            List list = AnonymousClass6T1.A0F;
            r12.A04.A0D(new AnonymousClass6A2(((AnonymousClass53P) this.$config).A04, C108085Sc.WILL_SHOW));
            if (((AnonymousClass53P) this.$config).A00) {
                j = 500;
            } else {
                j = 5000;
            }
            this.label = 1;
            if (C07330Xf.A00(this, j) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass6T1 r13 = this.this$0;
        List list2 = AnonymousClass6T1.A0F;
        View view = r13.A00;
        if (view == null || (findViewById = view.findViewById(R.id.screen_share_btn)) == null || !this.$config.A01((AnonymousClass6PK) C36401kF.A0m(this.this$0.A09))) {
            AnonymousClass53P r14 = (AnonymousClass53P) this.$config;
            r14.A00 = true;
            r3 = this.this$0.A04;
            r2 = r14.A04;
            r1 = C108085Sc.DID_NOT_SHOW;
        } else {
            AnonymousClass6T1 r22 = this.this$0;
            View view2 = r22.A00;
            if (view2 != null) {
                view = view2;
            }
            C123265wD r52 = r22.A06;
            AnonymousClass00C.A0D(((AnonymousClass53P) this.$config).A03, 1);
            C153297Nu r4 = new C153297Nu(this.this$0, this.$config);
            WaTextView waTextView = r52.A02;
            waTextView.setText(R.string.f12nameremoved);
            waTextView.setGravity(17);
            Context context = r52.A00;
            C33521fV.A00(context, r52.A03, context.getString(R.string.f12nameremoved));
            Drawable A00 = AnonymousClass0BT.A00((Resources.Theme) null, context.getResources(), R.drawable.call_tooltip_center);
            C18820ts.A00(r52.A04);
            waTextView.setBackground(new C91354bs(A00));
            PopupWindow popupWindow = r52.A01;
            popupWindow.setOnDismissListener(new C136106dm(r4));
            popupWindow.setOutsideTouchable(true);
            AnonymousClass6UI.A00(waTextView, r52, 2);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            waTextView.measure(0, 0);
            AnonymousClass000.A0X(context);
            int A01 = C65103Qt.A01(context, 8.0f);
            int width = iArr[0] + (findViewById.getWidth() / 2);
            int height = iArr[1] + (findViewById.getHeight() / 2);
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            int width2 = (iArr2[0] + view.getWidth()) - width;
            if (width2 < 0) {
                width2 = 0;
            }
            if (width2 > width) {
                width2 = width;
            }
            int i2 = (width2 * 2) - (A01 * 2);
            int measuredWidth = waTextView.getMeasuredWidth();
            if (i2 > measuredWidth) {
                i2 = measuredWidth;
            }
            waTextView.setWidth(i2);
            waTextView.measure(0, 0);
            AnonymousClass011 A0j = C36421kH.A0j(Integer.valueOf((width - (i2 / 2)) + C65103Qt.A01(context, 0.0f)), (height - waTextView.getMeasuredHeight()) + C65103Qt.A01(context, -18.0f));
            int A0H = C90484aE.A0H(A0j);
            int A08 = C90474aD.A08(A0j);
            popupWindow.setAnimationStyle(R.style.f13nameremoved);
            popupWindow.showAtLocation(view, 8388659, A0H, A08);
            view.postDelayed(new C1501574e(r52, 41), 10000);
            AnonymousClass53P r53 = (AnonymousClass53P) this.$config;
            C27631Pa r0 = r53.A02;
            C36341k9.A0w(C90474aD.A0F(r0).putInt("ss_tooltip_show_count", C36371kC.A01(C27631Pa.A00(r0), "ss_tooltip_show_count") + 1), "tooltip_last_shown_ms", System.currentTimeMillis());
            r53.A01 = true;
            r3 = this.this$0.A04;
            r2 = ((AnonymousClass53P) this.$config).A04;
            r1 = C108085Sc.SHOWING;
        }
        r3.A0D(new AnonymousClass6A2(r2, r1));
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallTooltipManager$startShowTooltipJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
