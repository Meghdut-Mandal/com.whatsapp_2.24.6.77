package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.PaymentDeleteAccountActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import com.whatsapp.util.Log;

/* renamed from: X.8i4  reason: invalid class name and case insensitive filesystem */
public abstract class C178888i4 extends C173888Tn implements View.OnClickListener {
    public AnonymousClass17Y A00;
    public AnonymousClass3DY A01;
    public C20050ww A02;
    public C18820ts A03;
    public C207249un A04;
    public AnonymousClass13E A05;
    public AnonymousClass1EZ A06;
    public AnonymousClass1YN A07;
    public C24631De A08;
    public AnonymousClass1EU A09;
    public C50282kV A0A;
    public C199849g7 A0B;
    public PayToolbar A0C;
    public C19770wU A0D;
    public int A0E;
    public TextView A0F;
    public TextView A0G;
    public CopyableTextView A0H;
    public C196109Xr A0I;
    public boolean A0J;
    public final C24611Dc A0K = C165607th.A0c("PaymentMethodDetailsActivity", "payment-settings");
    public final C22955Az7 A0L = new C23216B9y(this, 0);

    public static int A0F(C178888i4 r3, int i) {
        TypedArray typedArray;
        try {
            typedArray = r3.obtainStyledAttributes(i, new int[]{16843071});
        } catch (Resources.NotFoundException e) {
            Log.e(e.getMessage());
            typedArray = null;
        }
        if (typedArray != null) {
            return typedArray.getDimensionPixelOffset(0, -1);
        }
        return -1;
    }

    public void A3k(boolean z) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
        if (z) {
            indiaUpiBankAccountDetailsActivity.A0L.A06("unlinking the payment account.");
            Intent A0H2 = C36441kJ.A0H(indiaUpiBankAccountDetailsActivity, PaymentDeleteAccountActivity.class);
            A0H2.putExtra("extra_remove_payment_account", 1);
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A0H2, 0);
            return;
        }
        indiaUpiBankAccountDetailsActivity.Bu1(R.string.f12nameremoved);
        indiaUpiBankAccountDetailsActivity.A0D.Buu();
        AF7 af7 = indiaUpiBankAccountDetailsActivity.A0D;
        C23170B8e b8e = new C23170B8e(new C23175B8j(indiaUpiBankAccountDetailsActivity, af7, 4), af7, indiaUpiBankAccountDetailsActivity, 0);
        C175818b6 A0Q = C165597tg.A0Q(indiaUpiBankAccountDetailsActivity.A0L, indiaUpiBankAccountDetailsActivity.A00.A08, "IndiaUpiBankAccountDetailsActivity onRemovePaymentMethod Unable to get IndiaUpiMethodData");
        AnonymousClass8gQ r7 = indiaUpiBankAccountDetailsActivity.A0C;
        C135086c7 r4 = A0Q.A08;
        String str = A0Q.A0E;
        C135086c7 r5 = A0Q.A05;
        String str2 = indiaUpiBankAccountDetailsActivity.A00.A0A;
        if (C202349ld.A02(r4)) {
            r7.A06.A01(r7.A01, (AnonymousClass9YX) null, new AEU(r5, b8e, r7, str2));
        } else {
            AnonymousClass8gQ.A00(r4, r5, b8e, r7, str, str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r10 = r13
            super.onCreate(r14)
            boolean r2 = r13 instanceof com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity
            if (r2 == 0) goto L_0x0056
            r6 = 1
            r0 = 2131624976(0x7f0e0410, float:1.8877147E38)
        L_0x000c:
            r13.setContentView((int) r0)
            r0 = 2131433567(0x7f0b185f, float:1.8488923E38)
            android.view.View r4 = r13.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.LayoutInflater r1 = r13.getLayoutInflater()
            r0 = 2131625777(0x7f0e0731, float:1.8878772E38)
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r3)
            r4.addView(r0)
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x004b
            android.os.Bundle r0 = X.C36371kC.A0H(r13)
            if (r0 == 0) goto L_0x004b
            android.os.Bundle r0 = X.C36371kC.A0H(r13)
            java.lang.String r5 = "extra_bank_account"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r4 = "extra_bank_account_or_card_credential_id"
            if (r0 != 0) goto L_0x005b
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r0 = r0.getStringExtra(r4)
            if (r0 != 0) goto L_0x005b
        L_0x004b:
            X.1Dc r1 = r13.A0K
            java.lang.String r0 = "got null bank account; finishing"
            r1.A04(r0)
            r13.finish()
            return
        L_0x0056:
            r6 = 0
            r0 = 2131625776(0x7f0e0730, float:1.887877E38)
            goto L_0x000c
        L_0x005b:
            if (r6 == 0) goto L_0x006b
            r0 = 2131432387(0x7f0b13c3, float:1.848653E38)
            android.view.View r0 = r13.findViewById(r0)
            com.whatsapp.payments.ui.widget.PayToolbar r0 = (com.whatsapp.payments.ui.widget.PayToolbar) r0
            r13.A0C = r0
            r13.setSupportActionBar(r0)
        L_0x006b:
            if (r2 == 0) goto L_0x0121
            r1 = r10
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r1
            X.1EV r0 = r1.A06
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0080
            X.1EV r0 = r1.A06
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0121
        L_0x0080:
            X.17Y r8 = r13.A00
            X.0wU r12 = r13.A0D
            X.0ts r9 = r13.A03
            X.9g7 r11 = r13.A0B
            X.8hM r7 = new X.8hM
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x008d:
            r13.A0I = r7
            r7.A00()
            r0 = 2131432471(0x7f0b1417, float:1.84867E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r13, r0)
            r13.A0G = r0
            r0 = 2131432468(0x7f0b1414, float:1.8486694E38)
            android.view.View r0 = r13.findViewById(r0)
            com.whatsapp.CopyableTextView r0 = (com.whatsapp.CopyableTextView) r0
            r13.A0H = r0
            r0 = 2131432469(0x7f0b1415, float:1.8486696E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r13, r0)
            r13.A0F = r0
            r0 = 2131102239(0x7f060a1f, float:1.781691E38)
            if (r6 == 0) goto L_0x00b7
            r0 = 2131100523(0x7f06036b, float:1.781343E38)
        L_0x00b7:
            int r0 = X.AnonymousClass00F.A00(r13, r0)
            r13.A0E = r0
            r0 = 2131430750(0x7f0b0d5e, float:1.848321E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r13, r0)
            int r0 = r13.A0E
            X.AnonymousClass3UF.A0E(r1, r0)
            r0 = 2131430752(0x7f0b0d60, float:1.8483214E38)
            android.view.View r0 = r13.findViewById(r0)
            r0.setOnClickListener(r13)
            X.1YN r1 = r13.A07
            X.Az7 r0 = r13.A0L
            r1.registerObserver(r0)
            android.os.Bundle r0 = X.C36371kC.A0H(r13)
            java.lang.Object r1 = r0.get(r5)
            android.os.Bundle r0 = X.C36371kC.A0H(r13)
            if (r1 == 0) goto L_0x0112
            java.lang.Object r0 = r0.get(r5)
            X.9un r0 = (X.C207249un) r0
            java.lang.String r3 = r0.A0A
        L_0x00f0:
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            r13.Bu1(r0)
            X.1EU r0 = r13.A09
            X.9YB r0 = r0.A01()
            X.C18740tg.A06(r3)
            X.3ty r2 = r0.A03(r3)
            r0 = 8
            X.B9p r1 = new X.B9p
            r1.<init>(r13, r0)
            X.17Y r0 = r13.A00
            java.util.concurrent.Executor r0 = r0.A04
            r2.A0B(r1, r0)
            return
        L_0x0112:
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x00f0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r3 = r0.getStringExtra(r4)
            goto L_0x00f0
        L_0x0121:
            boolean r0 = r13 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity
            if (r0 == 0) goto L_0x013f
            r2 = r10
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r2
            android.os.Bundle r0 = X.C36371kC.A0H(r2)
            java.lang.Object r1 = r0.get(r5)
            X.9un r1 = (X.C207249un) r1
            X.9k4 r0 = r2.A07
            boolean r0 = r0.A06(r1)
            X.8hL r7 = new X.8hL
            r7.<init>(r2, r0)
            goto L_0x008d
        L_0x013f:
            X.9Xr r7 = new X.9Xr
            r7.<init>(r13)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178888i4.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        CharSequence charSequence;
        int i2;
        boolean z = true;
        switch (i) {
            case 200:
                i2 = R.string.f12nameremoved;
                break;
            case 201:
                C199849g7 r2 = this.A0B;
                C207249un r0 = this.A04;
                AnonymousClass00C.A0D(r0, 0);
                z = false;
                charSequence = C36391kE.A0v(this, r2.A02(r0, true), new Object[1], 0, R.string.f12nameremoved);
                break;
            case 202:
                i2 = R.string.f12nameremoved;
                break;
            default:
                return super.onCreateDialog(i);
        }
        charSequence = AnonymousClass3UG.A05(this, this.A0C, getString(i2));
        String string = getString(R.string.f12nameremoved);
        int i3 = 201;
        if (z) {
            i3 = 200;
        }
        C39001qm A012 = AnonymousClass3LW.A01(this, R.style.f13nameremoved);
        A012.A0p(charSequence);
        A012.A0r(true);
        A012.A0f(new B8L(this, i3, 3), R.string.f12nameremoved);
        A012.A0i(new C23162B7w(this, i3, 1, z), string);
        A012.A0e(new B81(this, i3, 3));
        if (!z) {
            A012.setTitle(getString(R.string.f12nameremoved));
        }
        return A012.create();
    }

    public void A3i() {
        AnonymousClass9FH r2;
        C19770wU r5 = this.A0D;
        AnonymousClass1EU r4 = this.A09;
        C24611Dc r3 = this.A0K;
        if (this instanceof IndiaUpiBankAccountDetailsActivity) {
            r2 = new AnonymousClass9FH((IndiaUpiBankAccountDetailsActivity) this);
        } else {
            r2 = null;
        }
        C36331k8.A1F(new C183648r8(r4, r3, r2, new AnonymousClass9FR(this)), r5);
    }

    public void onStop() {
        this.A07.unregisterObserver(this.A0L);
        super.onStop();
    }

    public void A2x(int i) {
        if (i == R.string.f12nameremoved) {
            finish();
        }
    }

    public void A3j(C207249un r3, boolean z) {
        int i;
        Bnv();
        if (r3 == null) {
            finish();
            return;
        }
        this.A04 = r3;
        this.A0J = AnonymousClass000.A1S(r3.A01, 2);
        C165607th.A1A(this.A0G, C207249un.A06(r3));
        ImageView A0Q = C36411kG.A0Q(this, R.id.payment_method_icon);
        if (r3 instanceof C175798b4) {
            i = C203449o2.A00(((C175798b4) r3).A01);
        } else {
            Bitmap A0A2 = r3.A0A();
            if (A0A2 != null) {
                A0Q.setImageBitmap(A0A2);
                this.A0I.A01(r3, z);
            }
            i = R.drawable.av_bank;
        }
        A0Q.setImageResource(i);
        this.A0I.A01(r3, z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            Intent A0D2 = C36431kI.A0D();
            int i3 = 0;
            if (intent != null) {
                i3 = intent.getIntExtra("extra_remove_payment_account", 0);
            }
            A0D2.putExtra("extra_remove_payment_account", i3);
            setResult(-1, A0D2);
            finish();
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.default_payment_method_row) {
            if (!this.A0J) {
                Bu1(R.string.f12nameremoved);
                if (this instanceof C178868i1) {
                    C178868i1 r4 = (C178868i1) this;
                    r4.A3m(new C21242ADy((C23083B3q) null, (C23075B3f) null, r4, 0), r4.A04.A0A, (String) null);
                    return;
                }
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
                if (indiaUpiBankAccountDetailsActivity.A06.A0O()) {
                    Intent A0G2 = C165597tg.A0G(indiaUpiBankAccountDetailsActivity);
                    A0G2.putExtra("extra_setup_mode", 2);
                    A0G2.putExtra("extra_payments_entry_type", 7);
                    C165587tf.A0u(A0G2, indiaUpiBankAccountDetailsActivity, "extra_referral_screen", "payment_bank_account_details");
                    return;
                }
                indiaUpiBankAccountDetailsActivity.Bu1(R.string.f12nameremoved);
                indiaUpiBankAccountDetailsActivity.A0D.Buu();
                C21242ADy aDy = new C21242ADy(indiaUpiBankAccountDetailsActivity.A04, indiaUpiBankAccountDetailsActivity.A0D, indiaUpiBankAccountDetailsActivity, 15);
                C175818b6 A0Q = C165597tg.A0Q(indiaUpiBankAccountDetailsActivity.A0L, indiaUpiBankAccountDetailsActivity.A00.A08, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData");
                AnonymousClass8gQ r5 = indiaUpiBankAccountDetailsActivity.A0C;
                C135086c7 r6 = A0Q.A08;
                String str2 = A0Q.A0E;
                C135086c7 r7 = A0Q.A05;
                String str3 = indiaUpiBankAccountDetailsActivity.A00.A0A;
                if (C202349ld.A02(r6)) {
                    r5.A06.A01(r5.A01, (AnonymousClass9YX) null, new AEX(r7, aDy, r5, str3, true, false));
                } else {
                    r5.A01(r6, r7, aDy, str2, str3, true, false);
                }
            }
        } else if (view.getId() == R.id.help_row) {
            C19770wU r1 = this.A0D;
            C50282kV r0 = this.A0A;
            if (r0 != null && r0.A06() == 1) {
                this.A0A.A0D(false);
            }
            Bundle A072 = AnonymousClass001.A07();
            A072.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:account-details");
            C175898bF r2 = this.A04.A08;
            if (r2 != null) {
                if ((r2 instanceof C175738ay) || (r2 instanceof C175888bE)) {
                    str = null;
                } else if (r2 instanceof C175858bB) {
                    str = ((C175858bB) r2).A0B;
                } else {
                    str = ((C175848bA) r2).A04;
                }
                A072.putString("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone", str);
            }
            C20050ww r72 = this.A02;
            C21100yf r62 = this.A06;
            C50282kV r22 = new C50282kV(A072, this, this.A01, r62, r72, this.A03, this.A04, (C202319lY) null, this.A05, this.A08, "payments:account-details");
            this.A0A = r22;
            C36331k8.A1F(r22, r1);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.f12nameremoved));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A3i();
            return true;
        }
    }
}
