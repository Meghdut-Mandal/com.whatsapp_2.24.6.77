package com.whatsapp.info.views;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass22V;
import X.C225314u;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C45632Sc;
import X.C48932iI;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

public final class EncryptionInfoView extends ListItemWithLeftIcon {
    public AnonymousClass17X A00;
    public AnonymousClass005 A01;
    public boolean A02;
    public final C225314u A03;

    public final void A08(C45632Sc r5, AnonymousClass147 r6, boolean z) {
        AnonymousClass00C.A0D(r6, 2);
        int i = R.string.f12nameremoved;
        int i2 = R.string.f12nameremoved;
        int i3 = 22;
        if (z) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            i3 = 23;
        }
        setOnClickListener(new C48932iI(r5, r6, this, i3));
        AnonymousClass22V.A01(getContext(), this, i);
        setDescription((CharSequence) C36381kD.A0t(this, i2));
        setVisibility(0);
    }

    public final void setDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setGroupParticipantsManager$app_productinfra_chat_chat_non_modified(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass005 getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified() {
        AnonymousClass005 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("dependencyBridgeRegistryLazy");
    }

    public final AnonymousClass17X getGroupParticipantsManager$app_productinfra_chat_chat_non_modified() {
        AnonymousClass17X r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public EncryptionInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    public final C225314u getActivity() {
        return this.A03;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EncryptionInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A03();
        this.A03 = C36381kD.A0S(context);
        setIcon((int) R.drawable.ic_ee_indicator_yes);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
        C36321k7.A0N(this);
    }
}
