package X;

import com.google.protobuf.UnsafeUtil;
import java.util.List;

/* renamed from: X.9ff  reason: invalid class name and case insensitive filesystem */
public abstract class C199639ff {
    public static final C199639ff A00 = new C173538Sb();
    public static final C199639ff A01 = new C173528Sa();

    public List A01(Object obj, long j) {
        if (!(this instanceof C173528Sa)) {
            return C173538Sb.A00(obj, j, 10);
        }
        C23122B6c b6c = (C23122B6c) AnonymousClass9Yj.A00(obj, j);
        if (((C21886AcE) b6c).A00) {
            return b6c;
        }
        int size = b6c.size();
        int i = size * 2;
        if (size == 0) {
            i = 10;
        }
        C23122B6c BQ1 = b6c.BQ1(i);
        UnsafeUtil.A07(obj, j, BQ1);
        return BQ1;
    }
}
