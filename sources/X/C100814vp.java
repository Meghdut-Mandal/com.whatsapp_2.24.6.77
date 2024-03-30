package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

/* renamed from: X.4vp  reason: invalid class name and case insensitive filesystem */
public abstract class C100814vp extends C100824vq {
    public AnonymousClass18U A00;
    public AnonymousClass179 A01;
    public C21060yb A02;
    public AnonymousClass12U A03;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A01(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        if (!this.A03.A03() && this.A03.A00() != 2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("settings/resume/wrong-state ");
            C36321k7.A1Y(A0u, this.A03.A00());
            startActivity(AnonymousClass190.A09(this));
            finish();
        }
        if (Build.VERSION.SDK_INT < 23 || !this.A00.A06()) {
            this.A00.A02(false);
            return;
        }
        Intent className = C36431kI.A0D().setClassName(getPackageName(), "com.whatsapp.authentication.AppAuthenticationActivity");
        className.setFlags(C132986Wc.A0F);
        if (!this.A03) {
            this.A00 = className;
            this.A02 = 202;
        } else {
            startActivityForResult(className, 202);
        }
        overridePendingTransition(0, 0);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }
}
