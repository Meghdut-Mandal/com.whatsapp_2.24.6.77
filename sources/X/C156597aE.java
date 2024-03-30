package X;

import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.7aE  reason: invalid class name and case insensitive filesystem */
public final class C156597aE extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C1271967i $bloksContext;
    public final /* synthetic */ C140456lc $component;
    public final /* synthetic */ C118625oT $resolveContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156597aE(C118625oT r2, C1271967i r3, C140456lc r4) {
        super(3);
        this.$bloksContext = r3;
        this.$component = r4;
        this.$resolveContext = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        BloksEditText bloksEditText = (BloksEditText) obj2;
        C36321k7.A0x(bloksEditText, obj3);
        C125115zL A00 = AnonymousClass6XF.A00(bloksEditText, this.$resolveContext, this.$bloksContext, this.$component, obj3);
        if (this.$component.A0f(63, false)) {
            float textSize = bloksEditText.getTextSize();
            if (A00.A0F != textSize) {
                A00.A0F = textSize;
                this.$resolveContext.A00.A04(new C118805ol(new C164497ru(A00, 0), this.$component.A03));
            }
        }
        return new C111965d8(bloksEditText, this.$bloksContext, this.$component, 1);
    }
}
