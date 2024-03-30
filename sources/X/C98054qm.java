package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4qm  reason: invalid class name and case insensitive filesystem */
public class C98054qm extends AnonymousClass88Z implements C161987no {
    public final C23110B5p A00 = ((C23110B5p) this.A00.B9z(C23110B5p.A00));
    public volatile AnonymousClass6NU A01;
    public volatile C23107B5m A02;

    public void A02() {
        AnonymousClass6NU r4 = this.A01;
        if (r4 != null) {
            AnonymousClass6KX.A00(r4.A03, "p");
            r4.A01.post(new AnonymousClass75C((Object) r4, (Object) new C140186lB(r4), 40));
        }
    }

    public void A03() {
        String str;
        Map map;
        HandlerThread handlerThread;
        AnonymousClass6NU r14;
        AnonymousClass94T r0 = C23112B5r.A00;
        B3B b3b = this.A00;
        C23112B5r b5r = (C23112B5r) b3b.B9z(r0);
        AnonymousClass94Q r2 = C197439bi.A01;
        Object BA0 = b3b.BA0(r2);
        if (BA0 != null) {
            String str2 = (String) BA0;
            this.A02 = (C23107B5m) A05(C23107B5m.A00);
            b3b.BA0(C190869Aq.A00);
            Context context = b3b.getContext();
            C23110B5p b5p = this.A00;
            switch (str2.hashCode()) {
                case -2109762974:
                    str = "ar_ads_camera";
                    break;
                case -1872202802:
                    str = "messenger_camera_composer";
                    break;
                case -1860080918:
                    str = "inspiration";
                    break;
                case -1344425781:
                    str = "inspiration_camera_shortcut";
                    break;
                case -1180487979:
                    str = "inspiration_composer";
                    break;
                case -875891333:
                    str = "inspiration_other";
                    break;
                case -873570300:
                    str = "inspiration_reels";
                    break;
                case -817936692:
                    str = "instagram_reels";
                    break;
                case -725934347:
                    str = "inspiration_composer_comment";
                    break;
                case -656087042:
                    str = "inspiration_stories";
                    break;
                case 3628448:
                    str = "vros";
                    break;
                case 17032470:
                    str = "instagram_direct";
                    break;
                case 165128166:
                    str = "messenger_camera_chathead";
                    break;
                case 267394712:
                    str = "messenger_camera_inbox";
                    break;
                case 287240773:
                    str = "msqrd_player_app";
                    break;
                case 628042777:
                    str = "messenger_kids";
                    break;
                case 1268202694:
                    str = "instagram_stories";
                    break;
                case 2017524177:
                    str = "messenger_camera";
                    break;
                default:
                    r14 = null;
                    break;
            }
            if (str2.equals(str)) {
                AnonymousClass5YO r4 = new AnonymousClass5YO();
                C114685he r3 = new C114685he(r4);
                C130146Jx r1 = C130146Jx.A02;
                if (!"audiopipeline_thread".isEmpty()) {
                    synchronized (r1) {
                        map = r1.A01;
                        Iterator A10 = AnonymousClass000.A10(map);
                        while (true) {
                            if (A10.hasNext()) {
                                if (((Thread) A10.next()).getName().equals("audiopipeline_thread")) {
                                    Object[] A0L = AnonymousClass001.A0L();
                                    A0L[0] = "audiopipeline_thread";
                                    AnonymousClass6YR.A0G("ThreadPool", "Thread name already exists %s", A0L);
                                }
                            }
                        }
                        handlerThread = new HandlerThread("DO_NOT_USE_thread", 0);
                        handlerThread.setName("audiopipeline_thread");
                    }
                    handlerThread.start();
                    if (handlerThread.isAlive()) {
                        synchronized (r1) {
                            map.put(handlerThread, ThreadPoolImpl$LifeStatus.AVAILABLE);
                        }
                        String name = handlerThread.getName();
                        if (AnonymousClass6YR.A01.BMH(4)) {
                            AnonymousClass6YR.A06("ThreadPool", StringFormatUtil.formatStrLocaleSafe("New thread started %s with %s priority", name, 0));
                        }
                        Handler handler = new Handler(handlerThread.getLooper(), (Handler.Callback) null);
                        r1.A00.put(handler, handlerThread);
                        synchronized (r1) {
                            map.put(handlerThread, ThreadPoolImpl$LifeStatus.TAKEN);
                        }
                        AnonymousClass6YR.A03(Integer.valueOf(map.size()), "ThreadPool", "Number of threads in pool: %d");
                        C114685he r17 = r3;
                        Handler handler2 = handler;
                        r14 = new AnonymousClass6NU(context, handler2, r17, new AnonymousClass6KX(), b5r, b5p, r4);
                        this.A01 = r14;
                        return;
                    }
                    throw C90514aH.A0s("Thread start was unsuccessful");
                }
                throw C90514aH.A0s("Thread name cannot be empty");
            }
            r14 = null;
            this.A01 = r14;
            return;
        }
        throw C90464aC.A0P(r2, "Configuration is not available: ", AnonymousClass000.A0u());
    }

    public void A04() {
        AnonymousClass6NU r5 = this.A01;
        if (r5 != null) {
            AnonymousClass6KX r4 = r5.A03;
            AnonymousClass6KX.A00(r4, "p");
            C140186lB r3 = new C140186lB(r5);
            Handler handler = r5.A01;
            handler.post(new AnonymousClass75C((Object) r5, (Object) r3, 40));
            AnonymousClass6KX.A00(r4, "d");
            AnonymousClass759.A00(handler, r5, 38);
        }
        this.A02 = null;
        this.A01 = null;
    }

    public C98054qm(B3B b3b) {
        super(b3b);
    }

    public C1691688a BDJ() {
        return C161987no.A00;
    }
}
