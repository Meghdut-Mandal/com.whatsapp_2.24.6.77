package com.whatsapp.stickers.store;

import X.AnonymousClass0I4;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1AP;
import X.AnonymousClass1BB;
import X.AnonymousClass1BF;
import X.AnonymousClass1HA;
import X.AnonymousClass5KZ;
import X.AnonymousClass68B;
import X.AnonymousClass6CW;
import X.AnonymousClass6O1;
import X.C012005e;
import X.C129156Fn;
import X.C162897pK;
import X.C164757sK;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C23871Ae;
import X.C24121Be;
import X.C33511fU;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import X.C606038m;
import X.C67103Yn;
import X.C81183wb;
import X.C81203wd;
import X.C90504aG;
import X.C95704m6;
import X.C96124mp;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.List;

public abstract class StickerStoreTabFragment extends Hilt_StickerStoreTabFragment {
    public int A00;
    public View A01;
    public LinearLayoutManager A02;
    public RecyclerView A03;
    public AnonymousClass17Y A04;
    public C19730wQ A05;
    public C18820ts A06;
    public AnonymousClass6O1 A07;
    public C20810yC A08;
    public AnonymousClass190 A09;
    public AnonymousClass1BF A0A;
    public C24121Be A0B;
    public AnonymousClass1HA A0C;
    public AnonymousClass1BB A0D;
    public AnonymousClass1AP A0E;
    public StickerPackDownloader A0F;
    public C96124mp A0G;
    public C19770wU A0H;
    public List A0I;
    public LayoutInflater A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0K = new C164757sK(this, 23);
    public final C129156Fn A0L = new C162897pK(this, 4);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        this.A0J = layoutInflater;
        boolean z = this instanceof StickerStoreMyTabFragment;
        if (z) {
            i = R.layout.f9nameremoved;
        } else {
            i = R.layout.f9nameremoved;
        }
        View A0E2 = C36361kB.A0E(layoutInflater, viewGroup, i);
        this.A03 = C90504aG.A0J(A0E2, R.id.store_recycler_view);
        this.A01 = C012005e.A02(A0E2, R.id.store_progress);
        A1D();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A02 = linearLayoutManager;
        linearLayoutManager.A1f(1);
        this.A03.setLayoutManager(this.A02);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0K);
        this.A03.setNestedScrollingEnabled(true);
        this.A0D.registerObserver(this.A0L);
        if (z) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment.A00 = A0E2.findViewById(R.id.empty);
            TextView A0P = C36391kE.A0P(A0E2, R.id.get_stickers_button);
            C33511fU.A03(A0P);
            C67103Yn.A00(A0P, stickerStoreMyTabFragment, 22);
        } else {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment.A00 = A0E2.findViewById(R.id.empty);
            View A022 = C012005e.A02(A0E2, R.id.floating_discover_third_party_app_button);
            stickerStoreFeaturedTabFragment.A01 = A022;
            A022.setVisibility(0);
            C36421kH.A0z(stickerStoreFeaturedTabFragment.A01, stickerStoreFeaturedTabFragment, R.string.f12nameremoved);
            C67103Yn.A00(stickerStoreFeaturedTabFragment.A01, stickerStoreFeaturedTabFragment, 21);
            if (stickerStoreFeaturedTabFragment.A1c()) {
                C23871Ae r2 = stickerStoreFeaturedTabFragment.A04;
                r2.A02 = C36361kB.A0l();
                r2.A00 = 3;
            }
            stickerStoreFeaturedTabFragment.A03.A0v(stickerStoreFeaturedTabFragment.A08);
        }
        A1a();
        if (z) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment2 = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment2.A04 = false;
            AnonymousClass0I4 r1 = new AnonymousClass0I4(new C95704m6(stickerStoreMyTabFragment2));
            stickerStoreMyTabFragment2.A01 = r1;
            r1.A0D(stickerStoreMyTabFragment2.A03);
            stickerStoreMyTabFragment2.A01.postDelayed(new C81183wb(stickerStoreMyTabFragment2, 5), 300);
        } else {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment2 = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment2.A01.setVisibility(0);
            if (!stickerStoreFeaturedTabFragment2.A06) {
                stickerStoreFeaturedTabFragment2.A07 = true;
                C606038m r4 = stickerStoreFeaturedTabFragment2.A05;
                r4.A03.Boy(new C81203wd(r4, new AnonymousClass5KZ(stickerStoreFeaturedTabFragment2), 14));
                return A0E2;
            }
        }
        return A0E2;
    }

    public void A1J() {
        this.A03.getViewTreeObserver().removeGlobalOnLayoutListener(this.A0K);
        AnonymousClass1AP r2 = this.A0E;
        AnonymousClass6CW r0 = r2.A00;
        if (r0 != null) {
            r0.A02.A02(false);
            r2.A00 = null;
        }
        AnonymousClass1HA r02 = this.A0C;
        if (r02 != null) {
            r02.A06();
        }
        this.A0D.unregisterObserver(this.A0L);
        super.A1J();
    }

    public void A1Z() {
        if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A06) {
                stickerStoreFeaturedTabFragment.A07 = true;
                C606038m r4 = stickerStoreFeaturedTabFragment.A05;
                r4.A03.Boy(new C81203wd(r4, new AnonymousClass5KZ(stickerStoreFeaturedTabFragment), 14));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.A0J() != 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1a() {
        /*
            r3 = this;
            X.4mp r0 = r3.A0G
            if (r0 == 0) goto L_0x000b
            int r0 = r0.A0J()
            r2 = 1
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x001f
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r1
            android.view.View r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
        L_0x001e:
            return
        L_0x001f:
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r1
            android.view.View r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.StickerStoreTabFragment.A1a():void");
    }

    public void A1b(AnonymousClass68B r6, int i) {
        String str;
        AnonymousClass6O1 r2 = this.A07;
        boolean z = this instanceof StickerStoreMyTabFragment;
        int i2 = 1;
        if (z) {
            i2 = 7;
        }
        AnonymousClass6O1.A01(r2, 33, 1, i2);
        Context A1D = A1D();
        String str2 = r6.A0F;
        if (z) {
            str = "sticker_store_my_tab";
        } else {
            str = "sticker_store_featured_tab";
        }
        A0i().startActivityForResult(AnonymousClass190.A1D(A1D, str2, str), 1);
    }

    public boolean A1c() {
        if (this.A05.A0L() || !this.A08.A0E(1396)) {
            return false;
        }
        return true;
    }
}
