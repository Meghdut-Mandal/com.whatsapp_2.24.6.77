package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.228  reason: invalid class name */
public class AnonymousClass228 extends C36541kT {
    public int A00 = 0;
    public ProgressBar A01;
    public TextView A02;
    public GoogleDriveRestoreAnimationView A03;
    public final AnonymousClass1Q9 A04;
    public final AnonymousClass12P A05;
    public final C29501Ww A06;
    public final /* synthetic */ RegisterName A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass228(Activity activity, C21060yb r9, C19970wo r10, C18820ts r11, AnonymousClass1Q9 r12, AnonymousClass12P r13, RegisterName registerName, C29501Ww r15) {
        super(activity, r9, r10, r11, R.layout.f9nameremoved);
        this.A07 = registerName;
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r15;
    }

    public void A00(int i) {
        this.A00 = i;
        if (i == 1) {
            if (this.A03 == null) {
                this.A03 = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
            }
            findViewById(R.id.restore_actions_view).setVisibility(8);
            findViewById(R.id.restore_animation_view).setVisibility(0);
            this.A01 = (ProgressBar) findViewById(R.id.progress);
            this.A02 = (TextView) findViewById(R.id.progress_info);
            this.A01.setVisibility(0);
            this.A01.setIndeterminate(true);
            AnonymousClass00F.A00(getContext(), C224314h.A01(getContext(), R.attr.f4nameremoved));
            this.A02.setVisibility(0);
            this.A03.A01();
        } else if (i == 2) {
            GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A03;
            if (googleDriveRestoreAnimationView == null) {
                googleDriveRestoreAnimationView = (GoogleDriveRestoreAnimationView) findViewById(R.id.restore_animation_view);
                this.A03 = googleDriveRestoreAnimationView;
            }
            googleDriveRestoreAnimationView.A03(false);
            findViewById(R.id.restore_actions_view).setVisibility(8);
            ProgressBar progressBar = this.A01;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(R.id.msgrestore_result_box);
            textView2.setVisibility(0);
            C18820ts r7 = this.A02;
            AnonymousClass12P r2 = this.A05;
            long A032 = (long) r2.A03();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, r2.A03(), 0);
            String A0L = r7.A0L(objArr, R.plurals.f10nameremoved, A032);
            C36321k7.A1Q("RestoreFromBackupDialog/after-msgstore-verified/ ", A0L, AnonymousClass000.A0u());
            textView2.setText(A0L);
            findViewById(R.id.next_btn).setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass1RC.A02(C224314h.A01(getContext(), R.attr.f4nameremoved), this);
        AnonymousClass3Y6.A00(findViewById(R.id.perform_restore), this, 29);
        AnonymousClass3Y6.A00(findViewById(R.id.dont_restore), this, 30);
        AnonymousClass3Y6.A00(findViewById(R.id.next_btn), this, 31);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A00(i);
        Window window = getWindow();
        C18740tg.A06(window);
        window.setSoftInputMode(3);
        setTitle(R.string.f12nameremoved);
        String A0B = AnonymousClass3UY.A0B(this.A02, this.A04.A0E());
        Activity activity = this.A00;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = A0B;
        C36341k9.A0s(activity, (TextView) findViewById(R.id.restore_info), A0L, R.string.f12nameremoved);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A09();
        Activity activity = this.A00;
        activity.startActivity(AnonymousClass190.A02(activity));
        return true;
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
