package com.whatsapp.bloks.binder.avatars;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6MO;
import X.C009003v;
import X.C023509x;
import X.C1271967i;
import X.C131756Qk;
import X.C140456lc;
import X.C160377ku;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bloks.binder.avatars.WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1", f = "WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6MO $args;
    public final /* synthetic */ C1271967i $bloksContext;
    public final /* synthetic */ C140456lc $component;
    public final /* synthetic */ C160377ku $expression;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1(C1271967i r2, C140456lc r3, AnonymousClass6MO r4, C160377ku r5, C023509x r6) {
        super(2, r6);
        this.$component = r3;
        this.$expression = r5;
        this.$args = r4;
        this.$bloksContext = r2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C140456lc r2 = this.$component;
        C160377ku r4 = this.$expression;
        return new WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1(this.$bloksContext, r2, this.$args, r4, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C140456lc r3 = this.$component;
            C160377ku r2 = this.$expression;
            C131756Qk.A02(this.$bloksContext, r3, this.$args, r2);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaBloksComponentFoaAvatarEditorAutogenCameraViewBinderUtil$evaluateExpression$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
