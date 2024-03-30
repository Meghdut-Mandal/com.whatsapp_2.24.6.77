package com.whatsapp.migration.export.ui;

import X.AnonymousClass4XN;
import X.AnonymousClass6WX;
import X.C010804n;
import X.C03570Gk;
import X.C135466ck;
import X.C18740tg;
import X.C18800tq;
import X.C225314u;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import X.C89344We;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class ExportMigrationDataExportedActivity extends C225314u {
    public AnonymousClass6WX A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
            this.A00 = (AnonymousClass6WX) A0B.AGq.get();
        }
    }

    public ExportMigrationDataExportedActivity(int i) {
        this.A01 = false;
        C89344We.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36391kE.A15(this, R.string.f12nameremoved);
        C36321k7.A0P(this);
        TextView A0H = C36401kF.A0H(this, R.id.export_migrate_title);
        TextView A0H2 = C36401kF.A0H(this, R.id.export_migrate_sub_title);
        TextView A0H3 = C36401kF.A0H(this, R.id.export_migrate_main_action);
        View A0B = C03570Gk.A0B(this, R.id.export_migrate_sub_action);
        ImageView A0P = C36431kI.A0P(this, R.id.export_migrate_image_view);
        A0H3.setVisibility(0);
        A0H3.setText(R.string.f12nameremoved);
        A0B.setVisibility(8);
        C010804n A002 = C010804n.A00((Resources.Theme) null, getResources(), R.drawable.vec_android_to_ios_in_progress);
        C18740tg.A07(A002, "ExportMigrationDataExportedActivity/getVectorDrawable/drawableId is invalid");
        A0P.setImageDrawable(A002);
        A0H3.setOnClickListener(new C135466ck(this, 44));
        A0H.setText(R.string.f12nameremoved);
        A0H2.setText(R.string.f12nameremoved);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C39001qm A012 = C39001qm.A01(this, getString(R.string.f12nameremoved));
        A012.A0i((DialogInterface.OnClickListener) null, getString(R.string.f12nameremoved));
        String string = getString(R.string.f12nameremoved);
        A012.A00.A0Q(new AnonymousClass4XN(this, 37), string);
        A012.A0b();
        return true;
    }

    public ExportMigrationDataExportedActivity() {
        this(0);
    }
}
