package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.7VC  reason: invalid class name */
public final class AnonymousClass7VC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass01I $activity;
    public final /* synthetic */ AnonymousClass00S $callback;
    public final /* synthetic */ int $noticeId;
    public final /* synthetic */ C130236Kg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VC(AnonymousClass01I r2, C130236Kg r3, AnonymousClass00S r4, int i) {
        super(1);
        this.$callback = r4;
        this.this$0 = r3;
        this.$activity = r2;
        this.$noticeId = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00S r5;
        AnonymousClass01I r4;
        Integer num;
        C153347Nz r1;
        C108125Sg r0;
        WeakReference A0F;
        C225314u r12;
        C108125Sg r8 = (C108125Sg) obj;
        AnonymousClass00C.A0D(r8, 0);
        int ordinal = r8.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    C130236Kg r6 = this.this$0;
                    r4 = this.$activity;
                    int i = this.$noticeId;
                    r5 = this.$callback;
                    try {
                        if (r6.A01.A06(i)) {
                            r0 = C108125Sg.TRUE;
                        } else {
                            r0 = C108125Sg.FALSE;
                        }
                    } catch (IllegalArgumentException unused) {
                        Log.i("GenAiPrivacyLauncher/isAccepted, Error getting disclosure state");
                        r0 = C108125Sg.ERROR;
                    }
                    int ordinal2 = r0.ordinal();
                    if (ordinal2 == 0) {
                        r5.invoke();
                    } else if (ordinal2 == 1) {
                        WeakReference A0F2 = AnonymousClass001.A0F(r4);
                        num = Integer.valueOf(i);
                        r1 = new C153347Nz(r6, A0F2);
                    } else if (ordinal2 != 2) {
                        A0F = AnonymousClass001.A0F(r4);
                    } else {
                        Log.i("GenAiPrivacyLauncher/handleDownload invalid state");
                    }
                } else if (ordinal == 3) {
                    A0F = AnonymousClass001.A0F(this.$activity);
                }
                Object obj2 = A0F.get();
                if ((obj2 instanceof C225314u) && (r12 = (C225314u) obj2) != null) {
                    r12.BO5(R.string.f12nameremoved);
                }
            } else {
                C130236Kg r2 = this.this$0;
                r4 = this.$activity;
                int i2 = this.$noticeId;
                r5 = this.$callback;
                WeakReference A0F3 = AnonymousClass001.A0F(r4);
                num = Integer.valueOf(i2);
                r1 = new C153347Nz(r2, A0F3);
            }
            C24771Ds.A00(r4, AnonymousClass3NX.A05, new C147506xK(r5, r1), num, (String) null);
        } else {
            this.$callback.invoke();
        }
        return AnonymousClass0AJ.A00;
    }
}
