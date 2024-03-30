package com.whatsapp.info.views;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass1YC;
import X.AnonymousClass22V;
import X.AnonymousClass230;
import X.C19730wQ;
import X.C19770wU;
import X.C220412q;
import X.C225314u;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C48932iI;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class PhoneNumberPrivacyInfoView extends AnonymousClass230 {
    public C19730wQ A00;
    public C220412q A01;
    public AnonymousClass17X A02;
    public AnonymousClass1YC A03;
    public C19770wU A04;
    public AnonymousClass005 A05;
    public final C225314u A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneNumberPrivacyInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A06 = C36381kD.A0S(context);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
        setIcon((int) R.drawable.ic_pn_sharing_on_24);
        C36321k7.A0N(this);
    }

    public final void A08(AnonymousClass147 r4, AnonymousClass147 r5) {
        AnonymousClass00C.A0D(r4, 0);
        if (getChatsCache$app_productinfra_chat_chat_non_modified().A0O(r4)) {
            setVisibility(0);
            boolean A0D = getGroupParticipantsManager$app_productinfra_chat_chat_non_modified().A0D(r4);
            Context context = getContext();
            int i = R.string.f12nameremoved;
            if (A0D) {
                i = R.string.f12nameremoved;
            }
            String string = context.getString(i);
            AnonymousClass00C.A0B(string);
            setDescription((CharSequence) string);
            int i2 = 24;
            if (getGroupParticipantsManager$app_productinfra_chat_chat_non_modified().A0D(r4)) {
                i2 = 25;
            }
            setOnClickListener(new C48932iI(r5, r4, this, i2));
        }
    }

    public final void setChatsCache$app_productinfra_chat_chat_non_modified(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setGroupParticipantsManager$app_productinfra_chat_chat_non_modified(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setMeManager$app_productinfra_chat_chat_non_modified(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setPnhDailyActionLoggingStore$app_productinfra_chat_chat_non_modified(AnonymousClass1YC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers$app_productinfra_chat_chat_non_modified(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final C220412q getChatsCache$app_productinfra_chat_chat_non_modified() {
        C220412q r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final AnonymousClass005 getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified() {
        AnonymousClass005 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("dependencyBridgeRegistryLazy");
    }

    public final AnonymousClass17X getGroupParticipantsManager$app_productinfra_chat_chat_non_modified() {
        AnonymousClass17X r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public final C19730wQ getMeManager$app_productinfra_chat_chat_non_modified() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final AnonymousClass1YC getPnhDailyActionLoggingStore$app_productinfra_chat_chat_non_modified() {
        AnonymousClass1YC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pnhDailyActionLoggingStore");
    }

    public final C19770wU getWaWorkers$app_productinfra_chat_chat_non_modified() {
        C19770wU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final C225314u getActivity() {
        return this.A06;
    }
}
