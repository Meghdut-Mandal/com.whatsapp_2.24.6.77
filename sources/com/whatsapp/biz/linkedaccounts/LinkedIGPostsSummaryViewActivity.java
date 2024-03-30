package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass00C;
import X.AnonymousClass04H;
import X.AnonymousClass155;
import X.AnonymousClass3C0;
import X.AnonymousClass3NM;
import X.AnonymousClass4IY;
import X.AnonymousClass4IZ;
import X.AnonymousClass5Lb;
import X.C128636Da;
import X.C135436ch;
import X.C18800tq;
import X.C18830tt;
import X.C196169Xz;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C39671tD;
import X.C55492ui;
import X.C68103bL;
import X.C75033mZ;
import X.C80253v6;
import X.C85684Ia;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCardGrid;

public final class LinkedIGPostsSummaryViewActivity extends AnonymousClass155 {
    public Toolbar A00;
    public AnonymousClass3C0 A01;
    public AnonymousClass3NM A02;
    public C39671tD A03;
    public UserJid A04;
    public C196169Xz A05;
    public AnonymousClass5Lb A06;
    public MediaCardGrid A07;
    public boolean A08;

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = (AnonymousClass3C0) A0L.A26.get();
            this.A06 = (AnonymousClass5Lb) r1.A9T.get();
            this.A05 = (C196169Xz) r1.A9S.get();
            this.A02 = (AnonymousClass3NM) r1.A9V.get();
        }
    }

    public LinkedIGPostsSummaryViewActivity(int i) {
        this.A08 = false;
        C89314Wb.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        AnonymousClass00C.A08(intent);
        AnonymousClass3C0 r3 = this.A01;
        if (r3 != null) {
            AnonymousClass5Lb r2 = this.A06;
            if (r2 != null) {
                C196169Xz r1 = this.A05;
                if (r1 != null) {
                    C39671tD r0 = (C39671tD) new AnonymousClass04H(new C68103bL(intent, r3, r1, r2), this).A00(C39671tD.class);
                    this.A03 = r0;
                    if (r0 == null) {
                        throw C36331k8.A0d("linkedIGPostsSummaryViewModel");
                    }
                    C55492ui.A01(this, r0.A08, new AnonymousClass4IY(this), 18);
                    C39671tD r02 = this.A03;
                    if (r02 == null) {
                        throw C36331k8.A0d("linkedIGPostsSummaryViewModel");
                    }
                    C55492ui.A01(this, r02.A07, new AnonymousClass4IZ(this), 20);
                    C39671tD r03 = this.A03;
                    if (r03 == null) {
                        throw C36331k8.A0d("linkedIGPostsSummaryViewModel");
                    }
                    C55492ui.A01(this, r03.A06, new C85684Ia(this), 19);
                    C39671tD r22 = this.A03;
                    if (r22 == null) {
                        throw C36331k8.A0d("linkedIGPostsSummaryViewModel");
                    }
                    UserJid userJid = (UserJid) r22.A00.getParcelableExtra("jid");
                    if (userJid != null) {
                        r22.A02 = userJid;
                        this.A04 = userJid;
                        setContentView((int) R.layout.f9nameremoved);
                        Toolbar toolbar = (Toolbar) C36361kB.A0H(this, R.id.ig_posts_toolbar);
                        this.A00 = toolbar;
                        if (toolbar == null) {
                            throw C36331k8.A0d("toolbar");
                        }
                        toolbar.setTitle((int) R.string.f12nameremoved);
                        C36331k8.A0s(toolbar.getContext(), toolbar, this.A00, R.drawable.ic_back_gray);
                        toolbar.setNavigationOnClickListener(new C135436ch(this, 1));
                        MediaCardGrid mediaCardGrid = (MediaCardGrid) C36361kB.A0H(this, R.id.media_card_grid);
                        this.A07 = mediaCardGrid;
                        if (mediaCardGrid == null) {
                            throw C36331k8.A0d("mediaCard");
                        }
                        mediaCardGrid.setTitle(getString(R.string.f12nameremoved));
                        MediaCardGrid mediaCardGrid2 = this.A07;
                        if (mediaCardGrid2 == null) {
                            throw C36331k8.A0d("mediaCard");
                        }
                        mediaCardGrid2.A07((View.OnClickListener) null, 3);
                        C39671tD r32 = this.A03;
                        if (r32 == null) {
                            throw C36331k8.A0d("linkedIGPostsSummaryViewModel");
                        }
                        MediaCardGrid mediaCardGrid3 = this.A07;
                        if (mediaCardGrid3 == null) {
                            throw C36331k8.A0d("mediaCard");
                        }
                        AnonymousClass3C0 r12 = r32.A01;
                        UserJid userJid2 = r32.A02;
                        if (userJid2 == null) {
                            throw C36331k8.A0d("bizJid");
                        }
                        C75033mZ A002 = r12.A00(r32.A09, new C128636Da(userJid2, mediaCardGrid3.getThumbnailPixelSize(), mediaCardGrid3.getThumbnailPixelSize(), 1, true, true, true));
                        r32.A05 = A002;
                        if (!A002.A02.A09()) {
                            C75033mZ.A01(A002, -1);
                        } else {
                            C80253v6.A01(A002.A05, A002, 49);
                            A002.A00 = System.currentTimeMillis();
                        }
                        AnonymousClass3NM r23 = this.A02;
                        if (r23 != null) {
                            UserJid userJid3 = this.A04;
                            if (userJid3 == null) {
                                throw C36331k8.A0d("bizJid");
                            }
                            AnonymousClass3NM.A00(r23, userJid3, 0);
                            return;
                        }
                        throw C36331k8.A0d("linkedIGPostsLoggingHelper");
                    }
                    finish();
                    return;
                }
                throw C36331k8.A0d("imageLoader");
            }
            throw C36331k8.A0d("cacheManager");
        }
        throw C36331k8.A0d("serviceFactory");
    }

    public LinkedIGPostsSummaryViewActivity() {
        this(0);
    }
}
