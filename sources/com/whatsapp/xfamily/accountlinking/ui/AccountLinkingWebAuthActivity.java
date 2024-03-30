package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1UM;
import X.AnonymousClass1US;
import X.AnonymousClass1UT;
import X.AnonymousClass1UZ;
import X.AnonymousClass3GB;
import X.AnonymousClass5VM;
import X.AnonymousClass62J;
import X.AnonymousClass6JU;
import X.AnonymousClass753;
import X.C105555Fd;
import X.C118145nP;
import X.C120525re;
import X.C163037pY;
import X.C165337tG;
import X.C186008vG;
import X.C18800tq;
import X.C18830tt;
import X.C203399nx;
import X.C27111My;
import X.C28781Ua;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36421kH;
import X.C90464aC;
import X.C90494aF;
import X.C90504aG;
import X.C90524aI;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class AccountLinkingWebAuthActivity extends AnonymousClass155 {
    public static final AnonymousClass1US A0B = AnonymousClass1US.ACCOUNT_LINKING_WEB_AUTH_ACTIVITY;
    public C105555Fd A00;
    public C120525re A01;
    public AnonymousClass6JU A02;
    public C118145nP A03;
    public AnonymousClass1UM A04;
    public AnonymousClass1UZ A05;
    public C28781Ua A06;
    public AnonymousClass011 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public static final void A01(AnonymousClass5VM r6, AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, AnonymousClass3GB r8, Integer num, Integer num2) {
        accountLinkingWebAuthActivity.A05.A0H(new AnonymousClass753(r8, accountLinkingWebAuthActivity, num2, num, r6, 20));
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = (C28781Ua) r2.A9d.get();
            this.A04 = (AnonymousClass1UM) r2.A3S.get();
            this.A01 = C27111My.A3g(A0L);
            this.A00 = (C105555Fd) r1.A4d.get();
            this.A02 = C27111My.A3h();
            this.A05 = (AnonymousClass1UZ) r2.AfD.get();
            this.A03 = r1.ADv();
        }
    }

    public final C105555Fd A3i() {
        C105555Fd r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("accountLinkingResultObservers");
    }

    public AccountLinkingWebAuthActivity(int i) {
        this.A0A = false;
        C163037pY.A00(this, 16);
    }

    public void onCreate(Bundle bundle) {
        Uri data;
        Uri data2;
        super.onCreate(bundle);
        C28781Ua r0 = this.A06;
        if (r0 == null) {
            throw C36331k8.A0d("xFamilyGating");
        } else if (!r0.A00() || !(((data = getIntent().getData()) == null || data.getHost() == null) && ((data2 = getIntent().getData()) == null || data2.getScheme() == null))) {
            finish();
        } else if (!this.A07.A09()) {
            A01((AnonymousClass5VM) null, this, (AnonymousClass3GB) null, C90494aF.A0U(), (Integer) null);
        } else {
            AnonymousClass17Y r02 = this.A05;
            AnonymousClass00C.A07(r02);
            AnonymousClass3GB r2 = new AnonymousClass3GB(r02);
            r2.A01(R.string.f12nameremoved);
            C118145nP r03 = this.A03;
            if (r03 != null) {
                AnonymousClass62J r1 = new AnonymousClass62J(this, r2);
                AnonymousClass19A r22 = r03.A00;
                String A092 = r22.A09();
                C186008vG r04 = new C186008vG(A092);
                C203399nx r4 = r04.A00;
                AnonymousClass00C.A08(r4);
                r22.A0F(new C165337tG(r04, r1), r4, A092, 366, 10000);
                return;
            }
            throw C36331k8.A0d("webAuthTokensFetcher");
        }
    }

    public void onNewIntent(Intent intent) {
        Uri data;
        String str;
        super.onNewIntent(intent);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountLinkingWebAuthActivity/isValidRequest Calling pkg:");
        boolean A1Z = C90464aC.A1Z(getCallingPackage(), A0u);
        if (this.A07 == null) {
            AnonymousClass1UT.A01("Detected invalid entry point into web auth. No tokens available. Exiting early", (Throwable) null);
        } else if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("token");
            String queryParameter2 = data.getQueryParameter("blob");
            if (AnonymousClass00C.A0J(data.getScheme(), "wa-xf-login") && AnonymousClass00C.A0J(data.getHost(), "sso") && queryParameter != null && queryParameter2 != null) {
                AnonymousClass00C.A0D("AccountLinkingWebAuthActivity/onNewIntent Received deep link redirect from login page", A1Z ? 1 : 0);
                C28781Ua r0 = this.A06;
                if (r0 == null) {
                    throw C36331k8.A0d("xFamilyGating");
                } else if (r0.A00()) {
                    AnonymousClass1UM r1 = this.A04;
                    if (r1 != null) {
                        r1.A02(AnonymousClass1US.ACCOUNT_LINKING_WEB_AUTH_ACTIVITY);
                        this.A08 = true;
                        AnonymousClass1UZ r12 = this.A05;
                        if (r12 != null) {
                            r12.A04("TAP_WEB_AUTH_AGREE");
                            AnonymousClass17Y r02 = this.A05;
                            AnonymousClass00C.A07(r02);
                            AnonymousClass3GB r3 = new AnonymousClass3GB(r02);
                            r3.A01(R.string.f12nameremoved);
                            AnonymousClass011 r03 = this.A07;
                            if (r03 != null) {
                                String str2 = (String) r03.first;
                                AnonymousClass00C.A0D(str2, 1);
                                int length = queryParameter.length();
                                if (length == 0 || queryParameter2.length() == 0) {
                                    str = "TokensValidator/isTokenValid t1_hash or blob received in deeplink are empty";
                                } else if (length != 16) {
                                    str = "TokensValidator/isTokenValid t1_hash length is not 16";
                                } else {
                                    try {
                                        byte[] digest = C90504aG.A0s().digest(C36351kA.A1b(str2));
                                        AnonymousClass00C.A0B(digest);
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        for (byte valueOf : digest) {
                                            A0u2.append(C90494aF.A0e(Locale.US, "%02x", C90524aI.A0x(Byte.valueOf(valueOf), new Object[1], A1Z, 1)));
                                        }
                                        if (C36381kD.A0y(A0u2).startsWith(queryParameter)) {
                                            AnonymousClass00C.A0D("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Exchanging token and blob for access token", A1Z);
                                            C36421kH.A1G(this.A04, this, r3, queryParameter2, 28);
                                            return;
                                        }
                                        Log.e("TokensValidator/isTokenValid hash of token1 does not match t1_hash received in deeplink");
                                        AnonymousClass1UT.A01("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Invalid token hash received in Web auth redirect URI", (Throwable) null);
                                        r3.A00();
                                        A3i().A00((AnonymousClass5VM) null, (Integer) null, (Integer) null, A1Z);
                                    } catch (NoSuchAlgorithmException e) {
                                        Log.e("TokensValidator/isTokenValid error while calculating token hash", e);
                                    }
                                }
                                Log.e(str);
                                AnonymousClass1UT.A01("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Invalid token hash received in Web auth redirect URI", (Throwable) null);
                                r3.A00();
                                A3i().A00((AnonymousClass5VM) null, (Integer) null, (Integer) null, A1Z);
                            } else {
                                throw AnonymousClass001.A09("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Token pair cannot be null");
                            }
                        } else {
                            throw C36331k8.A0d("xFamilyUserFlowLogger");
                        }
                    } else {
                        throw C36331k8.A0d("fbAccountManager");
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        finish();
    }

    public void onResume() {
        super.onResume();
        if (this.A09) {
            if (!this.A08) {
                AnonymousClass1UZ r2 = this.A05;
                if (r2 != null) {
                    AnonymousClass1UM r1 = this.A04;
                    if (r1 != null) {
                        r2.A02(Boolean.valueOf(r1.A06(AnonymousClass1US.ACCOUNT_LINKING_WEB_AUTH_ACTIVITY)), "is_account_linked");
                        r2.A03("EXIT_WEB_AUTH");
                    } else {
                        throw C36331k8.A0d("fbAccountManager");
                    }
                } else {
                    throw C36331k8.A0d("xFamilyUserFlowLogger");
                }
            }
            finish();
        }
    }

    public AccountLinkingWebAuthActivity() {
        this(0);
    }
}
