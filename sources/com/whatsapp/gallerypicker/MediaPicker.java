package com.whatsapp.gallerypicker;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass0PG;
import X.AnonymousClass0V9;
import X.AnonymousClass1RC;
import X.AnonymousClass3U9;
import X.C1270866x;
import X.C18950u5;
import X.C19430v1;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C430224o;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

public class MediaPicker extends C430224o {
    public C1270866x A00;
    public AnonymousClass005 A01;

    public void Bih(AnonymousClass0V9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        super.Bih(r2);
        C36331k8.A0n(this);
    }

    public void Bii(AnonymousClass0V9 r3) {
        AnonymousClass00C.A0D(r3, 0);
        super.Bii(r3);
        AnonymousClass1RC.A09(getWindow(), false);
        C36341k9.A0n(this);
    }

    public void onCreate(Bundle bundle) {
        A28(5);
        if (AnonymousClass3U9.A00) {
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            window.setEnterTransition(inflateTransition);
            window.setReturnTransition(inflateTransition2);
            A1p();
        }
        C36331k8.A0n(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        Toolbar toolbar = (Toolbar) C36361kB.A0D(this, R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved));
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        ViewGroup viewGroup = (ViewGroup) C36361kB.A0D(this, R.id.mainLayout);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.content);
        if (bundle == null) {
            viewGroup.addView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            int id = frameLayout.getId();
            AnonymousClass005 r0 = this.A01;
            if (r0 != null) {
                A0O.A0A((AnonymousClass02E) r0.get(), id);
                A0O.A01();
                View view = new View(this);
                C36341k9.A0q(view.getContext(), view, R.color.f6nameremoved);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.ceil((double) (C36361kB.A0B(view).density / ((float) 2)))));
                frameLayout.addView(view);
                return;
            }
            throw C36331k8.A0d("mediaPickerFragment");
        }
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass02E A0L = getSupportFragmentManager().A0L(R.id.content);
        if (A0L != null) {
            A0L.A1N(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3U9.A07(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        C1270866x r2 = this.A00;
        if (r2 != null) {
            r2.A02(64, 1, 1);
            AnonymousClass0PG.A00(this);
            return true;
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }
}
