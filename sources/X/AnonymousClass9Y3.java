package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Y3  reason: invalid class name */
public final class AnonymousClass9Y3 {
    public Context A00;
    public Connection A01 = null;
    public LocalChannel A02 = null;
    public LocalChannel A03 = null;
    public B2N A04 = null;
    public AnonymousClass9SV A05 = null;
    public C115045iF A06;
    public AnonymousClass88I A07 = null;
    public C203689oX A08 = null;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public List A0B = null;
    public CompletableFuture A0C = null;
    public AtomicBoolean A0D;
    public AtomicInteger A0E;
    public AnonymousClass00S A0F = null;
    public AnonymousClass00S A0G;
    public C007403e A0H;
    public C007403e A0I;
    public final Map A0J;

    public /* synthetic */ AnonymousClass9Y3(Context context) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        HashMap A0J2 = AnonymousClass001.A0J();
        C22265AjS ajS = C22265AjS.A00;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(88064);
        AnonymousClass00C.A08(allocateDirect);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        AnonymousClass00C.A08(allocateDirect2);
        AtomicBoolean A1H = C36431kI.A1H();
        C115045iF r0 = new C115045iF();
        this.A00 = context;
        this.A0E = atomicInteger;
        this.A0J = A0J2;
        this.A0G = ajS;
        this.A0A = allocateDirect;
        this.A09 = allocateDirect2;
        this.A0H = null;
        this.A0I = null;
        this.A0D = A1H;
        this.A06 = r0;
    }

    public final void A02() {
        this.A0E = new AtomicInteger(1);
        this.A0J.clear();
        LocalChannel localChannel = this.A02;
        if (localChannel != null) {
            AnonymousClass95J.A00(localChannel);
        }
        C203689oX r0 = this.A08;
        if (r0 != null) {
            r0.A0C();
        }
        LocalChannel localChannel2 = this.A03;
        if (localChannel2 != null) {
            AnonymousClass95J.A00(localChannel2);
        }
        Connection connection = this.A01;
        if (connection != null) {
            AnonymousClass95J.A00(connection);
        }
        AnonymousClass9SV r02 = this.A05;
        if (r02 != null) {
            r02.A00();
        }
        this.A08 = null;
        this.A07 = null;
        this.A02 = null;
        this.A0C = null;
        this.A04 = null;
        this.A0F = null;
        this.A0G = C22266AjT.A00;
        this.A0A.clear();
        this.A09.clear();
        this.A0H = null;
        this.A0I = null;
        this.A0D.set(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 <= 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0E
            int r2 = r0.get()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L_0x000f
            int r1 = r2 + 1
            if (r2 > 0) goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0E
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x0000
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Y3.A00():int");
    }

    public final CompletableFuture A01() {
        return this.A0C;
    }

    public final void A03(CompletableFuture completableFuture) {
        this.A0C = completableFuture;
    }
}
