package com.whatsapp.calling.favorite;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass141;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass3SF;
import X.AnonymousClass4F3;
import X.AnonymousClass4F4;
import X.C000800j;
import X.C001400p;
import X.C005502l;
import X.C007103b;
import X.C023509x;
import X.C18800tq;
import X.C18830tt;
import X.C229516p;
import X.C25141Fd;
import X.C27111My;
import X.C33311f5;
import X.C33521fV;
import X.C34701hV;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36411kG;
import X.C36441kJ;
import X.C50952mu;
import X.C53422rI;
import X.C62463Gg;
import X.C832348p;
import X.C832548r;
import X.C832648s;
import X.C89314Wb;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.util.ArrayList;
import java.util.List;

public final class FavoritePicker extends AnonymousClass27v {
    public C34701hV A00;
    public C005502l A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass00T A04;

    public void A3v(C62463Gg r8, AnonymousClass141 r9) {
        boolean z;
        TextEmojiLabel textEmojiLabel;
        int i;
        AnonymousClass00C.A0D(r8, 0);
        super.A3v(r8, r9);
        List list = ((FavoritePickerViewModel) this.A04.getValue()).A01;
        if (list != null) {
            z = C007103b.A0j(list, C36411kG.A0h(r9));
        } else {
            z = false;
        }
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass4F3(this, r9));
        View view = r8.A00;
        C33521fV.A01(view);
        if (z) {
            textEmojiLabel = r8.A02;
            i = R.string.f12nameremoved;
        } else if (C36331k8.A1b(A002)) {
            textEmojiLabel = r8.A02;
            i = R.string.f12nameremoved;
        } else if (r9.A0G()) {
            C33311f5.A00(this).A00(new FavoritePicker$updateGroupSubtitleWithMembers$1(this, r8, r9, (C023509x) null));
            return;
        } else {
            TextEmojiLabel textEmojiLabel2 = r8.A02;
            if (TextUtils.isEmpty(textEmojiLabel2.getText())) {
                textEmojiLabel2.setVisibility(8);
                return;
            }
            return;
        }
        textEmojiLabel.setText(i);
        r8.A01.setEnabled(false);
        textEmojiLabel.setTypeface((Typeface) null, 2);
        textEmojiLabel.setVisibility(0);
        AnonymousClass3SF r2 = r8.A03;
        r2.A01.setTextColor(AnonymousClass00F.A00(this, R.color.f6nameremoved));
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
        view.setFocusable(true);
    }

    public void A42(ArrayList arrayList) {
        AnonymousClass00C.A0D(arrayList, 0);
        C229516p.A0G(this.A09.A05, arrayList, 5, false, false, false);
    }

    public void A46(List list) {
        WDSSearchView wDSSearchView;
        super.A46(list);
        if (this.A03) {
            this.A03 = false;
            WDSSearchBar wDSSearchBar = this.A0M;
            if (wDSSearchBar != null && (wDSSearchView = wDSSearchBar.A07) != null) {
                C53422rI.A00(wDSSearchView, new C832348p(this));
            }
        }
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A00 = (C34701hV) r1.A88.get();
            this.A01 = C25141Fd.A00();
        }
    }

    public FavoritePicker(int i) {
        this.A02 = false;
        C89314Wb.A00(this, 40);
    }

    public void onCreate(Bundle bundle) {
        WDSSearchView wDSSearchView;
        super.onCreate(bundle);
        if (bundle == null) {
            this.A03 = true;
        }
        WDSSearchBar wDSSearchBar = this.A0M;
        if (!(wDSSearchBar == null || (wDSSearchView = wDSSearchBar.A07) == null)) {
            wDSSearchView.setTrailingButtonIcon(C50952mu.A00);
        }
        List list = this.A0c;
        AnonymousClass00C.A07(list);
        ((FavoritePickerViewModel) this.A04.getValue()).A0S(list);
    }

    public FavoritePicker() {
        this(0);
        this.A04 = C36441kJ.A0a(new C832648s(this), new C832548r(this), new AnonymousClass4F4(this), C36441kJ.A1A(FavoritePickerViewModel.class));
    }
}
