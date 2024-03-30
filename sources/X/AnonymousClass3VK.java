package X;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsChatHistoryFragment;

/* renamed from: X.3VK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VK implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ C88644Tm A03;
    public final /* synthetic */ C33051ed A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass3VK(CheckBox checkBox, CheckBox checkBox2, C88644Tm r3, C33051ed r4, int i, boolean z) {
        this.A04 = r4;
        this.A01 = checkBox;
        this.A03 = r3;
        this.A02 = checkBox2;
        this.A00 = i;
        this.A05 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C33051ed r4 = this.A04;
        CheckBox checkBox = this.A01;
        C88644Tm r1 = this.A03;
        CheckBox checkBox2 = this.A02;
        int i2 = this.A00;
        boolean z = this.A05;
        boolean isChecked = checkBox.isChecked();
        boolean z2 = !checkBox2.isChecked();
        AnonymousClass4Y2 r12 = (AnonymousClass4Y2) r1;
        switch (r12.A01) {
            case 0:
                AnonymousClass28b r13 = (AnonymousClass28b) r12.A00;
                AnonymousClass3SJ.A00(r13.A03, 0);
                r13.A05.Bu2(0, R.string.f12nameremoved);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r13.A0M.Boa();
                C49682jW r6 = r13.A00;
                if (r6 != null) {
                    r6.A01 = null;
                    r6.A00 = null;
                    r6.A0D(true);
                }
                C49682jW r62 = new C49682jW(r13.A08, r13.A0Z, r13.A01, r13.A02, elapsedRealtime, z2, isChecked);
                r13.A00 = r62;
                r13.A0d.Box(r62, new Object[0]);
                break;
            case 1:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) r12.A00;
                C100834vr r14 = settingsChatHistoryFragment.A00;
                if (r14 != null) {
                    AnonymousClass3SJ.A00(r14, 3);
                    C100834vr r5 = settingsChatHistoryFragment.A00;
                    if (r5 != null) {
                        r5.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                        C36331k8.A1F(new C49542jI(settingsChatHistoryFragment.A00, settingsChatHistoryFragment.A03, z2, isChecked), settingsChatHistoryFragment.A0C);
                        break;
                    }
                }
                break;
            default:
                ((C88634Tl) r12.A00).Bcz(isChecked);
                break;
        }
        if (i2 == 2 && z != isChecked) {
            C36331k8.A0w(C19420v0.A00(r4.A01), "pref_media_delete_per_conversation", isChecked);
        }
    }
}
