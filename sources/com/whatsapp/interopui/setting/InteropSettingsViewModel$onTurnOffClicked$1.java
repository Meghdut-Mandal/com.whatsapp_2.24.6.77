package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3JA;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C24681Dj;
import X.C35201iJ;
import X.C36441kJ;
import X.C51772oM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.setting.InteropSettingsViewModel$onTurnOffClicked$1", f = "InteropSettingsViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
public final class InteropSettingsViewModel$onTurnOffClicked$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ InteropSettingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropSettingsViewModel$onTurnOffClicked$1(InteropSettingsViewModel interopSettingsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = interopSettingsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new InteropSettingsViewModel$onTurnOffClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropSettingsViewModel$onTurnOffClicked$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A01.A0C(new AnonymousClass3JA(C51772oM.LOADING, (Long) null, (Object) null));
            InteropSettingsViewModel interopSettingsViewModel = this.this$0;
            long currentTimeMillis = System.currentTimeMillis();
            C24681Dj r2 = interopSettingsViewModel.A05;
            r2.A09.Boy(new C35201iJ(r2));
            this.label = 1;
            long A0A = C36441kJ.A0A(currentTimeMillis);
            if (A0A >= 1000 || (obj2 = C07330Xf.A00(this, 1000 - A0A)) != r5) {
                obj2 = AnonymousClass0AJ.A00;
            }
            if (obj2 == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        try {
            this.this$0.A05.A06.A03(20240306);
        } catch (IllegalArgumentException unused) {
        }
        this.this$0.A01.A0C(new AnonymousClass3JA(C51772oM.FINISH, (Long) null, (Object) null));
        return AnonymousClass0AJ.A00;
    }
}
