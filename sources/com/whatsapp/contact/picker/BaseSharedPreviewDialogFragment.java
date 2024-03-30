package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.C177528dw;
import X.C18740tg;
import X.C20690y0;
import X.C21060yb;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C55782vB;
import X.C66943Xx;
import X.C87554Pg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseSharedPreviewDialogFragment extends Hilt_BaseSharedPreviewDialogFragment {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public RelativeLayout A03;
    public C20690y0 A04;
    public AnonymousClass17Y A05;
    public AnonymousClass16D A06;
    public AnonymousClass171 A07;
    public C21060yb A08;
    public WebPagePreviewView A09;
    public List A0A;
    public ImageButton A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public C87554Pg A0E;
    public EmojiSearchContainer A0F;

    public void A1P(Bundle bundle) {
        this.A0Y = true;
        Toolbar toolbar = (Toolbar) this.A00.findViewById(R.id.toolbar);
        C36341k9.A0q(A0i(), toolbar, C36441kJ.A04(A0i()));
        toolbar.A0J(A0h(), R.style.f13nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        C36331k8.A0s(A0h(), toolbar, this.A01, R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new C66943Xx(this, 34));
        toolbar.setNavigationContentDescription((int) R.string.f12nameremoved);
        Window window = this.A02.getWindow();
        C18740tg.A06(window);
        window.clearFlags(67108864);
        window.setStatusBarColor(C36351kA.A01(A0h(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public void A1M() {
        Dialog dialog = this.A02;
        if (dialog != null) {
            Window window = dialog.getWindow();
            C18740tg.A06(window);
            window.setLayout(-1, -1);
            C36371kC.A1G(dialog.getWindow(), -16777216);
            dialog.getWindow().getAttributes().windowAnimations = R.style.f13nameremoved;
        }
        super.A1M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1k() {
        /*
            r3 = this;
            android.widget.RelativeLayout r0 = r3.A03
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r3.A09
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            r1 = 2131168332(0x7f070c4c, float:1.7950963E38)
            if (r0 == 0) goto L_0x0016
        L_0x0013:
            r1 = 2131168333(0x7f070c4d, float:1.7950965E38)
        L_0x0016:
            android.content.res.Resources r0 = X.C36341k9.A0G(r3)
            int r1 = r0.getDimensionPixelSize(r1)
            r2.height = r1
            android.widget.RelativeLayout r0 = r3.A03
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x002d
            android.widget.RelativeLayout r0 = r3.A03
            r0.setLayoutParams(r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment.A1k():void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C87554Pg r1 = this.A0E;
        if (r1 != null) {
            ((ContactPicker) r1).A06 = null;
        }
        super.onDismiss(dialogInterface);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0u;
        this.A00 = C36381kD.A0J(this).inflate(R.layout.f9nameremoved, viewGroup, false);
        A10(true);
        A1d(2, 0);
        this.A0C = C36441kJ.A0U(this.A00, R.id.top_layout);
        this.A0D = C36441kJ.A0U(this.A00, R.id.view_placeholder);
        this.A03 = (RelativeLayout) this.A00.findViewById(R.id.footer);
        this.A0B = (ImageButton) this.A00.findViewById(R.id.send);
        this.A02 = C36411kG.A0P(this.A00, R.id.web_page_preview_container);
        this.A01 = this.A00.findViewById(R.id.link_preview_divider);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00.findViewById(R.id.emoji_search_container);
        this.A0F = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            if (A0a instanceof C177528dw) {
                A0u = A0n(R.string.f12nameremoved);
            } else {
                A0u = C36381kD.A0u(this.A06, this.A07, A0a);
            }
            A0I.add(0, A0u);
        }
        C36401kF.A0P(this.A00, R.id.recipients).A0I(C55782vB.A00(this.A07.A02, A0I, false));
        A1k();
        return this.A00;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        if (!(A0h() instanceof C87554Pg)) {
            throw new RuntimeException("Activity must implement BaseSharedPreviewDialogFragment.Host");
        }
    }

    public void A1T(Menu menu) {
        menu.findItem(R.id.menuitem_search).setVisible(false);
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A1b();
        return true;
    }

    public Dialog A1a(Bundle bundle) {
        ArrayList<String> stringArrayList = A0b().getStringArrayList("jids");
        C18740tg.A07(stringArrayList, "null jids");
        this.A0A = AnonymousClass143.A06(AnonymousClass11F.class, stringArrayList);
        C87554Pg r0 = (C87554Pg) A0h();
        this.A0E = r0;
        if (r0 != null) {
            ((ContactPicker) r0).A06 = this;
        }
        A1d(0, R.style.f13nameremoved);
        return super.A1a(bundle);
    }
}
