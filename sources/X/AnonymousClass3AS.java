package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.3AS  reason: invalid class name */
public class AnonymousClass3AS {
    public final Context A00;
    public final RecyclerView A01;
    public final C34361gu A02;
    public final C34381gw A03;
    public final C40051uf A04;
    public final C34421h1 A05;
    public final AnonymousClass1RY A06;
    public final C34471h6 A07;

    public AnonymousClass3AS(Context context, AnonymousClass01L r9, AnonymousClass012 r10, RecyclerView recyclerView, C56992xU r12, C34361gu r13, C34381gw r14, C26421Kc r15, C24361Cd r16, AnonymousClass16I r17, AnonymousClass1RY r18, C24381Cf r19, C233117z r20, AnonymousClass147 r21) {
        this.A02 = r13;
        this.A03 = r14;
        this.A00 = context;
        this.A06 = r18;
        this.A01 = recyclerView;
        AnonymousClass3QV r1 = new AnonymousClass3QV();
        r1.A00 = 10;
        r1.A0D = true;
        r1.A08 = true;
        r1.A0B = true;
        r1.A0C = true;
        r1.A0A = false;
        C40051uf r4 = (C40051uf) AnonymousClass4ZD.A00(r9, r21, r12, r1, 0).A00(C40051uf.class);
        this.A04 = r4;
        C34421h1 A002 = this.A02.A00(this.A06, this.A03.A00(this.A00), 3);
        this.A05 = A002;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1f(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(A002);
        recyclerView.setItemAnimator((C02800By) null);
        recyclerView.A0t(new C96354nC(context, recyclerView, (AnonymousClass7fO) null, A002));
        C34831hi r110 = r4.A0s;
        Objects.requireNonNull(A002);
        C53822rw.A01(r10, r110, A002, 30);
        C34471h6 r0 = new C34471h6(r15, r16, A002, r17, r19, r20);
        this.A07 = r0;
        r0.A00();
    }
}
