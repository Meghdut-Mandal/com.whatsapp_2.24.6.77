package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass12T;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1Ax;
import X.AnonymousClass1S3;
import X.AnonymousClass4TA;
import X.C007403e;
import X.C011004s;
import X.C012005e;
import X.C023509x;
import X.C02680Bk;
import X.C109325Xd;
import X.C145646uI;
import X.C18740tg;
import X.C18820ts;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20810yC;
import X.C20830yE;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C36691l9;
import X.C40611vp;
import X.C40981wQ;
import X.C49842jm;
import X.C49982k0;
import X.C51512nw;
import X.C66033Uk;
import X.C90394a5;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.gallery.viewmodel.GalleryViewModel;
import com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public abstract class GalleryFragmentBase extends Hilt_GalleryFragmentBase implements AnonymousClass4TA {
    public int A00 = -1;
    public View A01;
    public RecyclerView A02;
    public C19970wo A03;
    public C20830yE A04;
    public C18820ts A05;
    public C20310xM A06;
    public AnonymousClass16J A07;
    public AnonymousClass12T A08;
    public C20810yC A09;
    public C40981wQ A0A;
    public C49982k0 A0B;
    public GalleryViewModel A0C;
    public AnonymousClass11F A0D;
    public AnonymousClass1S3 A0E;
    public AnonymousClass1A1 A0F;
    public C19770wU A0G;
    public View A0H;
    public C49842jm A0I;
    public String A0J = "";
    public final String A0K;
    public final ArrayList A0L = AnonymousClass001.A0I();
    public final AnonymousClass191 A0M = C90394a5.A00(this, 20);

    public static int A03(GalleryFragmentBase galleryFragmentBase) {
        View view = galleryFragmentBase.A0F;
        if (view == null) {
            return -1;
        }
        int height = (view.getHeight() / C36341k9.A0G(galleryFragmentBase).getDimensionPixelSize(R.dimen.f7nameremoved)) + 1;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(galleryFragmentBase.A0K);
        C36321k7.A1T("/approxScreenItemCount ", A0u, height);
        return height;
    }

    public static void A05(GalleryFragmentBase galleryFragmentBase) {
        if (galleryFragmentBase.A0C != null) {
            int A032 = A03(galleryFragmentBase);
            if (A032 > -1) {
                C145646uI r2 = new C145646uI(galleryFragmentBase.A0a(), galleryFragmentBase.A05);
                GalleryViewModel galleryViewModel = galleryFragmentBase.A0C;
                String str = galleryFragmentBase.A0K;
                AnonymousClass1S3 r4 = galleryFragmentBase.A0E;
                ArrayList arrayList = galleryFragmentBase.A0L;
                C40611vp r8 = new C40611vp(galleryFragmentBase, 9);
                C36321k7.A0w(str, r4);
                AnonymousClass00C.A0D(arrayList, 4);
                C02680Bk r0 = galleryViewModel.A00;
                if (r0 != null) {
                    r0.A03();
                }
                galleryViewModel.A00 = null;
                C007403e r02 = galleryViewModel.A01;
                if (r02 != null) {
                    r02.B2S((CancellationException) null);
                }
                galleryViewModel.A01 = C36391kE.A12(new GalleryViewModel$loadData$1(r2, galleryViewModel, r4, str, arrayList, (C023509x) null, r8, A032), C109325Xd.A00(galleryViewModel));
                return;
            }
            return;
        }
        C49842jm r1 = galleryFragmentBase.A0I;
        if (r1 != null) {
            r1.A0D(true);
            synchronized (r1) {
                C02680Bk r03 = r1.A00;
                if (r03 != null) {
                    r03.A03();
                }
            }
        }
        C49982k0 r04 = galleryFragmentBase.A0B;
        if (r04 != null) {
            r04.A0G();
        }
        C49842jm r12 = new C49842jm(galleryFragmentBase, galleryFragmentBase.A0D, galleryFragmentBase.A0E);
        galleryFragmentBase.A0I = r12;
        C36331k8.A1F(r12, galleryFragmentBase.A0G);
    }

    public static void A06(GalleryFragmentBase galleryFragmentBase) {
        if (galleryFragmentBase.A00 == -1) {
            return;
        }
        if (galleryFragmentBase.A04.A04() == C51512nw.DENIED || galleryFragmentBase.A00 <= 0) {
            galleryFragmentBase.A0H.setVisibility(0);
            galleryFragmentBase.A02.setVisibility(8);
            return;
        }
        galleryFragmentBase.A0H.setVisibility(8);
        galleryFragmentBase.A02.setVisibility(0);
    }

    public void A1S(Bundle bundle, View view) {
        this.A0E = new AnonymousClass1S3(this.A05);
        C20810yC r1 = this.A09;
        AnonymousClass00C.A0D(r1, 0);
        if (AnonymousClass1Ax.A03(r1, 6789)) {
            GalleryViewModel galleryViewModel = (GalleryViewModel) C36441kJ.A0b(this).A00(GalleryViewModel.class);
            this.A0C = galleryViewModel;
            C66033Uk.A00(A0m(), galleryViewModel.A03, this, 44);
        }
        AnonymousClass11F A0F2 = C36331k8.A0F(A0i());
        C18740tg.A06(A0F2);
        this.A0D = A0F2;
        this.A0H = view.findViewById(16908292);
        this.A02 = C36441kJ.A0c(view, R.id.grid);
        this.A01 = C012005e.A02(view, R.id.progress_bar);
        C011004s.A09(this.A02, true);
        C011004s.A09(C012005e.A02(view, 16908292), true);
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof MediaGalleryActivity) {
            this.A02.A0v(((MediaGalleryActivity) A0h).A0l);
        }
        this.A07.registerObserver(this.A0M);
        View view2 = this.A01;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        A05(this);
    }

    public Cursor A1Z(C02680Bk r5, AnonymousClass11F r6, AnonymousClass1S3 r7) {
        if (this instanceof LinksGalleryFragment) {
            return ((LinksGalleryFragment) this).A07.BE9(r5, r6, r7);
        }
        DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
        return new C36691l9(documentsGalleryFragment.A04.BE9(r5, r6, r7), (C20810yC) null, r6, documentsGalleryFragment.A0F);
    }

    public void Bfy(AnonymousClass1S3 r3) {
        if (!TextUtils.equals(this.A0J, r3.A02())) {
            this.A0J = r3.A02();
            this.A0E = r3;
            A05(this);
        }
    }

    public void Bg9() {
        this.A0A.A06();
    }

    public GalleryFragmentBase(String str) {
        this.A0K = str;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1H() {
        super.A1H();
        this.A07.unregisterObserver(this.A0M);
        Cursor A0L2 = this.A0A.A0L((Cursor) null);
        if (A0L2 != null) {
            A0L2.close();
        }
        C49982k0 r0 = this.A0B;
        if (r0 != null) {
            r0.A0G();
            this.A0B = null;
        }
        C49842jm r1 = this.A0I;
        if (r1 != null) {
            r1.A0D(true);
            synchronized (r1) {
                C02680Bk r02 = r1.A00;
                if (r02 != null) {
                    r02.A03();
                }
            }
            this.A0I = null;
        }
    }

    public void A1L() {
        super.A1L();
        A06(this);
    }
}
