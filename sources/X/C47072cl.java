package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2cl  reason: invalid class name and case insensitive filesystem */
public abstract class C47072cl extends AnonymousClass24R implements AnonymousClass4RX, C87144Nq {
    public Uri A00;
    public ImageView A01;
    public ViewPager A02;
    public AnonymousClass1NC A03;
    public AnonymousClass1N4 A04;
    public C26861Lu A05;
    public C32691e2 A06;
    public PagerSlidingTabStrip A07;
    public C603437m A08;
    public AnonymousClass16D A09;
    public C27261Nn A0A;
    public AnonymousClass185 A0B;
    public AnonymousClass171 A0C;
    public C21159AAt A0D;
    public AnonymousClass1A6 A0E;
    public AnonymousClass17Z A0F;
    public C20830yE A0G;
    public C18820ts A0H;
    public C25851Hx A0I;
    public AnonymousClass1DX A0J;
    public C21010yW A0K;
    public AnonymousClass19A A0L;
    public AnonymousClass1QW A0M;
    public AnonymousClass1EV A0N;
    public AnonymousClass1EU A0O;
    public C29151Vn A0P;
    public C64783Pk A0Q;
    public C39391sC A0R;
    public ContactQrMyCodeFragment A0S;
    public QrScanCodeFragment A0T;
    public AnonymousClass1GX A0U;
    public String A0V;
    public boolean A0W = false;
    public boolean A0X;
    public C62233Fh A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final AnonymousClass4RW A0b = new C65163Qz(this, 1);

    public void A3i() {
        int i;
        if (!this.A0G.A0D()) {
            C18740tg.A06(this);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
                if (i2 < 33) {
                    i = R.string.f12nameremoved;
                }
            }
            BuO(AnonymousClass3US.A03(this, R.string.f12nameremoved, i, false), 4);
        } else if (this.A0V == null) {
            Log.e("BaseQrActivity/shareFailed/noQr");
            this.A05.A06(R.string.f12nameremoved, 0);
        } else {
            Bu1(R.string.f12nameremoved);
            C19770wU r2 = this.A04;
            AnonymousClass17Y r11 = this.A05;
            C19730wQ r12 = this.A02;
            boolean z = true;
            C49522jG r8 = new C49522jG(this, this.A04, r11, r12, C36391kE.A0v(this, AnonymousClass000.A0p("https://wa.me/qr/", this.A0V, AnonymousClass000.A0u()), new Object[1], 0, R.string.f12nameremoved));
            Bitmap[] bitmapArr = new Bitmap[1];
            AnonymousClass142 A0T2 = C36381kD.A0T(this.A02);
            if (C36331k8.A06(this).getInt("privacy_profile_photo", 0) != 0) {
                z = false;
            }
            bitmapArr[0] = C65683Tb.A00(this, A0T2, C36321k7.A0D("https://wa.me/qr/", this.A0V), getString(R.string.f12nameremoved), z);
            r2.Box(r8, bitmapArr);
        }
    }

    public static void A01(C47072cl r7) {
        if (r7.A0T == null) {
            return;
        }
        if (r7.A0G.A02("android.permission.CAMERA") != 0) {
            AnonymousClass3FM A002 = AnonymousClass3FM.A00(r7);
            int[] iArr = {R.string.f12nameremoved};
            A002.A02 = R.string.f12nameremoved;
            A002.A0A = iArr;
            int[] iArr2 = {R.string.f12nameremoved};
            A002.A03 = R.string.f12nameremoved;
            A002.A08 = iArr2;
            AnonymousClass3FM.A01(A002, "android.permission.CAMERA");
            A002.A06 = true;
            r7.startActivityForResult(A002.A02(), 1);
            return;
        }
        r7.A0T.A1Z();
    }

    public void A3j() {
        boolean A1Y;
        C36331k8.A0n(this);
        C36391kE.A15(this, R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        Toolbar A0N2 = C36361kB.A0N(this);
        AnonymousClass3UF.A0C(this, A0N2, this.A0H);
        A0N2.setTitle((CharSequence) getString(R.string.f12nameremoved));
        A0N2.setNavigationOnClickListener(new AnonymousClass3Y6(this, 2));
        setSupportActionBar(A0N2);
        this.A0Y = new C62233Fh();
        this.A02 = (ViewPager) C03570Gk.A0B(this, R.id.contact_qr_pager);
        this.A07 = (PagerSlidingTabStrip) C03570Gk.A0B(this, R.id.contact_qr_tab_strip);
        ImageView A0P2 = C36431kI.A0P(this, R.id.contact_qr_preview);
        this.A01 = A0P2;
        C011504z.A06(A0P2, 2);
        C19970wo r34 = this.A07;
        C20810yC r38 = this.A0D;
        AnonymousClass17Y r29 = this.A05;
        C19730wQ r28 = this.A02;
        C19770wU r26 = this.A04;
        C21010yW r25 = this.A0K;
        AnonymousClass1NC r23 = this.A03;
        C21100yf r24 = this.A06;
        C32691e2 r22 = this.A06;
        AnonymousClass19A r21 = this.A0L;
        AnonymousClass16D r27 = this.A09;
        C21060yb r20 = this.A08;
        AnonymousClass171 r18 = this.A0C;
        C26861Lu r19 = this.A05;
        AnonymousClass1EU r17 = this.A0O;
        AnonymousClass1N4 r15 = this.A04;
        AnonymousClass1DX r14 = this.A0J;
        AnonymousClass185 r13 = this.A0B;
        AnonymousClass1A6 r11 = this.A0E;
        AnonymousClass1EV r10 = this.A0N;
        AnonymousClass1QW r9 = this.A0M;
        C29151Vn r8 = this.A0P;
        C19600wD r7 = this.A07;
        C27261Nn r6 = this.A0A;
        C25851Hx r5 = this.A0I;
        AnonymousClass17Z r4 = this.A0F;
        int i = 0;
        C19770wU r45 = r26;
        C64783Pk r16 = new C64783Pk(r23, r15, r19, this, r29, r22, r28, r24, this.A08, r7, r27, r6, r13, r18, this.A0D, r11, r20, r34, r4, r5, r14, r38, r25, r21, r9, r10, r17, r8, r45, C36371kC.A0n(), false, true);
        this.A0Q = r16;
        r16.A02 = true;
        C39391sC r3 = new C39391sC(getSupportFragmentManager(), this);
        this.A0R = r3;
        this.A02.setAdapter(r3);
        this.A02.A0K(new C89174Vn(this, 1));
        AnonymousClass04F.A05(this.A07, 0);
        this.A07.setViewPager(this.A02);
        String stringExtra = getIntent().getStringExtra("qrcode");
        if (stringExtra != null) {
            this.A0Z = true;
            A3l(stringExtra, false, 5);
        }
        if (!this.A0Z) {
            A3k(false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("scan", false);
        this.A0a = booleanExtra;
        C18820ts r0 = this.A0H;
        if (booleanExtra) {
            A1Y = C36401kF.A1X(r0);
        } else {
            A1Y = C36351kA.A1Y(r0);
        }
        boolean z = !A1Y;
        this.A02.A0J(z ? 1 : 0, false);
        C39391sC r32 = this.A0R;
        do {
            r32.A00[i].A00.setSelected(AnonymousClass000.A1S(i, z));
            i++;
        } while (i < 2);
    }

    public void A3k(boolean z) {
        String str;
        C47052cj r5 = (C47052cj) this;
        r5.Bu1(R.string.f12nameremoved);
        r5.A0X = true;
        r5.A01 = z;
        r5.A00 = SystemClock.elapsedRealtime();
        C76643pD r10 = new C76643pD(r5.A05, r5.A0L, new AnonymousClass37H(r5.A07, r5.A09, r5));
        AnonymousClass19A r9 = r10.A01;
        String A092 = r9.A09();
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[2];
        boolean A1Y = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "contact", r2);
        if (z) {
            str = "revoke";
        } else {
            str = "get";
        }
        C36341k9.A1L("action", str, r2, 1);
        C203399nx r3 = new C203399nx("qr", r2);
        AnonymousClass1AL[] r22 = new AnonymousClass1AL[3];
        C36331k8.A1R(A092, r22, A1Y ? 1 : 0);
        C36341k9.A1L("xmlns", "w:qr", r22, 1);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 2);
        r9.A0F(r10, C36391kE.A0m(r3, r22), A092, 215, 32000);
    }

    public boolean A3l(String str, boolean z, int i) {
        if (this.A0Q.A0e || this.A0X) {
            return false;
        }
        return this.A0Q.A02((C64933Qa) null, str, i, z, false);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        int currentItem = this.A02.getCurrentItem();
        char A1Y = C36351kA.A1Y(this.A0H);
        if (currentItem == 0) {
            A1Y ^= 1;
        } else if (currentItem != 1) {
            A1Y = 65535;
        }
        if (A1Y != 0) {
            if (A1Y == 1) {
                menu.setGroupVisible(0, false);
            }
            return true;
        }
        menu.setGroupVisible(0, true);
        return true;
    }

    public void onStop() {
        this.A0Y.A00(getWindow());
        super.onStop();
    }

    public void A22(AnonymousClass02E r5) {
        super.A22(r5);
        if (r5 instanceof ContactQrMyCodeFragment) {
            ContactQrMyCodeFragment contactQrMyCodeFragment = (ContactQrMyCodeFragment) r5;
            this.A0S = contactQrMyCodeFragment;
            String str = this.A0V;
            if (str != null) {
                contactQrMyCodeFragment.A02 = str;
                ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                if (contactQrContactCardView != null) {
                    contactQrContactCardView.setQrCode(AnonymousClass000.A0p("https://wa.me/qr/", str, AnonymousClass000.A0u()));
                }
            }
        } else if (r5 instanceof QrScanCodeFragment) {
            this.A0T = (QrScanCodeFragment) r5;
            ViewPager viewPager = this.A02;
            if (viewPager == null) {
                Log.e("BaseQrActivity/onAttachFragment/viewPagerNull");
            } else if (1 == viewPager.getCurrentItem()) {
                A01(this);
            }
        }
    }

    public void Bdw() {
        if (AnonymousClass3SJ.A04(this)) {
            return;
        }
        if (this.A0Z) {
            finish();
            return;
        }
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
        if (this.A0T != null) {
            this.A0Q.A0e = false;
            QrScanCodeFragment qrScanCodeFragment = this.A0T;
            qrScanCodeFragment.A04 = null;
            WaQrScannerView waQrScannerView = qrScanCodeFragment.A03;
            if (waQrScannerView != null) {
                waQrScannerView.BoN();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2) {
                if (i2 == -1) {
                    if (intent != null) {
                        Uri data = intent.getData();
                        this.A00 = data;
                        if (data != null) {
                            Bu1(R.string.f12nameremoved);
                            C36391kE.A1Q(new C49532jH(this.A00, this, this.A0U, this.A01.getWidth(), this.A01.getHeight()), this.A04);
                            return;
                        }
                        this.A05.A06(R.string.f12nameremoved, 0);
                    } else {
                        return;
                    }
                }
                this.A0X = false;
            } else if (i == 3) {
                QrScanCodeFragment qrScanCodeFragment = this.A0T;
                qrScanCodeFragment.A04 = null;
                WaQrScannerView waQrScannerView = qrScanCodeFragment.A03;
                if (waQrScannerView != null) {
                    waQrScannerView.BoN();
                }
            } else if (i == 4 && i2 == -1) {
                A3i();
            }
        } else if (i2 != 0) {
            this.A0T.A1Z();
        } else if (this.A0a) {
            finish();
        } else {
            this.A02.A0J(C36351kA.A1Y(this.A0H) ^ true ? 1 : 0, true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A3j();
    }

    public void onStart() {
        super.onStart();
        this.A0Y.A01(getWindow(), this.A08);
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
    }
}
