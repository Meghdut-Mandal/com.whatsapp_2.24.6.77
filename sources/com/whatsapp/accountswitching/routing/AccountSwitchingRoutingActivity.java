package com.whatsapp.accountswitching.routing;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01L;
import X.AnonymousClass04G;
import X.AnonymousClass098;
import X.AnonymousClass12U;
import X.AnonymousClass190;
import X.AnonymousClass1RU;
import X.AnonymousClass1VX;
import X.AnonymousClass3KU;
import X.AnonymousClass3LW;
import X.AnonymousClass482;
import X.AnonymousClass6TO;
import X.AnonymousClass6VR;
import X.C1496972k;
import X.C18700tb;
import X.C19420v0;
import X.C19900wh;
import X.C21570zS;
import X.C27011Mj;
import X.C28721Tt;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import X.C39001qm;
import X.C65983Uf;
import X.C89314Wb;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AccountSwitchingRoutingActivity extends AnonymousClass01L implements C18700tb {
    public AnonymousClass1VX A00;
    public AnonymousClass1RU A01;
    public AnonymousClass6TO A02;
    public C19420v0 A03;
    public C19900wh A04;
    public AnonymousClass12U A05;
    public C21570zS A06;
    public boolean A07;
    public final Object A08;
    public volatile C27011Mj A09;

    public void onCreate(Bundle bundle) {
        String str;
        requestWindowFeature(1);
        C36371kC.A1G(getWindow(), 0);
        super.onCreate(bundle);
        Intent intent = getIntent();
        AnonymousClass00C.A08(intent);
        int intExtra = intent.getIntExtra("inactiveAccountNotificationId", -1);
        String stringExtra = intent.getStringExtra("inactiveAccountNotificationTag");
        if (!(intExtra == -1 || stringExtra == null || AnonymousClass098.A06(stringExtra))) {
            Object systemService = getSystemService("notification");
            AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(stringExtra, intExtra);
            intent.removeExtra("inactiveAccountNotificationId");
            intent.removeExtra("inactiveAccountNotificationTag");
            C21570zS r0 = this.A06;
            if (r0 != null) {
                ((AnonymousClass6VR) r0.get()).A0A(stringExtra);
            } else {
                throw C36331k8.A0d("workManagerLazy");
            }
        }
        String stringExtra2 = getIntent().getStringExtra("switch_to_account_lid");
        int intExtra2 = getIntent().getIntExtra("source", 0);
        C36321k7.A1Q("AccountSwitchingRoutingActivity/switch to account lid/", stringExtra2, AnonymousClass000.A0u());
        AnonymousClass6TO r2 = this.A02;
        if (r2 != null) {
            r2.A02((Boolean) null, intExtra2, 16);
            AnonymousClass1VX r02 = this.A00;
            if (r02 == null) {
                throw C36331k8.A0d("changeNumberManager");
            } else if (r02.A02()) {
                Log.i("AccountSwitchingRoutingActivity/change number in progress");
                C39001qm A002 = AnonymousClass3LW.A00(this);
                A002.A0r(false);
                A002.A0d(R.string.f12nameremoved);
                A002.A0c(R.string.f12nameremoved);
                C39001qm.A0I(A002, this, 11, R.string.f12nameremoved);
                A002.A0b();
            } else {
                C19420v0 r03 = this.A03;
                if (r03 != null) {
                    String A0d = r03.A0d();
                    if (A0d == null || A0d.length() == 0) {
                        AnonymousClass12U r04 = this.A05;
                        if (r04 == null) {
                            throw C36331k8.A0d("registrationStateManager");
                        } else if (!r04.A03()) {
                            AnonymousClass12U r05 = this.A05;
                            if (r05 == null) {
                                throw C36331k8.A0d("registrationStateManager");
                            } else if (r05.A00() == 2) {
                                Log.i("AccountSwitchingRoutingActivity/register name/account backup dialog");
                                C19420v0 r06 = this.A03;
                                if (r06 != null) {
                                    int A0I = r06.A0I();
                                    C19900wh r07 = this.A04;
                                    if (r07 != null) {
                                        C65983Uf.A0I(this, new C1496972k(this, 18), stringExtra2, r07.A01(), A0I);
                                        return;
                                    }
                                    throw C36331k8.A0d("waStartupSharedPreferences");
                                }
                                throw C36331k8.A0d("waSharedPreferences");
                            } else {
                                Log.i("AccountSwitchingRoutingActivity/abandon add new account");
                                AnonymousClass1RU r08 = this.A01;
                                if (r08 != null) {
                                    r08.A06(this, stringExtra2, false);
                                    finish();
                                    return;
                                }
                                throw C36331k8.A0d("accountSwitcher");
                            }
                        } else {
                            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                                AnonymousClass1RU r09 = this.A01;
                                if (r09 != null) {
                                    AnonymousClass3KU A032 = r09.A03();
                                    if (A032 != null) {
                                        str = A032.A08;
                                    } else {
                                        str = null;
                                    }
                                    if (AnonymousClass00C.A0J(str, stringExtra2)) {
                                        Log.e("AccountSwitchingRoutingActivity/switch account lid same as current account lid, opening home activity");
                                        startActivity(AnonymousClass190.A03(this));
                                        return;
                                    }
                                } else {
                                    throw C36331k8.A0d("accountSwitcher");
                                }
                            }
                            Log.i("AccountSwitchingRoutingActivity/switch account");
                            AnonymousClass1RU r6 = this.A01;
                            if (r6 == null) {
                                throw C36331k8.A0d("accountSwitcher");
                            } else if (stringExtra2 != null) {
                                r6.A0E(this, stringExtra2, getIntent().getStringExtra("account_switching_sender_jid"), new AnonymousClass482(this), intExtra2, false, getIntent().getBooleanExtra("is_missed_call_notification", false), false);
                            } else {
                                throw C36381kD.A0l();
                            }
                        }
                    } else {
                        Log.i("AccountSwitchingRoutingActivity/login failed dialog");
                        C19420v0 r3 = this.A03;
                        if (r3 != null) {
                            C19900wh r22 = this.A04;
                            if (r22 != null) {
                                C65983Uf.A0H(this, r3, r22, new C1496972k(this, 17), stringExtra2);
                                return;
                            }
                            throw C36331k8.A0d("waStartupSharedPreferences");
                        }
                        throw C36331k8.A0d("waSharedPreferences");
                    }
                } else {
                    throw C36331k8.A0d("waSharedPreferences");
                }
            }
        } else {
            throw C36331k8.A0d("accountSwitchingLogger");
        }
    }

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new C27011Mj(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public AccountSwitchingRoutingActivity(int i) {
        this.A08 = C36441kJ.A11();
        this.A07 = false;
        C89314Wb.A00(this, 13);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public AccountSwitchingRoutingActivity() {
        this(0);
    }
}
