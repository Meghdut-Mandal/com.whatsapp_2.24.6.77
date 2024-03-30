package X;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ux  reason: invalid class name and case insensitive filesystem */
public class C166057ux extends Handler {
    public final /* synthetic */ C209059zO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166057ux(Looper looper, C209059zO r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        List<C209059zO> list;
        int i = message.what;
        if (i == 0) {
            C209059zO r2 = this.A00;
            Object obj = message.obj;
            int i2 = r2.A01;
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                if (obj instanceof Exception) {
                    Exception exc = (Exception) obj;
                    list = r2.A0B.A03;
                    for (C209059zO A02 : list) {
                        C209059zO.A02(A02, exc, 3);
                    }
                } else {
                    try {
                        r2.A0C.A09((byte[]) obj);
                        list = r2.A0B.A03;
                        for (C209059zO r1 : list) {
                            if (C209059zO.A04(r1, false)) {
                                C209059zO.A03(r1, true);
                            }
                        }
                    } catch (Exception e) {
                        list = r2.A0B.A03;
                        for (C209059zO A022 : list) {
                            C209059zO.A02(A022, e, 1);
                        }
                    }
                }
                list.clear();
            }
        } else if (i == 1) {
            C209059zO r22 = this.A00;
            Object obj2 = message.obj;
            int i3 = r22.A01;
            if (i3 == 3 || i3 == 4) {
                if (obj2 instanceof Exception) {
                    Exception exc2 = (Exception) obj2;
                    if (!(exc2 instanceof NotProvisionedException)) {
                        C209059zO.A02(r22, exc2, 1);
                        return;
                    }
                } else {
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (AnonymousClass9B7.A00.equals(r22.A0D)) {
                            bArr = AnonymousClass5Y8.A00(bArr);
                        }
                        byte[] A0C = r22.A0C.A0C(r22.A07, bArr);
                        if (!(r22.A06 == null || A0C == null || A0C.length == 0)) {
                            r22.A06 = A0C;
                        }
                        r22.A01 = 4;
                        Iterator it = r22.A0A.A00.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AnonymousClass001.A0A("listener");
                        }
                        return;
                    } catch (Exception e2) {
                        if (!(e2 instanceof NotProvisionedException)) {
                            C209059zO.A02(r22, e2, 1);
                            return;
                        }
                    }
                }
                r22.A0B.A02(r22);
            }
        }
    }
}
