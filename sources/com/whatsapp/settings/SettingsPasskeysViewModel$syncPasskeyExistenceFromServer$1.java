package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass97X;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C182138ob;
import X.C182148oc;
import X.C36381kD;
import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.settings.SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1", f = "SettingsPasskeysViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ SettingsPasskeysViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(SettingsPasskeysViewModel settingsPasskeysViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = settingsPasskeysViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SettingsPasskeysViewModel$syncPasskeyExistenceFromServer$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            PasskeyServerApiImpl passkeyServerApiImpl = this.this$0.A03;
            this.label = 1;
            obj = passkeyServerApiImpl.A04(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass97X r4 = (AnonymousClass97X) obj;
        if (r4 instanceof C182148oc) {
            C001700s r0 = this.this$0.A00;
            Object obj2 = ((C182148oc) r4).A00;
            if (obj2 != null) {
                r0.A0D(obj2);
                this.this$0.A01.A1y(AnonymousClass000.A1X(obj2));
            } else {
                throw C36381kD.A0l();
            }
        } else if (r4 instanceof C182138ob) {
            Log.e("SettingsPasskeysViewModel/syncPasskeyExistenceFromServer/error", (Throwable) ((C182138ob) r4).A00);
        }
        return AnonymousClass0AJ.A00;
    }
}
