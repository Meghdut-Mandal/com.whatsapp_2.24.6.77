package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.01L  reason: invalid class name */
public class AnonymousClass01L extends AnonymousClass01I implements AnonymousClass01J, AnonymousClass01K {
    public static final String A02 = "androidx:appcompat";
    public Resources A00;
    public C002300y A01;

    public static void A08() {
    }

    @Deprecated
    public static void A09() {
    }

    @Deprecated
    public static void A0A() {
    }

    @Deprecated
    public static void A0B() {
    }

    public static void A0C() {
    }

    @Deprecated
    public void A26() {
    }

    public void A27() {
    }

    @Deprecated
    public void A2C(boolean z) {
    }

    public void Bih(AnonymousClass0V9 r1) {
    }

    public void Bii(AnonymousClass0V9 r1) {
    }

    private void A01() {
        this.A07.A01.A03(new C18640tU(this, 1), A02);
        A1e(new C18280su(this, 1));
    }

    private boolean A0F(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public C002300y A23() {
        C002300y r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass02U r02 = new AnonymousClass02U(this, (Window) null, this, this);
        this.A01 = r02;
        return r02;
    }

    public Resources getResources() {
        Resources resources = this.A00;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public AnonymousClass01L(int i) {
        super(i);
        A01();
    }

    private void A07() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        AnonymousClass00C.A0D(decorView, 0);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public static boolean A0E(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public void A1o() {
        A23().A0I();
    }

    public void A24() {
        new AnonymousClass0SF((AnonymousClass02U) A23());
    }

    public void A28(int i) {
        A23().A0T(i);
    }

    public boolean A2D() {
        Intent A002 = AnonymousClass050.A00(this);
        if (A002 == null) {
            return false;
        }
        if (A0E(this, A002)) {
            C10950fU r0 = new C10950fU(this);
            r0.A03(this);
            r0.A02();
            try {
                AnonymousClass0XN.A00(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            A0D(this, A002);
            return true;
        }
    }

    public AnonymousClass0V9 But(C021809f r2) {
        return A23().A0G(r2);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A07();
        A23().A0P(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(A23().A0E(context));
    }

    public void closeOptionsMenu() {
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.A04()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.A07(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public View findViewById(int i) {
        AnonymousClass02U r0 = (AnonymousClass02U) A23();
        AnonymousClass02U.A0A(r0);
        return r0.A0A.findViewById(i);
    }

    public MenuInflater getMenuInflater() {
        Context context;
        AnonymousClass02U r2 = (AnonymousClass02U) A23();
        MenuInflater menuInflater = r2.A07;
        if (menuInflater != null) {
            return menuInflater;
        }
        AnonymousClass02U.A0B(r2);
        AnonymousClass07B r0 = r2.A0C;
        if (r0 != null) {
            context = r0.A0A();
        } else {
            context = r2.A0i;
        }
        AnonymousClass0EG r1 = new AnonymousClass0EG(context);
        r2.A07 = r1;
        return r1;
    }

    public AnonymousClass07B getSupportActionBar() {
        AnonymousClass02U r0 = (AnonymousClass02U) A23();
        AnonymousClass02U.A0B(r0);
        return r0.A0C;
    }

    public void invalidateOptionsMenu() {
        A23().A0I();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A00 != null) {
            this.A00.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A23().A0M(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        A23().A0J();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A0F(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.A09() & 4) == 0) {
            return false;
        }
        return A2D();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        AnonymousClass02U.A0A((AnonymousClass02U) A23());
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass02U r0 = (AnonymousClass02U) A23();
        AnonymousClass02U.A0B(r0);
        AnonymousClass07B r1 = r0.A0C;
        if (r1 != null) {
            r1.A0Y(true);
        }
    }

    public void onStart() {
        super.onStart();
        AnonymousClass02U r1 = (AnonymousClass02U) A23();
        r1.A0Y = true;
        AnonymousClass02U.A0C(r1, true);
    }

    public void onStop() {
        super.onStop();
        A23().A0K();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A23().A0S(charSequence);
    }

    public void openOptionsMenu() {
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.A06()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A07();
        A23().A0Q(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A23().A0R(toolbar);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        ((AnonymousClass02U) A23()).A04 = i;
    }

    public void A29(Intent intent) {
        A0D(this, intent);
    }

    public void A2A(Intent intent) {
        A0E(this, intent);
    }

    public void A2B(C10950fU r1) {
        r1.A03(this);
    }

    public static void A0D(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void A25() {
        AnonymousClass050.A00(this);
    }

    public void onContentChanged() {
        A26();
    }

    public AnonymousClass01L() {
        A01();
    }

    public void setContentView(int i) {
        A07();
        A23().A0L(i);
    }

    public void setContentView(View view) {
        A07();
        A23().A0O(view);
    }
}
