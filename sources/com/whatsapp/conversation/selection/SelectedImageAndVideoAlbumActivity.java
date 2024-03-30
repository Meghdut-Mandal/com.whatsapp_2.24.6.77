package com.whatsapp.conversation.selection;

import X.AnonymousClass001;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass2Jf;
import X.AnonymousClass2bU;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C43922Kk;
import X.C53102qm;
import X.C61333Bl;
import X.C64933Qa;
import X.C66033Uk;
import X.C89334Wd;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SelectedImageAndVideoAlbumActivity extends C43922Kk {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public AnonymousClass2Jf A02;
    public SelectedImageAlbumViewModel A03;
    public boolean A04;

    public static final AnonymousClass2bU A01(SelectedImageAndVideoAlbumActivity selectedImageAndVideoAlbumActivity) {
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = selectedImageAndVideoAlbumActivity.A03;
        if (selectedImageAlbumViewModel == null) {
            throw C36331k8.A0d("selectedImageAlbumViewModel");
        }
        List A0w = C36401kF.A0w(selectedImageAlbumViewModel.A00);
        if (A0w == null || A0w.isEmpty()) {
            return null;
        }
        return (AnonymousClass2bU) C36391kE.A0t(A0w);
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A04 = C36401kF.A0X(r1);
            this.A01 = (C61333Bl) A0L.A16.get();
            this.A00 = C36341k9.A0R(r2);
            this.A01 = C36341k9.A0S(r2);
            this.A02 = C27111My.A1p(A0L);
        }
    }

    public SelectedImageAndVideoAlbumActivity(int i) {
        this.A04 = false;
        C89334Wd.A00(this, 4);
    }

    public void onCreate(Bundle bundle) {
        ArrayList A05;
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
        if (bundleExtra == null) {
            A05 = null;
        } else {
            A05 = AnonymousClass3UJ.A05(bundleExtra);
        }
        if (A05 == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = (SelectedImageAlbumViewModel) C36441kJ.A0b(this).A00(SelectedImageAlbumViewModel.class);
        this.A03 = selectedImageAlbumViewModel;
        if (selectedImageAlbumViewModel == null) {
            throw C36331k8.A0d("selectedImageAlbumViewModel");
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                selectedImageAlbumViewModel.A00.A0D(A0I);
                selectedImageAlbumViewModel.A01.registerObserver(selectedImageAlbumViewModel.A03.getValue());
                break;
            }
            AnonymousClass3T1 A032 = selectedImageAlbumViewModel.A02.A03((C64933Qa) it.next());
            if (!(A032 instanceof AnonymousClass2bU)) {
                break;
            }
            A0I.add(A032);
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel2 = this.A03;
        if (selectedImageAlbumViewModel2 == null) {
            throw C36331k8.A0d("selectedImageAlbumViewModel");
        }
        C66033Uk.A00(this, selectedImageAlbumViewModel2.A00, C53102qm.A02(this, 22), 20);
    }

    public SelectedImageAndVideoAlbumActivity() {
        this(0);
    }
}
