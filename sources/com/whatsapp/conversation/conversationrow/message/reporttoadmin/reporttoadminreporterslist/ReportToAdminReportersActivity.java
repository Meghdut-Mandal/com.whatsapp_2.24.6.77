package com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist;

import X.AnonymousClass155;
import X.AnonymousClass1RY;
import X.C023409w;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C40641vs;
import X.C57262xx;
import X.C89334Wd;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public final class ReportToAdminReportersActivity extends AnonymousClass155 {
    public C57262xx A00;
    public C27731Pn A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = C36351kA.A0T(r2);
            this.A00 = (C57262xx) A0L.A1E.get();
        }
    }

    public ReportToAdminReportersActivity(int i) {
        this.A02 = false;
        C89334Wd.A00(this, 2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.report_to_admin_reporters_recyclerView);
        List parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("reporters_user_jid");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C023409w.A00;
        }
        C36321k7.A0Q(recyclerView);
        C57262xx r2 = this.A00;
        if (r2 != null) {
            C27731Pn r1 = this.A01;
            if (r1 != null) {
                AnonymousClass1RY A05 = r1.A05(this, "report-to-admin");
                C18800tq r0 = r2.A00.A01;
                recyclerView.setAdapter(new C40641vs(C36361kB.A0S(r0), C36341k9.A0R(r0), A05, parcelableArrayListExtra));
                return;
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0d("adapterFactory");
    }

    public ReportToAdminReportersActivity() {
        this(0);
    }
}
