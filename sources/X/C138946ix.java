package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.6ix  reason: invalid class name and case insensitive filesystem */
public final class C138946ix implements C158977iY {
    public final C97124oV A00;
    public final AnonymousClass6Q8 A01;
    public final AnonymousClass6P9 A02;

    public ArrayList BIC(String str) {
        String str2;
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A002.B1q(1, str);
        AnonymousClass6Q8 r0 = this.A01;
        r0.A05();
        Cursor A003 = C109365Xh.A00(r0, A002, false);
        try {
            ArrayList A0n = C90474aD.A0n(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(0);
                }
                A0n.add(str2);
            }
            return A0n;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public C138946ix(AnonymousClass6Q8 r3) {
        this.A01 = r3;
        this.A00 = new C162537ok(r3, this, 6);
        this.A02 = new C162547ol(r3, this, 16);
    }

    public void BKl(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C118465nw r2 = new C118465nw(AnonymousClass001.A0C(it), str);
            AnonymousClass6Q8 r1 = this.A01;
            r1.A05();
            r1.A06();
            try {
                this.A00.A04(r2);
                r1.A07();
            } finally {
                AnonymousClass6Q8.A01(r1);
            }
        }
    }
}
