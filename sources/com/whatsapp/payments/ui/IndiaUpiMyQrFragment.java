package com.whatsapp.payments.ui;

import X.AE0;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass07B;
import X.AnonymousClass08S;
import X.AnonymousClass0BT;
import X.AnonymousClass155;
import X.AnonymousClass16U;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass3U8;
import X.AnonymousClass3US;
import X.AnonymousClass9IM;
import X.BA9;
import X.BAX;
import X.C009504a;
import X.C009904e;
import X.C012005e;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C166177vE;
import X.C18820ts;
import X.C192659Ib;
import X.C19420v0;
import X.C19730wQ;
import X.C19970wo;
import X.C203479o6;
import X.C203559oI;
import X.C21060yb;
import X.C21100yf;
import X.C23175B8j;
import X.C24631De;
import X.C27731Pn;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.util.Log;

public class IndiaUpiMyQrFragment extends Hilt_IndiaUpiMyQrFragment {
    public View A00;
    public TextView A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public WaTextView A04;
    public AnonymousClass1Pp A05;
    public C27731Pn A06;
    public C19420v0 A07;
    public C18820ts A08;
    public C24631De A09;
    public IndiaUpiDisplaySecureQrCodeView A0A;
    public IndiaUpiSecureQrCodeViewModel A0B;
    public C192659Ib A0C;
    public ImageView A0D;
    public ImageView A0E;
    public AnonymousClass1RY A0F;
    public final C009904e A0G = BnD(new BAX(this, 1), new C009504a());

    public static IndiaUpiMyQrFragment A00(String str) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("extra_account_holder_name", str);
        A072.putInt("action_bar_title_res_id", 0);
        A072.putBoolean("bottom_icon_visible", true);
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = new IndiaUpiMyQrFragment();
        indiaUpiMyQrFragment.A17(A072);
        return indiaUpiMyQrFragment;
    }

    public static void A03(C203479o6 r8, IndiaUpiMyQrFragment indiaUpiMyQrFragment) {
        TextView textView;
        int i;
        Object[] objArr;
        AnonymousClass16U A012 = indiaUpiMyQrFragment.A09.A01();
        if (TextUtils.isEmpty(r8.A0A) || A012 == null) {
            textView = indiaUpiMyQrFragment.A01;
            i = R.string.f12nameremoved;
            objArr = new Object[]{r8.A09};
        } else {
            AnonymousClass16X A0R = C165607th.A0R(A012, r8.A0A);
            textView = indiaUpiMyQrFragment.A01;
            i = R.string.f12nameremoved;
            objArr = AnonymousClass001.A0M();
            objArr[0] = A012.B7d(indiaUpiMyQrFragment.A08, A0R);
            objArr[1] = r8.A09;
        }
        C36381kD.A1E(textView, indiaUpiMyQrFragment, objArr, i);
        indiaUpiMyQrFragment.A01.setVisibility(0);
    }

    public static void A05(IndiaUpiMyQrFragment indiaUpiMyQrFragment, boolean z) {
        C19730wQ r0 = indiaUpiMyQrFragment.A03;
        r0.A0G();
        if (r0.A0E == null) {
            return;
        }
        if (z) {
            AnonymousClass1RY r2 = indiaUpiMyQrFragment.A0F;
            C19730wQ r02 = indiaUpiMyQrFragment.A03;
            r02.A0G();
            r2.A08(indiaUpiMyQrFragment.A0E, r02.A0E);
        } else if (C36371kC.A01(C36341k9.A0E(indiaUpiMyQrFragment.A07), "privacy_profile_photo") != 0) {
            AnonymousClass1Pp r22 = indiaUpiMyQrFragment.A05;
            ImageView imageView = indiaUpiMyQrFragment.A0E;
            C19730wQ r03 = indiaUpiMyQrFragment.A03;
            r03.A0G();
            r22.A07(imageView, r03.A0E);
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        View view;
        if (i == 1006) {
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A0A;
            int i3 = 8;
            if (indiaUpiDisplaySecureQrCodeView.A06.getVisibility() == 8) {
                view = indiaUpiDisplaySecureQrCodeView.A05;
            } else {
                view = indiaUpiDisplaySecureQrCodeView.A02;
            }
            view.setVisibility(0);
            boolean A092 = indiaUpiDisplaySecureQrCodeView.A0B.A09(C21100yf.A0h);
            TextView textView = indiaUpiDisplaySecureQrCodeView.A08;
            if (A092 && indiaUpiDisplaySecureQrCodeView.A04.getVisibility() != 0) {
                i3 = 0;
            }
            textView.setVisibility(i3);
            return;
        }
        super.A1N(i, i2, intent);
    }

    public void A1S(Bundle bundle, View view) {
        boolean z;
        String[] A062;
        Object obj;
        String[] A063;
        String str;
        String trim;
        this.A0F = this.A06.A05(view.getContext(), "india-upi-my-qr-fragment");
        this.A00 = C012005e.A02(view, R.id.qrcode_view);
        this.A0E = C36401kF.A0G(view, R.id.contact_photo);
        this.A01 = C36391kE.A0O(view, R.id.scan_to_pay_info);
        this.A0A = (IndiaUpiDisplaySecureQrCodeView) C012005e.A02(view, R.id.display_qr_code_view);
        this.A0D = C36401kF.A0G(view, R.id.bottom_icon);
        Bundle bundle2 = this.A0A;
        String str2 = null;
        if (bundle2 != null) {
            str2 = bundle2.getString("extra_account_holder_name");
            z = bundle2.getBoolean("bottom_icon_visible", true);
        } else {
            z = true;
        }
        this.A0D.setVisibility(C36351kA.A00(z ? 1 : 0));
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = (IndiaUpiSecureQrCodeViewModel) C36441kJ.A0b(this).A00(IndiaUpiSecureQrCodeViewModel.class);
        this.A0B = indiaUpiSecureQrCodeViewModel;
        BA9 ba9 = new BA9(this, 28);
        BA9 ba92 = new BA9(this, 27);
        AnonymousClass08S r2 = indiaUpiSecureQrCodeViewModel.A01;
        r2.A08(this, ba9);
        AnonymousClass08S r8 = indiaUpiSecureQrCodeViewModel.A00;
        r8.A08(this, ba92);
        AE0 ae0 = indiaUpiSecureQrCodeViewModel.A06;
        synchronized (ae0) {
            A062 = AE0.A06(ae0, "signedQrCode", "signedQrCodeTs");
        }
        if (TextUtils.isEmpty(A062[0])) {
            C203479o6 A0S = indiaUpiSecureQrCodeViewModel.A0S();
            A0S.A04 = "01";
            String A002 = AE0.A00(ae0);
            A0S.A0O = A002;
            if (TextUtils.isEmpty(A002)) {
                obj = new AnonymousClass9IM(-1, -1);
            } else {
                if (TextUtils.isEmpty(str2)) {
                    trim = indiaUpiSecureQrCodeViewModel.A05.A02();
                    indiaUpiSecureQrCodeViewModel.A07.A0A(new C23175B8j(indiaUpiSecureQrCodeViewModel, A0S, 8), C165587tf.A0W(indiaUpiSecureQrCodeViewModel.A08));
                } else {
                    trim = str2.trim();
                }
                A0S.A09 = trim;
                r2 = r8;
                obj = A0S;
            }
        } else {
            r2 = r8;
            obj = C203479o6.A01(A062[0], "SCANNED_QR_CODE");
        }
        r2.A0D(obj);
        this.A0A.setup(this.A0B);
        A05(this, true);
        CopyableTextView copyableTextView = (CopyableTextView) C012005e.A02(view, R.id.user_wa_vpa);
        String str3 = this.A0B.A0S().A0O;
        copyableTextView.A02 = str3;
        C36381kD.A1E(copyableTextView, this, new Object[]{str3}, R.string.f12nameremoved);
        WaTextView A0Q = C36401kF.A0Q(view, R.id.user_account_name);
        this.A04 = A0Q;
        A0Q.setText(this.A0B.A0S().A09);
        PhoneUserJid A0n = C36441kJ.A0n(this.A03);
        if (!(A0n == null || (str = A0n.user) == null)) {
            C36391kE.A0O(view, R.id.user_wa_phone).setText(AnonymousClass3U8.A01(C203559oI.A00(), str));
        }
        C36381kD.A1E(this.A01, this, new Object[]{this.A0B.A0S().A09}, R.string.f12nameremoved);
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel2 = this.A0B;
        AE0 ae02 = indiaUpiSecureQrCodeViewModel2.A06;
        synchronized (ae02) {
            A063 = AE0.A06(ae02, "signedQrCode", "signedQrCodeTs");
        }
        if (!indiaUpiSecureQrCodeViewModel2.A03.A09(C21100yf.A0h) || (!TextUtils.isEmpty(A063[0]) && !TextUtils.isEmpty(A063[1]) && C19970wo.A00(indiaUpiSecureQrCodeViewModel2.A04) - Long.parseLong(A063[1]) <= 259200000)) {
            indiaUpiSecureQrCodeViewModel2.A01.A0D(new AnonymousClass9IM(0, -1));
        } else {
            IndiaUpiSecureQrCodeViewModel.A01(indiaUpiSecureQrCodeViewModel2, -1);
        }
        A10(true);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        this.A0F.A02();
        this.A00 = null;
        this.A0E = null;
        this.A04 = null;
        this.A01 = null;
        this.A0A = null;
        this.A0D = null;
    }

    public void A1M() {
        AnonymousClass07B supportActionBar;
        super.A1M();
        Bundle bundle = this.A0A;
        AnonymousClass01I A0i = A0i();
        if ((A0i instanceof AnonymousClass155) && bundle != null && bundle.getInt("action_bar_title_res_id", 0) != 0 && (supportActionBar = ((AnonymousClass01L) A0i).getSupportActionBar()) != null) {
            C165577te.A10(supportActionBar, bundle.getInt("action_bar_title_res_id"));
        }
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        menu.add(0, R.id.menuitem_share_qr, 0, R.string.f12nameremoved).setIcon(AnonymousClass0BT.A00(A0a().getTheme(), C36341k9.A0G(this), R.drawable.ic_action_share)).setShowAsAction(1);
        menu.add(0, R.id.menuitem_print, 0, R.string.f12nameremoved);
    }

    public boolean A1X(MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == R.id.menuitem_share_qr) {
            if (AnonymousClass00F.A01(A0a(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i = R.string.f12nameremoved;
                } else {
                    i = R.string.f12nameremoved;
                    if (i2 < 33) {
                        i = R.string.f12nameremoved;
                    }
                }
                this.A0G.A02(AnonymousClass3US.A03(A0a(), R.string.f12nameremoved, i, true));
            } else {
                IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = this.A0B;
                if (indiaUpiSecureQrCodeViewModel != null) {
                    IndiaUpiSecureQrCodeViewModel.A02(indiaUpiSecureQrCodeViewModel, C36361kB.A0n(this.A0A.A0F), 0);
                    return true;
                }
            }
        } else if (menuItem.getItemId() != R.id.menuitem_print) {
            return false;
        } else {
            if (!(this.A0A.A09 == null || A0h() == null || this.A00 == null)) {
                A05(this, false);
                this.A00.setDrawingCacheEnabled(true);
                this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                View view = this.A00;
                view.layout(0, 0, view.getMeasuredWidth(), this.A00.getMeasuredHeight());
                this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.A00.buildDrawingCache(true);
                Bitmap createBitmap = Bitmap.createBitmap(this.A00.getDrawingCache());
                AnonymousClass01I A0i = A0i();
                String str = this.A0B.A0S().A09;
                PrintManager printManager = (PrintManager) C21060yb.A02(A0i, "print");
                if (printManager == null) {
                    Log.e("PAY: payments-display-qr/print/no-print-manager");
                } else {
                    printManager.print(str, new C166177vE(A0i, createBitmap), (PrintAttributes) null);
                }
                this.A00.setDrawingCacheEnabled(false);
                A05(this, true);
                return true;
            }
        }
        return true;
    }
}
