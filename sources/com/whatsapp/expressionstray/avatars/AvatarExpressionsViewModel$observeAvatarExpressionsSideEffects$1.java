package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass55F;
import X.AnonymousClass55I;
import X.AnonymousClass5IC;
import X.AnonymousClass5IE;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C109325Xd;
import X.C110625ay;
import X.C110635az;
import X.C125415zs;
import X.C36331k8;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C006302t {
        public int label;

        public final C023509x create(C023509x r4) {
            return new AnonymousClass1(avatarExpressionsViewModel, r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ((AnonymousClass1) create((C023509x) obj)).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C125415zs r4;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                boolean A0J = AnonymousClass00C.A0J(((AnonymousClass55F) C110625ay.this).A00, "starred");
                AvatarExpressionsViewModel avatarExpressionsViewModel = avatarExpressionsViewModel;
                if (A0J) {
                    r4 = AnonymousClass5IE.A00;
                } else {
                    r4 = AnonymousClass5IC.A00;
                }
                AnonymousClass05L r2 = avatarExpressionsViewModel.A0I;
                C110635az r1 = (C110635az) r2.getValue();
                if (r1 instanceof AnonymousClass55I) {
                    AnonymousClass55I r12 = (AnonymousClass55I) r1;
                    r2.setValue(new AnonymousClass55I(r4, r12.A01, r12.A03, r12.A04, r12.A05, true));
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1 = new AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1(this.this$0, r4);
        avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1.L$0 = obj;
        return avatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            final C110625ay r1 = (C110625ay) this.L$0;
            if (r1 instanceof AnonymousClass55F) {
                final AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
                AnonymousClass1 r2 = new AnonymousClass1((C023509x) null);
                C36331k8.A1T(new AvatarExpressionsViewModel$launchAfterDataLoad$1(avatarExpressionsViewModel, (C023509x) null, r2), C109325Xd.A00(avatarExpressionsViewModel));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$observeAvatarExpressionsSideEffects$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
