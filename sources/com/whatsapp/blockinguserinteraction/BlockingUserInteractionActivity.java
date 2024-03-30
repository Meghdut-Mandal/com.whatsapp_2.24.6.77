package com.whatsapp.blockinguserinteraction;

import X.AnonymousClass13O;
import X.AnonymousClass13P;
import X.AnonymousClass190;
import X.AnonymousClass1N0;
import X.AnonymousClass1Q9;
import X.C001700s;
import X.C163027pX;
import X.C165147sx;
import X.C18800tq;
import X.C225314u;
import X.C36331k8;
import X.C36351kA;
import X.C90464aC;
import android.os.Bundle;
import com.whatsapp.R;

public final class BlockingUserInteractionActivity extends C225314u {
    public AnonymousClass13P A00;
    public AnonymousClass1Q9 A01;
    public AnonymousClass190 A02;
    public boolean A03;

    public void onCreate(Bundle bundle) {
        C165147sx r2;
        C001700s r0;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("blocking_type", 0);
        if (intExtra == 0) {
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass1Q9 r1 = this.A01;
            if (r1 != null) {
                r2 = new C165147sx(this, 43);
                r0 = r1.A03;
            } else {
                throw C36331k8.A0d("messageStoreBackup");
            }
        } else if (intExtra == 1) {
            setTitle(R.string.f12nameremoved);
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass13P r12 = this.A00;
            if (r12 != null) {
                r2 = new C165147sx(this, 44);
                r0 = ((AnonymousClass13O) r12).A00;
            } else {
                throw C36331k8.A0d("forceBlockDatabaseMigrationManager");
            }
        } else {
            return;
        }
        r0.A08(this, r2);
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            this.A0B = (AnonymousClass1N0) A0B.A00.A3P.get();
            this.A02 = C36351kA.A0h(A0B);
            this.A01 = (AnonymousClass1Q9) A0B.A5D.get();
            this.A00 = C18800tq.A8a(A0B);
        }
    }

    public BlockingUserInteractionActivity(int i) {
        this.A03 = false;
        C163027pX.A00(this, 16);
    }

    public BlockingUserInteractionActivity() {
        this(0);
    }
}
