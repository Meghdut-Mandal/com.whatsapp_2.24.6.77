package X;

import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;

/* renamed from: X.7qa  reason: invalid class name and case insensitive filesystem */
public class C163677qa implements C34661hR {
    public Object A00;
    public final int A01;

    public void Azj(AnonymousClass11F r7, String str, int i) {
        if (this.A01 == 0) {
            UpcomingActivityViewModel.A01((UpcomingActivityViewModel) this.A00, r7, str, 1, -1);
        }
    }

    public C163677qa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Azi(long j, int i) {
        if (this.A01 == 0) {
            UpcomingActivityViewModel.A01((UpcomingActivityViewModel) this.A00, (AnonymousClass11F) null, (String) null, i, j);
        }
    }

    public void Bfl(AnonymousClass3KV r7) {
        if (this.A01 != 0) {
            C174898Yw r5 = (C174898Yw) this.A00;
            if (r5.A0K.A1N == r7.A02) {
                r5.setupJoinCallViewContent(r7.A03);
            }
        }
    }
}
