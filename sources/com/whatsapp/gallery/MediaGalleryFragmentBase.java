package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass0CZ;
import X.AnonymousClass16L;
import X.AnonymousClass17Y;
import X.AnonymousClass1A2;
import X.AnonymousClass1Ax;
import X.AnonymousClass1TA;
import X.AnonymousClass1X7;
import X.AnonymousClass2Ty;
import X.AnonymousClass2bU;
import X.AnonymousClass3CG;
import X.AnonymousClass3FI;
import X.AnonymousClass3GM;
import X.AnonymousClass3K8;
import X.AnonymousClass3MW;
import X.AnonymousClass3U9;
import X.AnonymousClass4GE;
import X.AnonymousClass4GF;
import X.AnonymousClass4GG;
import X.AnonymousClass4O5;
import X.AnonymousClass4QB;
import X.AnonymousClass4V2;
import X.AnonymousClass4VO;
import X.AnonymousClass4ZY;
import X.AnonymousClass6N7;
import X.C000800j;
import X.C001400p;
import X.C007403e;
import X.C019308f;
import X.C023509x;
import X.C109325Xd;
import X.C1270866x;
import X.C18820ts;
import X.C19630wG;
import X.C19700wN;
import X.C19770wU;
import X.C19930wk;
import X.C20810yC;
import X.C20830yE;
import X.C21060yb;
import X.C225314u;
import X.C25561Gu;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C46972by;
import X.C49252io;
import X.C49262ip;
import X.C49772jf;
import X.C589231o;
import X.C589331p;
import X.C64933Qa;
import X.C74153l9;
import X.C74833mF;
import X.C74873mJ;
import X.C74883mK;
import X.C83934Bh;
import X.C83944Bi;
import X.C83954Bj;
import X.C83974Bl;
import X.C83984Bm;
import X.C83994Bn;
import X.C84004Bo;
import X.C87774Qc;
import X.C88924Uo;
import X.C89004Uw;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$cacheMedia$1;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.text.Format;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;

public abstract class MediaGalleryFragmentBase extends Hilt_MediaGalleryFragmentBase {
    public int A00 = 10;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Toast A06;
    public AnonymousClass17Y A07;
    public StickyHeadersRecyclerView A08;
    public AnonymousClass16L A09;
    public C21060yb A0A;
    public C19630wG A0B;
    public C20830yE A0C;
    public AnonymousClass4QB A0D;
    public C18820ts A0E;
    public C20810yC A0F;
    public C88924Uo A0G;
    public C49262ip A0H;
    public AnonymousClass3GM A0I;
    public AnonymousClass6N7 A0J;
    public AnonymousClass3K8 A0K;
    public RecyclerFastScroller A0L;
    public C74153l9 A0M;
    public C19930wk A0N;
    public C19930wk A0O;
    public C19770wU A0P;
    public AnonymousClass004 A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public View A0U;
    public View A0V;
    public View A0W;
    public C49252io A0X;
    public C49772jf A0Y;
    public AnonymousClass0CZ A0Z;
    public final List A0a = AnonymousClass001.A0I();
    public final AnonymousClass00T A0b = C36431kI.A1I(new C83934Bh(this));
    public final AnonymousClass00T A0c = C36431kI.A1I(new C83944Bi(this));
    public final AnonymousClass00T A0d = C36431kI.A1I(new C83954Bj(this));
    public final AnonymousClass00T A0e;
    public final ContentObserver A0f;
    public final Handler A0g;
    public final C589331p A0h = new C589331p(this);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putInt("sort_type", this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0107, code lost:
        if (r2 == 1) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r7, r4)
            X.0yC r1 = r5.A1Z()
            r0 = 6789(0x1a85, float:9.513E-42)
            boolean r0 = X.AnonymousClass1Ax.A03(r1, r0)
            if (r0 == 0) goto L_0x0028
            X.00T r0 = r5.A0e
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel r0 = (com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel) r0
            X.00s r3 = r0.A04
            X.0Ab r2 = r5.A0m()
            X.4K6 r1 = new X.4K6
            r1.<init>(r5)
            r0 = 45
            X.C66033Uk.A00(r2, r3, r1, r0)
        L_0x0028:
            X.0wU r1 = r5.A0P
            if (r1 == 0) goto L_0x0165
            X.0wk r0 = new X.0wk
            r0.<init>(r1, r4)
            r5.A0O = r0
            X.0wU r1 = r5.A0P
            if (r1 == 0) goto L_0x0160
            X.0wk r0 = new X.0wk
            r0.<init>(r1, r4)
            r5.A0N = r0
            if (r6 == 0) goto L_0x0136
            java.lang.String r0 = "sort_type"
            int r0 = r6.getInt(r0, r4)
        L_0x0046:
            r5.A03 = r0
            int r1 = r5.A02
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r5.A05 = r0
            android.content.Context r3 = r5.A0a()
            android.content.Context r2 = r5.A1D()
            r1 = 2130969719(0x7f040477, float:1.7548128E38)
            r0 = 2131100915(0x7f0604f3, float:1.7814225E38)
            int r0 = X.C36351kA.A02(r2, r3, r1, r0)
            r5.A02 = r0
            android.content.res.Resources r1 = X.C36341k9.A0G(r5)
            r0 = 2131166673(0x7f0705d1, float:1.7947598E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A04 = r0
            boolean r0 = r5 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            r5.A0S = r0
            r0 = 2131432103(0x7f0b12a7, float:1.8485954E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A0U = r0
            r0 = 2131430461(0x7f0b0c3d, float:1.8482624E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A0V = r0
            r0 = 2131432105(0x7f0b12a9, float:1.8485958E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A0W = r0
            r0 = 2131430608(0x7f0b0cd0, float:1.8482922E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.StickyHeadersRecyclerView r0 = (com.whatsapp.StickyHeadersRecyclerView) r0
            r5.A08 = r0
            X.0yC r0 = r5.A1Z()
            X.1wc r1 = new X.1wc
            r1.<init>(r0, r5, r5)
            r0 = 1
            r1.A0B(r0)
            r5.A0Z = r1
            com.whatsapp.StickyHeadersRecyclerView r0 = r5.A08
            if (r0 == 0) goto L_0x00b2
            r0.setAdapter(r1)
        L_0x00b2:
            r0 = 2131433570(0x7f0b1862, float:1.848893E38)
            android.view.View r1 = X.C012005e.A02(r7, r0)
            com.whatsapp.scroller.RecyclerFastScroller r1 = (com.whatsapp.scroller.RecyclerFastScroller) r1
            X.0ts r0 = r5.A0E
            if (r0 == 0) goto L_0x015b
            boolean r0 = X.C36401kF.A1X(r0)
            r1.A09 = r0
            com.whatsapp.StickyHeadersRecyclerView r0 = r5.A08
            r1.setRecyclerView(r0)
            r5.A0L = r1
            android.content.Context r0 = r5.A1D()
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r0)
            X.0ts r2 = r5.A0E
            if (r2 == 0) goto L_0x0156
            android.content.Context r1 = r5.A0a()
            r0 = 2131231629(0x7f08038d, float:1.8079344E38)
            X.C36321k7.A0L(r1, r3, r2, r0)
            com.whatsapp.scroller.RecyclerFastScroller r0 = r5.A0L
            if (r0 == 0) goto L_0x00ea
            r0.setThumbView(r3)
        L_0x00ea:
            com.whatsapp.scroller.RecyclerFastScroller r2 = r5.A0L
            if (r2 == 0) goto L_0x00fc
            X.00T r0 = r5.A0b
            android.view.View r1 = X.C36361kB.A0I(r0)
            X.3qd r0 = new X.3qd
            r0.<init>(r5)
            r2.setBubbleView(r1, r0)
        L_0x00fc:
            com.whatsapp.scroller.RecyclerFastScroller r3 = r5.A0L
            if (r3 == 0) goto L_0x010d
            int r2 = r5.A03
            if (r2 == 0) goto L_0x0109
            r1 = 1
            r0 = 8
            if (r2 != r1) goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            r3.setVisibility(r0)
        L_0x010d:
            X.16L r4 = r5.A09
            if (r4 == 0) goto L_0x014f
            X.0yb r3 = r5.A0A
            if (r3 == 0) goto L_0x014a
            android.os.Handler r2 = X.C36341k9.A0H()
            java.lang.String r1 = "media-gallery-fragment"
            X.3K8 r0 = new X.3K8
            r0.<init>(r2, r4, r3, r1)
            r5.A0K = r0
            X.3GM r1 = r5.A0I
            if (r1 == 0) goto L_0x0143
            X.01I r0 = r5.A0i()
            r1.A00(r7, r0)
            X.4Bk r0 = new X.4Bk
            r0.<init>(r5)
            X.C54342sn.A00(r7, r5, r0)
            return
        L_0x0136:
            android.os.Bundle r1 = r5.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "sort_type"
            int r0 = r1.getInt(r0, r4)
            goto L_0x0046
        L_0x0143:
            java.lang.String r0 = "galleryPartialPermissionProvider"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x014a:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x014f:
            java.lang.String r0 = "caches"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0156:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x015b:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0160:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x0165:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1f(C88924Uo r23, boolean z) {
        AnonymousClass01I A0h2 = A0h();
        if (A0h2 != null) {
            C88924Uo r5 = r23;
            this.A0G = r5;
            r5.registerContentObserver(this.A0f);
            A1c();
            AnonymousClass3GM r1 = this.A0I;
            if (r1 != null) {
                r1.A01(new C83974Bl(this));
                Point point = new Point();
                C36321k7.A0K(A0h2, point);
                int i = this.A03;
                if (i == 0 || i == 1) {
                    int i2 = point.y;
                    int i3 = point.x;
                    int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
                    int i4 = ((i2 * i3) / (dimensionPixelSize * dimensionPixelSize)) + 1;
                    C87774Qc A1a = A1a();
                    if (A1a != null) {
                        boolean z2 = z;
                        if (AnonymousClass1Ax.A03(A1Z(), 6789)) {
                            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) this.A0e.getValue();
                            List list = this.A0a;
                            AnonymousClass004 r0 = this.A0Q;
                            if (r0 != null) {
                                Object obj = r0.get();
                                AnonymousClass00C.A08(obj);
                                AnonymousClass4O5 r15 = (AnonymousClass4O5) obj;
                                C36331k8.A1G(r15, 2, list);
                                C007403e r12 = mediaGalleryFragmentViewModel.A03;
                                if (r12 != null) {
                                    r12.B2S((CancellationException) null);
                                }
                                mediaGalleryFragmentViewModel.A03 = C36391kE.A12(new MediaGalleryFragmentViewModel$loadSections$1(r15, A1a, mediaGalleryFragmentViewModel, list, (C023509x) null, i4, z2), C109325Xd.A00(mediaGalleryFragmentViewModel));
                            } else {
                                throw C36331k8.A0d("timeBucketsProvider");
                            }
                        } else {
                            AnonymousClass17Y r7 = this.A07;
                            if (r7 != null) {
                                C589331p r9 = this.A0h;
                                AnonymousClass004 r02 = this.A0Q;
                                if (r02 != null) {
                                    Object obj2 = r02.get();
                                    AnonymousClass00C.A08(obj2);
                                    C49772jf r52 = new C49772jf(this, r7, (AnonymousClass4O5) obj2, r9, A1a, this.A0a, i4, z2);
                                    this.A0Y = r52;
                                    C19770wU r03 = this.A0P;
                                    if (r03 != null) {
                                        C36391kE.A1Q(r52, r03);
                                    } else {
                                        throw C36321k7.A08();
                                    }
                                } else {
                                    throw C36331k8.A0d("timeBucketsProvider");
                                }
                            } else {
                                throw C36321k7.A06();
                            }
                        }
                    }
                } else {
                    this.A01 = r5.getCount();
                    A1b();
                    A1h(false);
                }
                A08(this);
                return;
            }
            throw C36331k8.A0d("galleryPartialPermissionProvider");
        }
    }

    public abstract boolean A1k(AnonymousClass4V2 r1, AnonymousClass2Ty r2);

    private final void A06() {
        C19930wk r0 = this.A0O;
        if (r0 != null) {
            r0.A02();
        }
        C19930wk r02 = this.A0N;
        if (r02 != null) {
            r02.A02();
        }
        boolean A1Z = C36411kG.A1Z(this.A0H);
        this.A0H = null;
        C49772jf r03 = this.A0Y;
        if (r03 != null) {
            r03.A0D(A1Z);
        }
        this.A0Y = null;
        C49252io r04 = this.A0X;
        if (r04 != null) {
            r04.A0D(A1Z);
        }
        this.A0X = null;
    }

    public static final void A07(AnonymousClass4V2 r5, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        if (r5 != null) {
            C36351kA.A0G(mediaGalleryFragmentBase.A0c).setText(((Format) mediaGalleryFragmentBase.A0d.getValue()).format(new Date(r5.BAn())));
        }
    }

    public static final void A08(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        C88924Uo r4 = mediaGalleryFragmentBase.A0G;
        if (r4 != null && mediaGalleryFragmentBase.A0S) {
            mediaGalleryFragmentBase.A0R = false;
            mediaGalleryFragmentBase.A1b();
            if (AnonymousClass1Ax.A03(mediaGalleryFragmentBase.A1Z(), 6789)) {
                MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0e.getValue();
                C007403e r0 = mediaGalleryFragmentViewModel.A01;
                if (r0 != null) {
                    r0.B2S((CancellationException) null);
                }
                mediaGalleryFragmentViewModel.A01 = C36391kE.A12(new MediaGalleryFragmentViewModel$cacheMedia$1(r4, mediaGalleryFragmentViewModel, (C023509x) null), C109325Xd.A00(mediaGalleryFragmentViewModel));
                return;
            }
            C36331k8.A1E(mediaGalleryFragmentBase.A0X);
            C49252io r1 = new C49252io(mediaGalleryFragmentBase, r4, new AnonymousClass4GE(r4, mediaGalleryFragmentBase));
            mediaGalleryFragmentBase.A0X = r1;
            C19770wU r02 = mediaGalleryFragmentBase.A0P;
            if (r02 != null) {
                C36391kE.A1Q(r1, r02);
                return;
            }
            throw C36321k7.A08();
        }
    }

    public void A1H() {
        Log.i("MediaGalleryFragmentBase/destroy");
        super.A1H();
        Toast toast = this.A06;
        if (toast != null) {
            toast.cancel();
        }
        this.A06 = null;
        A06();
        this.A0R = false;
        AnonymousClass3K8 r0 = this.A0K;
        if (r0 != null) {
            r0.A00();
        }
        this.A0K = null;
        C88924Uo r1 = this.A0G;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0f);
        }
        C88924Uo r02 = this.A0G;
        if (r02 != null) {
            r02.close();
        }
        this.A0G = null;
        this.A0Z = null;
        this.A01 = 0;
    }

    public final C20810yC A1Z() {
        C20810yC r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public C87774Qc A1a() {
        C87774Qc r3;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            return new AnonymousClass4ZY(this, 1);
        }
        if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            AnonymousClass01I A0h2 = mediaPickerFragment.A0h();
            if (A0h2 == null) {
                return null;
            }
            Uri data = A0h2.getIntent().getData();
            C20810yC A1Z = mediaPickerFragment.A1Z();
            AnonymousClass6N7 r5 = mediaPickerFragment.A0J;
            if (r5 != null) {
                C21060yb r32 = mediaPickerFragment.A0A;
                if (r32 != null) {
                    AnonymousClass1A2 r6 = mediaPickerFragment.A0B;
                    if (r6 != null) {
                        return new C74883mK(data, r32, A1Z, r5, r6, mediaPickerFragment.A00, mediaPickerFragment.A0E);
                    }
                    throw C36331k8.A0d("perfTimerFactory");
                }
                throw C36331k8.A0W();
            }
            throw C36331k8.A0d("mediaManager");
        } else if (this instanceof MediaGalleryFragment) {
            return new AnonymousClass4ZY(this, 0);
        } else {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
            Bundle bundle = galleryRecentsFragment.A0A;
            if (bundle == null || bundle.getInt("include", 7) == 7) {
                AnonymousClass6N7 r1 = galleryRecentsFragment.A0J;
                if (r1 != null) {
                    r3 = new C74873mJ(r1, galleryRecentsFragment.A08);
                } else {
                    throw C36331k8.A0d("mediaManager");
                }
            } else {
                C20810yC A1Z2 = galleryRecentsFragment.A1Z();
                AnonymousClass6N7 r7 = galleryRecentsFragment.A0J;
                if (r7 != null) {
                    C21060yb r52 = galleryRecentsFragment.A0A;
                    if (r52 != null) {
                        AnonymousClass1A2 r8 = galleryRecentsFragment.A05;
                        if (r8 != null) {
                            Bundle bundle2 = galleryRecentsFragment.A0A;
                            int i = 7;
                            if (bundle2 != null) {
                                i = bundle2.getInt("include", 7);
                            }
                            r3 = new C74883mK((Uri) null, r52, A1Z2, r7, r8, i, false);
                        } else {
                            throw C36331k8.A0d("perfTimerFactory");
                        }
                    } else {
                        throw C36331k8.A0W();
                    }
                } else {
                    throw C36331k8.A0d("mediaManager");
                }
            }
            return r3;
        }
    }

    public final void A1b() {
        AnonymousClass0CZ r0 = this.A0Z;
        if (r0 != null) {
            r0.A06();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.getCount() <= 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1c() {
        /*
            r6 = this;
            X.4Uo r1 = r6.A0G
            if (r1 == 0) goto L_0x0051
            X.0yE r0 = r6.A0C
            if (r0 == 0) goto L_0x007e
            X.2nw r0 = r0.A04()
            X.2nw r5 = X.C51512nw.DENIED
            r3 = 0
            if (r0 == r5) goto L_0x0018
            int r0 = r1.getCount()
            r4 = 1
            if (r0 > 0) goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            android.view.View r2 = r6.A0U
            r1 = 8
            if (r2 == 0) goto L_0x0028
            r0 = r4 ^ 1
            int r0 = X.C36351kA.A00(r0)
            r2.setVisibility(r0)
        L_0x0028:
            if (r4 == 0) goto L_0x0052
            android.view.View r0 = r6.A0V
            if (r0 == 0) goto L_0x0031
            r0.setVisibility(r1)
        L_0x0031:
            android.view.View r0 = r6.A0W
            if (r0 == 0) goto L_0x0038
            r0.setVisibility(r1)
        L_0x0038:
            com.whatsapp.StickyHeadersRecyclerView r0 = r6.A08
            if (r0 == 0) goto L_0x0043
            if (r4 != 0) goto L_0x0040
            r3 = 8
        L_0x0040:
            r0.setVisibility(r3)
        L_0x0043:
            android.view.View r0 = r6.A0V
            if (r0 == 0) goto L_0x004a
            r0.requestLayout()
        L_0x004a:
            android.view.View r0 = r6.A0W
            if (r0 == 0) goto L_0x0051
            r0.requestLayout()
        L_0x0051:
            return
        L_0x0052:
            X.0yE r0 = r6.A0C
            if (r0 == 0) goto L_0x0077
            X.2nw r0 = r0.A04()
            boolean r2 = X.C36361kB.A1a(r0, r5)
            android.view.View r1 = r6.A0V
            if (r1 == 0) goto L_0x0069
            int r0 = X.C36381kD.A09(r2)
            r1.setVisibility(r0)
        L_0x0069:
            android.view.View r1 = r6.A0W
            if (r1 == 0) goto L_0x0038
            r0 = r2 ^ 1
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            goto L_0x0038
        L_0x0077:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x007e:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A1c():void");
    }

    public void A1e(AnonymousClass4V2 r14, AnonymousClass2Ty r15) {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            AnonymousClass2bU r9 = ((C74833mF) r14).A02;
            if (storageUsageMediaGalleryFragment.A1i()) {
                r15.setChecked(((C89004Uw) storageUsageMediaGalleryFragment.A0i()).Bvv(r9));
                storageUsageMediaGalleryFragment.A1b();
            } else if (r14.getType() != 4) {
                AnonymousClass3FI r2 = new AnonymousClass3FI(storageUsageMediaGalleryFragment.A0i());
                r2.A07 = true;
                C64933Qa r1 = r9.A1J;
                r2.A05 = r1.A00;
                r2.A06 = r1;
                r2.A03 = 2;
                r2.A01 = 2;
                Intent A002 = r2.A00();
                AnonymousClass3U9.A08(storageUsageMediaGalleryFragment.A0i(), A002, r15);
                AnonymousClass3CG.A01(storageUsageMediaGalleryFragment.A0i(), storageUsageMediaGalleryFragment.A0a(), A002, r15, r9);
            } else if (r9 instanceof C46972by) {
                AnonymousClass1X7 r10 = storageUsageMediaGalleryFragment.A09;
                AnonymousClass17Y r7 = storageUsageMediaGalleryFragment.A07;
                C19700wN r5 = storageUsageMediaGalleryFragment.A02;
                C19770wU r12 = storageUsageMediaGalleryFragment.A0P;
                AnonymousClass1TA r8 = storageUsageMediaGalleryFragment.A06;
                C25561Gu.A02(storageUsageMediaGalleryFragment.A01, r5, (C225314u) storageUsageMediaGalleryFragment.A0h(), r7, r8, (C46972by) r9, r10, storageUsageMediaGalleryFragment.A0B, r12);
            }
        } else if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            C1270866x r22 = mediaPickerFragment.A0D;
            if (r22 != null) {
                r22.A02(Integer.valueOf(AnonymousClass3MW.A01(r14.BEF())), 1, 1);
                mediaPickerFragment.A1n(r14);
                return;
            }
            throw C36331k8.A0d("mediaSharingUserJourneyLogger");
        } else {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this;
            AnonymousClass2bU r3 = ((C74833mF) r14).A02;
            if (r3 == null) {
                return;
            }
            if (mediaGalleryFragment.A1i()) {
                r15.setChecked(((C89004Uw) mediaGalleryFragment.A0h()).Bvv(r3));
                return;
            }
            AnonymousClass3FI r13 = new AnonymousClass3FI(mediaGalleryFragment.A0i());
            r13.A07 = true;
            r13.A05 = mediaGalleryFragment.A03;
            r13.A06 = r3.A1J;
            r13.A03 = 2;
            r13.A00 = 34;
            Intent A003 = r13.A00();
            AnonymousClass3U9.A08(mediaGalleryFragment.A0i(), A003, r15);
            AnonymousClass3CG.A01(mediaGalleryFragment.A0i(), mediaGalleryFragment.A0a(), A003, r15, r3);
        }
    }

    public final void A1h(boolean z) {
        View findViewById;
        View view = this.A0F;
        if (view != null && (findViewById = view.findViewById(R.id.progress_bar)) != null) {
            findViewById.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
    }

    public boolean A1i() {
        AnonymousClass01I A0h2;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            A0h2 = A0i();
        } else if (this instanceof MediaPickerFragment) {
            return AnonymousClass000.A1V(((MediaPickerFragment) this).A04);
        } else {
            if (this instanceof MediaGalleryFragment) {
                A0h2 = A0h();
            } else {
                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
                if (galleryRecentsFragment.A07 || (!galleryRecentsFragment.A09.isEmpty())) {
                    return true;
                }
                return false;
            }
        }
        return ((C89004Uw) A0h2).BK6();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1j(int r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            if (r0 == 0) goto L_0x0025
            X.4Uo r0 = r3.A0G
            r2 = 0
            if (r0 == 0) goto L_0x0024
            X.4V2 r1 = r0.BDy(r4)
            boolean r0 = r1 instanceof X.C74833mF
            if (r0 == 0) goto L_0x0024
            X.3mF r1 = (X.C74833mF) r1
            X.2bU r1 = r1.A02
            if (r1 == 0) goto L_0x0024
            X.01I r0 = r3.A0i()
            X.4Uw r0 = (X.C89004Uw) r0
            boolean r0 = r0.BMT(r1)
            if (r0 == 0) goto L_0x0024
            r2 = 1
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r3 instanceof com.whatsapp.gallerypicker.MediaPickerFragment
            if (r0 == 0) goto L_0x005a
            r1 = r3
            com.whatsapp.gallerypicker.MediaPickerFragment r1 = (com.whatsapp.gallerypicker.MediaPickerFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.gallery.NewMediaPickerFragment
            if (r0 == 0) goto L_0x0041
            com.whatsapp.gallery.NewMediaPickerFragment r1 = (com.whatsapp.gallery.NewMediaPickerFragment) r1
            X.4Uo r0 = r1.A0G
            if (r0 == 0) goto L_0x007e
            java.util.Set r1 = r1.A05
            X.4V2 r0 = r0.BDy(r4)
            boolean r0 = X.C007103b.A0j(r1, r0)
            return r0
        L_0x0041:
            X.4Uo r0 = r1.A0G
            if (r0 == 0) goto L_0x0058
            X.4V2 r0 = r0.BDy(r4)
        L_0x0049:
            java.util.HashSet r1 = r1.A0M
            if (r0 == 0) goto L_0x0056
            android.net.Uri r0 = r0.B7k()
        L_0x0051:
            boolean r0 = X.C007103b.A0j(r1, r0)
            return r0
        L_0x0056:
            r0 = 0
            goto L_0x0051
        L_0x0058:
            r0 = 0
            goto L_0x0049
        L_0x005a:
            boolean r0 = r3 instanceof com.whatsapp.gallery.MediaGalleryFragment
            if (r0 == 0) goto L_0x008f
            X.4Uo r2 = r3.A0G
            X.3mH r2 = (X.C74853mH) r2
            if (r2 == 0) goto L_0x007e
            java.util.Map r0 = r2.A05
            java.lang.Object r1 = X.C36371kC.A0r(r0, r4)
            X.3mF r1 = (X.C74833mF) r1
            X.1l9 r0 = r2.A01
            if (r0 == 0) goto L_0x007c
            if (r1 != 0) goto L_0x0080
            boolean r0 = X.C224714l.A02()
            if (r0 != 0) goto L_0x007e
            X.3mF r1 = X.C74853mH.A00(r2, r4)
        L_0x007c:
            if (r1 != 0) goto L_0x0080
        L_0x007e:
            r0 = 0
            return r0
        L_0x0080:
            X.2bU r1 = r1.A02
            if (r1 == 0) goto L_0x007e
            X.01I r0 = r3.A0h()
            X.4Uw r0 = (X.C89004Uw) r0
            boolean r0 = r0.BMT(r1)
            return r0
        L_0x008f:
            r1 = r3
            com.whatsapp.gallery.GalleryRecentsFragment r1 = (com.whatsapp.gallery.GalleryRecentsFragment) r1
            X.4Uo r0 = r1.A0G
            if (r0 == 0) goto L_0x007e
            X.4V2 r0 = r0.BDy(r4)
            if (r0 == 0) goto L_0x007e
            java.util.Map r1 = r1.A09
            android.net.Uri r0 = r0.B7k()
            boolean r0 = r1.containsKey(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryFragmentBase.A1j(int):boolean");
    }

    public MediaGalleryFragmentBase() {
        Handler A0H2 = C36341k9.A0H();
        this.A0g = A0H2;
        this.A0f = new AnonymousClass4VO(A0H2, this, 2);
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C83994Bn(new C83984Bm(this)));
        C019308f A1A = C36441kJ.A1A(MediaGalleryFragmentViewModel.class);
        this.A0e = C36441kJ.A0a(new C84004Bo(A002), new AnonymousClass4GG(this, A002), new AnonymousClass4GF(A002), A1A);
    }

    public void A1L() {
        super.A1L();
        A1c();
        AnonymousClass3GM r1 = this.A0I;
        if (r1 != null) {
            r1.A01(new C83974Bl(this));
            return;
        }
        throw C36331k8.A0d("galleryPartialPermissionProvider");
    }

    public final void A1d(int i) {
        AnonymousClass01I A0h2 = A0h();
        if (A0h2 != null) {
            C21060yb r5 = this.A0A;
            if (r5 != null) {
                C18820ts r4 = this.A0E;
                if (r4 != null) {
                    Object[] A0L2 = AnonymousClass001.A0L();
                    C36331k8.A1W(A0L2, i);
                    C33521fV.A00(A0h2, r5, r4.A0L(A0L2, R.plurals.f10nameremoved, (long) i));
                    return;
                }
                throw C36321k7.A09();
            }
            throw C36331k8.A0W();
        }
    }

    public final void A1g(boolean z) {
        C36321k7.A1X("MediaGalleryFragmentBase/rebake unmounted:", AnonymousClass000.A0u(), z);
        A06();
        C88924Uo r1 = this.A0G;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0f);
        }
        C88924Uo r0 = this.A0G;
        if (r0 != null) {
            r0.close();
        }
        this.A0G = null;
        A1h(true);
        this.A01 = 0;
        A1b();
        this.A0a.clear();
        C87774Qc A1a = A1a();
        if (A1a == null) {
            return;
        }
        if (AnonymousClass1Ax.A03(A1Z(), 6789)) {
            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) this.A0e.getValue();
            C007403e r02 = mediaGalleryFragmentViewModel.A02;
            if (r02 != null) {
                r02.B2S((CancellationException) null);
            }
            mediaGalleryFragmentViewModel.A02 = C36391kE.A12(new MediaGalleryFragmentViewModel$loadMedia$1(A1a, mediaGalleryFragmentViewModel, (C023509x) null, z), C109325Xd.A00(mediaGalleryFragmentViewModel));
            return;
        }
        C49262ip r12 = new C49262ip(A0m(), new C589231o(this), A1a, z);
        this.A0H = r12;
        C19770wU r03 = this.A0P;
        if (r03 != null) {
            C36391kE.A1Q(r12, r03);
            return;
        }
        throw C36321k7.A08();
    }
}
