package com.whatsapp.info.views;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass190;
import X.AnonymousClass1CR;
import X.AnonymousClass22V;
import X.AnonymousClass22z;
import X.AnonymousClass4C5;
import X.C225314u;
import X.C36331k8;
import X.C36431kI;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class NotificationsAndSoundsInfoView extends AnonymousClass22z {
    public AnonymousClass190 A00;
    public AnonymousClass1CR A01;
    public final AnonymousClass00T A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationsAndSoundsInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A02 = C36431kI.A1I(new AnonymousClass4C5(context));
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
    }

    public final void setChatSettingsStore$app_productinfra_chat_chat_non_modified(AnonymousClass1CR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setWaIntents$app_productinfra_chat_chat_non_modified(AnonymousClass190 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    /* access modifiers changed from: private */
    public final C225314u getActivity() {
        return (C225314u) this.A02.getValue();
    }

    public final AnonymousClass1CR getChatSettingsStore$app_productinfra_chat_chat_non_modified() {
        AnonymousClass1CR r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatSettingsStore");
    }

    public final AnonymousClass190 getWaIntents$app_productinfra_chat_chat_non_modified() {
        AnonymousClass190 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0X();
    }
}
