package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass0I2;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass16J;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass2IW;
import X.AnonymousClass3C3;
import X.AnonymousClass3QY;
import X.AnonymousClass3XT;
import X.AnonymousClass4VZ;
import X.C023509x;
import X.C109325Xd;
import X.C177528dw;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C20810yC;
import X.C27111My;
import X.C27121Mz;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39961uN;
import X.C41031wV;
import X.C43602Iw;
import X.C43672Jj;
import X.C48812i6;
import X.C57232xu;
import X.C57242xv;
import X.C64883Pu;
import X.C66963Xz;
import X.C80073uk;
import X.C81703xR;
import X.C83694Aj;
import X.C83704Ak;
import X.C83714Al;
import X.C83724Am;
import X.C83734An;
import X.C84954Ff;
import X.C86114Jr;
import X.C86124Js;
import X.C86134Jt;
import X.C87214Nx;
import X.C88554Td;
import X.C89004Uw;
import X.C89014Ux;
import X.C89334Wd;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import java.util.ArrayList;
import java.util.Collections;

public final class ReportToAdminMessagesActivity extends AnonymousClass2IW implements C89004Uw {
    public C19460v5 A00;
    public C57232xu A01;
    public AnonymousClass3C3 A02;
    public AnonymousClass1XY A03;
    public C87214Nx A04;
    public C43602Iw A05;
    public C41031wV A06;
    public C43672Jj A07;
    public C64883Pu A08;
    public boolean A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;

    public int getContainerType() {
        return 6;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            ArrayList A052 = this.A00.A05();
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19460v5 r1 = this.A00;
                if (r1 == null) {
                    throw C36331k8.A0d("advertiseForwardMediaHelper");
                } else if (r1.A05()) {
                    r1.A02();
                    throw AnonymousClass001.A0A("handleAdvertiseForwardClick");
                }
            } else {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
                if (A052.isEmpty() || stringArrayListExtra == null) {
                    this.A05.A06(R.string.f12nameremoved, 0);
                } else {
                    ArrayList A062 = AnonymousClass143.A06(AnonymousClass11F.class, stringArrayListExtra);
                    boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                    String stringExtra = intent.getStringExtra("appended_message");
                    AnonymousClass3XT r6 = null;
                    if (AnonymousClass143.A0N(A062)) {
                        Bundle extras = intent.getExtras();
                        C18740tg.A06(extras);
                        C64883Pu r0 = this.A08;
                        if (r0 != null) {
                            AnonymousClass00C.A0B(extras);
                            r6 = r0.A01(extras);
                        } else {
                            throw C36331k8.A0d("statusAudienceRepository");
                        }
                    }
                    AnonymousClass1X4 r4 = this.A00.A07;
                    AnonymousClass1XY r5 = this.A03;
                    if (r5 != null) {
                        ArrayList A15 = C36441kJ.A15(A052);
                        Collections.sort(A15, C81703xR.A00);
                        r4.A0H(r5, r6, stringExtra, A15, A062, booleanExtra);
                        if (A062.size() != 1 || (A062.get(0) instanceof C177528dw)) {
                            Bvu(A062);
                        } else {
                            C36391kE.A1A(this, this.A01, C36371kC.A0a(this.A00.A0C, A062, 0), C36441kJ.A0j());
                        }
                    } else {
                        throw C36331k8.A0d("sendMedia");
                    }
                }
            }
            B7Q();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A2u();
        boolean A1W = C36381kD.A1W(this);
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new C66963Xz(this, 11));
        }
        AnonymousClass16J r1 = this.A00.A0Z;
        AnonymousClass00T r3 = this.A0D;
        r1.registerObserver(((C39961uN) r3.getValue()).A05);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        RecyclerView recyclerView = (RecyclerView) findViewById(16908298);
        if (recyclerView != null) {
            C36351kA.A1F(recyclerView, A1W ? 1 : 0);
            AnonymousClass0I2 r12 = new AnonymousClass0I2(this);
            Drawable A002 = AnonymousClass00E.A00(this, R.drawable.divider_gray);
            if (A002 != null) {
                r12.A00 = A002;
                recyclerView.A0t(r12);
                C48812i6 r10 = new C48812i6(this, this.A01, 47);
                C57232xu r4 = this.A01;
                if (r4 != null) {
                    AnonymousClass1RY A052 = this.A00.A0H.A05(this, "report-to-admin");
                    AnonymousClass3QY r7 = this.A00.A0L;
                    AnonymousClass00C.A08(r7);
                    C27121Mz r13 = r4.A00;
                    C41031wV r42 = new C41031wV((C57242xv) r13.A00.A1A.get(), A052, r7, this, C36351kA.A0n(r13.A01), r10);
                    this.A06 = r42;
                    recyclerView.setAdapter(r42);
                } else {
                    throw C36331k8.A0d("adapterFactory");
                }
            }
        }
        C36351kA.A1U(this.A0B);
        C88554Td.A00(this, ((C39961uN) r3.getValue()).A02, new C86114Jr(this), 49);
        C80073uk.A00(this, ((C39961uN) r3.getValue()).A01, new C86124Js(this), 1);
        C39961uN r43 = (C39961uN) r3.getValue();
        r43.A04.A04(67, r43.A06.getRawString(), "ReportToAdminMessagesActivity");
        C36331k8.A1T(new ReportToAdminMessagesViewModel$fetchReportedMessages$1(r43, (C023509x) null), C109325Xd.A00(r43));
        this.A05.A01(new AnonymousClass4VZ(this, 1), this);
        C80073uk.A00(this, ((MessageSelectionViewModel) this.A0C.getValue()).A01, new C86134Jt(this), 0);
    }

    public static final void A07(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        AnonymousClass1RJ r2 = (AnonymousClass1RJ) reportToAdminMessagesActivity.A0A.getValue();
        C41031wV r0 = reportToAdminMessagesActivity.A06;
        if (r0 == null) {
            throw C36331k8.A0Y();
        }
        int A0J = r0.A0J();
        int i = 8;
        if (A0J == 0) {
            i = 0;
        }
        r2.A03(i);
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r4 = A0L.A5g;
            C36321k7.A0c(r4, this);
            C18830tt r5 = r4.A00;
            C36321k7.A0X(r4, r5, this, C36321k7.A05(r4, r5, this));
            this.A01 = (C57232xu) A0L.A1B.get();
            this.A05 = new C43602Iw((C19630wG) r4.A91.get(), (C18820ts) r4.A9X.get(), (C20810yC) r4.A02.get());
            this.A04 = (C87214Nx) A0L.A1D.get();
            this.A02 = (AnonymousClass3C3) A0L.A1Y.get();
            this.A07 = C27111My.A1b(A0L);
            this.A00 = C19470v6.A00;
            this.A08 = C36381kD.A0h(r5);
            this.A03 = C36411kG.A0Y(r4);
        }
    }

    public boolean BgA() {
        return ((MessageSelectionViewModel) this.A0C.getValue()).A0T(1);
    }

    public /* bridge */ /* synthetic */ C89014Ux getConversationRowCustomizer() {
        C43602Iw r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("rtaConversationRowCustomizer");
    }

    public void onDestroy() {
        this.A00.A0Z.unregisterObserver(((C39961uN) this.A0D.getValue()).A05);
        super.onDestroy();
    }

    public ReportToAdminMessagesActivity(int i) {
        this.A09 = false;
        C89334Wd.A00(this, 1);
    }

    public static final void A01(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        if (reportToAdminMessagesActivity.isTaskRoot()) {
            Intent A0F = C36391kE.A0F(reportToAdminMessagesActivity, C36441kJ.A0j(), ((C39961uN) reportToAdminMessagesActivity.A0D.getValue()).A06);
            AnonymousClass00C.A08(A0F);
            reportToAdminMessagesActivity.finishAndRemoveTask();
            reportToAdminMessagesActivity.startActivity(A0F);
        }
        reportToAdminMessagesActivity.finish();
    }

    public /* bridge */ /* synthetic */ AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public ReportToAdminMessagesActivity() {
        this(0);
        this.A0D = C36441kJ.A0a(new C83724Am(this), new C83734An(this), new C84954Ff(this), C36441kJ.A1A(C39961uN.class));
        this.A0C = C36431kI.A1I(new C83714Al(this));
        this.A0A = C36431kI.A1I(new C83694Aj(this));
        this.A0B = C36431kI.A1I(new C83704Ak(this));
    }
}
