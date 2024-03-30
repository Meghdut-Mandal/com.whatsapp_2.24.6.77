package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8jE  reason: invalid class name and case insensitive filesystem */
public abstract class C179128jE extends C179138jF {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public AnonymousClass3DY A04;
    public C20050ww A05;
    public AnonymousClass171 A06;
    public C24881Ed A07;
    public AnonymousClass141 A08;
    public AnonymousClass16X A09;
    public C175748az A0A;
    public C207249un A0B;
    public C21010yW A0C;
    public AnonymousClass13E A0D;
    public UserJid A0E;
    public C135086c7 A0F;
    public C135086c7 A0G;
    public C135086c7 A0H;
    public C135086c7 A0I;
    public C199499fP A0J;
    public C175818b6 A0K;
    public C202269lR A0L;
    public AE0 A0M;
    public C201659k4 A0N;
    public C175928bI A0O = new C175928bI();
    public C24601Db A0P;
    public AnonymousClass1DR A0Q;
    public C1033154u A0R;
    public AF7 A0S;
    public C50282kV A0T;
    public C206799tz A0U = null;
    public AnonymousClass5GM A0V;
    public AnonymousClass1FR A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public List A0i;
    public AnonymousClass004 A0j;
    public boolean A0k;
    public boolean A0l = true;
    public boolean A0m = false;
    public boolean A0n = false;
    public boolean A0o = true;
    public final C24611Dc A0p = C165607th.A0a("IndiaUpiBasePaymentsActivity");
    public final AtomicInteger A0q = new AtomicInteger();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3.A0l != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3x() {
        /*
            r3 = this;
            r0 = 1
            r3.A0m = r0
            X.1qm r2 = X.AnonymousClass3LW.A00(r3)
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            r2.A0d(r0)
            boolean r0 = r3 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x0038
            boolean r1 = r3.A0l
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x0016:
            r1 = 2131892365(0x7f12188d, float:1.9419476E38)
        L_0x0019:
            java.lang.String r0 = r3.getString(r1)
        L_0x001d:
            r2.A0p(r0)
            r1 = 2131892361(0x7f121889, float:1.9419468E38)
            r0 = 31
            X.B83.A01(r2, r3, r0, r1)
            r1 = 2131892360(0x7f121888, float:1.9419466E38)
            r0 = 32
            X.B83.A00(r2, r3, r0, r1)
            r0 = 0
            r2.A0r(r0)
            r2.A0b()
            return
        L_0x0038:
            boolean r0 = r3.A0l
            r1 = 2131892359(0x7f121887, float:1.9419464E38)
            if (r0 == 0) goto L_0x0019
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179128jE.A3x():void");
    }

    private void A1N(C175818b6 r5, C202059ky r6, C199729fr r7, String str) {
        this.A0S.BOm(C36381kD.A0m(), (Integer) null, str, (String) null);
        this.A0M.B5D(this.A0L.A04(r5), true);
        if (this instanceof IndiaUpiDeviceBindStepActivity) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this;
            if (r6.A00 == 11473) {
                indiaUpiDeviceBindStepActivity.A01 = 1;
                IndiaUpiDeviceBindStepActivity.A1C(indiaUpiDeviceBindStepActivity, new C199729fr(R.string.f12nameremoved), true);
            } else {
                indiaUpiDeviceBindStepActivity.A01 = 7;
                IndiaUpiDeviceBindStepActivity.A1C(indiaUpiDeviceBindStepActivity, r7, true);
            }
        } else if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            if (r6.A00 == 11473) {
                indiaUpiBankAccountPickerActivity.A00 = 1;
                IndiaUpiBankAccountPickerActivity.A11(indiaUpiBankAccountPickerActivity, new C199729fr(R.string.f12nameremoved), true);
            } else {
                indiaUpiBankAccountPickerActivity.A00 = 7;
                IndiaUpiBankAccountPickerActivity.A11(indiaUpiBankAccountPickerActivity, r7, true);
            }
        }
        C202269lR r3 = this.A0L;
        ArrayList arrayList = r3.A07;
        if (arrayList != null && arrayList.size() > 1) {
            r3.A01++;
        }
        ArrayList A022 = C202269lR.A02(r5, r3);
        if (A022 != null) {
            int size = A022.size();
            r3.A00 = size;
            int i = r3.A02 + 1;
            if (i != size) {
                r3.A02 = i;
                return;
            }
        }
        r3.A02 = 0;
    }

    public String A3t(String str) {
        try {
            String rawString = C36371kC.A0e(this.A02).getRawString();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                long A002 = C19970wo.A00(this.A07);
                byte[] bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) ((int) A002);
                    A002 >>= 8;
                }
                instance.update(bArr);
                instance.update(rawString.getBytes());
                byte[] bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
                instance.update(bArr2);
                byte[] bArr3 = new byte[15];
                System.arraycopy(instance.digest(), 0, bArr3, 0, 15);
                return A3u(str, C18750th.A06(bArr3));
            } catch (NoSuchAlgorithmException e) {
                this.A0p.A08("payment", "generateUuid unable to hash due to missing sha256 algorithm", e);
                return null;
            }
        } catch (Exception e2) {
            this.A0p.A08("payment", "generateUuid unable to hash due to missing phone user jid", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.8jC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3v() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C179108jC
            if (r0 == 0) goto L_0x002a
            r3 = r4
            X.8jC r3 = (X.C179108jC) r3
            X.9lR r0 = r3.A0L
            X.9YX r0 = r0.A04
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1Dc r2 = r3.A0J
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9lR r0 = r3.A0L
            X.9YX r0 = r0.A04
            X.C165567td.A17(r2, r0, r1)
        L_0x0024:
            X.9lR r0 = r3.A0L
        L_0x0026:
            r0.A09()
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity
            if (r0 == 0) goto L_0x0031
            X.9lR r0 = r4.A0L
            goto L_0x0026
        L_0x0031:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x0054
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r3 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r3
            X.9YX r0 = r3.A0B
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1Dc r2 = r3.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9YX r0 = r3.A0B
            X.C165567td.A17(r2, r0, r1)
            goto L_0x0024
        L_0x0054:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity
            if (r0 == 0) goto L_0x0079
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r3
            X.9YX r0 = r3.A07
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1Dc r2 = r3.A0Y
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9YX r0 = r3.A07
            java.lang.String r0 = r0.toString()
            X.C165567td.A18(r2, r0, r1)
            goto L_0x0024
        L_0x0079:
            boolean r0 = r4 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x0029
            r3 = r4
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r3 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r3
            X.9YX r0 = r3.A05
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1Dc r2 = r3.A0G
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9YX r0 = r3.A05
            java.lang.String r0 = r0.toString()
            X.C165567td.A18(r2, r0, r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179128jE.A3v():void");
    }

    public void A3w() {
        if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A0J = false;
            AnonymousClass0CZ r0 = indiaUpiBankAccountPickerActivity.A02.A0G;
            if (r0 != null) {
                r0.A06();
                return;
            }
            return;
        }
        View findViewById = findViewById(R.id.progress);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public void A40(int i, String str) {
        String str2 = str;
        this.A0S.A09(C36361kB.A0i(), Integer.valueOf(i), str2, this.A0f, this.A0i, this.A0h, C179148jG.A1P(this));
    }

    public void A42(Intent intent) {
        intent.putExtra("extra_conversation_message_type", this.A00);
        intent.putExtra("extra_jid", AnonymousClass143.A03(this.A0E));
        intent.putExtra("extra_receiver_jid", AnonymousClass143.A03(this.A0G));
        intent.putExtra("extra_quoted_msg_row_id", this.A02);
        intent.putExtra("extra_payment_preset_amount", this.A0k);
        intent.putExtra("extra_transaction_id", this.A0o);
        intent.putExtra("extra_payment_preset_min_amount", this.A0m);
        intent.putExtra("extra_payment_preset_max_amount", this.A0l);
        intent.putExtra("extra_request_message_key", this.A0n);
        intent.putExtra("extra_is_pay_money_only", this.A0u);
        intent.putExtra("extra_payment_note", this.A0j);
        intent.putExtra("extra_payment_background", this.A0B);
        intent.putExtra("extra_payment_sticker", this.A0c);
        intent.putExtra("extra_payment_sticker_send_origin", this.A0f);
        List list = this.A0r;
        if (list != null) {
            intent.putExtra("extra_mentioned_jids", C65713Te.A01(list));
        }
        intent.putExtra("extra_inviter_jid", AnonymousClass143.A03(this.A0F));
        intent.putExtra("extra_receiver_jid", AnonymousClass143.A03(this.A0G));
        intent.putExtra("extra_in_setup", this.A0k);
        intent.putExtra("extra_setup_mode", this.A03);
        intent.putExtra("extra_payment_handle", this.A0I);
        intent.putExtra("extra_payment_handle_id", this.A0h);
        intent.putExtra("extra_merchant_code", this.A0Z);
        intent.putExtra("extra_transaction_ref", this.A0g);
        intent.putExtra("extra_payee_name", this.A0G);
        intent.putExtra("extra_transaction_ref_url", this.A0d);
        intent.putExtra("extra_purpose_code", this.A0c);
        intent.putExtra("extra_initiation_mode", this.A0Y);
        intent.putExtra("extra_incoming_pay_request_id", this.A0X);
        intent.putExtra("extra_selected_bank", this.A0K);
        intent.putExtra("extra_payment_bank_account_added_in_onboarding", this.A0A);
        intent.putExtra("extra_payments_entry_type", this.A02);
        intent.putExtra("extra_is_first_payment_method", this.A0l);
        intent.putExtra("extra_skip_value_props_display", this.A0o);
        intent.putExtra("extra_transaction_type", this.A0p);
        intent.putExtra("extra_transaction_token", this.A0q);
        intent.putExtra("extra_transaction_is_merchant", this.A0t);
        intent.putExtra("extra_transaction_is_valid_merchant", this.A0v);
        intent.putExtra("extra_banner_type", this.A00);
        intent.putExtra("extra_payment_flow_entry_point", this.A01);
        intent.putExtra("extra_referral_screen", this.A0e);
        intent.putExtra("extra_order_type", this.A0i);
        intent.putExtra("extra_payment_config_id", this.A0h);
        intent.putExtra("extra_order_formatted_discount_amount", this.A0F);
        intent.putExtra("extra_payment_method_type", this.A0a);
        intent.putExtra("extra_external_payment_source", this.A0g);
        intent.putExtra("extra_is_interop_add_payment_method", this.A0s);
        intent.putExtra("extra_scan_qr_onboarding_only", this.A0y);
    }

    public void A43(Menu menu) {
        if (this.A0D.A0E(732)) {
            MenuItem add = menu.add(0, R.id.menuitem_help, 0, C36401kF.A0o(this.A00.A00, R.string.f12nameremoved));
            add.setIcon(R.drawable.ic_settings_help).setShowAsAction(9);
            AnonymousClass0VM.A01(C36431kI.A0G(this, R.color.f6nameremoved), add);
        }
    }

    public void A44(String str) {
        Intent intent;
        String str2;
        int i = this.A02;
        switch (i) {
            case 0:
                Log.e("Entry point not provided while onboarding");
            case 6:
            case 11:
                if (!this.A0l) {
                    C175748az r0 = this.A0A;
                    if (r0 != null) {
                        C175818b6 r02 = (C175818b6) r0.A08;
                        if (r02 != null) {
                            if (!AnonymousClass000.A1X(C165577te.A0g(r02.A04))) {
                                intent = C36431kI.A0D();
                                intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity");
                                intent.putExtra("extra_bank_account", this.A0A);
                                intent.putExtra("extra_payment_method_type", this.A0a);
                                intent.putExtra("event_screen", "setup_pin");
                                break;
                            }
                        } else {
                            str2 = "Invalid bank's country data";
                        }
                    } else {
                        str2 = "Invalid Bank Account added is null";
                    }
                    Log.e(str2);
                    finish();
                    return;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 14:
                A3v();
                intent = C36431kI.A0D();
                intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
                break;
            default:
                C36321k7.A1T("No implementation for payments entry point ", AnonymousClass000.A0u(), i);
                return;
        }
        A3v();
        intent = C36431kI.A0D();
        intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
        A42(intent);
        C165587tf.A0u(intent, this, "extra_previous_screen", str);
    }

    public boolean A45() {
        if (this.A0G == null && this.A0E == null && !C202349ld.A02(this.A0I)) {
            return true;
        }
        return false;
    }

    public boolean A46(C175818b6 r6, C202059ky r7, String str) {
        C199729fr r0;
        int i;
        int i2 = r7.A00;
        if (i2 != 11473) {
            if (i2 == 11474) {
                i = R.string.f12nameremoved;
            } else if (i2 != 11484) {
                if (i2 != 11498) {
                    if (i2 != 11500) {
                        if (i2 != 11534) {
                            if (i2 != 20686) {
                                switch (i2) {
                                    case 21143:
                                        break;
                                    case 21144:
                                    case 21145:
                                        break;
                                    default:
                                        switch (i2) {
                                            case 21147:
                                            case 21148:
                                            case 21149:
                                            case 21150:
                                                break;
                                        }
                                }
                            }
                        }
                    }
                    r0 = new C199729fr(i2, str);
                    A1N(r6, r7, r0, "retry_device_binding_on_error");
                    return true;
                }
                this.A0S.BOm(0, (Integer) null, "updated_onboarding_error_strings", (String) null);
                return false;
            } else {
                i = R.string.f12nameremoved;
            }
            r0 = new C199729fr(i);
            A1N(r6, r7, r0, "retry_device_binding_on_error");
            return true;
        } else if (this.A0D.A0E(1685)) {
            A1N(r6, r7, new C199729fr(r7.A00, str), "retry_device_binding_xh_error");
            return true;
        }
        return false;
    }

    public String BGY() {
        AnonymousClass141 r1 = this.A08;
        if (r1 == null) {
            return (String) C165577te.A0g(this.A0I);
        }
        return this.A06.A0H(r1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            A3v();
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C165567td.A18(this.A0p, " onBackPressed", C36381kD.A11(this));
        A3v();
        finish();
        super.onBackPressed();
    }

    public static void A1M(AlertDialog$Builder alertDialog$Builder, C179128jE r3, String str, String str2) {
        alertDialog$Builder.setPositiveButton(R.string.f12nameremoved, new C203979pG(r3, str2, str));
        alertDialog$Builder.setNegativeButton(R.string.f12nameremoved, C204069pP.A00);
        alertDialog$Builder.A0a(true);
        alertDialog$Builder.A0b();
        r3.A0S.BOm(C36381kD.A0m(), 39, str, (String) null);
    }

    public void A2x(int i) {
        A3v();
        finish();
    }

    public String A3u(String str, String str2) {
        int length = str.length();
        if (length <= 8) {
            String A0D2 = C36321k7.A0D(str, str2);
            if (A0D2.length() > 35) {
                return C90514aH.A0z(A0D2, 35);
            }
            return A0D2;
        }
        throw AnonymousClass001.A08(this.A0p.A03(AnonymousClass000.A0r("prefixAndTruncate called with too long a prefix: ", AnonymousClass000.A0u(), length)));
    }

    public void A3y(int i, int i2) {
        Toolbar A0R2 = C36411kG.A0R(this);
        AnonymousClass07B A0Q2 = C36431kI.A0Q(this, A0R2);
        if (A0Q2 != null) {
            A0Q2.A0L(AnonymousClass00E.A00(this, i));
            A0Q2.A0U(true);
            A0Q2.A0X(false);
            A0R2.setOverflowIcon(AnonymousClass3UF.A08(AnonymousClass00E.A00(this, R.drawable.vec_ic_more), AnonymousClass00F.A00(this, R.color.f6nameremoved)));
            View findViewById = findViewById(i2);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new C135906dS(findViewById, A0Q2, this));
            }
        }
    }

    public void A3z(int i, int i2) {
        A3y(R.drawable.onboarding_actionbar_home_close, i2);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(i);
            supportActionBar.A0X(true);
        }
    }

    public void A41(int i, String str, String str2) {
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(i);
        A1M(A002, this, str, str2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C165567td.A16(this.A0p, this, "onCreate", AnonymousClass000.A0u());
        this.A0J.A01(new B5A(this, 1));
        if (getIntent() != null) {
            boolean z = false;
            this.A0k = getIntent().getBooleanExtra("extra_in_setup", false);
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
            this.A0I = (C135086c7) getIntent().getParcelableExtra("extra_payment_handle");
            this.A0h = getIntent().getStringExtra("extra_payment_handle_id");
            this.A0Z = getIntent().getStringExtra("extra_merchant_code");
            this.A0g = getIntent().getStringExtra("extra_transaction_ref");
            this.A0G = (C135086c7) getIntent().getParcelableExtra("extra_payee_name");
            this.A0H = (C135086c7) getIntent().getParcelableExtra("extra_payment_upi_number");
            this.A0d = getIntent().getStringExtra("extra_transaction_ref_url");
            this.A0c = getIntent().getStringExtra("extra_purpose_code");
            this.A0Y = getIntent().getStringExtra("extra_initiation_mode");
            this.A0X = getIntent().getStringExtra("extra_incoming_pay_request_id");
            this.A0K = (C175818b6) getIntent().getParcelableExtra("extra_selected_bank");
            this.A0A = (C175748az) getIntent().getParcelableExtra("extra_payment_bank_account_added_in_onboarding");
            this.A02 = getIntent().getIntExtra("extra_payments_entry_type", 0);
            this.A0l = getIntent().getBooleanExtra("extra_is_first_payment_method", true);
            this.A0o = getIntent().getBooleanExtra("extra_skip_value_props_display", true);
            this.A00 = getIntent().getIntExtra("extra_banner_type", 0);
            this.A01 = getIntent().getIntExtra("extra_payment_flow_entry_point", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("extra_should_open_transaction_detail_after_send_override", false);
            int i = this.A01;
            if (i == 2 || i == 3 || booleanExtra) {
                z = true;
            }
            this.A0w = z;
            this.A0e = C165587tf.A0g(this);
            this.A0b = getIntent().getStringExtra("extra_previous_screen");
            this.A0F = (C135086c7) getIntent().getParcelableExtra("extra_order_formatted_discount_amount");
            this.A0a = getIntent().getStringExtra("extra_payment_method_type");
        }
        if (this.A0O.A02.A0E(698)) {
            this.A0R.A0F();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C165567td.A18(this.A0p, " action bar home", C36381kD.A11(this));
        A3v();
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A0J.A02()) {
            C199499fP.A00(this);
        }
    }
}
