package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1jW  reason: invalid class name and case insensitive filesystem */
public class C35951jW extends Handler {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35951jW(Looper looper, AnonymousClass1NE r3, C19970wo r4) {
        super(looper);
        this.A00 = r3;
        this.A01 = r4;
    }

    public void A00(AnonymousClass11F r4, boolean z) {
        if (!hasMessages(0, r4) && !hasMessages(3, r4)) {
            if (!hasMessages(2, r4)) {
                AnonymousClass1XR r1 = (AnonymousClass1XR) this.A01;
                if (r1.A01.A06 && (z || hasMessages(5, r4))) {
                    AnonymousClass1XR.A00(r1, r4);
                }
            }
            removeMessages(4, r4);
            removeMessages(5, r4);
        }
    }

    public void handleMessage(Message message) {
        Message message2;
        long j;
        AnonymousClass1XR r2;
        if (this.A02 != 0) {
            boolean z = true;
            if (message.what == 1) {
                AnonymousClass1NE r5 = (AnonymousClass1NE) this.A00;
                AnonymousClass6NW r4 = r5.A0Z;
                StringBuilder sb = new StringBuilder();
                sb.append("app/startOutgoingCall/WHAT_START_PENDING_INTENT ");
                sb.append(r4);
                Log.i(sb.toString());
                if (r4 != null) {
                    long j2 = r5.A00;
                    if (j2 > 0) {
                        r4.A01 = SystemClock.elapsedRealtime() - j2;
                    }
                    Boolean bool = (Boolean) message.obj;
                    if (bool == null) {
                        z = false;
                    }
                    C18740tg.A0D(z, "isRejoin is null");
                    if (bool == null || !bool.booleanValue()) {
                        r5.A0N.Boy(new C35651j2(r5, r4, 10));
                    } else {
                        AnonymousClass1NE.A07(r5, r4);
                    }
                    r5.A0Z = null;
                    return;
                }
                return;
            }
            return;
        }
        int i = message.what;
        if (i == 0) {
            AnonymousClass11F r8 = (AnonymousClass11F) message.obj;
            int i2 = message.arg2;
            if (!hasMessages(1, r8) && !hasMessages(4, r8)) {
                removeMessages(0, r8);
                if (hasMessages(2, r8) || hasMessages(5, r8)) {
                    AbstractMap abstractMap = (AbstractMap) this.A00;
                    Number number = (Number) abstractMap.get(r8);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (number != null && currentTimeMillis - number.longValue() > 10000) {
                        r2 = (AnonymousClass1XR) this.A01;
                        if (r2.A01.A06) {
                            AnonymousClass1XR.A01(r2, r8, i2);
                            abstractMap.put(r8, Long.valueOf(currentTimeMillis));
                        }
                    }
                    removeMessages(2, r8);
                    message2 = obtainMessage(2, 0, 0, r8);
                    j = 2500;
                } else {
                    r2 = (AnonymousClass1XR) this.A01;
                    if (r2.A01.A06) {
                        AnonymousClass1XR.A01(r2, r8, i2);
                        ((AbstractMap) this.A00).put(r8, Long.valueOf(System.currentTimeMillis()));
                    }
                    removeMessages(2, r8);
                    message2 = obtainMessage(2, 0, 0, r8);
                    j = 2500;
                }
                r2.A03.A00(r8);
                C20510xg r42 = r2.A02;
                Parcelable.Creator creator = AnonymousClass147.CREATOR;
                AnonymousClass147 A03 = C65533Sl.A03(r8);
                if (A03 != null) {
                    Map map = r42.A0E;
                    if (!map.containsKey(A03) || C19970wo.A00(r42.A01) - ((Number) map.get(A03)).longValue() > 43200000) {
                        if (C20800yB.A01(C21000yV.A02, r42.A03, 3644)) {
                            r42.A07.Boz(new C35721j9(r42, A03, 26), "GroupXmppMethods/sendGetGroupWhenComposing");
                        }
                    }
                }
                removeMessages(2, r8);
                message2 = obtainMessage(2, 0, 0, r8);
                j = 2500;
            } else {
                return;
            }
        } else if (i == 1 || i == 2) {
            AnonymousClass11F r22 = (AnonymousClass11F) message.obj;
            if (!hasMessages(0, r22) && !hasMessages(3, r22)) {
                if (!hasMessages(5, r22)) {
                    AnonymousClass1XR r1 = (AnonymousClass1XR) this.A01;
                    if (r1.A01.A06) {
                        AnonymousClass1XR.A00(r1, r22);
                    }
                }
                removeMessages(1, r22);
                removeMessages(2, r22);
                return;
            }
            return;
        } else if (i == 3) {
            AnonymousClass11F r3 = (AnonymousClass11F) message.obj;
            int i3 = message.arg2;
            if (!hasMessages(1, r3) && !hasMessages(4, r3)) {
                if (!hasMessages(2, r3)) {
                    AnonymousClass1XR r12 = (AnonymousClass1XR) this.A01;
                    if (r12.A01.A06) {
                        AnonymousClass1XR.A01(r12, r3, i3);
                    }
                }
                message2 = obtainMessage(5, 0, 0, r3);
                j = AnonymousClass6X5.A0L;
            } else {
                return;
            }
        } else if (i == 4) {
            A00((AnonymousClass11F) message.obj, false);
            return;
        } else if (i == 5) {
            A00((AnonymousClass11F) message.obj, true);
            return;
        } else {
            return;
        }
        sendMessageDelayed(message2, j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35951jW(Looper looper, AnonymousClass1XR r3) {
        super(looper);
        this.A01 = r3;
        this.A00 = new HashMap();
    }
}
