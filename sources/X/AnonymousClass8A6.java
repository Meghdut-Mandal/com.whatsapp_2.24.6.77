package X;

import android.os.Message;
import com.facebook.wearable.mediastream.client.state.DeviceStreamingStatus$isStreamingBlocked$job$1;
import com.facebook.wearable.mediastream.client.state.DiscoveredStateDelegate$startConnectionTimer$1;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8A6  reason: invalid class name */
public final class AnonymousClass8A6 extends AnonymousClass84C {
    public final AnonymousClass84B A00;

    public /* bridge */ /* synthetic */ boolean A09(Message message, Object obj) {
        C200159gk r9;
        String str;
        String A0z;
        C20958A0r a0r = (C20958A0r) obj;
        C36331k8.A1I(a0r, message);
        boolean z = false;
        if (a0r instanceof AnonymousClass8AR) {
            r9 = AnonymousClass9AO.A01;
            str = "sup:DiscoveredStateDelegate";
            r9.A01(str, "[DISCOVERED]: DeviceStatusConnected msg received");
            AtomicBoolean atomicBoolean = this.A00.A01.A0D;
            if (atomicBoolean.get()) {
                atomicBoolean.set(false);
            }
            return true;
        } else if (a0r instanceof AnonymousClass8AQ) {
            r9 = AnonymousClass9AO.A01;
            str = "sup:DiscoveredStateDelegate";
            r9.A01(str, "[DISCOVERED]: Received Connect");
        } else if ((a0r instanceof AnonymousClass8AJ) || (a0r instanceof AnonymousClass8AV)) {
            C166097v1 r0 = this.A00.A00;
            Message obtainMessage = r0.obtainMessage();
            obtainMessage.copyFrom(message);
            r0.A08.add(obtainMessage);
            return true;
        } else if (a0r instanceof AnonymousClass8AL) {
            if (!AnonymousClass00C.A0J(((AnonymousClass8AL) a0r).A00, this.A00.A06())) {
                return false;
            }
            AnonymousClass9AO.A01.A01("sup:DiscoveredStateDelegate", "Already on Discovered state. Ignoring");
            return true;
        } else if ((a0r instanceof AnonymousClass8AW) || (a0r instanceof AnonymousClass8AS) || (a0r instanceof AnonymousClass8AK) || (a0r instanceof AnonymousClass8AM)) {
            return false;
        } else {
            AnonymousClass9AO.A01.A07("sup:DiscoveredStateDelegate", AnonymousClass000.A0l(a0r, "[DISCOVERED]: Received invalid msg ", AnonymousClass000.A0u()), C165617ti.A0V());
            this.A00.A07(new C1695289r("INVALID_STATE_MESSAGE"));
            return false;
        }
        r9.A01(str, "[DISCOVERED]: handleStartConnection()");
        AnonymousClass84B r4 = this.A00;
        AnonymousClass9Y3 r3 = r4.A01;
        if (r3.A0D.get()) {
            r9.A01(str, "[DISCOVERED]: Awaiting device pairing. Returning early.");
        } else {
            C115045iF r10 = r3.A06;
            AnonymousClass05L r1 = r10.A00;
            if (C36371kC.A1X(r1.getValue(), false)) {
                A0z = "isStreamingBlocked returning false";
            } else {
                C10810fG r7 = new C10810fG();
                r7.element = r1.getValue();
                AnonymousClass0A6 A12 = C36391kE.A12(new DeviceStreamingStatus$isStreamingBlocked$job$1(r10, (C023509x) null, r7), C009403z.A02(C006702x.A00));
                while (A12.BL7() && !A12.isCancelled() && !A12.BLQ()) {
                    Thread.sleep(100);
                }
                Boolean bool = (Boolean) r7.element;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                A0z = C36371kC.A0z("isStreamingBlocked returning ", AnonymousClass000.A0u(), z);
            }
            r9.A01("sup:DeviceStreamingStatus", A0z);
            if (z) {
                r9.A01(str, "[DISCOVERED]: Media Stream Service is currently in use.  Send connection error");
                A0B(new C22047Afu(this));
            } else {
                String[] A002 = AnonymousClass9AL.A01.A00();
                int length = A002.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (r3.A00.checkSelfPermission(A002[i]) == -1) {
                            r9.A01(str, "[DISCOVERED]: BT permissions not granted!");
                            r4.A0N.invoke(new C1695289r("BT_PERMISSIONS_NOT_GRANTED"), (Object) null);
                            break;
                        }
                        i++;
                    } else {
                        r4.A0L.invoke(AnonymousClass89S.A00);
                        if (r4.A0J.intValue() == 2) {
                            r4.A00.A03 = AnonymousClass9QJ.A00(r4.A0C, r4, AnonymousClass84B.A0S, 9);
                        } else {
                            r4.A00.A03 = AnonymousClass9QJ.A00(r4.A08, r4, AnonymousClass84B.A0S, 2);
                            r3.A0H = C36391kE.A12(new DiscoveredStateDelegate$startConnectionTimer$1(this, (C023509x) null), C009403z.A02(C006702x.A00));
                        }
                    }
                }
            }
        }
        return true;
    }

    public AnonymousClass8A6(AnonymousClass84B r1) {
        super(r1);
        this.A00 = r1;
    }
}
