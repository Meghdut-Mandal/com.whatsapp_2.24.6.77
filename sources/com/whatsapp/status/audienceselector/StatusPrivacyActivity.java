package com.whatsapp.status.audienceselector;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass155;
import X.AnonymousClass15K;
import X.AnonymousClass164;
import X.AnonymousClass16E;
import X.AnonymousClass1Q1;
import X.AnonymousClass1UM;
import X.AnonymousClass1US;
import X.AnonymousClass3Bu;
import X.AnonymousClass3K7;
import X.AnonymousClass3OM;
import X.AnonymousClass3XT;
import X.AnonymousClass3ZU;
import X.AnonymousClass6JV;
import X.C009504a;
import X.C009904e;
import X.C134876bk;
import X.C144576sT;
import X.C159817jy;
import X.C18800tq;
import X.C18830tt;
import X.C19680wL;
import X.C19770wU;
import X.C20800yB;
import X.C21000yV;
import X.C21060yb;
import X.C27111My;
import X.C28781Ua;
import X.C29731Xt;
import X.C33511fU;
import X.C34921hr;
import X.C35011i0;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C48762i0;
import X.C48772i1;
import X.C53092ql;
import X.C599135t;
import X.C64883Pu;
import X.C65673Ta;
import X.C67103Yn;
import X.C79973ua;
import X.C81173wa;
import X.C81203wd;
import X.C89364Wg;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class StatusPrivacyActivity extends AnonymousClass155 implements AnonymousClass15K, C19680wL {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public C009904e A03;
    public AnonymousClass3Bu A04;
    public AnonymousClass164 A05;
    public WaTextView A06;
    public WaTextView A07;
    public WfalManager A08;
    public C144576sT A09;
    public AnonymousClass3XT A0A;
    public AnonymousClass16E A0B;
    public AnonymousClass3ZU A0C;
    public AnonymousClass1Q1 A0D;
    public C64883Pu A0E;
    public C29731Xt A0F;
    public C599135t A0G;
    public C159817jy A0H;
    public AnonymousClass1UM A0I;
    public AnonymousClass6JV A0J;
    public C35011i0 A0K;
    public C28781Ua A0L;
    public boolean A0M;

    private final void A07() {
        int i;
        RadioButton radioButton = this.A02;
        List list = null;
        if (radioButton == null) {
            throw C36331k8.A0d("myContactsButton");
        }
        if (radioButton.isChecked()) {
            i = 0;
        } else {
            AnonymousClass3XT r0 = this.A0A;
            if (r0 != null) {
                i = r0.A00;
                if (i == 1) {
                    list = r0.A01;
                } else {
                    list = r0.A02;
                }
            } else {
                setResult(-1, C53092ql.A00(getIntent()));
                finish();
                return;
            }
        }
        boolean A012 = C20800yB.A01(C21000yV.A01, this.A0D, 2531);
        Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
        int i2 = -1;
        if (A012) {
            i2 = 1;
        }
        C19770wU r1 = this.A04;
        AnonymousClass3Bu r2 = this.A04;
        if (r2 != null) {
            C36391kE.A1Q(r2.A00(this, list, i, i2, 300, true, true, false, true, true), r1);
            return;
        }
        throw C36331k8.A0d("saveStatusFactory");
    }

    public String BCV() {
        return "status_privacy_activity";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A13 = C36411kG.A13(view);
        C21060yb r5 = this.A08;
        AnonymousClass00C.A07(r5);
        AnonymousClass3ZU r2 = new AnonymousClass3ZU(view, (AnonymousClass012) this, r5, (List) A13, i, i2, z);
        this.A0C = r2;
        r2.A05(new C81173wa((Object) this, 18));
        AnonymousClass3ZU r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36381kD.A0k();
    }

    public void BUP(AnonymousClass3K7 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3.A02 && A3i().A06()) {
            C28781Ua r0 = this.A0L;
            if (r0 == null) {
                throw C36331k8.A0d("xFamilyGating");
            } else if (r0.A00()) {
                C81173wa.A01(this.A04, this, 21);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A0N(this).A0I(R.string.f12nameremoved);
        this.A02 = (RadioButton) C36361kB.A0H(this, R.id.my_contacts_button);
        this.A01 = (RadioButton) C36361kB.A0H(this, R.id.my_contacts_except_button);
        this.A00 = (RadioButton) C36361kB.A0H(this, R.id.only_share_with_button);
        this.A06 = (WaTextView) C36361kB.A0H(this, R.id.excluded);
        this.A07 = (WaTextView) C36361kB.A0H(this, R.id.included);
        WaTextView waTextView = this.A06;
        if (waTextView == null) {
            throw C36331k8.A0d("excludedLabel");
        }
        C33511fU.A03(waTextView);
        WaTextView waTextView2 = this.A07;
        if (waTextView2 == null) {
            throw C36331k8.A0d("includedLabel");
        }
        C33511fU.A03(waTextView2);
        A0F();
        this.A03 = BnD(new C65673Ta(this, 8), new C009504a());
        this.A0H = new C79973ua(this);
        RadioButton radioButton = this.A02;
        if (radioButton == null) {
            throw C36331k8.A0d("myContactsButton");
        }
        radioButton.setText(R.string.f12nameremoved);
        RadioButton radioButton2 = this.A01;
        if (radioButton2 == null) {
            throw C36331k8.A0d("denyListButton");
        }
        radioButton2.setText(R.string.f12nameremoved);
        RadioButton radioButton3 = this.A00;
        if (radioButton3 == null) {
            throw C36331k8.A0d("allowListButton");
        }
        radioButton3.setText(R.string.f12nameremoved);
        RadioButton radioButton4 = this.A02;
        if (radioButton4 == null) {
            throw C36331k8.A0d("myContactsButton");
        }
        C67103Yn.A00(radioButton4, this, 6);
        RadioButton radioButton5 = this.A01;
        if (radioButton5 == null) {
            throw C36331k8.A0d("denyListButton");
        }
        C67103Yn.A00(radioButton5, this, 5);
        RadioButton radioButton6 = this.A00;
        if (radioButton6 == null) {
            throw C36331k8.A0d("allowListButton");
        }
        C67103Yn.A00(radioButton6, this, 7);
        WaTextView waTextView3 = this.A06;
        if (waTextView3 == null) {
            throw C36331k8.A0d("excludedLabel");
        }
        C48762i0.A00(waTextView3, this, 49);
        WaTextView waTextView4 = this.A07;
        if (waTextView4 == null) {
            throw C36331k8.A0d("includedLabel");
        }
        C48772i1.A00(waTextView4, this, 0);
        AnonymousClass16E r0 = this.A0B;
        if (r0 != null) {
            if (!r0.A0H()) {
                C81173wa.A01(this.A04, this, 19);
            }
            AnonymousClass1Q1 r02 = this.A0D;
            if (r02 != null) {
                r02.A01(this);
                this.A07.registerObserver(this);
                if (this.A08 == null) {
                    throw C36331k8.A0d("wfalManager");
                } else if (A3i().A06()) {
                    C28781Ua r03 = this.A0L;
                    if (r03 == null) {
                        throw C36331k8.A0d("xFamilyGating");
                    } else if (r03.A00()) {
                        C35011i0 A3i = A3i();
                        ViewStub viewStub = (ViewStub) C36361kB.A0D(this, R.id.status_privacy_stub);
                        C009904e r4 = this.A03;
                        if (r4 == null) {
                            throw C36331k8.A0d("crosspostAccountUnlinkingActivityResultLauncher");
                        }
                        C159817jy r7 = this.A0H;
                        if (r7 == null) {
                            throw C36331k8.A0d("crosspostAccountLinkingResultListener");
                        }
                        AnonymousClass00C.A0D(viewStub, 0);
                        View A0E2 = C36401kF.A0E(viewStub, R.layout.f9nameremoved);
                        AnonymousClass00C.A0B(A0E2);
                        A3i.A05(A0E2, r4, this, (C134876bk) null, r7);
                        AnonymousClass1UM r1 = this.A0I;
                        if (r1 == null) {
                            throw C36331k8.A0d("fbAccountManager");
                        } else if (r1.A06(AnonymousClass1US.STATUS_PRIVACY_ACTIVITY)) {
                            C81173wa.A01(this.A04, this, 20);
                        }
                    }
                }
            } else {
                throw C36331k8.A0d("waSnackbarRegistry");
            }
        } else {
            throw C36331k8.A0d("statusStore");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A07();
        return false;
    }

    public static final AnonymousClass3XT A01(StatusPrivacyActivity statusPrivacyActivity, int i) {
        AnonymousClass16E r0 = statusPrivacyActivity.A0B;
        if (r0 != null) {
            ArrayList A0A2 = r0.A0A();
            AnonymousClass16E r02 = statusPrivacyActivity.A0B;
            if (r02 != null) {
                return new AnonymousClass3XT(A0A2, r02.A0B(), i, false, false);
            }
            throw C36331k8.A0d("statusStore");
        }
        throw C36331k8.A0d("statusStore");
    }

    private final void A0F() {
        int A052;
        RadioButton radioButton;
        AnonymousClass3XT r0 = this.A0A;
        if (r0 != null) {
            A052 = r0.A00;
        } else {
            AnonymousClass16E r02 = this.A0B;
            if (r02 != null) {
                A052 = r02.A05();
            } else {
                throw C36331k8.A0d("statusStore");
            }
        }
        A0G(this);
        if (A052 == 0) {
            radioButton = this.A02;
            if (radioButton == null) {
                throw C36331k8.A0d("myContactsButton");
            }
        } else if (A052 == 1) {
            radioButton = this.A00;
            if (radioButton == null) {
                throw C36331k8.A0d("allowListButton");
            }
        } else if (A052 == 2) {
            radioButton = this.A01;
            if (radioButton == null) {
                throw C36331k8.A0d("denyListButton");
            }
        } else {
            throw AnonymousClass001.A09("unknown status distribution mode");
        }
        radioButton.setChecked(true);
        if (this.A0D.A0E(6325)) {
            AnonymousClass3XT r03 = this.A0A;
            if (r03 == null) {
                r03 = A01(this, A052);
            }
            List list = r03.A01;
            List list2 = r03.A02;
            int size = list.size();
            int size2 = list2.size();
            WaTextView waTextView = this.A07;
            if (waTextView == null) {
                throw C36331k8.A0d("includedLabel");
            }
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            boolean A1b = C36361kB.A1b(objArr, size);
            C36351kA.A16(resources, waTextView, objArr, R.plurals.f10nameremoved, size);
            WaTextView waTextView2 = this.A06;
            if (waTextView2 == null) {
                throw C36331k8.A0d("excludedLabel");
            }
            waTextView2.setText(C36321k7.A0B(getResources(), size2, A1b ? 1 : 0, R.plurals.f10nameremoved));
        }
    }

    public static final void A0G(StatusPrivacyActivity statusPrivacyActivity) {
        RadioButton radioButton = statusPrivacyActivity.A02;
        if (radioButton == null) {
            throw C36331k8.A0d("myContactsButton");
        }
        radioButton.setChecked(false);
        RadioButton radioButton2 = statusPrivacyActivity.A00;
        if (radioButton2 == null) {
            throw C36331k8.A0d("allowListButton");
        }
        radioButton2.setChecked(false);
        RadioButton radioButton3 = statusPrivacyActivity.A01;
        if (radioButton3 == null) {
            throw C36331k8.A0d("denyListButton");
        }
        radioButton3.setChecked(false);
    }

    public static final void A0H(StatusPrivacyActivity statusPrivacyActivity, boolean z) {
        Intent A0D2;
        if (statusPrivacyActivity.A09.A2S("audience_selection_2")) {
            AnonymousClass3OM r1 = new AnonymousClass3OM(statusPrivacyActivity);
            int A002 = C36371kC.A00(z ? 1 : 0);
            A0D2 = AnonymousClass3OM.A01(r1, A002);
            C64883Pu r12 = statusPrivacyActivity.A0E;
            if (r12 != null) {
                r12.A02(A0D2, A01(statusPrivacyActivity, A002));
            } else {
                throw C36331k8.A0d("audienceRepository");
            }
        } else {
            A0D2 = C36431kI.A0D();
            A0D2.setClassName(statusPrivacyActivity.getPackageName(), "com.whatsapp.status.audienceselector.StatusRecipientsActivity");
            A0D2.putExtra("is_black_list", z);
        }
        statusPrivacyActivity.startActivityForResult(A0D2, 0);
    }

    public void A2F() {
        if (!this.A0M) {
            this.A0M = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A0B = C36391kE.A0e(r1);
            this.A05 = (AnonymousClass164) r1.A99.get();
            this.A0L = C36391kE.A0p(r1);
            this.A0D = (AnonymousClass1Q1) r1.A9I.get();
            this.A0F = C36381kD.A0i(r1);
            this.A04 = (AnonymousClass3Bu) A0L2.A1S.get();
            this.A08 = C36431kI.A0Y(r1);
            this.A0K = (C35011i0) r3.A4Q.get();
            this.A0E = C36381kD.A0h(r3);
            this.A0J = C27111My.A3i(A0L2);
            this.A0I = (AnonymousClass1UM) r1.A3S.get();
            this.A09 = (C144576sT) r1.A8T.get();
            this.A0G = new C599135t((WfalManager) r1.A9U.get(), (C34921hr) r1.A00.ADH.get());
        }
    }

    public final C35011i0 A3i() {
        C35011i0 r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("xFamilyCrosspostManager");
    }

    public AnonymousClass01P BAc() {
        AnonymousClass01P r0 = this.A06.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass3XT r2;
        if (i == 0) {
            if (i2 == -1 && intent != null) {
                if (this.A09.A2S("audience_selection_2")) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        C64883Pu r0 = this.A0E;
                        if (r0 != null) {
                            r2 = r0.A01(extras);
                        } else {
                            throw C36331k8.A0d("audienceRepository");
                        }
                    } else {
                        r2 = null;
                    }
                    this.A0A = r2;
                    if (r2 != null) {
                        C81203wd.A02(this.A04, this, r2, 8);
                    }
                } else {
                    this.A0A = null;
                }
            }
            A0F();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onDestroy() {
        Log.i("StatusPrivacyActivity/onDestroy");
        super.onDestroy();
        AnonymousClass1Q1 r0 = this.A0D;
        if (r0 != null) {
            r0.A02(this);
            this.A07.unregisterObserver(this);
            return;
        }
        throw C36331k8.A0d("waSnackbarRegistry");
    }

    public StatusPrivacyActivity(int i) {
        this.A0M = false;
        C89364Wg.A00(this, 47);
    }

    public void onBackPressed() {
        A07();
    }

    public StatusPrivacyActivity() {
        this(0);
    }
}
