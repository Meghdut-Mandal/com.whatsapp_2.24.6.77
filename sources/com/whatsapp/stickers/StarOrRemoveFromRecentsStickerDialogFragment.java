package com.whatsapp.stickers;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass01I;
import X.AnonymousClass196;
import X.AnonymousClass1AP;
import X.AnonymousClass3LW;
import X.AnonymousClass4XS;
import X.C135066c4;
import X.C18740tg;
import X.C19770wU;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;

public class StarOrRemoveFromRecentsStickerDialogFragment extends Hilt_StarOrRemoveFromRecentsStickerDialogFragment {
    public AnonymousClass196 A00;
    public C135066c4 A01;
    public AnonymousClass1AP A02;
    public C19770wU A03;
    public AnonymousClass005 A04;
    public AnonymousClass005 A05;

    public static StarOrRemoveFromRecentsStickerDialogFragment A03(C135066c4 r3, boolean z) {
        StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = new StarOrRemoveFromRecentsStickerDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("sticker", r3);
        A07.putBoolean("avatar_sticker", z);
        starOrRemoveFromRecentsStickerDialogFragment.A17(A07);
        return starOrRemoveFromRecentsStickerDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        Bundle A0b = A0b();
        Parcelable parcelable = A0b.getParcelable("sticker");
        C18740tg.A06(parcelable);
        this.A01 = (C135066c4) parcelable;
        AnonymousClass4XS r2 = new AnonymousClass4XS(6, this, A0b.getBoolean("avatar_sticker", false));
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        A002.A0K(R.string.f12nameremoved);
        A002.setPositiveButton(R.string.f12nameremoved, r2);
        A002.A0g(r2, R.string.f12nameremoved);
        return C36431kI.A0R(r2, A002, R.string.f12nameremoved);
    }
}
