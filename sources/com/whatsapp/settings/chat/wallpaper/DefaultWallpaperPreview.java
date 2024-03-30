package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass3U7;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import X.C47212e0;
import X.C89004Uw;
import X.C89364Wg;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public class DefaultWallpaperPreview extends C47212e0 {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36341k9.A0R(A0B);
            this.A02 = C36341k9.A0S(A0B);
        }
    }

    public DefaultWallpaperPreview(int i) {
        this.A00 = false;
        C89364Wg.A00(this, 36);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36431kI.A0P(this, R.id.wallpaper_preview_default_view).setImageDrawable(AnonymousClass3U7.A02(this, getResources()));
        ((WallpaperMockChatView) C03570Gk.A0B(this, R.id.wallpaper_preview_default_chat_view)).setMessages(getString(R.string.f12nameremoved), A3i(), (C89004Uw) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public DefaultWallpaperPreview() {
        this(0);
    }
}
