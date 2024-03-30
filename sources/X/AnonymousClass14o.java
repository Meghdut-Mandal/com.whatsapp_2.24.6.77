package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.14o  reason: invalid class name */
public abstract class AnonymousClass14o extends C224814n {
    public static final int A02 = -1;
    public AnonymousClass174 A00;
    public ViewTreeObserver.OnDrawListener A01;

    public int A2I() {
        return -1;
    }

    /* renamed from: A2L */
    public void A2M() {
    }

    private void A0O(View view, AnonymousClass17Y r4) {
        r4.A02.post(new C35621iz(this, view, 32));
    }

    public C45682Sh A2J() {
        return this.A00.A01.A01;
    }

    public void A2O(View view, AnonymousClass17Y r4) {
        AnonymousClass174 r0 = this.A00;
        if (r0.A01.A06.BMN(A2I())) {
            this.A01 = new AnonymousClass3ZG(view, r4, this);
            view.getViewTreeObserver().addOnDrawListener(this.A01);
        }
    }

    /* renamed from: A2P */
    public void A2Q(View view, AnonymousClass17Y r3) {
        A2S("onRendered");
        BPG(2);
        A0O(view, r3);
    }

    public void A2S(String str) {
        this.A00.A01.A06(str);
    }

    public void A2T(String str) {
        this.A00.A01.A07(str);
    }

    public final void A2U(String str, boolean z, boolean z2) {
        this.A00.A01.A0B(str, z, z2);
    }

    public void A2V(short s) {
        A2S("onRendered");
        BPG(s);
    }

    public void BPG(short s) {
        this.A00.A01.A0C(s);
    }

    public void BPK(String str) {
        this.A00.A01.A08(str);
    }

    public void BS7() {
        this.A00.A01.A07("data_load");
    }

    public void BV5() {
        this.A00.A01.A06("data_load");
    }

    public void Beg() {
        this.A00.A01.A0C(230);
    }

    public void attachBaseContext(Context context) {
        String simpleName = getClass().getSimpleName();
        this.A00 = new AnonymousClass174((AnonymousClass173) ((AnonymousClass170) ((C18800tq) C18810tr.A00(context, C18800tq.class)).AfI.A00.A2J.get()).A00.A00.A4F.get(), A2K(), simpleName);
        super.attachBaseContext(context);
    }

    public C605338f getFirstDrawMonitor() {
        return this.A00.A00;
    }

    private View A0N() {
        if (A2K().A02) {
            return getWindow().getDecorView();
        }
        return null;
    }

    public C21710zg A2K() {
        return new C21710zg(A2I());
    }

    public /* synthetic */ void A2N(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this.A01);
    }

    public AnonymousClass174 getInteractionPerfTracker() {
        return this.A00;
    }

    public void onCreate(Bundle bundle) {
        if (!getIntent().getBooleanExtra("key_perf_tracked", false)) {
            AnonymousClass174 r0 = this.A00;
            int A2I = A2I();
            if (!r0.A01.A06.BMN(A2I) && A2I != 78318969) {
                long longExtra = getIntent().getLongExtra("perf_start_time_ns", -1);
                String stringExtra = getIntent().getStringExtra("perf_origin");
                if (stringExtra == null) {
                    stringExtra = getClass().getSimpleName();
                }
                if (this.A00.A00(A0N(), new C36121jn(this, 1), stringExtra, longExtra)) {
                    getIntent().putExtra("key_perf_tracked", true);
                }
            }
        }
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public AnonymousClass14o(int i) {
        super(i);
    }

    public void A2R(AnonymousClass174 r1) {
        this.A00 = r1;
    }

    public AnonymousClass14o() {
    }
}
