package com.whatsapp.storage;

import X.AnonymousClass01z;
import X.AnonymousClass0BQ;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass3TF;
import X.C18740tg;
import X.C18820ts;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C39001qm;
import X.C89164Vm;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class StorageUsageDeleteCompleteDialogFragment extends Hilt_StorageUsageDeleteCompleteDialogFragment {
    public AnonymousClass17Y A00;

    public void A1L() {
        super.A1L();
        this.A02.getWindow().setLayout(C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved), -2);
    }

    public Dialog A1a(Bundle bundle) {
        Context A1D = A1D();
        Bundle A0b = A0b();
        View A0E = C36361kB.A0E(LayoutInflater.from(A1D), (ViewGroup) null, R.layout.f9nameremoved);
        ImageView A0G = C36401kF.A0G(A0E, R.id.check_mark_image_view);
        AnonymousClass0BQ A03 = AnonymousClass0BQ.A03(A1D, R.drawable.vec_storage_usage_check_mark_icon);
        C18740tg.A06(A03);
        A0G.setImageDrawable(A03);
        A03.start();
        A03.A08(new C89164Vm(this, 2));
        TextView A0O = C36391kE.A0O(A0E, R.id.title_text_view);
        C18820ts r6 = this.A01;
        Pair A002 = AnonymousClass3TF.A00(r6, A0b.getLong("deleted_disk_size"), true, false);
        A0O.setText(r6.A0I((String) A002.second, new Object[]{A002.first}, R.plurals.f10nameremoved));
        C39001qm A003 = AnonymousClass3LW.A00(A1D);
        A003.A0j(A0E);
        A003.A0r(true);
        return A003.create();
    }

    public void A1f(AnonymousClass01z r1, String str) {
        C36381kD.A1F(this, r1, str);
    }
}
