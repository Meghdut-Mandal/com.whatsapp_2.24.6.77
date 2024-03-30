package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.155  reason: invalid class name */
public class AnonymousClass155 extends C225514w implements C225714y, C225814z {
    public int A00 = 0;
    public C24801Dv A01;
    public C19730wQ A02;
    public AnonymousClass1N5 A03;
    public AnonymousClass1N3 A04;
    public AnonymousClass18U A05;
    public AnonymousClass179 A06;
    public C19970wo A07;
    public C20060wx A08;
    public AnonymousClass13P A09;
    public AnonymousClass12U A0A;
    public AnonymousClass1G4 A0B;
    public AnonymousClass1N2 A0C;
    public boolean A0D = false;
    public boolean A0E = true;
    public boolean A0F;
    public final Set A0G = new CopyOnWriteArraySet();

    public static boolean A0R(KeyEvent keyEvent, AnonymousClass155 r2, int i) {
        if (i == 4) {
            r2.A0F = false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public /* synthetic */ void A3b(Integer num) {
        Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
        className.putExtra("blocking_type", 1);
        if (num.intValue() == 1) {
            finish();
            startActivity(className);
        }
    }

    public boolean A3e() {
        return false;
    }

    public boolean A3f(int i, KeyEvent keyEvent) {
        if (i != 82 || !this.A0F) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A0F = true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public void A2X() {
        this.A03.A00.A01();
    }

    public boolean A2g() {
        return C20800yB.A01(C21000yV.A02, this.A0D, 3858);
    }

    public void A3T() {
        int A002 = this.A0A.A00();
        C19730wQ r0 = this.A02;
        r0.A0G();
        if (r0.A00 == null && A002 == 11 && !isFinishing()) {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity");
            intent.setFlags(33554432);
            startActivity(intent);
            finish();
        }
    }

    public void A3U() {
        if (this.A09.BC2() == 1 || this.A09.BC2() == 4 || this.A09.BC2() == 3) {
            Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
            className.putExtra("blocking_type", 1);
            finish();
            startActivity(className);
        } else if (this.A09.BC2() == 0) {
            AnonymousClass13P r2 = this.A09;
            ((AnonymousClass13O) r2).A00.A08(this, new C36201jv(this, 3));
        }
    }

    public /* synthetic */ void A3W() {
        C19420v0.A00(this.A09).putBoolean("smb_client_viewed_eu_tos_update", true).apply();
        this.A01.A06(this, new Intent("android.intent.action.VIEW", this.A04.A00(((SharedPreferences) this.A09.A00.get()).getString("smb_eu_tos_update_url", (String) null))));
    }

    public void A3Z(AnonymousClass4P8 r3) {
        synchronized (this.A0G) {
            this.A0G.add(r3);
        }
    }

    public void A3a(AnonymousClass4P8 r3) {
        synchronized (this.A0G) {
            this.A0G.remove(r3);
        }
    }

    public boolean A3d() {
        return this.A05.A04();
    }

    public void Bvu(List list) {
        int i;
        boolean contains = list.contains(C177528dw.A00);
        if (list.size() == 1) {
            i = R.string.f12nameremoved;
            if (contains) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
            if (contains) {
                i = R.string.f12nameremoved;
            }
        }
        this.A05.A06(i, 1);
    }

    public void onDestroy() {
        this.A0G.clear();
        super.onDestroy();
    }

    public void setTheme(int i) {
        this.A00 = i;
        super.setTheme(i);
    }

    public AnonymousClass155(int i) {
        super(i);
    }

    private void A0O() {
        getResources().getConfiguration().fontScale = getApplicationContext().getResources().getConfiguration().fontScale;
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }

    private boolean A0Q() {
        if (getApplicationContext().getResources().getConfiguration().fontScale == getResources().getConfiguration().fontScale) {
            return true;
        }
        return false;
    }

    public Dialog A3K(int i) {
        return super.onCreateDialog(i);
    }

    public void A3L() {
    }

    public void A3M() {
    }

    public void A3N() {
    }

    public void A3O() {
        super.onBackPressed();
    }

    public void A3P() {
        super.onResume();
    }

    public void A3Q() {
        super.onStart();
    }

    @Deprecated
    public void A3R() {
    }

    public void A3S() {
    }

    public void A3V() {
    }

    public boolean A3g(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean A3h(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public /* bridge */ /* synthetic */ AnonymousClass04G BAw() {
        return super.BAw();
    }

    public /* synthetic */ C18950u5 BGv() {
        return C19430v1.A03;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
        this.A0D = true;
    }

    public C24801Dv getActivityUtils() {
        return this.A01;
    }

    public AnonymousClass1N2 getImeUtils() {
        return this.A0C;
    }

    public C19730wQ getMeManager() {
        return this.A02;
    }

    public AnonymousClass12U getRegistrationStateManager() {
        return this.A0A;
    }

    public AnonymousClass1G4 getScreenLockStateProvider() {
        return this.A0B;
    }

    public C20060wx getStorageUtils() {
        return this.A08;
    }

    public C19970wo getTime() {
        return this.A07;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.A0G) {
            for (AnonymousClass4P8 r0 : this.A0G) {
                if (r0 != null) {
                    r0.BQk(intent, i, i2);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (!A0Q()) {
            A0O();
        }
        super.onCreate(bundle);
        AnonymousClass15V r2 = this.A0N;
        if (AnonymousClass15V.A02) {
            r2.A00 = (ProgressDialogFragment) r2.A01.getSupportFragmentManager().A0N(AnonymousClass15V.A03);
        }
        this.A05.A01(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return A3f(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return A0R(keyEvent, this, i);
    }

    public void onResume() {
        super.onResume();
        if (!A3d()) {
            return;
        }
        if (this.A05.A06()) {
            Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.authentication.AppAuthenticationActivity");
            className.setFlags(C132986Wc.A0F);
            BuO(className, 202);
            overridePendingTransition(0, 0);
            return;
        }
        this.A05.A02(false);
    }

    public void onStart() {
        super.onStart();
        A3U();
        A3T();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        this.A0D = true;
    }

    public void A3X(KeyEvent keyEvent, int i) {
        A3f(i, keyEvent);
    }

    public void A3Y(KeyEvent keyEvent, int i) {
        A0R(keyEvent, this, i);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void A3c(boolean z) {
        this.A0E = z;
    }

    public AnonymousClass155() {
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A0D = true;
    }

    public void setContentView(View view) {
        super.setContentView(view);
        this.A0D = true;
    }
}
