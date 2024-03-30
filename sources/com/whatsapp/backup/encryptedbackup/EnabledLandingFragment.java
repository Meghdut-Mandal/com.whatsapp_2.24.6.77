package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass298;
import X.C012005e;
import X.C19420v0;
import X.C20810yC;
import X.C222013h;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C48732hx;
import X.C53272r3;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public final class EnabledLandingFragment extends Hilt_EnabledLandingFragment {
    public C19420v0 A00;
    public C20810yC A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1Q(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C36331k8.A0A(this);
        TextView A0M = C36341k9.A0M(view, R.id.enc_backup_enabled_landing_password_button);
        C19420v0 r1 = encBackupViewModel.A0D;
        String A0c = r1.A0c();
        if (A0c != null && r1.A0U(A0c) > 0) {
            C36391kE.A0O(view, R.id.enc_backup_enabled_landing_privacy_notice).setText(R.string.f12nameremoved);
        }
        C19420v0 r0 = this.A00;
        if (r0 != null) {
            if (r0.A2J()) {
                TextView A0O = C36391kE.A0O(view, R.id.enc_backup_enabled_landing_restore_notice);
                Resources A0G = C36341k9.A0G(this);
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L, 64, 0);
                C36351kA.A16(A0G, A0O, A0L, R.plurals.f10nameremoved, 64);
                A0M.setText(A0a().getResources().getText(R.string.f12nameremoved));
            }
            C48732hx.A00(A0M, encBackupViewModel, 14);
            C48732hx.A00(C012005e.A02(view, R.id.enc_backup_enabled_landing_disable_button), encBackupViewModel, 15);
            C20810yC r12 = this.A01;
            if (r12 != null) {
                if (r12.A0E(5113)) {
                    C20810yC r13 = this.A01;
                    if (r13 == null) {
                        throw C36321k7.A07();
                    } else if (r13.A0E(4869)) {
                        TextView A0M2 = C36341k9.A0M(view, R.id.enc_backup_enabled_landing_privacy_notice);
                        A0M2.setText(R.string.f12nameremoved);
                        float A002 = C36441kJ.A00(C36341k9.A0G(this), R.dimen.f7nameremoved);
                        A0M2.setLineSpacing(A002, 1.0f);
                        TextView A0M3 = C36341k9.A0M(view, R.id.enc_backup_enabled_landing_restore_notice);
                        A0M3.setText(R.string.f12nameremoved);
                        A0M3.setLineSpacing(A002, 1.0f);
                    }
                }
                if (C222013h.A05) {
                    C53272r3.A00(A0a(), C36401kF.A0G(view, R.id.enc_backup_enabled_landing_image), AnonymousClass298.A00);
                    return;
                }
                return;
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0d("waSharedPreferences");
    }
}
