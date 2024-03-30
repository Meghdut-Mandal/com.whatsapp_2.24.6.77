package X;

import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Objects;

/* renamed from: X.5DB  reason: invalid class name */
public abstract class AnonymousClass5DB extends C100924wG {
    public LottieAnimationView A00;
    public CircularProgressBar A01;
    public WaTextView A02;
    public RoundCornerProgressBar A03;
    public C33751fs A04;
    public C20830yE A05;
    public ChatTransferViewModel A06;
    public C62233Fh A07;
    public C32681e1 A08;
    public WDSButton A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public AnonymousClass1RJ A0C;
    public WDSButton A0D;
    public RelativeLayout A0E;
    public final C009904e A0F = BnD(new C165397tM(this, 9), new C009504a());

    public void A3i(int i) {
        AnonymousClass3FM r4;
        AnonymousClass179 r7 = this.A06;
        C20830yE r6 = this.A05;
        String A072 = A07(R.string.f12nameremoved);
        String A073 = A07(R.string.f12nameremoved);
        String A074 = A07(R.string.f12nameremoved);
        C36321k7.A0v(r7, 1, r6);
        AnonymousClass00C.A0D(A072, 4);
        C36361kB.A1J(A073, 6, A074);
        if (C19550w8.A09()) {
            if (!r6.A06()) {
                r4 = AnonymousClass3US.A04(this, A072);
            }
            C36341k9.A16(this.A06.A0D, 3);
            return;
        } else if (r7.A0A() || r6.A0D()) {
            if (r6.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                r4 = new AnonymousClass3FM(this);
                r4.A01 = R.drawable.permission_location;
                r4.A0C = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                r4.A04 = R.string.f12nameremoved;
                r4.A05 = A073;
            }
            C36341k9.A16(this.A06.A0D, 3);
            return;
        } else {
            r4 = new AnonymousClass3FM(this);
            r4.A09 = new int[]{R.drawable.permission_location, R.drawable.permission_plus, R.drawable.permission_storage};
            r4.A0C = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
            r4.A04 = R.string.f12nameremoved;
            r4.A05 = A074;
        }
        startActivityForResult(r4.A02(), i);
    }

    public void A3k(C124275xs r6) {
        C165187t1 r0;
        if (r6.A05) {
            this.A00.A03();
            this.A01.setVisibility(8);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0d(r6.A03);
        A002.A0c(r6.A00);
        int i = r6.A02;
        if (r6.A06 != null) {
            r0 = new C165187t1(r6, 21);
        } else {
            r0 = null;
        }
        A002.A0m(this, r0, i);
        int i2 = r6.A01;
        if (i2 != 0) {
            A002.A0l(this, (AnonymousClass04S) null, i2);
        }
        A002.A0r(r6.A04);
        C36341k9.A11(A002);
    }

    public void A3l(C125005zA r9) {
        C135466ck r1;
        if (r9 == null) {
            Log.e("fpm/P2pTransferActivity/onCurrentScreenChanged/viewData is null");
            return;
        }
        this.A0E.setVisibility(r9.A00);
        if (r9.A00 == 0) {
            this.A00.setFrame(r9.A02);
            LottieAnimationView lottieAnimationView = this.A00;
            lottieAnimationView.A09.A0F(r9.A02, r9.A01);
            this.A00.A04();
            int i = r9.A02;
            int i2 = r9.A01;
            LottieAnimationView lottieAnimationView2 = this.A00;
            if (i == i2) {
                lottieAnimationView2.A03();
            } else {
                lottieAnimationView2.A04();
                LottieAnimationView lottieAnimationView3 = this.A00;
                int i3 = 0;
                if (r9.A0I) {
                    i3 = -1;
                }
                lottieAnimationView3.setRepeatCount(i3);
            }
        }
        this.A0B.setText(r9.A0B);
        boolean z = r9.A0G;
        WaTextView waTextView = this.A0A;
        int i4 = r9.A0A;
        if (z) {
            C32681e1 r6 = this.A08;
            C33751fs r5 = this.A04;
            waTextView.setText(r6.A02(this, new C1502074j(r5, this, 22), C36391kE.A0v(this, "learn-more", AnonymousClass001.A0L(), 0, i4), "learn-more"));
            C36331k8.A10(this.A0A, this.A0D);
        } else {
            waTextView.setText(Html.fromHtml(getString(i4)));
        }
        AnonymousClass9S4 r4 = r9.A0C;
        C135466ck r2 = null;
        if (r4 != null) {
            this.A0C.A03(0);
            QrImageView qrImageView = (QrImageView) C03570Gk.A0B(this, R.id.chat_transfer_qr_code_image_view);
            qrImageView.setAlpha(1.0f);
            qrImageView.setQrCode(r4, (AnonymousClass7cW) null);
            ImageView imageView = (ImageView) C03570Gk.A0B(this, R.id.chat_transfer_qr_code_image_view_overlay);
            imageView.setImageResource(R.drawable.ic_qr_walogo);
            imageView.setClickable(false);
            imageView.setOnClickListener((View.OnClickListener) null);
            this.A07.A01(getWindow(), this.A08);
        } else {
            this.A0C.A03(8);
            this.A07.A00(getWindow());
        }
        this.A01.setVisibility(r9.A07);
        this.A02.setVisibility(r9.A06);
        this.A03.setVisibility(8);
        this.A02.setText(r9.A05);
        this.A09.setVisibility(r9.A04);
        this.A09.setText(r9.A03);
        WDSButton wDSButton = this.A09;
        if (r9.A0E != null) {
            r2 = new C135466ck(r9, 48);
        }
        wDSButton.setOnClickListener(r2);
        this.A0D.setVisibility(r9.A09);
        this.A0D.setText(r9.A08);
        WDSButton wDSButton2 = this.A0D;
        if (r9.A0F != null) {
            r1 = new C135466ck(r9, 49);
        } else {
            r1 = new C135466ck(this, 47);
        }
        wDSButton2.setOnClickListener(r1);
        this.A05.A01(new C93144fx(this, r9), this);
        boolean z2 = r9.A0H;
        Window window = getWindow();
        if (z2) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    private String A07(int i) {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = "https://faq.whatsapp.com/209942271778103/?cms_platform=android";
        return C36391kE.A0v(this, AnonymousClass14B.A03(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved)), A0M, 1, i);
    }

    private void A0F() {
        C001700s r1;
        int i;
        LocationManager locationManager = (LocationManager) AnonymousClass00F.A05(getApplicationContext(), LocationManager.class);
        if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
            r1 = this.A06.A0D;
            i = 4;
        } else {
            r1 = this.A06.A0D;
            i = 5;
        }
        C36341k9.A16(r1, i);
    }

    private void A0G() {
        C001700s r1;
        int i;
        WifiManager wifiManager = (WifiManager) AnonymousClass00F.A05(getApplicationContext(), WifiManager.class);
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            r1 = this.A06.A0D;
            i = 6;
        } else {
            r1 = this.A06.A0D;
            i = 7;
        }
        C36341k9.A16(r1, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3j(int r9) {
        /*
            r8 = this;
            switch(r9) {
                case 1: goto L_0x0004;
                case 2: goto L_0x0003;
                case 3: goto L_0x0009;
                case 4: goto L_0x0024;
                case 5: goto L_0x0032;
                case 6: goto L_0x0036;
                case 7: goto L_0x0053;
                case 8: goto L_0x000d;
                default: goto L_0x0003;
            }
        L_0x0003:
            return
        L_0x0004:
            r0 = 1
            r8.A3i(r0)
            return
        L_0x0009:
            r8.A0F()
            return
        L_0x000d:
            r2 = 2131887816(0x7f1206c8, float:1.941025E38)
            r3 = 2131887815(0x7f1206c7, float:1.9410248E38)
            r4 = 2131891806(0x7f12165e, float:1.9418342E38)
            r7 = 1
            X.7ph r1 = new X.7ph
            r1.<init>(r8, r7)
            r5 = 0
            X.5xs r0 = new X.5xs
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x0024:
            r2 = 2131887841(0x7f1206e1, float:1.94103E38)
            r3 = 2131887840(0x7f1206e0, float:1.9410298E38)
            r4 = 2131887154(0x7f120432, float:1.9408907E38)
            r5 = 2131891672(0x7f1215d8, float:1.941807E38)
            r0 = 3
            goto L_0x0043
        L_0x0032:
            r8.A0G()
            return
        L_0x0036:
            r2 = 2131887843(0x7f1206e3, float:1.9410305E38)
            r3 = 2131887842(0x7f1206e2, float:1.9410302E38)
            r4 = 2131887154(0x7f120432, float:1.9408907E38)
            r5 = 2131891672(0x7f1215d8, float:1.941807E38)
            r0 = 2
        L_0x0043:
            X.7ph r1 = new X.7ph
            r1.<init>(r8, r0)
            r6 = 0
            r7 = 1
            X.5xs r0 = new X.5xs
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x004f:
            r8.A3k(r0)
            return
        L_0x0053:
            X.0yb r1 = r8.A08
            byte[] r0 = X.AnonymousClass6XZ.A00
            java.lang.String r0 = "android.hardware.wifi.direct"
            boolean r0 = r1.A0P(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "fpm/TransferUtils/Feature not available"
        L_0x0062:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0065:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r8.A06
            X.00s r1 = r0.A0D
            if (r2 == 0) goto L_0x0071
            r0 = 9
        L_0x006d:
            X.C36341k9.A16(r1, r0)
            return
        L_0x0071:
            r0 = 8
            goto L_0x006d
        L_0x0074:
            android.net.wifi.WifiManager r1 = r1.A0F()
            if (r1 != 0) goto L_0x007d
            java.lang.String r0 = "fpm/TransferUtils/WifiManager not available"
            goto L_0x0062
        L_0x007d:
            boolean r0 = X.C19550w8.A01()
            if (r0 == 0) goto L_0x0065
            boolean r0 = r1.isP2pSupported()
            if (r0 == 0) goto L_0x0065
            r2 = 1
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5DB.A3j(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r1.A02("android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r3.A05.A06() != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A06
            X.00s r0 = r0.A0D
            java.lang.Number r0 = X.C36441kJ.A0z(r0)
            if (r0 == 0) goto L_0x002a
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x002a
            boolean r0 = X.C19550w8.A09()
            if (r0 == 0) goto L_0x002b
            X.0yE r0 = r3.A05
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0046
        L_0x0022:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A06
            X.00s r1 = r0.A0D
            r0 = 3
        L_0x0027:
            X.C36341k9.A16(r1, r0)
        L_0x002a:
            return
        L_0x002b:
            X.179 r0 = r3.A06
            boolean r0 = r0.A0A()
            X.0yE r1 = r3.A05
            if (r0 != 0) goto L_0x003d
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0046
            X.0yE r1 = r3.A05
        L_0x003d:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x0022
        L_0x0046:
            if (r4 != r2) goto L_0x0060
            X.0yE r0 = r3.A05
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0060
            X.0v0 r0 = r3.A09
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)
            X.C36341k9.A0u(r0, r1)
            r0 = 2
            r3.A3i(r0)
            return
        L_0x0060:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r3.A06
            X.00s r1 = r0.A0D
            r0 = 2
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5DB.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        C20800yB r1;
        int i;
        C1497272n r2;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A07 = new C62233Fh();
        this.A0E = (RelativeLayout) C03570Gk.A0B(this, R.id.chat_transfer_image_layout);
        this.A00 = (LottieAnimationView) C03570Gk.A0B(this, R.id.chat_transfer_lottie_animation);
        if (C222013h.A07) {
            C03570Gk.A0B(this, R.id.chat_transfer_temporary_illustration).setVisibility(0);
        }
        this.A0C = new AnonymousClass1RJ(C03570Gk.A0B(this, R.id.chat_transfer_qr_code_stub));
        this.A0B = (WaTextView) C03570Gk.A0B(this, R.id.chat_transfer_title);
        this.A0A = (WaTextView) C03570Gk.A0B(this, R.id.chat_transfer_subtitle);
        this.A01 = (CircularProgressBar) C03570Gk.A0B(this, R.id.chat_transfer_progress_spinner);
        this.A02 = (WaTextView) C03570Gk.A0B(this, R.id.chat_transfer_progress_description);
        this.A03 = (RoundCornerProgressBar) C03570Gk.A0B(this, R.id.chat_transfer_progress_bar);
        this.A09 = (WDSButton) C03570Gk.A0B(this, R.id.chat_transfer_primary_btn);
        this.A0D = (WDSButton) C03570Gk.A0B(this, R.id.chat_transfer_secondary_btn);
        ChatTransferActivity chatTransferActivity = (ChatTransferActivity) this;
        ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) C36441kJ.A0b(chatTransferActivity).A00(ChatTransferViewModel.class);
        chatTransferActivity.A03 = chatTransferViewModel;
        chatTransferActivity.A06 = chatTransferViewModel;
        Bundle A0H = C36371kC.A0H(chatTransferActivity);
        if (!chatTransferViewModel.A07) {
            chatTransferViewModel.A0Z(A0H);
            AnonymousClass6FO r0 = chatTransferViewModel.A0S;
            r0.A03();
            AnonymousClass005 r3 = r0.A01;
            C36341k9.A0u(C90464aC.A0C(r3), "/export/logging/attemptId");
            C36341k9.A0u(C90464aC.A0C(r3), "/export/protocolVersion");
            C36331k8.A0w(C90464aC.A0C(r3), "/export/isDonor", chatTransferViewModel.A06);
            C36331k8.A0w(C90464aC.A0C(r3), "/export/startedOnReceiver", chatTransferViewModel.A09);
            AnonymousClass6TQ r8 = chatTransferViewModel.A0Y;
            r8.A02(2);
            if (chatTransferViewModel.A06) {
                r1 = chatTransferViewModel.A0Q;
                i = 3979;
            } else {
                r1 = chatTransferViewModel.A0P;
                i = 3980;
            }
            if (r1.A0E(i)) {
                Log.e("fpm/ChatTransferViewModel/disabled: app version for platform migration is not supported");
                C001700s r32 = chatTransferViewModel.A0H;
                C125005zA r22 = new C125005zA();
                r22.A0B = R.string.f12nameremoved;
                r22.A0A = R.string.f12nameremoved;
                r22.A03 = R.string.f12nameremoved;
                r22.A08 = R.string.f12nameremoved;
                r22.A0E = new C163137pi(chatTransferViewModel, 3);
                r22.A0F = new C163137pi(chatTransferViewModel, 4);
                r22.A0D = new C163137pi(chatTransferViewModel, 5);
                r22.A02 = 376;
                r22.A01 = 376;
                r32.A0D(r22);
            } else {
                AnonymousClass5FW r02 = chatTransferViewModel.A0R;
                C146936wP r33 = chatTransferViewModel.A0Z;
                r02.registerObserver(r33);
                chatTransferViewModel.A0T.registerObserver(r33);
                C19770wU r7 = chatTransferViewModel.A0b;
                if (chatTransferViewModel.A06) {
                    r2 = new C1497272n(chatTransferViewModel, 36);
                } else {
                    C125055zF r12 = chatTransferViewModel.A0V;
                    Objects.requireNonNull(r12);
                    r2 = new C1497272n(r12, 35);
                }
                r7.Boy(r2);
                r8.A02(3);
                C36331k8.A0w(C19420v0.A00(chatTransferViewModel.A0O), "chat_transfer_in_progress", true);
                if (!chatTransferViewModel.A07) {
                    chatTransferViewModel.A0Z(A0H);
                    chatTransferViewModel.A0W.registerObserver(r33);
                    chatTransferViewModel.A0X(1);
                    chatTransferViewModel.A07 = true;
                }
            }
        }
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0H, 15);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0D, 19);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0C, 22);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0A, 20);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0B, 17);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0E, 23);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0F, 18);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A06.A0G, 16);
        C165187t1.A00(chatTransferActivity, chatTransferActivity.A03.A0I, 14);
    }

    public void onResume() {
        super.onResume();
        Number A0z = C36441kJ.A0z(this.A06.A0D);
        if (A0z != null) {
            int intValue = A0z.intValue();
            if (intValue == 4) {
                A0F();
            } else if (intValue == 6) {
                A0G();
            }
        }
    }
}
