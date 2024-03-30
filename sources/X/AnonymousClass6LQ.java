package X;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6LQ  reason: invalid class name */
public class AnonymousClass6LQ {
    public static final AtomicInteger A06 = new AtomicInteger();
    public final AnonymousClass5TE A00;
    public final String A01;
    public final List A02 = AnonymousClass001.A0I();
    public final List A03;
    public final List A04 = AnonymousClass001.A0I();
    public final List A05 = AnonymousClass001.A0I();

    public AnonymousClass6LQ(AnonymousClass5TE r3) {
        String str = "";
        this.A00 = r3;
        this.A01 = TextUtils.isEmpty(str) ? Integer.toString(A06.getAndIncrement()) : str;
        this.A03 = AnonymousClass001.A0I();
    }
}
