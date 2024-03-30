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
import X.C131756Qk;
import X.C140456lc;
import X.C160377ku;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1", f = "ParametricSliderPreviewUnit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C1271967i $bloksContext;
    public final /* synthetic */ C140456lc $component;
    public final /* synthetic */ C160377ku $expression;
    public final /* synthetic */ int $p1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(C1271967i r2, C140456lc r3, C160377ku r4, C023509x r5, int i) {
        super(2, r5);
        this.$expression = r4;
        this.$component = r3;
        this.$p1 = i;
        this.$bloksContext = r2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C160377ku r3 = this.$expression;
        return new ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(this.$bloksContext, this.$component, r3, r8, this.$p1);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C160377ku r5 = this.$expression;
            if (r5 != null) {
                C140456lc r4 = this.$component;
                C1273868b A00 = C1273868b.A00();
                A00.A09(new Float(((float) this.$p1) / ((float) 100)), 0);
                C131756Qk.A02(this.$bloksContext, r4, C1273868b.A05(A00, this.$bloksContext, 1), r5);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
