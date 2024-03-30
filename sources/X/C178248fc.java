package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.newsletter.ui.NewsletterCreationActivity;
import com.whatsapp.newsletter.ui.NewsletterEditActivity;
import com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity;
import java.io.File;

/* renamed from: X.8fc  reason: invalid class name and case insensitive filesystem */
public abstract class C178248fc extends C173848Tj {
    public ImageView A00;
    public AnonymousClass9DR A01;
    public C61443Bx A02;
    public C61453By A03;
    public WaEditText A04;
    public WaEditText A05;
    public AnonymousClass16K A06;
    public C27761Ps A07;
    public C220412q A08;
    public AnonymousClass141 A09;
    public C27751Pr A0A;
    public C28981Uw A0B;
    public AnonymousClass19A A0C;
    public C30131Zi A0D;
    public C32241dD A0E;
    public AnonymousClass2bA A0F;
    public C19890wg A0G;
    public AnonymousClass1GX A0H;
    public String A0I;
    public String A0J;

    public void A3p() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C27761Ps r4 = this.A07;
        if (r4 != null) {
            AnonymousClass141 r6 = this.A09;
            if (r6 == null) {
                throw C36331k8.A0d("tempContact");
            }
            Bitmap A072 = r4.A07(this, r6, 0.0f, dimensionPixelSize, false);
            if (A072 != null) {
                ImageView imageView = this.A00;
                if (imageView != null) {
                    C27751Pr r2 = this.A0A;
                    if (r2 != null) {
                        imageView.setImageDrawable(r2.A01(getResources(), A072, C141736nk.A00));
                        return;
                    }
                    throw C36331k8.A0d("pathDrawableHelper");
                }
                throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            }
            return;
        }
        throw C36331k8.A0d("contactBitmapManager");
    }

    public void A3q() {
        AnonymousClass2bA r1 = this.A0F;
        if (r1 == null) {
            throw C36331k8.A0d("photoUpdater");
        }
        AnonymousClass141 r0 = this.A09;
        if (r0 == null) {
            throw C36331k8.A0d("tempContact");
        }
        r1.A03(r0).delete();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C27761Ps r4 = this.A07;
        if (r4 != null) {
            AnonymousClass141 r6 = this.A09;
            if (r6 == null) {
                throw C36331k8.A0d("tempContact");
            }
            Bitmap A072 = r4.A07(this, r6, 0.0f, dimensionPixelSize, false);
            if (A072 != null) {
                ImageView imageView = this.A00;
                if (imageView != null) {
                    C27751Pr r2 = this.A0A;
                    if (r2 != null) {
                        imageView.setImageDrawable(r2.A01(getResources(), A072, C141746nl.A00));
                        return;
                    }
                    throw C36331k8.A0d("pathDrawableHelper");
                }
                throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            }
            return;
        }
        throw C36331k8.A0d("contactBitmapManager");
    }

    public final WaEditText A3i() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            return waEditText;
        }
        throw C36331k8.A0d("descriptionEditText");
    }

    public final WaEditText A3j() {
        WaEditText waEditText = this.A05;
        if (waEditText != null) {
            return waEditText;
        }
        throw C36331k8.A0d("nameEditText");
    }

    public final C44072La A3k() {
        C28981Uw r1 = this.A0B;
        if (r1 != null) {
            C220412q r0 = this.A08;
            if (r0 != null) {
                C65073Qp A0W = C36371kC.A0W(r0, r1);
                if (A0W instanceof C44072La) {
                    return (C44072La) A0W;
                }
            } else {
                throw C36331k8.A0d("chatsCache");
            }
        }
        return null;
    }

    public final C32241dD A3l() {
        C32241dD r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterLogging");
    }

    public File A3m() {
        Uri fromFile;
        AnonymousClass16K r1 = this.A06;
        if (r1 != null) {
            AnonymousClass141 r0 = this.A09;
            if (r0 == null) {
                throw C36331k8.A0d("tempContact");
            }
            File A002 = r1.A00(r0);
            if (A002 == null || !A002.exists() || (fromFile = Uri.fromFile(A002)) == null) {
                return null;
            }
            AnonymousClass1GX r02 = this.A0H;
            if (r02 != null) {
                return r02.A0h(fromFile);
            }
            throw C36331k8.A0d("mediaFileUtils");
        }
        throw C36331k8.A0d("contactPhotoHelper");
    }

    public void A3o() {
        byte[] bArr;
        byte[] bArr2;
        String str;
        String str2;
        String str3;
        String str4;
        if (this instanceof NewsletterEditDescriptionActivity) {
            AnonymousClass19A r0 = this.A0C;
            if (r0 == null) {
                throw C36331k8.A0d("messageClient");
            } else if (r0.A0I()) {
                A3u();
                String A3n = A3n();
                String A0y = C36371kC.A0y(C36421kH.A0Z(A3j()));
                C28981Uw r2 = this.A0B;
                if (r2 != null) {
                    Bu1(R.string.f12nameremoved);
                    C44072La A3k = A3k();
                    if (A3k != null) {
                        str3 = A3k.A0H;
                    } else {
                        str3 = null;
                    }
                    boolean z = !AnonymousClass00C.A0J(A3n, str3);
                    C30131Zi r1 = this.A0D;
                    if (r1 != null) {
                        C44072La A3k2 = A3k();
                        if (A3k2 != null) {
                            str4 = A3k2.A0K;
                        } else {
                            str4 = null;
                        }
                        if (AnonymousClass00C.A0J(A0y, str4)) {
                            A0y = null;
                        }
                        if (!z) {
                            A3n = null;
                        }
                        r1.A0C(r2, new C23204B9m(this, 2), A0y, A3n, (byte[]) null, z, false);
                        return;
                    }
                    throw C36331k8.A0d("newsletterManager");
                }
                return;
            }
        } else if (this instanceof NewsletterEditActivity) {
            NewsletterEditActivity newsletterEditActivity = (NewsletterEditActivity) this;
            AnonymousClass19A r02 = newsletterEditActivity.A0C;
            if (r02 == null) {
                throw C36331k8.A0d("messageClient");
            } else if (!r02.A0I()) {
                newsletterEditActivity.A3t();
                return;
            } else {
                newsletterEditActivity.A3u();
                String A3n2 = newsletterEditActivity.A3n();
                String A0y2 = C36371kC.A0y(C36421kH.A0Z(newsletterEditActivity.A3j()));
                File A3m = newsletterEditActivity.A3m();
                if (A3m != null) {
                    bArr2 = AnonymousClass6YY.A0V(A3m);
                } else {
                    bArr2 = null;
                }
                C28981Uw r4 = newsletterEditActivity.A0B;
                if (r4 != null) {
                    newsletterEditActivity.Bu1(R.string.f12nameremoved);
                    C44072La A3k3 = newsletterEditActivity.A3k();
                    if (A3k3 != null) {
                        str = A3k3.A0H;
                    } else {
                        str = null;
                    }
                    boolean z2 = !AnonymousClass00C.A0J(A3n2, str);
                    C30131Zi r3 = newsletterEditActivity.A0D;
                    if (r3 != null) {
                        C44072La A3k4 = newsletterEditActivity.A3k();
                        if (A3k4 != null) {
                            str2 = A3k4.A0K;
                        } else {
                            str2 = null;
                        }
                        if (AnonymousClass00C.A0J(A0y2, str2)) {
                            A0y2 = null;
                        }
                        if (!z2) {
                            A3n2 = null;
                        }
                        r3.A0C(r4, new C23204B9m(newsletterEditActivity, 1), A0y2, A3n2, bArr2, z2, C36371kC.A1W(newsletterEditActivity.A02, C187968yp.UNCHANGED));
                        return;
                    }
                    throw C36331k8.A0d("newsletterManager");
                }
                return;
            }
        } else {
            AnonymousClass19A r03 = this.A0C;
            if (r03 == null) {
                throw C36331k8.A0d("messageClient");
            } else if (r03.A0I()) {
                A3u();
                Bu1(R.string.f12nameremoved);
                C30131Zi r22 = this.A0D;
                if (r22 != null) {
                    String A0y3 = C36371kC.A0y(C36421kH.A0Z(A3j()));
                    String A3n3 = A3n();
                    File A3m2 = A3m();
                    if (A3m2 != null) {
                        bArr = AnonymousClass6YY.A0V(A3m2);
                    } else {
                        bArr = null;
                    }
                    C23204B9m b9m = new C23204B9m(this, 0);
                    AnonymousClass00C.A0D(A0y3, 0);
                    if (AnonymousClass1GQ.A01(r22.A0G, 3877)) {
                        C30151Zk r12 = r22.A00;
                        if (r12 != null) {
                            C19770wU A0Z = C36341k9.A0Z(r12.A00.A00);
                            C18800tq r13 = r12.A00.A00;
                            new AnonymousClass8fS((C26141Ja) r13.A5m.get(), C36391kE.A0g(r13), b9m, (AnonymousClass4OL) r13.A5l.get(), r13.Azc(), A0Z, A0y3, A3n3, bArr).A01();
                            return;
                        }
                        throw C36331k8.A0d("createNewsletterGraphQlHandler");
                    }
                    return;
                }
                throw C36331k8.A0d("newsletterManager");
            }
        }
        A3t();
    }

    public void A3r() {
        AnonymousClass16K r1 = this.A06;
        if (r1 != null) {
            AnonymousClass141 r0 = this.A09;
            if (r0 == null) {
                throw C36331k8.A0d("tempContact");
            }
            File A002 = r1.A00(r0);
            if (A002 != null) {
                A002.delete();
            }
            ImageView imageView = this.A00;
            if (imageView != null) {
                C27751Pr r02 = this.A0A;
                if (r02 != null) {
                    imageView.setImageDrawable(C27751Pr.A00(getTheme(), getResources(), C141726nj.A00, r02.A00, R.drawable.avatar_newsletter_large));
                    return;
                }
                throw C36331k8.A0d("pathDrawableHelper");
            }
            throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        }
        throw C36331k8.A0d("contactPhotoHelper");
    }

    public final void A3u() {
        int i;
        boolean z = this instanceof NewsletterCreationActivity;
        A3l().A07(12, z);
        if (A3j().hasFocus()) {
            String str = this.A0J;
            if (str == null) {
                throw C36331k8.A0d("tempNameText");
            } else if (!str.equals(C36421kH.A0Z(A3j()))) {
                i = 6;
                A3l().A07(i, z);
            }
        }
        if (A3i().hasFocus()) {
            String str2 = this.A0I;
            if (str2 == null) {
                throw C36331k8.A0d("tempDescriptionText");
            } else if (!str2.equals(C36421kH.A0Z(A3i()))) {
                i = 11;
                A3l().A07(i, z);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i != 2001) {
            if (i != 2002) {
                super.onActivityResult(i, i2, getIntent());
                return;
            }
            AnonymousClass2bA r2 = this.A0F;
            if (r2 == null) {
                throw C36331k8.A0d("photoUpdater");
            }
            AnonymousClass141 r0 = this.A09;
            if (r0 == null) {
                throw C36331k8.A0d("tempContact");
            }
            r2.A03(r0).delete();
            if (i2 == -1) {
                A3p();
            } else if (i2 == 0 && intent != null) {
                AnonymousClass2bA r02 = this.A0F;
                if (r02 == null) {
                    throw C36331k8.A0d("photoUpdater");
                }
                r02.A04(intent, this);
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (!intent.getBooleanExtra("is_reset", false)) {
                    int i3 = 10;
                    if (intent.hasExtra("emojiEditorImageResult")) {
                        i3 = 9;
                    } else if (intent.hasExtra("photo_source")) {
                        int intExtra = intent.getIntExtra("photo_source", 0);
                        if (intExtra == 1) {
                            i3 = 7;
                        } else if (intExtra == 2) {
                            i3 = 8;
                        }
                    }
                    A3l().A07(i3, this instanceof NewsletterCreationActivity);
                }
                if (intent.getBooleanExtra("is_reset", false)) {
                    A3r();
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    A3q();
                    return;
                }
            }
            AnonymousClass2bA r3 = this.A0F;
            if (r3 == null) {
                throw C36331k8.A0d("photoUpdater");
            }
            AnonymousClass141 r7 = this.A09;
            if (r7 == null) {
                throw C36331k8.A0d("tempContact");
            }
            r3.A06(intent2, this, this, r7, 2002);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            super.onCreate(r1)
            X.3Ro r2 = X.C28981Uw.A03
            java.lang.String r1 = X.C36341k9.A0d(r0)
            X.1Uw r1 = r2.A01(r1)
            r0.A0B = r1
            r1 = 2131624050(0x7f0e0072, float:1.8875269E38)
            r0.setContentView((int) r1)
            X.0wQ r1 = r0.A02
            com.whatsapp.jid.PhoneUserJid r1 = X.C36371kC.A0e(r1)
            java.lang.String r1 = r1.user
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r1)
            r1 = 45
            r5.append(r1)
            java.lang.String r4 = X.C90464aC.A0V()
            java.lang.String r3 = "-"
            java.lang.String r2 = ""
            r1 = 0
            java.lang.String r1 = X.AnonymousClass098.A05(r4, r3, r2, r1)
            java.lang.String r3 = X.AnonymousClass000.A0q(r1, r5)
            java.lang.String r2 = "newsletter"
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)
            X.13p r1 = X.C28981Uw.A02
            X.1Uw r3 = r1.A03(r3, r2)
            X.AnonymousClass00C.A08(r3)
            r1 = 1
            r3.A00 = r1
            X.141 r2 = new X.141
            r2.<init>(r3)
            r1 = 2131896454(0x7f122886, float:1.942777E38)
            java.lang.String r1 = r0.getString(r1)
            r2.A0P = r1
            r0.A09 = r2
            r1 = 2131430834(0x7f0b0db2, float:1.848338E38)
            android.view.View r1 = X.C36361kB.A0D(r0, r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3 = 0
            X.AnonymousClass00C.A0D(r1, r3)
            r0.A00 = r1
            r1 = 2131432010(0x7f0b124a, float:1.8485765E38)
            android.view.View r1 = X.C36361kB.A0D(r0, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            X.AnonymousClass00C.A0D(r1, r3)
            r0.A05 = r1
            r1 = 2131431948(0x7f0b120c, float:1.848564E38)
            android.view.View r2 = X.C36361kB.A0D(r0, r1)
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            X.AnonymousClass00C.A0D(r2, r3)
            r0.A04 = r2
            X.C36341k9.A12(r0)
            boolean r2 = r0 instanceof com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity
            if (r2 != 0) goto L_0x01a8
            boolean r2 = r0 instanceof com.whatsapp.newsletter.ui.NewsletterEditActivity
            if (r2 != 0) goto L_0x01a8
            X.07B r3 = r0.getSupportActionBar()
            if (r3 == 0) goto L_0x00a6
            r2 = 1
            r3.A0X(r2)
            r3.A0U(r2)
            r2 = 2131896454(0x7f122886, float:1.942777E38)
        L_0x00a3:
            r3.A0I(r2)
        L_0x00a6:
            android.widget.ImageView r4 = r0.A00
            if (r4 == 0) goto L_0x01cf
            r3 = 25
            X.3Y4 r2 = new X.3Y4
            r2.<init>(r0, r3)
            r4.setOnClickListener(r2)
            r2 = 2131432010(0x7f0b124a, float:1.8485765E38)
            android.view.View r2 = X.C36361kB.A0D(r0, r2)
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            r6 = 0
            X.AnonymousClass00C.A0D(r2, r6)
            r0.A05 = r2
            com.whatsapp.WaEditText r5 = r0.A3j()
            r2 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r2]
            r3 = 100
            X.3Xf r2 = new X.3Xf
            r2.<init>(r3)
            r4[r6] = r2
            r5.setFilters(r4)
            r2 = 2131431867(0x7f0b11bb, float:1.8485475E38)
            android.view.View r5 = X.C36361kB.A0D(r0, r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.whatsapp.WaEditText r2 = r0.A3j()
            X.9DR r3 = r0.A01
            if (r3 == 0) goto L_0x01c8
            com.whatsapp.WaEditText r4 = r0.A3j()
            X.1Mz r3 = r3.A00
            X.0tq r3 = r3.A01
            X.1H2 r9 = X.C36351kA.A0e(r3)
            X.0yb r6 = X.C36351kA.A0U(r3)
            X.0ts r7 = X.C36341k9.A0T(r3)
            X.0wg r10 = X.C36351kA.A0m(r3)
            X.0tt r3 = r3.A00
            X.004 r3 = r3.A3P
            java.lang.Object r8 = r3.get()
            X.1N0 r8 = (X.AnonymousClass1N0) r8
            r11 = 100
            r12 = 0
            X.2gA r3 = new X.2gA
            r13 = 0
            r14 = 0
            r15 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.addTextChangedListener(r3)
            com.whatsapp.WaEditText r3 = r0.A3j()
            r11 = 1
            X.B88 r2 = new X.B88
            r2.<init>(r0, r11)
            r3.setOnFocusChangeListener(r2)
            r2 = 2131431873(0x7f0b11c1, float:1.8485487E38)
            android.view.View r3 = X.C36361kB.A0D(r0, r2)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            r2 = 2131891455(0x7f1214ff, float:1.941763E38)
            java.lang.String r2 = r0.getString(r2)
            r3.setHint((java.lang.CharSequence) r2)
            android.view.View r1 = X.C36361kB.A0D(r0, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            X.AnonymousClass00C.A0D(r1, r12)
            r0.A04 = r1
            r1 = 2131429511(0x7f0b0887, float:1.8480697E38)
            X.C36331k8.A11(r0, r1)
            com.whatsapp.WaEditText r2 = r0.A3i()
            r1 = 2131891354(0x7f12149a, float:1.9417426E38)
            r2.setHint(r1)
            r1 = 2131429509(0x7f0b0885, float:1.8480693E38)
            android.view.View r8 = X.C03570Gk.A0B(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.AnonymousClass00C.A0E(r8, r1)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setVisibility(r12)
            X.3Bx r6 = r0.A02
            if (r6 == 0) goto L_0x01c1
            com.whatsapp.WaEditText r7 = r0.A3i()
            r9 = 2048(0x800, float:2.87E-42)
            r10 = 2048(0x800, float:2.87E-42)
            X.2gA r2 = r6.A00(r7, r8, r9, r10, r11, r12, r13)
            com.whatsapp.WaEditText r1 = r0.A3i()
            r1.addTextChangedListener(r2)
            com.whatsapp.WaEditText r3 = r0.A3i()
            X.3Xf[] r2 = new X.C66763Xf[r11]
            X.3Xf r1 = new X.3Xf
            r1.<init>(r9)
            r2[r12] = r1
            r3.setFilters(r2)
            com.whatsapp.WaEditText r2 = r0.A3i()
            X.B88 r1 = new X.B88
            r1.<init>(r0, r12)
            r2.setOnFocusChangeListener(r1)
            r0.A3s()
            boolean r2 = r0.A3v()
            X.3By r1 = r0.A03
            if (r1 == 0) goto L_0x01ba
            X.2bA r1 = r1.A00(r2)
            r0.A0F = r1
            return
        L_0x01a8:
            X.07B r3 = r0.getSupportActionBar()
            if (r3 == 0) goto L_0x00a6
            r2 = 1
            r3.A0X(r2)
            r3.A0U(r2)
            r2 = 2131889008(0x7f120b70, float:1.9412667E38)
            goto L_0x00a3
        L_0x01ba:
            java.lang.String r0 = "photoUpdaterFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c1:
            java.lang.String r0 = "formattedTextWatcherFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c8:
            java.lang.String r0 = "limitingTextFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01cf:
            java.lang.String r0 = "icon"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178248fc.onCreate(android.os.Bundle):void");
    }

    public final String A3n() {
        String A0y = C36371kC.A0y(C36421kH.A0Z(A3i()));
        if (AnonymousClass098.A06(A0y)) {
            return null;
        }
        return A0y;
    }

    public void A3s() {
        C48752hz.A00(C36361kB.A0D(this, R.id.newsletter_save_button), this, 42);
    }

    public final void A3t() {
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        BA8.A02(this, A002, 26, R.string.f12nameremoved);
        A002.A0l(this, C207809x9.A00, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public boolean A3v() {
        File A3m = A3m();
        if (A3m != null) {
            return A3m.exists();
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        C32241dD A3l = A3l();
        A3l.A00 = 0;
        A3l.A01 = 0;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
