package X;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Ww  reason: invalid class name and case insensitive filesystem */
public final class C07240Ww {
    public String A00;
    public Set A01 = new HashSet();
    public Account A02;
    public String A03;
    public String A04;
    public Map A05 = AnonymousClass001.A0J();
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public GoogleSignInOptions A00() {
        Set set = this.A01;
        if (set.contains(GoogleSignInOptions.A0H)) {
            Scope scope = GoogleSignInOptions.A0G;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        boolean z = this.A08;
        if (z && (this.A02 == null || !set.isEmpty())) {
            set.add(GoogleSignInOptions.A0F);
        }
        ArrayList arrayList = new ArrayList(set);
        Account account = this.A02;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        return new GoogleSignInOptions(account, this.A03, this.A04, this.A00, arrayList, this.A05, 3, z, z2, z3);
    }

    public C07240Ww(GoogleSignInOptions googleSignInOptions) {
        AnonymousClass006.A01(googleSignInOptions);
        Parcelable.Creator creator = GoogleSignInOptions.CREATOR;
        this.A01 = new HashSet(googleSignInOptions.A08);
        this.A06 = googleSignInOptions.A09;
        this.A07 = googleSignInOptions.A0A;
        this.A08 = googleSignInOptions.A05;
        this.A03 = googleSignInOptions.A01;
        this.A02 = googleSignInOptions.A00;
        this.A04 = googleSignInOptions.A02;
        ArrayList arrayList = googleSignInOptions.A04;
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0K8 r1 = (AnonymousClass0K8) it.next();
            A0J.put(Integer.valueOf(r1.A00), r1);
        }
        this.A05 = A0J;
        this.A00 = googleSignInOptions.A03;
    }

    public C07240Ww() {
    }
}
