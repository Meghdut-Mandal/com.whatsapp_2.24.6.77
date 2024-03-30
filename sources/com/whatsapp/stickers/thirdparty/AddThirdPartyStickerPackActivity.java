package com.whatsapp.stickers.thirdparty;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass04G;
import X.AnonymousClass17Y;
import X.AnonymousClass3LW;
import X.AnonymousClass4WH;
import X.C129156Fn;
import X.C18700tb;
import X.C18740tg;
import X.C19770wU;
import X.C21010yW;
import X.C27011Mj;
import X.C28721Tt;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C49962jy;
import X.C606138n;
import X.C67103Yn;
import X.C89374Wh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class AddThirdPartyStickerPackActivity extends AnonymousClass01I implements C18700tb {
    public C21010yW A00;
    public C606138n A01;
    public C19770wU A02;
    public boolean A03;
    public C49962jy A04;
    public final Object A05;
    public volatile C27011Mj A06;

    public class AddStickerPackDialogFragment extends Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment {
        public AnonymousClass17Y A00;
        public C606138n A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public final View.OnClickListener A06 = new C67103Yn(this, 27);
        public final View.OnClickListener A07 = new C67103Yn(this, 26);
        public final View.OnClickListener A08 = new C67103Yn(this, 25);
        public final C129156Fn A09 = new AnonymousClass4WH(this, 1);

        public static void A03(AddStickerPackDialogFragment addStickerPackDialogFragment, String str, int i, int i2, int i3) {
            Dialog dialog = addStickerPackDialogFragment.A02;
            if (dialog != null) {
                View findViewById = dialog.findViewById(R.id.message_text_view);
                C18740tg.A04(findViewById);
                C36361kB.A1P(str, (TextView) findViewById);
                C36411kG.A17(dialog, R.id.progress_bar, i);
                C36411kG.A17(dialog, R.id.ok_button, i2);
                C36411kG.A17(dialog, R.id.cancel_button, i3);
                C36411kG.A17(dialog, R.id.add_button, i3);
            }
        }

        public void A1H() {
            super.A1H();
            C606138n r0 = this.A01;
            r0.A01.unregisterObserver(this.A09);
        }

        public void A1Q(Bundle bundle) {
            super.A1Q(bundle);
            C606138n r0 = this.A01;
            r0.A01.registerObserver(this.A09);
        }

        public Dialog A1a(Bundle bundle) {
            super.A1a(bundle);
            Bundle bundle2 = this.A0A;
            if (bundle2 != null) {
                this.A03 = bundle2.getString("sticker_pack_id");
                this.A02 = bundle2.getString("sticker_pack_authority");
                String string = bundle2.getString("sticker_pack_name");
                this.A04 = string;
                if (string != null) {
                    this.A05 = Html.escapeHtml(string);
                }
            }
            View A0K = C36381kD.A0K(LayoutInflater.from(A1D()), R.layout.f9nameremoved);
            TextView A0P = C36391kE.A0P(A0K, R.id.message_text_view);
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = A0n(R.string.f12nameremoved);
            C36381kD.A1E(A0P, this, A0L, R.string.f12nameremoved);
            View findViewById = A0K.findViewById(R.id.ok_button);
            findViewById.setVisibility(8);
            findViewById.setOnClickListener(this.A08);
            View findViewById2 = A0K.findViewById(R.id.cancel_button);
            findViewById2.setVisibility(8);
            findViewById2.setOnClickListener(this.A07);
            View findViewById3 = A0K.findViewById(R.id.add_button);
            findViewById3.setOnClickListener(this.A06);
            findViewById3.setVisibility(8);
            C39001qm A042 = AnonymousClass3LW.A04(this);
            A042.setView(A0K);
            return A042.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                C36351kA.A11(A0h);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String packageName;
        StringBuilder A0u;
        String str;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_authority");
        String stringExtra3 = getIntent().getStringExtra("sticker_pack_name");
        if (!(getCallingActivity() == null || (packageName = getCallingActivity().getPackageName()) == null)) {
            ProviderInfo resolveContentProvider = this.A01.A00.resolveContentProvider(stringExtra2, 128);
            if (resolveContentProvider == null) {
                A0u = AnonymousClass000.A0u();
                str = "cannot find the provider for authority: ";
            } else if (!packageName.equals(resolveContentProvider.packageName)) {
                A0u = AnonymousClass000.A0u();
                A0u.append("the calling activity: ");
                A0u.append(packageName);
                str = " does not own authority: ";
            }
            String A0p = AnonymousClass000.A0p(str, stringExtra2, A0u);
            Intent A0D = C36431kI.A0D();
            A0D.putExtra("validation_error", A0p);
            setResult(0, A0D);
            Log.e(A0p);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        C49962jy r2 = new C49962jy(this, this.A00, this.A01, stringExtra, stringExtra2, stringExtra3);
        this.A04 = r2;
        C36331k8.A1F(r2, this.A02);
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C27011Mj(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public AddThirdPartyStickerPackActivity(int i) {
        this.A05 = C36441kJ.A11();
        this.A03 = false;
        C89374Wh.A00(this, 4);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    public void onDestroy() {
        super.onDestroy();
        C49962jy r0 = this.A04;
        if (r0 != null && !C36431kI.A1Y(r0)) {
            this.A04.A0D(true);
        }
    }

    public AddThirdPartyStickerPackActivity() {
        this(0);
    }
}
