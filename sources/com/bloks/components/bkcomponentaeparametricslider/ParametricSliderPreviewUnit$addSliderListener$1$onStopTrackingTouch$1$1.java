package com.bloks.components.bkcomponentaeparametricslider;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C1271967i;
import X.C1273868b;
import X.C128436Cg;
import X.C131756Qk;
import X.C140456lc;
import X.C160377ku;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1", f = "ParametricSliderPreviewUnit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C1271967i $bloksContext;
    public final /* synthetic */ C140456lc $component;
    public final /* synthetic */ C160377ku $expression;
    public final /* synthetic */ C128436Cg $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1(C128436Cg r2, C1271967i r3, C140456lc r4, C160377ku r5, C023509x r6) {
        super(2, r6);
        this.$expression = r5;
        this.$component = r4;
        this.$it = r2;
        this.$bloksContext = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C160377ku r4 = this.$expression;
        return new ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1(this.$it, this.$bloksContext, this.$component, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C160377ku r5 = this.$expression;
            if (r5 != null) {
                C140456lc r4 = this.$component;
                C1273868b A00 = C1273868b.A00();
                A00.A09(new Float(((float) this.$it.A00) / ((float) 100)), 0);
                C131756Qk.A02(this.$bloksContext, r4, C1273868b.A05(A00, this.$bloksContext, 1), r5);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
