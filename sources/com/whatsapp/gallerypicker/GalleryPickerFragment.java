package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass0CZ;
import X.AnonymousClass16L;
import X.AnonymousClass190;
import X.AnonymousClass1A2;
import X.AnonymousClass1Ax;
import X.AnonymousClass3GM;
import X.AnonymousClass3K8;
import X.AnonymousClass4GK;
import X.AnonymousClass4GL;
import X.AnonymousClass4K8;
import X.AnonymousClass4VN;
import X.AnonymousClass4VO;
import X.AnonymousClass6N7;
import X.C000800j;
import X.C001400p;
import X.C007403e;
import X.C019308f;
import X.C023509x;
import X.C109325Xd;
import X.C1270866x;
import X.C18740tg;
import X.C18820ts;
import X.C19630wG;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C20830yE;
import X.C21050ya;
import X.C21060yb;
import X.C235718z;
import X.C26981Mg;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C40761w4;
import X.C50042k6;
import X.C51512nw;
import X.C54342sn;
import X.C65103Qt;
import X.C66033Uk;
import X.C84034Br;
import X.C84044Bs;
import X.C84054Bt;
import X.C84064Bu;
import X.C84074Bv;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.SquareImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public final class GalleryPickerFragment extends Hilt_GalleryPickerFragment {
    public int A00 = 1;
    public int A01;
    public int A02;
    public Drawable A03;
    public View A04;
    public WaTextView A05;
    public AnonymousClass16L A06;
    public C235718z A07;
    public C21060yb A08;
    public C19970wo A09;
    public C19630wG A0A;
    public C20830yE A0B;
    public C18820ts A0C;
    public C20810yC A0D;
    public AnonymousClass3GM A0E;
    public C50042k6 A0F;
    public C40761w4 A0G;
    public AnonymousClass6N7 A0H;
    public AnonymousClass3K8 A0I;
    public AnonymousClass190 A0J;
    public AnonymousClass1A2 A0K;
    public C1270866x A0L;
    public C19770wU A0M;
    public BroadcastReceiver A0N;
    public ContentObserver A0O;
    public RecyclerView A0P;
    public boolean A0Q;
    public boolean A0R;
    public final AnonymousClass00T A0S;
    public final Handler A0T = C36341k9.A0H();

    public static final void A03(GalleryPickerFragment galleryPickerFragment) {
        WindowManager windowManager;
        Display defaultDisplay;
        GalleryPickerFragment galleryPickerFragment2 = galleryPickerFragment;
        C18740tg.A0D(AnonymousClass000.A1W(galleryPickerFragment.A0F), "galleryFoldersTask must be cancelled");
        C20830yE r0 = galleryPickerFragment.A0B;
        if (r0 == null) {
            throw C36331k8.A0d("waPermissionsHelper");
        } else if (r0.A04() == C51512nw.DENIED) {
            galleryPickerFragment.A00();
        } else {
            Point point = new Point();
            AnonymousClass01I A0h = galleryPickerFragment.A0h();
            if (!(A0h == null || (windowManager = A0h.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getSize(point);
            }
            int i = point.y * point.x;
            int i2 = galleryPickerFragment.A02;
            int i3 = (i / (i2 * i2)) + 1;
            C20810yC r1 = galleryPickerFragment2.A0D;
            if (r1 == null) {
                throw C36321k7.A07();
            } else if (AnonymousClass1Ax.A03(r1, 6789)) {
                GalleryPickerViewModel galleryPickerViewModel = (GalleryPickerViewModel) galleryPickerFragment2.A0S.getValue();
                int i4 = galleryPickerFragment2.A00;
                C007403e r02 = galleryPickerViewModel.A00;
                if (r02 != null) {
                    r02.B2S((CancellationException) null);
                }
                galleryPickerViewModel.A00 = C36391kE.A12(new GalleryPickerViewModel$loadFolders$1(galleryPickerViewModel, (C023509x) null, i3, i4), C109325Xd.A00(galleryPickerViewModel));
            } else {
                C19970wo r4 = galleryPickerFragment2.A09;
                if (r4 != null) {
                    C20810yC r7 = galleryPickerFragment2.A0D;
                    if (r7 != null) {
                        C19630wG r5 = galleryPickerFragment2.A0A;
                        if (r5 != null) {
                            AnonymousClass6N7 r9 = galleryPickerFragment2.A0H;
                            if (r9 != null) {
                                C18820ts r6 = galleryPickerFragment2.A0C;
                                if (r6 != null) {
                                    C21060yb r3 = galleryPickerFragment2.A08;
                                    if (r3 != null) {
                                        C235718z r2 = galleryPickerFragment2.A07;
                                        if (r2 != null) {
                                            AnonymousClass1A2 r10 = galleryPickerFragment2.A0K;
                                            if (r10 != null) {
                                                C50042k6 r12 = new C50042k6(r2, r3, r4, r5, r6, r7, galleryPickerFragment2, r9, r10, galleryPickerFragment2.A00, i3);
                                                galleryPickerFragment2.A0F = r12;
                                                C19770wU r03 = galleryPickerFragment2.A0M;
                                                if (r03 != null) {
                                                    C36391kE.A1Q(r12, r03);
                                                    return;
                                                }
                                                throw C36331k8.A0d("workers");
                                            }
                                            throw C36331k8.A0d("perfTimerFactory");
                                        }
                                        throw C36331k8.A0d("chatLockManager");
                                    }
                                    throw C36331k8.A0W();
                                }
                                throw C36321k7.A09();
                            }
                            throw C36331k8.A0d("mediaManager");
                        }
                        throw C36331k8.A0d("waContext");
                    }
                    throw C36321k7.A07();
                }
                throw C36331k8.A0d("time");
            }
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        C20810yC r1 = this.A0D;
        if (r1 != null) {
            if (AnonymousClass1Ax.A03(r1, 6789)) {
                C66033Uk.A00(A0m(), ((GalleryPickerViewModel) this.A0S.getValue()).A01, new AnonymousClass4K8(this), 46);
            }
            this.A00 = A0b().getInt("include");
            int A022 = C36351kA.A02(A0a(), A0a(), R.attr.f4nameremoved, R.color.f6nameremoved);
            this.A01 = A022;
            this.A03 = new ColorDrawable(A022);
            this.A02 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            RecyclerView A0c = C36441kJ.A0c(A0d(), R.id.albums);
            A0c.setClipToPadding(false);
            A0c.setPadding(0, C65103Qt.A01(view.getContext(), 2.0f), 0, 0);
            this.A0P = A0c;
            View inflate = C36431kI.A0M(A0d(), R.id.noMediaViewStub).inflate();
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
            WaTextView waTextView = (WaTextView) inflate;
            this.A05 = waTextView;
            C36331k8.A0y(waTextView);
            this.A0N = new AnonymousClass4VN(this, 2);
            Handler handler = this.A0T;
            this.A0O = new AnonymousClass4VO(handler, this, 3);
            C40761w4 r12 = new C40761w4(this);
            this.A0G = r12;
            RecyclerView recyclerView = this.A0P;
            if (recyclerView != null) {
                recyclerView.setAdapter(r12);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
            intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addDataScheme("file");
            C19630wG r0 = this.A0A;
            if (r0 != null) {
                Context context = r0.A00;
                AnonymousClass00C.A08(context);
                BroadcastReceiver broadcastReceiver = this.A0N;
                if (broadcastReceiver == null) {
                    throw C36331k8.A0d("mediaStorageStateReceiver");
                }
                C26981Mg.A01(broadcastReceiver, context, intentFilter, true);
                C21060yb r02 = this.A08;
                if (r02 != null) {
                    C21050ya A0O2 = r02.A0O();
                    if (A0O2 != null) {
                        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        ContentObserver contentObserver = this.A0O;
                        if (contentObserver == null) {
                            throw C36331k8.A0d("mediaContentObserver");
                        }
                        AnonymousClass00C.A0D(uri, 0);
                        C21050ya.A00(A0O2).registerContentObserver(uri, true, contentObserver);
                    }
                    AnonymousClass16L r3 = this.A06;
                    if (r3 != null) {
                        C21060yb r2 = this.A08;
                        if (r2 != null) {
                            this.A0I = new AnonymousClass3K8(handler, r3, r2, "gallery-picker-fragment");
                            this.A0R = false;
                            this.A0Q = false;
                            A03(this);
                            AnonymousClass3GM r13 = this.A0E;
                            if (r13 != null) {
                                r13.A00(view, A0i());
                                return;
                            }
                            throw C36331k8.A0d("galleryPartialPermissionProvider");
                        }
                        throw C36331k8.A0W();
                    }
                    throw C36331k8.A0d("caches");
                }
                throw C36331k8.A0W();
            }
            throw C36331k8.A0d("waContext");
        }
        throw C36321k7.A07();
    }

    private final void A00() {
        if (this.A04 == null) {
            ViewGroup A0P2 = C36411kG.A0P(A0d(), R.id.root);
            C36381kD.A0J(this).inflate(R.layout.f9nameremoved, A0P2);
            View findViewById = A0P2.findViewById(R.id.no_media);
            this.A04 = findViewById;
            if (findViewById != null) {
                C54342sn.A00(findViewById, this, new C84044Bs(this));
            }
        }
        C36361kB.A14(this.A04);
        C36331k8.A0y(this.A05);
    }

    public GalleryPickerFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C84064Bu(new C84054Bt(this)));
        C019308f A1A = C36441kJ.A1A(GalleryPickerViewModel.class);
        this.A0S = C36441kJ.A0a(new C84074Bv(A002), new AnonymousClass4GL(this, A002), new AnonymousClass4GK(A002), A1A);
    }

    public static final void A05(GalleryPickerFragment galleryPickerFragment, Collection collection) {
        C40761w4 r1;
        View view;
        if (galleryPickerFragment.A0h() != null && (r1 = galleryPickerFragment.A0G) != null) {
            AnonymousClass00C.A0D(collection, 0);
            r1.A00.addAll(collection);
            r1.A06();
            C20830yE r0 = galleryPickerFragment.A0B;
            if (r0 == null) {
                throw C36331k8.A0d("waPermissionsHelper");
            } else if (r0.A04() == C51512nw.DENIED) {
                galleryPickerFragment.A00();
            } else {
                C36331k8.A0y(galleryPickerFragment.A04);
                C40761w4 r02 = galleryPickerFragment.A0G;
                if (r02 == null || r02.A00.size() != 0) {
                    view = galleryPickerFragment.A05;
                } else {
                    WaTextView waTextView = galleryPickerFragment.A05;
                    if (waTextView != null) {
                        waTextView.setVisibility(0);
                    }
                    view = galleryPickerFragment.A04;
                }
                C36331k8.A0y(view);
            }
        }
    }

    public static final void A06(GalleryPickerFragment galleryPickerFragment, boolean z, boolean z2) {
        AnonymousClass01I A0h = galleryPickerFragment.A0h();
        if (A0h != null && !A0h.isFinishing()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GalleryPicker/");
            A0u.append(galleryPickerFragment.A00);
            A0u.append("/rebake unmounted:");
            A0u.append(z);
            A0u.append(" scanning:");
            A0u.append(z2);
            A0u.append(" old unmounted:");
            A0u.append(galleryPickerFragment.A0R);
            A0u.append(" old scanning:");
            C36331k8.A1S(A0u, galleryPickerFragment.A0Q);
            if (z != galleryPickerFragment.A0R || z2 != galleryPickerFragment.A0Q) {
                galleryPickerFragment.A0R = z;
                galleryPickerFragment.A0Q = z2;
                C36331k8.A1E(galleryPickerFragment.A0F);
                galleryPickerFragment.A0F = null;
                if (!galleryPickerFragment.A0R) {
                    C20830yE r0 = galleryPickerFragment.A0B;
                    if (r0 == null) {
                        throw C36331k8.A0d("waPermissionsHelper");
                    } else if (r0.A04() != C51512nw.DENIED) {
                        C36331k8.A0y(galleryPickerFragment.A05);
                        C36331k8.A0y(galleryPickerFragment.A04);
                        A03(galleryPickerFragment);
                        return;
                    }
                }
                galleryPickerFragment.A00();
            }
        }
    }

    public void A1J() {
        ImageView imageView;
        super.A1J();
        C36331k8.A1E(this.A0F);
        this.A0F = null;
        AnonymousClass3K8 r0 = this.A0I;
        if (r0 != null) {
            r0.A00();
        }
        this.A0I = null;
        C19630wG r02 = this.A0A;
        if (r02 != null) {
            Context context = r02.A00;
            BroadcastReceiver broadcastReceiver = this.A0N;
            if (broadcastReceiver == null) {
                throw C36331k8.A0d("mediaStorageStateReceiver");
            }
            context.unregisterReceiver(broadcastReceiver);
            C21060yb r03 = this.A08;
            if (r03 != null) {
                C21050ya A0O2 = r03.A0O();
                if (A0O2 != null) {
                    ContentObserver contentObserver = this.A0O;
                    if (contentObserver == null) {
                        throw C36331k8.A0d("mediaContentObserver");
                    }
                    C21050ya.A00(A0O2).unregisterContentObserver(contentObserver);
                }
                RecyclerView recyclerView = this.A0P;
                if (recyclerView != null) {
                    Iterator A12 = C36381kD.A12(recyclerView);
                    while (A12.hasNext()) {
                        View A0K2 = C36431kI.A0K(A12);
                        if (A0K2 instanceof FrameLayout) {
                            Iterator A122 = C36381kD.A12(A0K2);
                            while (A122.hasNext()) {
                                View A0K3 = C36431kI.A0K(A122);
                                if ((A0K3 instanceof SquareImageView) && (imageView = (ImageView) A0K3) != null) {
                                    imageView.setImageDrawable((Drawable) null);
                                }
                            }
                        }
                    }
                    this.A0G = null;
                    recyclerView.setAdapter((AnonymousClass0CZ) null);
                    AnonymousClass16L r04 = this.A06;
                    if (r04 != null) {
                        r04.A02().A02.A07(-1);
                        return;
                    }
                    throw C36331k8.A0d("caches");
                }
                return;
            }
            throw C36331k8.A0W();
        }
        throw C36331k8.A0d("waContext");
    }

    public void A1L() {
        super.A1L();
        AnonymousClass3GM r1 = this.A0E;
        if (r1 != null) {
            r1.A01(new C84034Br(this));
            return;
        }
        throw C36331k8.A0d("galleryPartialPermissionProvider");
    }
}
