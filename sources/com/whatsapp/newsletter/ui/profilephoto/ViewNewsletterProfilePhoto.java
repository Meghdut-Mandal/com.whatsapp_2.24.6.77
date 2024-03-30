package com.whatsapp.newsletter.ui.profilephoto;

import X.AA0;
import X.AA2;
import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass098;
import X.AnonymousClass0BT;
import X.AnonymousClass0PG;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16K;
import X.AnonymousClass16L;
import X.AnonymousClass171;
import X.AnonymousClass1GX;
import X.AnonymousClass1O8;
import X.AnonymousClass1RY;
import X.AnonymousClass1X7;
import X.AnonymousClass2bA;
import X.AnonymousClass3CG;
import X.AnonymousClass3U9;
import X.AnonymousClass3UJ;
import X.AnonymousClass68G;
import X.AnonymousClass6CU;
import X.AnonymousClass6UU;
import X.AnonymousClass6YY;
import X.B7Y;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C175268a7;
import X.C175328aD;
import X.C180818mT;
import X.C18800tq;
import X.C188128z5;
import X.C18830tt;
import X.C19630wG;
import X.C19770wU;
import X.C21329AHh;
import X.C220412q;
import X.C23133B6o;
import X.C23174B8i;
import X.C24341Cb;
import X.C27111My;
import X.C27731Pn;
import X.C27761Ps;
import X.C28981Uw;
import X.C30131Zi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C44072La;
import X.C61453By;
import X.C81123wV;
import X.C90464aC;
import X.C90524aI;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class ViewNewsletterProfilePhoto extends C180818mT {
    public C61453By A00;
    public C27731Pn A01;
    public C27761Ps A02;
    public C220412q A03;
    public AnonymousClass141 A04;
    public C30131Zi A05;
    public C175328aD A06;
    public C188128z5 A07;
    public AnonymousClass1O8 A08;
    public AnonymousClass1GX A09;
    public AnonymousClass1RY A0A;
    public AnonymousClass2bA A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;

    private final void A07() {
        AnonymousClass2bA r0 = this.A0B;
        if (r0 == null) {
            throw C36331k8.A0d("photoUpdater");
        }
        AnonymousClass141 r2 = this.A04;
        if (r2 == null) {
            throw C36331k8.A0d("tempContact");
        }
        r0.A08(this, r2, 12, 1, -1, this.A0C, true, true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        C44072La A012 = A01(this);
        if (A012 != null && A012.A0L()) {
            menu.add(0, R.id.menuitem_edit, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_edit).setShowAsAction(2);
            menu.add(0, 1, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_share).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C44072La A012;
        boolean z;
        C44072La A013;
        boolean z2;
        AnonymousClass00C.A0D(menu, 0);
        if (menu.size() > 0 && (A012 = A01(this)) != null && A012.A0L()) {
            boolean z3 = true;
            MenuItem findItem = menu.findItem(1);
            if (findItem != null) {
                AnonymousClass16K r1 = this.A06;
                if (r1 != null) {
                    File A002 = r1.A00(A3j());
                    if (A002 != null) {
                        z2 = A002.exists();
                    } else {
                        z2 = false;
                    }
                    findItem.setVisible(z2);
                } else {
                    throw C36331k8.A0d("contactPhotoHelper");
                }
            }
            boolean A0E2 = this.A0D.A0E(6618);
            MenuItem findItem2 = menu.findItem(R.id.menuitem_edit);
            if (A0E2) {
                if (findItem2 != null) {
                    C44072La A014 = A01(this);
                    if (A014 == null || !A014.A0L() || ((A013 = A01(this)) != null && A013.A0P())) {
                        z3 = false;
                    }
                    findItem2.setVisible(z3);
                }
            } else if (findItem2 != null) {
                C44072La A015 = A01(this);
                if (A015 != null) {
                    z = A015.A0L();
                } else {
                    z = false;
                }
                findItem2.setVisible(z);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public static final C44072La A01(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto) {
        C220412q r1 = viewNewsletterProfilePhoto.A03;
        if (r1 != null) {
            return (C44072La) C36371kC.A0W(r1, viewNewsletterProfilePhoto.A3j().A0H);
        }
        throw C36331k8.A0d("chatsCache");
    }

    public static final void A0F(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto, boolean z) {
        C175328aD r0 = viewNewsletterProfilePhoto.A06;
        if (r0 != null) {
            C175268a7 r02 = r0.A00;
            if (r02 == null || !(!r02.A00.A06())) {
                C175328aD r4 = viewNewsletterProfilePhoto.A06;
                if (r4 != null) {
                    AnonymousClass141 A3j = viewNewsletterProfilePhoto.A3j();
                    AA0 aa0 = new AA0(viewNewsletterProfilePhoto, z);
                    C36351kA.A1H(r4.A00);
                    r4.A00 = null;
                    C175268a7 r2 = new C175268a7(A3j, r4);
                    r4.A00(new C23174B8i(r4, aa0, 4), r2);
                    r4.A00 = r2;
                    return;
                }
                throw C36331k8.A0d("newsletterPhotoLoader");
            }
            return;
        }
        throw C36331k8.A0d("newsletterPhotoLoader");
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r4 = A0L.A5g;
            C165567td.A11(r4, this);
            C18830tt r1 = r4.A00;
            C165567td.A0v(r4, r1, this, C36321k7.A05(r4, r1, this));
            this.A03 = (AnonymousClass16L) r4.A0q.get();
            this.A0C = (AnonymousClass1X7) r4.A4o.get();
            this.A0A = r4.AzV();
            this.A04 = C36341k9.A0R(r4);
            this.A05 = C36341k9.A0S(r4);
            this.A07 = (C24341Cb) r4.A4n.get();
            this.A06 = (AnonymousClass16K) r4.A2C.get();
            this.A08 = C165587tf.A0N(r4);
            this.A03 = C36351kA.A0a(r4);
            this.A01 = C165577te.A0Q(r4);
            this.A09 = (AnonymousClass1GX) r4.A4k.get();
            this.A08 = (AnonymousClass1O8) r4.A6q.get();
            this.A06 = new C175328aD((C27761Ps) r4.A2D.get(), (C19630wG) r4.A91.get(), (C19770wU) r4.A9Y.get());
            this.A05 = C36431kI.A0m(r4);
            this.A00 = (C61453By) A0L.A1X.get();
            this.A02 = (C27761Ps) r4.A2D.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r0 = 12
            r3 = -1
            r11 = 13
            java.lang.String r2 = "photoUpdater"
            r8 = r12
            r7 = r15
            if (r13 == r0) goto L_0x0036
            if (r13 == r11) goto L_0x0011
            super.onActivityResult(r13, r14, r15)
        L_0x0010:
            return
        L_0x0011:
            X.2bA r0 = r12.A0B
            if (r0 != 0) goto L_0x001a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x001a:
            java.io.File r0 = r0.A02()
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x0065
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ViewNewsletterProfilePhoto/failed-delete-file"
            r1.append(r0)
            X.2bA r0 = r12.A0B
            if (r0 != 0) goto L_0x005a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0036:
            if (r14 != r3) goto L_0x0010
            r1 = 0
            if (r15 == 0) goto L_0x010d
            java.lang.String r0 = "is_reset"
            boolean r0 = r15.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x004d
            X.8z5 r0 = X.C188128z5.DELETED
            r12.A07 = r0
            X.AiA r3 = new X.AiA
            r3.<init>(r12)
            goto L_0x0073
        L_0x004d:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r15.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x010d
            X.8z5 r0 = X.C188128z5.NOT_CROPPED
            r12.A07 = r0
            goto L_0x006e
        L_0x005a:
            java.io.File r0 = r0.A02()
            java.lang.String r0 = r0.getAbsolutePath()
            X.C36341k9.A1O(r1, r0)
        L_0x0065:
            if (r14 != r3) goto L_0x00a9
            X.8z5 r0 = X.C188128z5.CROPPED
            r12.A07 = r0
            r0 = 1
            r12.A0D = r0
        L_0x006e:
            X.AiB r3 = new X.AiB
            r3.<init>(r12)
        L_0x0073:
            r0 = 2131895270(0x7f1223e6, float:1.9425368E38)
            r12.Bu1(r0)
            X.2La r1 = A01(r12)
            if (r1 == 0) goto L_0x0010
            X.1Zi r4 = r12.A05
            if (r4 == 0) goto L_0x0102
            X.141 r0 = r12.A3j()
            X.11F r5 = r0.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.AnonymousClass00C.A0E(r5, r0)
            X.1Uw r5 = (X.C28981Uw) r5
            java.lang.String r7 = r1.A0K
            X.8z5 r0 = r12.A07
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00b6
            r0 = 1
            if (r1 == r0) goto L_0x00b6
            r0 = 3
            if (r1 == r0) goto L_0x00f2
            r0 = 0
            if (r1 == r0) goto L_0x00f2
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00a9:
            if (r14 != 0) goto L_0x0010
            if (r15 == 0) goto L_0x0010
            X.2bA r0 = r12.A0B
            if (r0 != 0) goto L_0x0109
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00b6:
            X.16K r1 = r12.A06
            if (r1 == 0) goto L_0x00fb
            X.141 r0 = r12.A04
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "tempContact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c5:
            java.io.File r2 = r1.A00(r0)
            r1 = 1
            if (r2 == 0) goto L_0x00f2
            boolean r0 = r2.exists()
            if (r0 != r1) goto L_0x00f2
            android.net.Uri r1 = android.net.Uri.fromFile(r2)
            if (r1 == 0) goto L_0x00f2
            X.1GX r0 = r12.A09
            if (r0 == 0) goto L_0x00f4
            java.io.File r0 = r0.A0h(r1)
            if (r0 == 0) goto L_0x00f2
            byte[] r9 = X.AnonymousClass6YY.A0V(r0)
        L_0x00e6:
            X.ADh r6 = new X.ADh
            r6.<init>(r12, r3)
            r8 = 0
            r10 = 0
            r11 = 1
            r4.A0C(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00f2:
            r9 = 0
            goto L_0x00e6
        L_0x00f4:
            java.lang.String r0 = "mediaFileUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00fb:
            java.lang.String r0 = "contactPhotoHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0102:
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0109:
            r0.A04(r15, r12)
            return
        L_0x010d:
            X.2bA r6 = r12.A0B
            if (r6 != 0) goto L_0x0116
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0116:
            X.141 r10 = r12.A04
            if (r10 != 0) goto L_0x0121
            java.lang.String r0 = "tempContact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0121:
            r9 = r12
            r6.A06(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        Intent intent = getIntent();
        AnonymousClass00C.A08(intent);
        AnonymousClass6CU A002 = AnonymousClass6UU.A00(intent);
        AnonymousClass6UU.A02(this, A002, new AnonymousClass68G());
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A00 = C36361kB.A0H(this, R.id.progress_bar);
        PhotoView photoView = (PhotoView) C36361kB.A0H(this, R.id.picture);
        AnonymousClass00C.A0D(photoView, 0);
        this.A0B = photoView;
        TextView textView = (TextView) C36361kB.A0H(this, R.id.message);
        AnonymousClass00C.A0D(textView, 0);
        this.A02 = textView;
        ImageView imageView = (ImageView) C36361kB.A0H(this, R.id.picture_animation);
        AnonymousClass00C.A0D(imageView, 0);
        this.A01 = imageView;
        Toolbar A0R = C36411kG.A0R(this);
        setSupportActionBar(A0R);
        C36321k7.A0O(this);
        AnonymousClass00C.A0B(A0R);
        C28981Uw A012 = C28981Uw.A03.A01(C36341k9.A0d(this));
        if (A012 != null) {
            AnonymousClass16D r0 = this.A04;
            if (r0 != null) {
                this.A09 = r0.A0D(A012);
                StringBuilder A0v = AnonymousClass000.A0v(C36371kC.A0e(this.A02).user);
                A0v.append('-');
                String A0q = AnonymousClass000.A0q(AnonymousClass098.A05(C90464aC.A0V(), "-", "", false), A0v);
                AnonymousClass00C.A0D(A0q, 0);
                C28981Uw A032 = C28981Uw.A02.A03(A0q, "newsletter");
                AnonymousClass00C.A08(A032);
                A032.A00 = true;
                AnonymousClass141 r1 = new AnonymousClass141(A032);
                C44072La A013 = A01(this);
                if (!(A013 == null || (str2 = A013.A0K) == null)) {
                    r1.A0P = str2;
                }
                this.A04 = r1;
                C44072La A014 = A01(this);
                if (A014 != null) {
                    C27731Pn r12 = this.A01;
                    if (r12 != null) {
                        this.A0A = r12.A05(this, "newsletter-profile-pic-activity");
                        boolean A1V = AnonymousClass000.A1V(A014.A0M);
                        this.A0C = A1V;
                        C61453By r02 = this.A00;
                        if (r02 != null) {
                            this.A0B = r02.A00(A1V);
                            this.A04.Boy(new C81123wV((Object) this, 30));
                            C24341Cb r5 = this.A07;
                            if (r5 != null) {
                                AnonymousClass1X7 r4 = this.A0C;
                                if (r4 != null) {
                                    if (r5.A04(new AA2(this, new C21329AHh(), r4))) {
                                        AnonymousClass1O8 r42 = this.A08;
                                        if (r42 != null) {
                                            r42.A01(C36351kA.A0j(A3j()), A3j().A05, 1);
                                            C44072La A015 = A01(this);
                                            if (A015 == null || (str = A015.A0M) == null || str.length() == 0) {
                                                this.A0F.sendEmptyMessageDelayed(0, 32000);
                                            }
                                        } else {
                                            throw C36331k8.A0d("profilePhotoManager");
                                        }
                                    }
                                    C27761Ps r10 = this.A02;
                                    if (r10 != null) {
                                        Bitmap A072 = r10.A07(this, A3j(), getResources().getDimension(R.dimen.f7nameremoved), getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
                                        PhotoView A3k = A3k();
                                        A3k.A0O = true;
                                        A3k.A08 = 1.0f;
                                        A3k.A08(A072);
                                        A3i().setImageBitmap(A072);
                                        A0F(this, getIntent().getBooleanExtra("open_pic_selection_sheet", false));
                                        if (!this.A0C) {
                                            PhotoView A3k2 = A3k();
                                            Drawable A003 = AnonymousClass0BT.A00(getTheme(), getResources(), R.drawable.avatar_newsletter_large);
                                            AnonymousClass00C.A0E(A003, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                            A3k2.A09((BitmapDrawable) A003);
                                        }
                                        String stringExtra = getIntent().getStringExtra("circular_return_name");
                                        if (stringExtra == null) {
                                            stringExtra = new AnonymousClass3CG(this).A02(R.string.f12nameremoved);
                                        }
                                        AnonymousClass00C.A0B(stringExtra);
                                        boolean z = AnonymousClass3U9.A00;
                                        A3l(z, stringExtra);
                                        AnonymousClass6UU.A01(C36361kB.A0H(this, R.id.root_view), C36361kB.A0H(this, R.id.content), A0R, this, A3k(), A002, z);
                                        return;
                                    }
                                    throw C36331k8.A0d("contactPhotosBitmapManager");
                                }
                                throw C36331k8.A0d("mediaUI");
                            }
                            throw C36331k8.A0d("mediaStateManager");
                        }
                        throw C36331k8.A0d("photoUpdateFactory");
                    }
                    throw C36331k8.A0d("contactPhotos");
                }
            } else {
                throw C36331k8.A0d("contactManager");
            }
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Throwable th;
        AnonymousClass00C.A0D(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_edit) {
            A07();
            return true;
        } else if (itemId == 1) {
            File A0X = this.A04.A0X("photo.jpg");
            try {
                AnonymousClass16K r1 = this.A06;
                if (r1 != null) {
                    File A002 = r1.A00(A3j());
                    if (A002 != null) {
                        AnonymousClass6YY.A0J(new FileInputStream(A002), new FileOutputStream(A0X));
                        Uri A012 = AnonymousClass6YY.A01(this, A0X);
                        AnonymousClass00C.A08(A012);
                        AnonymousClass16L r0 = this.A03;
                        if (r0 != null) {
                            r0.A02().A0C(A012.toString());
                            AnonymousClass171 r12 = this.A05;
                            if (r12 != null) {
                                String A0H = r12.A0H(A3j());
                                Intent[] intentArr = new Intent[2];
                                intentArr[0] = new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A012);
                                Intent A013 = AnonymousClass3UJ.A01((IntentSender) null, (CharSequence) null, C36341k9.A0m(C36431kI.A0D().setClassName(this, "com.whatsapp.profile.ViewProfilePhoto$SavePhoto").putExtra("android.intent.extra.STREAM", Uri.fromFile(A0X)).putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0H), intentArr, 1));
                                AnonymousClass00C.A08(A013);
                                startActivity(A013);
                                return true;
                            }
                            th = C36331k8.A0d("waContactNames");
                        } else {
                            th = C36331k8.A0d("caches");
                        }
                    } else {
                        th = C90524aI.A0X("File cannot be read");
                    }
                } else {
                    th = C36331k8.A0d("contactPhotoHelper");
                }
                throw th;
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.A05.A06(R.string.f12nameremoved, 1);
                return true;
            }
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass0PG.A00(this);
            return true;
        }
    }

    public ViewNewsletterProfilePhoto(int i) {
        this.A0D = false;
        B7Y.A00(this, 22);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.removeMessages(0);
    }

    public void onResume() {
        super.onResume();
        if (!this.A0E && getIntent().getBooleanExtra("open_pic_selection_sheet", false)) {
            this.A0E = true;
            A07();
        }
    }

    public ViewNewsletterProfilePhoto() {
        this(0);
        this.A0F = new C23133B6o(Looper.getMainLooper(), this, 4);
        this.A07 = C188128z5.UNCHANGED;
    }
}
