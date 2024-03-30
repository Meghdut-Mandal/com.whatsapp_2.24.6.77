package com.whatsapp.report;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass155;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass2NK;
import X.AnonymousClass3DN;
import X.AnonymousClass3YH;
import X.AnonymousClass4UG;
import X.C001700s;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C19970wo;
import X.C203399nx;
import X.C20380xT;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C25271Fq;
import X.C31881cX;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C49322iv;
import X.C49852jn;
import X.C49862jo;
import X.C51622o7;
import X.C52472pU;
import X.C61843Dq;
import X.C62633Gx;
import X.C63653Kw;
import X.C65973Ue;
import X.C67133Yq;
import X.C74173lB;
import X.C76803pT;
import X.C77463qX;
import X.C89364Wg;
import X.C90394a5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class ReportActivity extends AnonymousClass155 implements AnonymousClass4UG {
    public ViewStub A00;
    public ViewStub A01;
    public C32691e2 A02;
    public C25271Fq A03;
    public C18820ts A04;
    public AnonymousClass16J A05;
    public C21010yW A06;
    public C62633Gx A07;
    public BusinessActivityReportViewModel A08;
    public AnonymousClass3DN A09;
    public C63653Kw A0A;
    public C63653Kw A0B;
    public C63653Kw A0C;
    public C61843Dq A0D;
    public C49852jn A0E;
    public C20380xT A0F;
    public AnonymousClass005 A0G;
    public AnonymousClass005 A0H;
    public AnonymousClass005 A0I;
    public C49322iv A0J;
    public C49862jo A0K;
    public boolean A0L;
    public final AnonymousClass191 A0M;

    public static void A07(C51622o7 r1, ReportActivity reportActivity, int i) {
        if (r1 == C51622o7.NEWSLETTER) {
            AnonymousClass2NK r12 = new AnonymousClass2NK();
            r12.A00 = Integer.valueOf(i);
            reportActivity.A06.Bly(r12);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0F(X.C51622o7 r4, X.C63653Kw r5) {
        /*
            r3 = this;
            X.0yC r1 = r3.A0D
            r0 = 7222(0x1c36, float:1.012E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            X.2o7 r0 = X.C51622o7.ACCOUNT
            if (r4 != r0) goto L_0x0043
            android.content.SharedPreferences r1 = X.C36331k8.A06(r3)
            java.lang.String r0 = "automatic_account_report_enabled"
        L_0x0016:
            boolean r0 = X.C36371kC.A1U(r1, r0)
        L_0x001a:
            com.whatsapp.wds.components.toggle.WDSSwitch r2 = r5.A03
            if (r2 == 0) goto L_0x0021
            r2.setChecked(r0)
        L_0x0021:
            r1 = 0
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0029
            r0.setVisibility(r1)
        L_0x0029:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x0030
            r0.setVisibility(r1)
        L_0x0030:
            com.whatsapp.TextEmojiLabel r0 = r5.A02
            if (r0 == 0) goto L_0x0037
            r0.setVisibility(r1)
        L_0x0037:
            r1 = 2
            X.4XA r0 = new X.4XA
            r0.<init>(r4, r3, r1)
            if (r2 == 0) goto L_0x0042
            r2.setOnCheckedChangeListener(r0)
        L_0x0042:
            return
        L_0x0043:
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r4 != r0) goto L_0x004e
            android.content.SharedPreferences r1 = X.C36331k8.A06(r3)
            java.lang.String r0 = "automatic_channel_report_enabled"
            goto L_0x0016
        L_0x004e:
            r0 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.A0F(X.2o7, X.3Kw):void");
    }

    public static boolean A0G(C51622o7 r2, ReportActivity reportActivity) {
        if (!reportActivity.A05.A0M()) {
            return false;
        }
        if (reportActivity.A0K != null) {
            reportActivity.A0K = null;
        }
        C49862jo r1 = new C49862jo(reportActivity, reportActivity.A05, reportActivity, r2);
        reportActivity.A0K = r1;
        C36391kE.A1Q(r1, reportActivity.A04);
        A07(r2, reportActivity, 1);
        return true;
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0H = C18840tu.A00(A0B2.AOI);
            this.A0I = C18840tu.A00(A0B2.AUB);
            this.A0G = C18840tu.A00(r1.A4e);
            this.A06 = C36351kA.A0g(A0B2);
            this.A02 = C36371kC.A0R(A0B2);
            this.A0F = C36331k8.A0I(A0B2);
            this.A04 = C36341k9.A0T(A0B2);
            this.A09 = r1.A99();
            this.A05 = C36361kB.A0Z(A0B2);
            this.A03 = C36391kE.A0d(A0B2);
            this.A0D = (C61843Dq) r1.ABi.get();
            this.A07 = (C62633Gx) r1.A4y.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        if (r0 != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bn9(X.C51622o7 r24) {
        /*
            r23 = this;
            X.2o7 r4 = X.C51622o7.ACCOUNT
            r2 = r23
            r3 = r24
            if (r3 != r4) goto L_0x00a9
            X.005 r0 = r2.A0H
            java.lang.Object r0 = r0.get()
            X.3lB r0 = (X.C74173lB) r0
            X.3Kw r12 = r2.A0B
            r9 = 2131755128(0x7f100078, float:1.9141127E38)
        L_0x0015:
            if (r12 == 0) goto L_0x004b
            X.2pU r10 = r0.A04()
            int r6 = r10.ordinal()
            r5 = 3
            r8 = 2
            r1 = 1
            r7 = 0
            if (r6 == r7) goto L_0x004f
            if (r6 == r1) goto L_0x00f2
            if (r6 == r8) goto L_0x00b8
            r1 = 4
            if (r6 == r1) goto L_0x00b8
            if (r6 != r5) goto L_0x004b
            X.2by r1 = r0.A03()
            if (r1 == 0) goto L_0x004c
            X.2by r1 = r0.A03()
            long r14 = r1.A00
        L_0x003a:
            r1 = 41
            X.3vC r13 = X.C80313vC.A00(r2, r3, r1)
            long r16 = r0.A02()
            long r18 = r0.A01()
            r12.A02(r13, r14, r16, r18)
        L_0x004b:
            return
        L_0x004c:
            r14 = -1
            goto L_0x003a
        L_0x004f:
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r3 != r0) goto L_0x008e
            r1 = 2131891477(0x7f121515, float:1.9417675E38)
        L_0x0056:
            r0 = 40
            X.3vC r0 = X.C80313vC.A00(r2, r3, r0)
            r12.A00(r0, r1)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131755128(0x7f100078, float:1.9141127E38)
            java.lang.String r1 = X.C36321k7.A0B(r1, r5, r7, r0)
            X.AnonymousClass00C.A0D(r1, r7)
            android.widget.TextView r0 = r12.A09
            r0.setText(r1)
            if (r3 != r4) goto L_0x004b
            X.0yC r1 = r2.A0D
            r0 = 455(0x1c7, float:6.38E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0088
            X.0yC r1 = r2.A0D
            r0 = 4635(0x121b, float:6.495E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x004b
        L_0x0088:
            com.whatsapp.TextEmojiLabel r0 = r12.A0D
            r0.setVisibility(r7)
            return
        L_0x008e:
            X.0yC r1 = r2.A0D
            r0 = 455(0x1c7, float:6.38E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00a5
            X.0yC r1 = r2.A0D
            r0 = 4635(0x121b, float:6.495E-42)
            boolean r0 = r1.A0E(r0)
            r1 = 2131889822(0x7f120e9e, float:1.9414318E38)
            if (r0 == 0) goto L_0x0056
        L_0x00a5:
            r1 = 2131889823(0x7f120e9f, float:1.941432E38)
            goto L_0x0056
        L_0x00a9:
            X.005 r0 = r2.A0I
            java.lang.Object r0 = r0.get()
            X.3lB r0 = (X.C74173lB) r0
            X.3Kw r12 = r2.A0C
            r9 = 2131755228(0x7f1000dc, float:1.914133E38)
            goto L_0x0015
        L_0x00b8:
            X.2pU r1 = X.C52472pU.DOWNLOAD_FAILED
            boolean r22 = X.C36361kB.A1a(r10, r1)
            X.2by r1 = r0.A03()
            if (r1 == 0) goto L_0x00f0
            X.3Qj r1 = X.AnonymousClass2bU.A00(r1)
            boolean r3 = r1.A0f
        L_0x00ca:
            X.2by r1 = r0.A03()
            if (r1 == 0) goto L_0x00ed
            X.2by r1 = r0.A03()
            long r15 = r1.A00
        L_0x00d6:
            r14 = 2131889814(0x7f120e96, float:1.9414302E38)
            r1 = 39
            X.3vC r13 = X.C80313vC.A00(r2, r0, r1)
            long r17 = r0.A02()
            long r19 = r0.A01()
            r21 = r3
            r12.A01(r13, r14, r15, r17, r19, r21, r22)
            return
        L_0x00ed:
            r15 = -1
            goto L_0x00d6
        L_0x00f0:
            r3 = 0
            goto L_0x00ca
        L_0x00f2:
            r5 = 1
            long r3 = r0.A02()
            long r10 = X.C36431kI.A08(r2)
            long r3 = r3 - r10
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 / r10
            long r3 = java.lang.Math.max(r5, r3)
            int r5 = (int) r3
            r6 = 2131889827(0x7f120ea3, float:1.9414329E38)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.0ts r3 = r2.A04
            long r0 = r0.A02()
            java.lang.String r0 = X.C55292uO.A00(r3, r8, r0)
            java.lang.String r1 = X.C36391kE.A0v(r2, r0, r4, r7, r6)
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = X.C36321k7.A0B(r0, r5, r7, r9)
            r12.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.report.ReportActivity.Bn9(X.2o7):void");
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0O(this);
        if (this.A0D.A0E(455) || this.A0D.A0E(4635)) {
            C36341k9.A13(this, R.id.report_header_divider, C36391kE.A09(this, R.id.report_header));
        } else {
            C36321k7.A0L(this, C36411kG.A0Q(this, R.id.gdpr_report_logo), this.A04, R.drawable.settings_account_info);
            TextEmojiLabel A0I2 = C36421kH.A0I(this, R.id.gdpr_report_header);
            C36321k7.A0m(this, A0I2);
            A0I2.setText(this.A0D.A00(this, this.A0F.A05("26000110"), R.string.f12nameremoved));
        }
        View findViewById = findViewById(R.id.request_gdpr_report_container);
        View findViewById2 = findViewById(R.id.request_newsletter_report_container);
        this.A00 = C36441kJ.A0S(findViewById, R.id.automatic_request_report_view_place_holder);
        this.A01 = C36441kJ.A0S(findViewById2, R.id.automatic_request_report_view_place_holder);
        ViewStub viewStub = this.A00;
        Context applicationContext = getApplicationContext();
        C21060yb r7 = this.A08;
        C18820ts r8 = this.A04;
        C20810yC r9 = this.A0D;
        C61843Dq r11 = this.A0D;
        C20380xT r12 = this.A0F;
        C51622o7 r10 = C51622o7.ACCOUNT;
        C63653Kw r3 = new C63653Kw(applicationContext, findViewById, viewStub, r7, r8, r9, r10, r11, r12);
        this.A0B = r3;
        r3.A06.setOnClickListener(new C67133Yq((Object) this, 27));
        TextEmojiLabel A0O = C36401kF.A0O(findViewById, R.id.report_item_header);
        C36321k7.A0m(this, A0O);
        C51622o7 r32 = C51622o7.NEWSLETTER;
        A0O.setText(this.A0D.A00(this, this.A0F.A05("26000110"), R.string.f12nameremoved));
        A0F(r10, this.A0B);
        View findViewById3 = findViewById(R.id.request_p2b_report_container);
        if (!this.A0D.A0E(455)) {
            C36331k8.A11(this, R.id.request_p2b_report_container);
        } else {
            Context applicationContext2 = getApplicationContext();
            C21060yb r6 = this.A08;
            C18820ts r5 = this.A04;
            C20810yC r4 = this.A0D;
            C21060yb r18 = r6;
            C18820ts r19 = r5;
            C20810yC r20 = r4;
            C63653Kw r14 = new C63653Kw(applicationContext2, findViewById3, (ViewStub) null, r18, r19, r20, C51622o7.P2B, this.A0D, this.A0F);
            this.A0A = r14;
            r14.A0C.setText(R.string.f12nameremoved);
            r14.A0B.setText(R.string.f12nameremoved);
            TextEmojiLabel textEmojiLabel = r14.A0D;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setText(R.string.f12nameremoved);
            this.A0A.A07.setVisibility(8);
            DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment = new DeleteReportConfirmationDialogFragment();
            deleteReportConfirmationDialogFragment.A00 = new C77463qX(this);
            C63653Kw r42 = this.A0A;
            r42.A06.setOnClickListener(new AnonymousClass3YH(this, deleteReportConfirmationDialogFragment, 34));
        }
        if (!this.A0D.A0E(4635)) {
            C36331k8.A11(this, R.id.request_newsletter_report_container);
        } else {
            ViewStub viewStub2 = this.A01;
            C63653Kw r112 = new C63653Kw(getApplicationContext(), findViewById2, viewStub2, this.A08, this.A04, this.A0D, r32, this.A0D, this.A0F);
            this.A0C = r112;
            r112.A0C.setText(R.string.f12nameremoved);
            r112.A0B.setText(R.string.f12nameremoved);
            TextEmojiLabel textEmojiLabel2 = r112.A0D;
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.setText(R.string.f12nameremoved);
            this.A0C.A07.setVisibility(8);
            C63653Kw r43 = this.A0C;
            r43.A06.setOnClickListener(new C67133Yq((Object) this, 28));
            TextEmojiLabel A0O2 = C36401kF.A0O(findViewById2, R.id.report_item_header);
            C36321k7.A0m(this, A0O2);
            A0O2.setText(this.A0D.A00(this, this.A0F.A02("6480469855345352").toString(), R.string.f12nameremoved));
            A0F(r32, this.A0C);
        }
        this.A05.registerObserver(this.A0M);
        A01((C74173lB) this.A0H.get(), r10);
        A01((C74173lB) this.A0I.get(), r32);
        if (this.A0D.A0E(455)) {
            BusinessActivityReportViewModel businessActivityReportViewModel = (BusinessActivityReportViewModel) C36441kJ.A0b(this).A00(BusinessActivityReportViewModel.class);
            this.A08 = businessActivityReportViewModel;
            C65973Ue.A00(this, businessActivityReportViewModel.A02, 35);
            C65973Ue.A00(this, this.A08.A00, 37);
            C65973Ue.A00(this, this.A08.A01, 36);
            BusinessActivityReportViewModel businessActivityReportViewModel2 = this.A08;
            C31881cX r72 = businessActivityReportViewModel2.A05;
            synchronized (r72) {
                int A002 = r72.A00();
                if (A002 < 0 || A002 > 4) {
                    C36321k7.A1S("BusinessActivityReportManager/validate-state/wrong-state ", AnonymousClass000.A0u(), A002);
                    r72.A03.A0z();
                } else {
                    if (A002 == 4) {
                        if (!r72.A01.A09().exists()) {
                            Log.e("BusinessActivityReportManager/validate-state/report-media-file-missing");
                            r72.A03.A15(2);
                        }
                    } else if (A002 != 2 ? A002 == 3 && r72.A01() == null : r72.A01() == null) {
                        Log.e("BusinessActivityReportManager/validate-state/report-message-missing");
                        r72.A03.A0z();
                    }
                    long A0B2 = C36341k9.A0B(C36341k9.A0E(r72.A03), "business_activity_report_expiration_timestamp");
                    if (A002 == 2) {
                        C19970wo r2 = r72.A02;
                        if (C19970wo.A00(r2) > A0B2) {
                            long A003 = C19970wo.A00(r2);
                            if (A003 > A0B2) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("BusinessActivityReportManager/validate-state/report-too-old current:");
                                A0u.append(A003);
                                C36321k7.A1V(" expired:", A0u, A0B2);
                                r72.A02();
                            }
                        }
                    }
                }
            }
            C36341k9.A16(businessActivityReportViewModel2.A02, r72.A00());
            BusinessActivityReportViewModel businessActivityReportViewModel3 = this.A08;
            C001700s r1 = businessActivityReportViewModel3.A02;
            if (r1.A04() != null && C36341k9.A07(r1) != 4) {
                C76803pT r73 = businessActivityReportViewModel3.A0C;
                if (r73.A02.A09()) {
                    AnonymousClass19A r62 = r73.A04;
                    String A092 = r62.A09();
                    AnonymousClass1AL[] r22 = new AnonymousClass1AL[1];
                    boolean A1Y = C36371kC.A1Y("action", "status", r22);
                    C203399nx r33 = new C203399nx("p2b", r22);
                    AnonymousClass1AL[] r23 = new AnonymousClass1AL[6];
                    C36341k9.A1V(r23, A1Y ? 1 : 0);
                    C36341k9.A1L("from", C36371kC.A0e(r73.A01).getRawString(), r23, 1);
                    C36351kA.A1N("xmlns", "w:biz:p2b_report", r23);
                    C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r23);
                    C36341k9.A1L("smax_id", "34", r23, 4);
                    r23[5] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092);
                    r62.A0F(r73, C36391kE.A0m(r33, r23), A092, 265, 32000);
                    z = true;
                } else {
                    z = false;
                }
                C36321k7.A1X("app/sendGetReport success:", AnonymousClass000.A0u(), z);
            }
        }
    }

    public ReportActivity(int i) {
        this.A0L = false;
        C89364Wg.A00(this, 15);
    }

    private void A01(C74173lB r3, C51622o7 r4) {
        r3.A0A();
        if (r3.A04().value < C52472pU.DOWNLOADED.value) {
            C49322iv r1 = new C49322iv(this, this, r4);
            this.A0J = r1;
            C36331k8.A1F(r1, this.A04);
        }
        Bn9(r4);
    }

    public void onDestroy() {
        super.onDestroy();
        boolean A1Z = C36411kG.A1Z(this.A0J);
        C49862jo r0 = this.A0K;
        if (r0 != null) {
            r0.A0D(A1Z);
        }
        C49852jn r02 = this.A0E;
        if (r02 != null) {
            r02.A0D(A1Z);
        }
        this.A05.unregisterObserver(this.A0M);
        this.A0B = null;
        this.A0A = null;
        this.A0C = null;
    }

    public void onStart() {
        super.onStart();
        this.A03.A03(16, "GdprReport");
        this.A03.A03(32, "BusinessActivityReport");
    }

    public ReportActivity() {
        this(0);
        this.A0M = C90394a5.A00(this, 27);
    }
}
