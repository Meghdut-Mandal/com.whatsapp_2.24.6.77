package com.whatsapp.info.views;

import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass1CR;
import X.AnonymousClass22V;
import X.AnonymousClass22y;
import X.C225314u;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C48942iJ;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class CustomNotificationsInfoView extends AnonymousClass22y {
    public AnonymousClass1CR A00;
    public final C225314u A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomNotificationsInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A01 = C36381kD.A0S(context);
        A04(R.drawable.vec_ic_music_note, false);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
        setDescription((int) R.string.f12nameremoved);
    }

    public final void A08(AnonymousClass147 r2) {
        AnonymousClass00C.A0D(r2, 0);
        setDescriptionVisibility(C36351kA.A00(C36361kB.A0d(r2, getChatSettingsStore$app_productinfra_chat_chat_non_modified()).A0L ? 1 : 0));
        setOnClickListener(new C48942iJ(this, r2));
    }

    public final void setChatSettingsStore$app_productinfra_chat_chat_non_modified(AnonymousClass1CR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1CR getChatSettingsStore$app_productinfra_chat_chat_non_modified() {
        AnonymousClass1CR r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatSettingsStore");
    }

    public final C225314u getActivity() {
        return this.A01;
    }
}
