package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass04F;
import X.AnonymousClass07B;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass17X;
import X.AnonymousClass1RJ;
import X.C011504z;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C39381sB;
import X.C46172Vi;
import X.C65533Sl;
import X.C89334Wd;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

public final class GroupPendingParticipantsActivity extends AnonymousClass155 {
    public AnonymousClass17X A00;
    public boolean A01;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A0E = this.A0D.A0E(3571);
        setTitle(R.string.f12nameremoved);
        String stringExtra = C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("gid");
        if (stringExtra != null) {
            AnonymousClass17X r1 = this.A00;
            if (r1 != null) {
                C65533Sl r0 = AnonymousClass147.A01;
                boolean A0D = r1.A0D(C65533Sl.A04(stringExtra));
                C36321k7.A0P(this);
                ViewPager viewPager = (ViewPager) C36361kB.A0H(this, R.id.pending_participants_root_layout);
                AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.pending_participants_tabs);
                if (A0E) {
                    A0r.A03(0);
                    AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
                    AnonymousClass00C.A08(supportFragmentManager);
                    View A012 = A0r.A01();
                    AnonymousClass00C.A08(A012);
                    viewPager.setAdapter(new C46172Vi(this, supportFragmentManager, (PagerSlidingTabStrip) A012, stringExtra, A0D));
                    ((PagerSlidingTabStrip) A0r.A01()).setViewPager(viewPager);
                    C011504z.A06(A0r.A01(), 2);
                    AnonymousClass04F.A05(A0r.A01(), 0);
                    AnonymousClass07B supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A0F(0.0f);
                        return;
                    }
                    return;
                }
                AnonymousClass01z supportFragmentManager2 = getSupportFragmentManager();
                AnonymousClass00C.A08(supportFragmentManager2);
                viewPager.setAdapter(new C39381sB(this, supportFragmentManager2, stringExtra, false, A0D));
                return;
            }
            throw C36331k8.A0d("groupParticipantsManager");
        }
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0b(A0B);
        }
    }

    public GroupPendingParticipantsActivity(int i) {
        this.A01 = false;
        C89334Wd.A00(this, 38);
    }

    public GroupPendingParticipantsActivity() {
        this(0);
    }
}
