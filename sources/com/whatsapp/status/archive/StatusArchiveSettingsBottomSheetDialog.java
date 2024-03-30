package com.whatsapp.status.archive;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass2OA;
import X.AnonymousClass4E0;
import X.AnonymousClass4E1;
import X.AnonymousClass4HF;
import X.AnonymousClass4HG;
import X.C000800j;
import X.C001400p;
import X.C019308f;
import X.C023509x;
import X.C21010yW;
import X.C33311f5;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import X.C58332zh;
import X.C61183Aw;
import X.C84634Dz;
import X.C85554Hn;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class StatusArchiveSettingsBottomSheetDialog extends Hilt_StatusArchiveSettingsBottomSheetDialog {
    public C58332zh A00;
    public C21010yW A01;
    public C61183Aw A02;
    public final AnonymousClass00T A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return (View) new C85554Hn(layoutInflater, viewGroup, this).invoke();
    }

    public void A1J() {
        this.A02 = null;
        super.A1J();
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        A03(this, 3);
        super.onCancel(dialogInterface);
    }

    public static final void A03(StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog, int i) {
        C21010yW r2 = statusArchiveSettingsBottomSheetDialog.A01;
        if (r2 != null) {
            AnonymousClass2OA r1 = new AnonymousClass2OA();
            r1.A01 = C36361kB.A0j();
            r1.A00 = Integer.valueOf(i);
            r2.Bly(r1);
            return;
        }
        throw C36331k8.A0d("wamRuntime");
    }

    public StatusArchiveSettingsBottomSheetDialog() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass4E0(new C84634Dz(this)));
        C019308f A1A = C36441kJ.A1A(StatusArchiveSettingsViewModel.class);
        this.A03 = C36441kJ.A0a(new AnonymousClass4E1(A002), new AnonymousClass4HG(this, A002), new AnonymousClass4HF(A002), A1A);
    }

    public void A1M() {
        super.A1M();
        A03(this, 1);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C36331k8.A1T(new StatusArchiveSettingsBottomSheetDialog$onCreate$1(this, (C023509x) null), C33311f5.A00(this));
    }
}
