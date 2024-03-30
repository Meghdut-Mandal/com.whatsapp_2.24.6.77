package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass065;
import X.AnonymousClass13E;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16U;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1EW;
import X.AnonymousClass1EZ;
import X.AnonymousClass1FF;
import X.AnonymousClass1FR;
import X.AnonymousClass1N6;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QS;
import X.AnonymousClass1XC;
import X.AnonymousClass1YK;
import X.AnonymousClass1YM;
import X.AnonymousClass1YO;
import X.AnonymousClass32a;
import X.AnonymousClass359;
import X.AnonymousClass3DY;
import X.AnonymousClass3UF;
import X.AnonymousClass6O3;
import X.AnonymousClass6VG;
import X.AnonymousClass9IC;
import X.AnonymousClass9Kh;
import X.AnonymousClass9Op;
import X.AnonymousClass9SJ;
import X.AnonymousClass9UH;
import X.AnonymousClass9YX;
import X.B2Z;
import X.B6J;
import X.B89;
import X.B9J;
import X.BAA;
import X.C012005e;
import X.C131606Ps;
import X.C135926dU;
import X.C147166wm;
import X.C165567td;
import X.C165587tf;
import X.C165597tg;
import X.C165617ti;
import X.C166337vZ;
import X.C167677yY;
import X.C176658cT;
import X.C179658kU;
import X.C179668kV;
import X.C180238lQ;
import X.C180248lR;
import X.C180378lh;
import X.C183608r4;
import X.C18740tg;
import X.C193889Nh;
import X.C194209On;
import X.C196039Xk;
import X.C196199Yc;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C199849g7;
import X.C200049gU;
import X.C20050ww;
import X.C201479jg;
import X.C201649k3;
import X.C202239lN;
import X.C202319lY;
import X.C202939my;
import X.C203049nB;
import X.C203449o2;
import X.C207249un;
import X.C207359uy;
import X.C207369uz;
import X.C20810yC;
import X.C21100yf;
import X.C21243ADz;
import X.C225314u;
import X.C229216m;
import X.C22951Az3;
import X.C22956Az8;
import X.C22988Aze;
import X.C23037B1i;
import X.C23039B1k;
import X.C23054B2a;
import X.C23075B3f;
import X.C24601Db;
import X.C24631De;
import X.C24881Ed;
import X.C25251Fo;
import X.C27731Pn;
import X.C29121Vk;
import X.C29221Vu;
import X.C29231Vv;
import X.C32681e1;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C36811lL;
import X.C46622Zo;
import X.C49442j7;
import X.C50282kV;
import X.C65443Sb;
import X.C90514aH;
import X.C99304t3;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class PaymentSettingsFragment extends Hilt_PaymentSettingsFragment implements View.OnClickListener, B6J, C23037B1i, C22956Az8, C23039B1k, C22988Aze {
    public List A00 = AnonymousClass001.A0I();
    public List A01 = AnonymousClass001.A0I();
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public RecyclerView A0C;
    public AnonymousClass17Y A0D;
    public C19730wQ A0E;
    public AnonymousClass3DY A0F;
    public C21100yf A0G;
    public C20050ww A0H;
    public C229216m A0I;
    public AnonymousClass1Pp A0J;
    public AnonymousClass16D A0K;
    public AnonymousClass171 A0L;
    public C27731Pn A0M;
    public C19970wo A0N;
    public C19630wG A0O;
    public AnonymousClass1FF A0P;
    public C24881Ed A0Q;
    public AnonymousClass1EW A0R;
    public AnonymousClass13E A0S;
    public C25251Fo A0T;
    public AnonymousClass1EZ A0U;
    public AnonymousClass1YO A0V;
    public C29221Vu A0W;
    public C29231Vv A0X;
    public AnonymousClass1YK A0Y;
    public C24601Db A0Z;
    public AnonymousClass1DR A0a;
    public C29121Vk A0b;
    public C24631De A0c;
    public AnonymousClass1EV A0d;
    public AnonymousClass1EU A0e;
    public AnonymousClass1XC A0f;
    public C50282kV A0g;
    public AnonymousClass6O3 A0h;
    public C199849g7 A0i;
    public C166337vZ A0j;
    public C21243ADz A0k;
    public C202239lN A0l;
    public C167677yY A0m;
    public C201479jg A0n;
    public C180378lh A0o;
    public AnonymousClass9UH A0p;
    public AnonymousClass1FR A0q;
    public AnonymousClass1N6 A0r;
    public C32681e1 A0s;
    public C19770wU A0t;
    public String A0u;
    public List A0v = AnonymousClass001.A0I();
    public View A0w;
    public View A0x;
    public View A0y;
    public View A0z;
    public View A10;
    public ListView A11;
    public TextView A12;
    public View A13;
    public View A14;
    public RecyclerView A15;
    public C22951Az3 A16;
    public PaymentIncentiveViewModel A17;
    public TransactionsExpandableView A18;
    public TransactionsExpandableView A19;

    public void A1N(int i, int i2, Intent intent) {
        C202239lN r0;
        int intExtra;
        String quantityString;
        if (i != 1) {
            if (i != 48) {
                if (i != 150) {
                    if (i != 501) {
                        super.A1N(i, i2, intent);
                        return;
                    }
                    View view = this.A0F;
                    if (intent != null && view != null) {
                        if (i2 == -1) {
                            UserJid A0l2 = C36431kI.A0l(intent.getStringExtra("extra_invitee_jid"));
                            if (A0l2 != null) {
                                quantityString = C36411kG.A0w(C36341k9.A0G(this), this.A0L.A0M(this.A0K.A0D(A0l2)), new Object[1], 0, R.string.f12nameremoved);
                            } else {
                                return;
                            }
                        } else if (i2 == 501 && (intExtra = intent.getIntExtra("extra_inviter_count", 0)) > 0) {
                            Resources A0G2 = C36341k9.A0G(this);
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1L(objArr, intExtra, 0);
                            quantityString = A0G2.getQuantityString(R.plurals.f10nameremoved, intExtra, objArr);
                        } else {
                            return;
                        }
                        C99304t3.A01(view, quantityString, -1).A0P();
                    }
                } else if (i2 == -1) {
                    A1r((String) null);
                }
            } else if (i2 == -1) {
                A0i().finish();
            }
        } else if (i2 == -1 && (r0 = this.A0l) != null) {
            r0.A02();
        }
    }

    public void A1n(int i) {
        if (i == 1) {
            AnonymousClass1QS.A01(this, (Integer) null, Integer.valueOf(R.string.f12nameremoved), (Integer) null, (List) null);
        }
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    private void A0A() {
        this.A0t.Box(new C183608r4(this.A0K, this.A0Q, new AnonymousClass9IC(this.A0M.A05(A1D(), "payment-settings"), this), this), new AnonymousClass012[0]);
    }

    public static void A0B(AnonymousClass6O3 r8, PaymentSettingsFragment paymentSettingsFragment, String str, String str2) {
        Uri uri;
        boolean z;
        C131606Ps r1;
        C167677yY r3 = paymentSettingsFragment.A0m;
        if (r3 != null) {
            Bundle bundle = paymentSettingsFragment.A0A;
            if (bundle != null) {
                uri = (Uri) bundle.getParcelable("extra_deep_link_url");
            } else {
                uri = null;
            }
            if (r3 instanceof IndiaPaymentSettingsViewModel) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) r3;
                C23075B3f b3f = indiaPaymentSettingsViewModel.A09;
                if (!(b3f instanceof AF7)) {
                    return;
                }
                if ("notify_verification_banner".equals(str2)) {
                    indiaPaymentSettingsViewModel.A0U(0, -1);
                } else if ("recovery_upin_upsell_banner".equals(str2) || "recovery_2fa_upsell_banner".equals(str2)) {
                    indiaPaymentSettingsViewModel.A0V(0, str2);
                } else {
                    C131606Ps A012 = C203049nB.A01(indiaPaymentSettingsViewModel.A05, (AnonymousClass16X) null, r8, str2, false);
                    AF7 af7 = (AF7) b3f;
                    boolean A0d2 = indiaPaymentSettingsViewModel.A0d();
                    if (uri != null) {
                        try {
                            String queryParameter = uri.getQueryParameter("campaignID");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                if (A012 != null) {
                                    r1 = A012;
                                } else {
                                    r1 = new C131606Ps((String) null, new C131606Ps[0]);
                                }
                                r1.A03("campaign_id", queryParameter);
                                C176658cT.A03(af7.A04(0, (Integer) null, "payment_home", str), r1, af7, A0d2);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    r1 = A012;
                    C176658cT.A03(af7.A04(0, (Integer) null, "payment_home", str), r1, af7, A0d2);
                }
            } else {
                C131606Ps A013 = C203049nB.A01(r3.A05, (AnonymousClass16X) null, r8, str2, false);
                if (A013 == null) {
                    A013 = new C131606Ps((String) null, new C131606Ps[0]);
                }
                if (r3 instanceof C180248lR) {
                    z = C36421kH.A1a(((C180248lR) r3).A01);
                } else {
                    z = false;
                }
                A013.A04("isPushProvisioning", z);
                C203049nB.A04(A013, r3.A09, "payment_home", str);
            }
        }
    }

    public static void A0C(PaymentSettingsFragment paymentSettingsFragment, String str) {
        if (!paymentSettingsFragment.A0I.A00()) {
            RequestPermissionActivity.A0H(paymentSettingsFragment, R.string.f12nameremoved, R.string.f12nameremoved);
        } else {
            paymentSettingsFragment.A1r(str);
        }
    }

    public String A1k() {
        if (!(this instanceof IndiaUpiPaymentSettingsFragment)) {
            return null;
        }
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = ((IndiaUpiPaymentSettingsFragment) this).A0T;
        C18740tg.A06(indiaPaymentSettingsViewModel);
        switch (indiaPaymentSettingsViewModel.A0c()) {
            case 1:
                return "finish_setup";
            case 2:
                return "send_first_payment_banner";
            case 4:
                return "add_upi_number_banner";
            case 5:
                return "notify_verification_banner";
            case 6:
                return "scan_qr_code_banner";
            case 7:
                return "recovery_upin_upsell_banner";
            case 8:
                return "recovery_2fa_upsell_banner";
            case 10:
                return "warm_welcome_banner";
            case 11:
                return "recent_businesses";
            default:
                return null;
        }
    }

    public void A1l() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = indiaUpiPaymentSettingsFragment.A0T;
            C18740tg.A06(indiaPaymentSettingsViewModel);
            if (indiaPaymentSettingsViewModel.A0c() == 9) {
                LanguageSelectorBottomSheet A032 = LanguageSelectorBottomSheet.A03();
                A032.A07 = new AnonymousClass359(A032, indiaUpiPaymentSettingsFragment);
                C65443Sb.A01(A032, indiaUpiPaymentSettingsFragment.A0k());
            }
        }
    }

    public void A1m() {
        C19770wU r2 = this.A0t;
        C50282kV r0 = this.A0g;
        if (r0 != null && r0.A06() == 1) {
            this.A0g.A0D(false);
        }
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings");
        C20050ww r8 = this.A0H;
        C50282kV r3 = new C50282kV(A072, (C225314u) A0i(), this.A0F, this.A0G, r8, this.A01, (C207249un) null, (C202319lY) null, this.A0S, this.A0c, "payments:settings");
        this.A0g = r3;
        C36331k8.A1F(r3, r2);
    }

    public void A1p(UserJid userJid, String str) {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            indiaUpiPaymentSettingsFragment.A0K.A00(indiaUpiPaymentSettingsFragment.A1D(), userJid, (AnonymousClass9YX) null, (C23054B2a) null, indiaUpiPaymentSettingsFragment.A0Z.A05());
            AnonymousClass01I A0h2 = indiaUpiPaymentSettingsFragment.A0h();
            if (A0h2 instanceof C225314u) {
                Intent A0H2 = C36441kJ.A0H(A0h2, C165587tf.A0W(indiaUpiPaymentSettingsFragment.A0e).BHH());
                indiaUpiPaymentSettingsFragment.A0p.A01(A0H2);
                A0H2.putExtra("extra_payment_preset_amount", str);
                A0H2.putExtra("extra_jid", userJid.getRawString());
                A0H2.putExtra("extra_is_pay_money_only", !indiaUpiPaymentSettingsFragment.A0e.A07.A00.A09(C21100yf.A0g));
                A0H2.putExtra("referral_screen", "send_again_contact");
                ((C225314u) A0h2).A33(A0H2, true);
                return;
            }
            Log.e("India Payment's contact picker activity is null");
        }
    }

    public void A1q(String str) {
        int i;
        if (this instanceof BrazilPaymentSettingsFragment) {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C180248lR r1 = brazilPaymentSettingsFragment.A0I;
            C18740tg.A06(r1);
            C201479jg r0 = brazilPaymentSettingsFragment.A0n;
            if (r0 != null) {
                i = r0.A01;
            } else {
                i = 0;
            }
            int A0c2 = r1.A0c(i);
            if (A0c2 == 1) {
                brazilPaymentSettingsFragment.A1s(str, "payment_home.get_started");
            } else if (A0c2 == 2) {
                BrazilPaymentSettingsFragment.A03(brazilPaymentSettingsFragment, "payment_home.get_started", C201649k3.A01(brazilPaymentSettingsFragment.A0H, "generic_context", false));
            } else if (A0c2 == 3) {
                BrazilPaymentSettingsFragment.A03(brazilPaymentSettingsFragment, "payment_home.recover_payments_registration", "brpay_p_account_recovery_eligibility_screen");
            }
        }
    }

    public void A1r(String str) {
        String str2;
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            boolean A0F2 = indiaUpiPaymentSettingsFragment.A0U.A0F();
            C167677yY r2 = indiaUpiPaymentSettingsFragment.A0m;
            if (!A0F2) {
                if (r2 != null) {
                    r2.A0Z(indiaUpiPaymentSettingsFragment.A0h, 36, str);
                }
                IndiaUpiPaymentSettingsFragment.A08(indiaUpiPaymentSettingsFragment, "settingsNewPayment", (String) null, 1, 4, true, false);
                return;
            }
            if (r2 != null) {
                int i = 38;
                if (TextUtils.equals("send_first_payment_banner", str)) {
                    i = 195;
                }
                indiaUpiPaymentSettingsFragment.A0m.A0Y(indiaUpiPaymentSettingsFragment.A0h, Integer.valueOf(i), str);
            }
            Intent A0H2 = C36441kJ.A0H(indiaUpiPaymentSettingsFragment.A1D(), IndiaUpiContactPicker.class);
            A0H2.putExtra("for_payments", true);
            if (TextUtils.equals("send_first_payment_banner", str)) {
                str2 = AnonymousClass000.A0p(".", "send_first_payment_banner", AnonymousClass000.A0v("payment_home"));
            } else {
                str2 = "new_payment";
            }
            C165597tg.A0z(A0H2, str2);
            indiaUpiPaymentSettingsFragment.startActivityForResult(A0H2, 501);
            return;
        }
        C167677yY r22 = this.A0m;
        if (r22 != null) {
            r22.A0Y(this.A0h, 38, str);
        }
        Intent A0H3 = C36441kJ.A0H(A0i(), PaymentContactPicker.class);
        A0H3.putExtra("for_payments", true);
        A0H3.putExtra("referral_screen", "payment_home.new_payment");
        startActivityForResult(A0H3, 501);
    }

    public void A1s(String str, String str2) {
        if (this instanceof BrazilPaymentSettingsFragment) {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            if (brazilPaymentSettingsFragment.A0H.A03.A03()) {
                brazilPaymentSettingsFragment.A1C(C36441kJ.A0H(brazilPaymentSettingsFragment.A1D(), BrazilFbPayHubActivity.class));
                C167677yY r3 = brazilPaymentSettingsFragment.A0m;
                if (r3 != null) {
                    C203049nB.A03(C203049nB.A01(r3.A05, (AnonymousClass16X) null, brazilPaymentSettingsFragment.A0h, (String) null, false), r3.A09, 37, "payment_home", (String) null, 1);
                    return;
                }
                return;
            }
            BrazilPaymentSettingsFragment.A03(brazilPaymentSettingsFragment, str2, C201649k3.A01(brazilPaymentSettingsFragment.A0H, "generic_context", false));
            C167677yY r2 = brazilPaymentSettingsFragment.A0m;
            if (r2 != null) {
                r2.A0Z(brazilPaymentSettingsFragment.A0h, 36, str);
            }
        }
    }

    public boolean A1t() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            return false;
        }
        C24601Db r1 = this.A0Z;
        return AnonymousClass000.A1R(((C19970wo.A00(r1.A01) - C36341k9.A0B(r1.A03(), "payments_all_transactions_last_sync_time")) > TimeUnit.DAYS.toMillis(7) ? 1 : ((C19970wo.A00(r1.A01) - C36341k9.A0B(r1.A03(), "payments_all_transactions_last_sync_time")) == TimeUnit.DAYS.toMillis(7) ? 0 : -1)));
    }

    public void BcW() {
        this.A0k.A00(false);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1H() {
        super.A1H();
        C21243ADz aDz = this.A0k;
        if (aDz != null) {
            C36331k8.A1E(aDz.A02);
            aDz.A02 = null;
            B2Z b2z = aDz.A00;
            if (b2z != null) {
                aDz.A06.unregisterObserver(b2z);
            }
        }
        C50282kV r1 = this.A0g;
        if (r1 != null) {
            r1.A0D(false);
        }
    }

    public void A1K() {
        super.A1K();
        C22951Az3 az3 = this.A16;
        if (az3 != null) {
            this.A0V.unregisterObserver(az3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r3.A0U.A0D() == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1L() {
        /*
            r3 = this;
            super.A1L()
            X.01I r1 = r3.A0i()
            boolean r0 = r1 instanceof X.C225314u
            if (r0 == 0) goto L_0x0013
            X.14u r1 = (X.C225314u) r1
            r0 = 2131892453(0x7f1218e5, float:1.9419655E38)
            r1.Bu1(r0)
        L_0x0013:
            X.ADz r1 = r3.A0k
            r0 = 1
            r1.A00(r0)
            android.view.View r2 = r3.A13
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0034
            X.1EV r0 = r3.A0d
            X.0yC r1 = r0.A02
            r0 = 783(0x30f, float:1.097E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0034
            X.1EZ r0 = r3.A0U
            boolean r1 = r0.A0D()
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            int r0 = X.C36351kA.A00(r0)
            r2.setVisibility(r0)
            X.Az3 r1 = r3.A16
            if (r1 == 0) goto L_0x0045
            X.1YO r0 = r3.A0V
            r0.registerObserver(r1)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.A1L():void");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A10(true);
    }

    public void A1S(Bundle bundle, View view) {
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        C180238lQ r8;
        String str;
        C202239lN r15;
        int i;
        View.OnClickListener r82;
        AnonymousClass16U r5;
        Context context;
        CharSequence BAV;
        boolean z;
        View view2 = view;
        this.A09 = C36441kJ.A0U(view2, R.id.nux_container);
        this.A02 = view2.findViewById(R.id.payment_nux_row_separator);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A0u = bundle2.getString("referral_screen");
        }
        C196199Yc BFZ = this.A0e.A05().BFZ();
        if (BFZ == null || !BFZ.A07.A0E(842)) {
            paymentIncentiveViewModel = null;
        } else {
            paymentIncentiveViewModel = C165597tg.A0T(this);
        }
        this.A17 = paymentIncentiveViewModel;
        int i2 = 0;
        if (paymentIncentiveViewModel != null) {
            BAA.A00(A0m(), paymentIncentiveViewModel.A01, this, 5);
            this.A17.A0S();
            this.A17.A0T(false);
        }
        boolean z2 = this instanceof P2mLitePaymentSettingsFragment;
        if (z2) {
            P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) this;
            C167677yY r83 = p2mLitePaymentSettingsFragment.A08;
            r8 = r83;
            if (r83 == null) {
                C194209On r52 = p2mLitePaymentSettingsFragment.A09;
                if (r52 != null) {
                    C19970wo r9 = r52.A06;
                    C20810yC r12 = r52.A0G;
                    C180238lQ r84 = new C180238lQ(r9, r52.A08, r52.A0F, r12, r52.A0J, r52.A0M, r52.A0P);
                    p2mLitePaymentSettingsFragment.A08 = r84;
                    r8 = r84;
                } else {
                    throw C36331k8.A0d("viewModelCreationDelegate");
                }
            }
        } else if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C167677yY r85 = indiaUpiPaymentSettingsFragment.A0T;
            r8 = r85;
            if (r85 == null) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) C36441kJ.A0b(indiaUpiPaymentSettingsFragment).A00(IndiaPaymentSettingsViewModel.class);
                indiaUpiPaymentSettingsFragment.A0T = indiaPaymentSettingsViewModel;
                r8 = indiaPaymentSettingsViewModel;
            }
        } else {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C167677yY r86 = brazilPaymentSettingsFragment.A0I;
            r8 = r86;
            if (r86 == null) {
                AnonymousClass9Op r92 = brazilPaymentSettingsFragment.A0J;
                C180248lR r87 = (C180248lR) C165617ti.A0A(new B9J(brazilPaymentSettingsFragment.A0C, r92, 6), brazilPaymentSettingsFragment.A0i()).A00(C180248lR.class);
                brazilPaymentSettingsFragment.A0I = r87;
                r8 = r87;
            }
        }
        this.A0m = r8;
        if (r8 != null) {
            BAA.A00(A0m(), r8.A01, this, 4);
            BAA.A00(A0m(), this.A0m.A00, this, 6);
            if (bundle2 != null) {
                this.A0m.A0a(bundle2.getString("actual_deep_link"));
            }
        }
        this.A0y = view2.findViewById(R.id.fb_pay_hub_section_desc);
        View findViewById = view2.findViewById(R.id.fb_pay_hub);
        this.A0w = C012005e.A02(findViewById, R.id.pay_hub_add);
        this.A12 = C36391kE.A0O(findViewById, R.id.pay_hub_desc);
        this.A0x = C012005e.A02(findViewById, R.id.pay_hub_chevron);
        this.A0z = view2.findViewById(R.id.payment_setting_container);
        this.A10 = view2.findViewById(R.id.requests_separator);
        AnonymousClass155 r122 = (AnonymousClass155) A0i();
        C19770wU r16 = this.A0t;
        AnonymousClass1EU r152 = this.A0e;
        C193889Nh r22 = new C193889Nh();
        C24601Db r14 = this.A0Z;
        AnonymousClass1EZ r13 = this.A0U;
        C29121Vk r11 = this.A0b;
        AnonymousClass1XC r10 = this.A0f;
        C29231Vv r93 = this.A0X;
        AnonymousClass1DR r88 = this.A0a;
        C25251Fo r7 = this.A0T;
        AnonymousClass1YK r6 = this.A0Y;
        if (z2) {
            str = "P2M_LITE";
        } else {
            str = null;
        }
        C19770wU r26 = r16;
        AnonymousClass1EU r20 = r152;
        C29121Vk r19 = r11;
        AnonymousClass1DR r18 = r88;
        C24601Db r17 = r14;
        AnonymousClass1YK r162 = r6;
        C29231Vv r153 = r93;
        AnonymousClass1EZ r142 = r13;
        C25251Fo r132 = r7;
        this.A0k = new C21243ADz(r122, r132, r142, r153, r162, r17, r18, r19, r20, r10, r22, this, this, this, r26, str, true);
        boolean z3 = false;
        if (bundle2 != null) {
            z3 = bundle2.getBoolean("extra_force_get_methods", false);
        }
        this.A0k.A01(A1t(), z3);
        if (z2) {
            r15 = null;
        } else if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment2 = (IndiaUpiPaymentSettingsFragment) this;
            C19970wo r222 = indiaUpiPaymentSettingsFragment2.A0N;
            AnonymousClass17Y r35 = indiaUpiPaymentSettingsFragment2.A0D;
            C19730wQ r21 = indiaUpiPaymentSettingsFragment2.A0E;
            C19770wU r192 = indiaUpiPaymentSettingsFragment2.A0t;
            AnonymousClass1EW r202 = indiaUpiPaymentSettingsFragment2.A0R;
            AnonymousClass9SJ r182 = indiaUpiPaymentSettingsFragment2.A0J;
            AnonymousClass1EU r172 = indiaUpiPaymentSettingsFragment2.A0e;
            C24601Db r163 = indiaUpiPaymentSettingsFragment2.A0Z;
            AnonymousClass1EZ r143 = indiaUpiPaymentSettingsFragment2.A0U;
            C196039Xk r133 = indiaUpiPaymentSettingsFragment2.A0P;
            C29121Vk r123 = indiaUpiPaymentSettingsFragment2.A0b;
            AF7 af7 = indiaUpiPaymentSettingsFragment2.A0M;
            C202939my r102 = indiaUpiPaymentSettingsFragment2.A0H;
            C29221Vu r94 = indiaUpiPaymentSettingsFragment2.A0W;
            AnonymousClass6VG r89 = indiaUpiPaymentSettingsFragment2.A0O;
            C200049gU r72 = indiaUpiPaymentSettingsFragment2.A0L;
            AnonymousClass1YM r53 = indiaUpiPaymentSettingsFragment2.A0E;
            C19770wU r34 = r192;
            AnonymousClass17Y r164 = r35;
            r15 = new C179658kU(r164, r21, (AnonymousClass155) indiaUpiPaymentSettingsFragment2.A0i(), r222, r202, r143, r53, r94, r163, r123, r102, r172, r182, r72, af7, r89, r133, indiaUpiPaymentSettingsFragment2, r34);
        } else {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment2 = (BrazilPaymentSettingsFragment) this;
            C19970wo r223 = brazilPaymentSettingsFragment2.A0N;
            AnonymousClass17Y r36 = brazilPaymentSettingsFragment2.A0D;
            C19730wQ r212 = brazilPaymentSettingsFragment2.A0E;
            C19770wU r193 = brazilPaymentSettingsFragment2.A0t;
            AnonymousClass1EW r203 = brazilPaymentSettingsFragment2.A0R;
            AnonymousClass9SJ r183 = brazilPaymentSettingsFragment2.A08;
            AnonymousClass1EU r173 = brazilPaymentSettingsFragment2.A0e;
            C24601Db r25 = brazilPaymentSettingsFragment2.A0Z;
            C147166wm r165 = brazilPaymentSettingsFragment2.A05;
            AnonymousClass1EZ r144 = brazilPaymentSettingsFragment2.A0U;
            C196039Xk r134 = brazilPaymentSettingsFragment2.A0F;
            C29121Vk r124 = brazilPaymentSettingsFragment2.A0b;
            C23075B3f b3f = brazilPaymentSettingsFragment2.A0C;
            C202939my r103 = brazilPaymentSettingsFragment2.A07;
            C29221Vu r95 = brazilPaymentSettingsFragment2.A0W;
            AnonymousClass6VG r810 = brazilPaymentSettingsFragment2.A0E;
            C200049gU r73 = brazilPaymentSettingsFragment2.A0A;
            AnonymousClass1YM r54 = brazilPaymentSettingsFragment2.A06;
            C19770wU r352 = r193;
            AnonymousClass17Y r166 = r36;
            r15 = new C179668kV(r166, r212, (AnonymousClass155) brazilPaymentSettingsFragment2.A0i(), r223, r203, r165, r144, r54, r95, r25, r124, r103, r173, r183, r73, b3f, r810, r134, brazilPaymentSettingsFragment2, r352);
        }
        this.A0l = r15;
        if (r15 != null) {
            r15.A01 = this.A02.A0E(1724);
        }
        view2.findViewById(R.id.add_new_account).setOnClickListener(this);
        view2.findViewById(R.id.payment_support_container).setOnClickListener(this);
        View A022 = C012005e.A02(view2, R.id.send_payment_fab);
        this.A14 = A022;
        boolean z4 = this instanceof BrazilPaymentSettingsFragment;
        if (z4) {
            i = 1;
        } else {
            i = 0;
        }
        A022.setVisibility(C36351kA.A00(i));
        this.A14.setOnClickListener(this);
        if (z2 || z4) {
            C36341k9.A10(view2, R.id.payment_methods_container, 8);
            C36341k9.A10(view2, R.id.payment_history_separator, 8);
        }
        this.A0j = new C166337vZ(A0i(), this.A0i, this);
        ListView listView = (ListView) view2.findViewById(R.id.methods_list);
        this.A11 = listView;
        listView.setAdapter(this.A0j);
        this.A11.setOnItemClickListener(new B89(this, 4));
        this.A05 = C012005e.A02(view2, R.id.send_again_separator);
        this.A0B = C90514aH.A0U(view2, R.id.send_again_container);
        this.A0C = (RecyclerView) C012005e.A02(view2, R.id.frequently_paid_contacts_row);
        boolean z5 = this instanceof IndiaUpiPaymentSettingsFragment;
        if (!z5 || !this.A02.A0E(3623)) {
            this.A05.setVisibility(8);
            this.A0B.setVisibility(8);
        } else {
            A0A();
        }
        this.A04 = C012005e.A02(view2, R.id.recent_merchants_separator);
        this.A0A = C90514aH.A0U(view2, R.id.recent_merchants_container);
        this.A15 = (RecyclerView) C012005e.A02(view2, R.id.recent_merchants_contacts_row);
        if (!z5 || !this.A02.A0E(4291)) {
            this.A04.setVisibility(8);
            this.A0A.setVisibility(8);
        } else {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment3 = (IndiaUpiPaymentSettingsFragment) this;
            indiaUpiPaymentSettingsFragment3.A0t.Box(new C49442j7(indiaUpiPaymentSettingsFragment3.A0K, indiaUpiPaymentSettingsFragment3.A0P, new AnonymousClass32a(indiaUpiPaymentSettingsFragment3), indiaUpiPaymentSettingsFragment3, indiaUpiPaymentSettingsFragment3.A0R), new AnonymousClass012[0]);
        }
        TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) view2.findViewById(R.id.payment_history_container);
        this.A19 = transactionsExpandableView;
        transactionsExpandableView.setTitle(A0n(R.string.f12nameremoved));
        this.A19.setSeeMoreView(A0n(R.string.f12nameremoved), A0n(R.string.f12nameremoved), new C207369uz(this, 35));
        View inflate = A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        this.A19.setCustomEmptyView(inflate);
        AnonymousClass3UF.A0E(C36391kE.A0N(inflate, R.id.payment_nux_logo), C36341k9.A0G(this).getColor(R.color.f6nameremoved));
        this.A06 = (FrameLayout) C012005e.A02(view2, R.id.recurring_payment_container);
        this.A08 = (FrameLayout) view2.findViewById(R.id.payment_custom_header_row);
        this.A07 = (FrameLayout) view2.findViewById(R.id.custom_footer_container);
        this.A03 = view2.findViewById(R.id.payment_custom_header_row_separator);
        TransactionsExpandableView transactionsExpandableView2 = (TransactionsExpandableView) view2.findViewById(R.id.requests_container);
        this.A18 = transactionsExpandableView2;
        transactionsExpandableView2.setSeeMoreView(A0n(R.string.f12nameremoved), A0n(R.string.f12nameremoved), new C207369uz(this, 36));
        AnonymousClass9Kh r96 = new AnonymousClass9Kh(A0i());
        r96.A00 = 2;
        TransactionsExpandableView transactionsExpandableView3 = this.A19;
        transactionsExpandableView3.A00 = r96;
        TransactionsExpandableView transactionsExpandableView4 = this.A18;
        transactionsExpandableView4.A00 = r96;
        transactionsExpandableView3.setPaymentRequestActionCallback(this);
        transactionsExpandableView4.setPaymentRequestActionCallback(this);
        View findViewById2 = view2.findViewById(R.id.invite_container);
        this.A13 = findViewById2;
        if (z5) {
            r82 = new C207359uy(this, 38);
        } else {
            r82 = new C207369uz(this, 34);
        }
        findViewById2.setOnClickListener(r82);
        C36811lL A0K2 = this.A0q.A0K(A0i(), this.A0c.A02(), R.color.f6nameremoved, R.dimen.f7nameremoved);
        TextView A0P2 = C36391kE.A0P(view2, R.id.payments_drawable_text_view);
        ImageView A0N2 = C36391kE.A0N(view2, R.id.payments_drawable_image_view);
        if (A0K2 != null) {
            A0N2.setImageDrawable(A0K2);
            A0P2.setVisibility(8);
            A0N2.setVisibility(0);
        } else {
            if (z2) {
                r5 = this.A0c.A01();
                if (r5 == null) {
                    BAV = "";
                }
                context = A0a();
                BAV = ((AnonymousClass16W) r5).BAV(context, 0);
            } else if (z5) {
                r5 = AnonymousClass16W.A05;
                context = A0a();
                BAV = ((AnonymousClass16W) r5).BAV(context, 0);
            } else {
                BrazilPaymentSettingsFragment brazilPaymentSettingsFragment3 = (BrazilPaymentSettingsFragment) this;
                r5 = brazilPaymentSettingsFragment3.A03.A01("BRL");
                context = brazilPaymentSettingsFragment3.A0a();
                BAV = ((AnonymousClass16W) r5).BAV(context, 0);
            }
            A0P2.setText(BAV);
            A0P2.setVisibility(0);
            A0N2.setVisibility(8);
        }
        View findViewById3 = view2.findViewById(R.id.payments_settings_scroll_view_layout);
        ViewGroup A0P3 = C36411kG.A0P(view2, R.id.send_payment_fab);
        View findViewById4 = view2.findViewById(R.id.payments_text_view);
        LayoutTransition layoutTransition = A0P3.getLayoutTransition();
        layoutTransition.setInterpolator(0, new AnonymousClass065());
        layoutTransition.setInterpolator(1, new AnonymousClass065());
        layoutTransition.setDuration(150);
        View A023 = C012005e.A02(view2, R.id.payment_support_section);
        View A024 = C012005e.A02(view2, R.id.payment_support_section_separator);
        if (z2) {
            z = this.A0d.A0C();
        } else {
            z = true;
        }
        A023.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (z2 && !this.A0d.A0C()) {
            i2 = 8;
        }
        A024.setVisibility(i2);
        findViewById3.getViewTreeObserver().addOnScrollChangedListener(new C135926dU(findViewById3, findViewById4, A0P3, this));
        int A002 = AnonymousClass00F.A00(A0i(), R.color.f6nameremoved);
        C165567td.A0n(view2, R.id.change_pin_icon, A002);
        C165567td.A0n(view2, R.id.add_new_account_icon, A002);
        C165567td.A0n(view2, R.id.payment_support_icon, A002);
        AnonymousClass3UF.A0E(this.A19.A01, A002);
        AnonymousClass3UF.A0E(this.A18.A01, A002);
        C165567td.A0n(view2, R.id.fingerprint_setting_icon, A002);
        C165567td.A0n(view2, R.id.invite_icon, A002);
        C165567td.A0n(view2, R.id.payment_settings_icon, A002);
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass01I A0i2 = A0i();
            if (A0i2 instanceof C46622Zo) {
                A0i2.finish();
                if (A0i2.isTaskRoot()) {
                    Intent A032 = AnonymousClass190.A03(A0i2);
                    A0i2.finishAndRemoveTask();
                    A0i2.startActivity(A032);
                }
            }
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_debug) {
            return false;
        } else {
            String BFO = this.A0e.A05().BFO();
            if (TextUtils.isEmpty(BFO)) {
                return false;
            }
            A1C(C36431kI.A0D().setClassName(A0i(), BFO));
            return true;
        }
    }

    public void A1o(Intent intent) {
        Bundle extras = intent.getExtras();
        boolean z = false;
        if (extras != null) {
            z = extras.getBoolean("extra_force_get_methods", false);
        }
        this.A0k.A01(A1t(), z);
    }

    public String BEC(C207249un r2) {
        if (C203449o2.A03(A0i(), r2) != null) {
            return C203449o2.A03(A0i(), r2);
        }
        return "";
    }

    public /* synthetic */ boolean BtO() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (X.C201649k3.A00(r7.A0H) != null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwm(java.util.List r9) {
        /*
            r8 = this;
            boolean r0 = r8.A12()
            if (r0 == 0) goto L_0x00a2
            X.01I r0 = r8.A0h()
            if (r0 == 0) goto L_0x00a2
            r8.A0v = r9
            android.view.View r1 = r8.A0z
            r0 = 0
            r1.setVisibility(r0)
            X.7vZ r0 = r8.A0j
            r0.A00 = r9
            r0.notifyDataSetChanged()
            android.view.View r4 = r8.A0F
            if (r4 == 0) goto L_0x0090
            r3 = 0
            r2 = 8
            boolean r1 = r8 instanceof com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment
            if (r1 != 0) goto L_0x002a
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r0 == 0) goto L_0x0090
        L_0x002a:
            r0 = 2131432559(0x7f0b146f, float:1.8486879E38)
            X.C36341k9.A10(r4, r0, r2)
            r0 = 2131432556(0x7f0b146c, float:1.8486873E38)
            X.C36341k9.A10(r4, r0, r3)
            r0 = 2131432558(0x7f0b146e, float:1.8486877E38)
            X.C36341k9.A10(r4, r0, r3)
            r7 = r8
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r0 == 0) goto L_0x005e
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r7 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r7
            X.1EV r0 = r7.A0d
            boolean r0 = r0.A01()
            r6 = 1
            X.9k3 r5 = r7.A0H
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "p2p_context"
            java.lang.String r0 = X.C201649k3.A01(r5, r0, r3)
            if (r0 == 0) goto L_0x005e
            X.9k3 r0 = r7.A0H
            java.lang.String r0 = X.C201649k3.A00(r0)
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            r0 = 2131432555(0x7f0b146b, float:1.848687E38)
            if (r6 != 0) goto L_0x00a5
            X.C36341k9.A10(r4, r0, r2)
            r0 = 2131432554(0x7f0b146a, float:1.8486869E38)
            r5 = 2131432554(0x7f0b146a, float:1.8486869E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x00a3
            r1 = 1
        L_0x0074:
            int r0 = X.C36381kD.A00(r1)
            r2.setVisibility(r0)
            android.view.View r0 = r4.findViewById(r5)
            r0.setOnClickListener(r8)
            r0 = 2131432557(0x7f0b146d, float:1.8486875E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r1 != 0) goto L_0x008d
            r3 = 8
        L_0x008d:
            r0.setVisibility(r3)
        L_0x0090:
            android.widget.ListView r0 = r8.A11
            X.C54972tr.A00(r0)
            X.7yY r2 = r8.A0m
            if (r2 == 0) goto L_0x00a2
            r2.A02 = r9
            X.6O3 r1 = r8.A0h
            X.9jg r0 = r8.A0n
            r2.A0X(r1, r0)
        L_0x00a2:
            return
        L_0x00a3:
            r1 = 0
            goto L_0x0074
        L_0x00a5:
            r1 = 2131432555(0x7f0b146b, float:1.848687E38)
            X.C36341k9.A10(r4, r0, r3)
            r0 = 2131432554(0x7f0b146a, float:1.8486869E38)
            X.C36341k9.A10(r4, r0, r2)
            android.view.View r0 = r4.findViewById(r1)
            r0.setOnClickListener(r8)
            goto L_0x0090
        L_0x00b9:
            X.9Xk r0 = r5.A03
            boolean r0 = r0.A03()
            r6 = r0 ^ 1
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.Bwm(java.util.List):void");
    }

    public void Bww(List list) {
        String quantityString;
        if (A12() && A0h() != null) {
            this.A00 = list;
            this.A0z.setVisibility(0);
            if (this.A00.isEmpty()) {
                this.A10.setVisibility(8);
                this.A18.setVisibility(8);
                return;
            }
            this.A18.setVisibility(0);
            this.A10.setVisibility(0);
            this.A18.A01(this.A00);
            TransactionsExpandableView transactionsExpandableView = this.A18;
            List list2 = this.A00;
            if (this instanceof IndiaUpiPaymentSettingsFragment) {
                quantityString = A0n(R.string.f12nameremoved);
            } else {
                quantityString = C36341k9.A0G(this).getQuantityString(R.plurals.f10nameremoved, list2.size());
            }
            transactionsExpandableView.setTitle(quantityString);
        }
    }

    public void Bx7(List list) {
        if (A12() && A0h() != null) {
            this.A01 = list;
            this.A0z.setVisibility(0);
            this.A19.A01(this.A01);
            if (!(this instanceof IndiaUpiPaymentSettingsFragment) || !this.A02.A0E(3623)) {
                this.A05.setVisibility(8);
                this.A0B.setVisibility(8);
                return;
            }
            A0A();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.payment_support_container) {
            C167677yY r3 = this.A0m;
            if (r3 != null) {
                C203049nB.A03(C203049nB.A01(r3.A05, (AnonymousClass16X) null, this.A0h, (String) null, false), r3.A09, 39, "payment_home", (String) null, 1);
            }
            A1m();
        } else if (view.getId() == R.id.send_payment_fab) {
            A0C(this, (String) null);
        } else if (view.getId() == R.id.add_new_account || view.getId() == R.id.payment_settings_row_add_method) {
            BQr(AnonymousClass000.A1Q(this.A0j.getCount()));
        } else if (view.getId() == R.id.payment_settings_row) {
            A1s((String) null, "payment_home.add_payment_method");
        }
    }

    public /* synthetic */ int BEA(C207249un r2) {
        return 0;
    }

    public /* synthetic */ String BED(C207249un r2) {
        return null;
    }

    public /* synthetic */ boolean Bt7(C207249un r2) {
        return false;
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
    }
}
