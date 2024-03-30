package androidx.compose.material3;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6O8;
import X.C009003v;
import X.C023509x;
import X.C132336Td;
import X.C15680no;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$3", f = "Button.kt", i = {}, l = {869}, m = "invokeSuspend", n = {}, s = {})
public final class ButtonElevation$animateElevation$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C132336Td $animatable;
    public final /* synthetic */ C15680no $interaction;
    public final /* synthetic */ float $target;
    public int label;
    public final /* synthetic */ AnonymousClass6O8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$3(C132336Td r2, C15680no r3, AnonymousClass6O8 r4, C023509x r5, float f) {
        super(2, r5);
        this.$animatable = r2;
        this.this$0 = r4;
        this.$target = f;
        this.$interaction = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new ButtonElevation$animateElevation$3(this.$animatable, this.$interaction, this.this$0, r8, this.$target);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r0 != r5) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof X.C136636ek) != false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r6) goto L_0x00bd
            X.AnonymousClass0AN.A00(r8)
        L_0x000c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x000f:
            X.AnonymousClass0AN.A00(r8)
            X.6Td r0 = r7.$animatable
            X.7n5 r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.72X r0 = (X.AnonymousClass72X) r0
            float r2 = r0.A00
            X.6O8 r1 = r7.this$0
            float r0 = r1.A02
            int r0 = java.lang.Float.compare(r2, r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0098
            long r0 = X.C133206Xf.A03
            X.6er r3 = new X.6er
            r3.<init>(r0)
        L_0x0034:
            X.6Td r2 = r7.$animatable
            float r4 = r7.$target
            X.0no r1 = r7.$interaction
            r7.label = r6
            X.6eD r0 = X.C113955gP.A00
            if (r1 == 0) goto L_0x0062
            boolean r0 = r1 instanceof X.C136706er
            if (r0 != 0) goto L_0x0050
            boolean r0 = r1 instanceof X.C136626ej
            if (r0 != 0) goto L_0x0050
            boolean r0 = r1 instanceof X.C136646el
            if (r0 != 0) goto L_0x0050
            boolean r0 = r1 instanceof X.C136636ek
            if (r0 == 0) goto L_0x007a
        L_0x0050:
            X.6eD r3 = X.C113955gP.A00
        L_0x0052:
            X.72X r1 = new X.72X
            r1.<init>(r4)
            java.lang.Object r0 = r2.A02()
            java.lang.Object r0 = r2.A03(r3, r1, r0, r7)
        L_0x005f:
            if (r0 != r5) goto L_0x000c
        L_0x0061:
            return r5
        L_0x0062:
            if (r3 == 0) goto L_0x007a
            boolean r0 = r3 instanceof X.C136706er
            if (r0 != 0) goto L_0x0077
            boolean r0 = r3 instanceof X.C136626ej
            if (r0 != 0) goto L_0x0077
            boolean r0 = r3 instanceof X.C136646el
            if (r0 == 0) goto L_0x0073
            X.6eD r3 = X.C113955gP.A02
            goto L_0x0052
        L_0x0073:
            boolean r0 = r3 instanceof X.C136636ek
            if (r0 == 0) goto L_0x007a
        L_0x0077:
            X.6eD r3 = X.C113955gP.A01
            goto L_0x0052
        L_0x007a:
            X.72X r1 = new X.72X
            r1.<init>(r4)
            X.5nX r4 = r2.A03
            r0 = 0
            androidx.compose.animation.core.Animatable$snapTo$2 r3 = new androidx.compose.animation.core.Animatable$snapTo$2
            r3.<init>(r2, r1, r0)
            X.5RS r2 = X.AnonymousClass5RS.Default
            r1 = 0
            androidx.compose.animation.core.MutatorMutex$mutate$2 r0 = new androidx.compose.animation.core.MutatorMutex$mutate$2
            r0.<init>(r2, r4, r1, r3)
            java.lang.Object r0 = X.C009403z.A00(r7, r0)
            if (r0 == r5) goto L_0x0061
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x005f
        L_0x0098:
            float r0 = r1.A01
            int r0 = java.lang.Float.compare(r2, r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 == 0) goto L_0x00aa
            X.6el r3 = new X.6el
            r3.<init>()
            goto L_0x0034
        L_0x00aa:
            float r0 = r1.A00
            int r0 = java.lang.Float.compare(r2, r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 == 0) goto L_0x0034
            X.6ek r3 = new X.6ek
            r3.<init>()
            goto L_0x0034
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation$animateElevation$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ButtonElevation$animateElevation$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
