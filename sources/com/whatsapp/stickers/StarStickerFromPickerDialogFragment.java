package com.whatsapp.stickers;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass0FM;
import X.AnonymousClass1AP;
import X.AnonymousClass3LW;
import X.AnonymousClass6ZD;
import X.AnonymousClass7d5;
import X.C135066c4;
import X.C163297py;
import X.C18740tg;
import X.C19770wU;
import X.C24041Av;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;

public class StarStickerFromPickerDialogFragment extends Hilt_StarStickerFromPickerDialogFragment {
    public C24041Av A00;
    public AnonymousClass7d5 A01;
    public C135066c4 A02;
    public AnonymousClass1AP A03;
    public C19770wU A04;

    public static StarStickerFromPickerDialogFragment A03(C135066c4 r3) {
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("sticker", r3);
        starStickerFromPickerDialogFragment.A17(A07);
        return starStickerFromPickerDialogFragment;
    }

    public void A1O(Context context) {
        super.A1O(context);
        try {
            this.A01 = (AnonymousClass7d5) context;
        } catch (ClassCastException unused) {
        }
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass01I A0i = A0i();
        Parcelable parcelable = A0b().getParcelable("sticker");
        C18740tg.A06(parcelable);
        this.A02 = (C135066c4) parcelable;
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        A002.A0K(R.string.f12nameremoved);
        String A0n = A0n(R.string.f12nameremoved);
        A002.A0S(new C163297py(this, 41), A0n);
        A002.setNegativeButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        AnonymousClass0FM create = A002.create();
        create.setOnShowListener(new AnonymousClass6ZD(create, A0n));
        return create;
    }
}
