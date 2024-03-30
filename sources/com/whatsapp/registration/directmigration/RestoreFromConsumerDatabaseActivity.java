package com.whatsapp.registration.directmigration;

import X.AnonymousClass00E;
import X.AnonymousClass04H;
import X.AnonymousClass12P;
import X.AnonymousClass155;
import X.AnonymousClass1CR;
import X.AnonymousClass1Q9;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1QG;
import X.AnonymousClass1RJ;
import X.AnonymousClass3HJ;
import X.AnonymousClass3T0;
import X.AnonymousClass54Q;
import X.AnonymousClass54W;
import X.C100744vb;
import X.C18800tq;
import X.C18830tt;
import X.C20280xJ;
import X.C20720y3;
import X.C24401Ch;
import X.C29301Wc;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C40031ud;
import X.C65973Ue;
import X.C67133Yq;
import X.C89084Ve;
import X.C89364Wg;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;

public class RestoreFromConsumerDatabaseActivity extends AnonymousClass155 {
    public WaTextView A00;
    public WaTextView A01;
    public C29301Wc A02;
    public GoogleDriveRestoreAnimationView A03;
    public AnonymousClass54Q A04;
    public AnonymousClass1Q9 A05;
    public AnonymousClass12P A06;
    public C20720y3 A07;
    public C20280xJ A08;
    public AnonymousClass3HJ A09;
    public C29501Ww A0A;
    public AnonymousClass1QE A0B;
    public C40031ud A0C;
    public AnonymousClass1QD A0D;
    public AnonymousClass1QG A0E;
    public C24401Ch A0F;
    public AnonymousClass1CR A0G;
    public AnonymousClass3T0 A0H;
    public AnonymousClass54W A0I;
    public AnonymousClass1RJ A0J;
    public AnonymousClass1RJ A0K;
    public AnonymousClass1RJ A0L;
    public WaTextView A0M;
    public boolean A0N;

    public void onBackPressed() {
    }

    public static void A01(RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity) {
        restoreFromConsumerDatabaseActivity.A03.A03(true);
        restoreFromConsumerDatabaseActivity.A0M.setText(R.string.f12nameremoved);
        restoreFromConsumerDatabaseActivity.A0J.A03(0);
        C67133Yq.A00(restoreFromConsumerDatabaseActivity.A0J.A01(), restoreFromConsumerDatabaseActivity, 5);
        restoreFromConsumerDatabaseActivity.A00.setVisibility(8);
    }

    public static void A07(RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = restoreFromConsumerDatabaseActivity.A03;
        if (googleDriveRestoreAnimationView.A01 != 1) {
            googleDriveRestoreAnimationView.A01();
        }
        restoreFromConsumerDatabaseActivity.A00.setVisibility(0);
        restoreFromConsumerDatabaseActivity.A0J.A03(8);
        restoreFromConsumerDatabaseActivity.A0M.setText(R.string.f12nameremoved);
        restoreFromConsumerDatabaseActivity.A01.setText(R.string.f12nameremoved);
        restoreFromConsumerDatabaseActivity.A00.setText(R.string.f12nameremoved);
    }

    public void A2F() {
        if (!this.A0N) {
            this.A0N = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A02 = (C29301Wc) A0B2.A0b.get();
            this.A07 = C36401kF.A0c(A0B2);
            this.A04 = (AnonymousClass54Q) A0B2.A1X.get();
            this.A0I = (AnonymousClass54W) A0B2.A82.get();
            this.A0H = (AnonymousClass3T0) r2.A4L.get();
            this.A0G = C36371kC.A0j(A0B2);
            this.A05 = (AnonymousClass1Q9) A0B2.A5D.get();
            this.A08 = (C20280xJ) A0B2.A7d.get();
            this.A06 = (AnonymousClass12P) A0B2.A5G.get();
            this.A0A = C36401kF.A0d(A0B2);
            this.A0B = (AnonymousClass1QE) A0B2.AFr.get();
            this.A0F = (C24401Ch) A0B2.ATe.get();
            this.A0D = (AnonymousClass1QD) A0B2.A4G.get();
            this.A0E = (AnonymousClass1QG) A0B2.AR7.get();
            this.A09 = (AnonymousClass3HJ) A0B2.A6Y.get();
        }
    }

    public RestoreFromConsumerDatabaseActivity(int i) {
        this.A0N = false;
        C89364Wg.A00(this, 4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A0M = (WaTextView) findViewById(R.id.restore_from_consumer_title);
        this.A01 = (WaTextView) findViewById(R.id.restore_from_consumer_sub_title);
        this.A00 = (WaTextView) findViewById(R.id.restore_from_consumer_bottom_info);
        this.A0J = C36351kA.A0r(this, R.id.restore_from_consumer_action_btn);
        this.A0L = C36351kA.A0r(this, R.id.restore_from_consumer_progress_description);
        this.A0K = C36351kA.A0r(this, R.id.restore_from_consumer_progress_bar);
        this.A03 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_from_consumer_animation_view);
        findViewById(R.id.restore_from_consumer_background_image).setBackgroundDrawable(new C100744vb(AnonymousClass00E.A00(this, R.drawable.graphic_migration), this.A00));
        A07(this);
        C40031ud r0 = (C40031ud) new AnonymousClass04H(new C89084Ve(this, 1), this).A00(C40031ud.class);
        this.A0C = r0;
        C65973Ue.A00(this, r0.A00, 22);
        C65973Ue.A00(this, this.A0C.A01, 23);
    }

    public RestoreFromConsumerDatabaseActivity() {
        this(0);
    }
}
