package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9pp  reason: invalid class name and case insensitive filesystem */
public final class C204329pp implements Handler.Callback {
    public C191189Bz A00;
    public final Handler A01;
    public final Looper A02;
    public final HashMap A03;
    public final HashMap A04;

    public void A00(C22874AxV axV) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeMessages(1, axV);
            HashMap hashMap = this.A03;
            if (C36371kC.A1X(hashMap.get(axV), true)) {
                hashMap.put(axV, false);
                AnonymousClass000.A14(handler, axV, 2);
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, axV), 5000);
        }
    }

    public boolean handleMessage(Message message) {
        Number A10;
        Message message2 = message;
        AnonymousClass00C.A0D(message2, 0);
        int i = message2.what;
        if (i == 1) {
            HashMap hashMap = this.A04;
            Object obj = message2.obj;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            C36421kH.A1K(obj, hashMap, System.currentTimeMillis());
            HashMap hashMap2 = this.A03;
            Object obj2 = message2.obj;
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap2.put(obj2, true);
            C191189Bz r2 = this.A00;
            if (r2 != null) {
                Object obj3 = message2.obj;
                AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                C22874AxV axV = (C22874AxV) obj3;
                C1690483a r22 = r2.A00;
                C23112B5r b5r = r22.A02;
                if (b5r != null) {
                    b5r.BOu("media_pipeline_render_stuck", axV.BBR(), (Map) null, (long) axV.hashCode());
                }
                r22.A01.A00(C188278zK.A0S);
            }
        } else if (i == 2) {
            HashMap hashMap3 = this.A04;
            Object obj4 = message2.obj;
            AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            Number A102 = C36441kJ.A10(obj4, hashMap3);
            if (A102 != null) {
                long currentTimeMillis = (System.currentTimeMillis() - A102.longValue()) + 5000;
                C191189Bz r1 = this.A00;
                if (r1 != null) {
                    Object obj5 = message2.obj;
                    AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                    C22874AxV axV2 = (C22874AxV) obj5;
                    C23112B5r b5r2 = r1.A00.A02;
                    if (b5r2 != null) {
                        HashMap A0J = AnonymousClass001.A0J();
                        A0J.put("render_stuck_time", String.valueOf(currentTimeMillis));
                        b5r2.BOu("media_pipeline_render_stuck_time", axV2.BBR(), A0J, (long) axV2.hashCode());
                        return true;
                    }
                }
            }
        } else if (i == 3) {
            HashMap hashMap4 = this.A04;
            Iterator A0s = C90484aE.A0s(hashMap4);
            while (A0s.hasNext()) {
                C22874AxV axV3 = (C22874AxV) A0s.next();
                if (C36371kC.A1X(this.A03.get(axV3), true) && (A10 = C36441kJ.A10(axV3, hashMap4)) != null) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - A10.longValue()) + 5000;
                    C191189Bz r12 = this.A00;
                    if (r12 != null) {
                        AnonymousClass00C.A0B(axV3);
                        C23112B5r b5r3 = r12.A00.A02;
                        if (b5r3 != null) {
                            HashMap A0J2 = AnonymousClass001.A0J();
                            A0J2.put("render_stuck_time", String.valueOf(currentTimeMillis2));
                            b5r3.BOu("media_pipeline_render_stuck_forever", axV3.BBR(), A0J2, (long) axV3.hashCode());
                        }
                    }
                }
            }
            hashMap4.clear();
            this.A03.clear();
            return true;
        }
        return true;
    }

    public C204329pp(Looper looper) {
        Handler handler;
        this.A02 = looper;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A04 = AnonymousClass001.A0J();
        this.A03 = AnonymousClass001.A0J();
    }
}
