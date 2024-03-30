package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.5OV  reason: invalid class name */
public abstract class AnonymousClass5OV extends AnonymousClass5OX implements AnonymousClass7dM {
    public AnonymousClass6EW A00;
    public C131376Ou A01;
    public AnonymousClass71P A02;
    public String A03;
    public String A04;
    public boolean A05 = true;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        C131376Ou r2 = this.A01;
        if (r2 != null) {
            Intent intent = getIntent();
            AnonymousClass00C.A0B(intent);
            String stringExtra = intent.getStringExtra("fds_observer_id");
            AnonymousClass00C.A0B(stringExtra);
            AnonymousClass6EW A022 = r2.A02(stringExtra);
            this.A00 = A022;
            AnonymousClass6EW.A00(A022, C149116zx.class, this, 24);
            AnonymousClass6EW r22 = this.A00;
            if (r22 != null) {
                AnonymousClass6EW.A00(r22, C149126zy.class, this, 25);
            }
            AnonymousClass6EW r23 = this.A00;
            if (r23 != null) {
                AnonymousClass6EW.A00(r23, AnonymousClass701.class, this, 26);
            }
            Intent intent2 = getIntent();
            AnonymousClass00C.A0B(intent2);
            String stringExtra2 = intent2.getStringExtra("fds_state_name");
            AnonymousClass00C.A0B(stringExtra2);
            this.A04 = stringExtra2;
            return;
        }
        throw C36331k8.A0d("uiObserversFactory");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass6EW r0 = this.A00;
        if (r0 != null) {
            r0.A04(this);
        }
        this.A00 = null;
    }
}
