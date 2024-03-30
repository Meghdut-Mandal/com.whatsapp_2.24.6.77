package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass3CG;
import X.AnonymousClass3U9;
import X.C011004s;
import X.C196089Xp;
import X.C207269up;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C40531vh;
import X.C41231ws;
import X.C41281wx;
import X.C429924c;
import X.C67693aK;
import X.C92024d0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;

public final class CatalogImageListActivity extends C429924c {
    public int A00;
    public int A01;
    public C207269up A02;
    public C196089Xp A03;
    public UserJid A04;

    public void onCreate(Bundle bundle) {
        boolean z = AnonymousClass3U9.A00;
        if (z) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        AnonymousClass3CG r1 = new AnonymousClass3CG(this);
        if (z) {
            Window window2 = getWindow();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            ChangeBounds changeBounds2 = new ChangeBounds();
            Context context = r1.A00;
            changeBounds.excludeTarget(C36401kF.A0o(context, R.string.f12nameremoved), true);
            changeBounds.excludeTarget(C36401kF.A0o(context, R.string.f12nameremoved), true);
            changeBounds2.excludeTarget(C36401kF.A0o(context, R.string.f12nameremoved), true);
            changeBounds2.excludeTarget(C36401kF.A0o(context, R.string.f12nameremoved), true);
            C92024d0 r2 = new C92024d0(this, r1, true);
            C92024d0 r6 = new C92024d0(this, r1, false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setDuration(220);
            transitionSet.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(r2);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setInterpolator(accelerateDecelerateInterpolator);
            transitionSet2.setDuration(240);
            transitionSet2.addTransition(changeBounds2);
            transitionSet2.addTransition(r6);
            window2.setSharedElementEnterTransition(transitionSet);
            window2.setSharedElementReturnTransition(transitionSet2);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade.setDuration(220);
            fade2.setDuration(240);
            window2.setEnterTransition(fade);
            window2.setReturnTransition(fade2);
            if (bundle == null) {
                A1p();
            }
        }
        C36361kB.A0C(this).setSystemUiVisibility(1792);
        C36391kE.A14(this);
        UserJid A022 = UserJid.Companion.A02(getIntent().getStringExtra("cached_jid"));
        if (A022 != null) {
            this.A04 = A022;
            Parcelable parcelableExtra = getIntent().getParcelableExtra("product");
            if (parcelableExtra != null) {
                this.A02 = (C207269up) parcelableExtra;
                this.A00 = getIntent().getIntExtra("image_index", 0);
                setContentView((int) R.layout.f9nameremoved);
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.catalog_image_list);
                AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) findViewById(R.id.catalog_image_list_toolbar));
                if (A0Q != null) {
                    A0Q.A0U(true);
                    C207269up r0 = this.A02;
                    if (r0 == null) {
                        throw C36331k8.A0d("product");
                    }
                    A0Q.A0Q(r0.A05);
                    C40531vh r02 = new C40531vh(this, new AnonymousClass3CG(this));
                    LinearLayoutManager A0T = C36431kI.A0T();
                    recyclerView.setAdapter(r02);
                    recyclerView.setLayoutManager(A0T);
                    C207269up r03 = this.A02;
                    if (r03 == null) {
                        throw C36331k8.A0d("product");
                    }
                    C41231ws r12 = new C41231ws(r03.A07.size(), C36391kE.A02(this));
                    recyclerView.A0t(r12);
                    C011004s.A07(recyclerView, new C67693aK(A0T, r12, this));
                    recyclerView.A0v(new C41281wx(A0Q, A0T, r12, this, C36391kE.A05(this), AnonymousClass00F.A00(this, R.color.f6nameremoved), C36391kE.A05(this)));
                    return;
                }
                throw AnonymousClass001.A09("Required value was null.");
            }
            throw AnonymousClass001.A09("Required value was null.");
        }
        throw AnonymousClass001.A09("Required value was null.");
    }

    public void onDestroy() {
        C196089Xp r0 = this.A03;
        if (r0 != null) {
            r0.A00();
            super.onDestroy();
            return;
        }
        throw C36331k8.A0d("loadSession");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
